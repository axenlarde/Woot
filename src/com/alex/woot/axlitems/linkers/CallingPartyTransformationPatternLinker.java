package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.office.items.CallingPartyTransformationPattern;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;




/**********************************
 * Is the AXLItem design to link the item "Calling Party Transformation pattern"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class CallingPartyTransformationPatternLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	routePartitionName,
	callingPartyTransformationMask,
	useCallingPartyPhoneMask,
	digitDiscardInstructionName,
	callingPartyPrefixDigits,
	callingLinePresentationBit,
	callingPartyNumberingPlan,
	callingPartyNumberType;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		callingPartyTransformationMask,
		useCallingPartyPhoneMask,
		digitDiscardInstructionName,
		callingPartyPrefixDigits,
		callingLinePresentationBit,
		callingPartyNumberingPlan,
		callingPartyNumberType
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallingPartyTransformationPatternLinker(String name, String routePartitionName) throws Exception
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
		//To be written
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.RemoveCallingPartyTransformationPatternReq deleteReq = new com.cisco.axl.api._10.RemoveCallingPartyTransformationPatternReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeCallingPartyTransformationPattern(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveCallingPartyTransformationPatternReq deleteReq = new com.cisco.axl.api._8.RemoveCallingPartyTransformationPatternReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeCallingPartyTransformationPattern(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddCallingPartyTransformationPatternReq req = new com.cisco.axl.api._10.AddCallingPartyTransformationPatternReq();
		com.cisco.axl.api._10.XCallingPartyTransformationPattern params = new com.cisco.axl.api._10.XCallingPartyTransformationPattern();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Pattern
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		params.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		
		//We get the UUID of the digitDiscardInstructionName from the CUCM
		String digitDiscardInstructionUUID = SimpleRequest.getDigitDiscardUUID(this.digitDiscardInstructionName);
		if(digitDiscardInstructionUUID != null)
			{
			com.cisco.axl.api._10.XFkType xfkDigit = new com.cisco.axl.api._10.XFkType();
			xfkDigit.setUuid(digitDiscardInstructionUUID);
			params.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._10.XFkType.class, xfkDigit));
			}
		
		params.setCallingPartyPrefixDigits(new JAXBElement(new QName("callingPartyPrefixDigits"), String.class, this.callingPartyPrefixDigits));
		params.setCallingLinePresentationBit(this.callingLinePresentationBit);
		params.setCallingPartyNumberingPlan(this.callingPartyNumberingPlan);
		params.setCallingPartyNumberType(this.callingPartyNumberType);
		/************/
		
		req.setCallingPartyTransformationPattern(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addCallingPartyTransformationPattern(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddCallingPartyTransformationPatternReq req = new com.cisco.axl.api._8.AddCallingPartyTransformationPatternReq();
		com.cisco.axl.api._8.XCallingPartyTransformationPattern params = new com.cisco.axl.api._8.XCallingPartyTransformationPattern();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Pattern
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		params.setDescription(this.description);
		params.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		params.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		
		//We get the UUID of the digitDiscardInstructionName from the CUCM
		String digitDiscardInstructionUUID = SimpleRequest.getDigitDiscardUUID(this.digitDiscardInstructionName);
		if(digitDiscardInstructionUUID != null)
			{
			com.cisco.axl.api._10.XFkType xfkDigit = new com.cisco.axl.api._10.XFkType();
			xfkDigit.setUuid(digitDiscardInstructionUUID);
			params.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._10.XFkType.class, xfkDigit));
			}
		
		params.setCallingPartyPrefixDigits(new JAXBElement(new QName("callingPartyPrefixDigits"), String.class, this.callingPartyPrefixDigits));
		params.setCallingLinePresentationBit(this.callingLinePresentationBit);
		params.setCallingPartyNumberingPlan(this.callingPartyNumberingPlan);
		params.setCallingPartyNumberType(this.callingPartyNumberType);
		/************/
		
		req.setCallingPartyTransformationPattern(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addCallingPartyTransformationPattern(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateCallingPartyTransformationPatternReq req = new com.cisco.axl.api._10.UpdateCallingPartyTransformationPatternReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.callingPartyTransformationMask))req.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		if(tuList.contains(toUpdate.useCallingPartyPhoneMask))req.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		
		if(tuList.contains(toUpdate.digitDiscardInstructionName))
			{
			//We get the UUID of the digitDiscardInstructionName from the CUCM
			String digitDiscardInstructionUUID = SimpleRequest.getDigitDiscardUUID(this.digitDiscardInstructionName);
			if(digitDiscardInstructionUUID != null)
				{
				com.cisco.axl.api._10.XFkType xfkDigit = new com.cisco.axl.api._10.XFkType();
				xfkDigit.setUuid(digitDiscardInstructionUUID);
				req.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._10.XFkType.class, xfkDigit));
				}
			}
		
		if(tuList.contains(toUpdate.callingPartyPrefixDigits))req.setCallingPartyPrefixDigits(new JAXBElement(new QName("callingPartyPrefixDigits"), String.class, this.callingPartyPrefixDigits));
		if(tuList.contains(toUpdate.callingLinePresentationBit))req.setCallingLinePresentationBit(this.callingLinePresentationBit);
		if(tuList.contains(toUpdate.callingPartyNumberingPlan))req.setCallingPartyNumberingPlan(this.callingPartyNumberingPlan);
		if(tuList.contains(toUpdate.callingPartyNumberType))req.setCallingPartyNumberType(this.callingPartyNumberType);
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateCallingPartyTransformationPattern(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateCallingPartyTransformationPatternReq req = new com.cisco.axl.api._8.UpdateCallingPartyTransformationPatternReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.callingPartyTransformationMask))req.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		if(tuList.contains(toUpdate.useCallingPartyPhoneMask))req.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		
		if(tuList.contains(toUpdate.digitDiscardInstructionName))
			{
			//We get the UUID of the digitDiscardInstructionName from the CUCM
			String digitDiscardInstructionUUID = SimpleRequest.getDigitDiscardUUID(this.digitDiscardInstructionName);
			if(digitDiscardInstructionUUID != null)
				{
				com.cisco.axl.api._10.XFkType xfkDigit = new com.cisco.axl.api._10.XFkType();
				xfkDigit.setUuid(digitDiscardInstructionUUID);
				req.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._10.XFkType.class, xfkDigit));
				}
			}
		
		if(tuList.contains(toUpdate.callingPartyPrefixDigits))req.setCallingPartyPrefixDigits(new JAXBElement(new QName("callingPartyPrefixDigits"), String.class, this.callingPartyPrefixDigits));
		if(tuList.contains(toUpdate.callingLinePresentationBit))req.setCallingLinePresentationBit(this.callingLinePresentationBit);
		if(tuList.contains(toUpdate.callingPartyNumberingPlan))req.setCallingPartyNumberingPlan(this.callingPartyNumberingPlan);
		if(tuList.contains(toUpdate.callingPartyNumberType))req.setCallingPartyNumberType(this.callingPartyNumberType);
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateCallingPartyTransformationPattern(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetCallingPartyTransformationPatternReq req = new com.cisco.axl.api._10.GetCallingPartyTransformationPatternReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetCallingPartyTransformationPatternRes resp = Variables.getAXLConnectionToCUCMV105().getCallingPartyTransformationPattern(req);//We send the request to the CUCM
		
		CallingPartyTransformationPattern myCPTP = new CallingPartyTransformationPattern(this.getName(), this.getRoutePartitionName());
		myCPTP.setUUID(resp.getReturn().getCallingPartyTransformationPattern().getUuid());
		
		return myCPTP;//Return a Translation Pattern
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetCallingPartyTransformationPatternReq req = new com.cisco.axl.api._8.GetCallingPartyTransformationPatternReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetCallingPartyTransformationPatternRes resp = Variables.getAXLConnectionToCUCM85().getCallingPartyTransformationPattern(req);//We send the request to the CUCM
		
		CallingPartyTransformationPattern myCPTP = new CallingPartyTransformationPattern(this.getName(), this.getRoutePartitionName());
		myCPTP.setUUID(resp.getReturn().getCallingPartyTransformationPattern().getUuid());
		
		return myCPTP;//Return a Calling Party Transformation Pattern
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

	public String getCallingPartyTransformationMask()
		{
		return callingPartyTransformationMask;
		}

	public void setCallingPartyTransformationMask(String callingPartyTransformationMask)
		{
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		}

	public String getUseCallingPartyPhoneMask()
		{
		return useCallingPartyPhoneMask;
		}

	public void setUseCallingPartyPhoneMask(String useCallingPartyPhoneMask)
		{
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		}

	public String getDigitDiscardInstructionName()
		{
		return digitDiscardInstructionName;
		}

	public void setDigitDiscardInstructionName(String digitDiscardInstructionName)
		{
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public String getCallingPartyPrefixDigits()
		{
		return callingPartyPrefixDigits;
		}

	public void setCallingPartyPrefixDigits(String callingPartyPrefixDigits)
		{
		this.callingPartyPrefixDigits = callingPartyPrefixDigits;
		}

	public String getCallingLinePresentationBit()
		{
		return callingLinePresentationBit;
		}

	public void setCallingLinePresentationBit(String callingLinePresentationBit)
		{
		this.callingLinePresentationBit = callingLinePresentationBit;
		}

	public String getCallingPartyNumberingPlan()
		{
		return callingPartyNumberingPlan;
		}

	public void setCallingPartyNumberingPlan(String callingPartyNumberingPlan)
		{
		this.callingPartyNumberingPlan = callingPartyNumberingPlan;
		}

	public String getCallingPartyNumberType()
		{
		return callingPartyNumberType;
		}

	public void setCallingPartyNumberType(String callingPartyNumberType)
		{
		this.callingPartyNumberType = callingPartyNumberType;
		}

	
	
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

