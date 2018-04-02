package com.alex.woot.user.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.soap.items.PhoneService;
import com.alex.woot.soap.items.SpeedDial;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Class used to define an item of type "Phone"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Phone extends ItemToInject
	{
	/**
	 * Variables
	 */
	private PhoneLinker myPhone;
	private String targetName,
	description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneButtonTemplate,
	phoneCss,
	devicePool,
	location,
	commonDeviceConfigName,
	aarNeighborhoodName,
	automatedAlternateRoutingCssName,
	subscribeCallingSearchSpaceName,
	rerouteCallingSearchSpaceName,
	enableExtensionMobility,
	commonPhoneConfigName,
	securityProfileName,
	deviceMobilityMode;
	
	private ArrayList<PhoneService> serviceList;
	private ArrayList<PhoneLine> lineList;
	private ArrayList<SpeedDial> sdList;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Phone(String targetName,
			String name,
			String description, String productType,
			String protocol, String phoneButtonTemplate,
			String phoneCss, String devicePool, String location,
			String commonDeviceConfigName,String aarNeighborhoodName,
			String automatedAlternateRoutingCssName,String subscribeCallingSearchSpaceName,
			String rerouteCallingSearchSpaceName,
			ArrayList<PhoneService> serviceList,
			ArrayList<PhoneLine> lineList,
			String enableExtensionMobility,
			ArrayList<SpeedDial> sdList,
			String commonPhoneConfigName, String securityProfileName,
			String deviceMobilityMode) throws Exception
		{
		super(itemType.phone, name);
		myPhone = new PhoneLinker(name);
		this.targetName = targetName;
		this.description = description;
		this.productType = productType;
		this.phoneClass = "Phone";
		this.protocol = protocol;
		this.protocolSide = "User";
		this.phoneButtonTemplate = phoneButtonTemplate;
		this.phoneCss = phoneCss;
		this.devicePool = devicePool;
		this.location = location;
		this.serviceList = serviceList;
		this.lineList = lineList;
		this.sdList = sdList;
		this.commonDeviceConfigName = commonDeviceConfigName;
		this.aarNeighborhoodName = aarNeighborhoodName;
		this.automatedAlternateRoutingCssName = automatedAlternateRoutingCssName;
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		this.rerouteCallingSearchSpaceName = rerouteCallingSearchSpaceName;
		this.enableExtensionMobility = enableExtensionMobility;
		this.securityProfileName = securityProfileName;
		this.commonPhoneConfigName = commonPhoneConfigName;
		this.deviceMobilityMode = deviceMobilityMode;
		}

	public Phone(String name) throws Exception
		{
		super(itemType.phone, name);
		myPhone = new PhoneLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myPhone.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myPhone.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myPhone.delete();
		}

	/**
	 * Method used to update data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myPhone.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Phone myPh = (Phone) myPhone.get();
			this.UUID = myPh.getUUID();
			//Etc...
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
		return name+" "
		+UUID;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name, this, true);
		description = CollectionTools.getValueFromCollectionFile(index, description, this, false);//The "false" means that this value can be empty
		devicePool = CollectionTools.getValueFromCollectionFile(index, devicePool, this, true);
		enableExtensionMobility = CollectionTools.getValueFromCollectionFile(index, enableExtensionMobility, this, false);
		location = CollectionTools.getValueFromCollectionFile(index, location, this, false);
		phoneButtonTemplate = CollectionTools.getValueFromCollectionFile(index, phoneButtonTemplate, this, true);
		productType = CollectionTools.getValueFromCollectionFile(index, productType, this, true);
		phoneCss = CollectionTools.getValueFromCollectionFile(index, phoneCss, this, false);
		protocol = CollectionTools.getValueFromCollectionFile(index, protocol, this, true);
		commonDeviceConfigName = CollectionTools.getValueFromCollectionFile(index, commonDeviceConfigName, this, false);
		aarNeighborhoodName = CollectionTools.getValueFromCollectionFile(index, aarNeighborhoodName, this, false);
		automatedAlternateRoutingCssName = CollectionTools.getValueFromCollectionFile(index, automatedAlternateRoutingCssName, this, false);
		subscribeCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(index, subscribeCallingSearchSpaceName, this, false);
		rerouteCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(index, rerouteCallingSearchSpaceName, this, false);
		commonPhoneConfigName = CollectionTools.getValueFromCollectionFile(index, commonPhoneConfigName, this, false);
		securityProfileName = CollectionTools.getValueFromCollectionFile(index, securityProfileName, this, false);
		deviceMobilityMode = CollectionTools.getValueFromCollectionFile(index, deviceMobilityMode, this, false);
		
		/**
		 * We fetch the errors and corrections from the lists
		 */
		//PhoneLine
		for(PhoneLine pl : lineList)
			{
			this.getErrorList().addAll(pl.getErrorList());
			this.getCorrectionList().addAll(pl.getCorrectionList());
			}
		
		//Services
		for(PhoneService s : serviceList)
			{
			this.getErrorList().addAll(s.getErrorList());
			this.getCorrectionList().addAll(s.getCorrectionList());
			}
		
		//SD a BLF
		for(SpeedDial sd : sdList)
			{
			this.getErrorList().addAll(sd.getErrorList());
			this.getCorrectionList().addAll(sd.getCorrectionList());
			}
		
		
		/**
		 * We set the item parameters
		 */
		myPhone.setName(this.getName());
		myPhone.setDescription(this.description);
		myPhone.setDevicePool(this.devicePool);
		myPhone.setEnableExtensionMobility(this.enableExtensionMobility);
		myPhone.setLineList(this.lineList);
		myPhone.setLocation(this.location);
		myPhone.setPhoneButtonTemplate(this.phoneButtonTemplate);
		myPhone.setPhoneClass(this.phoneClass);
		myPhone.setProductType(this.productType);
		myPhone.setPhoneCss(this.phoneCss);
		myPhone.setProtocol(this.protocol);
		myPhone.setProtocolSide(this.protocolSide);
		myPhone.setServiceList(this.serviceList);
		myPhone.setSdList(sdList);
		myPhone.setCommonDeviceConfigName(commonDeviceConfigName);
		myPhone.setAarNeighborhoodName(aarNeighborhoodName);
		myPhone.setAutomatedAlternateRoutingCssName(automatedAlternateRoutingCssName);
		myPhone.setSubscribeCallingSearchSpaceName(subscribeCallingSearchSpaceName);
		myPhone.setRerouteCallingSearchSpaceName(rerouteCallingSearchSpaceName);
		myPhone.setCommonPhoneConfigName(commonPhoneConfigName);
		myPhone.setSecurityProfileName(securityProfileName);
		myPhone.setDeviceMobilityMode(deviceMobilityMode);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(PhoneLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(phoneButtonTemplate))tuList.add(PhoneLinker.toUpdate.phoneButtonTemplate);
		if(UsefulMethod.isNotEmpty(phoneCss))tuList.add(PhoneLinker.toUpdate.phoneCss);
		if(UsefulMethod.isNotEmpty(devicePool))tuList.add(PhoneLinker.toUpdate.devicePool);
		if(UsefulMethod.isNotEmpty(location))tuList.add(PhoneLinker.toUpdate.location);
		if(UsefulMethod.isNotEmpty(commonDeviceConfigName))tuList.add(PhoneLinker.toUpdate.commonDeviceConfigName);
		if(UsefulMethod.isNotEmpty(aarNeighborhoodName))tuList.add(PhoneLinker.toUpdate.aarNeighborhoodName);
		if(UsefulMethod.isNotEmpty(automatedAlternateRoutingCssName))tuList.add(PhoneLinker.toUpdate.automatedAlternateRoutingCssName);
		if(UsefulMethod.isNotEmpty(subscribeCallingSearchSpaceName))tuList.add(PhoneLinker.toUpdate.subscribeCallingSearchSpaceName);
		if(UsefulMethod.isNotEmpty(rerouteCallingSearchSpaceName))tuList.add(PhoneLinker.toUpdate.rerouteCallingSearchSpaceName);
		if(UsefulMethod.isNotEmpty(commonPhoneConfigName))tuList.add(PhoneLinker.toUpdate.commonPhoneConfigName);
		if(UsefulMethod.isNotEmpty(securityProfileName))tuList.add(PhoneLinker.toUpdate.securityProfileName);
		if(UsefulMethod.isNotEmpty(deviceMobilityMode))tuList.add(PhoneLinker.toUpdate.deviceMobilityMode);
		
		if(UsefulMethod.isNotEmpty(enableExtensionMobility))tuList.add(PhoneLinker.toUpdate.enableExtensionMobility);
		if((serviceList != null) && (serviceList.size() != 0))tuList.add(PhoneLinker.toUpdate.service);
		if((sdList != null) && (sdList.size() != 0))tuList.add(PhoneLinker.toUpdate.sd);
		if((lineList != null) && (lineList.size() != 0))tuList.add(PhoneLinker.toUpdate.line);
		}
	
	public PhoneLinker getMyPhone()
		{
		return myPhone;
		}

	public void setMyPhone(PhoneLinker myPhone)
		{
		this.myPhone = myPhone;
		}

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

	public String getPhoneButtonTemplate()
		{
		return phoneButtonTemplate;
		}

	public void setPhoneButtonTemplate(String phoneButtonTemplate)
		{
		this.phoneButtonTemplate = phoneButtonTemplate;
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

	public ArrayList<PhoneService> getServiceList()
		{
		return serviceList;
		}

	public void setServiceList(ArrayList<PhoneService> serviceList)
		{
		this.serviceList = serviceList;
		}

	public ArrayList<PhoneLine> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<PhoneLine> lineList)
		{
		this.lineList = lineList;
		}

	public String getEnableExtensionMobility()
		{
		return enableExtensionMobility;
		}

	public void setEnableExtensionMobility(String enableExtensionMobility)
		{
		this.enableExtensionMobility = enableExtensionMobility;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public ArrayList<SpeedDial> getSdList()
		{
		return sdList;
		}

	public void setSdList(ArrayList<SpeedDial> sdList)
		{
		this.sdList = sdList;
		}

	public String getTargetName()
		{
		return targetName;
		}

	public void setTargetName(String targetName)
		{
		this.targetName = targetName;
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

	public String getSubscribeCallingSearchSpaceName()
		{
		return subscribeCallingSearchSpaceName;
		}

	public void setSubscribeCallingSearchSpaceName(
			String subscribeCallingSearchSpaceName)
		{
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
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

	public String getCommonPhoneConfigName()
		{
		return commonPhoneConfigName;
		}

	public void setCommonPhoneConfigName(String commonPhoneConfigName)
		{
		this.commonPhoneConfigName = commonPhoneConfigName;
		}

	public String getSecurityProfileName()
		{
		return securityProfileName;
		}

	public void setSecurityProfileName(String securityProfileName)
		{
		this.securityProfileName = securityProfileName;
		}

	public String getDeviceMobilityMode()
		{
		return deviceMobilityMode;
		}

	public void setDeviceMobilityMode(String deviceMobilityMode)
		{
		this.deviceMobilityMode = deviceMobilityMode;
		}

	
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

