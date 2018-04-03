package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.office.items.MediaRessourceGroupList;
import com.alex.woot.soap.items.MRGLMember;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Is the AXLItem design to link the item "Media Ressource Group List"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class MediaRessourceGroupListLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private ArrayList<MRGLMember> members;
	
	public enum toUpdate implements ToUpdate
		{
		members
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public MediaRessourceGroupListLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeMediaResourceList(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeMediaResourceList(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddMediaResourceListReq req = new com.cisco.axl.api._10.AddMediaResourceListReq();
		com.cisco.axl.api._10.XMediaResourceList params = new com.cisco.axl.api._10.XMediaResourceList();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		
		com.cisco.axl.api._10.XMediaResourceList.Members myMembers = new com.cisco.axl.api._10.XMediaResourceList.Members();
		
		for(int i=0; i<members.size(); i++)
			{
			com.cisco.axl.api._10.XMediaResourceListMember myMRLM = new com.cisco.axl.api._10.XMediaResourceListMember();
			myMRLM.setMediaResourceGroupName(SimpleRequest.getUUIDV105(itemType.mediaresourcegroup, members.get(i).getName()));
			myMRLM.setOrder(Integer.toString(i+1));
			
			myMembers.getMember().add(myMRLM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setMediaResourceList(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addMediaResourceList(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddMediaResourceListReq req = new com.cisco.axl.api._8.AddMediaResourceListReq();
		com.cisco.axl.api._8.XMediaResourceList params = new com.cisco.axl.api._8.XMediaResourceList();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		
		com.cisco.axl.api._8.XMediaResourceList.Members myMembers = new com.cisco.axl.api._8.XMediaResourceList.Members();
		
		for(int i=0; i<members.size(); i++)
			{
			com.cisco.axl.api._8.XMediaResourceListMember myMRLM = new com.cisco.axl.api._8.XMediaResourceListMember();
			myMRLM.setMediaResourceGroupName(SimpleRequest.getUUIDV85(itemType.mediaresourcegroup, members.get(i).getName()));
			myMRLM.setOrder(Integer.toString(i+1));
			
			myMembers.getMember().add(myMRLM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setMediaResourceList(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addMediaResourceList(req);//We send the request to the CUCM
		
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
		com.cisco.axl.api._10.GetMediaResourceListReq req = new com.cisco.axl.api._10.GetMediaResourceListReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetMediaResourceListRes resp = Variables.getAXLConnectionToCUCMV105().getMediaResourceList(req);//We send the request to the CUCM
		
		MediaRessourceGroupList myMRGL = new MediaRessourceGroupList(this.getName());
		myMRGL.setUUID(resp.getReturn().getMediaResourceList().getUuid());
		//Etc...
		//Has to be written
		
		return myMRGL;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetMediaResourceListReq req = new com.cisco.axl.api._8.GetMediaResourceListReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetMediaResourceListRes resp = Variables.getAXLConnectionToCUCM85().getMediaResourceList(req);//We send the request to the CUCM
		
		MediaRessourceGroupList myMRGL = new MediaRessourceGroupList(this.getName());
		myMRGL.setUUID(resp.getReturn().getMediaResourceList().getUuid());
		//Etc...
		//Has to be written
		
		return myMRGL;
		}
	/****************/

	public ArrayList<MRGLMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<MRGLMember> members)
		{
		this.members = members;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

