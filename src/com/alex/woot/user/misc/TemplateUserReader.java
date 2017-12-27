package com.alex.woot.user.misc;

import java.util.ArrayList;

import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.PhoneService;
import com.alex.woot.misc.SpeedDial;
import com.alex.woot.misc.Voicemail;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.user.items.DeviceProfile;
import com.alex.woot.user.items.Phone;
import com.alex.woot.user.items.User;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.xMLGear;
import com.alex.woot.utils.xMLReader;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to read the User template
 * 
 * @author RATEL Alexandre
 **********************************/
public class TemplateUserReader
	{
	/**************
	 * Variables
	 */
	
	/*********************
	 * Static method used to read the User Template 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> readUserTemplate() throws Exception
		{
		try
			{
			Variables.getLogger().info("Reading the User Template file : "+Variables.getUserTemplateFileName());
			String fileContent = xMLReader.fileRead(Variables.getUserTemplateFileName());
			
			//We initialize the Item to Inject List
			ArrayList<ItemToInject> UserTemplateList = new ArrayList<ItemToInject>();
			
			ArrayList<String> listParams = new ArrayList<String>();
			listParams.add("items");
			
			//We get here the list of the items we want to process
			ArrayList<String[][]> templateUserContent = xMLGear.getResultListTab(fileContent, listParams);
			
			//And here we get the detail
			ArrayList<ArrayList<String[][]>> templateUserContentDetail = xMLGear.getResultListTabExt(fileContent, listParams);
			
			String[][] tab = templateUserContent.get(0);
			ArrayList<String[][]> detail = templateUserContentDetail.get(0);
			
			/******
			 * For each item we check if we have to process it.
			 * If yes we create the suitable item object and 
			 * we add it to the list of items to inject
			 */
			for(int i=0; i<tab.length; i++)
				{
				for(itemType item : itemType.values())
					{
					if(tab[i][0].equals(item.name()))
						{
						ItemToInject myItem = createItem(item, detail.get(i));
						if(myItem != null)UserTemplateList.add(myItem);
						break;
						}
					}
				}
			
			return UserTemplateList;
			}
		catch(Exception e)
			{
			e.printStackTrace();
			throw new Exception("ERROR while reading the User Template file : "+e.getMessage());
			}
		}
	
	/**
	 * Method used to create Item
	 * 
	 * For the users, opposite of the CUCM items, we create here an item
	 * without resolving the "template". For instance, 'DP_'+cucm.sitename will stay 'DP_'+cucm.sitename
	 * 
	 * @throws Exception 
	 */
	private static ItemToInject createItem(itemType type, String[][] itemDetails) throws Exception
		{
		if(type.equals(itemType.phone))
			{
			//Lines
			ArrayList<PhoneLine> lineList = readLines(itemDetails);
			
			//Phone Services
			ArrayList<PhoneService> myServiceList = readPhoneServices(itemDetails);
			
			//Speed Dial
			ArrayList<SpeedDial> mySDList = readSpeedDials(itemDetails);			
			
			//Phone
			return new Phone(UsefulMethod.getItemByName("targetname", itemDetails),
					UsefulMethod.getItemByName("devicename", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("producttype", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("buttontemplate", itemDetails),
					UsefulMethod.getItemByName("cssdevice", itemDetails),
					UsefulMethod.getItemByName("devicepool", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					UsefulMethod.getItemByName("commondeviceconfig", itemDetails),
					UsefulMethod.getItemByName("aargroup", itemDetails),
					UsefulMethod.getItemByName("aarcss", itemDetails),
					UsefulMethod.getItemByName("subscribecss", itemDetails),
					UsefulMethod.getItemByName("reroutingcss", itemDetails),
					myServiceList,
					lineList,
					"true",
					mySDList,
					UsefulMethod.getItemByName("commonphoneconfig", itemDetails),
					UsefulMethod.getItemByName("securityprofile", itemDetails),
					UsefulMethod.getItemByName("devicemobilitymode", itemDetails));
			}
		if(type.equals(itemType.analog))
			{
			//Lines
			ArrayList<PhoneLine> lineList = readLines(itemDetails);			
			
			return new Phone(UsefulMethod.getItemByName("targetname", itemDetails),
					"Analog",
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("producttype", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					"Standard Analog",
					UsefulMethod.getItemByName("cssdevice", itemDetails),
					UsefulMethod.getItemByName("devicepool", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					UsefulMethod.getItemByName("commondeviceconfig", itemDetails),
					UsefulMethod.getItemByName("aargroup", itemDetails),
					UsefulMethod.getItemByName("aarcss", itemDetails),
					UsefulMethod.getItemByName("subscribecss", itemDetails),
					"",
					new ArrayList<PhoneService>(),
					lineList,
					"false",
					new ArrayList<SpeedDial>(),
					UsefulMethod.getItemByName("commonphoneconfig", itemDetails),
					UsefulMethod.getItemByName("securityprofile", itemDetails),
					UsefulMethod.getItemByName("devicemobilitymode", itemDetails));
			
			}
		else if(type.equals(itemType.udp))
			{
			//Line
			//Lines
			ArrayList<PhoneLine> lineList = readLines(itemDetails);
			
			//Phone Services
			ArrayList<PhoneService> myServiceList = readPhoneServices(itemDetails);
			
			//Speed Dial
			ArrayList<SpeedDial> mySDList = readSpeedDials(itemDetails);
			
			//Device Profile
			return new DeviceProfile(UsefulMethod.getItemByName("targetname", itemDetails),
					UsefulMethod.getItemByName("devicename", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("producttype", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("buttontemplate", itemDetails),
					myServiceList,
					lineList,
					mySDList);
			}
		else if(type.equals(itemType.user))
			{
			//device list
			ArrayList<String> deviceList = readUserList(itemDetails, "device");
			ArrayList<String> UDPList = readUserList(itemDetails, "udp");
			ArrayList<String> groupList = readUserList(itemDetails, "group");
			
			
			
			return new User(UsefulMethod.getItemByName("targetname", itemDetails),
					UsefulMethod.getItemByName("userid", itemDetails),
					deviceList,
					UDPList,
					groupList,
					UsefulMethod.getItemByName("lastname", itemDetails),
					UsefulMethod.getItemByName("firstname", itemDetails),
					UsefulMethod.getItemByName("telephonenumber", itemDetails),
					UsefulMethod.getItemByName("userlocal", itemDetails),
					UsefulMethod.getItemByName("subscribecss", itemDetails),
					UsefulMethod.getItemByName("primaryextension", itemDetails),
					UsefulMethod.getItemByName("partition", itemDetails),
					UsefulMethod.getItemByName("pin", itemDetails),
					UsefulMethod.getItemByName("password", itemDetails));
			}
		else if(type.equals(itemType.voicemail))
			{
			return new Voicemail(UsefulMethod.getItemByName("alias", itemDetails),
					UsefulMethod.getItemByName("firstname", itemDetails),
					UsefulMethod.getItemByName("lastname", itemDetails),
					UsefulMethod.getItemByName("displayname", itemDetails),
					UsefulMethod.getItemByName("voicemailtemplate", itemDetails));
			}
		
		//etc...
		throw new Exception("No item type found : "+type.name());
		}
	
	/**
	 * Used to retrieve the service config from the template file
	 */
	private static ArrayList<PhoneService> readPhoneServices(String[][] itemDetails)
		{
		ArrayList<PhoneService> myServiceList = new ArrayList<PhoneService>();
		
		for(String[] s : itemDetails)
			{
			if(s[0].equals("service"))
				{
				myServiceList.add(new PhoneService(s[1]));
				}
			}
		
		return myServiceList;
		}
	
	/**
	 * Used to retrieve the speed dial from the template file
	 */
	private static ArrayList<SpeedDial> readSpeedDials(String[][] itemDetails)
		{
		ArrayList<SpeedDial> mySDList = new ArrayList<SpeedDial>();
		int position = 1;
		for(int i=0; i<itemDetails.length; i++)
			{
			String[] s = itemDetails[i];
			
			if(s[0].equals("speeddial"))
				{
				mySDList.add(new SpeedDial(
						s[1],
						position));
				position++;
				}
			}
		
		return mySDList;
		}
	
	/**
	 * Used to retrieve the line from the template file
	 * @throws Exception 
	 */
	private static ArrayList<PhoneLine> readLines(String[][] itemDetails) throws Exception
		{
		ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
		
		int y=1;
		
		for(int i=0; i<itemDetails.length; i++)
			{
			String[] s = itemDetails[i];
			
			if(s[0].equals("linenumber"))
				{
				lineList.add(new PhoneLine(UsefulMethod.getItemByName("linedescription", itemDetails),
						UsefulMethod.getItemByName("linetextlabel", itemDetails),
						UsefulMethod.getItemByName("linetextlabel", itemDetails),
						UsefulMethod.getItemByName("display", itemDetails),
						UsefulMethod.getItemByName("display", itemDetails),
						UsefulMethod.getItemByName("externalphonemask", itemDetails),
						s[1],
						UsefulMethod.getItemByName("routepartition", itemDetails),
						UsefulMethod.getItemByName("cssline", itemDetails),
						UsefulMethod.getItemByName("alertingname", itemDetails),
						UsefulMethod.getItemByName("alertingname", itemDetails),
						UsefulMethod.getItemByName("cssforward", itemDetails),
						UsefulMethod.getItemByName("fwalldestination", itemDetails),
						UsefulMethod.getItemByName("fwnoandestination", itemDetails),
						UsefulMethod.getItemByName("fwbusydestination", itemDetails),
						UsefulMethod.getItemByName("fwunrdestination", itemDetails),
						UsefulMethod.getItemByName("voicemailprofile", itemDetails),
						UsefulMethod.getItemByName("fwallvoicemailenable", itemDetails),
						UsefulMethod.getItemByName("fwnoanvoicemailenable", itemDetails),
						UsefulMethod.getItemByName("fwbusyvoicemailenable", itemDetails),
						UsefulMethod.getItemByName("fwunrvoicemailenable", itemDetails),
						y));
				y++;
				}
			}
		
		return lineList;
		}
	
	/**
	 * Used to retrieve the user device config from the template file
	 */
	private static ArrayList<String> readUserList(String[][] itemDetails, String lookFor)
		{
		ArrayList<String> list = new ArrayList<String>();
		
		for(String[] s : itemDetails)
			{
			if(s[0].equals(lookFor))
				{
				list.add(s[1]);
				}
			}
		
		return list;
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

