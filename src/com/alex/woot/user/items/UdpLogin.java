package com.alex.woot.user.items;

import com.alex.woot.axlitems.linkers.LineLinker;
import com.alex.woot.axlitems.linkers.UdpLoginLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to define an item of type "UDP Login"
 * 
 * @author RATEL Alexandre
 **********************************/

public class UdpLogin extends ItemToInject
	{
	/**
	 * Variables
	 */
	private UdpLoginLinker myUDPLogin;
	private String deviceName,
	deviceProfile;//UserID is the name
	
	private int index;

	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public UdpLogin(String name,
			String deviceName, String deviceProfile) throws Exception
		{
		super(itemType.udplogin, name);
		this.myUDPLogin = new UdpLoginLinker();
		this.deviceName = deviceName;
		this.deviceProfile = deviceProfile;
		this.action = actionType.inject;
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We now gather the needed UUID
		errorList = myUDPLogin.init();
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{	
		return myUDPLogin.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myUDPLogin.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myUDPLogin.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			UdpLogin myUDP = (UdpLogin) myUDPLogin.get();
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
		return name+" "
		+deviceName+" "
		+deviceProfile;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name);
		deviceName = CollectionTools.getValueFromCollectionFile(index, deviceName);
		deviceProfile = CollectionTools.getValueFromCollectionFile(index, deviceProfile);
		
		/**
		 * We set the item parameters
		 */
		myUDPLogin.setName(name);//It is the userID
		myUDPLogin.setDeviceName(deviceName);
		myUDPLogin.setDeviceProfile(deviceProfile);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(name))tuList.add(UdpLoginLinker.toUpdate.userID);
		if(UsefulMethod.isNotEmpty(deviceName))tuList.add(UdpLoginLinker.toUpdate.deviceName);
		if(UsefulMethod.isNotEmpty(deviceProfile))tuList.add(UdpLoginLinker.toUpdate.deviceProfile);
		}

	public UdpLoginLinker getMyUDPLogin()
		{
		return myUDPLogin;
		}

	public void setMyUDPLogin(UdpLoginLinker myUDPLogin)
		{
		this.myUDPLogin = myUDPLogin;
		}

	public String getDeviceName()
		{
		return deviceName;
		}

	public void setDeviceName(String deviceName)
		{
		this.deviceName = deviceName;
		}

	public String getDeviceProfile()
		{
		return deviceProfile;
		}

	public void setDeviceProfile(String deviceProfile)
		{
		this.deviceProfile = deviceProfile;
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

