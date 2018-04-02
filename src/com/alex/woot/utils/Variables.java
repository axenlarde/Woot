package com.alex.woot.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alex.woot.gui.MainWindow;
import com.alex.woot.misc.Correction;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.Office;
import com.alex.woot.misc.ValueMatcher;
import com.alex.woot.misc.storedUUID;
import com.alex.woot.office.misc.OfficeTemplate;
import com.alex.woot.office.misc.TemplateOfficeReader;
import com.alex.woot.user.misc.TemplateUserReader;
import com.alex.woot.user.misc.UserCreationProfile;
import com.alex.woot.utils.UsefulMethod;


/**********************************
 * Used to store static variables
 * 
 * @author RATEL Alexandre
 **********************************/
public class Variables
	{
	/**
	 * Variables
	 */
	//Enum
	/***
	 * itemType :
	 * Is used to give a type to the request ready to be injected
	 * This way we can manage or sort them more easily
	 * 
	 * The order is important here, indeed, it will define later
	 * how the items are injected
	 */
	public enum itemType
		{
		location,
		region,
		srstreference,
		devicepool,
		commondeviceconfig,
		commonPhoneConfig,
		securityProfile,
		conferencebridge,
		mediaresourcegroup,
		mediaresourcegrouplist,
		partition,
		callingsearchspace,
		trunksip,
		vg,
		routegroup,
		translationpattern,
		physicallocation,
		devicemobilityinfo,
		devicemobilitygroup,
		datetimesetting,
		callmanagergroup,
		phone,
		udp,
		user,
		line,
		voicemail,
		telecasterservice,
		siptrunksecurityprofile,
		sipprofile,
		phonetemplatename,
		linegroup,
		huntlist,
		huntpilot,
		callpickupgroup,
		udplogin,
		aargroup,
		usercontrolgroup,
		analog,
		gateway,
		sqlRequest,
		associateanalog,
		userlocal,
		unknown
		};
	
	/********************************************
	 * statusType :
	 * Is used to set the status of a request as followed :
	 * - init : the request has to be built
	 * - waiting : The request is ready to be injected. We gonna reach this status after the request has been built or has been deleted
	 * - processing : The injection or the deletion of the request is currently under progress
	 * - disabled : The request has not to be injected
	 * - injected : The request has been injected with success
	 * - error : Something went wrong and an exception has been thrown
	 ***************************************/
	public enum statusType
		{
		injected,
		error,
		processing,
		waiting,
		disabled,
		init,
		deleted,
		updated
		};
		
	/********************************************
	 * cucmAXLVersion :
	 * Is used to set the cucm AXL version used for the injection
	 ***************************************/
	public enum cucmAXLVersion
		{
		version80,
		version85,
		version90,
		version91,
		version100,
		version105,
		version110,
		version115
		};
	
	/********************************************
	 * actionType :
	 * Is used to set the type of action is going to do a 
	 ***************************************/
	public enum actionType
		{
		inject,
		delete,
		update
		};
	
	/********************************************
	 * actionType :
	 * Is used to set the type of action is going to do a 
	 ***************************************/
	public enum provisioningType
		{
		user,
		office
		};
	
	/********************************************
	 * SDType :
	 * Is used to set the type of the Speed dial :
	 * - simple SD
	 * - BLF
	 ***************************************/
	public enum sdType
		{
		sd,
		blf,
		};
		
	/********************************************
	 * dataSource :
	 * Is used to know what is the current data source to use
	 ***************************************/
	public enum DataSource
		{
		databaseFile,
		xmlFile,
		};
		
	/********************************************
	 * substituteType :
	 * Is used to know what is the current data source to use
	 ***************************************/
	public enum SubstituteType
		{
		phone,
		pbt,
		css,
		profile,
		misc
		};
		
	/********************************************
	 * gwType :
	 * Type of gateway
	 ***************************************/
	public enum gwType
		{
		isr,
		vg
		};
	
	/********************************************
	 * Protocol :
	 * Device protocol
	 ***************************************/
	public enum Protocol
		{
		sccp,
		sip,
		mgcp
		};
	
	/********************************************
	 * userSource :
	 * CUCM Corporate directory user source
	 ***************************************/
	public enum UserSource
		{
		external,//LDAP for instance
		internal//CUCM Internal user
		};
		
	/********************************************
	 * sqlRequestType :
	 * Query or update
	 ***************************************/
	public enum sqlRequestType
		{
		update,//LDAP for instance
		query//CUCM Internal user
		};
		
	//Misc
	private static String softwareName;
	private static String softwareVersion;
	private static cucmAXLVersion CUCMVersion;
	private static Logger logger;
	private static Workbook myWorkbook;
	private static ArrayList<String> country;
	private static ArrayList<String[][]> tabConfig;
	private static ArrayList<String[][]> userConfig;
	private static ArrayList<Office> OfficeList;
	private static eMailSender eMSender;
	private static String mainConfigFileDirectory;
	private static String databasePath;
	private static String databaseFileName;
	private static String configFileName;
	private static String userConfigFileName;
	private static String customerConfigFileName;
	private static String matcherFileName;
	private static String ccmTemplateFileName;
	private static String userTemplateFileName;
	private static String officeListFileName;
	private static String substitutesFileName;
	private static String userCreationProfileFileName;
	private static String collectionFileName;
	private static ArrayList<String> matcherList;
	private static ArrayList<ValueMatcher> substituteList;
	private static ArrayList<storedUUID> uuidList;
	private static MainWindow mainWindow;
	private static boolean CUCMReachable;
	private static DataSource dataSource;
	private static boolean pause;
	private static UserSource userSource;
	private static ArrayList<itemType> allowedItemsToProcess;
	private static ArrayList<UserCreationProfile> userCreationProfileList;
	private static ArrayList<String> internalNumberList;
	private static ArrayList<String> cpgNumberList;
	private static ArrayList<String> lgNumberList;
	private static Office currentOffice;
	private static ArrayList<String> LGAlgorithm;
	private static JFrame myWindow;
	
	//Templates
	private static ArrayList<ItemToInject> userTemplateList;//User
	private static ArrayList<OfficeTemplate> officeTemplateList;//List
	
	//Langage management
	public enum language{english,french};
	private static String languageFileName;
	private static ArrayList<ArrayList<String[][]>> languageContentList;
	
	//AXL
    private static boolean ldapSyncStatus;
    private static com.cisco.axlapiservice8.AXLPort AXLConnectionToCUCM85;//Connection to CUCM version 85
    private static com.cisco.axlapiservice10.AXLPort AXLConnectionToCUCMV105;//Connection to CUCM version 105
		
    /**************
     * Constructor
     **************/
	public Variables()
		{
		CUCMReachable = true;
		//userlocal = UsefulMethod.initUserLocalList();
		country = UsefulMethod.initCountryList();
		uuidList = new ArrayList<storedUUID>();
		databaseFileName = "database.dat";
		configFileName = "configFile.xml";
		userConfigFileName = "userPreference.xml";
		customerConfigFileName = "prefUser.xml";
		matcherFileName = "matchers.xml";
		ccmTemplateFileName = "templateCCM.xml";
		userTemplateFileName = "templateUser.xml";
		officeListFileName = "officeList.xml";
		languageFileName = "languages.xml";
		substitutesFileName = "substitutes.xml";
		userCreationProfileFileName = "userCreationProfiles.xml";
		allowedItemsToProcess = new ArrayList<itemType>();
		LGAlgorithm = new ArrayList<String>();
		LGAlgorithm.add("Top Down");
		LGAlgorithm.add("Circular");
		LGAlgorithm.add("Longest Idle Time");
		LGAlgorithm.add("Broadcast");
		}

	public static String getSoftwareName()
		{
		return softwareName;
		}

	public static void setSoftwareName(String softwareName)
		{
		Variables.softwareName = softwareName;
		}

	public static String getSoftwareVersion()
		{
		return softwareVersion;
		}

	public static void setSoftwareVersion(String softwareVersion)
		{
		Variables.softwareVersion = softwareVersion;
		}

	public static cucmAXLVersion getCUCMVersion()
		{
		if(CUCMVersion == null)
			{
			//It has to be initiated
			try
				{
				CUCMVersion = UsefulMethod.convertStringToCUCMAXLVersion(UsefulMethod.getTargetOption("axlversion"));
				Variables.getLogger().info("CUCM version : "+Variables.getCUCMVersion());
				}
			catch(Exception e)
				{
				getLogger().debug("The AXL version couldn't be parsed. We will use the default version", e);
				CUCMVersion = cucmAXLVersion.version85;
				}
			}
		
		return CUCMVersion;
		}

	public static void setCUCMVersion(cucmAXLVersion cUCMVersion)
		{
		CUCMVersion = cUCMVersion;
		}

	public static Logger getLogger()
		{
		return logger;
		}

	public static void setLogger(Logger logger)
		{
		Variables.logger = logger;
		}
/*
	public static ArrayList<String> getUserlocal()
		{
		return userlocal;
		}

	public static void setUserlocal(ArrayList<String> userlocal)
		{
		Variables.userlocal = userlocal;
		}
*/
	public static ArrayList<String> getCountry()
		{
		return country;
		}

	public static void setCountry(ArrayList<String> country)
		{
		Variables.country = country;
		}

	public static ArrayList<String[][]> getTabConfig()
		{
		return tabConfig;
		}

	public static void setTabConfig(ArrayList<String[][]> tabConfig)
		{
		Variables.tabConfig = tabConfig;
		}

	public static ArrayList<Office> getOfficeList() throws Exception
		{
		if(OfficeList == null)
			{
			Variables.getLogger().debug("Initialisation of OfficeList");
			Variables.setOfficeList(UsefulMethod.readOfficeFile(Variables.getOfficeListFileName()));
			}
		
		return OfficeList;
		}

	public static void setOfficeList(ArrayList<Office> officeList)
		{
		OfficeList = officeList;
		}

	public static eMailSender geteMSender()
		{
		return eMSender;
		}

	public static void seteMSender(eMailSender eMSender)
		{
		Variables.eMSender = eMSender;
		}

	public static String getMainConfigFileDirectory() throws Exception
		{
		if(mainConfigFileDirectory == null)
			{
			Variables.getLogger().debug("Initialisation of mainConfigFileDirectory");
			
			try
				{
				Variables.setMainConfigFileDirectory(UsefulMethod.getTargetOption("basedirectory"));
				}
			catch(Exception e)
				{
				Variables.getLogger().debug("Failed to retrieve the main directory", e);
				/*
				mainConfigFileDirectory = UsefulMethod.getDirectoryPath(".",
						LanguageManagement.getString("invitMainDirectoryPhrase"),
						LanguageManagement.getString("selectButton"));*/
				}
			}
		
		return mainConfigFileDirectory;
		}

	public static void setMainConfigFileDirectory(String mainConfigFileDirectory)
		{
		Variables.mainConfigFileDirectory = mainConfigFileDirectory;
		}

	public static String getConfigFileName()
		{
		return configFileName;
		}

	public static void setConfigFileName(String configFileName)
		{
		Variables.configFileName = configFileName;
		}

	public static String getMatcherFileName()
		{
		return matcherFileName;
		}

	public static void setMatcherFileName(String matcherFileName)
		{
		Variables.matcherFileName = matcherFileName;
		}

	public static String getCcmTemplateFileName()
		{
		return ccmTemplateFileName;
		}

	public static void setCcmTemplateFileName(String ccmTemplateFileName)
		{
		Variables.ccmTemplateFileName = ccmTemplateFileName;
		}

	public static String getUserTemplateFileName()
		{
		return userTemplateFileName;
		}

	public static void setUserTemplateFileName(String userTemplateFileName)
		{
		Variables.userTemplateFileName = userTemplateFileName;
		}

	public static String getOfficeListFileName()
		{
		return officeListFileName;
		}

	public static void setOfficeListFileName(String officeListFileName)
		{
		Variables.officeListFileName = officeListFileName;
		}

	public static String getLanguageFileName()
		{
		return languageFileName;
		}

	public static void setLanguageFileName(String languageFileName)
		{
		Variables.languageFileName = languageFileName;
		}

	public static ArrayList<String> getMatcherList() throws Exception
		{
		if(matcherList == null)
			{
			Variables.getLogger().debug("Initialisation of matcherList");
			Variables.setMatcherList(UsefulMethod.readFile("matchers", Variables.getMatcherFileName()));
			}
		return matcherList;
		}

	public static void setMatcherList(ArrayList<String> matcherList)
		{
		Variables.matcherList = matcherList;
		}

	public static ArrayList<storedUUID> getUuidList()
		{
		return uuidList;
		}

	public static void setUuidList(ArrayList<storedUUID> uuidList)
		{
		Variables.uuidList = uuidList;
		}

	public static MainWindow getMainWindow()
		{
		return mainWindow;
		}

	public static void setMainWindow(MainWindow mainWindow)
		{
		Variables.mainWindow = mainWindow;
		}

	public static boolean isCUCMReachable()
		{
		return CUCMReachable;
		}

	public static void setCUCMReachable(boolean cUCMReachable)
		{
		CUCMReachable = cUCMReachable;
		}

	public static ArrayList<ArrayList<String[][]>> getLanguageContentList() throws Exception
		{
		if(languageContentList == null)
			{
			Variables.getLogger().debug("Initialisation of languageContentList");
			Variables.setLanguageContentList(UsefulMethod.readExtFile("language", Variables.getLanguageFileName()));
			}
		
		return languageContentList;
		}

	public static void setLanguageContentList(
			ArrayList<ArrayList<String[][]>> languageContentList)
		{
		Variables.languageContentList = languageContentList;
		}

	public static boolean isLdapSyncStatus()
		{
		return ldapSyncStatus;
		}

	public static void setLdapSyncStatus(boolean ldapSyncStatus)
		{
		Variables.ldapSyncStatus = ldapSyncStatus;
		}

	public static com.cisco.axlapiservice8.AXLPort getAXLConnectionToCUCM85() throws Exception
		{
		if(AXLConnectionToCUCM85 == null)
			{
			UsefulMethod.initAXLConnectionToCUCM();
			}
		return AXLConnectionToCUCM85;
		}

	public static void setAXLConnectionToCUCM85(
			com.cisco.axlapiservice8.AXLPort aXLConnectionToCUCM85)
		{
		AXLConnectionToCUCM85 = aXLConnectionToCUCM85;
		}

	public static com.cisco.axlapiservice10.AXLPort getAXLConnectionToCUCMV105() throws Exception
		{
		if(AXLConnectionToCUCMV105 == null)
			{
			UsefulMethod.initAXLConnectionToCUCM();
			}
		return AXLConnectionToCUCMV105;
		}

	public static void setAXLConnectionToCUCMV105(
			com.cisco.axlapiservice10.AXLPort aXLConnectionToCUCMV105)
		{
		AXLConnectionToCUCMV105 = aXLConnectionToCUCMV105;
		}

	public static String getDatabasePath() throws Exception
		{
		if(databasePath == null)
			{
			Variables.getLogger().debug("Initialisation of databasePath");
			
			ArrayList<String> allowedExtensionList = new ArrayList<String>();
			allowedExtensionList.add("dat");
			
			databasePath = UsefulMethod.getFilePath(allowedExtensionList,
					LanguageManagement.getString("databasefilefetch"),
					LanguageManagement.getString("selectButton"));
			}
		
		return databasePath;
		}

	public static void setDatabasePath(String databasePath)
		{
		Variables.databasePath = databasePath;
		}

	public static String getDatabaseFileName()
		{
		return databaseFileName;
		}

	public static void setDatabaseFileName(String databaseFileName)
		{
		Variables.databaseFileName = databaseFileName;
		}

	public static DataSource getDataSource()
		{
		if(dataSource == null)
			{
			Variables.getLogger().debug("Initialisation of dataSource");
			//We have to ask the user through a dedicated window
			//Has to be written
			dataSource = DataSource.xmlFile;
			}
		
		return dataSource;
		}

	public static void setDataSource(DataSource dataSource)
		{
		Variables.dataSource = dataSource;
		}

	public static String getUserConfigFileName()
		{
		return userConfigFileName;
		}

	public static void setUserConfigFileName(String userConfigFileName)
		{
		Variables.userConfigFileName = userConfigFileName;
		}

	public static String getCustomerConfigFileName()
		{
		return customerConfigFileName;
		}

	public static void setCustomerConfigFileName(String customerConfigFileName)
		{
		Variables.customerConfigFileName = customerConfigFileName;
		}

	public static ArrayList<OfficeTemplate> getOfficeTemplateList() throws Exception
		{
		if(officeTemplateList == null)
			{
			Variables.getLogger().debug("Initialisation of officeTemplateList");
			Variables.setOfficeTemplateList(TemplateOfficeReader.readOfficeTemplate());
			}
		
		return officeTemplateList;
		}

	public static void setOfficeTemplateList(ArrayList<OfficeTemplate> officeTemplateList)
		{
		Variables.officeTemplateList = officeTemplateList;
		}

	public static String getSubstitutesFileName()
		{
		return substitutesFileName;
		}

	public static void setSubstitutesFileName(String substitutesFileName)
		{
		Variables.substitutesFileName = substitutesFileName;
		}

	public static ArrayList<ValueMatcher> getSubstituteList() throws Exception
		{
		if(substituteList == null)
			{
			Variables.getLogger().debug("Initialisation of substituteList");
			Variables.setSubstituteList(UsefulMethod.initSubstituteList(UsefulMethod.readFileTab("substitute", Variables.getSubstitutesFileName())));
			}
		
		return substituteList;
		}

	public static void setSubstituteList(ArrayList<ValueMatcher> substituteList)
		{
		Variables.substituteList = substituteList;
		}

	public static ArrayList<String[][]> getUserConfig()
		{
		return userConfig;
		}

	public static void setUserConfig(ArrayList<String[][]> userConfig)
		{
		Variables.userConfig = userConfig;
		}

	public static Workbook getMyWorkbook() throws Exception
		{
		if(myWorkbook == null)
			{
			Variables.getLogger().debug("Initialisation of myWorkbook");
			myWorkbook = WorkbookFactory.create(new FileInputStream(Variables.getCollectionFileName()));
			}
		
		return myWorkbook;
		}

	public static void setMyWorkbook(Workbook myWorkbook)
		{
		Variables.myWorkbook = myWorkbook;
		}

	public static ArrayList<ItemToInject> getUserTemplateList() throws Exception
		{
		if(userTemplateList == null)
			{
			Variables.getLogger().debug("Initialisation of userTemplateList");
			Variables.setUserTemplateList(TemplateUserReader.readUserTemplate());
			}
		
		return userTemplateList;
		}

	public static void setUserTemplateList(ArrayList<ItemToInject> userTemplateList)
		{
		Variables.userTemplateList = userTemplateList;
		}

	public static String getCollectionFileName() throws Exception
		{
		if(collectionFileName == null)
			{
			Variables.getLogger().debug("Initialisation of collectionFileName");
			
			ArrayList<String> allowedExtensionList = new ArrayList<String>();
			allowedExtensionList.add("xls");
			allowedExtensionList.add("xlsx");
			
			collectionFileName = UsefulMethod.getFilePath(
					allowedExtensionList,
					LanguageManagement.getString("collectionfilefetch"),
					LanguageManagement.getString("selectButton"));
			}
		
		return collectionFileName;
		}

	public static void setCollectionFileName(String collectionFileName)
		{
		Variables.collectionFileName = collectionFileName;
		}

	public static boolean isPause()
		{
		return pause;
		}

	public static void setPause(boolean pause)
		{
		Variables.pause = pause;
		}

	public static UserSource getUserSource()
		{
		if(userSource == null)
			{
			//Here we should ask the CUCM what is the current user source
			//Will come in a future release
			userSource = userSource.external;//Temp
			}
		return userSource;
		}

	public static void setUserSource(UserSource userSource)
		{
		Variables.userSource = userSource;
		}

	public static ArrayList<itemType> getAllowedItemsToProcess()
		{
		return allowedItemsToProcess;
		}

	public static void setAllowedItemsToProcess(
			ArrayList<itemType> allowedItemsToProcess)
		{
		Variables.allowedItemsToProcess = allowedItemsToProcess;
		}

	public static String getUserCreationProfileFileName()
		{
		return userCreationProfileFileName;
		}

	public static void setUserCreationProfileFileName(
			String userCreationProfileFileName)
		{
		Variables.userCreationProfileFileName = userCreationProfileFileName;
		}

	public static ArrayList<UserCreationProfile> getUserCreationProfileList() throws Exception
		{
		if(userCreationProfileList == null)
			{
			Variables.getLogger().debug("Initialisation of userCreationProfileList");
			Variables.setUserCreationProfileList(UsefulMethod.initUserCreationprofileList());
			}
		
		return userCreationProfileList;
		}

	public static void setUserCreationProfileList(
			ArrayList<UserCreationProfile> userCreationProfileList)
		{
		Variables.userCreationProfileList = userCreationProfileList;
		}

	public static ArrayList<String> getInternalNumberList() throws Exception
		{
		if(internalNumberList == null)
			{
			Variables.getLogger().debug("Initialisation of internalNumberList");
			Variables.setInternalNumberList(UsefulMethod.initNumberList(UsefulMethod.getTargetOption("nodidrange")));
			}
		return internalNumberList;
		}

	public static void setInternalNumberList(ArrayList<String> internalNumberList)
		{
		Variables.internalNumberList = internalNumberList;
		}

	
	public static Office getCurrentOffice() throws NumberFormatException, Exception
		{
		return currentOffice;
		}

	public static void setCurrentOffice(Office currentOffice)
		{
		Variables.currentOffice = currentOffice;
		}

	public static ArrayList<String> getCpgNumberList() throws Exception
		{
		if(cpgNumberList == null)
			{
			Variables.getLogger().debug("Initialisation of cpgNumberList");
			Variables.setCpgNumberList(UsefulMethod.initNumberList(UsefulMethod.getTargetOption("cpgrange")));
			}
		
		return cpgNumberList;
		}

	public static void setCpgNumberList(ArrayList<String> cpgNumberList)
		{
		Variables.cpgNumberList = cpgNumberList;
		}

	public static ArrayList<String> getLgNumberList() throws Exception
		{
		if(lgNumberList == null)
			{
			Variables.getLogger().debug("Initialisation of LgNumberList");
			Variables.setLgNumberList(UsefulMethod.initNumberList(UsefulMethod.getTargetOption("lgrange")));
			}
		
		return lgNumberList;
		}

	public static void setLgNumberList(ArrayList<String> lgNumberList)
		{
		Variables.lgNumberList = lgNumberList;
		}

	public static ArrayList<String> getLGAlgorithm()
		{
		return LGAlgorithm;
		}

	public static void setLGAlgorithm(ArrayList<String> lGAlgorithm)
		{
		LGAlgorithm = lGAlgorithm;
		}

	public static JFrame getMyWindow()
		{
		return myWindow;
		}

	public static void setMyWindow(JFrame myWindow)
		{
		Variables.myWindow = myWindow;
		}
	
	
	/*2017*//*RATEL Alexandre 8)*/
	}

