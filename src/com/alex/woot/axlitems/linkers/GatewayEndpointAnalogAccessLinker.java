package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.user.items.GatewayEndpointAnalogAccess;
import com.alex.woot.user.items.Phone;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

import java.util.ArrayList;



/**********************************
 * Is the AXLItem design to link the item "Phone"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class GatewayEndpointAnalogAccessLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneCss,
	devicePool,
	location,
	commonDeviceConfigName,
	aarNeighborhoodName,
	automatedAlternateRoutingCssName,
	gatewayName,
	unit,
	subunit,
	index,
	portNumber;
	
	private PhoneLine line;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		phoneCss,
		devicePool,
		location,
		commonDeviceConfigName,
		aarNeighborhoodName,
		automatedAlternateRoutingCssName,
		line
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public GatewayEndpointAnalogAccessLinker(String name) throws Exception
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
		
		//Here we want to log every error, so we have to use a try/catch for each
		
		//CSS
		try
			{
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.phoneCss);
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.automatedAlternateRoutingCssName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.phoneCss, "Not found during init : "+e.getMessage(), itemType.analog, itemType.callingsearchspace, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.devicepool, this.devicePool);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.devicePool, "Not found during init : "+e.getMessage(), itemType.analog, itemType.devicepool, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.location, this.location);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.location, "Not found during init : "+e.getMessage(), itemType.analog, itemType.location, errorType.notFound));
			}
		
		//Line
		try
			{
			SimpleRequest.getUUIDV105(itemType.partition, line.getRoutePartition());
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.analog, itemType.partition, errorType.notFound));
			}
		
		//CDC
		try
			{
			SimpleRequest.getUUIDV105(itemType.commondeviceconfig, this.commonDeviceConfigName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.analog, itemType.commondeviceconfig, errorType.notFound));
			}
		
		//AAR group
		try
			{
			SimpleRequest.getUUIDV105(itemType.aargroup, this.aarNeighborhoodName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.analog, itemType.aargroup, errorType.notFound));
			}
		
		//Gateway
		try
			{
			SimpleRequest.getUUIDV105(itemType.gateway, this.gatewayName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.analog, itemType.gateway, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setUuid((SimpleRequest.getUUIDV105(itemType.analog, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeGatewayEndpointAnalogAccess(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setUuid((SimpleRequest.getUUIDV85(itemType.analog, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeGatewayEndpointAnalogAccess(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddGatewayEndpointAnalogAccessReq req = new com.cisco.axl.api._10.AddGatewayEndpointAnalogAccessReq();
		com.cisco.axl.api._10.XGatewayEndpointAnalogAccess params = new com.cisco.axl.api._10.XGatewayEndpointAnalogAccess();
		
		/**
		 * We set the item parameters
		 */
		params.setGatewayUuid(SimpleRequest.getUUIDV105(itemType.gateway, this.gatewayName).getUuid());
		params.setUnit(this.unit);
		params.setSubunit(new JAXBElement(new QName("subunit"), String.class, this.subunit));
		
		com.cisco.axl.api._10.XGatewayEndpointAnalog endPoint = new com.cisco.axl.api._10.XGatewayEndpointAnalog();
		endPoint.setIndex(this.index);
		endPoint.setName(this.getName());//Name
		endPoint.setDescription(this.description);
		endPoint.setProduct(this.productType);
		endPoint.setClazz(this.phoneClass);
		endPoint.setProtocol(this.protocol);
		endPoint.setProtocolSide(this.protocolSide);
		endPoint.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.phoneCss));
		endPoint.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class, this.devicePool));
		endPoint.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.location));
		endPoint.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class, this.commonDeviceConfigName));
		endPoint.setAarNeighborhoodName(new JAXBElement(new QName("aarNeighborhoodName"), com.cisco.axl.api._10.XFkType.class, this.aarNeighborhoodName));
		endPoint.setAutomatedAlternateRoutingCssName(new JAXBElement(new QName("automatedAlternateRoutingCssName"), com.cisco.axl.api._10.XFkType.class, this.automatedAlternateRoutingCssName));
		
		com.cisco.axl.api._10.XAnalogPort analogPort = new com.cisco.axl.api._10.XAnalogPort();
		
		analogPort.setPortNumber(this.portNumber);
		
		//Line
		com.cisco.axl.api._10.XAnalogPort.Lines myLines = new com.cisco.axl.api._10.XAnalogPort.Lines();
		
		com.cisco.axl.api._10.XPhoneLine myLine = new com.cisco.axl.api._10.XPhoneLine();
		myLine.setLabel(line.getLineLabel());
		myLine.setIndex(Integer.toString(line.getLineIndex()));
		myLine.setDisplay(line.getLineDisplay());
		myLine.setDisplayAscii(line.getLineDisplayAscii());
		myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
		
		com.cisco.axl.api._10.XDirn myDirn = new com.cisco.axl.api._10.XDirn();
		myDirn.setPattern(line.getLineNumber());
		myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, line.getRoutePartition()));
		
		myLine.setDirn(myDirn);
		
		myLines.setLine(myLine);
		
		analogPort.setLines(myLines);
		/************/
		
		endPoint.setPort(analogPort);
		params.setEndpoint(endPoint);
		
		req.setGatewayEndpointAnalogAccess(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addGatewayEndpointAnalogAccess(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddPhoneReq req = new com.cisco.axl.api._8.AddPhoneReq();
		com.cisco.axl.api._8.XPhone params = new com.cisco.axl.api._8.XPhone();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.productType);
		params.setClazz(this.phoneClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class, this.phoneCss));
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._8.XFkType.class, this.devicePool));
		params.setLocationName(SimpleRequest.getUUIDV85(itemType.location, this.location));
		
		
		//Line
		com.cisco.axl.api._8.XPhone.Lines myLines = new com.cisco.axl.api._8.XPhone.Lines();
		
		com.cisco.axl.api._8.XPhoneLine myLine = new com.cisco.axl.api._8.XPhoneLine();
		myLine.setLabel(line.getLineLabel());
		myLine.setAsciiLabel(line.getLineLabel());
		myLine.setIndex(Integer.toString(line.getLineIndex()));
		myLine.setDisplay(line.getLineDisplay());
		myLine.setDisplayAscii(line.getLineDisplayAscii());
		myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
		
		com.cisco.axl.api._8.XDirn myDirn = new com.cisco.axl.api._8.XDirn();
		myDirn.setPattern(line.getLineNumber());
		myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, line.getRoutePartition()));
		
		myLine.setDirn(myDirn);
		
		myLines.getLine().add(myLine);
		
		params.setLines(myLines);
		/************/
		
		req.setPhone(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addPhone(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdatePhoneReq req = new com.cisco.axl.api._10.UpdatePhoneReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.devicePool))req.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class, this.devicePool));
		if(tuList.contains(toUpdate.location))req.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.location));
		if(tuList.contains(toUpdate.phoneCss))req.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.phoneCss));
		if(tuList.contains(toUpdate.commonDeviceConfigName))req.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class, this.commonDeviceConfigName));
		if(tuList.contains(toUpdate.aarNeighborhoodName))req.setAarNeighborhoodName(new JAXBElement(new QName("aarNeighborhoodName"), com.cisco.axl.api._10.XFkType.class, this.aarNeighborhoodName));
		if(tuList.contains(toUpdate.automatedAlternateRoutingCssName))req.setAutomatedAlternateRoutingCssName(new JAXBElement(new QName("automatedAlternateRoutingCssName"), com.cisco.axl.api._10.XFkType.class, this.automatedAlternateRoutingCssName));
		
		//Line
		if(tuList.contains(toUpdate.line))
			{
			com.cisco.axl.api._10.UpdatePhoneReq.Lines myLines = new com.cisco.axl.api._10.UpdatePhoneReq.Lines();
			
			com.cisco.axl.api._10.XPhoneLine myLine = new com.cisco.axl.api._10.XPhoneLine();
			myLine.setLabel(line.getLineLabel());
			myLine.setIndex(Integer.toString(line.getLineIndex()));
			myLine.setDisplay(line.getLineDisplay());
			myLine.setDisplayAscii(line.getLineDisplayAscii());
			myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
			
			com.cisco.axl.api._10.XDirn myDirn = new com.cisco.axl.api._10.XDirn();
			myDirn.setPattern(line.getLineNumber());
			myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, line.getRoutePartition()));
			
			myLine.setDirn(myDirn);
			
			myLines.getLine().add(myLine);
			
			req.setLines(myLines);
			}
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updatePhone(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdatePhoneReq req = new com.cisco.axl.api._8.UpdatePhoneReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updatePhone(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessReq req = new com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessReq();
		
		/*******************
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		//Temp
		com.cisco.axl.api._10.RGatewayEndpointAnalogAccess returnedTags = new com.cisco.axl.api._10.RGatewayEndpointAnalogAccess();
		returnedTags.setUuid("");
		req.setReturnedTags(returnedTags);
		//Temp
		
		com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessRes resp = Variables.getAXLConnectionToCUCMV105().getGatewayEndpointAnalogAccess(req);//We send the request to the CUCM
		
		GatewayEndpointAnalogAccess myAnalog = new GatewayEndpointAnalogAccess(this.getName());
		myAnalog.setUUID(resp.getReturn().getGatewayEndpointAnalogAccess().getUuid());
		
		//etc..
		//Has to be written
		
		return myAnalog;//Return a phone
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetPhoneReq req = new com.cisco.axl.api._8.GetPhoneReq();
		
		/*******************
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		//Temp
		com.cisco.axl.api._8.RPhone returnedTags = new com.cisco.axl.api._8.RPhone();
		returnedTags.setUuid("");
		req.setReturnedTags(returnedTags);
		//Temp
		
		com.cisco.axl.api._8.GetPhoneRes resp = Variables.getAXLConnectionToCUCM85().getPhone(req);//We send the request to the CUCM
		
		Phone myPhone = new Phone(this.getName());
		myPhone.setUUID(resp.getReturn().getPhone().getUuid());
		//etc..
		//Has to be written
		
		return myPhone;//Return a phone
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

	public String getProductType()
		{
		return productType;
		}

	public void setProductType(String productType)
		{
		this.productType = productType;
		}

	public String getPhoneClass()
		{
		return phoneClass;
		}

	public void setPhoneClass(String phoneClass)
		{
		this.phoneClass = phoneClass;
		}

	public String getProtocol()
		{
		return protocol;
		}

	public void setProtocol(String protocol)
		{
		this.protocol = protocol;
		}

	public String getProtocolSide()
		{
		return protocolSide;
		}

	public void setProtocolSide(String protocolSide)
		{
		this.protocolSide = protocolSide;
		}

	public String getPhoneCss()
		{
		return phoneCss;
		}

	public void setPhoneCss(String phoneCss)
		{
		this.phoneCss = phoneCss;
		}

	public String getDevicePool()
		{
		return devicePool;
		}

	public void setDevicePool(String devicePool)
		{
		this.devicePool = devicePool;
		}

	public String getLocation()
		{
		return location;
		}

	public void setLocation(String location)
		{
		this.location = location;
		}

	public PhoneLine getLine()
		{
		return line;
		}

	public void setLine(PhoneLine line)
		{
		this.line = line;
		}

	public String getCommonDeviceConfigName()
		{
		return commonDeviceConfigName;
		}

	public void setCommonDeviceConfigName(String commonDeviceConfigName)
		{
		this.commonDeviceConfigName = commonDeviceConfigName;
		}

	public String getAarNeighborhoodName()
		{
		return aarNeighborhoodName;
		}

	public void setAarNeighborhoodName(String aarNeighborhoodName)
		{
		this.aarNeighborhoodName = aarNeighborhoodName;
		}

	public String getAutomatedAlternateRoutingCssName()
		{
		return automatedAlternateRoutingCssName;
		}

	public void setAutomatedAlternateRoutingCssName(
			String automatedAlternateRoutingCssName)
		{
		this.automatedAlternateRoutingCssName = automatedAlternateRoutingCssName;
		}

	public String getGatewayName()
		{
		return gatewayName;
		}

	public void setGatewayName(String gatewayName)
		{
		this.gatewayName = gatewayName;
		}

	public String getUnit()
		{
		return unit;
		}

	public void setUnit(String unit)
		{
		this.unit = unit;
		}

	public String getSubunit()
		{
		return subunit;
		}

	public void setSubunit(String subunit)
		{
		this.subunit = subunit;
		}

	public String getIndex()
		{
		return index;
		}

	public void setIndex(String index)
		{
		this.index = index;
		}

	public String getPortNumber()
		{
		return portNumber;
		}

	public void setPortNumber(String portNumber)
		{
		this.portNumber = portNumber;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

