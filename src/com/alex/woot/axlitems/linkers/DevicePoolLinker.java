package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.linkers.PhoneLinker.toUpdate;
import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.office.items.DevicePool;
import com.alex.woot.soap.items.LocalRouteGroup;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


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
	
	public enum toUpdate implements ToUpdate
		{
		callManagerGroupName,
		regionName,
		locationName,
		networkLocale,
		dateTimeSettingName,
		srstreference,
		mediaressourcegrouplist,
		localroutegroup,
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
		callingPartyTransformationCSS
		}
	
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
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
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
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeDevicePool(deleteReq);//We send the request to the CUCM
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
		params.setMediaResourceListName(new JAXBElement(new QName("mediaResourceListName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.mediaresourcegrouplist, this.mediaressourcegrouplist)));
		params.setPhysicalLocationName(new JAXBElement(new QName("physicalLocationName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.physicallocation, this.physicallocation)));
		params.setDeviceMobilityGroupName(new JAXBElement(new QName("deviceMobilityGroupName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.devicemobilitygroup, this.devicemobilitygroup)));
		params.setMobilityCssName(new JAXBElement(new QName("mobilityCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.devicemobilitycss)));
		params.setCgpnTransformationCssName(new JAXBElement(new QName("cgpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cgpnTransformationCssName)));
		params.setCdpnTransformationCssName(new JAXBElement(new QName("cdpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cdpnTransformationCssName)));
		params.setCallingPartyNationalTransformationCssName(new JAXBElement(new QName("callingPartyNationalTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyNationalTransformationCssName)));
		params.setCallingPartyInternationalTransformationCssName(new JAXBElement(new QName("callingPartyInternationalTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyInternationalTransformationCssName)));
		params.setCallingPartyUnknownTransformationCssName(new JAXBElement(new QName("callingPartyUnknownTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyUnknownTransformationCssName)));
		params.setCallingPartySubscriberTransformationCssName(new JAXBElement(new QName("callingPartySubscriberTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartySubscriberTransformationCssName)));
		params.setCntdPnTransformationCssName(new JAXBElement(new QName("cntdPnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cntdPnTransformationCssName)));
		params.setRedirectingPartyTransformationCSS(new JAXBElement(new QName("redirectingPartyTransformationCSS"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.redirectingPartyTransformationCSS)));
		params.setCallingPartyTransformationCSS(new JAXBElement(new QName("callingPartyTransformationCSS"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyTransformationCSS)));	
		/************/
		
		/**
		 * Localroutegroup
		 */
		for(LocalRouteGroup lrg : localRouteGroupList)
			{
			com.cisco.axl.api._10.XDevicePool.LocalRouteGroup myLRG = new com.cisco.axl.api._10.XDevicePool.LocalRouteGroup();
			myLRG.setName(new JAXBElement(new QName("name"), String.class, lrg.getName()));
			myLRG.setValue(lrg.getValue());
			params.getLocalRouteGroup().add(myLRG);
			}
		/****/
		
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
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addDevicePool(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateDevicePoolReq req = new com.cisco.axl.api._10.UpdateDevicePoolReq();
		com.cisco.axl.api._10.UpdateDevicePoolReq.LocalRouteGroup myLRG = new com.cisco.axl.api._10.UpdateDevicePoolReq.LocalRouteGroup();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.regionName))req.setRegionName(SimpleRequest.getUUIDV105(itemType.region, this.regionName));
		if(tuList.contains(toUpdate.dateTimeSettingName))req.setDateTimeSettingName(SimpleRequest.getUUIDV105(itemType.datetimesetting, this.dateTimeSettingName));
		if(tuList.contains(toUpdate.callManagerGroupName))req.setCallManagerGroupName(SimpleRequest.getUUIDV105(itemType.callmanagergroup, this.callManagerGroupName));
		if(tuList.contains(toUpdate.srstreference))req.setSrstName(SimpleRequest.getUUIDV105(itemType.srstreference, this.srstreference));
		if(tuList.contains(toUpdate.networkLocale))req.setNetworkLocale(new JAXBElement(new QName("networkLocale"), String.class,this.networkLocale));
		if(tuList.contains(toUpdate.locationName))req.setLocationName(new JAXBElement(new QName("locationName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.location, this.locationName)));
		if(tuList.contains(toUpdate.mediaressourcegrouplist))req.setMediaResourceListName(new JAXBElement(new QName("mediaResourceListName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.mediaresourcegrouplist, this.mediaressourcegrouplist)));
		if(tuList.contains(toUpdate.physicallocation))req.setPhysicalLocationName(new JAXBElement(new QName("physicalLocationName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.physicallocation, this.physicallocation)));
		if(tuList.contains(toUpdate.devicemobilitygroup))req.setDeviceMobilityGroupName(new JAXBElement(new QName("deviceMobilityGroupName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.devicemobilitygroup, this.devicemobilitygroup)));
		if(tuList.contains(toUpdate.devicemobilitycss))req.setMobilityCssName(new JAXBElement(new QName("mobilityCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.devicemobilitycss)));
		if(tuList.contains(toUpdate.cgpnTransformationCssName))req.setCgpnTransformationCssName(new JAXBElement(new QName("cgpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cgpnTransformationCssName)));
		if(tuList.contains(toUpdate.cdpnTransformationCssName))req.setCdpnTransformationCssName(new JAXBElement(new QName("cdpnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cdpnTransformationCssName)));
		if(tuList.contains(toUpdate.callingPartyNationalTransformationCssName))req.setCallingPartyNationalTransformationCssName(new JAXBElement(new QName("callingPartyNationalTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyNationalTransformationCssName)));
		if(tuList.contains(toUpdate.callingPartyInternationalTransformationCssName))req.setCallingPartyInternationalTransformationCssName(new JAXBElement(new QName("callingPartyInternationalTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyInternationalTransformationCssName)));
		if(tuList.contains(toUpdate.callingPartyUnknownTransformationCssName))req.setCallingPartyUnknownTransformationCssName(new JAXBElement(new QName("callingPartyUnknownTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyUnknownTransformationCssName)));
		if(tuList.contains(toUpdate.callingPartySubscriberTransformationCssName))req.setCallingPartySubscriberTransformationCssName(new JAXBElement(new QName("callingPartySubscriberTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartySubscriberTransformationCssName)));
		if(tuList.contains(toUpdate.cntdPnTransformationCssName))req.setCntdPnTransformationCssName(new JAXBElement(new QName("cntdPnTransformationCssName"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.cntdPnTransformationCssName)));
		if(tuList.contains(toUpdate.redirectingPartyTransformationCSS))req.setRedirectingPartyTransformationCSS(new JAXBElement(new QName("redirectingPartyTransformationCSS"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.redirectingPartyTransformationCSS)));
		if(tuList.contains(toUpdate.callingPartyTransformationCSS))req.setCallingPartyTransformationCSS(new JAXBElement(new QName("callingPartyTransformationCSS"), com.cisco.axl.api._10.XFkType.class,SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.callingPartyTransformationCSS)));
		
		//Local Route Group
		if(tuList.contains(toUpdate.localroutegroup))
			{
			for(LocalRouteGroup lrg : localRouteGroupList)
				{
				myLRG.setName(new JAXBElement(new QName("name"), String.class, lrg.getName()));//To improve with a variables
				myLRG.setValue(lrg.getValue());
				req.getLocalRouteGroup().add(myLRG);
				}
			}
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateDevicePool(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateDevicePoolReq req = new com.cisco.axl.api._8.UpdateDevicePoolReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		req.setMediaResourceListName(new JAXBElement(new QName("mediaResourceListName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.mediaresourcegrouplist, this.mediaressourcegrouplist)));
		req.setLocalRouteGroupName(new JAXBElement(new QName("localRouteGroupName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.routegroup, this.localRouteGroupList.get(0).getValue())));
		req.setPhysicalLocationName(new JAXBElement(new QName("physicalLocationName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.physicallocation, this.physicallocation)));
		req.setDeviceMobilityGroupName(new JAXBElement(new QName("deviceMobilityGroupName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.devicemobilitygroup, this.devicemobilitygroup)));
		req.setMobilityCssName(new JAXBElement(new QName("mobilityCssName"), com.cisco.axl.api._8.XFkType.class,SimpleRequest.getUUIDV85(itemType.callingsearchspace, this.devicemobilitycss)));
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateDevicePool(req);//We send the request to the CUCM
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
		
		com.cisco.axl.api._8.GetDevicePoolRes resp = Variables.getAXLConnectionToCUCM85().getDevicePool(req);//We send the request to the CUCM
		
		DevicePool myDP = new DevicePool(this.getName());
		myDP.setUUID(resp.getReturn().getDevicePool().getUuid());
		
		/*
		to be written
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

	public ArrayList<LocalRouteGroup> getLocalroutegroupList()
		{
		return localRouteGroupList;
		}

	public void setLocalroutegroupList(ArrayList<LocalRouteGroup> localroutegroupList)
		{
		this.localRouteGroupList = localroutegroupList;
		}




	
	/*2018*//*RATEL Alexandre 8)*/
	}

