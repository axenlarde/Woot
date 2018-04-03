package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.office.items.Partition;
import com.alex.woot.utils.Variables;



/**********************************
 * Is the AXLItem design to link the item "Partition"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class PartitionLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description;
	
	public enum toUpdate implements ToUpdate
		{
		description
		}
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public PartitionLinker(String name) throws Exception
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
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeRoutePartition(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().removeRoutePartition(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddRoutePartitionReq req = new com.cisco.axl.api._10.AddRoutePartitionReq();
		com.cisco.axl.api._10.XRoutePartition params = new com.cisco.axl.api._10.XRoutePartition();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		/************/
		
		req.setRoutePartition(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addRoutePartition(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddRoutePartitionReq req = new com.cisco.axl.api._8.AddRoutePartitionReq();
		com.cisco.axl.api._8.XRoutePartition params = new com.cisco.axl.api._8.XRoutePartition();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDescription(this.description);
		/************/
		
		req.setRoutePartition(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().addRoutePartition(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._10.UpdateRoutePartitionReq req = new com.cisco.axl.api._10.UpdateRoutePartitionReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateRoutePartition(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		com.cisco.axl.api._8.UpdateRoutePartitionReq req = new com.cisco.axl.api._8.UpdateRoutePartitionReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM85().updateRoutePartition(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetRoutePartitionReq req = new com.cisco.axl.api._10.GetRoutePartitionReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetRoutePartitionRes resp = Variables.getAXLConnectionToCUCMV105().getRoutePartition(req);//We send the request to the CUCM
		
		Partition myP = new Partition(this.getName());
		myP.setUUID(resp.getReturn().getRoutePartition().getUuid());
		myP.setDescription(resp.getReturn().getRoutePartition().getDescription());
		
		return myP;//Return a partition
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetRoutePartitionReq req = new com.cisco.axl.api._8.GetRoutePartitionReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetRoutePartitionRes resp = Variables.getAXLConnectionToCUCM85().getRoutePartition(req);//We send the request to the CUCM
		
		Partition myP = new Partition(this.getName());
		myP.setUUID(resp.getReturn().getRoutePartition().getUuid());
		myP.setDescription(resp.getReturn().getRoutePartition().getDescription());
		
		return myP;//Return a partition
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

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

