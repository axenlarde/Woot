package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.LocationLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "Location"
 * 
 * @author RATEL Alexandre
 **********************************/

public class Location extends ItemToInject
	{
	/**
	 * Variables
	 */
	private LocationLinker myLocation;
	private String audiobandwidth, videobandwidth;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public Location(String name, String audiobandwidth, String videobandwidth) throws Exception
		{
		super(itemType.location, name);
		myLocation = new LocationLinker(name);
		this.audiobandwidth = audiobandwidth;
		this.videobandwidth = videobandwidth;
		}
	
	public Location(String name) throws Exception
		{
		super(itemType.location, name);
		myLocation = new LocationLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myLocation.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myLocation.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myLocation.delete();
		}

	/**
	 * Method used to update data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myLocation.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		Location myLoc = (Location) myLocation.get();
		this.UUID = myLoc.getUUID();
		this.audiobandwidth = myLoc.getAudiobandwidth();
		this.videobandwidth = myLoc.getVideobandwidth();
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
		}
	
	public String getInfo()
		{
		//Has to be improved
		return name+" "
		+UUID;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getRawValue(name, this, true);
		audiobandwidth = CollectionTools.getRawValue(audiobandwidth, this, true);
		videobandwidth = CollectionTools.getRawValue(videobandwidth, this, true);
		
		/**
		 * We set the item parameters
		 */
		myLocation.setName(name);
		myLocation.setKbits(audiobandwidth);
		myLocation.setVideoKbits(videobandwidth);
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(audiobandwidth))tuList.add(LocationLinker.toUpdate.Kbits);
		if(UsefulMethod.isNotEmpty(videobandwidth))tuList.add(LocationLinker.toUpdate.VideoKbits);
		}

	public String getAudiobandwidth()
		{
		return audiobandwidth;
		}

	public void setAudiobandwidth(String audiobandwidth)
		{
		this.audiobandwidth = audiobandwidth;
		}

	public String getVideobandwidth()
		{
		return videobandwidth;
		}

	public void setVideobandwidth(String videobandwidth)
		{
		this.videobandwidth = videobandwidth;
		}	
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

