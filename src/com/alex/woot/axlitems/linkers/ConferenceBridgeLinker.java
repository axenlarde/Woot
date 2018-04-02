package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.utils.Variables;



/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class ConferenceBridgeLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	devicepool,
	location,
	commondeviceconfiguration;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		devicepool,
		location,
		commondeviceconfiguration
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public ConferenceBridgeLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeConferenceBridge(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeConferenceBridge(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddConferenceBridgeReq req = new com.cisco.axl.api._10.AddConferenceBridgeReq();
		com.cisco.axl.api._10.XConferenceBridge params = new com.cisco.axl.api._10.XConferenceBridge();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct("Cisco IOS Enhanced Conference Bridge");
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.devicepool, this.devicepool)));
		params.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.location));
		params.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.commondeviceconfig, this.commondeviceconfiguration)));
		/************/
		
		req.setConferenceBridge(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addConferenceBridge(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddConferenceBridgeReq req = new com.cisco.axl.api._8.AddConferenceBridgeReq();
		com.cisco.axl.api._8.XConferenceBridge params = new com.cisco.axl.api._8.XConferenceBridge();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct("Cisco IOS Enhanced Conference Bridge");
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.devicepool, this.devicepool)));
		params.setLocationName(SimpleRequest.getUUIDV85(itemType.location, this.location));
		params.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.commondeviceconfig, this.commondeviceconfiguration)));
		/************/
		
		req.setConferenceBridge(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addConferenceBridge(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateConferenceBridgeReq req = new com.cisco.axl.api._10.UpdateConferenceBridgeReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateConferenceBridge(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateConferenceBridgeReq req = new com.cisco.axl.api._8.UpdateConferenceBridgeReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateConferenceBridge(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetConferenceBridgeReq req = new com.cisco.axl.api._10.GetConferenceBridgeReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetConferenceBridgeRes resp = Variables.getAXLConnectionToCUCMV105().getConferenceBridge(req);//We send the request to the CUCM
		
		ConferenceBridge myCFB = new ConferenceBridge(this.getName());
		myCFB.setUUID(resp.getReturn().getConferenceBridge().getUuid());
		//Has to be written
		
		return myCFB;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetConferenceBridgeReq req = new com.cisco.axl.api._8.GetConferenceBridgeReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetConferenceBridgeRes resp = Variables.getAXLConnectionToCUCM85().getConferenceBridge(req);//We send the request to the CUCM
		
		ConferenceBridge myCFB = new ConferenceBridge(this.getName());
		myCFB.setUUID(resp.getReturn().getConferenceBridge().getUuid());
		//Has to be written
		
		return myCFB;//Return a location
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

	public String getDevicepool()
		{
		return devicepool;
		}

	public void setDevicepool(String devicepool)
		{
		this.devicepool = devicepool;
		}

	public String getLocation()
		{
		return location;
		}

	public void setLocation(String location)
		{
		this.location = location;
		}

	public String getCommondeviceconfiguration()
		{
		return commondeviceconfiguration;
		}

	public void setCommondeviceconfiguration(String commondeviceconfiguration)
		{
		this.commondeviceconfiguration = commondeviceconfiguration;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

