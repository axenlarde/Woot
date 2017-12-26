package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.linkers.HuntListLinker.toUpdate;
import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.user.items.HuntPilot;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Is the AXLItem design to link the item "Hunt Pilot"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class HuntPilotLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	routePartitionName,
	alertingName,
	asciiAlertingName,
	huntListName;

	public enum toUpdate implements ToUpdate
		{
		description,
		alertingName,
		huntListName
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntPilotLinker(String name, String routePartitionName) throws Exception
		{
		super(name);
		this.routePartitionName = routePartitionName;
		}
	
	/***************
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		//Nothing to do here
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.routePartitionName, "Not found during init : "+e.getMessage(), itemType.huntpilot, itemType.partition, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.RemoveHuntPilotReq deleteReq = new com.cisco.axl.api._10.RemoveHuntPilotReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeHuntPilot(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveHuntPilotReq deleteReq = new com.cisco.axl.api._8.RemoveHuntPilotReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeHuntPilot(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddHuntPilotReq req = new com.cisco.axl.api._10.AddHuntPilotReq();
		com.cisco.axl.api._10.XHuntPilot params = new com.cisco.axl.api._10.XHuntPilot();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Name
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		params.setDescription(description);
		
		params.setAlertingName(alertingName);
		params.setAsciiAlertingName(asciiAlertingName);
		params.setHuntListName(SimpleRequest.getUUIDV105(itemType.huntlist, huntListName));
		/************/
		
		req.setHuntPilot(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addHuntPilot(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddHuntPilotReq req = new com.cisco.axl.api._8.AddHuntPilotReq();
		com.cisco.axl.api._8.XHuntPilot params = new com.cisco.axl.api._8.XHuntPilot();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Name
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		params.setDescription(description);
		
		params.setAlertingName(alertingName);
		params.setAsciiAlertingName(asciiAlertingName);
		params.setHuntListName(SimpleRequest.getUUIDV85(itemType.huntlist, huntListName));
		/************/
		
		req.setHuntPilot(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addHuntPilot(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateHuntPilotReq req = new com.cisco.axl.api._10.UpdateHuntPilotReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		
		if(tuList.contains(toUpdate.description))req.setDescription(description);
		if(tuList.contains(toUpdate.alertingName))
			{
			req.setAlertingName(alertingName);
			req.setAsciiAlertingName(asciiAlertingName);
			}
		if(tuList.contains(toUpdate.huntListName))req.setHuntListName(SimpleRequest.getUUIDV105(itemType.huntlist, huntListName));
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateHuntPilot(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateHuntPilotReq req = new com.cisco.axl.api._8.UpdateHuntPilotReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateHuntPilot(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetHuntPilotReq req = new com.cisco.axl.api._10.GetHuntPilotReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetHuntPilotRes resp = Variables.getAXLConnectionToCUCMV105().getHuntPilot(req);//We send the request to the CUCM
		
		HuntPilot myHP = new HuntPilot(this.getName(), this.routePartitionName);
		myHP.setUUID(resp.getReturn().getHuntPilot().getUuid());
		//Has to be written
		
		return myHP;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetHuntPilotReq req = new com.cisco.axl.api._8.GetHuntPilotReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetHuntPilotRes resp = Variables.getAXLConnectionToCUCM85().getHuntPilot(req);//We send the request to the CUCM
		
		HuntPilot myHP = new HuntPilot(this.getName(), this.routePartitionName);
		myHP.setUUID(resp.getReturn().getHuntPilot().getUuid());
		//Has to be written
		
		return myHP;
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

	public String getRoutePartitionName()
		{
		return routePartitionName;
		}

	public void setRoutePartitionName(String routePartitionName)
		{
		this.routePartitionName = routePartitionName;
		}

	public String getAlertingName()
		{
		return alertingName;
		}

	public void setAlertingName(String alertingName)
		{
		this.alertingName = alertingName;
		}

	public String getAsciiAlertingName()
		{
		return asciiAlertingName;
		}

	public void setAsciiAlertingName(String asciiAlertingName)
		{
		this.asciiAlertingName = asciiAlertingName;
		}

	public String getHuntListName()
		{
		return huntListName;
		}

	public void setHuntListName(String huntListName)
		{
		this.huntListName = huntListName;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

