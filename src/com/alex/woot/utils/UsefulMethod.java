package com.alex.woot.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.alex.woot.gui.OfficeSelectionWindow;
import com.alex.woot.misc.Correction;
import com.alex.woot.misc.DidRange;
import com.alex.woot.misc.Office;
import com.alex.woot.misc.OfficeSetting;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ValueMatcher;
import com.alex.woot.misc.databaseAccess;
import com.alex.woot.soap.items.PhoneService;
import com.alex.woot.soap.items.SpeedDial;
import com.alex.woot.user.misc.UserCreationProfile;
import com.alex.woot.user.misc.UserTemplate;
import com.alex.woot.utils.Variables.DataSource;
import com.alex.woot.utils.Variables.SubstituteType;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.cucmAXLVersion;
import com.alex.woot.utils.Variables.gwType;
import com.alex.woot.utils.Variables.itemType;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.xml.ws.BindingProvider;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.log4j.Level;
import org.apache.poi.ss.formula.functions.Substitute;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


/**********************************
 * Class used to store the useful static methods
 * 
 * @author RATEL Alexandre
 **********************************/
public class UsefulMethod
	{
	
	/*****
	 * Method used to read the main config file
	 * @throws Exception 
	 */
	public static ArrayList<String[][]> readMainConfigFile(String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			file = xMLReader.fileRead(".\\"+fileName);
			
			listParams.add("config");
			return xMLGear.getResultListTab(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the file : "+fileName+" : "+exc.getMessage());
			}
		
		}
	
	/**
	 * Method used to init the userlocal arraylist
	 */
	public static ArrayList<String> initUserLocalList()
		{
		ArrayList<String> userLocal = new ArrayList<String>();
		userLocal.add("French France");
		userLocal.add("Italian Italy");
		userLocal.add("English United States");
		
		return userLocal;
		}
	
	/**
	 * Method used to init the country arraylist
	 */
	public static ArrayList<String> initCountryList()
		{
		ArrayList<String> country = new ArrayList<String>();
		country.add("France");
		country.add("Italy");
		country.add("United Kingdom");
		
		return country;
		}
	
	
	/***************************************
	 * Method used to get a specific value
	 * in the user preference XML File
	 ***************************************/
	public synchronized static String getTargetOption(String node) throws Exception
		{
		//We first seek in the configFile.xml
		for(String[] s : Variables.getTabConfig().get(0))
			{
			if(s[0].equals(node))return s[1];
			}
		
		//Then we seek in the userPreference.xml
		for(String[] s : Variables.getUserConfig().get(0))
			{
			if(s[0].equals(node))return s[1];
			}
		
		/***********
		 * If this point is reached, the option looked for was not found
		 */
		throw new Exception("Option \""+node+"\" not found"); 
		}
	/*************************/
	
	
	
	/************************
	 * Check if java version
	 * is correct
	 ***********************/
	public static void checkJavaVersion()
		{
		try
			{
			String jVer = new String(System.getProperty("java.version"));
			Variables.getLogger().info("Detected JRE version : "+jVer);
			
			/*Need to use the config file value*/
			
			if(jVer.contains("1.6"))
				{
				/*
				if(Integer.parseInt(jVer.substring(6,8))<16)
					{
					Variables.getLogger().info("JRE version is not compatible. The application will now exit. system.exit(0)");
					System.exit(0);
					}*/
				}
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().info("ERROR : It has not been possible to detect JRE version",exc);
			}
		}
	/***********************/
	
	/*********************************************
	 * Used to get a file path
	 * @throws Exception 
	 *********************************************/
	public static String getFilePath(ArrayList<String> allowedExtensionList, String invitPhrase, String selectButton) throws Exception
		{
		JFileChooser fcSource = new JFileChooser();
		try
			{
			fcSource.setCurrentDirectory(new File(Variables.getMainConfigFileDirectory()));
			
			fcSource.setDialogTitle(invitPhrase);
			
			EasyFileFilter myFilter = new EasyFileFilter(allowedExtensionList);
			fcSource.setFileFilter(myFilter);
			
			int resultat = fcSource.showDialog(fcSource, selectButton);
			if(resultat == fcSource.APPROVE_OPTION)
				{
				return fcSource.getSelectedFile().toString();
				}
			else
				{
				return null;
				}
			}
		catch(Exception exc)
			{
			throw new Exception("ERROR : While fetching a file");
			}
		}
	
	/*********************************************
	 * Used to get a file path
	 * @throws Exception 
	 *********************************************/
	public static String getDirectoryPath(String baseDirectory, String invitPhrase, String selectButton) throws Exception
		{
		JFileChooser fcSource = new JFileChooser();
		try
			{
			fcSource.setCurrentDirectory(new File(baseDirectory));
			fcSource.setDialogTitle(LanguageManagement.getString("invitPhrase"));
			
			int resultat = fcSource.showDialog(fcSource, LanguageManagement.getString("selectButton"));
			if(resultat == fcSource.APPROVE_OPTION)
				{
				File mFile = new File(fcSource.getSelectedFile().toString());
				return mFile.getParent();
				}
			else
				{
				throw new Exception(LanguageManagement.getString("errordirectory"));
				}
			}
		catch(Exception exc)
			{
			throw new Exception("ERROR : While fetching a file : "+exc.getMessage());
			}
		}
	
	
	/************
	 * Method used to read a simple configuration file
	 * @throws Exception 
	 */
	public static ArrayList<String> readFile(String param, String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading the file : "+fileName);
			file = getFlatFileContent(fileName);
			
			listParams.add(param);
			
			return xMLGear.getResultList(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("ERROR : The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the "+fileName+" file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read a configuration file
	 * @throws Exception 
	 */
	public static ArrayList<String[][]> readFileTab(String param, String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading of the "+param+" file : "+fileName);
			file = getFlatFileContent(fileName);
			
			listParams.add(param);
			return xMLGear.getResultListTab(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the "+param+" file : "+exc.getMessage());
			}
		}
	
	/************
	 * Method used to read an advanced configuration file
	 * @throws Exception 
	 */
	public static ArrayList<ArrayList<String[][]>> readExtFile(String param, String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		
		try
			{
			Variables.getLogger().info("Reading of the file : "+fileName);
			file = getFlatFileContent(fileName);
			
			listParams.add(param);
			return xMLGear.getResultListTabExt(file, listParams);
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			Variables.getLogger().error(exc.getMessage(),exc);
			throw new Exception("ERROR with the file : "+exc.getMessage());
			}
		}
	
	/**
	 * Used to return the file content regarding the data source (xml file or database file)
	 * @throws Exception 
	 */
	public static String getFlatFileContent(String fileName) throws Exception
		{
		if(Variables.getDataSource().equals(DataSource.databaseFile))
			{
			return databaseAccess.extractContentFile(Variables.getDatabasePath(), fileName);
			}
		else if(Variables.getDataSource().equals(DataSource.xmlFile))
			{
			return xMLReader.fileRead(Variables.getMainConfigFileDirectory()+"\\"+fileName);
			}
		else
			{
			//Default
			return xMLReader.fileRead(Variables.getMainConfigFileDirectory()+"\\"+fileName);
			}
		}
	
	/************
	 * Method used to read the office list file
	 * @throws Exception 
	 */
	public static ArrayList<Office> readOfficeFile(String fileName) throws Exception
		{
		String file;
		ArrayList<String> listParams = new ArrayList<String>();
		ArrayList<String[][]> result;
		ArrayList<ArrayList<String[][]>> extendedList;
		ArrayList<Office> myOfficeList = new ArrayList<Office>();
		
		try
			{
			Variables.getLogger().info("Reading of the office list file : "+fileName);
			file = UsefulMethod.getFlatFileContent(fileName);
			
			listParams.add("offices");
			listParams.add("office");
			result = xMLGear.getResultListTab(file, listParams);
			extendedList = xMLGear.getResultListTabExt(file, listParams);
			
			
			//We create an ArrayList containing the offices
			for(int i=0; i<result.size(); i++)
				{
				String[][] tab = result.get(i);
				ArrayList<String[][]> tabE = extendedList.get(i);
				
				ArrayList<DidRange> didRanges = new ArrayList<DidRange>();
				ArrayList<PhoneService> serviceList = new ArrayList<PhoneService>();
				ArrayList<SpeedDial> sdList = new ArrayList<SpeedDial>();
				ArrayList<OfficeSetting> settings = new ArrayList<OfficeSetting>();
				
				for(int j=0; j<tab.length; j++)
					{
					if(tab[j][0].equals("didranges"))
						{
						for(String[] s : tabE.get(j))
							{
							didRanges.add(new DidRange(s[1]));
							}
						}
					else if(tab[j][0].equals("setting"))
						{
						settings.add(new OfficeSetting(
								UsefulMethod.getItemByName("targetname", tabE.get(j)),
								UsefulMethod.getItemByName("value", tabE.get(j))
								));
						}
					}
				
				myOfficeList.add(new Office(
						UsefulMethod.getItemByName("name", tab),
						UsefulMethod.getItemByName("templatename", tab),
						UsefulMethod.getItemByName("fullname", tab),
						UsefulMethod.getItemByName("audiobandwidth", tab),
						UsefulMethod.getItemByName("videobandwidth", tab),
						UsefulMethod.getItemByName("softkeytemplate", tab),
						UsefulMethod.getItemByName("callmanagergroup", tab),
						UsefulMethod.getItemByName("datetimegroup", tab),
						UsefulMethod.getItemByName("mohnumber", tab),
						UsefulMethod.getItemByName("internalprefix", tab),
						UsefulMethod.getItemByName("e164", tab),
						UsefulMethod.getItemByName("receptionnumber", tab),
						UsefulMethod.getItemByName("aargroup", tab),
						UsefulMethod.getItemByName("voicemailtemplate", tab),
						UsefulMethod.getItemByName("voicemailprofile", tab),
						UsefulMethod.getItemByName("voicenetwork", tab),
						UsefulMethod.getItemByName("userlocal", tab),
						UsefulMethod.getItemByName("country", tab),
						didRanges,
						settings
						));
				}
			
			Variables.getLogger().debug("Office found :");
			for(Office o : myOfficeList)
				{
				Variables.getLogger().debug(o.getName());
				}
			
			return myOfficeList;
			}
		catch(FileNotFoundException fnfexc)
			{
			throw new FileNotFoundException("The "+fileName+" file was not found : "+fnfexc.getMessage());
			}
		catch(Exception exc)
			{
			throw new Exception("ERROR with the "+fileName+" file : "+exc.getMessage());
			}
		}
	
	
	/******
	 * Method used to initialize the AXL Connection to the CUCM
	 */
	public static synchronized void initAXLConnectionToCUCM() throws Exception
		{
		try
			{
			UsefulMethod.disableSecurity();//We first turned off security
			
			if(Variables.getCUCMVersion().equals(cucmAXLVersion.version85))
				{
				com.cisco.axlapiservice8.AXLAPIService axlService = new com.cisco.axlapiservice8.AXLAPIService();
				com.cisco.axlapiservice8.AXLPort axlPort = axlService.getAXLPort();
				
				// Set the URL, user, and password on the JAX-WS client
				String validatorUrl = "https://"+UsefulMethod.getTargetOption("axlhost")+":"+UsefulMethod.getTargetOption("axlport")+"/axl/";
				
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UsefulMethod.getTargetOption("axlusername"));
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UsefulMethod.getTargetOption("axlpassword"));
				
				Variables.setAXLConnectionToCUCM85(axlPort);
				}
			else if(Variables.getCUCMVersion().equals(cucmAXLVersion.version105))
				{
				com.cisco.axlapiservice10.AXLAPIService axlService = new com.cisco.axlapiservice10.AXLAPIService();
				com.cisco.axlapiservice10.AXLPort axlPort = axlService.getAXLPort();
				
				// Set the URL, user, and password on the JAX-WS client
				String validatorUrl = "https://"+UsefulMethod.getTargetOption("axlhost")+":"+UsefulMethod.getTargetOption("axlport")+"/axl/";
				
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UsefulMethod.getTargetOption("axlusername"));
				((BindingProvider) axlPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UsefulMethod.getTargetOption("axlpassword"));
				
				Variables.setAXLConnectionToCUCMV105(axlPort);
				}
			
			Variables.getLogger().debug("WSDL Initialization done");
			
			/**
			 * We now check if the CUCM is reachable by asking him its version
			 */
			SimpleRequest.getCUCMVersion();
			Variables.setCUCMReachable(true);
			}
		catch (Exception e)
			{
			Variables.getLogger().error("Error while initializing CUCM connection : "+e.getMessage(),e);
			Variables.setCUCMReachable(false);
			throw new Exception(e);
			}
		}
	
	/**
	 * Method used when the application failed to 
	 * initialize
	 */
	public static void failedToInit(Exception exc)
		{
		exc.printStackTrace();
		JOptionPane.showMessageDialog(null,"Application failed to init :\r\n"+exc.getMessage()+"\r\nThe software will now exit","ERROR",JOptionPane.ERROR_MESSAGE);
		Variables.getLogger().error(exc.getMessage());
		Variables.getLogger().error("Application failed to init : System.exit(0)");
		System.exit(0);
		}
	
	/**
	 * Initialization of the internal variables from
	 * what we read in the configuration file
	 * @throws Exception 
	 */
	public static void initInternalVariables() throws Exception
		{
		/***********
		 * Logger
		 */
		String level = UsefulMethod.getTargetOption("log4j");
		if(level.compareTo("DEBUG")==0)
			{
			Variables.getLogger().setLevel(Level.DEBUG);
			}
		else if (level.compareTo("INFO")==0)
			{
			Variables.getLogger().setLevel(Level.INFO);
			}
		else if (level.compareTo("ERROR")==0)
			{
			Variables.getLogger().setLevel(Level.ERROR);
			}
		else
			{
			//Default level is INFO
			Variables.getLogger().setLevel(Level.INFO);
			}
		Variables.getLogger().info("Log level found in the configuration file : "+Variables.getLogger().getLevel().toString());
		/*************/
		
		/************
		 * Etc...
		 */
		//If needed, just write it here
		/*************/
		}
	
	
	/**
	 * Method which convert a string into DataSource
	 */
	public static DataSource convertStringToDataSource(String source)
		{
		if(source.equals("databaseFile"))
			{
			return DataSource.databaseFile;
			}
		else if(source.equals("xmlFile"))
			{
			return DataSource.xmlFile;
			}
		else
			{
			//Default : databaseFile
			Variables.getLogger().debug("Default value returned : DatabaseFile");
			return DataSource.databaseFile;
			}
		}
	
	/**
	 * Used to reset the source directory path
	 */
	public static void resetDataPath()
		{
		Variables.setMainConfigFileDirectory(null);
		Variables.setDatabasePath(null);
		
		//Has to be written
		}
	
	
	/**
	 * Method which convert a string into cucmAXLVersion
	 */
	public static cucmAXLVersion convertStringToCUCMAXLVersion(String version)
		{
		if(version.contains("80"))
			{
			return cucmAXLVersion.version80;
			}
		else if(version.contains("85"))
			{
			return cucmAXLVersion.version85;
			}
		else if(version.contains("105"))
			{
			return cucmAXLVersion.version105;
			}
		else
			{
			//Default : 8.5
			return cucmAXLVersion.version85;
			}
		}
	
	
	/**************
	 * Method aims to get a template item value by giving its name
	 * @throws Exception 
	 *************/
	public static String getItemByName(String name, String[][] itemDetails) throws Exception
		{
		for(int i=0; i<itemDetails.length; i++)
			{
			if(itemDetails[i][0].equals(name))
				{
				return itemDetails[i][1];
				}
			}
		//throw new Exception("Item not found : "+name);
		Variables.getLogger().debug("Item not found : "+name);
		return "";
		}
	
	/**********************************************************
	 * Method used to disable security in order to accept any
	 * certificate without trusting it
	 */
	public static void disableSecurity()
		{
		try
        	{
            X509TrustManager xtm = new HttpsTrustManager();
            TrustManager[] mytm = { xtm };
            SSLContext ctx = SSLContext.getInstance("SSL");
            ctx.init(null, mytm, null);
            SSLSocketFactory sf = ctx.getSocketFactory();

            HttpsURLConnection.setDefaultSSLSocketFactory(sf);
            
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier()
            	{
                public boolean verify(String hostname, SSLSession session)
                	{
                    return true;
                	}
            	}
            );
        	}
        catch (Exception e)
        	{
            e.printStackTrace();
        	}
		}
	
	/**
	 * Method used to convert a String network mask into an integer one
	 * 
	 * For instance :
	 * Convert 255.255.255.0 into 24
	 * Convert 255.255.240.0 into 20
	 */
	public static String convertStringMaskToIntMask(String mask)
		{
		//We check if mask is a long or a CIDR one
		if(!Tester.IPValide(mask))return mask;
		
		SubnetUtils subnet = new SubnetUtils("192.168.1.0", mask.trim());
		return subnet.getInfo().getCidrSignature().split("/")[1];
		}
	
	/**********
	 * Method used to convert a value from the collection file
	 * into a value expected by the CUCM using the substitute list
	 */
	public static String findSubstitute(SubstituteType type, String toConvert) throws Exception
		{
		for(ValueMatcher vm : Variables.getSubstituteList())
			{
			if(vm.getType().equals(type))
				{
				if(vm.getCollectionName().equals(toConvert))
					{
					Variables.getLogger().debug(toConvert+" converted into : "+vm.getConvertName());
					return vm.getConvertName();
					}
				}
			}
		throw new Exception("Impossible to convert \""+toConvert+"\"");
		}
	
	
	/***************
	 * Method used to convert a profile name from the collection file
	 * into a profile name expected by the CSV
	 * @throws Exception 
	 */
	public static synchronized String findCodecBandwidth(String codec) throws Exception
		{
		if(codec.equals("G.711"))
			{
			return "64";
			}
		else if(codec.equals("G.729"))
			{
			return "10";
			}
		
		throw new Exception("Profile "+codec+" not found");
		}
	
	
	/********************************************
	 * Method used to init the class eMailsender
	 * @throws Exception 
	 ********************************************/
	public synchronized static void initEMailServer() throws Exception
		{
		Variables.seteMSender(new eMailSender(UsefulMethod.getTargetOption("smtpemailport"),
				 UsefulMethod.getTargetOption("smtpemailprotocol"),
				 UsefulMethod.getTargetOption("smtpemailserver"),
				 UsefulMethod.getTargetOption("smtpemail"),
				 UsefulMethod.getTargetOption("smtpemailpassword")));
		}
	
	/**
	 * Method used to send an email to the admin group
	 */
	public synchronized static void sendEmailToTheAdminList(String desc, String siteName, String content)
		{
		try
			{
			String adminEmails = UsefulMethod.getTargetOption("smtpemailadmin");
			
			String subject = LanguageManagement.getString("emailreportsubject")+siteName;
			String eMailDesc = desc+" - "+siteName;
			
			if(adminEmails.contains(";"))
				{
				//There are many emails to send
				String[] adminList = adminEmails.split(";");
				for(String s : adminList)
					{
					Variables.geteMSender().send(s,
							subject,
							content,
							eMailDesc);
					}
				}
			else
				{
				//There is only one email to send
				Variables.geteMSender().send(adminEmails,
						subject,
						content,
						eMailDesc);
				}
			
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("emailsentsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("",e);
			Variables.getLogger().error("Failed to send emails to the admin list : "+e.getMessage());
			}
		}
	
	
	/**
	 * Method used to convert a string containing a gateway type into
	 * a gwType object
	 */
	public static gwType convertGatewayType(String type)
		{
		if(type.equals("vg"))
			{
			return gwType.vg;
			}
		else
			{
			return gwType.isr;
			}
		}
	
	
	/**
	 * Method used to find the file name from a file path
	 * For intance :
	 * C:\JAVAELILEX\YUZA\Maquette_CNAF_TA_FichierCollecteDonneesTelephonie_v1.7_mac.xls
	 * gives :
	 * Maquette_CNAF_TA_FichierCollecteDonneesTelephonie_v1.7_mac.xls
	 */
	public static String extractFileName(String fullFilePath)
		{
		String[] tab =  fullFilePath.split("\\\\");
		return tab[tab.length-1];
		}
	
	/***
	 * Method used to get the AXL version from the CUCM
	 * We contact the CUCM using a very basic request and therefore get the version
	 * @throws Exception 
	 */
	public static cucmAXLVersion getAXLVersionFromTheCUCM() throws Exception
		{
		/**
		 * In this method version we just read the version from the configuration file
		 * This has to be improved to match the method description
		 **/
		cucmAXLVersion AXLVersion;
		
		AXLVersion = UsefulMethod.convertStringToCUCMAXLVersion("version"+getTargetOption("axlversion"));
		
		return AXLVersion;
		}
	
	/**
	 * Used to init the substitute list
	 * @throws Exception 
	 */
	public static ArrayList<ValueMatcher> initSubstituteList(ArrayList<String[][]> list) throws Exception
		{
		ArrayList<ValueMatcher> substituteList = new ArrayList<ValueMatcher>();
		
		for(String[][] tabS : list)
			{
			substituteList.add(new ValueMatcher(
					UsefulMethod.getItemByName("match", tabS),
					UsefulMethod.getItemByName("replaceby", tabS),
					UsefulMethod.convertStringToSubstituteType(UsefulMethod.getItemByName("type", tabS))));
			}
		
		return substituteList;
		}
	
	/**
	 * Used to init the userCreationProfile list
	 * @throws Exception 
	 */
	public static ArrayList<UserCreationProfile> initUserCreationprofileList() throws Exception
		{
		ArrayList<UserCreationProfile> ucpList = new ArrayList<UserCreationProfile>();
		
		ArrayList<String> listParams = new ArrayList<String>();
		listParams.add("profiles");
		listParams.add("profile");
		
		ArrayList<ArrayList<String[][]>> extList = xMLGear.getResultListTabExt(UsefulMethod.getFlatFileContent(Variables.getUserCreationProfileFileName()), listParams);
		ArrayList<String[][]> sdList = xMLGear.getResultListTab(UsefulMethod.getFlatFileContent(Variables.getUserCreationProfileFileName()), listParams);
		
		for(int i=0; i<sdList.size(); i++)
			{
			String ProfileName = UsefulMethod.getItemByName("name", sdList.get(i));
			ArrayList<UserTemplate> utList = new ArrayList<UserTemplate>();
			
			for(int j=1; j<sdList.get(i).length; j++)
				{
				utList.add(new UserTemplate(itemType.valueOf(sdList.get(i)[j][0]),
						UsefulMethod.getItemByName("target", extList.get(i).get(j)),
						actionType.valueOf(UsefulMethod.getItemByName("action", extList.get(i).get(j)))
						));
				}
			ucpList.add(new UserCreationProfile(ProfileName, utList));
			}
		
		return ucpList;
		}
	
	/**
	 * Used to convert a String into SubstituteType
	 * @throws Exception 
	 */
	public static SubstituteType convertStringToSubstituteType(String type) throws Exception
		{
		if(type.equals("phone"))
			{
			return SubstituteType.phone;
			}
		else if(type.equals("pbt"))
			{
			return SubstituteType.pbt;
			}
		else if(type.equals("css"))
			{
			return SubstituteType.css;
			}
		else if(type.equals("profile"))
			{
			return SubstituteType.profile;
			}
		else if(type.equals("misc"))
			{
			return SubstituteType.misc;
			}
		else
			{
			throw new Exception("Substitute type not found");
			}
		}
	
	/*******
	 * Used to initialize a number list by asking the CUCM
	 */
	public static ArrayList<String> initNumberList(String range) throws Exception
		{
		try
			{
			ArrayList<String> myUsedNumberList = new ArrayList<String>();
			ArrayList<String> myAvailableNumberList = new ArrayList<String>();
			
			String[] tab = range.split(":");
			String firstNumber = tab[0];
			String lastNumber = tab[1];
			
			int currentNum = Integer.parseInt(firstNumber);
			int lastNum = Integer.parseInt(lastNumber);
			
			//List<Object> SQLResp = SimpleRequest.doSQLQuery("select dnorpattern from numplan where tkpatternusage='2' and dnorpattern between '"+firstNumber+"' and '"+lastNumber+"'");
			List<Object> SQLResp = SimpleRequest.doSQLQuery("select dnorpattern from numplan where dnorpattern between '"+firstNumber+"' and '"+lastNumber+"'");
			
			for(Object o : SQLResp)
				{
				Element rowElement = (Element) o;
				NodeList list = rowElement.getChildNodes();
				
				for(int i = 0; i< list.getLength(); i++)
					{
					if(list.item(i).getNodeName().equals("dnorpattern"))myUsedNumberList.add(list.item(i).getTextContent());
					}
				}
			
			while(currentNum < lastNum)
				{
				if(!(myUsedNumberList.contains(Integer.toString(currentNum))))
					{
					myAvailableNumberList.add(Integer.toString(currentNum));
					}
				currentNum++;
				}
			
			Variables.getLogger().debug("Available number list initialized");
			
			return myAvailableNumberList;
			}
		catch(Exception e)
			{
			throw new Exception("Error while trying to initialize the internal number list"+e.getMessage());
			}
		}
	
	/*********
	 * Used to ask the user the office to use
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static Office askCurrentOffice() throws NumberFormatException, Exception
		{
		OfficeSelectionWindow OSW = new OfficeSelectionWindow(Variables.getOfficeList());
		Office selectedOffice = OSW.getSelectedOffice();
		OSW.dispose();
		
		Variables.getLogger().info("Selected office : "+selectedOffice.getName()+" - "+selectedOffice.getFullname());
		
		return selectedOffice;
		}
	
	/*********
	 * Used to ask the user the offices to use (multiple)
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static ArrayList<Office> askCurrentOffices() throws NumberFormatException, Exception
		{
		OfficeSelectionWindow OSW = new OfficeSelectionWindow(Variables.getOfficeList());//Temp
		ArrayList<Office> selectedOffices = new ArrayList<Office>(); 
		selectedOffices.add(OSW.getSelectedOffice());
		OSW.dispose();
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Selected offices : ");
		for(Office o : selectedOffices)
			{
			sb.append(o.getName()+" - "+o.getFullname());
			}
		Variables.getLogger().debug(sb.toString());
		return selectedOffices;
		}
	
	/*****
	 * Method used to find the substitute corresponding to 
	 * the provided value
	 * @throws Exception 
	 */
	public static String findSubstitute(String s, SubstituteType type) throws Exception
		{
		for(ValueMatcher vm : Variables.getSubstituteList())
			{
			if(vm.getType().equals(type))
				{
				if(vm.getCollectionName().equals(s))
					{
					return vm.getConvertName();
					}
				}
			}
		
		Variables.getLogger().debug("No substitute of type \""+type.name()+"\" have been found for the string : "+s);
		return s;
		}
	
	/**
	 * Methos used to check if a value is null or empty
	 */
	public static boolean isNotEmpty(String s)
		{
		if((s == null) || (s.equals("")))
			{
			return false;
			}
		else
			{
			return true;
			}
		}
	
	/**
	 * Methos used to check if a value is null or empty
	 */
	public static boolean isNotEmpty(ArrayList<String> as)
		{
		if((as == null) || (as.size() == 0))
			{
			return false;
			}
		else
			{
			return true;
			}
		}
	
	/**
	 * @throws Exception 
	 * Method used to convert a value into line group algorithm
	 * @throws  
	 */
	public static String convertIntoLGAlgorithm(String s) throws Exception
		{
		for(String lga : Variables.getLGAlgorithm())
			{
			if(s.equals(lga.substring(0, 1)))return lga;
			}
		
		Variables.getLogger().debug("Default Line Group Algoritm returned for the following string : "+s);
		return UsefulMethod.getTargetOption("lgdefaultalgorithm");
		}
	
	/******
	 * Used to convert itemType values into more verbose ones
	 */
	public static String convertItemTypeToVerbose(itemType type)
		{
		switch(type)
			{
			case location:return "Location";
			case region:return "Region";
			case srstreference:return "SRST Reference";
			case devicepool:return "Device Pool";
			case commondeviceconfig:return "Common Device Configuration";
			case conferencebridge:return "Conference Bridge";
			case mediaresourcegroup:return "Media Resource Group";
			case mediaresourcegrouplist:return "Media Resource Group List";
			case partition:return "Partition";
			case callingsearchspace:return "Calling Search Space";
			case trunksip:return "SIP Trunk";
			case vg:return "Voice Gateway";
			case routegroup:return "Route Group";
			case translationpattern:return "Translation Pattern";
			case physicallocation:return "Physical Location";
			case devicemobilityinfo:return "Device Mobility Info";
			case devicemobilitygroup:return "Device Mobility group";
			case datetimesetting:return "Date Time Settings";
			case callmanagergroup:return "Call Manager group";
			case phone:return "Phone";
			case udp:return "User device profile";
			case user:return "End User";
			case line:return "Line";
			case voicemail:return "Voicemail";
			case telecasterservice:return "Phone Service";
			case siptrunksecurityprofile:return "Sip Trunk Security Profile";
			case sipprofile:return "SIP profile";
			case phonetemplatename:return "Phone Button Template";
			case linegroup:return "Line Group";
			case huntlist:return "Hunt List";
			case huntpilot:return "Hunt Pilot";
			case callpickupgroup:return "Call Pickup Group";
			case udplogin:return "UDP Login";
			case aargroup:return "AAR Group";
			case usercontrolgroup:return "Access Control Group";
			case analog:return "Analog Port";
			default:return type.name();
			}
		}
	
	/*******
	 * Method used to initialize the current office
	 * @throws Exception 
	 * @throws NumberFormatException 
	 ****/
	public static void initCurrentOffice() throws NumberFormatException, Exception
		{
		if(Variables.getCurrentOffice() == null)
			{
			Variables.getLogger().debug("Initialisation of currentOffice");
			//We have to ask the user what is the current office
			Variables.setCurrentOffice(UsefulMethod.askCurrentOffice());
			}
		else
			{
			Variables.getLogger().debug("We don't need to initialize the current office again, it is already done. current office is : "+Variables.getCurrentOffice().getName());
			}
		}
	
	
	/*2017*//*RATEL Alexandre 8)*/
	}

