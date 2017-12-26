package com.alex.woot.sdblf.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionFileChecker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.Task;
import com.alex.yuza.ui.SiteManagementWindow;
import com.alex.yuza.ui.WaitingWindow;
import com.alex.yuza.user.misc.TemplateUserReader;
import com.alex.yuza.user.misc.UserTools;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;

/**********************************
 * Class used to inject SD and BLF
 * 
 * @author RATEL Alexandre
 **********************************/
public class SdCreation extends Thread
	{
	/**
	 * Variables
	 */
	private Workbook myWorkbook;
	private SiteManagementWindow mySite;
	private ArrayList<ItemToInject> sdItemToInjectList;
	private ArrayList<ItemToInject> userTemplateList;
	
	/****
	 * Constructor
	 */
	public SdCreation(SiteManagementWindow mySite, Workbook myWorkbook)
		{
		this.myWorkbook = myWorkbook;
		this.mySite = mySite;
		sdItemToInjectList = new ArrayList<ItemToInject>();
		userTemplateList = new ArrayList<ItemToInject>();
		
		start();
		}
	
	/******
	 * Global Method used to inject the items
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
			//Collection file checking
			CollectionFileChecker.checkForUserCreation(myWorkbook);//Has to be improved
			
			//templateUser file reading
			userTemplateList = TemplateUserReader.readUserTemplate(myWorkbook);
			
			//We build the list of users
			sdItemToInjectList = SdTools.setSDList(myWorkbook, userTemplateList);
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			if(sdItemToInjectList.size() != 0)
				{
				answer = JOptionPane.showOptionDialog(null,LanguageManagement.getString("injectionquestion"),"",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				
				if(answer == 0)//Injection asked
					{
					Task myTask = SdTools.prepareSDInjection(sdItemToInjectList);		
					
					/**********************
					 * Initialization of the AXL connection
					 */
					UsefulMethod.initAXL();
					/*********************/
					
					Variables.getLogger().info("Speed dial injection starts");
					myTask.proceed();//Injection;
					Variables.getLogger().info("Speed dial injection ended with success");
					JOptionPane.showMessageDialog(null,LanguageManagement.getString("sdinjectionsuccess"),"",JOptionPane.INFORMATION_MESSAGE);
					}
				else
					{
					Variables.getLogger().debug("The user cancel the Speed Dial injection");
					}
				}
			else
				{
				Variables.getLogger().debug("There is neither Speed dial nor BLF to inject");
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("sdnothingtoinject"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			/*********************/
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error(e);
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("injectionerror")+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		
		mySplashWindow.close();
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

