package com.alex.woot.misc;

import java.util.ArrayList;

import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;


/**********************************
 * Interface aims to define one item to inject
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class ItemToInject implements ItemToInjectImpl
	{
	/**********
	 * Variables
	 */
	protected itemType type;
	protected String UUID;
	protected String name;
	protected statusType status;
	protected actionType action;
	protected ArrayList<ErrorTemplate> errorList;
	protected ArrayList<ToUpdate> tuList;
	
	/***************
	 * Constructor
	 ***************/
	public ItemToInject(itemType type, String name)
		{
		this.type = type;
		this.name = name;
		this.UUID = "";
		this.status = statusType.init;
		tuList = new ArrayList<ToUpdate>();
		errorList = new ArrayList<ErrorTemplate>();
		}
	
	/****
	 * Method used to launch the build process :
	 * - Prepare the request for injection
	 * - Check if the item already exist and if yes get the UUID
	 */
	public void build() throws Exception
		{
		try
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
			
			doBuild();
			}
		catch (Exception e)
			{
			this.status = statusType.error;
			throw e;
			}
		}
	
	
	/**
	 * Method used to launch the injection process
	 * @throws Exception 
	 */
	public void inject() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" of type "+this.getType().name()+" injection process begin");
		
		if(this.status.equals(statusType.waiting))
			{
			try
				{
				this.status = statusType.processing;
				this.UUID = doInject();//Item successfully injected
				Variables.getLogger().info("Item "+this.getName()+" successfuly injected");
				this.status = statusType.injected;
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				errorList.add(new ErrorTemplate(e.getMessage()));
				Variables.getLogger().error("Error while injecting the item \""+this.getName()+"\": "+e.getMessage(), e);
				}
			}
		else if(this.status.equals(statusType.init))
			{
			throw new Exception("Item "+this.getName()+" was not ready for the injection : build it first");
			}
		else
			{
			Variables.getLogger().info("Not to inject : "+this.getName()+" Status : "+this.getStatus().name());
			}
		}
	
	/**
	 * Method used to launch the deletion process
	 * @throws Exception 
	 */
	public void delete() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" deletion process begin");
		
		//If we got the UUID we can proceed
		if((!this.UUID.equals(""))&&(this.UUID != null)&&(this.status.equals(statusType.injected)))
			{
			try
				{
				this.status = statusType.processing;
				doDelete();
				Variables.getLogger().info("Item "+this.getName()+" deleted successfully");
				this.status = statusType.deleted;//Item successfully deleted
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				errorList.add(new ErrorTemplate(e.getMessage()));
				Variables.getLogger().error("Error while deleting the item \""+this.getName()+"\": "+e.getMessage(), e);
				}
			}
		else
			{
			Variables.getLogger().info("The item "+this.getName()+" of type "+this.getType().name()+" can't be deleted because it doesn't exist in the CUCM");
			}
		}
	
	/**
	 * Method used to launch the update process
	 * @throws Exception 
	 */
	public void update() throws Exception
		{
		Variables.getLogger().info("Item "+this.getName()+" update process begin");
		
		//If we got the UUID we can proceed
		if((!this.UUID.equals(""))&&(this.UUID != null)&&(this.status.equals(statusType.injected)))
			{
			try
				{
				this.status = statusType.processing;
				doUpdate();//Item successfully updated
				Variables.getLogger().info("Item "+this.getName()+" updated successfully");
				this.status = statusType.updated;//Item successfully deleted
				}
			catch (Exception e)
				{
				this.status = statusType.error;
				errorList.add(new ErrorTemplate(e.getMessage()));
				Variables.getLogger().error("Error while updating the item \""+this.getName()+"\": "+e.getMessage(), e);
				}
			}
		else
			{
			Variables.getLogger().info("The item "+this.getName()+" of type "+this.getType().name()+" can't be updated because it doesn't exist in the CUCM");
			}
		}
	
	public itemType getType()
		{
		return type;
		}
	public void setType(itemType type)
		{
		this.type = type;
		}
	public String getUUID()
		{
		return UUID;
		}
	public void setUUID(String uUID)
		{
		UUID = uUID;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public ArrayList<ErrorTemplate> getErrorList()
		{
		return errorList;
		}
	public void setErrorList(ArrayList<ErrorTemplate> errorList)
		{
		this.errorList = errorList;
		}
	public statusType getStatus()
		{
		return status;
		}
	public void setStatus(statusType status)
		{
		this.status = status;
		}

	public actionType getAction()
		{
		return action;
		}

	public void setAction(actionType action) throws Exception
		{
		this.action = action;
		if(action.equals(actionType.update))
			{
			manageTuList();
			}
		}

	public ArrayList<ToUpdate> getTuList()
		{
		return tuList;
		}

	public void setTuList(ArrayList<ToUpdate> tuList)
		{
		this.tuList = tuList;
		}
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}
