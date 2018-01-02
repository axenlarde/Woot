package com.alex.woot.misc;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;

/**********************************
 * Class aims to contain static method to check
 * Colleciton file content is correct
 * 
 * @author RATEL Alexandre
 **********************************/
public class CollectionFileChecker
	{
	/**
	 * Variables
	 */
	
	
	/****************
	 * Method used to validate if the collection file is correct
	 * 
	 * To do that we simply check if some values are empty
	 */
	public static void checkForSiteCreation(Workbook myWorkbook) throws Exception
		{
		try
			{
			Variables.getLogger().info("Collection file check for site creation begin");
			//If a value is empty, an exception is going to be thrown
			CollectionTools.getValueFromCollectionFile("office.name");
			//Add some more check
			
			Variables.getLogger().info("Collection file check end : The collection file seems to be correct for a site creation");
			}
		catch (Exception e)
			{
			throw new Exception("The collection file is incorrect : Some data are missing : "+e.getMessage());
			}
		}
	
	
	/****************
	 * Method used to validate if the collection file is correct
	 * 
	 * To do that we simply check if some values are empty
	 */
	public static void checkForUserCreation() throws Exception
		{
		try
			{
			Variables.getLogger().info("Collection file check for a user creation begin");
			//If a value is empty, an exception is going to be thrown
			
			int lastIndex = CollectionTools.getTheLastIndexOfAColumn(UsefulMethod.getTargetOption("userlastnametemplate"));
			if(lastIndex == 0)throw new Exception("There is no user to process !");
			
			for(int i=0; i<lastIndex; i++)
				{
				CollectionTools.isValueFromCollectionFileEmpty(i, UsefulMethod.getTargetOption("officenametemplate"));
				CollectionTools.isValueFromCollectionFileEmpty(i, UsefulMethod.getTargetOption("phonetypetemplate"));
				CollectionTools.isValueFromCollectionFileEmpty(i, UsefulMethod.getTargetOption("phonemactemplate"));//It depends if we want to make woot provide this value automatically
				}
			
			//Add some more check
			//For instance we need to check if a mobile user has a userid
			
			Variables.getLogger().info("Collection file check end : The collection file seems to be correct for a user creation");
			}
		catch (Exception e)
			{
			throw new Exception("The collection file is incorrect : Some data are missing : "+e.getMessage());
			}
		}
	
	/****************
	 * Method used to validate if the collection file is correct
	 * 
	 * To do that we simply check if some values are empty
	 */
	public static void checkForUserCSVCreation(Workbook myWorkbook) throws Exception
		{
		try
			{
			Variables.getLogger().info("Collection file check for a CSV creation begin");
			//If a value is empty, an exception is going to be thrown
			
			int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
			if(lastIndex == 0)throw new EmptyListException("There is no user to process !");
			
			for(int i=0; i<lastIndex; i++)
				{
				CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook);
				CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);
				CollectionTools.getValueFromCollectionFile(i, "cucm.linenumber", myWorkbook);
				}
			
			//Add some more check
			
			Variables.getLogger().info("Collection file check end : The collection file seems to be correct for a CSV creation");
			}
		catch (Exception e)
			{
			throw new Exception("The collection file is incorrect : Some data are missing : "+e.getMessage());
			}
		}
	
	/****************
	 * Method used to validate if the collection file is correct
	 * 
	 * To do that we simply check if some values are empty
	 */
	public static void checkForMacCollection(Workbook myWorkbook) throws Exception
		{
		try
			{
			Variables.getLogger().info("Collection file check for mac collection begin");
			//If a value is empty, an exception is going to be thrown
			
			int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);
			if(lastIndex == 0)throw new Exception("There is no user to process !");
			
			for(int i=0; i<lastIndex; i++)
				{
				CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook);
				CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);
				}
			
			//Hard to make a test about the mac addresses so we do not do it
			
			//Add some more check
			
			Variables.getLogger().info("Collection file check end : The collection file seems to be correct to start a mac collection");
			}
		catch (Exception e)
			{
			throw new Exception("The collection file is incorrect : Some data are missing : "+e.getMessage());
			}
		}
	
	/****************
	 * Method used to validate if the collection file is correct
	 * 
	 * To do that we simply check if some values are empty
	 */
	public static void checkForPhoneCreation(Workbook myWorkbook) throws Exception
		{
		try
			{
			Variables.getLogger().info("Collection file check for a phone creation begin");
			//If a value is empty, an exception is going to be thrown
			
			int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.mac", myWorkbook);
			if(lastIndex == 0)throw new Exception("There is no phone to process !");
			
			//We would like to be sure that phone type are present
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);
					}
				catch (EmptyValueException eve)
					{
					throw new Exception("Product Type is missing line "+i+1);
					}
				}
			
			//Add some more check
			
			Variables.getLogger().info("Collection file check end : The collection file seems to be correct for a phone creation");
			}
		catch (Exception e)
			{
			throw new Exception("The collection file is incorrect : Some data are missing : "+e.getMessage());
			}
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

