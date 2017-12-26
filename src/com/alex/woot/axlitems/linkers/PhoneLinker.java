package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.PhoneService;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.SpeedDial;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.user.items.Phone;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.sdType;

import java.util.ArrayList;



/**********************************
 * Is the AXLItem design to link the item "Phone"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhoneLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
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
	
	public enum toUpdate implements ToUpdate
		{
		sd,
		blf,
		description,
		phoneCss,
		devicePool,
		location,
		enableExtensionMobility,
		phoneButtonTemplate,
		commonDeviceConfigName,
		commonPhoneConfigName,
		aarNeighborhoodName,
		automatedAlternateRoutingCssName,
		subscribeCallingSearchSpaceName,
		rerouteCallingSearchSpaceName,
		securityProfileName,
		deviceMobilityMode,
		service,
		line
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public PhoneLinker(String name) throws Exception
		{
		super(name);
		serviceList = new ArrayList<PhoneService>();
		lineList = new ArrayList<PhoneLine>();
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
		
		//Here we want to log every error, so we have to use a try/catch for each
		try
			{
			SimpleRequest.getUUIDV105(itemType.phonetemplatename, this.phoneButtonTemplate);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.phoneButtonTemplate, "Not found during init : "+e.getMessage(), itemType.phone, itemType.phonetemplatename, errorType.notFound));
			}
		
		//CSS
		try
			{
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.phoneCss);
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.automatedAlternateRoutingCssName);
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.subscribeCallingSearchSpaceName);
			SimpleRequest.getUUIDV105(itemType.callingsearchspace, this.rerouteCallingSearchSpaceName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.phoneCss, "Not found during init : "+e.getMessage(), itemType.phone, itemType.callingsearchspace, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.devicepool, this.devicePool);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.devicePool, "Not found during init : "+e.getMessage(), itemType.phone, itemType.devicepool, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.location, this.location);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.location, "Not found during init : "+e.getMessage(), itemType.phone, itemType.location, errorType.notFound));
			}
		
		//Service
		try
			{
			for(PhoneService s : this.serviceList)
				{
				SimpleRequest.getUUIDV105(itemType.telecasterservice, s.getServicename());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.phone, itemType.telecasterservice, errorType.notFound));
			}
		
		//Line
		try
			{
			for(PhoneLine line : this.lineList)
				{
				SimpleRequest.getUUIDV105(itemType.partition, line.getRoutePartition());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.phone, itemType.partition, errorType.notFound));
			}
		
		//CDC
		try
			{
			SimpleRequest.getUUIDV105(itemType.commondeviceconfig, this.commonDeviceConfigName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.phone, itemType.commondeviceconfig, errorType.notFound));
			}
		
		//AAR group
		try
			{
			SimpleRequest.getUUIDV105(itemType.aargroup, this.aarNeighborhoodName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.phone, itemType.aargroup, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setUuid((SimpleRequest.getUUIDV105(itemType.phone, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removePhone(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setUuid((SimpleRequest.getUUIDV85(itemType.phone, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removePhone(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddPhoneReq req = new com.cisco.axl.api._10.AddPhoneReq();
		com.cisco.axl.api._10.XPhone params = new com.cisco.axl.api._10.XPhone();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.productType);
		params.setClazz(this.phoneClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._10.XFkType.class, this.phoneButtonTemplate));
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.phoneCss));
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class, this.devicePool));
		params.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.location));
		params.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class, this.commonDeviceConfigName));
		params.setAarNeighborhoodName(new JAXBElement(new QName("aarNeighborhoodName"), com.cisco.axl.api._10.XFkType.class, this.aarNeighborhoodName));
		params.setAutomatedAlternateRoutingCssName(new JAXBElement(new QName("automatedAlternateRoutingCssName"), com.cisco.axl.api._10.XFkType.class, this.automatedAlternateRoutingCssName));
		params.setRerouteCallingSearchSpaceName(new JAXBElement(new QName("rerouteCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.rerouteCallingSearchSpaceName));
		params.setSubscribeCallingSearchSpaceName(new JAXBElement(new QName("subscribeCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.subscribeCallingSearchSpaceName));
		params.setEnableExtensionMobility(enableExtensionMobility);
		params.setCommonPhoneConfigName(SimpleRequest.getUUIDV105(itemType.commonPhoneConfig, this.commonPhoneConfigName));
		params.setSecurityProfileName(new JAXBElement(new QName("securityProfileName"), com.cisco.axl.api._10.XFkType.class, this.securityProfileName));
		params.setDeviceMobilityMode(this.deviceMobilityMode);
		
		//Services
		com.cisco.axl.api._10.XPhone.Services myServs = new com.cisco.axl.api._10.XPhone.Services();
		int i = 1;
		for(PhoneService s : this.serviceList)
			{
			com.cisco.axl.api._10.XSubscribedService myService = new com.cisco.axl.api._10.XSubscribedService();
			myService.setTelecasterServiceName(SimpleRequest.getUUIDV105(itemType.telecasterservice, s.getServicename()));
			myService.setName(s.getServicename());
			myService.setServiceNameAscii(s.getServicename());
			myService.setUrlButtonIndex(Integer.toString(i));
			myService.setUrlLabel(s.getSurl());
			myServs.getService().add(myService);
			i++;
			}
		params.setServices(myServs);
		
		//SD
		com.cisco.axl.api._10.XPhone.Speeddials mySDList = new com.cisco.axl.api._10.XPhone.Speeddials();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.sd))
				{
				com.cisco.axl.api._10.XSpeeddial mySD = new com.cisco.axl.api._10.XSpeeddial();
				mySD.setIndex(Integer.toString(sd.getPosition()));
				mySD.setLabel(sd.getDescription());
				mySD.setDirn(sd.getNumber());
				mySDList.getSpeeddial().add(mySD);
				}
			}
		params.setSpeeddials(mySDList);
		
		//BLF
		com.cisco.axl.api._10.XPhone.BusyLampFields myBLFList = new com.cisco.axl.api._10.XPhone.BusyLampFields();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.blf))
				{
				com.cisco.axl.api._10.XBusyLampField myBLF = new com.cisco.axl.api._10.XBusyLampField();
				myBLF.setIndex(Integer.toString(sd.getPosition()));
				myBLF.setLabel(sd.getDescription());
				
				/****
				 * Here we have to be smart. Indeed, if the destination is a common one
				 * we setup the "BLF destination". But if the destination is an internal one
				 * which need to be supervised, we setup "BLF directory and partition"
				 * 
				 * To know if the destination is internal or not, we have to ask the CUCM first
				 */
				//First we contact the CUCM
				try
					{
					com.cisco.axl.api._10.GetLineReq lineReq = new com.cisco.axl.api._10.GetLineReq();
					lineReq.setPattern(sd.getNumber());
					lineReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, sd.getPartition())));
					com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(lineReq);
					
					//If we reach this point, it means that the line is an internal number
					Variables.getLogger().debug("The following destination is internal, so we create the BLF using supervised destination: "+sd.getNumber());
					myBLF.setBlfDirn(sd.getNumber());
					myBLF.setRoutePartition(sd.getPartition());
					
					//Pickup
					if(sd.isPickup())
						{
						com.cisco.axl.api._10.XBusyLampField.AssociatedBlfSdFeatures myFeatures = new com.cisco.axl.api._10.XBusyLampField.AssociatedBlfSdFeatures();
						myFeatures.getFeature().add("Pickup");
						myBLF.setAssociatedBlfSdFeatures(myFeatures);
						}
					}
				catch (Exception e)
					{
					//If we reach this point, it means that the line is not an internal number
					Variables.getLogger().debug("The following destination is not internal, so we create the BLF using normal destination: "+sd.getNumber());
					myBLF.setBlfDest(sd.getNumber());
					}
				
				myBLFList.getBusyLampField().add(myBLF);
				}
			}
		params.setBusyLampFields(myBLFList);
		
		//Line
		com.cisco.axl.api._10.XPhone.Lines myLines = new com.cisco.axl.api._10.XPhone.Lines();
		for(PhoneLine line : this.lineList)
			{
			com.cisco.axl.api._10.XPhoneLine myLine = new com.cisco.axl.api._10.XPhoneLine();
			myLine.setLabel(line.getLineLabel());
			myLine.setIndex(Integer.toString(line.getLineIndex()));
			myLine.setDisplay(line.getLineDisplay());
			myLine.setDisplayAscii(line.getLineDisplayAscii());
			myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
			
			com.cisco.axl.api._10.XDirn myDirn = new com.cisco.axl.api._10.XDirn();
			myDirn.setPattern(line.getLineNumber());
			myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, line.getRoutePartition()));
			
			myLine.setDirn(myDirn);
			
			myLines.getLine().add(myLine);
			}
		params.setLines(myLines);
		/************/
		
		req.setPhone(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addPhone(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddPhoneReq req = new com.cisco.axl.api._8.AddPhoneReq();
		com.cisco.axl.api._8.XPhone params = new com.cisco.axl.api._8.XPhone();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.productType);
		params.setClazz(this.phoneClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._8.XFkType.class, this.phoneButtonTemplate));
		params.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._8.XFkType.class, this.phoneCss));
		params.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._8.XFkType.class, this.devicePool));
		params.setLocationName(SimpleRequest.getUUIDV85(itemType.location, this.location));
		params.setEnableExtensionMobility(enableExtensionMobility);
		
		//Services
		com.cisco.axl.api._8.XPhone.Services myServs = new com.cisco.axl.api._8.XPhone.Services();
		int i = 1;
		for(PhoneService s : this.serviceList)
			{
			com.cisco.axl.api._8.XSubscribedService myService = new com.cisco.axl.api._8.XSubscribedService();
			myService.setTelecasterServiceName(SimpleRequest.getUUIDV85(itemType.telecasterservice, s.getServicename()));
			myService.setName(s.getServicename());
			myService.setServiceNameAscii(s.getServicename());
			myService.setUrlButtonIndex(Integer.toString(i));
			myService.setUrlLabel(s.getSurl());
			myService.setUrlLabelAscii(s.getSurl());
			myServs.getService().add(myService);
			i++;
			}
		params.setServices(myServs);
		
		//SD
		com.cisco.axl.api._8.XPhone.Speeddials mySDList = new com.cisco.axl.api._8.XPhone.Speeddials();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.sd))
				{
				com.cisco.axl.api._8.XSpeeddial mySD = new com.cisco.axl.api._8.XSpeeddial();
				mySD.setIndex(Integer.toString(sd.getPosition()));
				mySD.setLabel(sd.getDescription());
				mySD.setDirn(sd.getNumber());
				mySDList.getSpeeddial().add(mySD);
				}
			}
		params.setSpeeddials(mySDList);
		
		//BLF
		com.cisco.axl.api._8.XPhone.BusyLampFields myBLFList = new com.cisco.axl.api._8.XPhone.BusyLampFields();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.blf))
				{
				com.cisco.axl.api._8.XBusyLampField myBLF = new com.cisco.axl.api._8.XBusyLampField();
				myBLF.setIndex(Integer.toString(sd.getPosition()));
				myBLF.setLabel(sd.getDescription());
				
				/****
				 * Here we have to be smart. Indeed, if the destination is a common one
				 * we setup the "BLF destination". But if the destination is an internal one
				 * which need to be supervised, we setup "BLF directory and partition"
				 * 
				 * To know if the destination is internal or not, we have to ask the CUCM first
				 */
				//First we contact the CUCM
				try
					{
					com.cisco.axl.api._8.GetLineReq lineReq = new com.cisco.axl.api._8.GetLineReq();
					lineReq.setPattern(sd.getNumber());
					lineReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, sd.getPartition())));
					com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM85().getLine(lineReq);
					
					//If we reach this point, it means that the line is an internal number
					Variables.getLogger().debug("The following destination is internal, so we create the BLF using supervised destination: "+sd.getNumber());
					myBLF.setBlfDirn(sd.getNumber());
					myBLF.setRoutePartition(sd.getPartition());
					
					//Pickup
					if(sd.isPickup())
						{
						com.cisco.axl.api._8.XBusyLampField.AssociatedBlfSdFeatures myFeatures = new com.cisco.axl.api._8.XBusyLampField.AssociatedBlfSdFeatures();
						myFeatures.getFeature().add("Pickup");
						myBLF.setAssociatedBlfSdFeatures(myFeatures);
						}
					}
				catch (Exception e)
					{
					//If we reach this point, it means that the line is not an internal number
					Variables.getLogger().debug("The following destination is not internal, so we create the BLF using normal destination: "+sd.getNumber());
					myBLF.setBlfDest(sd.getNumber());
					}
				
				myBLFList.getBusyLampField().add(myBLF);
				}
			}
		params.setBusyLampFields(myBLFList);
		
		//Line
		com.cisco.axl.api._8.XPhone.Lines myLines = new com.cisco.axl.api._8.XPhone.Lines();
		for(PhoneLine line : this.lineList)
			{
			com.cisco.axl.api._8.XPhoneLine myLine = new com.cisco.axl.api._8.XPhoneLine();
			myLine.setLabel(line.getLineLabel());
			myLine.setAsciiLabel(line.getLineLabel());
			myLine.setIndex(Integer.toString(line.getLineIndex()));
			myLine.setDisplay(line.getLineDisplay());
			myLine.setDisplayAscii(line.getLineDisplayAscii());
			myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
			
			com.cisco.axl.api._8.XDirn myDirn = new com.cisco.axl.api._8.XDirn();
			myDirn.setPattern(line.getLineNumber());
			myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, line.getRoutePartition()));
			
			myLine.setDirn(myDirn);
			
			myLines.getLine().add(myLine);
			}
		params.setLines(myLines);
		/************/
		
		req.setPhone(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addPhone(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdatePhoneReq req = new com.cisco.axl.api._10.UpdatePhoneReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.description))req.setDescription(this.description);
		if(tuList.contains(toUpdate.devicePool))req.setDevicePoolName(new JAXBElement(new QName("devicePoolName"), com.cisco.axl.api._10.XFkType.class, this.devicePool));
		if(tuList.contains(toUpdate.enableExtensionMobility))req.setEnableExtensionMobility(this.enableExtensionMobility);
		if(tuList.contains(toUpdate.location))req.setLocationName(SimpleRequest.getUUIDV105(itemType.location, this.location));
		if(tuList.contains(toUpdate.phoneCss))req.setCallingSearchSpaceName(new JAXBElement(new QName("callingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.phoneCss));
		if(tuList.contains(toUpdate.phoneButtonTemplate))req.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._10.XFkType.class, this.phoneButtonTemplate));
		if(tuList.contains(toUpdate.commonDeviceConfigName))req.setCommonDeviceConfigName(new JAXBElement(new QName("commonDeviceConfigName"), com.cisco.axl.api._10.XFkType.class, this.commonDeviceConfigName));
		if(tuList.contains(toUpdate.aarNeighborhoodName))req.setAarNeighborhoodName(new JAXBElement(new QName("aarNeighborhoodName"), com.cisco.axl.api._10.XFkType.class, this.aarNeighborhoodName));
		if(tuList.contains(toUpdate.automatedAlternateRoutingCssName))req.setAutomatedAlternateRoutingCssName(new JAXBElement(new QName("automatedAlternateRoutingCssName"), com.cisco.axl.api._10.XFkType.class, this.automatedAlternateRoutingCssName));
		if(tuList.contains(toUpdate.subscribeCallingSearchSpaceName))req.setSubscribeCallingSearchSpaceName(new JAXBElement(new QName("subscribeCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.subscribeCallingSearchSpaceName));
		if(tuList.contains(toUpdate.rerouteCallingSearchSpaceName))req.setRerouteCallingSearchSpaceName(new JAXBElement(new QName("rerouteCallingSearchSpaceName"), com.cisco.axl.api._10.XFkType.class, this.rerouteCallingSearchSpaceName));
		if(tuList.contains(toUpdate.securityProfileName))req.setSecurityProfileName(new JAXBElement(new QName("securityProfileName"), com.cisco.axl.api._10.XFkType.class, this.securityProfileName));
		if(tuList.contains(toUpdate.commonPhoneConfigName))req.setLocationName(SimpleRequest.getUUIDV105(itemType.commonPhoneConfig, this.commonPhoneConfigName));
		if(tuList.contains(toUpdate.deviceMobilityMode))req.setDeviceMobilityMode(this.deviceMobilityMode);
		
		//Speed Dial
		if(tuList.contains(toUpdate.sd))
			{
			com.cisco.axl.api._10.UpdatePhoneReq.Speeddials mySDList = new com.cisco.axl.api._10.UpdatePhoneReq.Speeddials();
			for(SpeedDial sd : sdList)
				{
				if(sd.getType().equals(sdType.sd))
					{
					com.cisco.axl.api._10.XSpeeddial mySD = new com.cisco.axl.api._10.XSpeeddial();
					mySD.setIndex(Integer.toString(sd.getPosition()));
					mySD.setLabel(sd.getDescription());
					mySD.setDirn(sd.getNumber());
					mySDList.getSpeeddial().add(mySD);
					}
				}
			req.setSpeeddials(mySDList);
			}
		
		//BLF
		if(tuList.contains(toUpdate.blf))
			{
			com.cisco.axl.api._10.UpdatePhoneReq.BusyLampFields myBLFList = new com.cisco.axl.api._10.UpdatePhoneReq.BusyLampFields();
			for(SpeedDial sd : sdList)
				{
				if(sd.getType().equals(sdType.blf))
					{
					com.cisco.axl.api._10.XBusyLampField myBLF = new com.cisco.axl.api._10.XBusyLampField();
					myBLF.setIndex(Integer.toString(sd.getPosition()));
					myBLF.setLabel(sd.getDescription());
					
					/****
					 * Here we have to be smart. Indeed, if the destination is a common one
					 * we setup the "BLF destination". But if the destination is an internal one
					 * which need to be supervised, we setup "BLF directory and partition"
					 * 
					 * To know if the destination is internal or not, we have to ask the CUCM first
					 */
					//First we contact the CUCM
					try
						{
						com.cisco.axl.api._10.GetLineReq lineReq = new com.cisco.axl.api._10.GetLineReq();
						lineReq.setPattern(sd.getNumber());
						lineReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, sd.getPartition())));
						com.cisco.axl.api._10.GetLineRes resp = Variables.getAXLConnectionToCUCMV105().getLine(lineReq);
						
						//If we reach this point, it means that the line is an internal number
						Variables.getLogger().debug("The following destination is internal, so we create the BLF using supervised destination: "+sd.getNumber());
						myBLF.setBlfDirn(sd.getNumber());
						myBLF.setRoutePartition(sd.getPartition());
						
						//Pickup
						if(sd.isPickup())
							{
							com.cisco.axl.api._10.XBusyLampField.AssociatedBlfSdFeatures myFeatures = new com.cisco.axl.api._10.XBusyLampField.AssociatedBlfSdFeatures();
							myFeatures.getFeature().add("Pickup");
							myBLF.setAssociatedBlfSdFeatures(myFeatures);
							}
						}
					catch (Exception e)
						{
						//If we reach this point, it means that the line is not an internal number
						Variables.getLogger().debug("The following destination is not internal, so we create the BLF using normal destination: "+sd.getNumber());
						myBLF.setBlfDest(sd.getNumber());
						}
					
					myBLFList.getBusyLampField().add(myBLF);
					}
				}
			req.setBusyLampFields(myBLFList);
			/************/
			}
		
		//Service
		if(tuList.contains(toUpdate.service))
			{
			com.cisco.axl.api._10.UpdatePhoneReq.Services myServs = new com.cisco.axl.api._10.UpdatePhoneReq.Services();
			int i = 1;
			for(PhoneService s : this.serviceList)
				{
				com.cisco.axl.api._10.XSubscribedService myService = new com.cisco.axl.api._10.XSubscribedService();
				myService.setTelecasterServiceName(SimpleRequest.getUUIDV105(itemType.telecasterservice, s.getServicename()));
				myService.setName(s.getServicename());
				myService.setServiceNameAscii(s.getServicename());
				myService.setUrlButtonIndex(Integer.toString(i));
				myService.setUrlLabel(s.getSurl());
				myServs.getService().add(myService);
				i++;
				}
			req.setServices(myServs);
			}
		
		//Line
		if(tuList.contains(toUpdate.line))
			{
			com.cisco.axl.api._10.UpdatePhoneReq.Lines myLines = new com.cisco.axl.api._10.UpdatePhoneReq.Lines();
			for(PhoneLine line : this.lineList)
				{
				com.cisco.axl.api._10.XPhoneLine myLine = new com.cisco.axl.api._10.XPhoneLine();
				myLine.setLabel(line.getLineLabel());
				myLine.setIndex(Integer.toString(line.getLineIndex()));
				myLine.setDisplay(line.getLineDisplay());
				myLine.setDisplayAscii(line.getLineDisplayAscii());
				myLine.setE164Mask(new JAXBElement(new QName("e164Mask"), String.class, line.getExternalPhoneNumberMask()));
				
				com.cisco.axl.api._10.XDirn myDirn = new com.cisco.axl.api._10.XDirn();
				myDirn.setPattern(line.getLineNumber());
				myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, line.getRoutePartition()));
				
				myLine.setDirn(myDirn);
				
				myLines.getLine().add(myLine);
				}
			req.setLines(myLines);
			}
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updatePhone(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdatePhoneReq req = new com.cisco.axl.api._8.UpdatePhoneReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		//Speed Dial
		com.cisco.axl.api._8.UpdatePhoneReq.Speeddials mySDList = new com.cisco.axl.api._8.UpdatePhoneReq.Speeddials();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.sd))
				{
				com.cisco.axl.api._8.XSpeeddial mySD = new com.cisco.axl.api._8.XSpeeddial();
				mySD.setIndex(Integer.toString(sd.getPosition()));
				mySD.setLabel(sd.getDescription());
				mySD.setAsciiLabel(sd.getDescription());
				mySD.setDirn(sd.getNumber());
				mySDList.getSpeeddial().add(mySD);
				}
			}
		req.setSpeeddials(mySDList);
		
		//BLF
		com.cisco.axl.api._8.UpdatePhoneReq.BusyLampFields myBLFList = new com.cisco.axl.api._8.UpdatePhoneReq.BusyLampFields();
		for(SpeedDial sd : sdList)
			{
			if(sd.getType().equals(sdType.blf))
				{
				com.cisco.axl.api._8.XBusyLampField myBLF = new com.cisco.axl.api._8.XBusyLampField();
				myBLF.setIndex(Integer.toString(sd.getPosition()));
				myBLF.setLabel(sd.getDescription());
				myBLF.setAsciiLabel(sd.getDescription());
				
				/****
				 * Here we have to be smart. Indeed, if the destination is a common one
				 * we setup the "BLF destination". But if the destination is an internal one
				 * which need to be supervised, we setup "BLF directory and partition"
				 * 
				 * To know if the destination is internal or not, we have to ask the CUCM first
				 */
				//First we contact the CUCM
				try
					{
					com.cisco.axl.api._8.GetLineReq lineReq = new com.cisco.axl.api._8.GetLineReq();
					lineReq.setPattern(sd.getNumber());
					lineReq.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, sd.getPartition())));
					com.cisco.axl.api._8.GetLineRes resp = Variables.getAXLConnectionToCUCM85().getLine(lineReq);
					
					//If we reach this point, it means that the line is an internal number
					Variables.getLogger().debug("The following destination is internal, so we create the BLF using supervised destination: "+sd.getNumber());
					myBLF.setBlfDirn(sd.getNumber());
					myBLF.setRoutePartition(sd.getPartition());
					
					//Pickup
					if(sd.isPickup())
						{
						com.cisco.axl.api._8.XBusyLampField.AssociatedBlfSdFeatures myFeatures = new com.cisco.axl.api._8.XBusyLampField.AssociatedBlfSdFeatures();
						myFeatures.getFeature().add("Pickup");
						myBLF.setAssociatedBlfSdFeatures(myFeatures);
						}
					}
				catch (Exception e)
					{
					//If we reach this point, it means that the line is not an internal number
					Variables.getLogger().debug("The following destination is not internal, so we create the BLF using normal destination: "+sd.getNumber());
					myBLF.setBlfDest(sd.getNumber());
					}
				
				myBLFList.getBusyLampField().add(myBLF);
				}
			}
		req.setBusyLampFields(myBLFList);
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updatePhone(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetPhoneReq req = new com.cisco.axl.api._10.GetPhoneReq();
		
		/*******************
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		//Temp
		com.cisco.axl.api._10.RPhone returnedTags = new com.cisco.axl.api._10.RPhone();
		returnedTags.setUuid("");
		req.setReturnedTags(returnedTags);
		//Temp
		
		com.cisco.axl.api._10.GetPhoneRes resp = Variables.getAXLConnectionToCUCMV105().getPhone(req);//We send the request to the CUCM
		
		Phone myPhone = new Phone(this.getName());
		myPhone.setUUID(resp.getReturn().getPhone().getUuid());
		//etc..
		//Has to be written
		
		return myPhone;//Return a phone
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetPhoneReq req = new com.cisco.axl.api._8.GetPhoneReq();
		
		/*******************
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		//Temp
		com.cisco.axl.api._8.RPhone returnedTags = new com.cisco.axl.api._8.RPhone();
		returnedTags.setUuid("");
		req.setReturnedTags(returnedTags);
		//Temp
		
		com.cisco.axl.api._8.GetPhoneRes resp = Variables.getAXLConnectionToCUCM85().getPhone(req);//We send the request to the CUCM
		
		Phone myPhone = new Phone(this.getName());
		myPhone.setUUID(resp.getReturn().getPhone().getUuid());
		//etc..
		//Has to be written
		
		return myPhone;//Return a phone
		}
	/****************/

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

	public String isEnableExtensionMobility()
		{
		return enableExtensionMobility;
		}

	public void setEnableExtensionMobility(String enableExtensionMobility)
		{
		this.enableExtensionMobility = enableExtensionMobility;
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

	public ArrayList<SpeedDial> getSdList()
		{
		return sdList;
		}

	public void setSdList(ArrayList<SpeedDial> sdList)
		{
		this.sdList = sdList;
		}

	public String getEnableExtensionMobility()
		{
		return enableExtensionMobility;
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

