package com.alex.woot.office.items;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.axlitems.linkers.DevicePoolLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;


/**********************************
 * Class used to define an item of type "Device Pool"
 * 
 * @author RATEL Alexandre
 **********************************/

public class DevicePool extends ItemToInject
	{
	/**
	 * Variables
	 */
	private DevicePoolLinker myDevicePool;
	private String callManagerGroupName,
	regionName,
	locationName,
	networkLocale,
	dateTimeSettingName,
	srstreference,
	mediaressourcegrouplist,
	localroutegroup,
	physicallocation,
	devicemobilitygroup,
	devicemobilitycss;

	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public DevicePool(String name,
			String callManagerGroupName,
			String regionName, String locationName, String networkLocale,
			String dateTimeSettingName, String srstreference,
			String mediaressourcegrouplist, String localroutegroup,
			String physicallocation, String devicemobilitygroup,
			String devicemobilitycss) throws Exception
		{
		super(itemType.devicepool, name);
		myDevicePool = new DevicePoolLinker(name);
		this.callManagerGroupName = callManagerGroupName;
		this.regionName = regionName;
		this.locationName = locationName;
		this.networkLocale = networkLocale;
		this.dateTimeSettingName = dateTimeSettingName;
		this.srstreference = srstreference;
		this.mediaressourcegrouplist = mediaressourcegrouplist;
		this.localroutegroup = localroutegroup;
		this.physicallocation = physicallocation;
		this.devicemobilitygroup = devicemobilitygroup;
		this.devicemobilitycss = devicemobilitycss;
		}

	public DevicePool(String name) throws Exception
		{
		super(itemType.devicepool, name);
		myDevicePool = new DevicePoolLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		this.errorList = myDevicePool.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myDevicePool.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myDevicePool.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myDevicePool.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			DevicePool myDP = (DevicePool) myDevicePool.get();
			this.UUID = myDP.getUUID();
			
			/*
			this.regionName = myDP.getRegionName();
			this.locationName = myDP.getLocationName();
			this.networkLocale = myDP.getNetworkLocale();
			this.dateTimeSettingName = myDP.getDateTimeSettingName();
			this.srstreference = myDP.getSrstreference();
			this.mediaressourcegrouplist = myDP.getMediaressourcegrouplist();
			this.localroutegroup = myDP.getLocalroutegroup();
			this.physicallocation = myDP.getPhysicallocation();
			this.devicemobilitygroup = myDP.getDevicemobilitygroup();
			this.devicemobilitycss = myDP.getDevicemobilitycss();
			*/
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
		+UUID+" "
		+regionName+" "
		+locationName+" "
		+networkLocale+" "
		+dateTimeSettingName+" "
		+srstreference+" "
		+mediaressourcegrouplist+" "
		+localroutegroup+" "
		+physicallocation+" "
		+devicemobilitygroup+" "
		+devicemobilitycss;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getValueFromCollectionFile(this.getName());
		
		/**
		 * Here we check if the CallManagerGroup has to be treated a special way
		 */
		if(callManagerGroupName.equals("site.cmg"))
			{
			this.callManagerGroupName = CollectionTools.getCurrentSite(myWorkbook).getCmg();
			}
		else
			{
			//Normal CMG
			this.callManagerGroupName = CollectionTools.getValueFromCollectionFile(callManagerGroupName, myWorkbook);
			}
		
		this.regionName = CollectionTools.getValueFromCollectionFile(this.regionName, myWorkbook);
		this.locationName = CollectionTools.getValueFromCollectionFile(locationName, myWorkbook);
		this.networkLocale = CollectionTools.getValueFromCollectionFile(networkLocale, myWorkbook);
		this.dateTimeSettingName = CollectionTools.getValueFromCollectionFile(dateTimeSettingName, myWorkbook);
		this.srstreference = CollectionTools.getValueFromCollectionFile(srstreference, myWorkbook);
		this.mediaressourcegrouplist = CollectionTools.getValueFromCollectionFile(mediaressourcegrouplist, myWorkbook);
		this.localroutegroup = CollectionTools.getValueFromCollectionFile(localroutegroup, myWorkbook);
		this.physicallocation = CollectionTools.getValueFromCollectionFile(physicallocation, myWorkbook);
		this.devicemobilitygroup = CollectionTools.getValueFromCollectionFile(devicemobilitygroup, myWorkbook);
		this.devicemobilitycss = CollectionTools.getValueFromCollectionFile(devicemobilitycss, myWorkbook);
		
		/**
		 * We set the item parameters
		 */
		myDevicePool.setName(this.getName());
		myDevicePool.setCallManagerGroupName(this.callManagerGroupName);
		myDevicePool.setDateTimeSettingName(this.dateTimeSettingName);
		myDevicePool.setDevicemobilitycss(this.devicemobilitycss);
		myDevicePool.setDevicemobilitygroup(this.devicemobilitygroup);
		myDevicePool.setLocalroutegroup(this.localroutegroup);
		myDevicePool.setLocationName(this.locationName);
		myDevicePool.setMediaressourcegrouplist(this.mediaressourcegrouplist);
		myDevicePool.setNetworkLocale(this.networkLocale);
		myDevicePool.setPhysicallocation(this.physicallocation);
		myDevicePool.setRegionName(this.regionName);
		myDevicePool.setSrstreference(this.srstreference);
		/*********/
		}

	public DevicePoolLinker getMyDevicePool()
		{
		return myDevicePool;
		}

	public void setMyDevicePool(DevicePoolLinker myDevicePool)
		{
		this.myDevicePool = myDevicePool;
		}

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public String getRegionName()
		{
		return regionName;
		}

	public void setRegionName(String regionName)
		{
		this.regionName = regionName;
		}

	public String getLocationName()
		{
		return locationName;
		}

	public void setLocationName(String locationName)
		{
		this.locationName = locationName;
		}

	public String getNetworkLocale()
		{
		return networkLocale;
		}

	public void setNetworkLocale(String networkLocale)
		{
		this.networkLocale = networkLocale;
		}

	public String getDateTimeSettingName()
		{
		return dateTimeSettingName;
		}

	public void setDateTimeSettingName(String dateTimeSettingName)
		{
		this.dateTimeSettingName = dateTimeSettingName;
		}

	public String getSrstreference()
		{
		return srstreference;
		}

	public void setSrstreference(String srstreference)
		{
		this.srstreference = srstreference;
		}

	public String getMediaressourcegrouplist()
		{
		return mediaressourcegrouplist;
		}

	public void setMediaressourcegrouplist(String mediaressourcegrouplist)
		{
		this.mediaressourcegrouplist = mediaressourcegrouplist;
		}

	public String getLocalroutegroup()
		{
		return localroutegroup;
		}

	public void setLocalroutegroup(String localroutegroup)
		{
		this.localroutegroup = localroutegroup;
		}

	public String getPhysicallocation()
		{
		return physicallocation;
		}

	public void setPhysicallocation(String physicallocation)
		{
		this.physicallocation = physicallocation;
		}

	public String getDevicemobilitygroup()
		{
		return devicemobilitygroup;
		}

	public void setDevicemobilitygroup(String devicemobilitygroup)
		{
		this.devicemobilitygroup = devicemobilitygroup;
		}

	public String getDevicemobilitycss()
		{
		return devicemobilitycss;
		}

	public void setDevicemobilitycss(String devicemobilitycss)
		{
		this.devicemobilitycss = devicemobilitycss;
		}

	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

