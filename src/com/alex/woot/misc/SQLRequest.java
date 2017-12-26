package com.alex.woot.misc;

import com.alex.woot.axlitems.linkers.SQLRequestLinker;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.sqlRequestType;


/**********************************
 * Class used to define an item of type "UDP Login"
 * 
 * @author RATEL Alexandre
 **********************************/

public class SQLRequest extends ItemToInject
	{
	/**
	 * Variables
	 */
	private SQLRequestLinker mySQLRequest;
	private String sqlRequest;//The name is a description
	
	private sqlRequestType requestType;
	
	private int index;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public SQLRequest(String name,
			String sqlRequest,
			sqlRequestType requestType) throws Exception
		{
		super(itemType.sqlRequest, name);
		this.mySQLRequest = new SQLRequestLinker();
		this.sqlRequest = sqlRequest;
		this.requestType = requestType;
		this.action = actionType.inject;
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		errorList = mySQLRequest.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{	
		return mySQLRequest.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		mySQLRequest.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		mySQLRequest.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			SQLRequest myUDP = (SQLRequest) mySQLRequest.get();
			//this.UUID = myUDP.getUUID();
			
			return false;
			}
		catch (Exception e)
			{
			Variables.getLogger().error(e.getMessage(), e);
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "+
		sqlRequest;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		sqlRequest = CollectionTools.getValueFromCollectionFile(index, sqlRequest);
		
		/**
		 * We set the item parameters
		 */
		mySQLRequest.setName(name);//Just a description
		mySQLRequest.setSqlRequest(sqlRequest);
		mySQLRequest.setRequestType(requestType);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		//Nothing to update
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

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

