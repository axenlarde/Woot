package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.DevicePool;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class DevicePoolLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
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
	public DevicePoolLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeDevicePool(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeDevicePool(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddDevicePoolReq req = new com.cisco.axl.api._10.AddDevicePoolReq();
		com.cisco.axl.api._10.XDevicePool params = new com.cisco.axl.api._10.XDevicePool();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setRegionName(SimpleRequest.getUUIDV105(itemType.region, this.regionName));
		params.setDateTimeSettingName(SimpleRequest.getUUIDV105(itemType.datetimesetting, this.dateTimeSettingName));
		params.setCallManagerGroupName(SimpleRequest.getUUIDV105(itemType.callmanagergroup, this.callManagerGroupName));
		params.setSrstName(SimpleRequest.getUUIDV105(itemType.srstreference, this.srstreference));
		params.setNetworkLocale(new JAXBElement(new QName("networkLocale"), String.class,this.networkLocale));
		params.setLocationName(new JAXBElement(new QName("locationName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.location, this.locationName)));
		/************/
		
		req.setDevicePool(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addDevicePool(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddDevicePoolReq req = new com.cisco.axl.api._8.AddDevicePoolReq();
		com.cisco.axl.api._8.XDevicePool params = new com.cisco.axl.api._8.XDevicePool();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setRegionName(SimpleRequest.getUUIDV85(itemType.region, this.regionName));
		params.setDateTimeSettingName(SimpleRequest.getUUIDV85(itemType.datetimesetting, this.dateTimeSettingName));
		params.setCallManagerGroupName(SimpleRequest.getUUIDV85(itemType.callmanagergroup, this.callManagerGroupName));
		params.setSrstName(SimpleRequest.getUUIDV85(itemType.srstreference, this.srstreference));
		params.setNetworkLocale(new JAXBElement(new QName("networkLocale"), String.class,this.networkLocale));
		params.setLocationName(new JAXBElement(new QName("locationName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.location, this.locationName)));
		/************/
		
		req.setDevicePool(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addDevicePool(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateDevicePoolReq req = new com.cisco.axl.api._10.UpdateDevicePoolReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		req.setMediaResourceListName(new JAXBElement(new QName("mediaResourceListName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.mediaressourcegrouplist, this.mediaressourcegrouplist)));
		req.setLocalRouteGroupName(SimpleRequest.getUUIDV105(itemType.routegroup, this.localroutegroup));
		req.setPhysicalLocationName(new JAXBElement(new QName("physicalLocationName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.physicallocation, this.physicallocation)));
		req.setDeviceMobilityGroupName(new JAXBElement(new QName("deviceMobilityGroupName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.devicemobilitygroup, this.devicemobilitygroup)));
		req.setMobilityCssName(new JAXBElement(new QName("mobilityCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.devicemobilitycss)));
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateDevicePool(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateDevicePoolReq req = new com.cisco.axl.api._8.UpdateDevicePoolReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		req.setMediaResourceListName(new JAXBElement(new QName("mediaResourceListName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.mediaressourcegrouplist, this.mediaressourcegrouplist)));
		req.setLocalRouteGroupName(new JAXBElement(new QName("localRouteGroupName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.routegroup, this.localroutegroup)));
		req.setPhysicalLocationName(new JAXBElement(new QName("physicalLocationName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.physicallocation, this.physicallocation)));
		req.setDeviceMobilityGroupName(new JAXBElement(new QName("deviceMobilityGroupName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.devicemobilitygroup, this.devicemobilitygroup)));
		req.setMobilityCssName(new JAXBElement(new QName("mobilityCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.devicemobilitycss)));
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateDevicePool(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetDevicePoolReq req = new com.cisco.axl.api._10.GetDevicePoolReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetDevicePoolRes resp = Variables.getAXLConnectionToCUCMV105().getDevicePool(req);//We send the request to the CUCM
		
		DevicePool myDP = new DevicePool(this.getName());
		myDP.setUUID(resp.getReturn().getDevicePool().getUuid());
		
		//Has to be written
		
		return myDP;//Return a Device Pool
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetDevicePoolReq req = new com.cisco.axl.api._8.GetDevicePoolReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetDevicePoolRes resp = Variables.getAXLConnectionToCUCM().getDevicePool(req);//We send the request to the CUCM
		
		DevicePool myDP = new DevicePool(this.getName());
		myDP.setUUID(resp.getReturn().getDevicePool().getUuid());
		
		/*
		myDP.setRegionName(resp.getReturn().getDevicePool().getRegionName().getValue());
		myDP.setLocationName(resp.getReturn().getDevicePool().getLocationName().getValue()); 
		myDP.setNetworkLocale(resp.getReturn().getDevicePool().getNetworkLocale());
		myDP.setDateTimeSettingName(resp.getReturn().getDevicePool().getDateTimeSettingName().getValue());
		myDP.setSrstreference(resp.getReturn().getDevicePool().getSrstName().getValue());
		myDP.setMediaressourcegrouplist(resp.getReturn().getDevicePool().getMediaResourceListName().getValue());
		myDP.setLocalroutegroup(resp.getReturn().getDevicePool().getLocalRouteGroupName().getValue());
		myDP.setPhysicallocation(resp.getReturn().getDevicePool().getPhysicalLocationName().getValue());
		myDP.setDevicemobilitygroup(resp.getReturn().getDevicePool().getDeviceMobilityGroupName().getValue());
		myDP.setDevicemobilitycss(resp.getReturn().getDevicePool().getMobilityCssName().getValue());
		*/
		
		return myDP;//Return a Device Pool
		}
	/****************/

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

