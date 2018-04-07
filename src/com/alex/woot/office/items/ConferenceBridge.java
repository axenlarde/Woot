package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.ConferenceBridgeLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Conference Bridge"
 * 
 * @author RATEL Alexandre
 **********************************/

public class ConferenceBridge extends ItemToInject
	{
	/**
	 * Variables
	 */
	private ConferenceBridgeLinker myConferenceBridge;
	private String description,
	devicepool,
	location,
	commondeviceconfiguration;
	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public ConferenceBridge(String name, String description,
			String devicepool, String location, String commondeviceconfiguration) throws Exception
		{
		super(itemType.conferencebridge, name);
		myConferenceBridge = new ConferenceBridgeLinker(name);
		this.description = description;
		this.devicepool = devicepool;
		this.location = location;
		this.commondeviceconfiguration = commondeviceconfiguration;
		}

	public ConferenceBridge(String name) throws Exception
		{
		super(itemType.conferencebridge, name);
		myConferenceBridge = new ConferenceBridgeLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myConferenceBridge.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{	
		return myConferenceBridge.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myConferenceBridge.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myConferenceBridge.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		ConferenceBridge myCFB = (ConferenceBridge) myConferenceBridge.get();
		this.UUID = myCFB.getUUID();
		//Has to be written
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		description = CollectionTools.getRawValue(description, this, true);
		devicepool = CollectionTools.getRawValue(devicepool, this, true);
		location = CollectionTools.getRawValue(location, this, true);
		commondeviceconfiguration = CollectionTools.getRawValue(commondeviceconfiguration, this, true);
		
		/**
		 * We set the item parameters
		 */
		myConferenceBridge.setName(this.getName());
		myConferenceBridge.setDescription(description);
		myConferenceBridge.setDevicepool(devicepool);
		myConferenceBridge.setLocation(location);
		myConferenceBridge.setCommondeviceconfiguration(commondeviceconfiguration);
		/*********/
		}

	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(ConferenceBridgeLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(devicepool))tuList.add(ConferenceBridgeLinker.toUpdate.devicepool);
		if(UsefulMethod.isNotEmpty(location))tuList.add(ConferenceBridgeLinker.toUpdate.location);
		if(UsefulMethod.isNotEmpty(commondeviceconfiguration))tuList.add(ConferenceBridgeLinker.toUpdate.commondeviceconfiguration);
		}
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getDevicepool()
		{
		return devicepool;
		}

	public void setDevicepool(String devicepool)
		{
		this.devicepool = devicepool;
		}

	public String getLocation()
		{
		return location;
		}

	public void setLocation(String location)
		{
		this.location = location;
		}

	public String getCommondeviceconfiguration()
		{
		return commondeviceconfiguration;
		}

	public void setCommondeviceconfiguration(String commondeviceconfiguration)
		{
		this.commondeviceconfiguration = commondeviceconfiguration;
		}

	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

