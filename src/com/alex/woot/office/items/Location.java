package com.alex.woot.office.items;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.LocationLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "Location"
 * 
 * @author RATEL Alexandre
 **********************************/
/**********************************
* 
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
	public Location(String name, String audiobandwidth, String videobandwidth, Workbook myWorkbook) throws Exception
		{
		super(itemType.location, name, myWorkbook);
		myLocation = new LocationLinker(name);
		this.audiobandwidth = audiobandwidth;
		this.videobandwidth = videobandwidth;
		
		/**
		 * We set the item parameters
		 */
		myLocation.setName(this.getName());
		myLocation.setKbits(this.audiobandwidth);
		myLocation.setVideoKbits(this.videobandwidth);
		/*********/
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
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myLocation.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			Location myLoc = (Location) myLocation.get();
			this.UUID = myLoc.getUUID();
			this.audiobandwidth = myLoc.getAudiobandwidth();
			this.videobandwidth = myLoc.getVideobandwidth();
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

	

	

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

