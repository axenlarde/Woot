package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.CallingSearchSpaceLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PartitionMember;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

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
			ArrayList<PartitionMember> members, Workbook myWorkbook) throws Exception
		{
		super(itemType.callingsearchspace, name, myWorkbook);
		myCSS = new CallingSearchSpaceLinker(name);
		this.description = description;
		this.members = members;
		
		/**
		 * We set the item parameters
		 */
		myCSS.setName(this.getName());
		myCSS.setDescription(description);
		myCSS.setMembers(members);
		/*********/
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
		myCSS.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			CallingSearchSpace myC = (CallingSearchSpace) myCSS.get();
			this.UUID = myC.getUUID();
			
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

