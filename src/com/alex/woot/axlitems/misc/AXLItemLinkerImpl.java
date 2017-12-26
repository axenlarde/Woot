package com.alex.woot.axlitems.misc;

import java.util.ArrayList;

import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;


/**********************************
 * Interface of an AXLItem
 * 
 * @author RATEL Alexandre
 **********************************/
public interface AXLItemLinkerImpl
	{
	/**
	 * Injection
	 */
	public String inject() throws Exception; //Return the UUID of the injected item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public String doInjectVersion85() throws Exception;
	public String doInjectVersion105() throws Exception;
	/**************/
	
	/***********
	 * Deletion
	 */
	public void delete() throws Exception; //Delete the item in the CUCM
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public void doDeleteVersion85() throws Exception;
	public void doDeleteVersion105() throws Exception;
	/***************/
	
	/***********
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> init() throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception;
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception;
	/***************/
	
	/***********
	 * Update
	 */
	public void update(ArrayList<ToUpdate> tulist) throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public void doUpdateVersion85(ArrayList<ToUpdate> tulist) throws Exception;
	public void doUpdateVersion105(ArrayList<ToUpdate> tulist) throws Exception;
	/***************/
	
	/***********
	 * Get
	 */
	public ItemToInject get() throws Exception; //Initialize the item
	
	//Used in addition of the previous one to force the developer to implement a method dedicated to the good version
	public ItemToInject doGetVersion85() throws Exception;
	public ItemToInject doGetVersion105() throws Exception;
	/***************/
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

