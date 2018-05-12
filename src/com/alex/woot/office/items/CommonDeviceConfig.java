package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.CommonDeviceConfigLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to define an item of type "Common Device Config"
 * 
 * @author RATEL Alexandre
 **********************************/

public class CommonDeviceConfig extends ItemToInject
	{
	/**
	 * Variables
	 */
	public enum AddressingMode
		{
		IPv4Only,
		IPv6Only,
		IPv4AndIPv6
		}
	
	private CommonDeviceConfigLinker myCDC;
	private String softkeyTemplateName,
	userLocale,
	networkHoldMohAudioSourceId,
	userHoldMohAudioSourceId;
	
	private AddressingMode ipAddressingMode;
	
	
	public CommonDeviceConfig(String name, String softkeyTemplateName, String userLocale,
			String networkHoldMohAudioSourceId, String userHoldMohAudioSourceId, AddressingMode ipAddressingMode) throws Exception
		{
		super(itemType.commondeviceconfig, name);
		myCDC = new CommonDeviceConfigLinker(name);
		this.softkeyTemplateName = softkeyTemplateName;
		this.userLocale = userLocale;
		this.networkHoldMohAudioSourceId = networkHoldMohAudioSourceId;
		this.userHoldMohAudioSourceId = userHoldMohAudioSourceId;
		this.ipAddressingMode = ipAddressingMode;
		}
	
	public CommonDeviceConfig(String name) throws Exception
		{
		super(itemType.commondeviceconfig, name);
		myCDC = new CommonDeviceConfigLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList = myCDC.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myCDC.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myCDC.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myCDC.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		CommonDeviceConfig myDP = (CommonDeviceConfig) myCDC.get();
		this.UUID = myDP.getUUID();
		
		/*
		to be written
		*/
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		softkeyTemplateName = CollectionTools.getRawValue(softkeyTemplateName, this, false);
		userLocale = CollectionTools.getRawValue(userLocale, this, false);
		networkHoldMohAudioSourceId = CollectionTools.getRawValue(networkHoldMohAudioSourceId, this, false);
		userHoldMohAudioSourceId = CollectionTools.getRawValue(userHoldMohAudioSourceId, this, false);
		
		/**
		 * We set the item parameters
		 */
		myCDC.setName(this.getName());
		myCDC.setSoftkeyTemplateName(softkeyTemplateName);
		myCDC.setUserLocale(userLocale);
		myCDC.setNetworkHoldMohAudioSourceId(networkHoldMohAudioSourceId);
		myCDC.setUserHoldMohAudioSourceId(userHoldMohAudioSourceId);
		myCDC.setIpAddressingMode(ipAddressingMode);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(softkeyTemplateName))tuList.add(CommonDeviceConfigLinker.toUpdate.softkeyTemplate);
		if(UsefulMethod.isNotEmpty(userLocale))tuList.add(CommonDeviceConfigLinker.toUpdate.userLocale);
		if(UsefulMethod.isNotEmpty(networkHoldMohAudioSourceId))tuList.add(CommonDeviceConfigLinker.toUpdate.networkHoldMohAudioSourceId);
		if(UsefulMethod.isNotEmpty(userHoldMohAudioSourceId))tuList.add(CommonDeviceConfigLinker.toUpdate.userHoldMohAudioSourceId);
		if(ipAddressingMode != null)tuList.add(CommonDeviceConfigLinker.toUpdate.ipAddressingMode);
		}

	public String getSoftkeyTemplateName()
		{
		return softkeyTemplateName;
		}

	public void setSoftkeyTemplateName(String softkeyTemplateName)
		{
		this.softkeyTemplateName = softkeyTemplateName;
		}

	public String getUserLocale()
		{
		return userLocale;
		}

	public void setUserLocale(String userLocale)
		{
		this.userLocale = userLocale;
		}

	public String getNetworkHoldMohAudioSourceId()
		{
		return networkHoldMohAudioSourceId;
		}

	public void setNetworkHoldMohAudioSourceId(String networkHoldMohAudioSourceId)
		{
		this.networkHoldMohAudioSourceId = networkHoldMohAudioSourceId;
		}

	public String getUserHoldMohAudioSourceId()
		{
		return userHoldMohAudioSourceId;
		}

	public void setUserHoldMohAudioSourceId(String userHoldMohAudioSourceId)
		{
		this.userHoldMohAudioSourceId = userHoldMohAudioSourceId;
		}

	public AddressingMode getIpAddressingMode()
		{
		return ipAddressingMode;
		}

	public void setIpAddressingMode(AddressingMode ipAddressingMode)
		{
		this.ipAddressingMode = ipAddressingMode;
		}

	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

