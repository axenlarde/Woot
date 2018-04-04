package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.MediaRessourceGroupLinker;
import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Media Ressource Group"
 * 
 * @author RATEL Alexandre
 **********************************/

public class MediaRessourceGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private MediaRessourceGroupLinker myMRG;
	private String description, multicast;
	
	private ArrayList<String> members;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MediaRessourceGroup(String name, String description,
			String multicast, ArrayList<String> members) throws Exception
		{
		super(itemType.mediaresourcegroup, name);
		myMRG = new MediaRessourceGroupLinker(name);
		this.description = description;
		this.multicast = multicast;
		this.members = members;
		}

	public MediaRessourceGroup(String name) throws Exception
		{
		super(itemType.mediaresourcegroup, name);
		myMRG = new MediaRessourceGroupLinker(name);
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
		MediaRessourceGroup myM = (MediaRessourceGroup) myMRG.get();
		this.UUID = myM.getUUID();
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		description = CollectionTools.getRawValue(description, this, true);
		members = CollectionTools.resolveStringList(members, this, true);
		
		/**
		 * We set the item parameters
		 */
		myMRG.setName(this.getName());
		myMRG.setDescription(description);
		myMRG.setMulticast(multicast);
		myMRG.setMembers(members);
		/*********/
		}

	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(MediaRessourceGroupLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(multicast))tuList.add(MediaRessourceGroupLinker.toUpdate.multicast);
		if(UsefulMethod.isNotEmpty(members))tuList.add(MediaRessourceGroupLinker.toUpdate.members);
		}
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public ArrayList<String> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<String> members)
		{
		this.members = members;
		}

	public MediaRessourceGroupLinker getMyMRG()
		{
		return myMRG;
		}

	public void setMyMRG(MediaRessourceGroupLinker myMRG)
		{
		this.myMRG = myMRG;
		}

	public String getMulticast()
		{
		return multicast;
		}

	public void setMulticast(String multicast)
		{
		this.multicast = multicast;
		}

	
	
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

