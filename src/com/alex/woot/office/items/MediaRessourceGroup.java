package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.MediaRessourceGroupLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

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
	private String description;
	private boolean multicast;
	private ArrayList<String> members;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MediaRessourceGroup(String name, String description,
			boolean multicast, ArrayList<String> members, Workbook myWorkbook) throws Exception
		{
		super(itemType.mediaressourcegroup, name, myWorkbook);
		myMRG = new MediaRessourceGroupLinker(name);
		this.description = description;
		this.multicast = multicast;
		this.members = members;
		
		/**
		 * We set the item parameters
		 */
		myMRG.setName(this.getName());
		myMRG.setDescription(description);
		myMRG.setMulticast(multicast);
		myMRG.setMembers(members);
		/*********/
		}

	public MediaRessourceGroup(String name) throws Exception
		{
		super(itemType.mediaressourcegroup, name);
		myMRG = new MediaRessourceGroupLinker(name);
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
		myMRG.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			MediaRessourceGroup myM = (MediaRessourceGroup) myMRG.get();
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

	public boolean isMulticast()
		{
		return multicast;
		}

	public void setMulticast(boolean multicast)
		{
		this.multicast = multicast;
		}

	public ArrayList<String> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<String> members)
		{
		this.members = members;
		}

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

