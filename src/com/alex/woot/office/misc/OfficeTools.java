package com.alex.woot.office.misc;

import java.lang.reflect.Field;
import java.util.ArrayList;

import com.alex.woot.gui.WaitingWindow;
import com.alex.woot.misc.DidRange;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.Gateway;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.MultipleValueRequiredException;
import com.alex.woot.misc.Office;
import com.alex.woot.misc.Task;
import com.alex.woot.office.items.TranslationPattern;
import com.alex.woot.office.items.VG2XX;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.gwType;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.multipleRequestType;


/**********************************
 * Class used to store static method
 * used for the site injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class OfficeTools
	{

	
	/**********
	 * Method used to build the
	 * CCMItemToInjectList
	 * @throws Exception 
	 */
	public static synchronized MainItem setOfficeList(Office o, actionType action, WaitingWindow myWW) throws Exception
		{
		Variables.getLogger().info("Office List building process begin for : "+o.getName()+" - "+o.getFullname());
		myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+" : "+o.getFullname());
		
		MItemOffice myOffice = new MItemOffice(o.getName(), o.getFullname());
		
		//We initialize the DID ranges list
		//ArrayList<DidRange> DIDRanges = null;
		
		//We initialize the gateway list
		//ArrayList<Gateway> myGatewayList = null;
		
		//We get the office template to use
		ArrayList<ItemToInject> TemplateItemList = new ArrayList<ItemToInject>();
		TemplateItemList = TemplateOfficeReader.readOfficeTemplate(o.getTemplatename());
		
		for(int i=0; i<TemplateItemList.size(); i++)
			{
			//We update the waiting window
			myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+" : "+(i+1)+"/"+TemplateItemList.size()+" : "+o.getName()+" "+o.getFullname());
			
			ItemToInject item = TemplateItemList.get(i);
			
			if(Variables.getAllowedItemsToProcess().contains(item.getType()))
				{
				/**
				 * In case of deletion we exclude update items and transform inject actions into delete ones 
				 */
				if(action.equals(actionType.delete))
					{
					if(item.getAction().equals(actionType.update))
						{
						Variables.getLogger().debug("We do not add this because it is an update item and this is a deletion task");
						continue;
						}
					else
						{
						item.setAction(actionType.delete);
						}
					}
				try
					{
					ArrayList<ItemToInject> list = new ArrayList<ItemToInject>();
					try
						{
						item.resolve();
						list.add(item);
						Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the injection list");
						}
					catch (MultipleValueRequiredException mvre)
						{
						Variables.getLogger().debug("A multiple value request of type "+mvre.getRequestType().name()+" has been caught for the item : "+item.getType()+" - "+item.getName());
						list.addAll(manageMultipleValue(o,item, mvre.getRequestType()));
						}
					myOffice.getAssociatedItems().addAll(list);
					}
				catch (Exception e)
					{
					Variables.getLogger().error("ERROR : The following item throw an exception during the resolution process : "+item.getName()+" "+item.getType().name(), e);
					item.addNewError(new ErrorTemplate(item.getName(), "", "Failed to resolve", item.getType(), item.getType(), ErrorTemplate.errorType.other));
					}
				
				//Temp : We will manage the particular cases later
				/*
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
					}*/
				}
			}
		Variables.getLogger().info("Item List building process end for the office : "+o.getName()+" - "+o.getFullname());
		Variables.getLogger().debug(myOffice.getAssociatedItems().size()+" items associated");
		
		return myOffice;
		}
	
	
	/************
	 * Method used to prepare an office injection
	 */
	public static synchronized Task prepareOfficeProcess(ArrayList<MainItem> itemToInjectList, actionType type) throws Exception
		{
		Variables.getLogger().info("Office "+type.name()+" preparation process begin");
		
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		if(type.equals(actionType.delete))
			{
			for(MainItem mi : itemToInjectList)
				{
				for(int i=mi.getAssociatedItems().size()-1; i>=0; i--)
					{
					ItemToInject item = mi.getAssociatedItems().get(i);
					Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an "+item.getAction().name()+" todo");
					myList.add(item);
					}
				}
			}
		else //Inject or update
			{
			for(MainItem mi : itemToInjectList)
				{
				for(ItemToInject item : mi.getAssociatedItems())
					{
					Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an "+item.getAction().name()+" todo");
					myList.add(item);
					}
				}
			}
		
		Variables.getLogger().info("Office "+type.name()+" preparation process end");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	
	
	
	/*****************
	 * Method used to process the particular case of 
	 * a translation Pattern depending of the DID range
	 */
	private static synchronized ArrayList<TranslationPattern> addDIDTranslationPatern(ArrayList<DidRange> DIDRanges, ItemToInject item)
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
				for(DidRange d : DIDRanges)
					{
					/**
					 * We need to resolve the pattern
					 */
					String sPattern = modelTP.getName().replace("cnaf.sdarange", d.getFirst().substring(0, d.getFirst().length()-4)+d.getPattern());
					/*******/
					
					TPList.add(new TranslationPattern(sPattern,
							modelTP.getDescription(),
							modelTP.getRoutePartitionName(),
							modelTP.getCallingSearchSpaceName(),
							modelTP.getPatternUrgency(),
							modelTP.getUseCallingPartyPhoneMask(),
							modelTP.getCalledPartyTransformationMask(),
							modelTP.getCallingPartyTransformationMask(),
							modelTP.getDigitDiscardInstructionName()));
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
	private static ArrayList<VG2XX> addVGs(ItemToInject item, ArrayList<Gateway> myGatewayList) throws Exception
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
		
		//Has to be written
		
		return suffixePattern;
		}
	
	/**
	 * Method used to return multiple copy of the main item according to the multipleRequestType
	 * For instance : we can be asked to copy several time the same translation pattern, according to the
	 * number of DID range of an particular office
	 * @param type
	 * @return
	 * @throws Exception 
	 */
	private static ArrayList<ItemToInject> manageMultipleValue(Office o, ItemToInject item, multipleRequestType requestT) throws Exception
		{
		ArrayList<ItemToInject> list = new ArrayList<ItemToInject>();
		
		if(requestT.equals(multipleRequestType.officedidall))
			{
			if(item.getType().equals(itemType.translationpattern))
				{
				TranslationPattern templateTP = (TranslationPattern) item;
				
				//With this request we inject the item as much as the office's did ranges
				for(int i=0; i<o.getDidRanges().size(); i++)
					{
					//We make a copy of the item to inject
					TranslationPattern myTP = new TranslationPattern(templateTP.getName(),
							templateTP.getDescription(),
							templateTP.getRoutePartitionName(),
							templateTP.getCallingSearchSpaceName(),
							templateTP.getPatternUrgency(),
							templateTP.getUseCallingPartyPhoneMask(),
							templateTP.getCalledPartyTransformationMask(),
							templateTP.getCallingPartyTransformationMask(),
							templateTP.getDigitDiscardInstructionName());
					
					myTP.setAction(templateTP.getAction());
					
					//We will replace all the occurrence of office.did.all by the did value
					//First in the superclass
					for(Field f : myTP.getClass().getSuperclass().getDeclaredFields())
						{
						if(f.getType() == String.class)
							{
							f = getNewFieldValue(f, myTP, "office.did.all", "office.did."+(i+1));
							}
						}
					
					//Then in the class itself
					for(Field f : myTP.getClass().getDeclaredFields())
						{
						if(f.getType() == String.class)
							{
							f = getNewFieldValue(f, myTP, "office.did.all", "office.did."+(i+1));
							}
						}
					
					myTP.resolve();
					Variables.getLogger().info("Adding the "+myTP.getType().name()+" "+myTP.getName()+" to the injection list");
					list.add(myTP);
					}
				}
			else if(item.getType().equals(itemType.callingpartytransformationpattern))
				{
				//to be written
				}
			else if(item.getType().equals(itemType.calledpartytransformationpattern))
				{
				//to be written
				}
			else
				{
				throw new Exception("The multiple value request "+requestT.name()+" has been asked for a "+item.getType()+". This kind of item is not managed");
				}
			}
		
		return list;
		}
	
	/**
	 * Method used to apply modification to a given field
	 * @param f
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	private static Field getNewFieldValue(Field f, Object o, String lookFor, String newValue) throws IllegalArgumentException, IllegalAccessException
		{
		f.setAccessible(true);
		String content = (String) f.get(o);
		content = content.replaceAll(lookFor, newValue);
		f.set(o, content);
		
		return f;
		}
	
	/*2018*//*RATEL Alexandre 8)*/
	}

