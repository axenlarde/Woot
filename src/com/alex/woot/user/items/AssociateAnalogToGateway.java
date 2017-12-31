package com.alex.woot.user.items;


import com.alex.woot.axlitems.linkers.AssociateAnalogToGatewayLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Class used to define an item of type "Phone"
 * 
 * @author RATEL Alexandre
 **********************************/

public class AssociateAnalogToGateway extends ItemToInject
	{
	/**
	 * Variables
	 */
	private AssociateAnalogToGatewayLinker myAssoG;
	private String gatewayName,//Name is a description
	portName,
	slot,
	subunit,
	port;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public AssociateAnalogToGateway(String name,
			String gatewayName,
			String portName,
			String slot,
			String subunit,
			String port
			) throws Exception
		{
		super(itemType.associateanalog, name);
		myAssoG = new AssociateAnalogToGatewayLinker(name);
		this.gatewayName = gatewayName;
		this.portName = portName;
		this.slot = slot;
		this.subunit = subunit;
		this.port = port;
		}

	public AssociateAnalogToGateway(String name) throws Exception
		{
		super(itemType.associateanalog, name);
		myAssoG = new AssociateAnalogToGatewayLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		this.errorList = myAssoG.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myAssoG.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myAssoG.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myAssoG.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			AssociateAnalogToGateway myPh = (AssociateAnalogToGateway) myAssoG.get();
			this.UUID = myPh.getUUID();
			//Etc...
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
		return name+" "
		+UUID;
		}

	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name, this);
		gatewayName = CollectionTools.getValueFromCollectionFile(index, gatewayName, this);
		portName = CollectionTools.getValueFromCollectionFile(index, portName, this);
		slot = CollectionTools.getValueFromCollectionFile(index, slot, this);
		subunit = CollectionTools.getValueFromCollectionFile(index, subunit, this);
		port = CollectionTools.getValueFromCollectionFile(index, port, this);
		
		/**
		 * We set the item parameters
		 */
		myAssoG.setName(this.getName());
		myAssoG.setGatewayName(gatewayName);
		myAssoG.setPortName(portName);
		myAssoG.setSlot(slot);
		myAssoG.setSubunit(subunit);
		myAssoG.setPort(port);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		//Nothing to update here
		}

	public String getGatewayName()
		{
		return gatewayName;
		}

	public void setGatewayName(String gatewayName)
		{
		this.gatewayName = gatewayName;
		}

	public String getPortName()
		{
		return portName;
		}

	public void setPortName(String portName)
		{
		this.portName = portName;
		}

	public String getSlot()
		{
		return slot;
		}

	public void setSlot(String slot)
		{
		this.slot = slot;
		}

	public String getSubunit()
		{
		return subunit;
		}

	public void setSubunit(String subunit)
		{
		this.subunit = subunit;
		}

	public String getPort()
		{
		return port;
		}

	public void setPort(String port)
		{
		this.port = port;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

