package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.PhoneService;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.SpeedDial;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.user.items.DeviceProfile;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.sdType;


/**********************************
 * Is the AXLItem design to link the item "Phone"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class DeviceProfileLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneButtonTemplate;
	
	private ArrayList<PhoneService> serviceList;
	private ArrayList<PhoneLine> lineList;
	private ArrayList<SpeedDial> sdList;
	
	public enum toUpdate implements ToUpdate
		{
		sd,
		blf,
		description,
		phoneButtonTemplate,
		service,
		line
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public DeviceProfileLinker(String name) throws Exception
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
		
		try
			{
			SimpleRequest.getUUIDV85(itemType.phonetemplatename, this.phoneButtonTemplate);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.phoneButtonTemplate, "Not found during init : "+e.getMessage(), itemType.udp, itemType.phonetemplatename, errorType.notFound));
			}
		
		//Service
		try
			{
			for(PhoneService s : this.serviceList)
				{
				SimpleRequest.getUUIDV85(itemType.telecasterservice, s.getServicename());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.udp, itemType.telecasterservice, errorType.notFound));
			}
		
		//Line
		try
			{
			for(PhoneLine line : this.lineList)
				{
				SimpleRequest.getUUIDV85(itemType.partition, line.getRoutePartition());
				}
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.udp, itemType.partition, errorType.notFound));
			}
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.phonetemplatename, this.phoneButtonTemplate);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.phoneButtonTemplate, "Not found during init : "+e.getMessage(), itemType.udp, itemType.phonetemplatename, errorType.notFound));
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
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.udp, itemType.telecasterservice, errorType.notFound));
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
			errorList.add(new UserError(this.name, "", "Not found during init : "+e.getMessage(), itemType.udp, itemType.partition, errorType.notFound));
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
		
		deleteReq.setUuid((SimpleRequest.getUUIDV105(itemType.udp, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeDeviceProfile(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setUuid((SimpleRequest.getUUIDV85(itemType.udp, this.getName())).getUuid());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeDeviceProfile(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddDeviceProfileReq req = new com.cisco.axl.api._10.AddDeviceProfileReq();
		com.cisco.axl.api._10.XDeviceProfile params = new com.cisco.axl.api._10.XDeviceProfile();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.productType);
		params.setClazz(this.phoneClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.phonetemplatename, phoneButtonTemplate)));
		
		com.cisco.axl.api._10.XDeviceProfile.Services myServices = new com.cisco.axl.api._10.XDeviceProfile.Services();
		
		//Services
		for(PhoneService s : this.serviceList)
			{
			com.cisco.axl.api._10.XSubscribedService myService = new com.cisco.axl.api._10.XSubscribedService();
			myService.setTelecasterServiceName(SimpleRequest.getUUIDV105(itemType.telecasterservice, s.getServicename()));
			myService.setName(s.getServicename());
			myService.setServiceNameAscii(s.getServicename());
			myServices.getService().add(myService);
			}
		
		params.setServices(myServices);
		
		//SD
		com.cisco.axl.api._10.XDeviceProfile.Speeddials mySDList = new com.cisco.axl.api._10.XDeviceProfile.Speeddials();
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
		com.cisco.axl.api._10.XDeviceProfile.BusyLampFields myBLFList = new com.cisco.axl.api._10.XDeviceProfile.BusyLampFields();
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
		com.cisco.axl.api._10.XDeviceProfile.Lines myLines = new com.cisco.axl.api._10.XDeviceProfile.Lines();
		
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
			myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, line.getRoutePartition())));
			
			myLine.setDirn(myDirn);
			myLines.getLine().add(myLine);
			}
		/************/
		
		params.setLines(myLines);
		
		req.setDeviceProfile(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addDeviceProfile(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddDeviceProfileReq req = new com.cisco.axl.api._8.AddDeviceProfileReq();
		com.cisco.axl.api._8.XDeviceProfile params = new com.cisco.axl.api._8.XDeviceProfile();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(this.productType);
		params.setClazz(this.phoneClass);
		params.setProtocol(this.protocol);
		params.setProtocolSide(this.protocolSide);
		params.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.phonetemplatename, phoneButtonTemplate)));
		
		com.cisco.axl.api._8.XDeviceProfile.Services myServices = new com.cisco.axl.api._8.XDeviceProfile.Services();
		
		//Services
		for(PhoneService s : this.serviceList)
			{
			com.cisco.axl.api._8.XSubscribedService myService = new com.cisco.axl.api._8.XSubscribedService();
			myService.setTelecasterServiceName(SimpleRequest.getUUIDV85(itemType.telecasterservice, s.getServicename()));
			myService.setName(s.getServicename());
			myService.setServiceNameAscii(s.getServicename());
			myServices.getService().add(myService);
			}
		
		params.setServices(myServices);
		
		//SD
		com.cisco.axl.api._8.XDeviceProfile.Speeddials mySDList = new com.cisco.axl.api._8.XDeviceProfile.Speeddials();
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
		com.cisco.axl.api._8.XDeviceProfile.BusyLampFields myBLFList = new com.cisco.axl.api._8.XDeviceProfile.BusyLampFields();
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
		com.cisco.axl.api._8.XDeviceProfile.Lines myLines = new com.cisco.axl.api._8.XDeviceProfile.Lines();
		
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
			myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.partition, line.getRoutePartition())));
			
			myLine.setDirn(myDirn);
			myLines.getLine().add(myLine);
			}
		/************/
		
		params.setLines(myLines);
		
		req.setDeviceProfile(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addDeviceProfile(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateDeviceProfileReq req = new com.cisco.axl.api._10.UpdateDeviceProfileReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.service))
			{
			req.setDescription(this.description);
			}
		if(tuList.contains(toUpdate.phoneButtonTemplate))
			{
			req.setPhoneTemplateName(new JAXBElement(new QName("phoneTemplateName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.phonetemplatename, phoneButtonTemplate)));
			}
			
		//Service
		if(tuList.contains(toUpdate.service))
			{
			com.cisco.axl.api._10.UpdateDeviceProfileReq.Services myServices = new com.cisco.axl.api._10.UpdateDeviceProfileReq.Services();
			
			for(PhoneService s : this.serviceList)
				{
				com.cisco.axl.api._10.XSubscribedService myService = new com.cisco.axl.api._10.XSubscribedService();
				myService.setTelecasterServiceName(SimpleRequest.getUUIDV105(itemType.telecasterservice, s.getServicename()));
				myService.setName(s.getServicename());
				myService.setServiceNameAscii(s.getServicename());
				myServices.getService().add(myService);
				}
			
			req.setServices(myServices);
			}
		
		
		//Speed Dial
		if(tuList.contains(toUpdate.sd))
			{
			com.cisco.axl.api._10.UpdateDeviceProfileReq.Speeddials mySDList = new com.cisco.axl.api._10.UpdateDeviceProfileReq.Speeddials();
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
			com.cisco.axl.api._10.UpdateDeviceProfileReq.BusyLampFields myBLFList = new com.cisco.axl.api._10.UpdateDeviceProfileReq.BusyLampFields();
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
		
		//Line
		if(tuList.contains(toUpdate.line))
			{
			com.cisco.axl.api._10.UpdateDeviceProfileReq.Lines myLines = new com.cisco.axl.api._10.UpdateDeviceProfileReq.Lines();
			
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
				myDirn.setRoutePartitionName(new JAXBElement(new QName("routePartitionName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.partition, line.getRoutePartition())));
				
				myLine.setDirn(myDirn);
				myLines.getLine().add(myLine);
				}
			/************/
			
			req.setLines(myLines);
			}
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateDeviceProfile(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tulist) throws Exception
		{
		com.cisco.axl.api._8.UpdateDeviceProfileReq req = new com.cisco.axl.api._8.UpdateDeviceProfileReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		//Speed Dial
		com.cisco.axl.api._8.UpdateDeviceProfileReq.Speeddials mySDList = new com.cisco.axl.api._8.UpdateDeviceProfileReq.Speeddials();
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
		com.cisco.axl.api._8.UpdateDeviceProfileReq.BusyLampFields myBLFList = new com.cisco.axl.api._8.UpdateDeviceProfileReq.BusyLampFields();
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
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateDeviceProfile(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetDeviceProfileReq req = new com.cisco.axl.api._10.GetDeviceProfileReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetDeviceProfileRes resp = Variables.getAXLConnectionToCUCMV105().getDeviceProfile(req);//We send the request to the CUCM
		
		DeviceProfile myUDP = new DeviceProfile(this.getName());
		myUDP.setUUID(resp.getReturn().getDeviceProfile().getUuid());
		//etc..
		//Has to be written
		
		return myUDP;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetDeviceProfileReq req = new com.cisco.axl.api._8.GetDeviceProfileReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetDeviceProfileRes resp = Variables.getAXLConnectionToCUCM85().getDeviceProfile(req);//We send the request to the CUCM
		
		DeviceProfile myUDP = new DeviceProfile(this.getName());
		myUDP.setUUID(resp.getReturn().getDeviceProfile().getUuid());
		//etc..
		//Has to be written
		
		return myUDP;//Return a location
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

	public String getPhoneButtonTemplate()
		{
		return phoneButtonTemplate;
		}

	public void setPhoneButtonTemplate(String phoneButtonTemplate)
		{
		this.phoneButtonTemplate = phoneButtonTemplate;
		}

	public ArrayList<SpeedDial> getSdList()
		{
		return sdList;
		}

	public void setSdList(ArrayList<SpeedDial> sdList)
		{
		this.sdList = sdList;
		}

	

	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

