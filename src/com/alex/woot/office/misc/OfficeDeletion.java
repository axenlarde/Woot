package com.alex.woot.office.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.alex.woot.gui.ProgressUpdater;
import com.alex.woot.gui.StatusWindow;
import com.alex.woot.gui.WaitingWindow;
import com.alex.woot.misc.CollectionFileChecker;
import com.alex.woot.misc.Office;
import com.alex.woot.misc.Task;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.user.misc.UserTools;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;



/**********************************
 * Class used to delete an office
 * 
 * @author RATEL Alexandre
 **********************************/
public class OfficeDeletion extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<MainItem> itemToDeleteList;
	
	/****
	 * Constructor
	 */
	public OfficeDeletion()
		{
		itemToDeleteList = new ArrayList<MainItem>();
		
		start();
		}
	
	/******
	 * Global Method used to inject the site
	 */
	public void run()
		{
		/*******
		 * Splash window
		 * Used to make the user wait
		 */
		WaitingWindow myWW = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			/***************
			 * Init
			 */
			myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding"));
			
			//We build the list of office items to delete
			for(Office o : Variables.getCurrentOffices())//Will trigger current offices selection window
				{
				//First we set the current office
				Variables.setCurrentOffice(o);
				//Here we add he items for each office
				itemToDeleteList.add(OfficeTools.setOfficeList(o, actionType.delete, myWW));
				}
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Deletion
			 */
			myWW.getAvancement().setText(" "+LanguageManagement.getString("taskbuilding"));
			Task myTask = OfficeTools.prepareOfficeProcess(itemToDeleteList, actionType.delete);
			myTask.startBuildProcess();
			myTask.start();
			
			Variables.getLogger().info("Office deletion starts");
			
			//We launch the user interface panel
			StatusWindow sw = new StatusWindow(itemToDeleteList, myTask);
			Variables.getMyWindow().getContentPane().removeAll();
			Variables.getMyWindow().getContentPane().add(sw);
			Variables.getMyWindow().repaint();
			Variables.getMyWindow().validate();
			
			//We launch the class in charge of monitoring and updating the gui
			new ProgressUpdater(sw, myTask);
			Variables.getLogger().debug("monitoring thread launched");
			/*********************/
			}
		catch (Exception e)
			{
			Variables.getLogger().error("ERROR : "+e.getMessage(),e);
			}

		myWW.close();
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

