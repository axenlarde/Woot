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
	
	private int order;

	/***************
	 * Constructor
	 ***************/
	public RouteGroupMember(String deviceName, int order)
		{
		super();
		this.deviceName = deviceName;
		this.port = "0";
		this.order = order;
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

	public int getOrder()
		{
		return order;
		}

	public void setOrder(int order)
		{
		this.order = order;
		}

	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

