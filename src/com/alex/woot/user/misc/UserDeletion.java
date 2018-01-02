package com.alex.woot.user.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.alex.woot.gui.ProgressUpdater;
import com.alex.woot.gui.StatusWindow;
import com.alex.woot.gui.WaitingWindow;
import com.alex.woot.misc.CollectionFileChecker;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.Task;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.user.items.DeviceProfile;
import com.alex.woot.user.items.Phone;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to create the user injection process
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserDeletion extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<MainItem> itemToDeleteList;
	
	/****
	 * Constructor
	 */
	public UserDeletion()
		{
		itemToDeleteList = new ArrayList<MainItem>();
		
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
		WaitingWindow myWW = new WaitingWindow(LanguageManagement.getString("pleasewait"));
		/**************/
		
		try
			{
			/***************
			 * Init
			 */
			//Collection file checking
			CollectionFileChecker.checkForUserCreation();//Has to be improved
			
			myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding"));
			
			//We build the list of users and their phones which is a list of main items
			itemToDeleteList = UserTools.setUserList(actionType.delete, myWW);
			
			//Temp
			/*
			Variables.getLogger().debug("We display here the content of the deletion list : ");
			
			for(MainItem mi : itemToDeleteList)
				{
				Variables.getLogger().debug("Item : "+mi.getDescription());
				for(ItemToInject iti : mi.getAssociatedItems())
					{
					Variables.getLogger().debug("Name : "+iti.getName()+" type : "+iti.getType().name()+" action : "+iti.getAction().name());
					if(iti.getType().equals(itemType.udp))
						{
						Variables.getLogger().debug("Services count : "+((DeviceProfile)iti).getServiceList().size());
						Variables.getLogger().debug("Sd count : "+((DeviceProfile)iti).getSdList().size());
						}
					else if(iti.getType().equals(itemType.phone))
						{
						Variables.getLogger().debug("Services count : "+((Phone)iti).getServiceList().size());
						Variables.getLogger().debug("Sd count : "+((Phone)iti).getSdList().size());
						}
					}
				}*/
			//Temp
			
			/**
			 * End Init 
			 ***************/
			
			/********************
			 * Injection
			 */
			myWW.getAvancement().setText(" "+LanguageManagement.getString("taskbuilding"));
			Task myTask = UserTools.prepareUserProcess(itemToDeleteList, actionType.delete);		
			myTask.startBuildProcess();
			myTask.start();
			
			Variables.getLogger().info("User deletion starts");
			
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

