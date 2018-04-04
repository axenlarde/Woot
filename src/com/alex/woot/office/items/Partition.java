package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.PartitionLinker;
import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to define an item of type "Partition"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Partition extends ItemToInject
	{
	/**
	 * Variables
	 */
	private PartitionLinker myPartition;
	private String description;
	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Partition(String name, String description) throws Exception
		{
		super(itemType.partition, name);
		myPartition = new PartitionLinker(name);
		this.description = description;
		}

	public Partition(String name) throws Exception
		{
		super(itemType.partition, name);
		myPartition = new PartitionLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myPartition.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myPartition.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myPartition.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myPartition.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		Partition myP = (Partition) myPartition.get();
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
		myPartition.setName(this.getName());
		myPartition.setDescription(description);
		/*********/
		}

	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(PartitionLinker.toUpdate.description);
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

