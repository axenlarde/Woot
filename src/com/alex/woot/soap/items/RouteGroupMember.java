package com.alex.woot.soap.items;

/**********************************
 * Class used to store a Route Group Member
 * 
 * @author RATEL Alexandre
 **********************************/
public class RouteGroupMember
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
		this.deviceName = deviceName;
		this.port = "0";
		this.order = order;
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

