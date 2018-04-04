package com.alex.woot.user.items;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.axlitems.linkers.HuntListLinker;
import com.alex.woot.axlitems.linkers.LineGroupLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.HuntListMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;


/**********************************
 * Class used to define an item of type "Hunt List"
 * 
 * @author RATEL Alexandre
 **********************************/

public class HuntList extends ItemToInject
	{
	/**
	 * Variables
	 */
	private HuntListLinker myHuntList;
	private String description,
	callManagerGroupName,
	routeListEnabled,
	voiceMailUsage;
	
	private ArrayList<HuntListMember> lgList;
	
	private int index;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public HuntList(String name,
			String description,
			String callManagerGroupName,
			ArrayList<HuntListMember> lgList) throws Exception
		{
		super(itemType.huntlist, name);
		this.description = description;
		this.callManagerGroupName = callManagerGroupName;
		this.routeListEnabled = "true";
		this.voiceMailUsage = "false";
		this.lgList = lgList;
		
		myHuntList = new HuntListLinker(name);
		
		this.index = 0;
		}

	public HuntList(String name) throws Exception
		{
		super(itemType.huntlist, name);
		myHuntList = new HuntListLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		errorList.addAll(myHuntList.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myHuntList.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myHuntList.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myHuntList.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		HuntList myHL = (HuntList) myHuntList.get();
		this.UUID = myHL.getUUID();
		//Has to be enhanced
		
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
		name = CollectionTools.getValueFromCollectionFile(index, name, this, true);
		description = CollectionTools.getValueFromCollectionFile(index, description, this, false);
		callManagerGroupName = CollectionTools.getValueFromCollectionFile(index, callManagerGroupName, this, true);
		
		//lgList
		for(HuntListMember hlm : lgList)
			{
			this.getErrorList().addAll(hlm.getErrorList());
			this.getCorrectionList().addAll(hlm.getCorrectionList());
			}
		
		myHuntList.setCallManagerGroupName(callManagerGroupName);
		myHuntList.setDescription(description);
		myHuntList.setLgList(lgList);
		myHuntList.setName(name);
		myHuntList.setRouteListEnabled(routeListEnabled);
		myHuntList.setVoiceMailUsage(voiceMailUsage);
		}
	
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(HuntListLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(callManagerGroupName))tuList.add(HuntListLinker.toUpdate.callManagerGroupName);
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public String getRouteListEnabled()
		{
		return routeListEnabled;
		}

	public void setRouteListEnabled(String routeListEnabled)
		{
		this.routeListEnabled = routeListEnabled;
		}

	public String getVoiceMailUsage()
		{
		return voiceMailUsage;
		}

	public void setVoiceMailUsage(String voiceMailUsage)
		{
		this.voiceMailUsage = voiceMailUsage;
		}

	public ArrayList<HuntListMember> getLgList()
		{
		return lgList;
		}

	public void setLgList(ArrayList<HuntListMember> lgList)
		{
		this.lgList = lgList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

