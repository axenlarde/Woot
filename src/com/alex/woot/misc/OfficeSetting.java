package com.alex.woot.misc;

/**********************************
 * Used to store an Office Setting
 * 
 * @author RATEL Alexandre
 **********************************/
public class OfficeSetting
	{
	/****
	 * Variables
	 */
	private String targetname, value;
	
	/***************
	 * Constructor
	 ***************/
	public OfficeSetting(String targetname, String value)
		{
		super();
		this.targetname = targetname;
		this.value = value;
		}

	public String getTargetname()
		{
		return targetname;
		}

	public void setTargetname(String targetname)
		{
		this.targetname = targetname;
		}

	public String getValue()
		{
		return value;
		}

	public void setValue(String value)
		{
		this.value = value;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

