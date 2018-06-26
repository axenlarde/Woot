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
import com.alex.woot.soap.items.LocalRouteGroup;
import com.alex.woot.soap.items.MRGLMember;
import com.alex.woot.soap.items.PartitionMember;
import com.alex.woot.soap.items.RelatedRegionDetail;
import com.alex.woot.soap.items.RouteGroupMember;
import com.alex.woot.soap.items.SipTrunkDestination;



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
	public static ArrayList<ItemToInject> readOfficeTemplate(String templateName, String fileContent) throws Exception
		{
		try
			{
			ArrayList<String> listParams = new ArrayList<String>();
			listParams.add("template");
			
			//We get here the list of the items we want to inject
			ArrayList<String[][]> templateCCMContent = xMLGear.getResultListTab(fileContent, listParams);
			
			//And here we get the detail
			ArrayList<ArrayList<String[][]>> templateCCMContentDetail = xMLGear.getResultListTabExt(fileContent, listParams);
			
			//The list to return
			ArrayList<ItemToInject> CCMTemplateList = new ArrayList<ItemToInject>();
			
			/******
			 * For each item we check if we have to process it.
			 * If yes we create the suitable item object and 
			 * we add it to the list of items to inject
			 */		
			for(int a=0; a<templateCCMContent.size(); a++)
				{
				String[][] tab = templateCCMContent.get(a);
				ArrayList<String[][]> detail = templateCCMContentDetail.get(a);
				
				if(templateName.equals(detail.get(0)[0][1]))//detail.get(0)[0][1] Should be the template name ;)
					{
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
					return CCMTemplateList;
					}
				}
			throw new Exception("ERROR : The office template name didn't find any existing template");
			}
		catch(Exception e)
			{
			Variables.getLogger().error("ERROR : "+e.getMessage(),e);
			throw new Exception("Error while reading the CCM Template file : "+e.getMessage());
			}
		}
	
	/*********************
	 * Static method used to read the CUCM Template 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> readOfficeQuickTaskTemplate(String pattern) throws Exception
		{
		try
			{
			Variables.getLogger().info("Reading the following CCM pattern : \r\n"+pattern);
			pattern = pattern.replace("\r", "").replace("\n", "");
			pattern = "<xml><pattern>"+pattern+"</pattern></xml>";
			
			ArrayList<String> listParams = new ArrayList<String>();
			listParams.add("pattern");
			
			//We get here the list of the items we want to inject
			ArrayList<String[][]> templateCCMContent = xMLGear.getResultListTab(pattern, listParams);
			
			//And here we get the detail
			ArrayList<ArrayList<String[][]>> templateCCMContentDetail = xMLGear.getResultListTabExt(pattern, listParams);
			
			//The list to return
			ArrayList<ItemToInject> CCMTemplateList = new ArrayList<ItemToInject>();
			
			/******
			 * For each item we check if we have to process it.
			 * If yes we create the suitable item object and 
			 * we add it to the list of items to inject
			 */		
			String[][] tab = templateCCMContent.get(0);
			ArrayList<String[][]> detail = templateCCMContentDetail.get(0);
			
			for(int i=0; i<tab.length; i++)
				{
				for(itemType item : itemType.values())
					{
					if(tab[i][0].equals(item.name()))
						{
						ItemToInject myItem = createItem(item, detail.get(i));
						if(myItem != null)CCMTemplateList.add(myItem);
						Variables.getAllowedItemsToProcess().add(item);
						}
					}
				}
			return CCMTemplateList;
			}
		catch(Exception e)
			{
			Variables.getLogger().error("ERROR : "+e.getMessage(),e);
			throw new Exception("Error while reading the CCM pattern : "+e.getMessage());
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
						s[1],
						UsefulMethod.getItemByName("videobandwidth", itemDetails),
						"G.711",
						UsefulMethod.getItemByName("codecpreferencelist", itemDetails)));
				}
			
			Region myRegion = new Region(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("defaultcodec", itemDetails),
					myG711RR);
			
			myRegion.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myRegion;
			}
		else if(type.equals(itemType.srstreference))
			{
			SRSTReference mySRST = new SRSTReference(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("ipaddress", itemDetails));
			
			mySRST.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return mySRST;
			}
		else if(type.equals(itemType.devicepool))
			{
			ArrayList<LocalRouteGroup> localRouteGroupList = new ArrayList<LocalRouteGroup>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("localroutegroup"))
					{
					String[] tab = s[1].split(":");
					if(tab.length > 1)
						{
						localRouteGroupList.add(new LocalRouteGroup(tab[0], tab[1]));
						}
					else
						{
						localRouteGroupList.add(new LocalRouteGroup("Standard Local Route Group", tab[0]));
						}
					}
				}
			
			DevicePool myDevicePool = new DevicePool(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("callmanagergroup", itemDetails),
					UsefulMethod.getItemByName("region", itemDetails),
					UsefulMethod.getItemByName("location", itemDetails),
					UsefulMethod.getItemByName("networklocale", itemDetails),
					UsefulMethod.getItemByName("datetimesetting", itemDetails),
					UsefulMethod.getItemByName("srstreference", itemDetails),
					UsefulMethod.getItemByName("mediaressourcegrouplist", itemDetails),
					UsefulMethod.getItemByName("physicallocation", itemDetails),
					UsefulMethod.getItemByName("devicemobilitygroup", itemDetails),
					UsefulMethod.getItemByName("devicemobilitycss", itemDetails),
					UsefulMethod.getItemByName("cgpntransformationcss", itemDetails),
					UsefulMethod.getItemByName("cdpntransformationcss", itemDetails),
					UsefulMethod.getItemByName("callingpartynationaltransformationcss", itemDetails),
					UsefulMethod.getItemByName("callingpartyinternationaltransformationcss", itemDetails),
					UsefulMethod.getItemByName("callingpartyunknowntransformationcss", itemDetails),
					UsefulMethod.getItemByName("callingpartysubscribertransformationcss", itemDetails),
					UsefulMethod.getItemByName("cntdpntransformationcss", itemDetails),
					UsefulMethod.getItemByName("redirectingpartytransformationcss", itemDetails),
					UsefulMethod.getItemByName("callingpartytransformationcss", itemDetails),
					localRouteGroupList);
			
			myDevicePool.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myDevicePool;
			}
		else if(type.equals(itemType.conferencebridge))
			{
			ConferenceBridge myCFB = new ConferenceBridge(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("devicepoolname", itemDetails),
					UsefulMethod.getItemByName("locationname", itemDetails),
					UsefulMethod.getItemByName("commondeviceconfigname", itemDetails));
			
			myCFB.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myCFB;
			}
		else if(type.equals(itemType.mediaresourcegroup))
			{
			ArrayList<String> myMembers = new ArrayList<String>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))myMembers.add(s[1]);
				}
			
			MediaRessourceGroup myMRG = new MediaRessourceGroup(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("multicast", itemDetails),
					myMembers);
			
			myMRG.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myMRG;
			}
		else if(type.equals(itemType.mediaresourcegrouplist))
			{
			ArrayList<MRGLMember> myMembers = new ArrayList<MRGLMember>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))
					{
					myMembers.add(new MRGLMember(s[1]));
					}
				}
			
			MediaRessourceGroupList myMRGL = new MediaRessourceGroupList(UsefulMethod.getItemByName("name", itemDetails),
					myMembers);
			
			myMRGL.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myMRGL;
			}
		else if(type.equals(itemType.trunksip))
			{
			ArrayList<SipTrunkDestination> myDestinations = new ArrayList<SipTrunkDestination>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("destination"))
					{
					String[] tab = s[1].split(":");
					myDestinations.add(new SipTrunkDestination(tab[0], tab[1]));
					}
				}
			
			TrunkSip myTrunkSip = new TrunkSip(UsefulMethod.getItemByName("name", itemDetails),
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
			
			myTrunkSip.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myTrunkSip;
			}
		else if(type.equals(itemType.routegroup))
			{
			ArrayList<RouteGroupMember> myMembers = new ArrayList<RouteGroupMember>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("member"))
					{
					myMembers.add(new RouteGroupMember(s[1], "0"));
					}
				}
			
			RouteGroup myRG = new RouteGroup(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("distributionalgorithm", itemDetails),
					myMembers);
			
			myRG.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myRG;
			}
		else if(type.equals(itemType.vg))
			{
			String s = UsefulMethod.getItemByName("t38enable", itemDetails);
			boolean t38Enable = false;
			if(s.contains("true"))t38Enable = true;
			
			VG2XX myVG = new VG2XX(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("product", itemDetails),
					UsefulMethod.getItemByName("protocol", itemDetails),
					UsefulMethod.getItemByName("callmanagergroupname", itemDetails),
					t38Enable);
			
			myVG.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myVG;
			}
		else if(type.equals(itemType.translationpattern))
			{
			TranslationPattern myTP = new TranslationPattern(UsefulMethod.getItemByName("pattern", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("callingsearchspace", itemDetails),
					UsefulMethod.getItemByName("urgentpriority", itemDetails),
					UsefulMethod.getItemByName("usecallingpartyphonemask", itemDetails),
					UsefulMethod.getItemByName("calledpartytransformmask", itemDetails),
					UsefulMethod.getItemByName("callingpartytransformmask", itemDetails),
					UsefulMethod.getItemByName("discarddigits", itemDetails));
			
			myTP.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myTP;
			}
		else if(type.equals(itemType.partition))
			{
			Partition myP = new Partition(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails));
			
			myP.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myP;
			}
		else if(type.equals(itemType.callingsearchspace))
			{
			ArrayList<PartitionMember> myMembers = new ArrayList<PartitionMember>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("P"))
					{
					myMembers.add(new PartitionMember(s[1]));
					}
				}
			
			CallingSearchSpace myCSS = new CallingSearchSpace(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					myMembers);
			
			myCSS.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myCSS;
			}
		else if(type.equals(itemType.physicallocation))
			{
			PhysicalLocation myPL = new PhysicalLocation(UsefulMethod.getItemByName("name", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails));
			
			myPL.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myPL;
			}
		else if(type.equals(itemType.devicemobilityinfo))
			{
			ArrayList<String> myMembers = new ArrayList<String>();
			
			for(String[] s : itemDetails)
				{
				if(s[0].equals("devicepool"))
					{
					myMembers.add(s[1]);
					}
				}
			
			String subnet = UsefulMethod.getItemByName("subnet", itemDetails);
			String subnetmask = UsefulMethod.getItemByName("subnetmask", itemDetails);
			
			MobilityInfo myMI = new MobilityInfo(UsefulMethod.getItemByName("name", itemDetails),
					subnet,
					subnetmask,
					myMembers);
			
			myMI.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myMI;
			}
		else if(type.equals(itemType.callingpartytransformationpattern))
			{
			CallingPartyTransformationPattern myCPTP = new CallingPartyTransformationPattern(
					UsefulMethod.getItemByName("pattern", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("callingpartytransformationmask", itemDetails),
					UsefulMethod.getItemByName("usecallingpartyexternalphonenumbermask", itemDetails),
					UsefulMethod.getItemByName("discarddigitinstruction", itemDetails),
					UsefulMethod.getItemByName("prefixdigits", itemDetails),
					UsefulMethod.getItemByName("callinglineidpresentation", itemDetails),
					UsefulMethod.getItemByName("callingpartynumberingplan", itemDetails),
					UsefulMethod.getItemByName("callingpartynumbertype", itemDetails));
			
			myCPTP.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myCPTP;
			}
		else if(type.equals(itemType.calledpartytransformationpattern))
			{
			CalledPartyTransformationPattern myCPTP = new CalledPartyTransformationPattern(
					UsefulMethod.getItemByName("pattern", itemDetails),
					UsefulMethod.getItemByName("description", itemDetails),
					UsefulMethod.getItemByName("routepartition", itemDetails),
					UsefulMethod.getItemByName("calledpartytransformationmask", itemDetails),
					UsefulMethod.getItemByName("discarddigitinstruction", itemDetails),
					UsefulMethod.getItemByName("prefixdigits", itemDetails),
					UsefulMethod.getItemByName("calledpartynumberingplan", itemDetails),
					UsefulMethod.getItemByName("calledpartynumbertype", itemDetails));
			
			myCPTP.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myCPTP;
			}
		else if(type.equals(itemType.commondeviceconfig))
			{
			CommonDeviceConfig myCDC = new CommonDeviceConfig(UsefulMethod.getItemByName("name",itemDetails),
					UsefulMethod.getItemByName("softkeytemplatename",itemDetails),
					UsefulMethod.getItemByName("userlocale",itemDetails),
					UsefulMethod.getItemByName("networkholdmohaudiosourceid",itemDetails),
					UsefulMethod.getItemByName("userholdmohaudiosourceid",itemDetails),
					CommonDeviceConfig.AddressingMode.valueOf(UsefulMethod.getItemByName("ipaddressingmode",itemDetails)));
			
			myCDC.setAction(actionType.valueOf(UsefulMethod.getItemByName("action", itemDetails)));
			return myCDC;
			}
		//etc...
		throw new Exception("ERROR : No item type found : "+type.name());
		}
	
	/*2018*//*RATEL Alexandre 8)*/
	}

