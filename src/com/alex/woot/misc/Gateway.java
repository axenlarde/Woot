package com.alex.woot.misc;

import com.alex.yuza.utils.Variables.gwType;

/**********************************
 * Class used to store a gateway configuration
 * 
 * @author RATEL Alexandre
 **********************************/
public class Gateway
	{
	/**
	 * Variables
	 */
	private gwType type;
	private String product,
	ipAddress;
	
	private int macIndex;
	
	/***************
	 * Constructor
	 ***************/
	public Gateway(gwType type, String product, String ipAddress, int macIndex)
		{
		this.type = type;
		this.product = product;
		this.ipAddress = ipAddress;
		this.macIndex = macIndex;
		}
	
	/***************
	 * Constructor for audiocodes
	 ***************/
	public Gateway(gwType type, String product, String ipAddress)
		{
		this.type = type;
		this.product = product;
		this.ipAddress = ipAddress;
		this.macIndex = 0;
		}
	
	public gwType getType()
		{
		return type;
		}
	public void setType(gwType type)
		{
		this.type = type;
		}
	public String getProduct()
		{
		return product;
		}
	public void setProduct(String product)
		{
		this.product = product;
		}
	public String getIpAddress()
		{
		return ipAddress;
		}
	public void setIpAddress(String ipAddress)
		{
		this.ipAddress = ipAddress;
		}
	public int getMacIndex()
		{
		return macIndex;
		}
	public void setMacIndex(int macIndex)
		{
		this.macIndex = macIndex;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

