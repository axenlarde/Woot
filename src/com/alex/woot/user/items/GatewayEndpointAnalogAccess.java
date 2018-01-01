package com.alex.woot.user.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.GatewayEndpointAnalogAccessLinker;
import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.PhoneService;
import com.alex.woot.misc.SpeedDial;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Class used to define an item of type "Phone"
 * 
 * @author RATEL Alexandre
 **********************************/

public class GatewayEndpointAnalogAccess extends ItemToInject
	{
	/**
	 * Variables
	 */
	private GatewayEndpointAnalogAccessLinker myAnalog;
	private String targetName,
	description,
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
	indexPort,
	portNumber;
	
	private PhoneLine line;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public GatewayEndpointAnalogAccess(String targetName,
			String name,
			String description, String productType,
			String protocol,
			String phoneCss, String devicePool, String location,
			String commonDeviceConfigName,String aarNeighborhoodName,
			String automatedAlternateRoutingCssName,
			PhoneLine line) throws Exception
		{
		super(itemType.analog, name);
		myAnalog = new GatewayEndpointAnalogAccessLinker(name);
		this.targetName = targetName;
		this.description = description;
		this.productType = productType;
		this.phoneClass = "Phone";
		this.protocol = protocol;
		this.protocolSide = "User";
		this.phoneCss = phoneCss;
		this.devicePool = devicePool;
		this.location = location;
		this.line = line;
		this.commonDeviceConfigName = commonDeviceConfigName;
		this.aarNeighborhoodName = aarNeighborhoodName;
		this.automatedAlternateRoutingCssName = automatedAlternateRoutingCssName;
		}

	public GatewayEndpointAnalogAccess(String name) throws Exception
		{
		super(itemType.phone, name);
		myAnalog = new GatewayEndpointAnalogAccessLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		this.errorList = myAnalog.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myAnalog.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myAnalog.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myAnalog.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			GatewayEndpointAnalogAccess myPh = (GatewayEndpointAnalogAccess) myAnalog.get();
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
		location = CollectionTools.getValueFromCollectionFile(index, location, this, false);
		productType = CollectionTools.getValueFromCollectionFile(index, productType, this, true);
		phoneCss = CollectionTools.getValueFromCollectionFile(index, phoneCss, this, false);
		protocol = CollectionTools.getValueFromCollectionFile(index, protocol, this, true);
		commonDeviceConfigName = CollectionTools.getValueFromCollectionFile(index, commonDeviceConfigName, this, false);
		aarNeighborhoodName = CollectionTools.getValueFromCollectionFile(index, aarNeighborhoodName, this, false);
		automatedAlternateRoutingCssName = CollectionTools.getValueFromCollectionFile(index, automatedAlternateRoutingCssName, this, false);
		
		/**
		 * We set the item parameters
		 */
		myAnalog.setName(this.getName());
		myAnalog.setDescription(this.description);
		myAnalog.setDevicePool(this.devicePool);
		myAnalog.setLine(this.line);
		myAnalog.setLocation(this.location);
		myAnalog.setPhoneClass(this.phoneClass);
		myAnalog.setProductType(this.productType);
		myAnalog.setPhoneCss(this.phoneCss);
		myAnalog.setProtocol(this.protocol);
		myAnalog.setProtocolSide(this.protocolSide);
		myAnalog.setCommonDeviceConfigName(commonDeviceConfigName);
		myAnalog.setAarNeighborhoodName(aarNeighborhoodName);
		myAnalog.setAutomatedAlternateRoutingCssName(automatedAlternateRoutingCssName);
		myAnalog.setGatewayName(gatewayName);
		myAnalog.setUnit(unit);
		myAnalog.setSubunit(subunit);
		myAnalog.setIndex(indexPort);
		myAnalog.setPortNumber(portNumber);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(phoneCss))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.phoneCss);
		if(UsefulMethod.isNotEmpty(devicePool))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.devicePool);
		if(UsefulMethod.isNotEmpty(location))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.location);
		if(UsefulMethod.isNotEmpty(commonDeviceConfigName))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.commonDeviceConfigName);
		if(UsefulMethod.isNotEmpty(aarNeighborhoodName))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.aarNeighborhoodName);
		if(UsefulMethod.isNotEmpty(automatedAlternateRoutingCssName))tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.automatedAlternateRoutingCssName);
		
		if(line != null)tuList.add(GatewayEndpointAnalogAccessLinker.toUpdate.line);
		}

	public String getTargetName()
		{
		return targetName;
		}

	public void setTargetName(String targetName)
		{
		this.targetName = targetName;
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

	public String getIndexPort()
		{
		return indexPort;
		}

	public void setIndexPort(String indexPort)
		{
		this.indexPort = indexPort;
		}

	public String getPortNumber()
		{
		return portNumber;
		}

	public void setPortNumber(String portNumber)
		{
		this.portNumber = portNumber;
		}

	public PhoneLine getLine()
		{
		return line;
		}

	public void setLine(PhoneLine line)
		{
		this.line = line;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}
	
	
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

