package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.soap.items.RouteGroupMember;
import com.alex.woot.utils.Variables;



/**********************************
 * Is the AXLItem design to link the item "Route Group"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class RouteGroupLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String distributionAlgorithm;
	private ArrayList<RouteGroupMember> members;
	
	public enum toUpdate implements ToUpdate
		{
		distributionAlgorithm,
		members
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public RouteGroupLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeRouteGroup(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeRouteGroup(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddRouteGroupReq req = new com.cisco.axl.api._10.AddRouteGroupReq();
		com.cisco.axl.api._10.XRouteGroup params = new com.cisco.axl.api._10.XRouteGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDistributionAlgorithm(this.distributionAlgorithm);
		
		com.cisco.axl.api._10.XRouteGroup.Members myMembers = new com.cisco.axl.api._10.XRouteGroup.Members();
		
		for(RouteGroupMember r : members)
			{
			com.cisco.axl.api._10.XRouteGroupMember myRGM = new com.cisco.axl.api._10.XRouteGroupMember();
			myRGM.setDeviceName(SimpleRequest.getUUIDV105(itemType.trunksip, r.getDeviceName()));
			myRGM.setDeviceSelectionOrder(Integer.toString(r.getOrder()));
			myRGM.setPort(r.getPort());
			
			myMembers.getMember().add(myRGM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setRouteGroup(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addRouteGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddRouteGroupReq req = new com.cisco.axl.api._8.AddRouteGroupReq();
		com.cisco.axl.api._8.XRouteGroup params = new com.cisco.axl.api._8.XRouteGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDistributionAlgorithm(this.distributionAlgorithm);
		
		com.cisco.axl.api._8.XRouteGroup.Members myMembers = new com.cisco.axl.api._8.XRouteGroup.Members();
		
		for(RouteGroupMember r : members)
			{
			com.cisco.axl.api._8.XRouteGroupMember myRGM = new com.cisco.axl.api._8.XRouteGroupMember();
			myRGM.setDeviceName(SimpleRequest.getUUIDV85(itemType.trunksip, r.getDeviceName()));
			myRGM.setDeviceSelectionOrder(Integer.toString(r.getOrder()));
			myRGM.setPort(r.getPort());
			
			myMembers.getMember().add(myRGM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setRouteGroup(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addRouteGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		Variables.getLogger().info("This method has to be written");
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		Variables.getLogger().info("This method has to be written");
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetRouteGroupReq req = new com.cisco.axl.api._10.GetRouteGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetRouteGroupRes resp = Variables.getAXLConnectionToCUCMV105().getRouteGroup(req);//We send the request to the CUCM
		
		RouteGroup myR = new RouteGroup(this.getName());
		myR.setUUID(resp.getReturn().getRouteGroup().getUuid());
		//Etc...
		//Has to be written
		
		return myR;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetRouteGroupReq req = new com.cisco.axl.api._8.GetRouteGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetRouteGroupRes resp = Variables.getAXLConnectionToCUCM85().getRouteGroup(req);//We send the request to the CUCM
		
		RouteGroup myR = new RouteGroup(this.getName());
		myR.setUUID(resp.getReturn().getRouteGroup().getUuid());
		//Etc...
		//Has to be written
		
		return myR;
		}
	/****************/

	public String getDistributionAlgorithm()
		{
		return distributionAlgorithm;
		}

	public void setDistributionAlgorithm(String distributionAlgorithm)
		{
		this.distributionAlgorithm = distributionAlgorithm;
		}

	public ArrayList<RouteGroupMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<RouteGroupMember> members)
		{
		this.members = members;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

