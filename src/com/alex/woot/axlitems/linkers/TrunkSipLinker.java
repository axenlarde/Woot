package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;
import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.misc.SipTrunkDestination;
import com.alex.yuza.site.TrunkSip;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class TrunkSipLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	product,//"SIP Trunk"
	xClass,//Trunk
	protocol,//SIP
	protocolSide,//User
	callingSearchSpaceName,
	devicePoolName,
	commonDeviceConfigName,
	locationName,
	securityProfileName,
	sipProfileName,
	callingPTransformationCssName,
	useDevicePoolCallingPTransformCss,
	calledPTransformationCssName,
	useDevicePoolCalledPTransformCss,
	subscribeCallingSearchSpaceName,
	sipTrunkType,//None(Default)
	rerouteCallingSearchSpaceName,
	unknownPrefix,
	unknownStripDigits,
	cgpnTransformationUnknownCssName,
	useDevicePoolCgpnTransformCssUnkn;
	
	private ArrayList<SipTrunkDestination> myDestinations;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public TrunkSipLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeSipTrunk(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeSipTrunk(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddSipTrunkReq req = new com.cisco.axl.api._10.AddSipTrunkReq();
		com.cisco.axl.api._10.XSipTrunk params = new com.cisco.axl.api._10.XSipTrunk();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.product);
		params.setClazz(this.xClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingSearchSpaceName)));
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.devicepool, this.devicePoolName)));
		params.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.commondeviceconfig, this.commonDeviceConfigName)));
		params.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.locationName));
		params.setSecurityProfileName(new JAXBElement(new QName("securityProfileName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.siptrunksecurityprofile, this.securityProfileName)));
		params.setSipProfileName(new JAXBElement(new QName("sipProfileName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.sipprofile, this.sipProfileName)));
		params.setCgpnTransformationCssName(new JAXBElement(new QName("cgpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPTransformationCssName)));
		params.setUseDevicePoolCgpnTransformCss(this.useDevicePoolCallingPTransformCss);
		params.setCdpnTransformationCssName(new JAXBElement(new QName("cdpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.calledPTransformationCssName)));
		params.setUseDevicePoolCdpnTransformCss(this.useDevicePoolCalledPTransformCss);
		params.setSubscribeCallingSearchSpaceName(new JAXBElement(new QName("subscribeCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.subscribeCallingSearchSpaceName)));
		params.setSipTrunkType(this.sipTrunkType);
		params.setRerouteCallingSearchSpaceName(new JAXBElement(new QName("rerouteCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.rerouteCallingSearchSpaceName)));
		params.setUnknownPrefix(unknownPrefix);
		params.setUnknownStripDigits(new JAXBElement(new QName("unknownStripDigits"), BigInteger.class, unknownStripDigits));
		params.setCgpnTransformationUnknownCssName(new JAXBElement(new QName("cgpnTransformationUnknownCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cgpnTransformationUnknownCssName)));
		params.setUseDevicePoolCgpnTransformCssUnkn(useDevicePoolCgpnTransformCssUnkn);
		
		com.cisco.axl.api._10.XSipTrunk.Destinations myDest = new com.cisco.axl.api._10.XSipTrunk.Destinations();
		
		for(SipTrunkDestination sipDest : this.myDestinations)
			{
			com.cisco.axl.api._10.XSipTrunkDestination mySTD = new com.cisco.axl.api._10.XSipTrunkDestination();
			mySTD.setAddressIpv4(sipDest.getAddressIpv4());
			mySTD.setPort(sipDest.getPort());
			mySTD.setSortOrder(Integer.toString(sipDest.getOrder()));
			
			myDest.getDestination().add(mySTD);
			}
		
		params.setDestinations(myDest);
		/************/
		
		req.setSipTrunk(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addSipTrunk(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddSipTrunkReq req = new com.cisco.axl.api._8.AddSipTrunkReq();
		com.cisco.axl.api._8.XSipTrunk params = new com.cisco.axl.api._8.XSipTrunk();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.product);
		params.setClazz(this.xClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.callingSearchSpaceName)));
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.devicepool, this.devicePoolName)));
		params.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.commondeviceconfig, this.commonDeviceConfigName)));
		params.setLocationName(SimpleRequest.getUUIDV85(itemType.location, this.locationName));
		params.setSecurityProfileName(new JAXBElement(new QName("securityProfileName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.siptrunksecurityprofile, this.securityProfileName)));
		params.setSipProfileName(new JAXBElement(new QName("sipProfileName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.sipprofile, this.sipProfileName)));
		params.setCgpnTransformationCssName(new JAXBElement(new QName("cgpnTransformationCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.callingPTransformationCssName)));
		params.setUseDevicePoolCgpnTransformCss(this.useDevicePoolCallingPTransformCss);
		params.setCdpnTransformationCssName(new JAXBElement(new QName("cdpnTransformationCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.calledPTransformationCssName)));
		params.setUseDevicePoolCdpnTransformCss(this.useDevicePoolCalledPTransformCss);
		params.setSubscribeCallingSearchSpaceName(new JAXBElement(new QName("subscribeCallingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.subscribeCallingSearchSpaceName)));
		params.setSipTrunkType(this.sipTrunkType);
		params.setRerouteCallingSearchSpaceName(new JAXBElement(new QName("rerouteCallingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.rerouteCallingSearchSpaceName)));
		params.setUnknownPrefix(unknownPrefix);
		params.setUnknownStripDigits(new JAXBElement(new QName("unknownStripDigits"), BigInteger.class, unknownStripDigits));
		params.setCgpnTransformationUnknownCssName(new JAXBElement(new QName("cgpnTransformationUnknownCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.cgpnTransformationUnknownCssName)));
		params.setUseDevicePoolCgpnTransformCssUnkn(useDevicePoolCgpnTransformCssUnkn);
		
		com.cisco.axl.api._8.XSipTrunk.Destinations myDest = new com.cisco.axl.api._8.XSipTrunk.Destinations();
		
		for(SipTrunkDestination sipDest : this.myDestinations)
			{
			com.cisco.axl.api._8.XSipTrunkDestination mySTD = new com.cisco.axl.api._8.XSipTrunkDestination();
			mySTD.setAddressIpv4(sipDest.getAddressIpv4());
			mySTD.setPort(sipDest.getPort());
			mySTD.setSortOrder(Integer.toString(sipDest.getOrder()));
			
			myDest.getDestination().add(mySTD);
			}
		
		params.setDestinations(myDest);
		/************/
		
		req.setSipTrunk(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addSipTrunk(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateSipTrunkReq req = new com.cisco.axl.api._10.UpdateSipTrunkReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateSipTrunk(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateSipTrunkReq req = new com.cisco.axl.api._8.UpdateSipTrunkReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateSipTrunk(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetSipTrunkReq req = new com.cisco.axl.api._10.GetSipTrunkReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetSipTrunkRes resp = Variables.getAXLConnectionToCUCMV105().getSipTrunk(req);//We send the request to the CUCM
		
		TrunkSip myT = new TrunkSip(this.getName());
		myT.setUUID(resp.getReturn().getSipTrunk().getUuid());
		
		//Has to be written
		
		return myT;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetSipTrunkReq req = new com.cisco.axl.api._8.GetSipTrunkReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetSipTrunkRes resp = Variables.getAXLConnectionToCUCM().getSipTrunk(req);//We send the request to the CUCM
		
		TrunkSip myT = new TrunkSip(this.getName());
		myT.setUUID(resp.getReturn().getSipTrunk().getUuid());
		
		//Has to be written
		
		return myT;//Return a location
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

	public String getProduct()
		{
		return product;
		}

	public void setProduct(String product)
		{
		this.product = product;
		}

	public String getxClass()
		{
		return xClass;
		}

	public void setxClass(String xClass)
		{
		this.xClass = xClass;
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

	public String getCallingSearchSpaceName()
		{
		return callingSearchSpaceName;
		}

	public void setCallingSearchSpaceName(String callingSearchSpaceName)
		{
		this.callingSearchSpaceName = callingSearchSpaceName;
		}

	public String getDevicePoolName()
		{
		return devicePoolName;
		}

	public void setDevicePoolName(String devicePoolName)
		{
		this.devicePoolName = devicePoolName;
		}

	public String getCommonDeviceConfigName()
		{
		return commonDeviceConfigName;
		}

	public void setCommonDeviceConfigName(String commonDeviceConfigName)
		{
		this.commonDeviceConfigName = commonDeviceConfigName;
		}

	public String getLocationName()
		{
		return locationName;
		}

	public void setLocationName(String locationName)
		{
		this.locationName = locationName;
		}

	public String getSecurityProfileName()
		{
		return securityProfileName;
		}

	public void setSecurityProfileName(String securityProfileName)
		{
		this.securityProfileName = securityProfileName;
		}

	public String getSipProfileName()
		{
		return sipProfileName;
		}

	public void setSipProfileName(String sipProfileName)
		{
		this.sipProfileName = sipProfileName;
		}

	public String getCallingPTransformationCssName()
		{
		return callingPTransformationCssName;
		}

	public void setCallingPTransformationCssName(
			String callingPTransformationCssName)
		{
		this.callingPTransformationCssName = callingPTransformationCssName;
		}

	public String getUseDevicePoolCallingPTransformCss()
		{
		return useDevicePoolCallingPTransformCss;
		}

	public void setUseDevicePoolCallingPTransformCss(
			String useDevicePoolCallingPTransformCss)
		{
		this.useDevicePoolCallingPTransformCss = useDevicePoolCallingPTransformCss;
		}

	public String getCalledPTransformationCssName()
		{
		return calledPTransformationCssName;
		}

	public void setCalledPTransformationCssName(String calledPTransformationCssName)
		{
		this.calledPTransformationCssName = calledPTransformationCssName;
		}

	public String getUseDevicePoolCalledPTransformCss()
		{
		return useDevicePoolCalledPTransformCss;
		}

	public void setUseDevicePoolCalledPTransformCss(
			String useDevicePoolCalledPTransformCss)
		{
		this.useDevicePoolCalledPTransformCss = useDevicePoolCalledPTransformCss;
		}

	public String getSubscribeCallingSearchSpaceName()
		{
		return subscribeCallingSearchSpaceName;
		}

	public void setSubscribeCallingSearchSpaceName(
			String subscribeCallingSearchSpaceName)
		{
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		}

	public String getSipTrunkType()
		{
		return sipTrunkType;
		}

	public void setSipTrunkType(String sipTrunkType)
		{
		this.sipTrunkType = sipTrunkType;
		}

	public ArrayList<SipTrunkDestination> getMyDestinations()
		{
		return myDestinations;
		}

	public void setMyDestinations(ArrayList<SipTrunkDestination> myDestinations)
		{
		this.myDestinations = myDestinations;
		}

	public String getRerouteCallingSearchSpaceName()
		{
		return rerouteCallingSearchSpaceName;
		}

	public void setRerouteCallingSearchSpaceName(
			String rerouteCallingSearchSpaceName)
		{
		this.rerouteCallingSearchSpaceName = rerouteCallingSearchSpaceName;
		}

	public String getUnknownPrefix()
		{
		return unknownPrefix;
		}

	public void setUnknownPrefix(String unknownPrefix)
		{
		this.unknownPrefix = unknownPrefix;
		}

	public String getUnknownStripDigits()
		{
		return unknownStripDigits;
		}

	public void setUnknownStripDigits(String unknownStripDigits)
		{
		this.unknownStripDigits = unknownStripDigits;
		}

	public String getCgpnTransformationUnknownCssName()
		{
		return cgpnTransformationUnknownCssName;
		}

	public void setCgpnTransformationUnknownCssName(
			String cgpnTransformationUnknownCssName)
		{
		this.cgpnTransformationUnknownCssName = cgpnTransformationUnknownCssName;
		}

	public String getUseDevicePoolCgpnTransformCssUnkn()
		{
		return useDevicePoolCgpnTransformCssUnkn;
		}

	public void setUseDevicePoolCgpnTransformCssUnkn(
			String useDevicePoolCgpnTransformCssUnkn)
		{
		this.useDevicePoolCgpnTransformCssUnkn = useDevicePoolCgpnTransformCssUnkn;
		}

	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

