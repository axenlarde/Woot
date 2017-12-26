package com.alex.woot.sdblf.misc;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.yuza.misc.CollectionTools;
import com.alex.yuza.misc.EmptyValueException;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.Task;
import com.alex.yuza.misc.ToDo;
import com.alex.yuza.sd.SpeedDial;
import com.alex.yuza.user.DeviceProfile;
import com.alex.yuza.user.Phone;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.actionType;
import com.alex.yuza.utils.Variables.itemType;
import com.alex.yuza.utils.Variables.sdType;

/**********************************
 * Class used to store static method
 * used for the SD and BLF injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class SdTools
	{
	
	/**
	 * Method used to build the Speed Dial injection list
	 */
	public static ArrayList<ItemToInject> setSDList(Workbook myWorkbook, ArrayList<ItemToInject> UserTemplateList) throws Exception
		{
		ArrayList<ItemToInject> userItemToInjectList = new ArrayList<ItemToInject>();
		
		//To make the following easier, we prepare here the user template items
		DeviceProfile UDPTemplate = null;
		Phone phoneTemplate = null;
		
		for(ItemToInject item : UserTemplateList)
			{
			if(item.getType().equals(itemType.udp))
				{
				UDPTemplate = (DeviceProfile) item;
				}
			else if(item.getType().equals(itemType.phone))
				{
				phoneTemplate = (Phone) item;
				}
			}
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn("cucm.userid", myWorkbook);//To make the following easier
		int[] infos = CollectionTools.getMatcherInfo("cucm.userid");
		
		
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				/**
				 * If the device is Analog, a softphone, a model other than 796X or if the mac address is missing
				 * we can not inject the Speed Dial and BLF
				 */
				try
					{
					CollectionTools.getValueFromCollectionFile(i, "cucm.mac", myWorkbook);//Will throw an exception if empty
					}
				catch (EmptyValueException e)
					{
					Variables.getLogger().debug("Mac address empty line "+(infos[2]+i+1)+" so we skip it");
					continue;
					}
				
				String phone1 = CollectionTools.getValueFromCollectionFile(i, "cucm.phonetype1", myWorkbook);//To make the following easier
				
				if((CollectionTools.getValueFromCollectionFile(i, "cucm.userprofil", myWorkbook).equals("Analogique")) ||
						(phone1.contains("JABBER")) ||
						(phone1.contains("DECT")) ||
						(!phone1.contains("796")))
					{
					Variables.getLogger().debug("The user line "+(infos[2]+i+1)+" doesn't have to be processed (Analog, softphone, DECT or it is not a 796X), so we skip it");
					}
				else
					{
					Variables.getLogger().debug("Speed Dial and BLF research started for the user "+
							CollectionTools.getValueFromCollectionFile(i, "cucm.userid", myWorkbook)+
							" line "+(infos[2]+i+1));
					
					/*************
					 * First we need to create the SDList for this user 
					 */
					ArrayList<SpeedDial> mySDList = SdTools.getSpeedDialList(i, UDPTemplate.getSdList().get(0), myWorkbook);
					/**********/
					
					if(mySDList.size() != 0)
						{
						/************
						 * Second we need to add the SDList to a new Phone 
						 */
						Phone myPhone = new Phone(CollectionTools.getValueFromCollectionFile(i, phoneTemplate.getName(), myWorkbook));
						myPhone.getMyPhone().setSdList(mySDList);
						/**********/
						
						/*************
						 * Last we need to add the SDList to a new UDP
						 * 
						 * Indeed in the CNAF configuration, users always have a device and an UDP
						 */
						DeviceProfile myUDP = new DeviceProfile(CollectionTools.getValueFromCollectionFile(i, UDPTemplate.getName(), myWorkbook));
						myUDP.getMyUDP().setSdList(mySDList);
						/**********/
						
						userItemToInjectList.add(myPhone);
						userItemToInjectList.add(myUDP);
						}
					else
						{
						Variables.getLogger().debug("No speed dial or BLF to inject for the user "+
								CollectionTools.getValueFromCollectionFile(i, "cucm.userid", myWorkbook)+
								" line "+(infos[2]+i+1));
						}
					}
				}
			catch (EmptyValueException eve)
				{
				//Nothing
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the Speed Dial arraylist line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		
		Variables.getLogger().info("Speed dial and BLF preparation report : "+(userItemToInjectList.size()/2)+" users have items to inject");
		return userItemToInjectList;
		}
	
	/**********************
	 * Method used to get the speed dial list
	 * 
	 * The list will contain both speed dial and BLF
	 * 
	 * To make the difference we will use "sdType"
	 * @throws Exception 
	 */
	public static ArrayList<SpeedDial> getSpeedDialList(int index, SpeedDial sdTemplate, Workbook myWorkbook) throws Exception
		{
		ArrayList<SpeedDial> myList = new ArrayList<SpeedDial>();
		int[] infos = CollectionTools.getMatcherInfo("cucm.userid");
		
		int sdCount = 0;
		int blfCount = 0;
		int sdIndex = 1;
		
		/**
		 * BLF
		 */
		try
			{
			int[] infosFirstBLFNum = CollectionTools.getMatcherInfo("cucm.firstblfnum");
			int[] infosFirstBLFLabel = CollectionTools.getMatcherInfo("cucm.firstblflabel");
			int[] infosLastBLFNum = CollectionTools.getMatcherInfo("cucm.lastblfnum");
			
			int howManyBlf = 1 + ((infosLastBLFNum[1] - infosFirstBLFNum[1])/2);
			
			for(int i = 0; i<howManyBlf; i++)
				{
				myList.add(new SpeedDial(CollectionTools.getDirectValueFromCollectionFile(null, infosFirstBLFNum[0],
						infosFirstBLFNum[1]+(i*2),
						infosFirstBLFNum[2]+index,
						myWorkbook),
						CollectionTools.getDirectValueFromCollectionFile(sdTemplate.getLabel(), infosFirstBLFLabel[0],
								infosFirstBLFLabel[1]+(i*2),
								infosFirstBLFLabel[2]+index,
								myWorkbook),
						CollectionTools.getDirectValueFromCollectionFile(sdTemplate.getAsciiLabel(), infosFirstBLFLabel[0],
								infosFirstBLFLabel[1]+(i*2),
								infosFirstBLFLabel[2]+index,
								myWorkbook),
						sdIndex,
						true,
						CollectionTools.getValueFromCollectionFile(sdTemplate.getPartition(), myWorkbook),
						sdType.blf));
				blfCount++;
				sdIndex++;
				}
			}
		catch (EmptyValueException e)
			{
			//Just means that there is no more BLF to process
			}
		/**************/
		
		sdIndex = 1;//We reset the Speed Dial index
		
		/**
		 * Speed Dial
		 */
		try
			{
			int[] infosFirstSDNum = CollectionTools.getMatcherInfo("cucm.firstsdnum");
			int[] infosFirstSDLabel = CollectionTools.getMatcherInfo("cucm.firstsdlabel");
			int[] infosLastSDNum = CollectionTools.getMatcherInfo("cucm.lastsdnum");
			
			int howManySD = 1 + ((infosLastSDNum[1] - infosFirstSDNum[1])/2);
			
			for(int i = 0; i<howManySD; i++)
				{
				myList.add(new SpeedDial(CollectionTools.getDirectValueFromCollectionFile(null, infosFirstSDNum[0],
						infosFirstSDNum[1]+(i*2),
						infosFirstSDNum[2]+index,
						myWorkbook),
						CollectionTools.getDirectValueFromCollectionFile(sdTemplate.getLabel(), infosFirstSDLabel[0],
								infosFirstSDLabel[1]+(i*2),
								infosFirstSDLabel[2]+index,
								myWorkbook),
						CollectionTools.getDirectValueFromCollectionFile(sdTemplate.getAsciiLabel(), infosFirstSDLabel[0],
								infosFirstSDLabel[1]+(i*2),
								infosFirstSDLabel[2]+index,
								myWorkbook),
						sdIndex,
						sdType.sd));
				sdCount++;
				sdIndex++;
				}
			}
		catch (EmptyValueException e)
			{
			//Just means that there is no more Speed Dial to process
			}
		/**************/
		
		Variables.getLogger().debug(sdCount+" Speed Dial and "+blfCount+" BLF have been found for the user "+
				CollectionTools.getValueFromCollectionFile(index, "cucm.userid", myWorkbook)+
				" line "+(infos[2]+index+1));
		
		return myList;
		}
	
	
	/************
	 * Method used to prepare a Speed Dial and BLF injection
	 */
	public static synchronized Task prepareSDInjection(ArrayList<ItemToInject> sdItemToInjectList) throws Exception
		{
		Variables.getLogger().info("Speed Dial and BLF injection preparation process begins");
		
		ArrayList<ToDo> myList = new ArrayList<ToDo>();
		
		for(ItemToInject item : sdItemToInjectList)
			{
			myList.add(new ToDo(actionType.update, item));
			Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an update todo");
			}
		
		Variables.getLogger().info("Speed Dial and BLF injection preparation process ends");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

