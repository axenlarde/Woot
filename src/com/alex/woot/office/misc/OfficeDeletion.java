package com.alex.woot.office.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.DIDRange;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.Task;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to delete a site
 * 
 * @author RATEL Alexandre
 **********************************/
public class OfficeDeletion extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private String siteName;
	private int siteType;
	private ArrayList<ItemToInject> CCMItemToDeleteList;
	private ArrayList<ItemToInject> CCMTemplateList;
	private boolean siteInjected;
	private String collectionFileName;
	
	/****
	 * Constructor
	 */
	public OfficeDeletion(String collectionFileName, Workbook myWorkbook, String siteName, int siteType)
		{
		this.myWorkbook = myWorkbook;
		this.siteName = siteName;
		this.siteType = siteType;
		CCMItemToDeleteList = new ArrayList<ItemToInject>();
		CCMTemplateList = new ArrayList<ItemToInject>();
		siteInjected = false;
		this.collectionFileName = collectionFileName;
		
		start();
		}
	
	/******
	 * Global Method used to delete the site
	 */
	public void run()
		{
		/*******
		 * Splash window
		 * Used to make the user waiting
		 */
		WaitingWindow mySplashWindow = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			Object[] options = { LanguageManagement.getString("yes"), LanguageManagement.getString("no")};
			int answer = 1;
			
			/***************
			 * Init
			 */
			//We check the collection file content
			CollectionFileChecker.checkForSiteCreation(myWorkbook);
			
			//templateCCM file reading
			CCMTemplateList = TemplateOfficeReader.readCCMTemplate(myWorkbook, siteType);
			
			//We fill the CCMItemToInjectList
			CCMItemToDeleteList = OfficeTools.builCCMList(CCMTemplateList, myWorkbook);
			
			/**********************
			 * Initialization of the AXL connection
			 */
			UsefulMethod.initAXL();
			/*********************/
			
			/********************
			 * We check here if the site is already injected
			 * 
			 * To do so :
			 * We are going to check if the device pool already exists in the CUCM
			 */
			siteInjected = OfficeTools.isSiteExisting(CCMItemToDeleteList);
			/*********************/
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			if(siteInjected)
				{
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("deletionquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				}
			else
				{
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("sitealreadydeleted"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				}
			
			if(answer == 0)//Deletion asked
				{
				Task myTask = OfficeTools.prepareSiteDeletion(CCMItemToDeleteList);
				
				Variables.getLogger().info("Site deletion starts");
				myTask.proceed();//Injection;
				Variables.getLogger().info("Site deletion ended with success");
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("sitedeletionsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
				
				//We try to send an email
				if(UsefulMethod.getTargetOption("smtpemailsendsite").equals("true"))
					{
					answer = 1;
					answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("checkresultemailquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					
					if(answer == 0)//Email asked
						{
						UsefulMethod.sendEmailToTheAdminList("",
								siteName,
								LanguageManagement.getString("emailreportcontentsitedeletion")+siteName+
								" : "+collectionFileName);
						}
					}
				}
			/*********************/
			}
		catch (Exception e)
			{
			Variables.getLogger().error("",e);
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("injectionerror")+" "+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		
		mySplashWindow.close();
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

