package com.alex.woot.soap.items;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a Sip Trunk Destination
 * 
 * @author RATEL Alexandre
 **********************************/
public class SipTrunkDestination extends BasicItem
	{
	/**
	 * Variables
	 */
	private String addressIpv4,
	port;
	
	/***************
	 * Constructor
	 ***************/
	public SipTrunkDestination(String addressIpv4, String port)
		{
		super();
		this.addressIpv4 = addressIpv4;
		this.port = port;
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.addressIpv4 = CollectionTools.getRawValue(this.addressIpv4, this, true);
		}

	public String getAddressIpv4()
		{
		return addressIpv4;
		}

	public void setAddressIpv4(String addressIpv4)
		{
		this.addressIpv4 = addressIpv4;
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

