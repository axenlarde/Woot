package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.utils.Variables;

/**********************************
 * Is the AXLItem design to link the item "Physical Location"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhysicalLocationLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	String description;
	
	public enum toUpdate implements ToUpdate
		{
		description
		}
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public PhysicalLocationLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removePhysicalLocation(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removePhysicalLocation(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddPhysicalLocationReq req = new com.cisco.axl.api._10.AddPhysicalLocationReq();
		com.cisco.axl.api._10.XPhysicalLocation params = new com.cisco.axl.api._10.XPhysicalLocation();
		
		/*********
		 * We set the item parameters
		 */
		params.setName(this.getName());
		params.setDescription(this.description);
		/************/
		
		req.setPhysicalLocation(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addPhysicalLocation(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddPhysicalLocationReq req = new com.cisco.axl.api._8.AddPhysicalLocationReq();
		com.cisco.axl.api._8.XPhysicalLocation params = new com.cisco.axl.api._8.XPhysicalLocation();
		
		/*********
		 * We set the item parameters
		 */
		params.setName(this.getName());
		params.setDescription(this.description);
		/************/
		
		req.setPhysicalLocation(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addPhysicalLocation(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdatePhysicalLocationReq req = new com.cisco.axl.api._10.UpdatePhysicalLocationReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		req.setDescription(this.description);
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updatePhysicalLocation(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdatePhysicalLocationReq req = new com.cisco.axl.api._8.UpdatePhysicalLocationReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		req.setDescription(this.description);
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updatePhysicalLocation(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetPhysicalLocationReq req = new com.cisco.axl.api._10.GetPhysicalLocationReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetPhysicalLocationRes resp = Variables.getAXLConnectionToCUCMV105().getPhysicalLocation(req);//We send the request to the CUCM
		
		PhysicalLocation myP = new PhysicalLocation(this.getName());
		myP.setUUID(resp.getReturn().getPhysicalLocation().getUuid());
		//Has to be completed
		
		return myP;//Return a Physical Location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetPhysicalLocationReq req = new com.cisco.axl.api._8.GetPhysicalLocationReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetPhysicalLocationRes resp = Variables.getAXLConnectionToCUCM85().getPhysicalLocation(req);//We send the request to the CUCM
		
		PhysicalLocation myP = new PhysicalLocation(this.getName());
		myP.setUUID(resp.getReturn().getPhysicalLocation().getUuid());
		//Has to be completed
		
		return myP;//Return a Physical Location
		}
	/****************/

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}
	


	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

