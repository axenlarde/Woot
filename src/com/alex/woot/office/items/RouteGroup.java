package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.axlitems.linkers.RouteGroupLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.RouteGroupMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


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
			ArrayList<RouteGroupMember> members) throws Exception
		{
		super(itemType.routegroup, name);
		myRouteGroup = new RouteGroupLinker(name);
		this.distributionAlgorithm = distributionAlgorithm;
		this.members = members;
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
		this.errorList.addAll(myRouteGroup.init());
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
		myRouteGroup.update(tuList);
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
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		distributionAlgorithm = CollectionTools.getRawValue(distributionAlgorithm, this, true);
		
		for(RouteGroupMember rgm : members)
			{
			rgm.resolve();
			}
		
		/**
		 * We set the item parameters
		 */
		myRouteGroup.setName(name);
		myRouteGroup.setDistributionAlgorithm(distributionAlgorithm);
		myRouteGroup.setMembers(members);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(distributionAlgorithm))tuList.add(RouteGroupLinker.toUpdate.distributionAlgorithm);
		if((members == null) || (members.size() == 0))
			{
			//Nothing to do
			}
		else
			{
			tuList.add(RouteGroupLinker.toUpdate.members);
			}
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

