package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Is the AXLItem design to link the item "Media Ressource Group"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class MediaRessourceGroupLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description, multicast;
	private ArrayList<String> members;
	
	public enum toUpdate implements ToUpdate
		{
		description,
		multicast,
		members
		}
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MediaRessourceGroupLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeMediaResourceGroup(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeMediaResourceGroup(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddMediaResourceGroupReq req = new com.cisco.axl.api._10.AddMediaResourceGroupReq();
		com.cisco.axl.api._10.XMediaResourceGroup params = new com.cisco.axl.api._10.XMediaResourceGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		params.setMulticast(multicast);
		
		com.cisco.axl.api._10.XMediaResourceGroup.Members myMembers = new com.cisco.axl.api._10.XMediaResourceGroup.Members();
		
		for(String s : members)
			{
			com.cisco.axl.api._10.XMediaResourceGroupMember myMRGM = new com.cisco.axl.api._10.XMediaResourceGroupMember();
			myMRGM.setDeviceName(SimpleRequest.getUUIDV105(itemType.conferencebridge, s));
			
			myMembers.getMember().add(myMRGM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setMediaResourceGroup(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addMediaResourceGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddMediaResourceGroupReq req = new com.cisco.axl.api._8.AddMediaResourceGroupReq();
		com.cisco.axl.api._8.XMediaResourceGroup params = new com.cisco.axl.api._8.XMediaResourceGroup();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		params.setMulticast(multicast);
		
		com.cisco.axl.api._8.XMediaResourceGroup.Members myMembers = new com.cisco.axl.api._8.XMediaResourceGroup.Members();
		
		for(String s : members)
			{
			com.cisco.axl.api._8.XMediaResourceGroupMember myMRGM = new com.cisco.axl.api._8.XMediaResourceGroupMember();
			myMRGM.setDeviceName(SimpleRequest.getUUIDV85(itemType.conferencebridge, s));
			
			myMembers.getMember().add(myMRGM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setMediaResourceGroup(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addMediaResourceGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		Variables.getLogger().info("This method has to be written");
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		Variables.getLogger().info("This method has to be written");
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetMediaResourceGroupReq req = new com.cisco.axl.api._10.GetMediaResourceGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetMediaResourceGroupRes resp = Variables.getAXLConnectionToCUCMV105().getMediaResourceGroup(req);//We send the request to the CUCM
		
		MediaRessourceGroup myM = new MediaRessourceGroup(this.getName());
		myM.setUUID(resp.getReturn().getMediaResourceGroup().getUuid());
		//Etc...
		//Has to be written
		
		return myM;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetMediaResourceGroupReq req = new com.cisco.axl.api._8.GetMediaResourceGroupReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetMediaResourceGroupRes resp = Variables.getAXLConnectionToCUCM85().getMediaResourceGroup(req);//We send the request to the CUCM
		
		MediaRessourceGroup myM = new MediaRessourceGroup(this.getName());
		myM.setUUID(resp.getReturn().getMediaResourceGroup().getUuid());
		//Etc...
		//Has to be written
		
		return myM;
		}
	/****************/

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public ArrayList<String> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<String> members)
		{
		this.members = members;
		}

	public String getMulticast()
		{
		return multicast;
		}

	public void setMulticast(String multicast)
		{
		this.multicast = multicast;
		}

	
	
	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

