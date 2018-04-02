package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.office.items.Location;
import com.alex.woot.utils.Variables;

/**********************************
 * Is the AXLItem design to link the item "Location"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class LocationLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	String Kbits,VideoKbits;
	
	public enum toUpdate implements ToUpdate
		{
		Kbits,
		VideoKbits
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LocationLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 * @return 
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		//To be written
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		//To be written
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeLocation(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeLocation(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddLocationReq req = new com.cisco.axl.api._10.AddLocationReq();
		com.cisco.axl.api._10.XLocation params = new com.cisco.axl.api._10.XLocation();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());
		params.setWithinAudioBandwidth(this.getKbits());
		params.setWithinVideoBandwidth(this.getVideoKbits());
		/************/
		
		req.setLocation(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addLocation(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddLocationReq req = new com.cisco.axl.api._8.AddLocationReq();
		com.cisco.axl.api._8.XLocation params = new com.cisco.axl.api._8.XLocation();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());
		params.setKbits(this.getKbits());
		params.setVideoKbits(this.getVideoKbits());
		/************/
		
		req.setLocation(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addLocation(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateLocationReq req = new com.cisco.axl.api._10.UpdateLocationReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());

		if(tuList.contains(toUpdate.Kbits))req.setWithinAudioBandwidth(this.getKbits());
		if(tuList.contains(toUpdate.VideoKbits))req.setWithinVideoBandwidth(this.getVideoKbits());
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateLocation(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateLocationReq req = new com.cisco.axl.api._8.UpdateLocationReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		
		if(tuList.contains(toUpdate.Kbits))req.setKbits(this.getKbits());
		if(tuList.contains(toUpdate.VideoKbits))req.setVideoKbits(this.getVideoKbits());
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateLocation(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetLocationReq req = new com.cisco.axl.api._10.GetLocationReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetLocationRes resp = Variables.getAXLConnectionToCUCMV105().getLocation(req);//We send the request to the CUCM
		
		Location myLoc = new Location(this.getName());
		myLoc.setUUID(resp.getReturn().getLocation().getUuid());
		//Has to be completed
		
		return myLoc;//Return a location
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetLocationReq req = new com.cisco.axl.api._8.GetLocationReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetLocationRes resp = Variables.getAXLConnectionToCUCM85().getLocation(req);//We send the request to the CUCM
		
		Location myLoc = new Location(this.getName());
		myLoc.setUUID(resp.getReturn().getLocation().getUuid());
		//Has to be completed
		
		return myLoc;//Return a location
		}
	/****************/
	

	public String getKbits()
		{
		return Kbits;
		}

	public void setKbits(String kbits)
		{
		Kbits = kbits;
		}

	public String getVideoKbits()
		{
		return VideoKbits;
		}

	public void setVideoKbits(String videoKbits)
		{
		VideoKbits = videoKbits;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

