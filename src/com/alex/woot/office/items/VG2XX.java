package com.alex.woot.office.items;

import java.util.ArrayList;

//import jxl.Workbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;

import com.alex.yuza.axlitems.VG2XXLinker;
import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.statusType;

/**********************************
 * Class used to define an item of type "VG2XX"
 * 
 * @author RATEL Alexandre
 **********************************/

public class VG2XX extends ItemToInject
	{
	/**
	 * Variables
	 */
	private VG2XXLinker myVg;
	private String description,
	product,
	protocol,
	callManagerGroupName;
	
	private int index, size;
	private boolean t38Enable;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public VG2XX(String name, Workbook myWorkbook,
			String description, String product,
			String protocol, String callManagerGroupName, boolean t38Enable) throws Exception
		{
		super(itemType.vg, name, myWorkbook);
		myVg = new VG2XXLinker(name);
		this.description = description;
		this.product = product;
		this.protocol = protocol;
		this.callManagerGroupName = callManagerGroupName;
		size = findSize();
		this.t38Enable = t38Enable;
		}

	public VG2XX(String name) throws Exception
		{
		super(itemType.vg, name);
		myVg = new VG2XXLinker(name);
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
		return myVg.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myVg.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myVg.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			VG2XX myT = (VG2XX) myVg.get();
			this.UUID = myT.getUUID();
			//Has to be written
			
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
		return name+" "+
		UUID;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name, myWorkbook);
		description = CollectionTools.getValueFromCollectionFile(description, myWorkbook);
		//product = CollectionTools.getValueFromCollectionFile(product, myWorkbook);
		protocol = CollectionTools.getValueFromCollectionFile(protocol, myWorkbook);
		callManagerGroupName = CollectionTools.getValueFromCollectionFile(callManagerGroupName, myWorkbook);
		
		/**
		 * We set the item parameters
		 */
		myVg.setName(name);
		myVg.setDescription(description);
		myVg.setProduct(product);
		myVg.setProtocol(protocol);
		myVg.setCallManagerGroupName(callManagerGroupName);
		myVg.setT38Enable(t38Enable);
		myVg.setSize(size);
		/*********/
		}

	/******
	 * Method used to find the VG size 2, 4 or 224
	 */
	private int findSize()
		{
		if(product.contains("204"))
			{
			return 4;
			}
		else if(product.contains("224"))
			{
			return 24;
			}
		else
			{
			return 2;
			}
		}
	
	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getProduct()
		{
		return product;
		}

	public void setProduct(String product)
		{
		this.product = product;
		}

	public String getProtocol()
		{
		return protocol;
		}

	public void setProtocol(String protocol)
		{
		this.protocol = protocol;
		}

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public boolean isT38Enable()
		{
		return t38Enable;
		}

	public void setT38Enable(boolean t38Enable)
		{
		this.t38Enable = t38Enable;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

