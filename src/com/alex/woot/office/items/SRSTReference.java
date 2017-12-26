package com.alex.woot.office.items;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.axlitems.SRSTReferenceLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "SRST Reference"
 * 
 * @author RATEL Alexandre
 **********************************/

public class SRSTReference extends ItemToInject
	{
	/**
	 * Variables
	 */
	private SRSTReferenceLinker mySRSTReference;
	private String ipAddress;

	
	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public SRSTReference(String name, String ipAddress, Workbook myWorkbook) throws Exception
		{
		super(itemType.srstreference, name, myWorkbook);
		mySRSTReference = new SRSTReferenceLinker(name);
		this.ipAddress = ipAddress;
		
		/**
		 * We set the item parameters
		 */
		mySRSTReference.setName(this.getName());
		this.ipAddress = this.ipAddress.trim();
		mySRSTReference.setIpAddress(this.ipAddress);
		/*********/
		}

	public SRSTReference(String name) throws Exception
		{
		super(itemType.srstreference, name);
		mySRSTReference = new SRSTReferenceLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
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
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return mySRSTReference.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		mySRSTReference.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		mySRSTReference.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			SRSTReference myS = (SRSTReference) mySRSTReference.get();
			this.UUID = myS.getUUID();
			this.ipAddress = myS.getIpAddress();
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	public String getInfo()
		{
		return name+" "
		+UUID+" "
		+ipAddress;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		//Has to be written for further uses
		}
	
	public String getIpAddress()
		{
		return ipAddress;
		}

	public void setIpAddress(String ipAddress)
		{
		this.ipAddress = ipAddress;
		}

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

