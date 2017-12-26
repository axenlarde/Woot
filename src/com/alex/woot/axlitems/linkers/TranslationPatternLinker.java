package com.alex.woot.axlitems.linkers;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.TranslationPattern;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.cisco.axl.api._8.XFkType;


/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class TranslationPatternLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String usage,//Translation
	provideOutsideDialtone,//True
	description,
	routePartitionName,
	callingSearchSpaceName,
	patternUrgency,
	useCallingPartyPhoneMask,
	calledPartyTransformationMask,
	callingPartyTransformationMask,
	digitDiscardInstructionName;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public TranslationPatternLinker(String name, String routePartitionName) throws Exception
		{
		super(name);
		this.routePartitionName = routePartitionName;
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
		com.cisco.axl.api._10.RemoveTransPatternReq deleteReq = new com.cisco.axl.api._10.RemoveTransPatternReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeTransPattern(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveTransPatternReq deleteReq = new com.cisco.axl.api._8.RemoveTransPatternReq();
		
		deleteReq.setPattern(this.getName());//We add the parameters to the request
		deleteReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeTransPattern(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddTransPatternReq req = new com.cisco.axl.api._10.AddTransPatternReq();
		com.cisco.axl.api._10.XTransPattern params = new com.cisco.axl.api._10.XTransPattern();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Pattern
		params.setUsage(this.usage);
		params.setProvideOutsideDialtone(this.provideOutsideDialtone);
		params.setDescription(this.description);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingSearchSpaceName)));
		params.setPatternUrgency(this.patternUrgency);
		params.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		params.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		params.setCalledPartyTransformationMask(new JAXBElement(new QName("calledPartyTransformationMask"), String.class, this.calledPartyTransformationMask));
		
		//We get the UUID of the digitDiscardInstructionName from the CUCM
		String digitDiscardInstructionUUID = getDigitDiscardUUID(this.digitDiscardInstructionName);
		if(digitDiscardInstructionUUID != null)
			{
			com.cisco.axl.api._10.XFkType xfkDigit = new com.cisco.axl.api._10.XFkType();
			xfkDigit.setUuid(digitDiscardInstructionUUID);
			params.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._10.XFkType.class, xfkDigit));
			}
		/************/
		
		req.setTransPattern(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addTransPattern(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddTransPatternReq req = new com.cisco.axl.api._8.AddTransPatternReq();
		com.cisco.axl.api._8.XTransPattern params = new com.cisco.axl.api._8.XTransPattern();
		
		/**
		 * We set the item parameters
		 */
		params.setPattern(this.getName());//Pattern
		params.setUsage(this.usage);
		params.setProvideOutsideDialtone(this.provideOutsideDialtone);
		params.setDescription(this.description);
		params.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.callingSearchSpaceName)));
		params.setPatternUrgency(this.patternUrgency);
		params.setCallingPartyTransformationMask(new JAXBElement(new QName("callingPartyTransformationMask"), String.class, this.callingPartyTransformationMask));
		params.setUseCallingPartyPhoneMask(this.useCallingPartyPhoneMask);
		params.setCalledPartyTransformationMask(new JAXBElement(new QName("calledPartyTransformationMask"), String.class, this.calledPartyTransformationMask));
		
		//We get the UUID of the digitDiscardInstructionName from the CUCM
		String digitDiscardInstructionUUID = getDigitDiscardUUID(this.digitDiscardInstructionName);
		if(digitDiscardInstructionUUID != null)
			{
			com.cisco.axl.api._8.XFkType xfkDigit = new XFkType();
			xfkDigit.setUuid(digitDiscardInstructionUUID);
			params.setDigitDiscardInstructionName(new JAXBElement(new QName("digitDiscardInstructionName"), com.cisco.axl.api._8.XFkType.class, xfkDigit));
			}
		/************/
		
		req.setTransPattern(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addTransPattern(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateTransPatternReq req = new com.cisco.axl.api._10.UpdateTransPatternReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateTransPattern(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateTransPatternReq req = new com.cisco.axl.api._8.UpdateTransPatternReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateTransPattern(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetTransPatternReq req = new com.cisco.axl.api._10.GetTransPatternReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._10.GetTransPatternRes resp = Variables.getAXLConnectionToCUCMV105().getTransPattern(req);//We send the request to the CUCM
		
		TranslationPattern myTP = new TranslationPattern(this.getName(), this.getRoutePartitionName());
		myTP.setUUID(resp.getReturn().getTransPattern().getUuid());
		
		return myTP;//Return a Translation Pattern
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetTransPatternReq req = new com.cisco.axl.api._8.GetTransPatternReq();
		
		/**
		 * We set the item parameters
		 */
		req.setPattern(this.getName());
		req.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, this.routePartitionName)));
		/************/
		
		com.cisco.axl.api._8.GetTransPatternRes resp = Variables.getAXLConnectionToCUCM().getTransPattern(req);//We send the request to the CUCM
		
		TranslationPattern myTP = new TranslationPattern(this.getName(), this.getRoutePartitionName());
		myTP.setUUID(resp.getReturn().getTransPattern().getUuid());
		
		return myTP;//Return a Translation Pattern
		}
	/****************/
	
	/***********
	 * Method used to find the UUID of the
	 * set DigitDiscard pattern
	 * 
	 * For instance : "PreDot"
	 */
	private String getDigitDiscardUUID(String digitDiscardName)
		{
		if(!digitDiscardName.equals(""))
			{
			try
				{
				List<Object> SQLResp = SimpleRequest.doSQLQuery("select pkid from digitdiscardinstruction where name='"+digitDiscardName+"'");
				
				for(Object o : SQLResp)
					{
					Element rowElement = (Element) o;
					NodeList list = rowElement.getChildNodes();
					
					for(int i = 0; i< list.getLength(); i++)
						{
						if(list.item(i).getNodeName().equals("pkid"))
							{
							Variables.getLogger().debug("Digitdiscardinstruction "+digitDiscardName+" UUID found : "+list.item(i).getTextContent());
							return list.item(i).getTextContent();
							}
						}
					
					}
				}
			catch (Exception e)
				{
				e.printStackTrace();
				Variables.getLogger().error("Digitdiscardinstruction \""+digitDiscardName+"\" has not been found. We return null instead : "+e.getMessage());
				}
			}
		else
			{
			Variables.getLogger().debug("Digitdiscardinstruction was empty. We return null instead");
			}
		
		
		return null;
		}
	
	

	public String getUsage()
		{
		return usage;
		}

	public void setUsage(String usage)
		{
		this.usage = usage;
		}

	public String getProvideOutsideDialtone()
		{
		return provideOutsideDialtone;
		}

	public void setProvideOutsideDialtone(String provideOutsideDialtone)
		{
		this.provideOutsideDialtone = provideOutsideDialtone;
		}

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

	public String getCallingSearchSpaceName()
		{
		return callingSearchSpaceName;
		}

	public void setCallingSearchSpaceName(String callingSearchSpaceName)
		{
		this.callingSearchSpaceName = callingSearchSpaceName;
		}

	public String getPatternUrgency()
		{
		return patternUrgency;
		}

	public void setPatternUrgency(String patternUrgency)
		{
		this.patternUrgency = patternUrgency;
		}

	public String getUseCallingPartyPhoneMask()
		{
		return useCallingPartyPhoneMask;
		}

	public void setUseCallingPartyPhoneMask(String useCallingPartyPhoneMask)
		{
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		}

	public String getCalledPartyTransformationMask()
		{
		return calledPartyTransformationMask;
		}

	public void setCalledPartyTransformationMask(
			String calledPartyTransformationMask)
		{
		this.calledPartyTransformationMask = calledPartyTransformationMask;
		}

	public String getDigitDiscardInstructionName()
		{
		return digitDiscardInstructionName;
		}

	public void setDigitDiscardInstructionName(String digitDiscardInstructionName)
		{
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public String getCallingPartyTransformationMask()
		{
		return callingPartyTransformationMask;
		}

	public void setCallingPartyTransformationMask(
			String callingPartyTransformationMask)
		{
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		}

	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

