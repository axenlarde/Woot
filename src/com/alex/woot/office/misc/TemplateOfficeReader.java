package com.alex.woot.office.misc;

import java.util.ArrayList;


import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.xMLGear;
import com.alex.woot.utils.xMLReader;
import com.alex.woot.office.items.*;
import com.alex.woot.soap.items.RelatedRegionDetail;



/**********************************
 * Class used to read the CUCM template
 * 
 * @author RATEL Alexandre
 **********************************/
public class TemplateOfficeReader
	{
	/**************
	 * Variables
	 */
	
	/*********************
	 * Static method used to read the CUCM Template 
	 * @throws Exception 
	 */
	public static ArrayList<OfficeTemplate> readOfficeTemplate() throws Exception
		{
		try
			{
			Variables.getLogger().info("Reading the CCM Template file : "+Variables.getCcmTemplateFileName());
			String fileContent = xMLReader.fileRead(Variables.getCcmTemplateFileName());
			
			ArrayList<String> listParams = new ArrayList<String>();
			listParams.add("template");
			
			//We get here the list of the items we want to inject
			ArrayList<String[][]> templateCCMContent = xMLGear.getResultListTab(fileContent, listParams);
			
			//And here we get the detail
			ArrayList<ArrayList<String[][]>> templateCCMContentDetail = xMLGear.getResultListTabExt(fileContent, listParams);
			
			//We initialize the Office template List
			ArrayList<OfficeTemplate> officeTemplateList = new ArrayList<OfficeTemplate>();
			
			/******
			 * For each item we check if we have to process it.
			 * If yes we create the suitable item object and 
			 * we add it to the list of items to inject
			 */		
			for(int a=0; a<templateCCMContent.size(); a++)
				{
				String[][] tab = templateCCMContent.get(a);
				ArrayList<String[][]> detail = templateCCMContentDetail.get(a);
				ArrayList<ItemToInject> CCMTemplateList = new ArrayList<ItemToInject>();
				
				//We get the name of the template
				
				OfficeTemplate myOfficeT = new OfficeTemplate(detail.get(0)[0][0]);//Should be the template name ;)
				
				for(int i=0; i<tab.length; i++)
					{
					for(itemType item : itemType.values())
						{
						if(tab[i][0].equals(item.name()))
							{
							ItemToInject myItem = createItem(item, detail.get(i));
							if(myItem != null)CCMTemplateList.add(myItem);
							}
						}
					}
				myOfficeT.setTemplateItemList(CCMTemplateList);
				officeTemplateList.add(myOfficeT);
				}
			return officeTemplateList;
			}
		catch(Exception e)
			{
			throw new Exception("Error while reading the CCM Template file : "+e.getMessage());
			}
		}
	
	/**
	 * Method used to create Item
	 * @throws Exception 
	 */
	private static ItemToInject createItem(itemType type, String[][] itemDetails) throws Exception
		{
		if(type.equals(itemType.location))//Location
			{
			Location myLocation = new Location(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("audiobandwidth", itemDetails),
					UsefulMethod.getItemByName("videobandwidth", itemDetails));
			
			myLocation.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myLocation;
			}
		else if(type.equals(itemType.region))
			{
			ArrayList<RelatedRegionDetail> myG711RR = new ArrayList<RelatedRegionDetail>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("g711"))myG711RR.add(new RelatedRegionDetail(
						CollectionTools.getValueFromCollectionFile(s[1], myWorkbook),
						CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("videobandwidth", itemDetails), myWorkbook),
						"G.711"));
				}
			
			return new Region(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("defaultcodec", itemDetails), myWorkbook),
					myG711RR,
					myWorkbook);
			}
		else if(type.equals(itemType.srstreference))
			{
			return new SRSTReference(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("ipaddress", itemDetails), myWorkbook),
					myWorkbook);
			}
		else if(type.equals(itemType.devicepool))
			{
			return new DevicePool(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("callmanagergroup", itemDetails),
					UsefulMethod.getItemByName("region", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					UsefulMethod.getItemByName("networklocale", itemDetails),
					UsefulMethod.getItemByName("datetimesetting", itemDetails),
					UsefulMethod.getItemByName("srstreference", itemDetails),
					UsefulMethod.getItemByName("mediaressourcegrouplist", itemDetails),
					UsefulMethod.getItemByName("localroutegroup", itemDetails),
					UsefulMethod.getItemByName("physicallocation", itemDetails),
					UsefulMethod.getItemByName("devicemobilitygroup", itemDetails),
					UsefulMethod.getItemByName("devicemobilitycss", itemDetails),
					myWorkbook);
			}
		else if(type.equals(itemType.conferencebridge))
			{
			return new ConferenceBridge(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("description", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("devicepoolname", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("locationname", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("commondeviceconfigname", itemDetails), myWorkbook),
					myWorkbook);
			}
		else if(type.equals(itemType.mediaressourcegroup))
			{
			ArrayList<String> myMembers = new ArrayList<String>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))myMembers.add(CollectionTools.getValueFromCollectionFile(s[1], myWorkbook));
				}
			
			return new MediaRessourceGroup(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("description", itemDetails), myWorkbook),
					(((CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("multicast", itemDetails), myWorkbook)).equals("true"))?true:false),
					myMembers,
					myWorkbook);
			}
		else if(type.equals(itemType.mediaressourcegrouplist))
			{
			ArrayList<MRGLMember> myMembers = new ArrayList<MRGLMember>();
			
			int i=1;
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))
					{
					myMembers.add(new MRGLMember(CollectionTools.getValueFromCollectionFile(s[1], myWorkbook), i));
					i++;
					}
				}
			
			return new MediaRessourceGroupList(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					myMembers,
					myWorkbook);
			}
		else if(type.equals(itemType.trunksip))
			{
			ArrayList<SipTrunkDestination> myDestinations = new ArrayList<SipTrunkDestination>();
			
			int i=1;
			for(String[] s : itemDetails)
				{
				if(s[0].equals("destination"))
					{
					String[] tab = s[1].split(":");
					myDestinations.add(new SipTrunkDestination(tab[0], tab[1], i));
					i++;
					}
				}
			
			return new TrunkSip(UsefulMethod.getItemByName("name", itemDetails),
					myWorkbook,
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("css", itemDetails),
					UsefulMethod.getItemByName("devicepool", itemDetails),
					UsefulMethod.getItemByName("commondeviceconfig", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					UsefulMethod.getItemByName("securityprofile", itemDetails),
					UsefulMethod.getItemByName("sipprofile", itemDetails),
					UsefulMethod.getItemByName("outboundcallingptcss", itemDetails),
					UsefulMethod.getItemByName("outboundusedevicepoolcallingptransformcss", itemDetails),
					UsefulMethod.getItemByName("outboundcalledptcss", itemDetails),
					UsefulMethod.getItemByName("outboundusedevicepoolcalledptransformcss", itemDetails),
					UsefulMethod.getItemByName("subscribecss", itemDetails),
					UsefulMethod.getItemByName("reroutingcss", itemDetails),
					UsefulMethod.getItemByName("inboundprefix", itemDetails),
					UsefulMethod.getItemByName("inboundstripdigits", itemDetails),
					UsefulMethod.getItemByName("inboundcallingptcss", itemDetails),
					UsefulMethod.getItemByName("inboundusedevicepoolcallingptransformcss", itemDetails),
					myDestinations);
			
			}
		else if(type.equals(itemType.routegroup))
			{
			ArrayList<RouteGroupMember> myMembers = new ArrayList<RouteGroupMember>();
			
			int i=1;
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))
					{
					myMembers.add(new RouteGroupMember(CollectionTools.getValueFromCollectionFile(s[1], myWorkbook), i));
					i++;
					}
				}
			
			return new RouteGroup(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("distributionalgorithm", itemDetails), myWorkbook),
					myMembers,
					myWorkbook);
			}
		else if(type.equals(itemType.vg))
			{
			String s = UsefulMethod.getItemByName("t38enable", itemDetails);
			boolean t38Enable = false;
			if(s.contains("true"))t38Enable = true;
			
			return new VG2XX(UsefulMethod.getItemByName("name", itemDetails),
					myWorkbook,
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("product", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("callmanagergroupname", itemDetails),
					t38Enable);
			}
		else if(type.equals(itemType.translationpattern))
			{
			return new TranslationPattern(UsefulMethod.getItemByName("pattern", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("callingsearchspace", itemDetails),
					UsefulMethod.getItemByName("urgentpriority", itemDetails),
					UsefulMethod.getItemByName("usecallingpartyphonemask", itemDetails),
					UsefulMethod.getItemByName("calledpartytransformmask", itemDetails),
					UsefulMethod.getItemByName("callingpartytransformmask", itemDetails),
					UsefulMethod.getItemByName("discarddigits", itemDetails),
					myWorkbook);
			}
		else if(type.equals(itemType.partition))
			{
			return new Partition(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("description", itemDetails), myWorkbook),
					myWorkbook);
			}
		else if(type.equals(itemType.callingsearchspace))
			{
			ArrayList<PartitionMember> myMembers = new ArrayList<PartitionMember>();
			
			int i=1;
			for(String[] s : itemDetails)
				{
				if(s[0].equals("P"))
					{
					myMembers.add(new PartitionMember(CollectionTools.getValueFromCollectionFile(s[1], myWorkbook), i));
					i++;
					}
				}
			
			return new CallingSearchSpace(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("description", itemDetails), myWorkbook),
					myMembers,
					myWorkbook);
			}
		else if(type.equals(itemType.physicallocation))
			{
			return new PhysicalLocation(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("description", itemDetails), myWorkbook),
					myWorkbook);
			}
		else if(type.equals(itemType.devicemobilityinfo))
			{
			ArrayList<String> myMembers = new ArrayList<String>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("devicepool"))
					{
					myMembers.add(CollectionTools.getValueFromCollectionFile(s[1], myWorkbook));
					}
				}
			
			String subnet = CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("subnet", itemDetails), myWorkbook).trim();
			
			//Convert 255.255.255.0 into 24
			String subnetmask = UsefulMethod.convertStringMaskToIntMask(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("subnetmask", itemDetails), myWorkbook).trim());
			
			Variables.getLogger().debug("Device Mobility Info details : "+subnet+" "+subnetmask);
			
			return new MobilityInfo(CollectionTools.getValueFromCollectionFile(UsefulMethod.getItemByName("name", itemDetails), myWorkbook),
					subnet,
					subnetmask,//Has to be a number of bit
					myMembers,
					myWorkbook);
			}
		//etc...
		throw new Exception("ERROR : No item type found : "+type.name());
		}
	
	/*2015*//*RATEL Alexandre 8)*/
	}

