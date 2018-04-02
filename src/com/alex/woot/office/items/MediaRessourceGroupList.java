package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.MediaRessourceGroupListLinker;
import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.LineGroupMember;
import com.alex.woot.soap.items.MRGLMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Media Resource Group List"
 * 
 * @author RATEL Alexandre
 **********************************/

public class MediaRessourceGroupList extends ItemToInject
	{
	/**
	 * Variables
	 */
	private MediaRessourceGroupListLinker myMRG;
	private ArrayList<MRGLMember> members;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MediaRessourceGroupList(String name, ArrayList<MRGLMember> members) throws Exception
		{
		super(itemType.mediaresourcegrouplist, name);
		myMRG = new MediaRessourceGroupListLinker(name);
		this.members = members;
		}

	public MediaRessourceGroupList(String name) throws Exception
		{
		super(itemType.mediaresourcegrouplist, name);
		myMRG = new MediaRessourceGroupListLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myMRG.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myMRG.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myMRG.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myMRG.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			MediaRessourceGroupList myM = (MediaRessourceGroupList) myMRG.get();
			this.UUID = myM.getUUID();
			
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
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		
		for(MRGLMember mm : members)
			{
			mm.resolve();
			}
		
		/**
		 * We set the item parameters
		 */
		myMRG.setName(this.getName());
		myMRG.setMembers(members);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if((members == null) || (members.size() == 0))
			{
			//We do not add it to the update list
			}
		else
			{
			tuList.add(MediaRessourceGroupListLinker.toUpdate.members);
			}
		}

	public ArrayList<MRGLMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<MRGLMember> members)
		{
		this.members = members;
		}

	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

