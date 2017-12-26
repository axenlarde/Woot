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
 * Class used to create a site
 * 
 * @author RATEL Alexandre
 **********************************/
public class SiteCreation extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private String siteName;
	private int siteType;
	private String collectionFileName;
	private ArrayList<ItemToInject> CCMItemToInjectList;
	private ArrayList<ItemToInject> CCMTemplateList;
	private boolean siteInjected;
	
	/****
	 * Constructor
	 */
	public SiteCreation(String collectionFileName, Workbook myWorkbook, String siteName, int siteType)
		{
		this.myWorkbook = myWorkbook;
		this.siteName = siteName;
		this.siteType = siteType;
		this.collectionFileName = collectionFileName;
		CCMItemToInjectList = new ArrayList<ItemToInject>();
		CCMTemplateList = new ArrayList<ItemToInject>();
		siteInjected = false;
		
		start();
		}
	
	/******
	 * Global Method used to inject the site
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
			CCMTemplateList = TemplateCCMReader.readCCMTemplate(myWorkbook, siteType);
			
			//We fill the CCMItemToInjectList
			CCMItemToInjectList = SiteTools.builCCMList(CCMTemplateList, myWorkbook);
			
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
			siteInjected = SiteTools.isSiteExisting(CCMItemToInjectList);
			/*********************/
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			String siteDescription = siteName+" - "+UsefulMethod.extractFileName(collectionFileName);
			
			if(siteInjected)
				{
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("sitealreadyinjected"),siteDescription,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				}
			else
				{
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("injectionquestion"),siteDescription,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				}
			
			if(answer == 0)//Injection asked
				{
				Task myTask = SiteTools.prepareSiteInjection(CCMItemToInjectList);
				
				Variables.getLogger().info("Site injection starts");
				myTask.proceed();//Injection;
				Variables.getLogger().info("Site injection ended with success");
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("siteinjectionsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
				
				//We try to send an email
				if(UsefulMethod.getTargetOption("smtpemailsendsite").equals("true"))
					{
					answer = 1;
					answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("checkresultemailquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					
					if(answer == 0)//Email asked
						{
						UsefulMethod.sendEmailToTheAdminList("",
								siteName,
								LanguageManagement.getString("emailreportcontentsite")+siteDescription);
						}
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("injectionanswerno"),"",JOptionPane.INFORMATION_MESSAGE);
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

