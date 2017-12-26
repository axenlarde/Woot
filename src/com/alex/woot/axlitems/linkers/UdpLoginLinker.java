package com.alex.woot.axlitems.linkers;

import java.math.BigInteger;
import java.util.ArrayList;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "UDP Login"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class UdpLoginLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String deviceName,
	deviceProfile;//UserID is the name
	
	public enum toUpdate implements ToUpdate
		{
		userID,
		deviceName,
		deviceProfile
		}

	/***************
	 * Constructor
	 ***************/
	public UdpLoginLinker()
			throws Exception
		{
		super("");
		}

	/***************
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		/*
		try
			{
			SimpleRequest.getUUIDV105(itemType.user, this.name);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.name, "Not found during init : "+e.getMessage(), itemType.udplogin, itemType.user, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.phone, this.deviceName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.deviceName, "Not found during init : "+e.getMessage(), itemType.udplogin, itemType.phone, errorType.notFound));
			}
		
		try
			{
			SimpleRequest.getUUIDV105(itemType.udp, this.deviceProfile);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.deviceProfile, "Not found during init : "+e.getMessage(), itemType.udplogin, itemType.udp, errorType.notFound));
			}
		*/
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		Variables.getLogger().debug("There is nothing to delete in the case of a UDP login");
		}

	public void doDeleteVersion85() throws Exception
		{
		Variables.getLogger().debug("There is nothing to delete in the case of a UDP login");
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.DoDeviceLoginReq req = new com.cisco.axl.api._10.DoDeviceLoginReq();
		
		/******************************
		 * We set the item parameters
		 * 
		 */
		req.setDeviceName(SimpleRequest.getUUIDV105(itemType.phone, this.deviceName));
		req.setLoginDuration(new BigInteger("0"));
		req.setUserId(this.name);
		req.setProfileName(SimpleRequest.getUUIDV105(itemType.udp, this.deviceProfile));
	
		/**********/
			
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().doDeviceLogin(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		//To be written
		return null;
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		Variables.getLogger().debug("There is nothing to update in the case of a UDP login");
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		Variables.getLogger().debug("There is nothing to update in the case of a UDP login");
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		Variables.getLogger().debug("There is nothing to get in the case of a UDP login");
		return null;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		Variables.getLogger().debug("There is nothing to get in the case of a UDP login");
		return null;
		}
	/****************/

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

	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

