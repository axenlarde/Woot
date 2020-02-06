package com.alex.woot.user.items;

import java.util.ArrayList;

import com.alex.woot.axlitems.linkers.UserLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.EmptyValueException;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;
import com.alex.woot.utils.Variables.UserSource;
import com.alex.woot.utils.Variables.actionType;

/**********************************
 * Class used to define an item of type "Device Pool"
 * 
 * @author RATEL Alexandre
 **********************************/

public class User extends ItemToInject
	{
	/**
	 * Variables
	 */
	private UserLinker myUser;
	private String targetName,
	lastname,//Name is the userID
	firstname,
	telephoneNumber,
	userLocale,
	subscribeCallingSearchSpaceName,
	primaryExtension,
	ipccExtension,
	routePartition,
	pin,
	password;
	
	private ArrayList<String> userControlGroupList;
	private ArrayList<String> deviceList;
	private ArrayList<String> UDPList;
	private ArrayList<String> ctiUDPList;
	
	private int index;
	

	/***************
	 * Constructor
	 * @throws Exception
	 ***************/
	public User(String targetName,
			String name,
			ArrayList<String> deviceList,
			ArrayList<String> UDPList,
			ArrayList<String> ctiUDPList,
			ArrayList<String> userControlGroupList,
			String lastname,
			String firstname,
			String telephoneNumber,
			String userLocale,
			String subscribeCallingSearchSpaceName,
			String primaryExtension,
			String ipccExtension,
			String routePartition,
			String pin,
			String password) throws Exception
		{
		super(itemType.user, name);
		this.targetName = targetName;
		myUser = new UserLinker(name);
		this.deviceList = deviceList;
		this.UDPList = UDPList;
		this.ctiUDPList = ctiUDPList;
		this.lastname = lastname;
		this.firstname = firstname;
		this.telephoneNumber = telephoneNumber;
		this.userLocale = userLocale;
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		this.primaryExtension = primaryExtension;
		this.ipccExtension = ipccExtension;
		this.routePartition = routePartition;
		this.userControlGroupList = userControlGroupList;
		this.pin = pin;
		this.password = password;
		}

	public User(String name,
			String deviceName,
			String UDPName,
			String ctiUDPName,
			String userControlGroupName,
			String lastname,
			String firstname,
			String telephoneNumber,
			String userLocale,
			String subscribeCallingSearchSpaceName,
			String primaryExtension,
			String ipccExtension,
			String routePartition,
			String pin,
			String password) throws Exception
		{
		super(itemType.user, name);
		myUser = new UserLinker(name);
		deviceList = new ArrayList<String>();
		if(!((deviceName == null) || (deviceName.equals(""))))deviceList.add(deviceName);
		UDPList = new ArrayList<String>();
		if(!((UDPName == null) || (UDPName.equals(""))))UDPList.add(UDPName);
		ctiUDPList = new ArrayList<String>();
		if(!((ctiUDPName == null) || (ctiUDPName.equals(""))))ctiUDPList.add(ctiUDPName);
		userControlGroupList = new ArrayList<String>();
		if(!((userControlGroupName == null) || (userControlGroupName.equals(""))))userControlGroupList.add(userControlGroupName);
		this.lastname = lastname;
		this.firstname = firstname;
		this.telephoneNumber = telephoneNumber;
		this.userLocale = userLocale;
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		this.primaryExtension = primaryExtension;
		this.ipccExtension = ipccExtension;
		this.routePartition = routePartition;
		this.pin = pin;
		this.password = password;
		}
	
	public User(String name) throws Exception
		{
		super(itemType.user, name);
		myUser = new UserLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		/**
		 * If the user already exist but the data source is LDAP
		 * we will update it instead
		 */
		if((this.status == statusType.injected) && 
			(Variables.getUserSource().equals(UserSource.external)) &&
			!(this.action.equals(actionType.delete)))
			{
			setStatus(statusType.waiting);
			setAction(actionType.update);
			}
		
		errorList.addAll(myUser.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myUser.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myUser.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myUser.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		User myU = (User) myUser.get();
		this.UUID = myU.getUUID();
		//Has to be written
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
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
		name = CollectionTools.getValueFromCollectionFile(index, name, this, true);
		lastname = CollectionTools.getValueFromCollectionFile(index, lastname, this, true);
		firstname = CollectionTools.getValueFromCollectionFile(index, firstname, this, false);
		telephoneNumber = CollectionTools.getValueFromCollectionFile(index, telephoneNumber, this, false);
		userLocale = CollectionTools.getValueFromCollectionFile(index, userLocale, this, false);
		subscribeCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(index, subscribeCallingSearchSpaceName, this, false);
		primaryExtension = CollectionTools.getValueFromCollectionFile(index, primaryExtension, this, false);
		ipccExtension = CollectionTools.getValueFromCollectionFile(index, ipccExtension, this, false);
		routePartition = CollectionTools.getValueFromCollectionFile(index, routePartition, this, false);
		pin = CollectionTools.getValueFromCollectionFile(index, pin, this, false);
		password = CollectionTools.getValueFromCollectionFile(index, password, this, false);
		
		ArrayList<String> ucgList = new ArrayList<String>();
		for(String s : userControlGroupList)
			{
			try
				{
				ucgList.add(CollectionTools.getValueFromCollectionFile(index, s, this, true));
				}
			catch(EmptyValueException eve)
				{
				Variables.getLogger().debug("User "+name+" the user group "+s+
						" has not been added because it returned an empty value : "+eve.getMessage());
				}
			}
		this.userControlGroupList = ucgList;
		
		resolveDevices(index);
		
		/**
		 * We set the item parameters
		 */
		myUser.setName(this.getName());
		myUser.setFirstname(firstname);
		myUser.setLastname(lastname);
		myUser.setTelephoneNumber(telephoneNumber);
		myUser.setUserLocale(userLocale);
		myUser.setSubscribeCallingSearchSpaceName(subscribeCallingSearchSpaceName);
		myUser.setPrimaryExtension(primaryExtension);
		myUser.setIpccExtension(ipccExtension);
		myUser.setRoutePartition(routePartition);
		myUser.setUserControlGroupList(userControlGroupList);
		myUser.setPassword(password);
		myUser.setPin(pin);
		/*********/
		}
	
	/**
	 * Used to resolve only the devices and UDPs
	 * @throws Exception 
	 */
	public void resolveDevices(int j) throws Exception
		{
		//Devices
		ArrayList<String> dList = new ArrayList<String>();
		for(int i=0; i<deviceList.size(); i++)
			{
			try
				{
				dList.add(CollectionTools.getValueFromCollectionFile(j, deviceList.get(i), this, true));
				}
			catch(EmptyValueException eve)
				{
				Variables.getLogger().debug("User "+name+" the device "+i+" "+deviceList.get(i)+
						" has not been added because it returned an empty value : "+eve.getMessage());
				}
			}
		
		//UDP
		ArrayList<String> udpList = new ArrayList<String>();
		for(int i=0; i<UDPList.size(); i++)
			{
			try
				{
				udpList.add(CollectionTools.getValueFromCollectionFile(j, UDPList.get(i), this, true));
				}
			catch(EmptyValueException eve)
				{
				Variables.getLogger().debug("User "+name+" the UDP "+i+" "+UDPList.get(i)+
						" has not been added because it returned an empty value : "+eve.getMessage());
				}
			}
		
		//ctiUDP
		ArrayList<String> ctiudpList = new ArrayList<String>();
		for(int i=0; i<ctiUDPList.size(); i++)
			{
			try
				{
				ctiudpList.add(CollectionTools.getValueFromCollectionFile(j, ctiUDPList.get(i), this, true));
				}
			catch(EmptyValueException eve)
				{
				Variables.getLogger().debug("User "+name+" the ctiUDP "+i+" "+ctiUDPList.get(i)+
						" has not been added because it returned an empty value : "+eve.getMessage());
				}
			}
		
		deviceList = dList;
		UDPList = udpList;
		ctiUDPList = ctiudpList;
		myUser.setDeviceList(deviceList);
		myUser.setUDPList(UDPList);
		myUser.setCtiUDPList(ctiUDPList);
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(lastname))tuList.add(UserLinker.toUpdate.lastname);
		if(UsefulMethod.isNotEmpty(firstname))tuList.add(UserLinker.toUpdate.firstname);
		if(UsefulMethod.isNotEmpty(telephoneNumber))tuList.add(UserLinker.toUpdate.telephoneNumber);
		if(UsefulMethod.isNotEmpty(userLocale))tuList.add(UserLinker.toUpdate.userLocale);
		if(UsefulMethod.isNotEmpty(subscribeCallingSearchSpaceName))tuList.add(UserLinker.toUpdate.subscribeCallingSearchSpaceName);
		if(UsefulMethod.isNotEmpty(primaryExtension))tuList.add(UserLinker.toUpdate.primaryExtension);
		if(UsefulMethod.isNotEmpty(ipccExtension))tuList.add(UserLinker.toUpdate.ipccExtension);
		if(UsefulMethod.isNotEmpty(pin))tuList.add(UserLinker.toUpdate.pin);
		if(UsefulMethod.isNotEmpty(password))tuList.add(UserLinker.toUpdate.password);
		if((userControlGroupList != null) && (userControlGroupList.size() != 0))tuList.add(UserLinker.toUpdate.userControlGroup);
		if((deviceList != null) && (deviceList.size() != 0))tuList.add(UserLinker.toUpdate.devices);
		if((UDPList != null) && (UDPList.size() != 0))tuList.add(UserLinker.toUpdate.udps);
		if((ctiUDPList != null) && (ctiUDPList.size() != 0))tuList.add(UserLinker.toUpdate.ctiudps);
		}

	public String getLastname()
		{
		return lastname;
		}

	public void setLastname(String lastname)
		{
		this.lastname = lastname;
		}

	public String getFirstname()
		{
		return firstname;
		}

	public void setFirstname(String firstname)
		{
		this.firstname = firstname;
		}

	public ArrayList<String> getDeviceList()
		{
		return deviceList;
		}

	public void setDeviceList(ArrayList<String> deviceList)
		{
		this.deviceList = deviceList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public ArrayList<String> getUDPList()
		{
		return UDPList;
		}

	public void setUDPList(ArrayList<String> uDPList)
		{
		UDPList = uDPList;
		}

	public String getPin()
		{
		return pin;
		}

	public void setPin(String pin)
		{
		this.pin = pin;
		}

	public UserLinker getMyUser()
		{
		return myUser;
		}

	public void setMyUser(UserLinker myUser)
		{
		this.myUser = myUser;
		}

	public String getTargetName()
		{
		return targetName;
		}

	public void setTargetName(String targetName)
		{
		this.targetName = targetName;
		}

	public String getPassword()
		{
		return password;
		}

	public void setPassword(String password)
		{
		this.password = password;
		}

	public String getSubscribeCallingSearchSpaceName()
		{
		return subscribeCallingSearchSpaceName;
		}

	public void setSubscribeCallingSearchSpaceName(
			String subscribeCallingSearchSpaceName)
		{
		this.subscribeCallingSearchSpaceName = subscribeCallingSearchSpaceName;
		}

	public String getPrimaryExtension()
		{
		return primaryExtension;
		}

	public void setPrimaryExtension(String primaryExtension)
		{
		this.primaryExtension = primaryExtension;
		}

	public String getRoutePartition()
		{
		return routePartition;
		}

	public void setRoutePartition(String routePartition)
		{
		this.routePartition = routePartition;
		}

	public ArrayList<String> getUserControlGroupList()
		{
		return userControlGroupList;
		}

	public void setUserControlGroupList(ArrayList<String> userControlGroupList)
		{
		this.userControlGroupList = userControlGroupList;
		}

	public String getTelephoneNumber()
		{
		return telephoneNumber;
		}

	public void setTelephoneNumber(String telephoneNumber)
		{
		this.telephoneNumber = telephoneNumber;
		}

	public String getUserLocale()
		{
		return userLocale;
		}

	public void setUserLocale(String userLocale)
		{
		this.userLocale = userLocale;
		}

	public String getIpccExtension()
		{
		return ipccExtension;
		}

	public void setIpccExtension(String ipccExtension)
		{
		this.ipccExtension = ipccExtension;
		}

	public ArrayList<String> getCtiUDPList()
		{
		return ctiUDPList;
		}

	public void setCtiUDPList(ArrayList<String> ctiUDPList)
		{
		this.ctiUDPList = ctiUDPList;
		}

	
	
	
	/*2020*//*RATEL Alexandre 8)*/
	}

