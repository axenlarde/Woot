package com.alex.woot.user.misc;

/**********************************
 * Class used to store values needed for 
 * a UDP Login
 * 
 * @author RATEL Alexandre
 **********************************/
public class UdpLoginItem
	{
	/**
	 * Variables
	 */
	private String userID,
	deviceName,
	deviceProfile;
	
	int index;

	/***************
	 * Constructor
	 ***************/
	public UdpLoginItem()
		{
		}

	public String getUserID()
		{
		return userID;
		}

	public void setUserID(String userID)
		{
		this.userID = userID;
		}

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

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

