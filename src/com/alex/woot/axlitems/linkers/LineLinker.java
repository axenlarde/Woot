package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.linkers.UserLinker.toUpdate;
import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.user.items.Line;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.cisco.axl.api._10.XCallForwardAll;
import com.cisco.axl.api._8.XFkType;


/**********************************
 * Is the AXLItem design to link the item "Line"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class LineLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	routePartitionName,
	usage,
	alertingName,
	asciiAlertingName,
	shareLineAppearanceCssName,
	callPickupGroupName,
	fwCallingSearchSpaceName,
	fwAllDestination,
	fwNoanDestination,
	fwBusyDestination,
	fwUnrDestination,
	voiceMailProfileName;
	
	private boolean fwAllVoicemailEnable,
	fwNoanVoicemailEnable,
	fwBusyVoicemailEnable,
	fwUnrVoicemailEnable;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		alertingName,
		asciiAlertingName,
		shareLineAppearanceCssName,
		callPickupGroupName,
		fwCallingSearchSpaceName,
		fwAllDestination,
		fwNoanDestination,
		fwBusyDestination,
		fwUnrDestination,
		voiceMailProfileName,
		fwAllVoicemailEnable,
		fwNoanVoicemailEnable,
		fwBusyVoicemailEnable,
		fwUnrVoicemailEnable
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LineLinker(String name, String routePartitionName) throws Exception
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
		//To be written
		
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
			errorList.add(new UserError(this.name, this.routePartitionName, "Not found during init : "+e.getMessage(), itemType.line, itemType.partition, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.shareLineAppearanceCssName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.shareLineAppearanceCssName, "Not found during init : "+e.getMessage(), itemType.line, itemType.callingsearchspace, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.shareLineAppearanceCssName, "Not found during init : "+e.getMessage(), itemType.line, itemType.callingsearchspace, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.voicemail, this.voiceMailProfileName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.voiceMailProfileName, "Not found during init : "+e.getMessage(), itemType.line, itemType.callingsearchspace, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		//First we get the UUID of the line
		com.cisco.axl.api._10.GetLineReq req = new com.cisco.axl.api._10.GetLineReq();
		req.setPattern(this.name);
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(req);//We send the request to the CUCM
		
		//Then we delete the line
		com.cisco.axl.api._10.RemoveLineReq deleteReq = new com.cisco.axl.api._10.RemoveLineReq();
		deleteReq.setUuid(resp.getReturn().getLine().getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse response = Variables.getAXLConnectionToCUCMV105().removeLine(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		//First we get the UUID of the line
		com.cisco.axl.api._8.GetLineReq req = new com.cisco.axl.api._8.GetLineReq();
		req.setPattern(this.name);
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM85().getLine(req);//We send the request to the CUCM
		
		//Then we delete the line
		com.cisco.axl.api._8.RemoveLineReq deleteReq = new com.cisco.axl.api._8.RemoveLineReq();
		deleteReq.setUuid(resp.getReturn().getLine().getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse response = Variables.getAXLConnectionToCUCM85().removeLine(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddLineReq req = new com.cisco.axl.api._10.AddLineReq();
		com.cisco.axl.api._10.XLine params = new com.cisco.axl.api._10.XLine();
		
		/******************************
		 * We set the item parameters
		 * 
		 */
		params.setPattern(this.name);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setAlertingName(this.alertingName);
		params.setAsciiAlertingName(this.asciiAlertingName);
		params.setShareLineAppearanceCssName(new JAXBElement(new QName("shareLineAppearanceCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.shareLineAppearanceCssName)));
		params.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		params.setVoiceMailProfileName(new JAXBElement(new QName("voiceMailProfileName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.voicemail, this.voiceMailProfileName)));
		
		/****
		 * Forward
		 */
		//All
		com.cisco.axl.api._10.XCallForwardAll myFwAll = new com.cisco.axl.api._10.XCallForwardAll();
		myFwAll.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwAll.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwAllDestination));
		myFwAll.setForwardToVoiceMail((this.fwAllVoicemailEnable)?"true":"false");
		params.setCallForwardAll(myFwAll);
		
		//Noan
		com.cisco.axl.api._10.XCallForwardNoAnswer myFwNoan = new com.cisco.axl.api._10.XCallForwardNoAnswer();
		myFwNoan.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwNoan.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwNoanDestination));
		myFwNoan.setForwardToVoiceMail((this.fwNoanVoicemailEnable)?"true":"false");
		params.setCallForwardNoAnswer(myFwNoan);
		com.cisco.axl.api._10.XCallForwardNoAnswerInt myFwNoanInt = new com.cisco.axl.api._10.XCallForwardNoAnswerInt();
		myFwNoanInt.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwNoanInt.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwNoanDestination));
		myFwNoanInt.setForwardToVoiceMail((this.fwNoanVoicemailEnable)?"true":"false");
		params.setCallForwardNoAnswerInt(myFwNoanInt);
		
		//Busy
		com.cisco.axl.api._10.XCallForwardBusy myFwBusy = new com.cisco.axl.api._10.XCallForwardBusy();
		myFwBusy.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwBusy.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwBusyDestination));
		myFwBusy.setForwardToVoiceMail((this.fwBusyVoicemailEnable)?"true":"false");
		params.setCallForwardBusy(myFwBusy);
		com.cisco.axl.api._10.XCallForwardBusyInt myFwBusyInt = new com.cisco.axl.api._10.XCallForwardBusyInt();
		myFwBusyInt.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwBusyInt.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwBusyDestination));
		myFwBusyInt.setForwardToVoiceMail((this.fwBusyVoicemailEnable)?"true":"false");
		params.setCallForwardBusyInt(myFwBusyInt);
		
		//Unregistered
		com.cisco.axl.api._10.XCallForwardNotRegistered myFwUnr = new com.cisco.axl.api._10.XCallForwardNotRegistered();
		myFwUnr.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwUnr.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwUnrDestination));
		myFwUnr.setForwardToVoiceMail((this.fwUnrVoicemailEnable)?"true":"false");
		params.setCallForwardNotRegistered(myFwUnr);
		com.cisco.axl.api._10.XCallForwardNotRegisteredInt myFwUnrInt = new com.cisco.axl.api._10.XCallForwardNotRegisteredInt();
		myFwUnrInt.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.fwCallingSearchSpaceName)));
		myFwUnrInt.setDestination(new JAXBElement(new QName("destination"), String.class , this.fwUnrDestination));
		myFwUnrInt.setForwardToVoiceMail((this.fwUnrVoicemailEnable)?"true":"false");
		params.setCallForwardNotRegisteredInt(myFwUnrInt);
		/************/
		
		req.setLine(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addLine(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddLineReq req = new com.cisco.axl.api._8.AddLineReq();
		com.cisco.axl.api._8.XLine params = new com.cisco.axl.api._8.XLine();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.name);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setAlertingName(this.alertingName);
		params.setAsciiAlertingName(this.asciiAlertingName);
		params.setShareLineAppearanceCssName(new JAXBElement(new QName("shareLineAppearanceCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.shareLineAppearanceCssName)));
		/************/
		
		req.setLine(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addLine(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateLineReq req = new com.cisco.axl.api._10.UpdateLineReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.name);
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.alertingName))req.setAlertingName(this.alertingName);
		if(tuList.contains(toUpdate.asciiAlertingName))req.setAsciiAlertingName(this.asciiAlertingName);
		if(tuList.contains(toUpdate.shareLineAppearanceCssName))req.setShareLineAppearanceCssName(new JAXBElement(new QName("shareLineAppearanceCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.shareLineAppearanceCssName)));
		if(tuList.contains(toUpdate.callPickupGroupName))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		
		/*To do
		if(tuList.contains(toUpdate.fwCallingSearchSpaceName))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwAllDestination))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwNoanDestination))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwBusyDestination))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwUnrDestination))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.voiceMailProfileName))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwAllVoicemailEnable))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwNoanVoicemailEnable))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwBusyVoicemailEnable))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		if(tuList.contains(toUpdate.fwUnrVoicemailEnable))req.setCallPickupGroupName(SimpleRequest.getUUIDV105(itemType.callpickupgroup, this.callPickupGroupName));
		*/
		
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateLine(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateLineReq req = new com.cisco.axl.api._8.UpdateLineReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.name);
		
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateLine(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetLineReq req = new com.cisco.axl.api._10.GetLineReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(req);//We send the request to the CUCM
		
		Line myLine = new Line(this.getName(),this.getRoutePartitionName());
		myLine.setUUID(resp.getReturn().getLine().getUuid());
		//etc..
		//Has to be written
		
		return myLine;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetLineReq req = new com.cisco.axl.api._8.GetLineReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM85().getLine(req);//We send the request to the CUCM
		
		Line myLine = new Line(this.getName(),this.getRoutePartitionName());
		myLine.setUUID(resp.getReturn().getLine().getUuid());
		//etc..
		//Has to be written
		
		return myLine;//Return a location
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

	public String getUsage()
		{
		return usage;
		}

	public void setUsage(String usage)
		{
		this.usage = usage;
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

	public String getShareLineAppearanceCssName()
		{
		return shareLineAppearanceCssName;
		}

	public void setShareLineAppearanceCssName(String shareLineAppearanceCssName)
		{
		this.shareLineAppearanceCssName = shareLineAppearanceCssName;
		}

	public String getCallPickupGroupName()
		{
		return callPickupGroupName;
		}

	public void setCallPickupGroupName(String callPickupGroupName)
		{
		this.callPickupGroupName = callPickupGroupName;
		}

	public String getFwCallingSearchSpaceName()
		{
		return fwCallingSearchSpaceName;
		}

	public void setFwCallingSearchSpaceName(String fwCallingSearchSpaceName)
		{
		this.fwCallingSearchSpaceName = fwCallingSearchSpaceName;
		}

	public String getFwAllDestination()
		{
		return fwAllDestination;
		}

	public void setFwAllDestination(String fwAllDestination)
		{
		this.fwAllDestination = fwAllDestination;
		}

	public String getFwNoanDestination()
		{
		return fwNoanDestination;
		}

	public void setFwNoanDestination(String fwNoanDestination)
		{
		this.fwNoanDestination = fwNoanDestination;
		}

	public String getFwBusyDestination()
		{
		return fwBusyDestination;
		}

	public void setFwBusyDestination(String fwBusyDestination)
		{
		this.fwBusyDestination = fwBusyDestination;
		}

	public String getFwUnrDestination()
		{
		return fwUnrDestination;
		}

	public void setFwUnrDestination(String fwUnrDestination)
		{
		this.fwUnrDestination = fwUnrDestination;
		}

	public String getVoiceMailProfileName()
		{
		return voiceMailProfileName;
		}

	public void setVoiceMailProfileName(String voiceMailProfileName)
		{
		this.voiceMailProfileName = voiceMailProfileName;
		}

	public boolean isFwAllVoicemailEnable()
		{
		return fwAllVoicemailEnable;
		}

	public void setFwAllVoicemailEnable(boolean fwAllVoicemailEnable)
		{
		this.fwAllVoicemailEnable = fwAllVoicemailEnable;
		}

	public boolean isFwNoanVoicemailEnable()
		{
		return fwNoanVoicemailEnable;
		}

	public void setFwNoanVoicemailEnable(boolean fwNoanVoicemailEnable)
		{
		this.fwNoanVoicemailEnable = fwNoanVoicemailEnable;
		}

	public boolean isFwBusyVoicemailEnable()
		{
		return fwBusyVoicemailEnable;
		}

	public void setFwBusyVoicemailEnable(boolean fwBusyVoicemailEnable)
		{
		this.fwBusyVoicemailEnable = fwBusyVoicemailEnable;
		}

	public boolean isFwUnrVoicemailEnable()
		{
		return fwUnrVoicemailEnable;
		}

	public void setFwUnrVoicemailEnable(boolean fwUnrVoicemailEnable)
		{
		this.fwUnrVoicemailEnable = fwUnrVoicemailEnable;
		}

	

	

	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

