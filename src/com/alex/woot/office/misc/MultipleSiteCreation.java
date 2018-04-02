package com.alex.woot.office.misc;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.Site;
import com.alex.yuza.utils.EasyFileFilter;
import com.alex.yuza.utils.LanguageManagement;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.siteType;

/**********************************
 * Class aims to manage a multiple 
 * site injection process
 * 
 * @author RATEL Alexandre
 **********************************/
public class MultipleSiteCreation extends Thread
	{
	/**
	 * Variables
	 */
	private String sourceDirectory;
	private ArrayList<String> siteList;
	
	/***************
	 * Constructor
	 ***************/
	public MultipleSiteCreation()
		{
		super();
		start();
		}
	
	public void run()
		{
		try
			{
			/*********
			 * Get the sites list
			 */
			sourceDirectory = UsefulMethod.getCollectionFilesDirectory();
			siteList = UsefulMethod.getSiteList(sourceDirectory);
			/********/
			
			/****
			 * Sites injection
			 */
			sitesInjection();
			/*******/
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e.getMessage(),e);
			JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage(),LanguageManagement.getString("error"),JOptionPane.ERROR_MESSAGE);
			}
		}
	
	
	
	
	
	/**
	 * Used to inject a list of site
	 */
	private void sitesInjection()
		{
		if((siteList == null) || (siteList.size() == 0))
			{
			Variables.getLogger().info("No site found in the sites list");
			}
		else
			{
			Variables.getLogger().info(siteList.size()+" sites found in the sites list");
			
			for(String s : siteList)
				{
				siteInjection(s);
				System.gc();
				}
			}
		}
	
	/********
	 * Used to inject one site
	 */
	private void siteInjection(String siteFileName)
		{
		FileInputStream myStream = null;
		Workbook myWorkbook = null;
		
		try
			{
			Variables.getLogger().info("Processing site file : "+siteFileName);
			
			myStream = new FileInputStream(siteFileName);
			myWorkbook = WorkbookFactory.create(myStream);
			
			//We set the site type
			siteType currentType = UsefulMethod.convertStringToSiteType(CollectionTools.getValueFromCollectionFile("cnaf.siteType", myWorkbook));
			
			//We get the current site
			Site currentSite = CollectionTools.getCurrentSite(myWorkbook);
			
			/**
			 * We now launch a site injection site by site
			 */
			OfficeCreation mySiteCreation = null;
			
			if(Variables.isCUCMReachable())
				{
				//We launch the site creation
				mySiteCreation = new OfficeCreation(siteFileName,
						myWorkbook,
						currentSite.getName(),
						UsefulMethod.getCurrentSiteTypeNumber(currentSite.getType()));
				
				while(true)
					{
					if(mySiteCreation.getState().equals(Thread.State.TERMINATED))
						{
						break;
						}
					else
						{
						this.sleep(300);
						}
					}
				}
			else
				{
				JOptionPane.showMessageDialog(null,LanguageManagement.getString("cucmunreachableprohibition"),"",JOptionPane.INFORMATION_MESSAGE);
				}
			/******/
			}
		catch (Exception exc)
			{
			exc.printStackTrace();
			}
		finally
			{
			try
				{
				if(myStream != null)myStream.close();
				if(myWorkbook != null)myWorkbook.close();
				
				myWorkbook = null;
				myStream = null;
				}
			catch (IOException ioe)
				{
				ioe.printStackTrace();
				}
			}
		}
	
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

