package com.alex.woot.user.misc;

import java.util.ArrayList;
import java.util.Scanner;

import com.alex.woot.gui.WaitingWindow;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.EmptyValueException;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.Task;
import com.alex.woot.soap.items.CallPickupGroupMember;
import com.alex.woot.soap.items.HuntListMember;
import com.alex.woot.soap.items.LineGroupMember;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.soap.items.PhoneService;
import com.alex.woot.soap.items.SpeedDial;
import com.alex.woot.soap.misc.MainItem;
import com.alex.woot.user.items.AssociateAnalogToGateway;
import com.alex.woot.user.items.CallPickupGroup;
import com.alex.woot.user.items.DeviceProfile;
import com.alex.woot.user.items.HuntList;
import com.alex.woot.user.items.HuntPilot;
import com.alex.woot.user.items.Line;
import com.alex.woot.user.items.LineGroup;
import com.alex.woot.user.items.Phone;
import com.alex.woot.user.items.UdpLogin;
import com.alex.woot.user.items.User;
import com.alex.woot.utils.LanguageManagement;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.actionType;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Class used to store static method
 * used for the site injection
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserTools
	{
	/**
	 * Method used to build the user injection list
	 * 
	 * !!!! Very important and complex algorithm !!!!
	 * !!!! Modify with care !!!!!
	 */
	public static ArrayList<MainItem> setUserList(actionType action, WaitingWindow myWW) throws Exception
		{
		ArrayList<MainItem> userList = new ArrayList<MainItem>();
		
		String lastNameTemplate = UsefulMethod.getTargetOption("userlastnametemplate");
		String firstNameTemplate = UsefulMethod.getTargetOption("userfirstnametemplate");
		String userIDTemplate = UsefulMethod.getTargetOption("useridtemplate");
		String phoneMacTemplate = UsefulMethod.getTargetOption("phonemactemplate");
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn(lastNameTemplate);
		int[] infos = CollectionTools.getMatcherInfo(lastNameTemplate);//To log where we are working
		
		
		/**
		 * First we process the phone, UDP and voicemail
		 */
		Variables.getLogger().debug("Phone, UDP and Voicemail preparation process starts");
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				String lastname = CollectionTools.getValueFromCollectionFile(i, lastNameTemplate, null, false);
				String firstname = CollectionTools.getValueFromCollectionFile(i, firstNameTemplate, null, false);
				String userid = CollectionTools.getValueFromCollectionFile(i, userIDTemplate, null, false);
				
				MItemUser myUser = new MItemUser(userid, lastname, firstname);
				
				//We update the waiting window
				myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+" : "+(i+1)+"/"+lastIndex+" : "+myUser.getDescription());
				
				boolean foundMIU = false;
				
				/**
				 * Here we check if the userID has been used already in the collection file
				 * It could simply means that this user own multiple devices
				 * If yes we do not create a new MItemUser but instead, use the existing one
				 */
				for(MainItem mi : userList)
					{
					if((!userid.equals("")) && (userid.equals(((MItemUser) mi).getUserid())))
						{
						myUser = (MItemUser) mi;
						foundMIU = true;
						Variables.getLogger().debug("Same user found : "+userid);
						break;
						}
					}
				
				Variables.getLogger().debug("Processing user : "+myUser.getDescription());
				
				/**
				 * According to the user creation profile we add to the MainItemList
				 * the item asked by the profile
				 */
				String profile = CollectionTools.getValueFromCollectionFile(i, UsefulMethod.getTargetOption("usercreationprofiletemplate"), null, true);
				UdpLoginItem uli = new UdpLoginItem();
				
				for(UserCreationProfile ucp : Variables.getUserCreationProfileList())
					{
					if(ucp.getName().equals(profile))
						{
						for(UserTemplate ut : ucp.getTemplateList())
							{
							/*****
							 * In case of deletion, we transform inject and update task into delete task
							 */
							actionType at = (action.equals(actionType.delete))?action:ut.getAction();
							
							if((at.equals(actionType.delete)) && (ut.getAction().equals(actionType.update)))
								{
								Variables.getLogger().debug("We do not add this to the user because it is an update item and this is a deletion task");
								}
							else
								{
								if(ut.getType().equals(itemType.udp))
									{
									DeviceProfile dpTemplate = (DeviceProfile)getTemplate(ut.getType(), ut.getTarget());
									
									ArrayList<ItemToInject> udpList = prepareUDP(i, dpTemplate, at);
									if(!((udpList == null) || (udpList.size() == 0)))
										{
										myUser.getAssociatedItems().addAll(udpList);
										Variables.getLogger().debug("UDP prepared for the user : "+myUser.getDescription());
										}
									
									if(uli.getDeviceProfile() == null)
										{
										uli.setIndex(i);
										uli.setDeviceProfile(dpTemplate.getName());//Here we get the UDP name, it will be used to connect the UDP later
										uli.setDeviceName("SEP"+CollectionTools.getValueFromCollectionFile(i, phoneMacTemplate, null, true));//Here we get the device name, it will be used to connect the UDP later
										}
									}
								else if(ut.getType().equals(itemType.phone))
									{
									ArrayList<ItemToInject> phoneList = preparePhone(i, (Phone)getTemplate(ut.getType(), ut.getTarget()), at);
									if(!((phoneList == null) || (phoneList.size() == 0)))
										{
										myUser.getAssociatedItems().addAll(phoneList);
										Variables.getLogger().debug("Phone prepared for the user : "+myUser.getDescription());
										}
									}
								else if(ut.getType().equals(itemType.analog))
									{
									ArrayList<ItemToInject> analogList = prepareAnalog(i, (Phone)getTemplate(itemType.phone, ut.getTarget()), at);
									if(!((analogList == null) || (analogList.size() == 0)))
										{
										myUser.getAssociatedItems().addAll(analogList);
										Variables.getLogger().debug("Analog prepared for the user : "+myUser.getDescription());
										}
									}
								else if(ut.getType().equals(itemType.user))
									{
									//If the user already exist we have to use it instead of creating a new one
									if((foundMIU) && (!at.equals(actionType.update)))
										{
										for(ItemToInject item : myUser.getAssociatedItems())
											{
											if(item.getType().equals(itemType.user))
												{
												//In this case we just add the device or UDP to the user
												((User)item).getUDPList().addAll(((User)getTemplate(ut.getType(), ut.getTarget())).getUDPList());
												((User)item).getDeviceList().addAll(((User)getTemplate(ut.getType(), ut.getTarget())).getDeviceList());
												((User)item).resolveDevices(i);
												Variables.getLogger().debug("Devices added to the user : "+myUser.getDescription());
												break;
												}
											}
										}
									else
										{
										User uTemplate = (User)getTemplate(ut.getType(), ut.getTarget());
										
										ItemToInject user = prepareUser(i, uTemplate, at);
										if(user != null)
											{
											myUser.getAssociatedItems().add(user);
											Variables.getLogger().debug("User item prepared for the user : "+myUser.getDescription());
											}
										if((uli.getDeviceProfile() != null) && (uli.getUserID() == null))
											{
											uli.setUserID(uTemplate.getName());//Here we get the User name, it will be used to connect the UDP later
											}
										}
									}
								}
							}
						break;
						}
					}
				
				/***
				 * Here we gonna add a connection request if asked by the user
				 */
				if((Variables.getAllowedItemsToProcess().contains(itemType.udplogin)) && (!action.equals(actionType.delete)))
					{
					Variables.getLogger().debug("UDP login preparation process starts");
					
					if(uli.getDeviceProfile() != null)
						{
						UdpLogin myLogin = new UdpLogin(uli.getUserID(),
								uli.getDeviceName(),
								uli.getDeviceProfile());
						
						myLogin.setIndex(uli.getIndex());
						myLogin.resolve();
						myUser.getAssociatedItems().add(myLogin);
						
						Variables.getLogger().debug("UDP connection prepared : "+myLogin.getName()+":"+myLogin.getDeviceProfile()+"->"+myLogin.getDeviceName());
						}
					}
				
				/**
				 * Voicemail
				 */
				if(Variables.getAllowedItemsToProcess().contains(itemType.voicemail))
					{
					Variables.getLogger().debug("Voicemail preparation process starts");
					Variables.getLogger().debug("## Has to be written ##");
					//To be written
					}
				
				if((myUser.getAssociatedItems().size() != 0) && (!foundMIU))userList.add(myUser);
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("Line "+(infos[2]+i+1)+" an empty value exception has been raised : "+eve.getMessage());
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the user list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		Variables.getLogger().debug("Phone, UDP and Voicemail preparation process ends");
		
		/**
		 * Second we process the Call Pickup Group
		 * 
		 * We first find the name of a group and then go through the
		 * entire file to find the line to update
		 */
		if(Variables.getAllowedItemsToProcess().contains(itemType.callpickupgroup))
			{
			Variables.getLogger().debug("CPG preparation process starts");
			
			ArrayList<MItemCPG> cpgList = new ArrayList<MItemCPG>();
			
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					if(!CollectionTools.isValueFromCollectionFileEmpty(i, "file.cpgname"))
						{
						String CPGName = CollectionTools.getValueFromCollectionFile(i, "file.cpgname", null, true);
						
						//We update the waiting window
						myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+"(cpg) : "+(i+1)+"/"+lastIndex+" : "+CPGName);
						
						//We check if the group is already in the list
						Boolean present = false;
						for(MItemCPG cpg : cpgList)
							{
							if(cpg.getName().equals(CPGName))
								{
								present = true;
								}
							}
						
						if(!present)
							{
							//The group has to be added to the list
							MItemCPG myCPG = new MItemCPG(CPGName);
							
							//We first create the new CPG
							CallPickupGroup CallCPG = new CallPickupGroup(UsefulMethod.getTargetOption("cpgname"),
									CollectionTools.getAvailableCPGNumber(),
									UsefulMethod.getTargetOption("cpgdescription"),
									UsefulMethod.getTargetOption("cpgpartition"),
									UsefulMethod.getTargetOption("pickupnotification"),
									UsefulMethod.getTargetOption("pickupnotificationtimer"),
									UsefulMethod.getTargetOption("callingpartyinfo"),
									UsefulMethod.getTargetOption("calledpartyinfo"),
									new ArrayList<CallPickupGroupMember>());
							
							CallCPG.setIndex(i);
							CallCPG.setAction(action);
							CallCPG.resolve();
									
							myCPG.getAssociatedItems().add(CallCPG);
							
							//Then we look for the associated line to update
							for(int j=i; j<lastIndex; j++)
								{
								String TempCPGName = CollectionTools.getValueFromCollectionFile(j, "file.cpgname", CallCPG, false);
								if((!(TempCPGName.equals(""))) && (TempCPGName.equals(CPGName)))
									{
									Line myLine = new Line(CollectionTools.getValueFromCollectionFile(j, "file.linenumber1", null, true),
											UsefulMethod.getTargetOption("didpartition"));
									myLine.setCallPickupGroupName(UsefulMethod.getTargetOption("cpgname"));
									myLine.setAction(actionType.update);
									myLine.setIndex(j);
									myLine.resolve();
									
									myCPG.getAssociatedItems().add(myLine);
									}
								}
							Variables.getLogger().debug("New CPG added \""+CPGName+"\" and "+(myCPG.getAssociatedItems().size()-1)+" lines to update : ");
							for(int v=1; v<myCPG.getAssociatedItems().size(); v++)
								{
								Variables.getLogger().debug("- "+myCPG.getAssociatedItems().get(v).getName());
								}
							cpgList.add(myCPG);
							}
						}
					}
				catch (EmptyValueException eve)
					{
					//Nothing to do
					}
				catch (Exception e)
					{
					e.printStackTrace();
					throw new Exception("Error while filling the pickup group list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
					}
				}
			if(cpgList.size() != 0)userList.addAll(cpgList);
			
			Variables.getLogger().debug("CPG preparation process ends");
			}
			
		/**
		 * Third we process the line group
		 */
		if(Variables.getAllowedItemsToProcess().contains(itemType.linegroup))
			{
			Variables.getLogger().debug("LG preparation process starts");
			
			ArrayList<MItemLG> lgList = new ArrayList<MItemLG>();
			
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					if(!CollectionTools.isValueFromCollectionFileEmpty(i, "file.linegroupname"))
						{
						String[] tab = CollectionTools.getValueFromCollectionFile(i, "file.linegroupname", null, false).split(":");
						
						//We update the waiting window
						myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+"(lg) : "+(i+1)+"/"+lastIndex+" : "+tab[0]);
						
						/**
						 * Here we gonna get the Line group details as follow :
						 * line group name:Algorithm:Timeout:Hunt Pilot number
						 * 
						 * Allowed value as algorithm :
						 * - B : Broadcast
						 * - T : Top Down
						 * - C : Circular
						 * - L : Longest Idle Time
						 * 
						 * Timeout and HP numbers are optional
						 * 
						 * For instance : Reception:B:20:34562
						 */
						String LGName = tab[0];
						String algorithm = UsefulMethod.convertIntoLGAlgorithm(tab[1]);
						String timeout = UsefulMethod.getTargetOption("lgdefaulttimeout");
						String HPNumber = null;
						if(tab.length > 2)
							{
							Scanner sc = new Scanner(tab[2]);
							if(sc.hasNextInt())timeout = tab[2];//If the value is not an integer we use the default value instead
							
							if(tab.length > 3)
								{
								String hpn = tab[3].substring(1,tab[3].length());//If the value begin with a "+" we skip it for the test
								Scanner scc = new Scanner(hpn);
								if(scc.hasNextInt())HPNumber = tab[3];//The HPNumber must be an integer
								}
							}
						if(HPNumber == null)HPNumber = CollectionTools.getAvailableLGNumber();//If the collection file doesn't give a HPNumber, we get one in the pool
						
						//We check if the group is already in the list
						Boolean present = false;
						for(MItemLG lg : lgList)
							{
							if(lg.getName().equals(LGName))
								{
								present = true;
								}
							}
						
						if(!present)
							{
							/**
							 * First the Line Group
							 */
							//The group has to be added to the list
							MItemLG myLG = new MItemLG(LGName);
							
							//We first create the new LG
							LineGroup lineG = new LineGroup(UsefulMethod.getTargetOption("lgname"),
									algorithm,
									timeout,
									"",
									"",
									"");
							
							//Then we look for the associated lines to add to it
							int order = 0;
							for(int j=i; j<lastIndex; j++)
								{
								String[] ttab = CollectionTools.getValueFromCollectionFile(j, "file.linegroupname", lineG, false).split(":");
								String tempLGName = ttab[0];
								
								if((!(tempLGName.equals(""))) && (tempLGName.equals(LGName)))
									{
									LineGroupMember myLGM = new LineGroupMember(CollectionTools.getValueFromCollectionFile(j, "file.linenumber1",lineG, true),
											UsefulMethod.getTargetOption("didpartition"),
											order);
									myLGM.setIndex(j);
									myLGM.resolve();
									lineG.getLineList().add(myLGM);
									order ++;
									}
								}
							Variables.getLogger().debug("New LG added \""+LGName+"\", with the following options \""+algorithm+","+timeout+","+HPNumber+"\" containing "+(lineG.getLineList().size())+" lines to update : ");
							for(LineGroupMember lgm : lineG.getLineList())
								{
								Variables.getLogger().debug("- "+lgm.getNumber()+" "+lgm.getPartition());
								}
							
							lineG.setIndex(i);
							lineG.setAction(action);
							lineG.resolve();
							myLG.getAssociatedItems().add(lineG);
							
							/**
							 * Second the hunt list
							 */
							HuntListMember hlMember = new HuntListMember(lineG.getName(), 0);
							ArrayList<HuntListMember> hlMembers = new ArrayList<HuntListMember>();
							hlMembers.add(hlMember);
							
							HuntList myHL = new HuntList(UsefulMethod.getTargetOption("hlname"),
									UsefulMethod.getTargetOption("hldescription"),
									UsefulMethod.getTargetOption("hlcallmanagergroup"),
									hlMembers);
							
							myHL.setIndex(i);
							myHL.setAction(action);
							myHL.resolve();
							
							myLG.getAssociatedItems().add(myHL);
							
							/**
							 * Finally the Hunt Pilot
							 */
							HuntPilot myHP = new HuntPilot(HPNumber,
									UsefulMethod.getTargetOption("hpdescription"),
									UsefulMethod.getTargetOption("hppartition"),
									UsefulMethod.getTargetOption("hpalertingname"),
									UsefulMethod.getTargetOption("hpalertingname"),
									myHL.getName());
							
							myHP.setIndex(i);
							myHP.setAction(action);
							myHP.resolve();
							
							myLG.getAssociatedItems().add(myHP);
							
							//Finally we add the MainItem to the list
							lgList.add(myLG);
							}
						}
					}
				catch (EmptyValueException eve)
					{
					//Nothing to do
					}
				catch (Exception e)
					{
					e.printStackTrace();
					throw new Exception("Error while filling the Line Group list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
					}
				}
			if(lgList.size() != 0)userList.addAll(lgList);
			
			Variables.getLogger().debug("LG preparation process ends");
			}
		
		Variables.getLogger().debug("Main item list size : "+userList.size());
		return userList;
		}
		
	/**
	 * Method used to build the user injection list using a quick task
	 * 
	 * !!!! Very important and complex algorithm !!!!
	 * !!!! Modify with care !!!!!
	 */
	public static ArrayList<MainItem> setUserList(actionType action, WaitingWindow myWW, boolean quickTask, String pattern) throws Exception
		{
		ArrayList<MainItem> userList = new ArrayList<MainItem>();
		
		String lastNameTemplate = UsefulMethod.getTargetOption("userlastnametemplate");
		String firstNameTemplate = UsefulMethod.getTargetOption("userfirstnametemplate");
		String userIDTemplate = UsefulMethod.getTargetOption("useridtemplate");
		String phoneMacTemplate = UsefulMethod.getTargetOption("phonemactemplate");
		
		int lastIndex = CollectionTools.getTheLastIndexOfAColumn(lastNameTemplate);
		int[] infos = CollectionTools.getMatcherInfo(lastNameTemplate);//To log where we are working
		
		
		/**
		 * First we process the phone, UDP and voicemail
		 */
		Variables.getLogger().debug("Phone, UDP and Voicemail preparation process starts");
		for(int i=0; i<lastIndex; i++)
			{
			try
				{
				String lastname = CollectionTools.getValueFromCollectionFile(i, lastNameTemplate, null, false);
				String firstname = CollectionTools.getValueFromCollectionFile(i, firstNameTemplate, null, false);
				String userid = CollectionTools.getValueFromCollectionFile(i, userIDTemplate, null, false);
				
				MItemUser myUser = new MItemUser(userid, lastname, firstname);
				
				//We update the waiting window
				myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+" : "+(i+1)+"/"+lastIndex+" : "+myUser.getDescription());
				
				boolean foundMIU = false;
				
				/**
				 * Here we check if the userID has been used already in the collection file
				 * It could simply means that this user own multiple devices
				 * If yes we do not create a new MItemUser but instead, use the existing one
				 */
				for(MainItem mi : userList)
					{
					if((!userid.equals("")) && (userid.equals(((MItemUser) mi).getUserid())))
						{
						myUser = (MItemUser) mi;
						foundMIU = true;
						Variables.getLogger().debug("Same user found : "+userid);
						break;
						}
					}
				
				Variables.getLogger().debug("Processing user : "+myUser.getDescription());
				
				/**
				 * Here we do not use a user creation profile, instead we use the quick pattern
				 * provided by the user in the interface
				 */
				UdpLoginItem uli = new UdpLoginItem();
				
				for(ItemToInject item : Variables.getUserTemplateList())
					{
					if(item.getType().equals(itemType.udp))
						{
						DeviceProfile dpTemplate = (DeviceProfile)item;
						
						ArrayList<ItemToInject> udpList = prepareUDP(i, dpTemplate, action);
						if(!((udpList == null) || (udpList.size() == 0)))
							{
							myUser.getAssociatedItems().addAll(udpList);
							Variables.getLogger().debug("UDP prepared for the user : "+myUser.getDescription());
							}
						
						if(uli.getDeviceProfile() == null)
							{
							uli.setIndex(i);
							uli.setDeviceProfile(dpTemplate.getName());//Here we get the UDP name, it will be used to connect the UDP later
							uli.setDeviceName("SEP"+CollectionTools.getValueFromCollectionFile(i, phoneMacTemplate, null, true));//Here we get the device name, it will be used to connect the UDP later
							}
						}
					else if(item.getType().equals(itemType.phone))
						{
						ArrayList<ItemToInject> phoneList = preparePhone(i, (Phone)item, action);
						if(!((phoneList == null) || (phoneList.size() == 0)))
							{
							myUser.getAssociatedItems().addAll(phoneList);
							Variables.getLogger().debug("Phone prepared for the user : "+myUser.getDescription());
							}
						}
					else if(item.getType().equals(itemType.analog))
						{
						ArrayList<ItemToInject> analogList = prepareAnalog(i, (Phone)item, action);
						if(!((analogList == null) || (analogList.size() == 0)))
							{
							myUser.getAssociatedItems().addAll(analogList);
							Variables.getLogger().debug("Analog prepared for the user : "+myUser.getDescription());
							}
						}
					else if(item.getType().equals(itemType.user))
						{
						//If the user already exist we have to use it instead of creating a new one
						if((foundMIU) && (!action.equals(actionType.update)))
							{
							for(ItemToInject itm : myUser.getAssociatedItems())
								{
								if(itm.getType().equals(itemType.user))
									{
									//In this case we just add the device or UDP to the user
									((User)itm).getUDPList().addAll(((User)item).getUDPList());
									((User)itm).getDeviceList().addAll(((User)item).getDeviceList());
									((User)itm).resolveDevices(i);
									Variables.getLogger().debug("Devices added to the user : "+myUser.getDescription());
									break;
									}
								}
							}
						else
							{
							User uTemplate = (User)item;
							
							ItemToInject user = prepareUser(i, uTemplate, action);
							if(user != null)
								{
								myUser.getAssociatedItems().add(user);
								Variables.getLogger().debug("User item prepared for the user : "+myUser.getDescription());
								}
							if((uli.getDeviceProfile() != null) && (uli.getUserID() == null))
								{
								uli.setUserID(uTemplate.getName());//Here we get the User name, it will be used to connect the UDP later
								}
							}
						}
					}
				
				/***
				 * Here we gonna add a connection request if asked by the user
				 */
				if((Variables.getAllowedItemsToProcess().contains(itemType.udplogin)) && (!action.equals(actionType.delete)))
					{
					Variables.getLogger().debug("UDP login preparation process starts");
					
					if(uli.getDeviceProfile() != null)
						{
						UdpLogin myLogin = new UdpLogin(uli.getUserID(),
								uli.getDeviceName(),
								uli.getDeviceProfile());
						
						myLogin.setIndex(uli.getIndex());
						myLogin.resolve();
						myUser.getAssociatedItems().add(myLogin);
						
						Variables.getLogger().debug("UDP connection prepared : "+myLogin.getName()+":"+myLogin.getDeviceProfile()+"->"+myLogin.getDeviceName());
						}
					}
				
				/**
				 * Voicemail
				 */
				if(Variables.getAllowedItemsToProcess().contains(itemType.voicemail))
					{
					Variables.getLogger().debug("Voicemail preparation process starts");
					Variables.getLogger().debug("## Has to be written ##");
					//To be written
					}
				
				if((myUser.getAssociatedItems().size() != 0) && (!foundMIU))userList.add(myUser);
				}
			catch (EmptyValueException eve)
				{
				Variables.getLogger().debug("Line "+(infos[2]+i+1)+" an empty value exception has been raised : "+eve.getMessage());
				}
			catch (Exception e)
				{
				e.printStackTrace();
				throw new Exception("Error while filling the user list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
				}
			}
		Variables.getLogger().debug("Phone, UDP and Voicemail preparation process ends");
		
		/**
		 * Second we process the Call Pickup Group
		 * 
		 * We first find the name of a group and then go through the
		 * entire file to find the line to update
		 */
		if(Variables.getAllowedItemsToProcess().contains(itemType.callpickupgroup))
			{
			Variables.getLogger().debug("CPG preparation process starts");
			
			ArrayList<MItemCPG> cpgList = new ArrayList<MItemCPG>();
			
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					if(!CollectionTools.isValueFromCollectionFileEmpty(i, "file.cpgname"))
						{
						String CPGName = CollectionTools.getValueFromCollectionFile(i, "file.cpgname", null, true);
						
						//We update the waiting window
						myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+"(cpg) : "+(i+1)+"/"+lastIndex+" : "+CPGName);
						
						//We check if the group is already in the list
						Boolean present = false;
						for(MItemCPG cpg : cpgList)
							{
							if(cpg.getName().equals(CPGName))
								{
								present = true;
								}
							}
						
						if(!present)
							{
							//The group has to be added to the list
							MItemCPG myCPG = new MItemCPG(CPGName);
							
							//We first create the new CPG
							CallPickupGroup CallCPG = new CallPickupGroup(UsefulMethod.getTargetOption("cpgname"),
									CollectionTools.getAvailableCPGNumber(),
									UsefulMethod.getTargetOption("cpgdescription"),
									UsefulMethod.getTargetOption("cpgpartition"),
									UsefulMethod.getTargetOption("pickupnotification"),
									UsefulMethod.getTargetOption("pickupnotificationtimer"),
									UsefulMethod.getTargetOption("callingpartyinfo"),
									UsefulMethod.getTargetOption("calledpartyinfo"),
									new ArrayList<CallPickupGroupMember>());
							
							CallCPG.setIndex(i);
							CallCPG.setAction(action);
							CallCPG.resolve();
									
							myCPG.getAssociatedItems().add(CallCPG);
							
							//Then we look for the associated line to update
							for(int j=i; j<lastIndex; j++)
								{
								String TempCPGName = CollectionTools.getValueFromCollectionFile(j, "file.cpgname", CallCPG, false);
								if((!(TempCPGName.equals(""))) && (TempCPGName.equals(CPGName)))
									{
									Line myLine = new Line(CollectionTools.getValueFromCollectionFile(j, "file.linenumber1", null, true),
											UsefulMethod.getTargetOption("didpartition"));
									myLine.setCallPickupGroupName(UsefulMethod.getTargetOption("cpgname"));
									myLine.setAction(actionType.update);
									myLine.setIndex(j);
									myLine.resolve();
									
									myCPG.getAssociatedItems().add(myLine);
									}
								}
							Variables.getLogger().debug("New CPG added \""+CPGName+"\" and "+(myCPG.getAssociatedItems().size()-1)+" lines to update : ");
							for(int v=1; v<myCPG.getAssociatedItems().size(); v++)
								{
								Variables.getLogger().debug("- "+myCPG.getAssociatedItems().get(v).getName());
								}
							cpgList.add(myCPG);
							}
						}
					}
				catch (EmptyValueException eve)
					{
					//Nothing to do
					}
				catch (Exception e)
					{
					e.printStackTrace();
					throw new Exception("Error while filling the pickup group list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
					}
				}
			if(cpgList.size() != 0)userList.addAll(cpgList);
			
			Variables.getLogger().debug("CPG preparation process ends");
			}
			
		/**
		 * Third we process the line group
		 */
		if(Variables.getAllowedItemsToProcess().contains(itemType.linegroup))
			{
			Variables.getLogger().debug("LG preparation process starts");
			
			ArrayList<MItemLG> lgList = new ArrayList<MItemLG>();
			
			for(int i=0; i<lastIndex; i++)
				{
				try
					{
					if(!CollectionTools.isValueFromCollectionFileEmpty(i, "file.linegroupname"))
						{
						String[] tab = CollectionTools.getValueFromCollectionFile(i, "file.linegroupname", null, false).split(":");
						
						//We update the waiting window
						myWW.getAvancement().setText(" "+LanguageManagement.getString("itemlistbuilding")+"(lg) : "+(i+1)+"/"+lastIndex+" : "+tab[0]);
						
						/**
						 * Here we gonna get the Line group details as follow :
						 * line group name:Algorithm:Timeout:Hunt Pilot number
						 * 
						 * Allowed value as algorithm :
						 * - B : Broadcast
						 * - T : Top Down
						 * - C : Circular
						 * - L : Longest Idle Time
						 * 
						 * Timeout and HP numbers are optional
						 * 
						 * For instance : Reception:B:20:34562
						 */
						String LGName = tab[0];
						String algorithm = UsefulMethod.convertIntoLGAlgorithm(tab[1]);
						String timeout = UsefulMethod.getTargetOption("lgdefaulttimeout");
						String HPNumber = null;
						if(tab.length > 2)
							{
							Scanner sc = new Scanner(tab[2]);
							if(sc.hasNextInt())timeout = tab[2];//If the value is not an integer we use the default value instead
							
							if(tab.length > 3)
								{
								String hpn = tab[3].substring(1,tab[3].length());//If the value begin with a "+" we skip it for the test
								Scanner scc = new Scanner(hpn);
								if(scc.hasNextInt())HPNumber = tab[3];//The HPNumber must be an integer
								}
							}
						if(HPNumber == null)HPNumber = CollectionTools.getAvailableLGNumber();//If the collection file doesn't give a HPNumber, we get one in the pool
						
						//We check if the group is already in the list
						Boolean present = false;
						for(MItemLG lg : lgList)
							{
							if(lg.getName().equals(LGName))
								{
								present = true;
								}
							}
						
						if(!present)
							{
							/**
							 * First the Line Group
							 */
							//The group has to be added to the list
							MItemLG myLG = new MItemLG(LGName);
							
							//We first create the new LG
							LineGroup lineG = new LineGroup(UsefulMethod.getTargetOption("lgname"),
									algorithm,
									timeout,
									"",
									"",
									"");
							
							//Then we look for the associated lines to add to it
							int order = 0;
							for(int j=i; j<lastIndex; j++)
								{
								String[] ttab = CollectionTools.getValueFromCollectionFile(j, "file.linegroupname", lineG, false).split(":");
								String tempLGName = ttab[0];
								
								if((!(tempLGName.equals(""))) && (tempLGName.equals(LGName)))
									{
									LineGroupMember myLGM = new LineGroupMember(CollectionTools.getValueFromCollectionFile(j, "file.linenumber1",lineG, true),
											UsefulMethod.getTargetOption("didpartition"),
											order);
									myLGM.setIndex(j);
									myLGM.resolve();
									lineG.getLineList().add(myLGM);
									order ++;
									}
								}
							Variables.getLogger().debug("New LG added \""+LGName+"\", with the following options \""+algorithm+","+timeout+","+HPNumber+"\" containing "+(lineG.getLineList().size())+" lines to update : ");
							for(LineGroupMember lgm : lineG.getLineList())
								{
								Variables.getLogger().debug("- "+lgm.getNumber()+" "+lgm.getPartition());
								}
							
							lineG.setIndex(i);
							lineG.setAction(action);
							lineG.resolve();
							myLG.getAssociatedItems().add(lineG);
							
							/**
							 * Second the hunt list
							 */
							HuntListMember hlMember = new HuntListMember(lineG.getName(), 0);
							ArrayList<HuntListMember> hlMembers = new ArrayList<HuntListMember>();
							hlMembers.add(hlMember);
							
							HuntList myHL = new HuntList(UsefulMethod.getTargetOption("hlname"),
									UsefulMethod.getTargetOption("hldescription"),
									UsefulMethod.getTargetOption("hlcallmanagergroup"),
									hlMembers);
							
							myHL.setIndex(i);
							myHL.setAction(action);
							myHL.resolve();
							
							myLG.getAssociatedItems().add(myHL);
							
							/**
							 * Finally the Hunt Pilot
							 */
							HuntPilot myHP = new HuntPilot(HPNumber,
									UsefulMethod.getTargetOption("hpdescription"),
									UsefulMethod.getTargetOption("hppartition"),
									UsefulMethod.getTargetOption("hpalertingname"),
									UsefulMethod.getTargetOption("hpalertingname"),
									myHL.getName());
							
							myHP.setIndex(i);
							myHP.setAction(action);
							myHP.resolve();
							
							myLG.getAssociatedItems().add(myHP);
							
							//Finally we add the MainItem to the list
							lgList.add(myLG);
							}
						}
					}
				catch (EmptyValueException eve)
					{
					//Nothing to do
					}
				catch (Exception e)
					{
					e.printStackTrace();
					throw new Exception("Error while filling the Line Group list : Line "+(infos[2]+i+1)+" : "+e.getMessage());
					}
				}
			if(lgList.size() != 0)userList.addAll(lgList);
			
			Variables.getLogger().debug("LG preparation process ends");
			}
		
		Variables.getLogger().debug("Main item list size : "+userList.size());
		return userList;
		}
	
	/************
	 * Method used to prepare a user injection
	 */
	public static Task prepareUserProcess(ArrayList<MainItem> itemToInjectList, actionType type) throws Exception
		{
		Variables.getLogger().info("User "+type.name()+" preparation process begin");
		
		ArrayList<ItemToInject> myList = new ArrayList<ItemToInject>();
		
		for(MainItem mi : itemToInjectList)
			{
			for(ItemToInject item : mi.getAssociatedItems())
				{
				Variables.getLogger().info("Adding the "+item.getType().name()+" "+item.getName()+" to the list as an "+item.getAction().name()+" todo");
				myList.add(item);
				}
			}
		
		Variables.getLogger().info("User "+type.name()+" preparation process end");
		
		//The injection task is ready
		return new Task(myList);
		}
	
	/**
	 * Method used to create a UDP profile 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> prepareUDP(int i, DeviceProfile template, actionType action) throws Exception
		{
		if(Variables.getAllowedItemsToProcess().contains(itemType.udp))
			{
			Variables.getLogger().debug("Preparing a UDP");
			
			ArrayList<ItemToInject> list = new ArrayList<ItemToInject>();
			
			/**
			 * First we create the lines (One or more)
			 */
			ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
			
			for(int y=0; y<template.getLineList().size(); y++)
				{
				Line line = prepareLine(i, template.getLineList().get(y), action);//The line to inject
				if(line != null)
					{
					list.add(line);
					lineList.add(preparePhoneLine(i, template.getLineList().get(y), line.getName()));//The line used to be linked with the device
					}
				}
			
			/**
			 * Second we manage the services
			 */
			ArrayList<PhoneService> serviceList = new ArrayList<PhoneService>();
			
			for(PhoneService s : template.getServiceList())
				{
				PhoneService myService = prepareService(i, s);
				if(myService != null)serviceList.add(myService);
				}
			
			/**
			 * Then we manage the Speed Dials
			 */
			ArrayList<SpeedDial> sdList = new ArrayList<SpeedDial>();
			
			for(SpeedDial sd : template.getSdList())
				{
				SpeedDial mySD = prepareSD(i, sd);
				if(mySD != null)sdList.add(mySD);
				}
			
			
			/***************
			 * Finally we have to create the Device Profile
			 */
			DeviceProfile myUDP = new DeviceProfile(template.getTargetName(),
					template.getName(),
					template.getDescription(),
					template.getProductType(),
					template.getProtocol(),
					template.getPhoneButtonTemplate(),
					serviceList,
					lineList,
					sdList);
			
			myUDP.setIndex(i);
			myUDP.setAction(action);
			myUDP.resolve();
			list.add(myUDP);
			
			return list;
			}
		else
			{
			return null;
			}
		}
	
	/**
	 * Method used to create a UDP profile 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> preparePhone(int i, Phone template, actionType action) throws Exception
		{
		if(Variables.getAllowedItemsToProcess().contains(itemType.phone))
			{
			Variables.getLogger().debug("Preparing a Phone");
			
			ArrayList<ItemToInject> list = new ArrayList<ItemToInject>();
			
			/**
			 * First we create the lines (One or more)
			 */
			ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
			
			for(int y=0; y<template.getLineList().size(); y++)
				{
				Line line = prepareLine(i, template.getLineList().get(y), action);//The line to inject
				if(line != null)
					{
					list.add(line);
					lineList.add(preparePhoneLine(i, template.getLineList().get(y), line.getName()));//The line used to be linked with the device
					}
				}
			
			/**
			 * Second we manage the services
			 */
			ArrayList<PhoneService> serviceList = new ArrayList<PhoneService>();
			
			for(PhoneService s : template.getServiceList())
				{
				PhoneService myService = prepareService(i, s);
				if(myService != null)serviceList.add(myService);
				}
			
			/**
			 * Then we manage the Speed Dials
			 */
			ArrayList<SpeedDial> sdList = new ArrayList<SpeedDial>();
			
			for(SpeedDial sd : template.getSdList())
				{
				SpeedDial mySD = prepareSD(i, sd);
				if(mySD != null)sdList.add(mySD);
				}
			
			/***************
			 * Last we have to create the Phone
			 */
			Phone myPhone = new Phone(template.getTargetName(),
					template.getName(),
					template.getDescription(),
					template.getProductType(),
					template.getProtocol(),
					template.getPhoneButtonTemplate(),
					template.getPhoneCss(),
					template.getDevicePool(),
					template.getLocation(),
					template.getCommonDeviceConfigName(),
					template.getAarNeighborhoodName(),
					template.getAutomatedAlternateRoutingCssName(),
					template.getSubscribeCallingSearchSpaceName(),
					template.getRerouteCallingSearchSpaceName(),
					serviceList,
					lineList,
					template.getEnableExtensionMobility(),
					sdList,
					template.getCommonPhoneConfigName(),
					template.getSecurityProfileName(),
					template.getDeviceMobilityMode());
			
			myPhone.setIndex(i);
			myPhone.setAction(action);//It is important to set the action before resolving
			myPhone.resolve();
			list.add(myPhone);
			
			return list;
			}
		else
			{
			return null;
			}
		}
	
	/**
	 * Method used to create a UDP profile 
	 * @throws Exception 
	 */
	public static ArrayList<ItemToInject> prepareAnalog(int i, Phone template, actionType action) throws Exception
		{
		if(Variables.getAllowedItemsToProcess().contains(itemType.analog))
			{
			Variables.getLogger().debug("Preparing an Analog Device");
			
			ArrayList<ItemToInject> list = new ArrayList<ItemToInject>();
			
			/**
			 * First we create the lines (One or more)
			 */
			ArrayList<PhoneLine> lineList = new ArrayList<PhoneLine>();
			
			//Only one line for an analog device
			Line line = prepareLine(i, template.getLineList().get(0), action);//The line to inject
			if(line != null)
				{
				list.add(line);
				lineList.add(preparePhoneLine(i, template.getLineList().get(0), line.getName()));//The line used to be linked with the device
				}
			
			/***************
			 * Last we have to create the Analog Device
			 */
			Phone myPhone = new Phone(template.getTargetName(),
					template.getName(),
					template.getDescription(),
					template.getProductType(),
					template.getProtocol(),
					template.getPhoneButtonTemplate(),
					template.getPhoneCss(),
					template.getDevicePool(),
					template.getLocation(),
					template.getCommonDeviceConfigName(),
					template.getAarNeighborhoodName(),
					template.getAutomatedAlternateRoutingCssName(),
					template.getSubscribeCallingSearchSpaceName(),
					template.getRerouteCallingSearchSpaceName(),
					new ArrayList<PhoneService>(),
					lineList,
					template.getEnableExtensionMobility(),
					new ArrayList<SpeedDial>(),
					template.getCommonPhoneConfigName(),
					template.getSecurityProfileName(),
					template.getDeviceMobilityMode());
			
			/*****
			 * Here we need to get the additional parameters :
			 * - Device name : AN+Last 10 characters of the MAC address+port number (001 to 024)
			 * - Device Type : Analog Phone
			 * - gatewayName : SKIGW+ last 10 characters of the MAC address
			 * - unit : 0
			 * - subunit : 0 
			 * - indexPort :  ?
			 * - portNumber : 0 to 24
			 * 
			 * We first need to find the VG. So we start by looking for the line number in the VG tab
			 */
			//How many VG
			int vgCount = CollectionTools.getTheLastIndexOfAColumn("file.vgname");
			
			//We look for the 
			String vgMac = null;
			String portIndex = null;
			String portName = null;
			String lineNumber = template.getLineList().get(0).getLineNumber();
			lineNumber = CollectionTools.getValueFromCollectionFile(i, lineNumber, myPhone, false);
			boolean found = false;
			
			if(!lineNumber.equals(""))
				{
				int maxVGPort = Integer.parseInt(UsefulMethod.getTargetOption("maxvgport"));
				for(int j=0; j<vgCount; j++)
					{
					for(int h=0; h<maxVGPort; h++)
						{
						String portLine = CollectionTools.getValueFromCollectionFile(j, "file.vgport"+(h+1), myPhone, false);
						if(portLine.equals(lineNumber))
							{
							Variables.getLogger().debug("Analog number found line "+((CollectionTools.getMatcherInfo("file.vgname")[2])+j)+" port "+(h+1));
							vgMac = CollectionTools.getValueFromCollectionFile(j, "file.vgmac", myPhone, false);
							portIndex = Integer.toString(h);
							portName = generateAnalogPortName(vgMac, h);
							found = true;
							break;
							}
						}
					if(found)break;
					}
				}
			
			if(vgMac == null)
				{
				return null;
				}
			else
				{
				//We now resolve the device with the correct device name
				myPhone.setName(portName);
				myPhone.setIndex(i);
				myPhone.setAction(action);//It is important to set the action before resolving
				myPhone.resolve();
				list.add(myPhone);
				
				/*****
				 * Here we gonna proceed only in case of injection
				 * In case of deletion or update, just the phone should
				 * be affected
				 */
				if(action.equals(actionType.inject))
					{
					//We now add a SQL query to associate the analog phone to the gateway
					String gatewayName = new String("SKIGW"+vgMac.subSequence(2, vgMac.length()));
					
					AssociateAnalogToGateway myAsso = new AssociateAnalogToGateway(
							portName+" association to "+gatewayName,
							gatewayName,
							portName,
							"0",
							"0",
							portIndex);
					
					myAsso.setIndex(i);
					myAsso.setAction(actionType.inject);
					myAsso.resolve();
					
					list.add(myAsso);
					}
				
				/*
				 "executeSQLUpdate",
				 "insert into MGCPDeviceMember ( fkMGCP,fkDevice,pkid,Slot,Subunit,Port ) values (
				 '"+getUUIDElementExt("getGateway","domainName", "SKIGW"+monWorkbook.getSheet(2).getCell(23,gwInfoList.get(j).getIndex()).getContents().substring(2, 12)).toLowerCase().replace("{","").replace("}", "")+"',
				 '"+UID+"',
				 newid(),
				 '"+gwInfoList.get(j).getGwInfoList().get(0)[0]+"',
				 '0',
				 '"+gwInfoList.get(j).getGwInfoList().get(k)[1]+"')");
				 */
				}
			
			return list;
			}
		else
			{
			return null;
			}
		}
	
	/***********
	 * Method used to prepare a User object
	 * @throws Exception 
	 */
	public static User prepareUser(int i, User template, actionType action) throws Exception
		{
		if(Variables.getAllowedItemsToProcess().contains(itemType.user))
			{
			Variables.getLogger().debug("Preparing a User");
			
			User myUser = new User(template.getTargetName(),
					template.getName(),
					template.getDeviceList(),
					template.getUDPList(),
					template.getUserControlGroupList(),
					template.getLastname(),
					template.getFirstname(),
					template.getTelephoneNumber(),
					template.getUserLocale(),
					template.getSubscribeCallingSearchSpaceName(),
					template.getPrimaryExtension(),
					template.getRoutePartition(),
					template.getPin(),
					template.getPassword());
			
			myUser.setIndex(i);
			myUser.setAction(action);
			myUser.resolve();
			
			return myUser;
			}
		else
			{
			return null;
			}
		}
	
	/**
	 * Method used to return add a line to an itemToInject list
	 * @throws Exception 
	 */
	public static Line prepareLine(int i, PhoneLine l, actionType action) throws Exception
		{
		Variables.getLogger().debug("Preparing a Line");
		
		Line myLine = new Line(l.getLineNumber(),
				l.getDescription(),
				l.getRoutePartition(),
				l.getAlertingName(),
				l.getAsciiAlertingName(),
				l.getLineCSS(),
				l.getFwCallingSearchSpaceName(),
				l.getFwAllDestination(),
				l.getFwNoanDestination(),
				l.getFwBusyDestination(),
				l.getFwUnrDestination(),
				l.getVoiceMailProfileName(),
				l.getFwAllVoicemailEnable(),
				l.getFwNoanVoicemailEnable(),
				l.getFwBusyVoicemailEnable(),
				l.getFwUnrVoicemailEnable(),
				i);
		
		try
			{
			myLine.resolve();
			}
		catch (EmptyValueException eve)
			{
			Variables.getLogger().debug("The line row "+(i+1)+" has not been added because an important value was empty : "+eve.getMessage());
			return null;
			}
		
		myLine.setAction(action);
		return myLine;
		}
	
	public static PhoneLine preparePhoneLine(int i, PhoneLine l, String lineNumber) throws Exception
		{
		PhoneLine myLine = new PhoneLine(l.getDescription(),
				l.getLineLabel(),
				l.getAsciiLineLabel(),
				l.getLineDisplay(),
				l.getLineDisplayAscii(),
				l.getExternalPhoneNumberMask(),
				lineNumber,
				l.getRoutePartition(),
				l.getLineCSS(),
				l.getAlertingName(),
				l.getAsciiAlertingName(),
				l.getFwCallingSearchSpaceName(),
				l.getFwAllDestination(),
				l.getFwNoanDestination(),
				l.getFwBusyDestination(),
				l.getFwUnrDestination(),
				l.getVoiceMailProfileName(),
				l.getFwAllVoicemailEnable(),
				l.getFwNoanVoicemailEnable(),
				l.getFwBusyVoicemailEnable(),
				l.getFwUnrVoicemailEnable(),
				l.getLineIndex());
		
		try
			{
			myLine.setIndex(i);
			myLine.resolve();
			}
		catch (EmptyValueException eve)
			{
			Variables.getLogger().debug("The line row "+(i+1)+" has not been added because an important value was empty : "+eve.getMessage());
			return null;
			}
		
		return myLine;
		}
	
	/**
	 * Used to prepare a service
	 */
	public static PhoneService prepareService(int i, PhoneService s) throws Exception
		{
		Variables.getLogger().debug("Preparing a Phone Service");
		
		PhoneService myService = new PhoneService(s.getTemplate());
		try
			{
			myService.setIndex(i);
			myService.resolve();
			}
		catch (EmptyValueException eve)
			{
			Variables.getLogger().debug("The service row "+(i+1)+" has not been added because an important value was empty : "+eve.getMessage());
			return null;
			}
		
		return myService;	
		}
	
	/**
	 * Used to prepare a service
	 */
	public static SpeedDial prepareSD(int i, SpeedDial sd) throws Exception
		{
		Variables.getLogger().debug("Preparing a Speed Dial");
		
		SpeedDial mySD = new SpeedDial(sd.getTemplate(), sd.getPosition());
		try
			{
			mySD.setIndex(i);
			mySD.resolve();
			}
		catch (EmptyValueException eve)
			{
			Variables.getLogger().debug("The speedDial row "+(i+1)+" has not been added because an important value was empty : "+eve.getMessage());
			return null;
			}
		
		return mySD;	
		}
	
	/******
	 * Method used to retrieve the template to use from the template list
	 * @throws Exception 
	 */
	public static ItemToInject getTemplate(itemType type, String targetName) throws Exception
		{
		for(ItemToInject item : Variables.getUserTemplateList())
			{
			if(item.getType().equals(type))
				{
				if(type.equals(itemType.udp))
					{
					if(((DeviceProfile) item).getTargetName().equals(targetName))
						{
						return (DeviceProfile) item;
						}
					}
				else if(type.equals(itemType.phone))
					{
					if(((Phone) item).getTargetName().equals(targetName))
						{
						return (Phone) item;
						}
					}
				else if(type.equals(itemType.user))
					{
					if(((User) item).getTargetName().equals(targetName))
						{
						return (User) item;
						}
					}
				}
			}
		throw new Exception("ERROR : Template not found for type \""+type.name()+"\" and targetName \""+targetName+"\"");
		}
	
	/**
	 * Used to generate an analog port name
	 */
	public static String generateAnalogPortName(String mac, int portNumber)
		{
		Variables.getLogger().debug("Port name generation started for the gateway : "+mac);
		StringBuffer portName = new StringBuffer("AN");
		portName.append(mac.substring(2,mac.length()));//Only the last 10 characters
		if(portNumber<10)
			{
			portName.append("00");
			}
		else
			{
			portName.append("0");
			}
		portName.append(portNumber);
		
		Variables.getLogger().debug("Generated port name : "+portName);
		return portName.toString();
		}
	
	/*2016*//*RATEL Alexandre 8)*/
	}

