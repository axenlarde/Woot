package com.alex.woot.misc;

import com.alex.woot.user.items.User;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;

/**********************************
 * Class used to store voicemail data
 * 
 * @author RATEL Alexandre
 **********************************/
public class Voicemail extends ItemToInject
	{
	/**
	 * Variables
	 */
	private String firstname,
	lastname,
	displayname,
	voicemailtemplate;
	//Alias is the name
	
	private int index;
	
	/***************
	 * Constructor
	 ***************/
	public Voicemail(String name, String firstname,
			String lastname, String displayname, String voicemailtemplate)
		{
		super(itemType.voicemail, name);
		this.firstname = firstname;
		this.lastname = lastname;
		this.displayname = displayname;
		this.voicemailtemplate = voicemailtemplate;
		}
	
	public Voicemail(String name) throws Exception
		{
		super(itemType.voicemail, name);
		//Think what to do with a voicemail linker
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
		//return myUser.inject();//Return UUID
		return null;
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		//myUser.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		//myUser.update();
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
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
		name = CollectionTools.getValueFromCollectionFile(index, name);
		lastname = CollectionTools.getValueFromCollectionFile(index, lastname);
		firstname = CollectionTools.getValueFromCollectionFile(index, firstname);
		displayname = CollectionTools.getValueFromCollectionFile(index, displayname);
		voicemailtemplate = CollectionTools.getValueFromCollectionFile(index, voicemailtemplate);
		
		/**
		 * We set the item parameters
		 */
		/*
		myUser.setName(this.getName());
		myUser.setFirstname(firstname);
		myUser.setLastname(lastname);
		myUser.setDeviceList(deviceList);
		myUser.setUDPList(UDPList);
		myUser.setPin(pin);*/
		/*********/
		}

	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

