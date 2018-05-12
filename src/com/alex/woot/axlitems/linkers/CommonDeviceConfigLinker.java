package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.office.items.CommonDeviceConfig;
import com.alex.woot.office.items.CommonDeviceConfig.AddressingMode;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class CommonDeviceConfigLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String softkeyTemplateName,
	userLocale,
	networkHoldMohAudioSourceId,
	userHoldMohAudioSourceId;
	
	private AddressingMode ipAddressingMode;
	
	public enum toUpdate implements ToUpdate
		{
		softkeyTemplate,
		userLocale,
		networkHoldMohAudioSourceId,
		userHoldMohAudioSourceId,
		ipAddressingMode
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CommonDeviceConfigLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeCommonDeviceConfig(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeCommonDeviceConfig(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddCommonDeviceConfigReq req = new com.cisco.axl.api._10.AddCommonDeviceConfigReq();
		com.cisco.axl.api._10.XCommonDeviceConfig params = new com.cisco.axl.api._10.XCommonDeviceConfig();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setSoftkeyTemplateName(new JAXBElement(new QName("softkeyTemplateName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.softkeytemplate, this.softkeyTemplateName)));
		params.setUserLocale(new JAXBElement(new QName("userLocale"), String.class,this.userLocale));
		params.setNetworkHoldMohAudioSourceId(new JAXBElement(new QName("networkHoldMohAudioSourceId"), String.class,this.networkHoldMohAudioSourceId));
		params.setUserHoldMohAudioSourceId(new JAXBElement(new QName("userHoldMohAudioSourceId"), String.class,this.userHoldMohAudioSourceId));
		params.setIpAddressingMode(ipAddressingMode.toString());	
		/************/
		
		req.setCommonDeviceConfig(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addCommonDeviceConfig(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddCommonDeviceConfigReq req = new com.cisco.axl.api._8.AddCommonDeviceConfigReq();
		com.cisco.axl.api._8.XCommonDeviceConfig params = new com.cisco.axl.api._8.XCommonDeviceConfig();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setSoftkeyTemplateName(new JAXBElement(new QName("softkeyTemplateName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.softkeytemplate, this.softkeyTemplateName)));
		params.setUserLocale(new JAXBElement(new QName("userLocale"), String.class,this.userLocale));
		params.setNetworkHoldMohAudioSourceId(new JAXBElement(new QName("networkHoldMohAudioSourceId"), String.class,this.networkHoldMohAudioSourceId));
		params.setUserHoldMohAudioSourceId(new JAXBElement(new QName("userHoldMohAudioSourceId"), String.class,this.userHoldMohAudioSourceId));
		params.setIpAddressingMode(ipAddressingMode.toString());
		/************/
		
		req.setCommonDeviceConfig(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addCommonDeviceConfig(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateCommonDeviceConfigReq req = new com.cisco.axl.api._10.UpdateCommonDeviceConfigReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.softkeyTemplate))req.setSoftkeyTemplateName(new JAXBElement(new QName("softkeyTemplateName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.softkeytemplate, this.softkeyTemplateName)));
		if(tuList.contains(toUpdate.userLocale))req.setUserLocale(new JAXBElement(new QName("userLocale"), String.class,this.userLocale));
		if(tuList.contains(toUpdate.networkHoldMohAudioSourceId))req.setNetworkHoldMohAudioSourceId(new JAXBElement(new QName("networkHoldMohAudioSourceId"), String.class,this.networkHoldMohAudioSourceId));
		if(tuList.contains(toUpdate.userHoldMohAudioSourceId))req.setUserHoldMohAudioSourceId(new JAXBElement(new QName("userHoldMohAudioSourceId"), String.class,this.userHoldMohAudioSourceId));
		if(tuList.contains(toUpdate.ipAddressingMode))req.setIpAddressingMode(ipAddressingMode.toString());	
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateCommonDeviceConfig(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateCommonDeviceConfigReq req = new com.cisco.axl.api._8.UpdateCommonDeviceConfigReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.softkeyTemplate))req.setSoftkeyTemplateName(new JAXBElement(new QName("softkeyTemplateName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.softkeytemplate, this.softkeyTemplateName)));
		if(tuList.contains(toUpdate.userLocale))req.setUserLocale(new JAXBElement(new QName("userLocale"), String.class,this.userLocale));
		if(tuList.contains(toUpdate.networkHoldMohAudioSourceId))req.setNetworkHoldMohAudioSourceId(new JAXBElement(new QName("networkHoldMohAudioSourceId"), String.class,this.networkHoldMohAudioSourceId));
		if(tuList.contains(toUpdate.userHoldMohAudioSourceId))req.setUserHoldMohAudioSourceId(new JAXBElement(new QName("userHoldMohAudioSourceId"), String.class,this.userHoldMohAudioSourceId));
		if(tuList.contains(toUpdate.ipAddressingMode))req.setIpAddressingMode(ipAddressingMode.toString());
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateCommonDeviceConfig(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetCommonDeviceConfigReq req = new com.cisco.axl.api._10.GetCommonDeviceConfigReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetCommonDeviceConfigRes resp = Variables.getAXLConnectionToCUCMV105().getCommonDeviceConfig(req);//We send the request to the CUCM
		
		CommonDeviceConfig myCDC = new CommonDeviceConfig(this.getName());
		myCDC.setUUID(resp.getReturn().getCommonDeviceConfig().getUuid());
		
		//Has to be written
		
		return myCDC;//Return a Device Pool
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetCommonDeviceConfigReq req = new com.cisco.axl.api._8.GetCommonDeviceConfigReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetCommonDeviceConfigRes resp = Variables.getAXLConnectionToCUCM85().getCommonDeviceConfig(req);//We send the request to the CUCM
		
		CommonDeviceConfig myCDC = new CommonDeviceConfig(this.getName());
		myCDC.setUUID(resp.getReturn().getCommonDeviceConfig().getUuid());
		
		//Has to be written
		
		return myCDC;//Return a Device Pool
		}
	/****************/

	public String getSoftkeyTemplateName()
		{
		return softkeyTemplateName;
		}

	public void setSoftkeyTemplateName(String softkeyTemplateName)
		{
		this.softkeyTemplateName = softkeyTemplateName;
		}

	public String getUserLocale()
		{
		return userLocale;
		}

	public void setUserLocale(String userLocale)
		{
		this.userLocale = userLocale;
		}

	public String getNetworkHoldMohAudioSourceId()
		{
		return networkHoldMohAudioSourceId;
		}

	public void setNetworkHoldMohAudioSourceId(String networkHoldMohAudioSourceId)
		{
		this.networkHoldMohAudioSourceId = networkHoldMohAudioSourceId;
		}

	public String getUserHoldMohAudioSourceId()
		{
		return userHoldMohAudioSourceId;
		}

	public void setUserHoldMohAudioSourceId(String userHoldMohAudioSourceId)
		{
		this.userHoldMohAudioSourceId = userHoldMohAudioSourceId;
		}

	public AddressingMode getIpAddressingMode()
		{
		return ipAddressingMode;
		}

	public void setIpAddressingMode(AddressingMode ipAddressingMode)
		{
		this.ipAddressingMode = ipAddressingMode;
		}

	

	
	/*2018*//*RATEL Alexandre 8)*/
	}

