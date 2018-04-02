package com.alex.woot.office.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.PhoneLinker;
import com.alex.woot.axlitems.linkers.RegionLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.RelatedRegionDetail;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Region"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Region extends ItemToInject
	{
	/**
	 * Variables
	 */
	private RegionLinker myRegion;
	private String defaultCodec;
	
	private ArrayList<RelatedRegionDetail> g711RegionList;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Region( String name,
			String defaultCodec, ArrayList<RelatedRegionDetail> g711RegionList) throws Exception
		{
		super(itemType.region, name);
		myRegion = new RegionLinker(name);
		this.defaultCodec = defaultCodec;
		this.g711RegionList = g711RegionList;
		}

	public Region(String name) throws Exception
		{
		super(itemType.region, name);
		myRegion = new RegionLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myRegion.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myRegion.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myRegion.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myRegion.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Region myR = (Region) myRegion.get();
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
		defaultCodec = CollectionTools.getRawValue(defaultCodec, this, true);
		
		for(RelatedRegionDetail rrd : g711RegionList)
			{
			rrd.resolve();
			}
		
		/**
		 * We set the item parameters
		 */
		myRegion.setName(this.getName());
		myRegion.setDefaultCodec(defaultCodec);
		myRegion.setG711RegionList(g711RegionList);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(defaultCodec))tuList.add(RegionLinker.toUpdate.defaultCodec);
		if((g711RegionList == null) || (g711RegionList.size() == 0))
			{
			//Nothing to do
			}
		else
			{
			tuList.add(RegionLinker.toUpdate.g711RegionList);
			}
		}

	public String getDefaultCodec()
		{
		return defaultCodec;
		}

	public void setDefaultCodec(String defaultCodec)
		{
		this.defaultCodec = defaultCodec;
		}

	public ArrayList<RelatedRegionDetail> getG711RegionList()
		{
		return g711RegionList;
		}

	public void setG711RegionList(ArrayList<RelatedRegionDetail> g711RegionList)
		{
		this.g711RegionList = g711RegionList;
		}

	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

