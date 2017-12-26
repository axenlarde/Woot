package com.alex.woot.office.items;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.ConferenceBridgeLinker;
import com.alex.yuza.axlitems.DevicePoolLinker;
import com.alex.yuza.axlitems.LocationLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

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
			String devicepool, String location, String commondeviceconfiguration, Workbook myWorkbook) throws Exception
		{
		super(itemType.conferencebridge, name, myWorkbook);
		myConferenceBridge = new ConferenceBridgeLinker(name);
		this.description = description;
		this.devicepool = devicepool;
		this.location = location;
		this.commondeviceconfiguration = commondeviceconfiguration;
		
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
		myConferenceBridge.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			ConferenceBridge myCFB = (ConferenceBridge) myConferenceBridge.get();
			this.UUID = myCFB.getUUID();
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
		//Has to be written for further uses
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

