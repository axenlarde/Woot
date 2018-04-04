package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.axlitems.linkers.PhysicalLocationLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to define an item of type "Physical Location"
 * 
 * @author RATEL Alexandre
 **********************************/

public class PhysicalLocation extends ItemToInject
	{
	/**
	 * Variables
	 */
	private PhysicalLocationLinker myPhysicalLocation;
	private String description;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public PhysicalLocation(String name, String description) throws Exception
		{
		super(itemType.physicallocation, name);
		myPhysicalLocation = new PhysicalLocationLinker(name);
		this.description = description;
		}
	
	public PhysicalLocation(String name) throws Exception
		{
		super(itemType.physicallocation, name);
		myPhysicalLocation = new PhysicalLocationLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myPhysicalLocation.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myPhysicalLocation.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myPhysicalLocation.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myPhysicalLocation.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		PhysicalLocation myP = (PhysicalLocation) myPhysicalLocation.get();
		this.UUID = myP.getUUID();
		this.description = myP.getDescription();
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
		
		/**
		 * We set the item parameters
		 */
		myPhysicalLocation.setName(this.getName());
		myPhysicalLocation.setDescription(this.description);
		/*********/
		}
	
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(PhysicalLocationLinker.toUpdate.description);
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}


	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

