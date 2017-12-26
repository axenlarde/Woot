package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.CallingSearchSpaceLinker;
import com.alex.yuza.axlitems.RouteGroupLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.PartitionMember;
import com.alex.yuza.misc.RouteGroupMember;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Route Group"
 * 
 * @author RATEL Alexandre
 **********************************/

public class RouteGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private RouteGroupLinker myRouteGroup;
	private String distributionAlgorithm;
	private ArrayList<RouteGroupMember> members;
	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public RouteGroup(String name, String distributionAlgorithm,
			ArrayList<RouteGroupMember> members, Workbook myWorkbook) throws Exception
		{
		super(itemType.routegroup, name, myWorkbook);
		myRouteGroup = new RouteGroupLinker(name);
		this.distributionAlgorithm = distributionAlgorithm;
		this.members = members;
		
		/**
		 * We set the item parameters
		 */
		myRouteGroup.setDistributionAlgorithm(distributionAlgorithm);
		myRouteGroup.setMembers(members);
		/*********/
		}

	public RouteGroup(String name) throws Exception
		{
		super(itemType.routegroup, name);
		myRouteGroup = new RouteGroupLinker(name);
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
		return myRouteGroup.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myRouteGroup.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myRouteGroup.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			RouteGroup myR = (RouteGroup) myRouteGroup.get();
			this.UUID = myR.getUUID();
			
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

	public String getDistributionAlgorithm()
		{
		return distributionAlgorithm;
		}

	public void setDistributionAlgorithm(String distributionAlgorithm)
		{
		this.distributionAlgorithm = distributionAlgorithm;
		}

	public ArrayList<RouteGroupMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<RouteGroupMember> members)
		{
		this.members = members;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

