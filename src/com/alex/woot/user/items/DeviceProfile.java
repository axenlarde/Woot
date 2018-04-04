package com.alex.woot.user.items;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.axlitems.linkers.DeviceProfileLinker;
import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.EmptyValueException;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.soap.items.PhoneService;
import com.alex.woot.soap.items.SpeedDial;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Device Profile"
 * 
 * @author RATEL Alexandre
 **********************************/

public class DeviceProfile extends ItemToInject
	{
	/**
	 * Variables
	 */
	private DeviceProfileLinker myUDP;
	private String targetName,
	description,
	productType,
	phoneClass,
	protocol,
	protocolSide,
	phoneButtonTemplate;
	
	private ArrayList<PhoneService> serviceList;
	private ArrayList<PhoneLine> lineList;
	private ArrayList<SpeedDial> sdList;
	
	private int index;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public DeviceProfile(String targetName,
			String name,
			String description, String productType,
			String protocol,
			String phoneButtonTemplate,
			ArrayList<PhoneService> serviceList,
			ArrayList<PhoneLine> lineList,
			ArrayList<SpeedDial> sdList) throws Exception
		{
		super(itemType.udp, name);
		myUDP = new DeviceProfileLinker(name);
		this.targetName = targetName;
		this.description = description;
		this.productType = productType;
		this.phoneClass = "Device Profile";
		this.protocol = protocol;
		this.protocolSide = "User";
		this.phoneButtonTemplate = phoneButtonTemplate;
		this.serviceList = serviceList;
		this.lineList = lineList;
		this.sdList = sdList;
		}

	public DeviceProfile(String name) throws Exception
		{
		super(itemType.udp, name);
		myUDP = new DeviceProfileLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		errorList.addAll(myUDP.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{		
		return myUDP.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myUDP.delete();
		}

	/**
	 * Method used to update data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myUDP.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		DeviceProfile myPh = (DeviceProfile) myUDP.get();
		this.UUID = myPh.getUUID();
		//Etc...
		//Has to be written
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
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
		this.name = CollectionTools.getValueFromCollectionFile(index, this.name, this, true);
		this.description = CollectionTools.getValueFromCollectionFile(index, this.description, this, false);
		this.phoneClass = CollectionTools.getValueFromCollectionFile(index, this.phoneClass, this, true);
		this.productType = CollectionTools.getValueFromCollectionFile(index, this.productType, this, true);
		this.protocol = CollectionTools.getValueFromCollectionFile(index, this.protocol, this, true);
		this.protocolSide = CollectionTools.getValueFromCollectionFile(index, this.protocolSide, this, true);
		this.phoneButtonTemplate = CollectionTools.getValueFromCollectionFile(index, this.phoneButtonTemplate, this, true);
		
		/**
		 * We fetch the errors and corrections from the lists
		 */
		//PhoneLine
		for(PhoneLine pl : lineList)
			{
			this.getErrorList().addAll(pl.getErrorList());
			this.getCorrectionList().addAll(pl.getCorrectionList());
			}
		
		//Services
		for(PhoneService s : serviceList)
			{
			this.getErrorList().addAll(s.getErrorList());
			this.getCorrectionList().addAll(s.getCorrectionList());
			}
		
		//SD a BLF
		for(SpeedDial sd : sdList)
			{
			this.getErrorList().addAll(sd.getErrorList());
			this.getCorrectionList().addAll(sd.getCorrectionList());
			}
		
		/**
		 * We set the item parameters
		 */
		myUDP.setName(this.getName());
		myUDP.setDescription(this.description);
		myUDP.setLineList(this.lineList);
		myUDP.setPhoneClass(this.phoneClass);
		myUDP.setProductType(this.productType);
		myUDP.setProtocol(this.protocol);
		myUDP.setProtocolSide(this.protocolSide);
		myUDP.setServiceList(this.serviceList);
		myUDP.setSdList(this.sdList);
		myUDP.setPhoneButtonTemplate(phoneButtonTemplate);
		/*********/
		}
	
	/**
	 * Used to resolve only the lines
	 * @throws Exception 
	 */
	public void resolveLine(int i) throws Exception
		{
		//Line
		for(PhoneLine myLine : lineList)
			{
			myLine.setIndex(i);
			myLine.resolve();
			}
		
		myUDP.setLineList(this.lineList);
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(DeviceProfileLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(phoneButtonTemplate))tuList.add(DeviceProfileLinker.toUpdate.phoneButtonTemplate);
		if((serviceList != null) && (serviceList.size() != 0))tuList.add(DeviceProfileLinker.toUpdate.service);
		if((sdList != null) && (sdList.size() != 0))tuList.add(DeviceProfileLinker.toUpdate.sd);
		if((lineList != null) && (lineList.size() != 0))tuList.add(DeviceProfileLinker.toUpdate.line);
		}

	public DeviceProfileLinker getMyUDP()
		{
		return myUDP;
		}

	public void setMyUDP(DeviceProfileLinker myUDP)
		{
		this.myUDP = myUDP;
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

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
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

	public String getTargetName()
		{
		return targetName;
		}

	public void setTargetName(String targetName)
		{
		this.targetName = targetName;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

