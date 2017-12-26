package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.sqlRequestType;


/**********************************
 * Is the AXLItem design to link the item "SQL request"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class SQLRequestLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String sqlRequest;//The name is a description
	private sqlRequestType requestType;
	
	public enum toUpdate implements ToUpdate
		{
		sqlRequest
		}

	/***************
	 * Constructor
	 ***************/
	public SQLRequestLinker()
			throws Exception
		{
		super("");
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
		Variables.getLogger().debug("There is nothing to delete in the case of an SQL request");
		}

	public void doDeleteVersion85() throws Exception
		{
		Variables.getLogger().debug("There is nothing to delete in the case of an SQL request");
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		if(requestType.equals(sqlRequestType.query))
			{
			com.cisco.axl.api._10.ExecuteSQLQueryReq req = new com.cisco.axl.api._10.ExecuteSQLQueryReq();
			
			/******************************
			 * We set the item parameters
			 * 
			 */
			req.setSql(this.sqlRequest);
		
			/**********/
				
			com.cisco.axl.api._10.ExecuteSQLQueryRes resp = Variables.getAXLConnectionToCUCMV105().executeSQLQuery(req);//We send the request to the CUCM
			
			return resp.getReturn().getRow().toString();//Return UUID
			}
		else
			{
			com.cisco.axl.api._10.ExecuteSQLUpdateReq req = new com.cisco.axl.api._10.ExecuteSQLUpdateReq();
			
			/******************************
			 * We set the item parameters
			 * 
			 */
			req.setSql(this.sqlRequest);
		
			/**********/
				
			com.cisco.axl.api._10.ExecuteSQLUpdateRes resp = Variables.getAXLConnectionToCUCMV105().executeSQLUpdate(req);//We send the request to the CUCM
			
			return resp.getReturn().getRowsUpdated().toString();//Return UUID
			}
		}

	public String doInjectVersion85() throws Exception
		{
		//To be written
		return null;
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		Variables.getLogger().debug("There is nothing to update in the case of a SQL request");
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		Variables.getLogger().debug("There is nothing to update in the case of a SQL request");
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		Variables.getLogger().debug("There is nothing to get in the case of a SQL request");
		return null;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		Variables.getLogger().debug("There is nothing to get in the case of a SQL request");
		return null;
		}
	/****************/

	public String getSqlRequest()
		{
		return sqlRequest;
		}

	public void setSqlRequest(String sqlRequest)
		{
		this.sqlRequest = sqlRequest;
		}

	public sqlRequestType getRequestType()
		{
		return requestType;
		}

	public void setRequestType(sqlRequestType requestType)
		{
		this.requestType = requestType;
		}

	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

