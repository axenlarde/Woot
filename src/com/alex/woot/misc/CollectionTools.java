package com.alex.woot.misc;

import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import com.alex.woot.misc.Correction.correctionType;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.ClearFrenchString;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.SubstituteType;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to store static method used to work with the collection and template file
 * 
 * @author RATEL Alexandre
 **********************************/
public class CollectionTools
	{
	/****************************************
	 * Method used to return the pattern
	 * @throws Exception 
	 ****************************************/
	public static String doRegex(String pat, int currentRow, Object obj, boolean emptyException) throws Exception
		{
		/**********
		 * Add here a special regex detection for too long value
		 * pattern "\\(.+\\)IfLongerThan\\d+\\(.+\\)"
		 * 
		 * BETA
		 ****/
		if(Pattern.matches("\\(.+\\)IfLongerThan\\d+\\(.+\\)", pat))
			{
			Variables.getLogger().debug("TooLong value detection required");
			
			//Get the 2 values
			String normal="", tooLong="";
			int maxLength=0;
			
			Pattern first = Pattern.compile("\\(.+\\)If");
			Pattern last = Pattern.compile("\\d+\\(.+\\)");
			Pattern length = Pattern.compile("IfLongerThan\\d+");
			Matcher mFirst = first.matcher(pat);
			Matcher mLast = last.matcher(pat);
			Matcher mLength = length.matcher(pat);
			
			if(mFirst.find())
				{
				normal = mFirst.group();
				normal = normal.replace("(", "").replace(")If", "");
				Variables.getLogger().debug("Normal pattern : \""+normal+"\"");
				}
			if(mLast.find())
				{
				tooLong = mLast.group();
				tooLong = tooLong.replace(")", "").replaceAll("\\d+\\(", "");
				Variables.getLogger().debug("TooLong pattern : \""+tooLong+"\"");
				}
			if(mLength.find())
				{
				String str = mLength.group();
				str = str.replace("IfLongerThan", "");
				maxLength = Integer.parseInt(str);
				Variables.getLogger().debug("Max length : \""+maxLength+"\"");
				}
			
			if((normal == null) || (normal.equals("")) ||
					(tooLong == null) || (tooLong.equals("")) ||
					(maxLength == 0))
				{
				throw new Exception("ERROR : The \"IfLongerThan\" regex returned a bad Result");
				}
			
			/**
			 * Whatever the result, we need to log the real row number according to the used pattern
			 * So we need to find it
			 */
			int realRowNumber = currentRow+1;//Default value;
			
			try
				{
				realRowNumber = findRealRow(normal, currentRow);
				}
			catch (Exception e)
				{
				Variables.getLogger().error("Error : Unable to find the real row number. We will use the default value instead : "+e.getMessage());
				}
			
			/********/
			
			Variables.getLogger().debug("We try the normal pattern");
			normal = dodoRegex(normal, currentRow, emptyException);
			if(normal.length() > maxLength)
				{
				Variables.getLogger().debug("The normal pattern is longer than "+maxLength+" : "+normal+" so we try the backup pattern");
				tooLong = dodoRegex(tooLong, currentRow, emptyException);
				
				if(tooLong.length() > maxLength)
					{
					//The corrected value is still too long so we add it as an error
					try
						{
						ItemToInject iti = (ItemToInject)obj;
						iti.getErrorList().add(new UserError(LanguageManagement.getString("correctionalert")+" : "+normal+" > "+tooLong));
						}
					catch (Exception e)
						{
						Variables.getLogger().debug("The object is not an \"ItemToInject\" so we try with a \"BasicItem\"");
						try
							{
							BasicItem bi = (BasicItem)obj;
							bi.getErrorList().add(new UserError(LanguageManagement.getString("correctionalert")+" : "+normal+" > "+tooLong));
							}
						catch (Exception exc)
							{
							Variables.getLogger().error("ERROR : The object is neither an \"ItemToInject\" nor a \"BasicItem\"", exc);
							}
						}
					
					Variables.getLogger().debug("Row : "+realRowNumber+" : Even after the IfLongerThan regex the value is still longer than "+maxLength+" : "+tooLong);
					return tooLong;
					}
				else
					{
					//A correction was made so we add it in the correction list
					try
						{
						ItemToInject iti = (ItemToInject)obj;
						iti.addNewCorrection(new Correction(normal+" > "+tooLong, "", correctionType.tooLong, false));
						}
					catch (Exception e)
						{
						Variables.getLogger().debug("The object is not an \"ItemToInject\" so we try with a \"BasicItem\"");
						try
							{
							BasicItem bi = (BasicItem)obj;
							bi.addNewCorrection(new Correction(normal+" > "+tooLong, "", correctionType.tooLong, false));
							}
						catch (Exception exc)
							{
							Variables.getLogger().error("ERROR : The object is neither an \"ItemToInject\" nor a \"BasicItem\"", exc);
							}
						}
					
					Variables.getLogger().debug("Row : "+realRowNumber+" : The value was longer than \""+maxLength+"\" so the \"too long pattern\" has been used instead. The result is : "+tooLong);
					return tooLong;
					}
				}
			else
				{
				Variables.getLogger().debug("Full value after regex : "+normal);
				return normal;
				}
			}
		else
			{
			return dodoRegex(pat, currentRow, emptyException);
			}
		}
	
	
	/****************************************
	 * Method used to return the pattern
	 * @throws Exception 
	 ****************************************/
	private static String dodoRegex(String pat, int currentRow, boolean emptyException) throws Exception
		{
		StringBuffer regex = new StringBuffer("");
		
		String[] param = getSplittedValue(pat, UsefulMethod.getTargetOption("splitter"));
		
		for(int i = 0; i<param.length; i++)
			{
			boolean match = false;
			for(String s : Variables.getMatcherList())
				{
				String[] tab = s.split(":");//Example : cucm.firstname:4:4:4+*
				//tab[0]=cucm.firstname, tab[1]=sheet, tab[2]=column and tab[3]=row
				
				if(Pattern.matches(".*"+tab[0]+".*", param[i]))
					{
					if(param[i].contains("*"))
						{
						regex.append(getValueWithRegex(param[i], tab[1], tab[2], tab[3], currentRow, emptyException));
						}
					else
						{
						regex.append(getValue(param[i], tab[1], tab[2], tab[3], currentRow, emptyException));
						}
					match = true;
					break;
					}
				}
			
			/**
			 * Special regex
			 */
			if(Pattern.matches(".*office\\..*", param[i]))
				{
				String[] tab = param[i].split("\\.");
				
				String result = "";
				
				if(Variables.getCurrentOffice() == null)
					{
					//If Current Office is null it means that 
					//String lineOfficeName = getValueFromCollectionFile(currentRow, UsefulMethod.getTargetOption("officenametemplate"), false);
					String lineOfficeName = dodoRegex(UsefulMethod.getTargetOption("officenametemplate"), currentRow, false);
					
					if(!lineOfficeName.equals(""))
						{
						for(Office office : Variables.getOfficeList())
							{
							if(office.getName().equals(lineOfficeName))
								{
								//We found the office in the office list so we get the searched value
								result = office.getString(tab[1]);
								}
							}
						}
					
					if(result.equals(""))
						{
						/************
						 * We didn't find the office so we ask for it and in addition in this case
						 * we have to retain the office choice to avoid asking for it a second time
						 ************/
						Variables.getLogger().debug("The office was not found so we ask for it");
						UsefulMethod.initCurrentOffice();
						result = Variables.getCurrentOffice().getString(tab[1]);
						}
					}
				else
					{
					result = Variables.getCurrentOffice().getString(tab[1]);
					}
				
				regex.append(applyRegex(result, param[i]));
				
				match = true;
				}
			else if(Pattern.matches(".*config\\..*", param[i]))
				{
				String[] tab = param[i].split("\\.");
				String result = UsefulMethod.getTargetOption(tab[1]);
				regex.append(result);
				
				match = true;
				}
			else if(Pattern.matches(".*cucm.availableline", param[i]))
				{
				regex.append(applyRegex(getAvailableInternalNumber(), param[i]));
				match = true;
				}
			
			
			/***********/
			
			//Default
			if(!match)
				{
				regex.append(param[i]);
				}
			}
	
		return regex.toString();
		}
	
	/******************************************
	 * Method used to get a value from the collection file
	 * @throws Exception 
	 ******************************************/
	private static String getValue(String param, String sheet, String column, String row, int currentRow, boolean emptyException) throws Exception,EmptyValueException
		{
		/**
		 * We get the Value from the collection file
		 */
		int sheetNumber, columnNumber, rowNumber;
		sheetNumber = Integer.parseInt(sheet);
		columnNumber = Integer.parseInt(column);
		rowNumber = getRowNumber(row, currentRow);
		
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheetNumber, columnNumber, rowNumber);
		
		if(checkEmptyValue(value))
			{
			if(emptyException)
				{
				throw new EmptyValueException("The requested parameters ("+param+") is empty row : "+(rowNumber+1));
				}
			else
				{
				return "";
				}
			}
		
		Variables.getLogger().debug("Value for "+param+" without regex : "+value);
		return value;
		}
	
	
	/******************************************
	 * Method used to get a value from the collection file
	 * and apply special regex
	 * @throws Exception 
	 ******************************************/
	private static String getValueWithRegex(String param, String sheet, String column, String row, int currentRow, boolean emptyException) throws Exception,EmptyValueException
		{
		/**
		 * First we get the Value from the collection file
		 */
		int sheetNumber, columnNumber, rowNumber;
		sheetNumber = Integer.parseInt(sheet);
		columnNumber = Integer.parseInt(column);
		rowNumber = getRowNumber(row, currentRow);
		
		
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheetNumber, columnNumber, rowNumber);
		
		if(checkEmptyValue(value))
			{
			if(emptyException)
				{
				throw new EmptyValueException("The requested parameters ("+param+") is empty row : "+rowNumber);
				}
			else
				{
				return "";
				}
			}
		/*********************/
		
		/**
		 * Second we apply the regex
		 */
		Variables.getLogger().debug("Value before "+param+" regex : "+value);
		value = applyRegex(value, param);
		Variables.getLogger().debug("Value after applying "+param+" regex : "+value);
		/**********/
		
		return value;
		}
	
	/******************************************
	 * Method used to get a value from the collection file
	 * @throws Exception 
	 ******************************************/
	public static String getDirectValueFromCollectionFile(String param, int sheet, int column, int row, boolean emptyException) throws Exception,EmptyValueException
		{
		/**
		 * We get the Value from the collection file
		 */
		//Here we get the value from the collection file
		String value = getValueFromExcelFile(sheet, column, row);
		
		if(checkEmptyValue(value))
			{
			if(emptyException)
				{
				throw new EmptyValueException("The requested value is empty sheet : "+sheet+" row : "+row+" column : "+column);
				}
			else
				{
				return "";
				}
			}
		
		/**
		 * Second we apply the regex
		 */
		if((param != null) &&
				(!param.equals("")) &&
				(param.contains("*")))
			{
			Variables.getLogger().debug("Value before "+param+" regex : "+value);
			value = applyRegex(value, param);
			Variables.getLogger().debug("Value after applying "+param+" regex : "+value);
			}
		/**********/
		
		Variables.getLogger().debug("Value got from the collection file sheet : "+sheet+" row : "+row+" column : "+column+" value : "+value);
		return value;
		}
	
	private static String getValueFromExcelFile(int sheetNumber, int columnNumber, int rowNumber) throws Exception
		{
		try
			{
			Workbook myWorkbook = Variables.getMyWorkbook();
			
			Row row = myWorkbook.getSheetAt(sheetNumber).getRow(rowNumber);
			if(row == null)return "";
			
			Cell cell = row.getCell(columnNumber);
			if(cell == null)return "";
			
			switch (cell.getCellType())
				{
			    case Cell.CELL_TYPE_STRING:return cell.getRichStringCellValue().getString();
			    case Cell.CELL_TYPE_NUMERIC:
			        if (DateUtil.isCellDateFormatted(cell))
			        	{
			            return cell.getDateCellValue().toString();
			        	}
			        else
			        	{
			            return String.valueOf((long)cell.getNumericCellValue());
			        	}
			    case Cell.CELL_TYPE_BOOLEAN:
			    	if(cell.getBooleanCellValue())
			    		{
			    		return "true";
			    		}
			    	else
			    		{
			    		return "false";
			    		}
			    case Cell.CELL_TYPE_FORMULA:
			        {
			        switch (cell.getCachedFormulaResultType())
				        {
				        case Cell.CELL_TYPE_STRING:return cell.getRichStringCellValue().getString();
				        case Cell.CELL_TYPE_NUMERIC:
				            if (DateUtil.isCellDateFormatted(cell))
				            	{
				                return cell.getDateCellValue().toString();
				            	}
				            else
				            	{
				                return String.valueOf((long)cell.getNumericCellValue());
				            	}
				        case Cell.CELL_TYPE_BOOLEAN:
				        	if(cell.getBooleanCellValue())
				        		{
				        		return "true";
				        		}
				        	else
				        		{
				        		return "false";
				        		}
				        default:return cell.toString();
				        }
			        }
			    default:return cell.toString();
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			throw e;
			}
		}
		
	
	/****
	 * Return the row to target to get a value from the collection file
	 */
	private static int getRowNumber(String row, int currentRow) throws Exception
		{
		int rowNumber;
		
		if(row.contains("-"))
			{
			rowNumber = currentRow+Integer.parseInt(row.split("-")[0]);
			
			//We check if we are out of range
			int limit;
			if(row.split("-")[1].equals("*"))
				{
				limit = Integer.parseInt(UsefulMethod.getTargetOption("maxdataprocessed"));
				}
			else
				{
				limit = Integer.parseInt(row.split("-")[1]);
				}
			
			if(rowNumber>limit)
				{
				throw new Exception("The requested value is out of range");
				}
			}
		else
			{
			rowNumber = Integer.parseInt(row);
			}
		
		return rowNumber;
		}
			
			
	/**
	 * Return "true" if the value from the collection file is empty
	 */
	private static boolean checkEmptyValue(String value)
		{
		/************************
		 * If the value is empty or contains #, it maybe means that we reach the end of the collection file
		 */
		if((Pattern.matches("^$", value)) || (value.contains("#")))
			{
			return true;
			}
		else
			{
			return false;
			}
		/***********************/
		}
			
	/****
	 * Method used to apply a regex to a value	
	 * @throws Exception 
	 */
	private static String applyRegex(String newValue, String param) throws Exception
		{
		try
			{
			/*********
			 * Number before
			 **/
			if(Pattern.matches("\\*\\d+\\*.*", param))
				{
				int number = howMany("\\*\\d+\\*", param);
				if(newValue.length() >= number)
					{
					newValue = newValue.substring(0, number);
					}
				}
			/**
			 * End number before
			 *************/
			
			/*********
			 * Number after
			 **/
			if(Pattern.matches(".*\\*\\d+\\*", param))
				{
				int number = howMany("\\*\\d+\\*", param);
				if(newValue.length() >= number)
					{
					newValue = newValue.substring(newValue.length()-number, newValue.length());
					}
				}
			/**
			 * End number after
			 *************/
			
			/*************
			 * Majuscule
			 **/
			if(Pattern.matches(".*\\*M\\*.*", param))
				{
				newValue = newValue.toUpperCase();
				}
			if(Pattern.matches(".*\\*\\d+M\\*.*", param))
				{
				int majuscule = howMany("\\*\\d+M\\*", param);
				if(newValue.length() >= majuscule)
					{
					String first = newValue.substring(0, majuscule);
					String last = newValue.substring(majuscule,newValue.length());
					first = first.toUpperCase();
					last = last.toLowerCase();
					newValue = first+last;
					}
				}
			/**
			 * End majuscule
			 ****************/
			
			/*************
			 * Minuscule
			 **/
			if(Pattern.matches(".*\\*m\\*.*", param))
				{
				newValue = newValue.toLowerCase();
				}
			if(Pattern.matches(".*\\*\\d+m\\*.*", param))
				{
				int minuscule = howMany("\\*\\d+m\\*", param);
				if(newValue.length() >= minuscule)
					{
					String first = newValue.substring(0, minuscule);
					String last = newValue.substring(minuscule,newValue.length());
					first = first.toLowerCase();
					last = last.toUpperCase();
					newValue = first+last;
					}
				}
			/**
			 * End minuscule
			 ****************/
			
			/*************
			 * Split
			 * 
			 * Example : *1S/*
			 * means to split using "/" and to keep the first value
			 **/
			if(Pattern.matches(".*\\*\\d+S.+\\*.*", param))
				{
				int split = howMany("\\*\\d+S.+\\*", param);
				String splitter = getSplitter("\\*\\d+S.+\\*", param);
				newValue = newValue.split(splitter)[split-1];
				}
			/**
			 * End Split
			 ****************/
			
			/*************
			 * Replace
			 * 
			 * Example : *"test"R"testo"*
			 **/
			if(Pattern.matches(".*\\*\".+\"R\".*\"\\*.*", param))
				{
				String pattern = null;
				String replaceBy = null;
				Pattern begin = Pattern.compile("\".+\"R");
				Matcher mBegin = begin.matcher(param);
				Pattern end = Pattern.compile("R\".*\"");
				Matcher mEnd = end.matcher(param);
				
				if(mBegin.find())
					{
					String str = mBegin.group();
					str = str.substring(0,str.length()-1);//We remove the "R"
					str = str.replace("\"", "");
					pattern = str;
					}
				if(mEnd.find())
					{
					String str = mEnd.group();
					str = str.substring(1,str.length());//We remove the "R"
					str = str.replace("\"", "");
					replaceBy = str;
					}
				if((pattern != null) && (replaceBy != null))
					{
					newValue = newValue.replace(pattern, replaceBy);
					}
				}
			/**
			 * End Replace
			 ****************/
			
			/*************
			 * Clear French Char
			 * 
			 * Example : *C*
			 **/
			if(Pattern.matches(".*\\*C\\*.*", param))
				{
				newValue = ClearFrenchString.translate(newValue);
				}
			/**
			 * End Clear French Char
			 ****************/
			
			/**
			 * End
			 ****************/
			
			/*************
			 * Convert values into CUCM acceptable ones
			 * 
			 * For instance : "7962" into "cisco 7962" etc...
			 * LF Means "Look For"
			 * Example : *LFcss* or *LFphone*
			 **/
			if(Pattern.matches(".*\\*LF\\w+\\*.*", param))
				{
				//We extract the substitute type
				String substitute = null;
				Pattern p = Pattern.compile("\\*LF\\w+\\*");
				Matcher m = p.matcher(param);
				
				if(m.find())
					{
					String str = m.group();
					str = str.replace("*LF", "").replace("*", "");
					substitute = str;
					}
				
				if(substitute != null)
					{
					newValue = UsefulMethod.findSubstitute(newValue, SubstituteType.valueOf(substitute));
					}
				}
			/**
			 * End Convert values into CUCM acceptable ones
			 ****************/
			
			
			/**************************************/
			return newValue;
			}
		catch(Exception exc)
			{
			throw new Exception("An issue occured while applying the regex : "+exc.getMessage());
			}
		}
	
	/**
	 * Method used to return a number present in a regex
	 * 
	 * for instance : *1M* return 1
	 */
	private static int howMany(String regex, String param) throws Exception
		{
		Pattern p = Pattern.compile(regex);
		Pattern pChiffre = Pattern.compile("\\d+");
		Matcher m = p.matcher(param);
		
		if(m.find())
			{
			Matcher mChiffre = pChiffre.matcher(m.group());
			if(mChiffre.find())
				{
				return Integer.parseInt(mChiffre.group());
				}
			}
		return 0;
		}
	
	/**
	 * Method used to find and return 
	 * Character used to split
	 */
	private static String getSplitter(String regex, String param) throws Exception
		{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(param);
		
		if(m.find())
			{
			String temp = m.group().replace("*", "");
			return temp.split("S")[1];
			}
		throw new Exception();
		}
	
	/********
	 * Method used to get a single value from the excel file
	 * We can here choose what behavior we want regarding the empty value
	 * in the collection file :
	 * - True : We will get EmptyValueException if empty
	 * - False : We will just get an empty String
	 * @throws Exception 
	 */
	public static String getValueFromCollectionFile(int row, String pattern, Object obj, Boolean emptyBehavior) throws Exception
		{
		if((pattern == null) || (pattern .equals("")))
			{
			Variables.getLogger().debug("The pattern is either null or empty, so we return an empty value");
			return "";
			}
		
		Variables.getLogger().debug("Value from collection file before : "+pattern);
		String result = doRegex(pattern, row, obj, emptyBehavior);
		
		result = result.trim();//Just to remove unwanted spaces
		
		Variables.getLogger().debug("Value from collection file after : "+result);
		return result;
		}
	
	/**
	 * Method used to get the last "non empty" value in
	 * a given column
	 * @throws Exception 
	 */
	public static int getTheLastIndexOfAColumn(String matcher) throws Exception
		{
		Variables.getLogger().debug("Last reachable index research started for the column "+matcher);
		int i=0;
		int max = Integer.parseInt(UsefulMethod.getTargetOption("maxdataprocessed"));
		
		while(true)
			{
			try
				{
				if(i>max)throw new Exception("Max data processed limit reached");
				
				CollectionTools.getValueFromCollectionFile(i, matcher, null, true);//Will raise an exception once an empty value will be found
				}
			catch(EmptyValueException eve)
				{
				Variables.getLogger().debug("Last reachable index found is "+i+" for the column "+matcher);
				return i;
				}
			catch (Exception e)
				{
				throw new Exception("Error while searching the last reachable index of the column "+matcher+" : "+e.getMessage());
				}
			i++;
			}
		}
	
	/*************
	 * Method used to get a free non did number
	 * from the CUCM
	 */
	public static String getAvailableInternalNumber() throws Exception
		{
		String availableNumber = Variables.getInternalNumberList().get(0);
		Variables.getInternalNumberList().remove(0);
		Variables.getLogger().debug("Returned available number : "+availableNumber);
		return availableNumber;
		}
	
	/*************
	 * Method used to get a free non did number in the CPG range
	 * from the CUCM
	 */
	public static String getAvailableCPGNumber() throws Exception
		{
		String availableNumber = Variables.getCpgNumberList().get(0);
		Variables.getCpgNumberList().remove(0);
		Variables.getLogger().debug("Returned CPG available number : "+availableNumber);
		return availableNumber;
		}
	
	/*************
	 * Method used to get a free non did number in the LG range
	 * from the CUCM
	 */
	public static String getAvailableLGNumber() throws Exception
		{
		String availableNumber = Variables.getLgNumberList().get(0);
		Variables.getLgNumberList().remove(0);
		Variables.getLogger().debug("Returned LG available number : "+availableNumber);
		return availableNumber;
		}
	
	/**
	 * Method used to write a simple string in the
	 * collection file without caring about the font
	 * @throws Exception 
	 */
	public synchronized static void writeStringInTheCollectionFile(String fileName, String stringValue, int sheet, int column, int row, Workbook wW)
		{
		try
			{
			//Workbook wW = WorkbookFactory.create(new FileInputStream(fileName));
			Sheet s = wW.getSheetAt(sheet);
			Cell c = s.getRow(row).getCell(column);
			
			if(c == null)
				{
				c = s.getRow(row).createCell(column);
				c.setCellType(Cell.CELL_TYPE_STRING);
				}
			
			c.setCellValue(stringValue);
			
			FileOutputStream output = new FileOutputStream(fileName);
			wW.write(output);
			output.close();
			wW.close();
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("Error while writing in the excel file", e);
			}
		}
	
	/**
	 * Method which return as an integer array the sheet, column and row number
	 * of a specified matcher
	 * 
	 * tab[0] : sheet number
	 * tab[1] : column number
	 * tab[2] : row number
	 * @throws Exception 
	 */
	public static int[] getMatcherInfo(String matcher) throws Exception
		{
		int[] matcherInfos = new int[3];  
		
		try
			{
			for(String s : Variables.getMatcherList())
				{
				String[] tab = s.split(":");//As a reminder a matcher is : cucm.firstname:4:4:4+*
				if(tab[0].equals(matcher))
					{
					matcherInfos[0] = Integer.parseInt(tab[1]);//Sheet number
					matcherInfos[1] = Integer.parseInt(tab[2]);//Column number
					
					//Row number
					if(tab[3].contains("-"))
						{
						String[] row = tab[3].split("-");
						matcherInfos[2] = Integer.parseInt(row[0]);
						}
					else
						{
						matcherInfos[1] = Integer.parseInt(tab[3]);
						}
					
					return matcherInfos;
					}
				}
			}
		catch (Exception e)
			{
			e.printStackTrace();
			throw new Exception("Error while looking for a matcher infos");
			}
		
		throw new Exception("No matcher found");
		}
	
	
	/**
	 * Return true if the collection file value is empty
	 * @throws Exception 
	 */
	public static boolean isValueFromCollectionFileEmpty(int index, String pattern) throws Exception 
		{
		try
			{
			CollectionTools.getValueFromCollectionFile(index, pattern, null, true);
			return false;
			}
		catch (EmptyValueException eve)
			{
			return true;
			}
		catch (Exception e)
			{
			throw e;
			}
		}
	
	/**
	 * Used to split a value while using the escape character "\"
	 * @param pat
	 * @param splitter
	 * @return
	 */
	private static String[] getSplittedValue(String pat, String splitter)
		{
		pat = pat.replace("'", "");
		String splitRegex = "(?<!\\\\)" + Pattern.quote(splitter);//To activate "\" as an escape character
		
		return pat.split(splitRegex);
		}
	
	/**
	 * Used to find the real row number from the index and a pattern such as "file.lastname"
	 * @param pattern
	 * @return
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	private static int findRealRow(String pattern, int index) throws NumberFormatException, Exception
		{
		String[] pat = getSplittedValue(pattern, UsefulMethod.getTargetOption("splitter"));
		
		for(int i = 0; i<pat.length; i++)
			{
			for(String s : Variables.getMatcherList())
				{
				String[] tab = s.split(":");//Example : cucm.firstname:4:4:4+*
				//tab[0]=cucm.firstname, tab[1]=sheet, tab[2]=column and tab[3]=row
				
				if(Pattern.matches(".*"+tab[0]+".*", pat[i]))
					{
					return getRowNumber(tab[3], index);
					}
				}
			}
		throw new Exception("No pattern found, so no row number could be retrieve");
		}
	
	
	/*2017*//*RATEL Alexandre 8)*/
	}

