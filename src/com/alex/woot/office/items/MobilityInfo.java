package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.MobilityInfoLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Mobility Info"
 * 
 * @author RATEL Alexandre
 **********************************/

public class MobilityInfo extends ItemToInject
	{
	/**
	 * Variables
	 */
	private MobilityInfoLinker myMobilityInfo;
	private String subnet,
	subnetMask;//Has to be a number of bit
	
	private ArrayList<String> members;//Devicepool list

	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MobilityInfo(String name, String subnet,
			String subnetMask, ArrayList<String> members, Workbook myWorkbook) throws Exception
		{
		super(itemType.devicemobilityinfo, name, myWorkbook);
		myMobilityInfo = new MobilityInfoLinker(name);
		this.subnet = subnet;
		this.subnetMask = subnetMask;
		this.members = members;
		
		/**
		 * We set the item parameters
		 */
		myMobilityInfo.setName(this.getName());
		myMobilityInfo.setSubnet(this.subnet);
		myMobilityInfo.setSubnetMask(this.subnetMask);
		myMobilityInfo.setMembers(this.members);
		/*********/
		}
	
	public MobilityInfo(String name) throws Exception
		{
		super(itemType.devicemobilityinfo, name);
		myMobilityInfo = new MobilityInfoLinker(name);
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
		return myMobilityInfo.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myMobilityInfo.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myMobilityInfo.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			MobilityInfo myP = (MobilityInfo) myMobilityInfo.get();
			this.UUID = myP.getUUID();
			//Has to be written
			
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

	public String getSubnet()
		{
		return subnet;
		}

	public void setSubnet(String subnet)
		{
		this.subnet = subnet;
		}

	public String getSubnetMask()
		{
		return subnetMask;
		}

	public void setSubnetMask(String subnetMask)
		{
		this.subnetMask = subnetMask;
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

