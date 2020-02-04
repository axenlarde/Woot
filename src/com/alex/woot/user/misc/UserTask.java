package com.alex.woot.user.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import com.alex.woot.gui.ProgressUpdater;
import com.alex.woot.gui.StatusWindow;
import com.alex.woot.gui.WaitingWindow;
import com.alex.woot.misc.CollectionFileChecker;
import com.alex.woot.misc.Task;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;


/**********************************
 * Class used to create the user injection process
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserTask extends Thread
	{
	/**
	 * Variables
	 */
	private ArrayList<MainItem> itemToInjectList;
	private actionType action;
	private String pattern;
	private boolean quickTask;
	
	/****
	 * Constructor
	 */
	public UserTask(actionType action, boolean quickTask, String pattern)
		{
		this.action = action;
		this.quickTask = quickTask;
		this.pattern = pattern;
		itemToInjectList = new ArrayList<MainItem>();
		
		start();
		}
	
	public UserTask(actionType action)
		{
		this.action = action;
		itemToInjectList = new ArrayList<MainItem>();
		
		start();
		}
	
	/******
	 * Global Method used to inject the items
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
			//Collection file checking
			CollectionFileChecker.checkForUserCreation();
			
			myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding"));
			
			//We build the list of users and their phones which is a list of main items
			if(quickTask)
				{
				itemToInjectList = UserTools.setUserList(action, myWW, quickTask, pattern);
				}
			else
				{
				itemToInjectList = UserTools.setUserList(action, myWW);
				}
			
			//Temp
			/*
			Variables.getLogger().debug("We display here the content of the injection list : ");
			
			for(MainItem mi : itemToInjectList)
				{
				Variables.getLogger().debug("Item : "+mi.getDescription());
				for(ItemToInject iti : mi.getAssociatedItems())
					{
					Variables.getLogger().debug("Name : "+iti.getName()+" type : "+iti.getType().name()+" action : "+iti.getAction().name());
					if(iti.getType().equals(itemType.udp))
						{
						Variables.getLogger().debug("Services count : "+((DeviceProfile)iti).getServiceList().size());
						Variables.getLogger().debug("Sd count : "+((DeviceProfile)iti).getSdList().size());
						Variables.getLogger().debug("Error count : "+iti.getErrorList().size());
						}
					else if(iti.getType().equals(itemType.phone))
						{
						Variables.getLogger().debug("Services count : "+((Phone)iti).getServiceList().size());
						Variables.getLogger().debug("Sd count : "+((Phone)iti).getSdList().size());
						Variables.getLogger().debug("Error count : "+iti.getErrorList().size());
						}
					else if(iti.getType().equals(itemType.line))
						{
						Variables.getLogger().debug("Error count : "+iti.getErrorList().size());
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
			Task myTask = UserTools.prepareUserProcess(itemToInjectList, action);		
			myTask.startBuildProcess();
			myTask.start();
			
			Variables.getLogger().info("User task of type "+action.name()+" starts");
			
			//We launch the user interface panel
			StatusWindow sw = new StatusWindow(itemToInjectList, myTask);
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
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("usertaskerror")+" : "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			}

		myWW.close();
		}
	
	/*2017*//*RATEL Alexandre 8)*/
	}

