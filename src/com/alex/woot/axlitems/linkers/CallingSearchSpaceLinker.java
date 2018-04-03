package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.office.items.CallingSearchSpace;
import com.alex.woot.soap.items.PartitionMember;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Is the AXLItem design to link the item "Calling Search Space"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class CallingSearchSpaceLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description;
	private ArrayList<PartitionMember> members;
	
	public enum toUpdate implements ToUpdate
		{
		members
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public CallingSearchSpaceLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeCss(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeCss(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddCssReq req = new com.cisco.axl.api._10.AddCssReq();
		com.cisco.axl.api._10.XCss params = new com.cisco.axl.api._10.XCss();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		
		com.cisco.axl.api._10.XCss.Members myMembers = new com.cisco.axl.api._10.XCss.Members();
		
		for(int i=0; i<members.size(); i++)
			{
			com.cisco.axl.api._10.XCallingSearchSpaceMember myCSSM = new com.cisco.axl.api._10.XCallingSearchSpaceMember();
			myCSSM.setRoutePartitionName(SimpleRequest.getUUIDV105(itemType.partition, members.get(i).getName()));
			myCSSM.setIndex(Integer.toString(i+1));
			
			myMembers.getMember().add(myCSSM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setCss(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addCss(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddCssReq req = new com.cisco.axl.api._8.AddCssReq();
		com.cisco.axl.api._8.XCss params = new com.cisco.axl.api._8.XCss();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(description);
		
		com.cisco.axl.api._8.XCss.Members myMembers = new com.cisco.axl.api._8.XCss.Members();
		
		for(int i=0; i<members.size(); i++)
			{
			com.cisco.axl.api._8.XCallingSearchSpaceMember myCSSM = new com.cisco.axl.api._8.XCallingSearchSpaceMember();
			myCSSM.setRoutePartitionName(SimpleRequest.getUUIDV85(itemType.partition, members.get(i).getName()));
			myCSSM.setIndex(Integer.toString(i+1));
			
			myMembers.getMember().add(myCSSM);
			}
		
		params.setMembers(myMembers);
		/************/
		
		req.setCss(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addCss(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Has to be written
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetCssReq req = new com.cisco.axl.api._10.GetCssReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetCssRes resp = Variables.getAXLConnectionToCUCMV105().getCss(req);//We send the request to the CUCM
		
		CallingSearchSpace myS = new CallingSearchSpace(this.getName());
		myS.setUUID(resp.getReturn().getCss().getUuid());
		//Etc...
		//Has to be written
		
		return myS;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetCssReq req = new com.cisco.axl.api._8.GetCssReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetCssRes resp = Variables.getAXLConnectionToCUCM85().getCss(req);//We send the request to the CUCM
		
		CallingSearchSpace myS = new CallingSearchSpace(this.getName());
		myS.setUUID(resp.getReturn().getCss().getUuid());
		//Etc...
		//Has to be written
		
		return myS;
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

	public ArrayList<PartitionMember> getMembers()
		{
		return members;
		}

	public void setMembers(ArrayList<PartitionMember> members)
		{
		this.members = members;
		}

	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

