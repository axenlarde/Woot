package com.alex.woot.axlitems.linkers;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.site.SRSTReference;
import com.alex.yuza.utils.Variables;


/**********************************
 * Is the AXLItem design to link the item "SRST reference"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class SRSTReferenceLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String ipAddress;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public SRSTReferenceLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public void doInitVersion85() throws Exception
		{
		//If needed
		}
	
	public void doInitVersion105() throws Exception
		{
		//If needed
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeSrst(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeSrst(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddSrstReq req = new com.cisco.axl.api._10.AddSrstReq();
		com.cisco.axl.api._10.XSrst params = new com.cisco.axl.api._10.XSrst();
		
		/*************
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setIpAddress(this.ipAddress);
		params.setSipNetwork(this.ipAddress);
		/************/
		
		req.setSrst(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addSrst(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddSrstReq req = new com.cisco.axl.api._8.AddSrstReq();
		com.cisco.axl.api._8.XSrst params = new com.cisco.axl.api._8.XSrst();
		
		/*************
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setIpAddress(this.ipAddress);
		params.setSipNetwork(this.ipAddress);
		/************/
		
		req.setSrst(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addSrst(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateSrstReq req = new com.cisco.axl.api._10.UpdateSrstReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateSrst(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateSrstReq req = new com.cisco.axl.api._8.UpdateSrstReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateSrst(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetSrstReq req = new com.cisco.axl.api._10.GetSrstReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetSrstRes resp = Variables.getAXLConnectionToCUCMV105().getSrst(req);//We send the request to the CUCM
		
		SRSTReference myS = new SRSTReference(this.getName());
		myS.setUUID(resp.getReturn().getSrst().getUuid());
		myS.setIpAddress(resp.getReturn().getSrst().getIpAddress());
		
		return myS;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetSrstReq req = new com.cisco.axl.api._8.GetSrstReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetSrstRes resp = Variables.getAXLConnectionToCUCM().getSrst(req);//We send the request to the CUCM
		
		SRSTReference myS = new SRSTReference(this.getName());
		myS.setUUID(resp.getReturn().getSrst().getUuid());
		myS.setIpAddress(resp.getReturn().getSrst().getIpAddress());
		
		return myS;//Return a location
		}
	/****************/

	public String getIpAddress()
		{
		return ipAddress;
		}

	public void setIpAddress(String ipAddress)
		{
		this.ipAddress = ipAddress;
		}


	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

