package com.alex.woot.office.misc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to store static method
 * used for the site injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class SiteTools
	{
	
	/********************
	 * Method used to check if the site is already injected
	 * 
	 * To do so :
	 * We are going to check if the device pool already exists in the CUCM
	 */
	public static synchronized boolean isSiteExisting(ArrayList<ItemToInject> CCMItemToInjectList)
		{
		try
			{
			for(ItemToInject item : CCMItemToInjectList)
				{
				if(item.getType().equals(itemType.devicepool))
					{
					if(item.isExisting())
						{
						Variables.getLogger().info("The site exist");
						return true;//The site exist
						}
					else
						{
						Variables.getLogger().info("The site doesn't exist");
						}
					}
				}
			}
		catch(Exception exc)
			{
			Variables.getLogger().error(exc);
			Variables.getLogger().error("While discovering the site : "+exc.getMessage());
			JOptionPane.showMessageDialog(null,LanguageManagement.getString("errordiscovery"),LanguageManagement.getString("error"),JOptionPane.INFORMATION_MESSAGE);
			//At this point we continue even if an error occurred during the discovery
			}
		return false;
		}
	
	
	/**********
	 * Method used to build the
	 * CCMItemToInjectList
	 * @throws Exception 
	 */
	public static synchronized ArrayList<ItemToInject> builCCMList(ArrayList<ItemToInject> CCMTemplateList, Workbook myWorkbook) throws Exception
		{
		Variables.getLogger().info("Site CCM List building process begin");
		
		//We initialize the CCMItemToInjectList
		ArrayList<ItemToInject> CCMItemToInjectList = new ArrayList<ItemToInject>();
		
		//We initialize the DID ranges list
		ArrayList<DIDRange> DIDRanges = null;
		
		//We initialize the gateway list
		ArrayList<Gateway> myGatewayList = null;
		
		for(ItemToInject item : CCMTemplateList)
			{
			if(item.getType().equals(itemType.translationpattern))
				{
				if(DIDRanges == null)
					{
					DIDRanges = DIDRangeManager.getDIDRanges(true, myWorkbook);
					}
				
				//We treat here the particular case of a translation pattern depending of the DID ranges
				ArrayList<TranslationPattern> TP = addDIDTranslationPatern(DIDRanges, item, myWorkbook);
				
				if(TP != null)
					{
					for(TranslationPattern tp : TP)
						{
						tp.resolve();
						Variables.getLogger().info("Adding the "+item.getType().name()+" "+tp.getName()+" to the injection list");
						CCMItemToInjectList.add(tp);
						}
					}
				}
			else if(item.getType().equals(itemType.vg))
				{
				//We treat here the particular case of the vgs
				if(myGatewayList == null)
					{
					myGatewayList = CollectionTools.findGatewaysFromCollectionFile(myWorkbook);
					}
				
				ArrayList<VG2XX> vgs = addVGs(item, myGatewayList, myWorkbook);
				
				if(vgs != null)
					{
					for(VG2XX vg : vgs)
						{
						vg.resolve();
						Variables.getLogger().info("Adding the "+item.getType().name()+" "+vg.getName()+" to the injection list");
						CCMItemToInjectList.add(vg);
						}
					}
				}
			else
				{
				//This is a normal item
				item.resolve();
				Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the injection list");
				CCMItemToInjectList.add(item);
				}
			}
		
		Variables.getLogger().info("Site CCM List building process end");
		
		return CCMItemToInjectList;
		}
	
	
	/************
	 * Method used to prepare a site injection
	 * 
	 * We want to inject following this order :
	 * - Location
	 * - Region
	 * - SRST
	 * - Device Pool
	 * - Conference Bridge
	 * - Media Ressource Group
	 * - Media Ressource Group List
	 * - Partition
	 * - Css
	 * - Trunk
	 * - VG
	 * - Routegroup
	 * - Translation Pattern
	 * - physicallocation
	 * - devicemobilitygroup
	 * - Update Device Pool
	 */
	public static synchronized Task prepareSiteInjection(ArrayList<ItemToInject> CCMItemToInjectList) throws Exception
		{
		Variables.getLogger().info("Site preparation process begin");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		/**
		 * This is important for sorting the injection list
		 */
		for(itemType type : itemType.values())
			{
			for(ItemToInject item : CCMItemToInjectList)
				{
				if(item.getType().equals(type))
					{
					Variables.getLogger().info("Adding the "+type.name()+" "+item.getName()+" to the injection list");
					myList.add(new ToDo(actionType.inject, item));
					}
				}
			}
		
		//We add the update of the device pool
		for(ItemToInject item : CCMItemToInjectList)
			{
			if(item.getType().equals(itemType.devicepool))
				{
				myList.add(new ToDo(actionType.update, item));
				}
			}
		
		//Finally we add the update of the region matrix
		for(ItemToInject item : CCMItemToInjectList)
			{
			if(item.getType().equals(itemType.region))
				{
				myList.add(new ToDo(actionType.update, item));
				}
			}
		
		Variables.getLogger().info("Site preparation process end");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	/************
	 * Method used to prepare a site deletion
	 * 
	 * We want to delete following this reversed order :
	 * - Location
	 * - Region
	 * - SRST
	 * - Device Pool
	 * - Conference Bridge
	 * - Media Ressource Group
	 * - Media Ressource Group List
	 * - Partition
	 * - Css
	 * - Trunk
	 * - VG
	 * - Routegroup
	 * - Translation Pattern
	 * - physicallocation
	 * - devicemobilitygroup
	 */
	public static synchronized Task prepareSiteDeletion(ArrayList<ItemToInject> CCMItemToInjectList) throws Exception
		{
		Variables.getLogger().info("Site deletion process begin");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		/**
		 * This is important for sorting the deletion list
		 */
		/*location,
		region,
		srstreference,
		devicepool,
		commondeviceconfig,
		conferencebridge,
		mediaressourcegroup,
		mediaressourcegrouplist,
		partition,
		callingsearchspace,
		trunksip,
		vg,
		routegroup,
		translationpattern,
		physicallocation,
		devicemobilityinfo,
		devicemobilitygroup,*/
		
		String[] direction = new String[]{
				"translationpattern",
				"vg",
				"trunksip",
				"conferencebridge",
				"commondeviceconfig",
				"devicepool",
				"mediaressourcegrouplist",
				"mediaressourcegroup",
				"callingsearchspace",
				"partition",
				"routegroup",
				"devicemobilitygroup",
				"devicemobilityinfo",
				"physicallocation",
				"srstreference",
				"region",
				"location"};
		
		for(String s : direction)
			{
			for(ItemToInject item : CCMItemToInjectList)
				{
				if(item.getType().name().equals(s))
					{
					Variables.getLogger().info("Adding the "+s+" "+item.getName()+" to the deletion list");
					myList.add(new ToDo(actionType.delete, item));
					}
				}
			}
		
		Variables.getLogger().info("Site deletion preparation process end");
		
		//The deletion task is ready
		return new Task(myList);
		}
	
	
	/*****************
	 * Method used to process the particular case of 
	 * a translation Pattern depending of the DID range
	 */
	private static synchronized ArrayList<TranslationPattern> addDIDTranslationPatern(ArrayList<DIDRange> DIDRanges, ItemToInject item, Workbook myWorkbook)
		{
		try
			{
			//We look for a special DID range translation pattern
			TranslationPattern modelTP = (TranslationPattern) item;
			
			ArrayList<TranslationPattern> TPList = new ArrayList<TranslationPattern>();
			
			if(modelTP.getName().contains("sdarange"))
				{
				/*********************************************
				 * This is a DID special Translation Pattern
				 * 
				 * For each range we add a Translation pattern
				 */
				for(DIDRange d : DIDRanges)
					{
					/**
					 * We need to resolve the pattern
					 */
					String sPattern = modelTP.getName().replace("cnaf.sdarange", d.getFirstDID().substring(0, d.getFirstDID().length()-4)+d.getPattern());
					/*******/
					
					TPList.add(new TranslationPattern(sPattern,
							modelTP.getDescription(),
							modelTP.getRoutePartitionName(),
							modelTP.getCallingSearchSpaceName(),
							modelTP.getPatternUrgency(),
							modelTP.getUseCallingPartyPhoneMask(),
							modelTP.getCalledPartyTransformationMask(),
							modelTP.getCallingPartyTransformationMask(),
							modelTP.getDigitDiscardInstructionName(),
							myWorkbook));
					}
				return TPList;
				}
			else
				{
				/**
				 * This is a normal Translation Pattern
				 * 
				 * We return the ArrayList just filled we one Translation Pattern
				 */
				TPList.add((TranslationPattern)item);
				return TPList;
				}
			}
		catch (Exception e)
			{
			Variables.getLogger().error("Problem with the item "+item.getName()+" we skip it");
			}
		return null;
		}
	
	/**********
	 * Method used to find the list of VGs to create
	 * @throws Exception 
	 */
	private static ArrayList<VG2XX> addVGs(ItemToInject item, ArrayList<Gateway> myGatewayList, Workbook myWorkbook) throws Exception
		{
		ArrayList<VG2XX> myList = new ArrayList<VG2XX>();
		
		try
			{
			VG2XX modelVG = (VG2XX) item;
			
			for(Gateway g : myGatewayList)
				{
				if(g.getType().equals(gwType.vg))
					{
					VG2XX myVG = new VG2XX(modelVG.getName(),
							myWorkbook,
							modelVG.getDescription(),
							g.getProduct(),
							modelVG.getProtocol(),
							modelVG.getCallManagerGroupName(),
							modelVG.isT38Enable());
					
					myVG.setIndex(g.getMacIndex());
					myList.add(myVG);
					}
				}
			}
		catch (Exception e)
			{
			Variables.getLogger().error("",e);
			throw new Exception("Error while discovering the list of VGs to create : "+e);
			}
		
		return myList;
		}
	
	/**
	 * Method used to guess a did range suffix pattern
	 */
	public static String guessSuffixPattern(String firstNumber, String lastNumber)
		{
		String suffixePattern = "XXXX";
		
		
		
		return suffixePattern;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

