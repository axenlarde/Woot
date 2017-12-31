package com.alex.woot.user.items;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.axlitems.linkers.CallPickupGroupLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.CallPickupGroupMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;


/**********************************
 * Class used to define an item of type "Call Pickup Group"
 * 
 * @author RATEL Alexandre
 **********************************/

public class CallPickupGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private CallPickupGroupLinker myCallPickupGroup;
	private String pattern,
	description,
	routePartitionName,
	pickupNotification,
	pickupNotificationTimer,
	callingPartyInfo,
	calledPartyInfo;
	
	private ArrayList<CallPickupGroupMember> cpgList;//Is the list of cpg linked to this one
	
	private int index;
	
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallPickupGroup(String name,
			String pattern, String description, String routePartitionName,
			String pickupNotification, String pickupNotificationTimer,
			String callingPartyInfo, String calledPartyInfo,
			ArrayList<CallPickupGroupMember> groupList) throws Exception
		{
		super(itemType.callpickupgroup, name);
		this.pattern = pattern;
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.pickupNotification = pickupNotification;
		this.pickupNotificationTimer = pickupNotificationTimer;
		this.callingPartyInfo = callingPartyInfo;
		this.calledPartyInfo = calledPartyInfo;
		this.cpgList = groupList;
		myCallPickupGroup = new CallPickupGroupLinker(name);
		
		index = 0;
		}

	public CallPickupGroup(String name) throws Exception
		{
		super(itemType.callpickupgroup, name);
		myCallPickupGroup = new CallPickupGroupLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		errorList = myCallPickupGroup.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myCallPickupGroup.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myCallPickupGroup.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myCallPickupGroup.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			CallPickupGroup myCPG = (CallPickupGroup) myCallPickupGroup.get();
			this.UUID = myCPG.getUUID();
			//Has to be enhanced
			
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
		name = CollectionTools.getValueFromCollectionFile(index, name, this);
		description = CollectionTools.getValueFromCollectionFile(index, description, this, false);
		routePartitionName = CollectionTools.getValueFromCollectionFile(index, routePartitionName, this);
		pickupNotification = CollectionTools.getValueFromCollectionFile(index, pickupNotification, this, false);
		pickupNotificationTimer = CollectionTools.getValueFromCollectionFile(index, pickupNotificationTimer, this, false);
		callingPartyInfo = CollectionTools.getValueFromCollectionFile(index, callingPartyInfo, this, false);
		calledPartyInfo = CollectionTools.getValueFromCollectionFile(index, calledPartyInfo, this, false);
		
		for(CallPickupGroupMember cpg : cpgList)
			{
			cpg.resolve(index);
			}
		
		myCallPickupGroup.setName(name);
		myCallPickupGroup.setCalledPartyInfo(calledPartyInfo);
		myCallPickupGroup.setCallingPartyInfo(callingPartyInfo);
		myCallPickupGroup.setDescription(description);
		myCallPickupGroup.setGroupList(cpgList);
		myCallPickupGroup.setPattern(pattern);
		myCallPickupGroup.setPickupNotification(pickupNotification);
		myCallPickupGroup.setPickupNotificationTimer(pickupNotificationTimer);
		myCallPickupGroup.setRoutePartitionName(routePartitionName);
		}
	
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(CallPickupGroupLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(pickupNotification))tuList.add(CallPickupGroupLinker.toUpdate.pickupNotification);
		if(UsefulMethod.isNotEmpty(pickupNotificationTimer))tuList.add(CallPickupGroupLinker.toUpdate.pickupNotificationTimer);
		if(UsefulMethod.isNotEmpty(callingPartyInfo))tuList.add(CallPickupGroupLinker.toUpdate.callingPartyInfo);
		if(UsefulMethod.isNotEmpty(calledPartyInfo))tuList.add(CallPickupGroupLinker.toUpdate.calledPartyInfo);
		if((cpgList != null) && (cpgList.size() != 0))tuList.add(CallPickupGroupLinker.toUpdate.groupList);
		}
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getRoutePartitionName()
		{
		return routePartitionName;
		}

	public void setRoutePartitionName(String routePartitionName)
		{
		this.routePartitionName = routePartitionName;
		}

	public String getPickupNotification()
		{
		return pickupNotification;
		}

	public void setPickupNotification(String pickupNotification)
		{
		this.pickupNotification = pickupNotification;
		}

	public String getPickupNotificationTimer()
		{
		return pickupNotificationTimer;
		}

	public void setPickupNotificationTimer(String pickupNotificationTimer)
		{
		this.pickupNotificationTimer = pickupNotificationTimer;
		}

	public String getCallingPartyInfo()
		{
		return callingPartyInfo;
		}

	public void setCallingPartyInfo(String callingPartyInfo)
		{
		this.callingPartyInfo = callingPartyInfo;
		}

	public String getCalledPartyInfo()
		{
		return calledPartyInfo;
		}

	public void setCalledPartyInfo(String calledPartyInfo)
		{
		this.calledPartyInfo = calledPartyInfo;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public String getPattern()
		{
		return pattern;
		}

	public void setPattern(String pattern)
		{
		this.pattern = pattern;
		}

	public CallPickupGroupLinker getMyCallPickupGroup()
		{
		return myCallPickupGroup;
		}

	public void setMyCallPickupGroup(CallPickupGroupLinker myCallPickupGroup)
		{
		this.myCallPickupGroup = myCallPickupGroup;
		}

	public ArrayList<CallPickupGroupMember> getCpgList()
		{
		return cpgList;
		}

	public void setCpgList(ArrayList<CallPickupGroupMember> cpgList)
		{
		this.cpgList = cpgList;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

