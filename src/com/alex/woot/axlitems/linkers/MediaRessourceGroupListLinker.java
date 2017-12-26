package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;
import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.MRGLMember;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.MediaRessourceGroup;
import com.alex.yuza.site.MediaRessourceGroupList;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeMediaResourceList(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeMediaResourceList(deleteReq);//We send the request to the CUCM
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
		
		for(MRGLMember mrg : members)
			{
			com.cisco.axl.api._10.XMediaResourceListMember myMRLM = new com.cisco.axl.api._10.XMediaResourceListMember();
			myMRLM.setMediaResourceGroupName(SimpleRequest.getUUIDV105(itemType.mediaressourcegroup, mrg.getName()));
			myMRLM.setOrder(Integer.toString(mrg.getOrder()));
			
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
		
		for(MRGLMember mrg : members)
			{
			com.cisco.axl.api._8.XMediaResourceListMember myMRLM = new com.cisco.axl.api._8.XMediaResourceListMember();
			myMRLM.setMediaResourceGroupName(SimpleRequest.getUUIDV85(itemType.mediaressourcegroup, mrg.getName()));
			myMRLM.setOrder(Integer.toString(mrg.getOrder()));
			
			myMembers.getMember().add(myMRLM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setMediaResourceList(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addMediaResourceList(req);//We send the request to the CUCM
		
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
		
		com.cisco.axl.api._8.GetMediaResourceListRes resp = Variables.getAXLConnectionToCUCM().getMediaResourceList(req);//We send the request to the CUCM
		
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

