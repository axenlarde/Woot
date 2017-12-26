package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.linkers.LineLinker.toUpdate;
import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.soap.items.CallPickupGroupMember;
import com.alex.woot.user.items.CallPickupGroup;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Is the AXLItem design to link the item "Call Pickpup Group"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class CallPickupGroupLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String pattern,
	description,
	routePartitionName,
	pickupNotification,
	pickupNotificationTimer,
	callingPartyInfo,
	calledPartyInfo;
	
	private ArrayList<CallPickupGroupMember> groupList;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		pickupNotification,
		pickupNotificationTimer,
		callingPartyInfo,
		calledPartyInfo,
		groupList
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallPickupGroupLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		try
			{
			SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName);
			
			for(CallPickupGroupMember cpg : groupList)
				{
				SimpleRequest.getUUIDV85(itemType.partition, cpg.getPartition());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.routePartitionName, "Not found during init : "+e.getMessage(), itemType.callpickupgroup, itemType.partition, errorType.notFound));
			}
		
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName);
			
			for(CallPickupGroupMember cpg : groupList)
				{
				SimpleRequest.getUUIDV105(itemType.partition, cpg.getPartition());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.routePartitionName, "Not found during init : "+e.getMessage(), itemType.callpickupgroup, itemType.partition, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.RemoveCallPickupGroupReq deleteReq = new com.cisco.axl.api._10.RemoveCallPickupGroupReq();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeCallPickupGroup(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveCallPickupGroupReq deleteReq = new com.cisco.axl.api._8.RemoveCallPickupGroupReq();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeCallPickupGroup(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddCallPickupGroupReq req = new com.cisco.axl.api._10.AddCallPickupGroupReq();
		com.cisco.axl.api._10.XCallPickupGroup params = new com.cisco.axl.api._10.XCallPickupGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setPattern(pattern);
		params.setDescription(description);
		params.setPickupNotification(pickupNotification);
		params.setPickupNotificationTimer(pickupNotificationTimer);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._10.XCallPickupGroup.CallInfoForPickupNotification myNotif = new com.cisco.axl.api._10.XCallPickupGroup.CallInfoForPickupNotification();
		myNotif.setCalledPartyInfo(calledPartyInfo);
		myNotif.setCallingPartyInfo(callingPartyInfo);
		params.setCallInfoForPickupNotification(myNotif);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._10.XCallPickupGroup.Members membersList = new com.cisco.axl.api._10.XCallPickupGroup.Members();
		
		for(CallPickupGroupMember cpg : groupList)
			{
			com.cisco.axl.api._10.XPickupGroupMember myMember = new com.cisco.axl.api._10.XPickupGroupMember();
			com.cisco.axl.api._10.XPickupGroupMember.PickupDnAndPartition line = new com.cisco.axl.api._10.XPickupGroupMember.PickupDnAndPartition();
			line.setDnPattern(cpg.getNumber());
			line.setRoutePartitionName(SimpleRequest.getUUIDV105(itemType.partition, cpg.getPartition()));
			myMember.setPickupDnAndPartition(line);
			myMember.setPriority(Integer.toString(cpg.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		if(membersList.getMember().size() != 0)params.setMembers(membersList);
		/***********************/
		
		req.setCallPickupGroup(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addCallPickupGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddCallPickupGroupReq req = new com.cisco.axl.api._8.AddCallPickupGroupReq();
		com.cisco.axl.api._8.XCallPickupGroup params = new com.cisco.axl.api._8.XCallPickupGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setPattern(pattern);
		params.setDescription(description);
		params.setPickupNotification(pickupNotification);
		params.setPickupNotificationTimer(pickupNotificationTimer);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._8.XCallPickupGroup.CallInfoForPickupNotification myNotif = new com.cisco.axl.api._8.XCallPickupGroup.CallInfoForPickupNotification();
		myNotif.setCalledPartyInfo(calledPartyInfo);
		myNotif.setCallingPartyInfo(callingPartyInfo);
		params.setCallInfoForPickupNotification(myNotif);
		/************/
		
		/***********************
		 * Members
		 */
		com.cisco.axl.api._8.XCallPickupGroup.Members membersList = new com.cisco.axl.api._8.XCallPickupGroup.Members();
		
		for(CallPickupGroupMember cpg : groupList)
			{
			com.cisco.axl.api._8.XPickupGroupMember myMember = new com.cisco.axl.api._8.XPickupGroupMember();
			com.cisco.axl.api._8.XPickupGroupMember.PickupDnAndPartition line = new com.cisco.axl.api._8.XPickupGroupMember.PickupDnAndPartition();
			line.setDnPattern(cpg.getNumber());
			line.setRoutePartitionName(SimpleRequest.getUUIDV85(itemType.partition, cpg.getPartition()));
			myMember.setPickupDnAndPartition(line);
			myMember.setPriority(Integer.toString(cpg.getOrder()));
			membersList.getMember().add(myMember);
			}
		
		params.setMembers(membersList);
		/***********************/
		
		req.setCallPickupGroup(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addCallPickupGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateCallPickupGroupReq req = new com.cisco.axl.api._10.UpdateCallPickupGroupReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.pickupNotification))req.setPickupNotification(this.pickupNotification);
		if(tuList.contains(toUpdate.pickupNotificationTimer))req.setPickupNotificationTimer(this.pickupNotificationTimer);
		
		com.cisco.axl.api._10.UpdateCallPickupGroupReq.CallInfoForPickupNotification myNotif = new com.cisco.axl.api._10.UpdateCallPickupGroupReq.CallInfoForPickupNotification();
		if(tuList.contains(toUpdate.callingPartyInfo))myNotif.setCallingPartyInfo(this.callingPartyInfo);
		if(tuList.contains(toUpdate.calledPartyInfo))myNotif.setCalledPartyInfo(this.calledPartyInfo);
		if((tuList.contains(toUpdate.callingPartyInfo)) || (tuList.contains(toUpdate.calledPartyInfo)))req.setCallInfoForPickupNotification(myNotif);
		
		//Group to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateCallPickupGroup(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tulist) throws Exception
		{
		com.cisco.axl.api._8.UpdateCallPickupGroupReq req = new com.cisco.axl.api._8.UpdateCallPickupGroupReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateCallPickupGroup(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetCallPickupGroupReq req = new com.cisco.axl.api._10.GetCallPickupGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetCallPickupGroupRes resp = Variables.getAXLConnectionToCUCMV105().getCallPickupGroup(req);//We send the request to the CUCM
		
		CallPickupGroup myCPG = new CallPickupGroup(this.getName());
		myCPG.setUUID(resp.getReturn().getCallPickupGroup().getUuid());
		//Has to be written
		
		return myCPG;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetCallPickupGroupReq req = new com.cisco.axl.api._8.GetCallPickupGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetCallPickupGroupRes resp = Variables.getAXLConnectionToCUCM85().getCallPickupGroup(req);//We send the request to the CUCM
		
		CallPickupGroup myCPG = new CallPickupGroup(this.getName());
		myCPG.setUUID(resp.getReturn().getCallPickupGroup().getUuid());
		//Has to be written
		
		return myCPG;
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

	public String getPickupNotification()
		{
		return pickupNotification;
		}

	public void setPickupNotification(String pickupNotification)
		{
		this.pickupNotification = pickupNotification;
		}

	public String getPickupNotificationTimer()
		{
		return pickupNotificationTimer;
		}

	public void setPickupNotificationTimer(String pickupNotificationTimer)
		{
		this.pickupNotificationTimer = pickupNotificationTimer;
		}

	public String getCallingPartyInfo()
		{
		return callingPartyInfo;
		}

	public void setCallingPartyInfo(String callingPartyInfo)
		{
		this.callingPartyInfo = callingPartyInfo;
		}

	public String getCalledPartyInfo()
		{
		return calledPartyInfo;
		}

	public void setCalledPartyInfo(String calledPartyInfo)
		{
		this.calledPartyInfo = calledPartyInfo;
		}

	public String getPattern()
		{
		return pattern;
		}

	public void setPattern(String pattern)
		{
		this.pattern = pattern;
		}

	public ArrayList<CallPickupGroupMember> getGroupList()
		{
		return groupList;
		}

	public void setGroupList(ArrayList<CallPickupGroupMember> groupList)
		{
		this.groupList = groupList;
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

