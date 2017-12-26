package com.alex.woot.misc;

import com.alex.woot.utils.Variables.itemType;



/**********************************
 * Class used to store a UUID
 * 
 * @author RATEL Alexandre
 **********************************/
public class storedUUID
	{
	/**
	 * Variables
	 */
	private String UUID, name, comparison;
	private itemType type;
	
	/***************
	 * Constructor
	 ***************/
	public storedUUID(String uUID, String name, itemType type)
		{
		UUID = uUID;
		this.name = name;
		this.type = type;
		this.comparison = type.name()+name;
		}

	public String getUUID()
		{
		return UUID;
		}

	public void setUUID(String uUID)
		{
		UUID = uUID;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public itemType getType()
		{
		return type;
		}

	public void setType(itemType type)
		{
		this.type = type;
		}

	public String getComparison()
		{
		return comparison;
		}

	public void setComparison(String comparison)
		{
		this.comparison = comparison;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

