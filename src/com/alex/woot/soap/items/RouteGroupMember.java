package com.alex.woot.soap.items;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a Route Group Member
 * 
 * @author RATEL Alexandre
 **********************************/
public class RouteGroupMember extends BasicItem
	{
	/**
	 * Variables
	 */
	private String deviceName,
	port;

	/***************
	 * Constructor
	 ***************/
	public RouteGroupMember(String deviceName, String port)
		{
		super();
		this.deviceName = deviceName;
		this.port = port;
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.deviceName = CollectionTools.getRawValue(this.deviceName, this, true);
		}

	public String getDeviceName()
		{
		return deviceName;
		}

	public void setDeviceName(String deviceName)
		{
		this.deviceName = deviceName;
		}

	public String getPort()
		{
		return port;
		}

	public void setPort(String port)
		{
		this.port = port;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

