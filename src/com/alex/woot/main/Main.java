package com.alex.woot.main;


import java.util.ArrayList;
import org.apache.log4j.Level;

import com.alex.woot.gui.MainWindow;
import com.alex.woot.utils.InitLogging;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;


/**********************************
 * WOOT Main Class 10/10/2016
 * 
 * @author RATEL Alexandre
 **********************************/
public class Main
	{
	/***********
	 * Variables
	 */
	
	
	/***************
	 * Constructor
	 ***************/
	public Main()
		{
		//Set the software name
		Variables.setSoftwareName("WOOT");
		//Set the software version
		Variables.setSoftwareVersion("1.1");
		
		/****************
		 * Initialization of the logging
		 */
		Variables.setLogger(InitLogging.init(Variables.getSoftwareName()+"_LogFile.txt"));
		Variables.getLogger().info("\r\n");
		Variables.getLogger().info("#### Entering application");
		Variables.getLogger().info("## Welcome to : "+Variables.getSoftwareName()+" version "+Variables.getSoftwareVersion());
		Variables.getLogger().info("## Author : RATEL Alexandre : 2016");
		/*******/
		
		/******
		 * Initialization of the variables
		 */
		new Variables();
		/************/
		
		/**********
		 * We check if the java version is compatible
		 */
		UsefulMethod.checkJavaVersion();
		/***************/
		
		/**********************
		 * Reading of the configuration file
		 */
		try
			{
			//Config files reading
			Variables.setTabConfig(UsefulMethod.readMainConfigFile(Variables.getConfigFileName()));
			Variables.setUserConfig(UsefulMethod.readMainConfigFile(Variables.getUserConfigFileName()));
			}
		catch(Exception exc)
			{
			UsefulMethod.failedToInit(exc);
			}
		/********************/
		
		/*****************
		 * Setting of the inside variables from what we read in the configuration file
		 */
		try
			{
			UsefulMethod.initInternalVariables();
			}
		catch(Exception exc)
			{
			Variables.getLogger().error(exc.getMessage());
			Variables.getLogger().setLevel(Level.INFO);
			}
		/*********************/
		
		/****************
		 * Init email server
		 */
		try
			{
			UsefulMethod.initEMailServer();
			}
		catch (Exception e)
			{
			e.printStackTrace();
			Variables.getLogger().error("Failed to init the eMail server : "+e.getMessage());
			}
		/*************/
		
		/*******************
		 * Start main user interface
		 */
		try
			{
			Variables.getLogger().info("Launching Main Window");
			Variables.setMainWindow(new MainWindow());
			}
		catch (Exception exc)
			{
			UsefulMethod.failedToInit(exc);
			}
		/******************/
		
		//End of the main class
		}
	
	
	

	/****************************************/
	public static void main(String[] args)
		{
		new Main();
		}
	/*2015*//*RATEL Alexandre 8)*/

	
	}

