package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.TrunkSipLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SipTrunkDestination;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Device Pool"
 * 
 * @author RATEL Alexandre
 **********************************/

public class TrunkSip extends ItemToInject
	{
	/**
	 * Variables
	 */
	private TrunkSipLinker myTrunkSip;
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
	public TrunkSip(String name, Workbook myWorkbook,
			String description,
			String callingSearchSpaceName,
			String devicePoolName, String commonDeviceConfigName,
			String locationName, String securityProfileName,
			String sipProfileName, String callingPTransformationCssName,
			String useDevicePoolCallingPTransformCss,
			String calledPTransformationCssName,
			String useDevicePoolCalledPTransformCss,
			String subscribeCallingSearchSpaceName,
			String rerouteCallingSearchSpaceName, String unknownPrefix,
			String unknownStripDigits, String cgpnTransformationUnknownCssName,
			String useDevicePoolCgpnTransformCssUnkn,
			ArrayList<SipTrunkDestination> myDestinations) throws Exception
		{
		super(itemType.trunksip, name, myWorkbook);
		myTrunkSip = new TrunkSipLinker(name);
		this.description = description;
		this.product = "SIP Trunk";
		this.xClass = "Trunk";
		this.protocol = "SIP";
		this.protocolSide = "Network";
		this.callingSearchSpaceName = callingSearchSpaceName;
		this.devicePoolName = devicePoolName;
		this.commonDeviceConfigName = commonDeviceConfigName;
		this.locationName = locationName;
		this.securityProfileName = securityProfileName;
		this.sipProfileName = sipProfileName;
		this.callingPTransformationCssName = callingPTransformationCssName;
		this.useDevicePoolCallingPTransformCss = useDevicePoolCallingPTransformCss;
		this.calledPTransformationCssName = calledPTransformationCssName;
		this.useDevicePoolCalledPTransformCss = useDevicePoolCalledPTransformCss;
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		this.sipTrunkType = "None(Default)";
		this.rerouteCallingSearchSpaceName = rerouteCallingSearchSpaceName;
		this.unknownPrefix = unknownPrefix;
		this.unknownStripDigits = unknownStripDigits;
		this.cgpnTransformationUnknownCssName = cgpnTransformationUnknownCssName;
		this.useDevicePoolCgpnTransformCssUnkn = useDevicePoolCgpnTransformCssUnkn;
		this.myDestinations = myDestinations;
		}

	public TrunkSip(String name) throws Exception
		{
		super(itemType.trunksip, name);
		myTrunkSip = new TrunkSipLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myTrunkSip.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myTrunkSip.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myTrunkSip.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			TrunkSip myT = (TrunkSip) myTrunkSip.get();
			this.UUID = myT.getUUID();
			//Has to be written
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "+
		UUID+" "+
		description+" "+
		product+" "+
		xClass+" "+
		protocol+" "+
		protocolSide+" "+
		callingSearchSpaceName+" "+
		devicePoolName+" "+
		commonDeviceConfigName+" "+
		locationName+" "+
		securityProfileName+" "+
		sipProfileName+" "+
		callingPTransformationCssName+" "+
		useDevicePoolCallingPTransformCss+" "+
		calledPTransformationCssName+" "+
		useDevicePoolCalledPTransformCss+" "+
		subscribeCallingSearchSpaceName+" "+
		sipTrunkType+" "+
		rerouteCallingSearchSpaceName+" "+
		unknownPrefix+" "+
		unknownStripDigits+" "+
		cgpnTransformationUnknownCssName+" "+
		useDevicePoolCgpnTransformCssUnkn;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(name, myWorkbook);
		description = CollectionTools.getValueFromCollectionFile(description, myWorkbook);
		callingSearchSpaceName = CollectionTools.getValueFromCollectionFile(callingSearchSpaceName, myWorkbook);
		devicePoolName = CollectionTools.getValueFromCollectionFile(devicePoolName, myWorkbook);
		commonDeviceConfigName = CollectionTools.getValueFromCollectionFile(commonDeviceConfigName, myWorkbook);
		locationName = CollectionTools.getValueFromCollectionFile(locationName, myWorkbook);
		securityProfileName = CollectionTools.getValueFromCollectionFile(securityProfileName, myWorkbook);
		sipProfileName = CollectionTools.getValueFromCollectionFile(sipProfileName, myWorkbook);
		callingPTransformationCssName = CollectionTools.getValueFromCollectionFile(callingPTransformationCssName, myWorkbook);
		useDevicePoolCallingPTransformCss = CollectionTools.getValueFromCollectionFile(useDevicePoolCallingPTransformCss, myWorkbook);
		calledPTransformationCssName = CollectionTools.getValueFromCollectionFile(calledPTransformationCssName, myWorkbook);
		useDevicePoolCalledPTransformCss = CollectionTools.getValueFromCollectionFile(useDevicePoolCalledPTransformCss, myWorkbook);
		subscribeCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(subscribeCallingSearchSpaceName, myWorkbook);
		rerouteCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(rerouteCallingSearchSpaceName, myWorkbook);
		unknownPrefix = CollectionTools.getValueFromCollectionFile(unknownPrefix, myWorkbook);
		unknownStripDigits = CollectionTools.getValueFromCollectionFile(unknownStripDigits, myWorkbook);
		cgpnTransformationUnknownCssName = CollectionTools.getValueFromCollectionFile(cgpnTransformationUnknownCssName, myWorkbook);
		useDevicePoolCgpnTransformCssUnkn = CollectionTools.getValueFromCollectionFile(useDevicePoolCgpnTransformCssUnkn, myWorkbook);
		
		for(SipTrunkDestination d : myDestinations)
			{
			d.setAddressIpv4(CollectionTools.getValueFromCollectionFile(d.getAddressIpv4(), myWorkbook).trim());
			}
		
		/**
		 * We set the item parameters
		 */
		myTrunkSip.setName(name);
		myTrunkSip.setDescription(description);
		myTrunkSip.setCalledPTransformationCssName(calledPTransformationCssName);
		myTrunkSip.setCallingPTransformationCssName(callingPTransformationCssName);
		myTrunkSip.setCallingSearchSpaceName(subscribeCallingSearchSpaceName);
		myTrunkSip.setCommonDeviceConfigName(commonDeviceConfigName);
		myTrunkSip.setDevicePoolName(devicePoolName);
		myTrunkSip.setLocationName(locationName);
		myTrunkSip.setMyDestinations(myDestinations);
		myTrunkSip.setProduct(product);
		myTrunkSip.setProtocol(protocol);
		myTrunkSip.setProtocolSide(protocolSide);
		myTrunkSip.setSecurityProfileName(securityProfileName);
		myTrunkSip.setSipProfileName(sipProfileName);
		myTrunkSip.setSipTrunkType(sipTrunkType);
		myTrunkSip.setSubscribeCallingSearchSpaceName(subscribeCallingSearchSpaceName);
		myTrunkSip.setUseDevicePoolCalledPTransformCss(useDevicePoolCalledPTransformCss);
		myTrunkSip.setUseDevicePoolCallingPTransformCss(useDevicePoolCallingPTransformCss);
		myTrunkSip.setxClass(xClass);
		myTrunkSip.setRerouteCallingSearchSpaceName(rerouteCallingSearchSpaceName);
		myTrunkSip.setUnknownPrefix(unknownPrefix);
		myTrunkSip.setUnknownStripDigits(unknownStripDigits);
		myTrunkSip.setUseDevicePoolCgpnTransformCssUnkn(useDevicePoolCgpnTransformCssUnkn);
		myTrunkSip.setCgpnTransformationUnknownCssName(cgpnTransformationUnknownCssName);
		/*********/
		}
	
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
		unknownPrefix = unknownPrefix;
		}

	public String getUnknownStripDigits()
		{
		return unknownStripDigits;
		}

	public void setUnknownStripDigits(String unknownStripDigits)
		{
		unknownStripDigits = unknownStripDigits;
		}

	public String getCgpnTransformationUnknownCssName()
		{
		return cgpnTransformationUnknownCssName;
		}

	public void setCgpnTransformationUnknownCssName(
			String cgpnTransformationUnknownCssName)
		{
		cgpnTransformationUnknownCssName = cgpnTransformationUnknownCssName;
		}

	public String getUseDevicePoolCgpnTransformCssUnkn()
		{
		return useDevicePoolCgpnTransformCssUnkn;
		}

	public void setUseDevicePoolCgpnTransformCssUnkn(
			String useDevicePoolCgpnTransformCssUnkn)
		{
		useDevicePoolCgpnTransformCssUnkn = useDevicePoolCgpnTransformCssUnkn;
		}

	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

