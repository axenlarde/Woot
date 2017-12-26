package com.alex.woot.office.items;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.PhysicalLocationLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

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
	public PhysicalLocation(String name, String description, Workbook myWorkbook) throws Exception
		{
		super(itemType.physicallocation, name, myWorkbook);
		myPhysicalLocation = new PhysicalLocationLinker(name);
		this.description = description;
		
		/**
		 * We set the item parameters
		 */
		myPhysicalLocation.setName(this.getName());
		myPhysicalLocation.setDescription(this.description);
		/*********/
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
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
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
		myPhysicalLocation.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			PhysicalLocation myP = (PhysicalLocation) myPhysicalLocation.get();
			this.UUID = myP.getUUID();
			this.description = myP.getDescription();
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
		//Has to be written
		return "";
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		//Has to be written for further uses
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

