package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.DevicePoolLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.LocalRouteGroup;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

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
	physicallocation,
	devicemobilitygroup,
	devicemobilitycss,
	cgpnTransformationCssName,
	cdpnTransformationCssName,
	callingPartyNationalTransformationCssName,
	callingPartyInternationalTransformationCssName,
	callingPartyUnknownTransformationCssName,
	callingPartySubscriberTransformationCssName,
	cntdPnTransformationCssName,
	redirectingPartyTransformationCSS,
	callingPartyTransformationCSS;

	private ArrayList<LocalRouteGroup> localRouteGroupList;
	
	
	public DevicePool(String name, String callManagerGroupName, String regionName, String locationName,
			String networkLocale, String dateTimeSettingName, String srstreference, String mediaressourcegrouplist,
			String physicallocation, String devicemobilitygroup, String devicemobilitycss,
			String cgpnTransformationCssName, String cdpnTransformationCssName,
			String callingPartyNationalTransformationCssName, String callingPartyInternationalTransformationCssName,
			String callingPartyUnknownTransformationCssName, String callingPartySubscriberTransformationCssName,
			String cntdPnTransformationCssName, String redirectingPartyTransformationCSS,
			String callingPartyTransformationCSS, ArrayList<LocalRouteGroup> localRouteGroupList) throws Exception
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
		this.physicallocation = physicallocation;
		this.devicemobilitygroup = devicemobilitygroup;
		this.devicemobilitycss = devicemobilitycss;
		this.cgpnTransformationCssName = cgpnTransformationCssName;
		this.cdpnTransformationCssName = cdpnTransformationCssName;
		this.callingPartyNationalTransformationCssName = callingPartyNationalTransformationCssName;
		this.callingPartyInternationalTransformationCssName = callingPartyInternationalTransformationCssName;
		this.callingPartyUnknownTransformationCssName = callingPartyUnknownTransformationCssName;
		this.callingPartySubscriberTransformationCssName = callingPartySubscriberTransformationCssName;
		this.cntdPnTransformationCssName = cntdPnTransformationCssName;
		this.redirectingPartyTransformationCSS = redirectingPartyTransformationCSS;
		this.callingPartyTransformationCSS = callingPartyTransformationCSS;
		this.localRouteGroupList = localRouteGroupList;
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
		myDevicePool.update(tuList);
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
			to be written
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
		+localRouteGroupList+" "
		+physicallocation+" "
		+devicemobilitygroup+" "
		+devicemobilitycss;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		callManagerGroupName = CollectionTools.getRawValue(callManagerGroupName, this, true);
		regionName = CollectionTools.getRawValue(regionName, this, true);
		locationName = CollectionTools.getRawValue(locationName, this, true);
		networkLocale = CollectionTools.getRawValue(networkLocale, this, false);
		dateTimeSettingName = CollectionTools.getRawValue(dateTimeSettingName, this, true);
		srstreference = CollectionTools.getRawValue(srstreference, this, false);
		mediaressourcegrouplist = CollectionTools.getRawValue(mediaressourcegrouplist, this, false);
		physicallocation = CollectionTools.getRawValue(physicallocation, this, false);
		devicemobilitygroup = CollectionTools.getRawValue(devicemobilitygroup, this, false);
		devicemobilitycss = CollectionTools.getRawValue(devicemobilitycss, this, false);
		cgpnTransformationCssName = CollectionTools.getRawValue(cgpnTransformationCssName, this, false);
		cdpnTransformationCssName = CollectionTools.getRawValue(cdpnTransformationCssName, this, false);
		callingPartyNationalTransformationCssName = CollectionTools.getRawValue(callingPartyNationalTransformationCssName, this, false);
		callingPartyInternationalTransformationCssName = CollectionTools.getRawValue(callingPartyInternationalTransformationCssName, this, false);
		callingPartyUnknownTransformationCssName = CollectionTools.getRawValue(callingPartyUnknownTransformationCssName, this, false);
		callingPartySubscriberTransformationCssName = CollectionTools.getRawValue(callingPartySubscriberTransformationCssName, this, false);
		cntdPnTransformationCssName = CollectionTools.getRawValue(cntdPnTransformationCssName, this, false);
		redirectingPartyTransformationCSS = CollectionTools.getRawValue(redirectingPartyTransformationCSS, this, false);
		callingPartyTransformationCSS = CollectionTools.getRawValue(callingPartyTransformationCSS, this, false);
		
		for(LocalRouteGroup lrg : localRouteGroupList)
			{
			lrg.resolve();
			}
		
		/**
		 * We set the item parameters
		 */
		myDevicePool.setName(this.getName());
		myDevicePool.setCallManagerGroupName(this.callManagerGroupName);
		myDevicePool.setDateTimeSettingName(this.dateTimeSettingName);
		myDevicePool.setDevicemobilitycss(this.devicemobilitycss);
		myDevicePool.setDevicemobilitygroup(this.devicemobilitygroup);
		myDevicePool.setLocalroutegroupList(this.localRouteGroupList);
		myDevicePool.setLocationName(this.locationName);
		myDevicePool.setMediaressourcegrouplist(this.mediaressourcegrouplist);
		myDevicePool.setNetworkLocale(this.networkLocale);
		myDevicePool.setPhysicallocation(this.physicallocation);
		myDevicePool.setRegionName(this.regionName);
		myDevicePool.setSrstreference(this.srstreference);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(callManagerGroupName))tuList.add(DevicePoolLinker.toUpdate.callManagerGroupName);
		if(UsefulMethod.isNotEmpty(regionName))tuList.add(DevicePoolLinker.toUpdate.regionName);
		if(UsefulMethod.isNotEmpty(locationName))tuList.add(DevicePoolLinker.toUpdate.locationName);
		if(UsefulMethod.isNotEmpty(networkLocale))tuList.add(DevicePoolLinker.toUpdate.networkLocale);
		if(UsefulMethod.isNotEmpty(dateTimeSettingName))tuList.add(DevicePoolLinker.toUpdate.dateTimeSettingName);
		if(UsefulMethod.isNotEmpty(srstreference))tuList.add(DevicePoolLinker.toUpdate.srstreference);
		if(UsefulMethod.isNotEmpty(mediaressourcegrouplist))tuList.add(DevicePoolLinker.toUpdate.mediaressourcegrouplist);
		if(UsefulMethod.isNotEmpty(physicallocation))tuList.add(DevicePoolLinker.toUpdate.physicallocation);
		if(UsefulMethod.isNotEmpty(devicemobilitygroup))tuList.add(DevicePoolLinker.toUpdate.devicemobilitygroup);
		if(UsefulMethod.isNotEmpty(devicemobilitycss))tuList.add(DevicePoolLinker.toUpdate.devicemobilitycss);
		if((localRouteGroupList == null) || (localRouteGroupList.size() == 0))
			{
			//Nothing to do
			}
		else
			{
			tuList.add(DevicePoolLinker.toUpdate.localroutegroup);
			}
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

	public String getCgpnTransformationCssName()
		{
		return cgpnTransformationCssName;
		}

	public void setCgpnTransformationCssName(String cgpnTransformationCssName)
		{
		this.cgpnTransformationCssName = cgpnTransformationCssName;
		}

	public String getCdpnTransformationCssName()
		{
		return cdpnTransformationCssName;
		}

	public void setCdpnTransformationCssName(String cdpnTransformationCssName)
		{
		this.cdpnTransformationCssName = cdpnTransformationCssName;
		}

	public String getCallingPartyNationalTransformationCssName()
		{
		return callingPartyNationalTransformationCssName;
		}

	public void setCallingPartyNationalTransformationCssName(String callingPartyNationalTransformationCssName)
		{
		this.callingPartyNationalTransformationCssName = callingPartyNationalTransformationCssName;
		}

	public String getCallingPartyInternationalTransformationCssName()
		{
		return callingPartyInternationalTransformationCssName;
		}

	public void setCallingPartyInternationalTransformationCssName(String callingPartyInternationalTransformationCssName)
		{
		this.callingPartyInternationalTransformationCssName = callingPartyInternationalTransformationCssName;
		}

	public String getCallingPartyUnknownTransformationCssName()
		{
		return callingPartyUnknownTransformationCssName;
		}

	public void setCallingPartyUnknownTransformationCssName(String callingPartyUnknownTransformationCssName)
		{
		this.callingPartyUnknownTransformationCssName = callingPartyUnknownTransformationCssName;
		}

	public String getCallingPartySubscriberTransformationCssName()
		{
		return callingPartySubscriberTransformationCssName;
		}

	public void setCallingPartySubscriberTransformationCssName(String callingPartySubscriberTransformationCssName)
		{
		this.callingPartySubscriberTransformationCssName = callingPartySubscriberTransformationCssName;
		}

	public String getCntdPnTransformationCssName()
		{
		return cntdPnTransformationCssName;
		}

	public void setCntdPnTransformationCssName(String cntdPnTransformationCssName)
		{
		this.cntdPnTransformationCssName = cntdPnTransformationCssName;
		}

	public String getRedirectingPartyTransformationCSS()
		{
		return redirectingPartyTransformationCSS;
		}

	public void setRedirectingPartyTransformationCSS(String redirectingPartyTransformationCSS)
		{
		this.redirectingPartyTransformationCSS = redirectingPartyTransformationCSS;
		}

	public String getCallingPartyTransformationCSS()
		{
		return callingPartyTransformationCSS;
		}

	public void setCallingPartyTransformationCSS(String callingPartyTransformationCSS)
		{
		this.callingPartyTransformationCSS = callingPartyTransformationCSS;
		}

	public ArrayList<LocalRouteGroup> getLocalRouteGroupList()
		{
		return localRouteGroupList;
		}

	public void setLocalRouteGroupList(ArrayList<LocalRouteGroup> localRouteGroupList)
		{
		this.localRouteGroupList = localRouteGroupList;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

