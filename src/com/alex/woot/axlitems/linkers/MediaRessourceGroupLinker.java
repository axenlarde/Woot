package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;
import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.MediaRessourceGroup;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


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
	private String description;
	private boolean multicast;
	private ArrayList<String> members;
	
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
	public void doInitVersion85() throws Exception
		{
		//If needed
		}
	
	public void doInitVersion105() throws Exception
		{
		//If needed
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
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeMediaResourceGroup(deleteReq);//We send the request to the CUCM
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
		params.setMulticast((multicast)?"true":"false");
		
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
		params.setMulticast((multicast)?"true":"false");
		
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
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addMediaResourceGroup(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		//Has to be written
		Variables.getLogger().info("This method has to be written");
		}

	public void doUpdateVersion85() throws Exception
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
		
		com.cisco.axl.api._8.GetMediaResourceGroupRes resp = Variables.getAXLConnectionToCUCM().getMediaResourceGroup(req);//We send the request to the CUCM
		
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

