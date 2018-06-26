package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.CallingSearchSpaceLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.PartitionMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Calling Search Space"
 * 
 * @author RATEL Alexandre
 **********************************/

public class CallingSearchSpace extends ItemToInject
	{
	/**
	 * Variables
	 */
	private CallingSearchSpaceLinker myCSS;
	private String description;
	private ArrayList<PartitionMember> members;
	


	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallingSearchSpace(String name, String description,
			ArrayList<PartitionMember> members) throws Exception
		{
		super(itemType.callingsearchspace, name);
		myCSS = new CallingSearchSpaceLinker(name);
		this.description = description;
		this.members = members;
		}

	public CallingSearchSpace(String name) throws Exception
		{
		super(itemType.callingsearchspace, name);
		myCSS = new CallingSearchSpaceLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myCSS.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myCSS.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myCSS.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myCSS.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		CallingSearchSpace myC = (CallingSearchSpace) myCSS.get();
		this.UUID = myC.getUUID();
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		description = CollectionTools.getRawValue(description, this, false);
		
		for(PartitionMember p : members)
			{
			p.resolve();
			}
		
		myCSS.setName(name);
		myCSS.setDescription(description);
		myCSS.setMembers(members);
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(CallingSearchSpaceLinker.toUpdate.description);
		if((members != null) && (members.size() != 0))tuList.add(CallingSearchSpaceLinker.toUpdate.members);
		}
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public ArrayList<PartitionMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<PartitionMember> members)
		{
		this.members = members;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

