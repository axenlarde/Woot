package com.alex.woot.misc;

import com.alex.woot.utils.Variables.SubstituteType;

/**********************************
 * Class used to contains a phone button template matcher
 * 
 * @author RATEL Alexandre
 **********************************/
public class ValueMatcher
	{
	/**
	 * Variables
	 */
	private String collectionName;
	private String convertName;
	private SubstituteType type;
	
	/***************
	 * Constructor
	 ***************/
	public ValueMatcher(String collectionName, String convertName, SubstituteType type)
		{
		this.collectionName = collectionName;
		this.convertName = convertName;
		this.type = type;
		}

	public String getCollectionName()
		{
		return collectionName;
		}

	public void setCollectionName(String collectionName)
		{
		this.collectionName = collectionName;
		}

	public String getConvertName()
		{
		return convertName;
		}

	public void setConvertName(String convertName)
		{
		this.convertName = convertName;
		}

	public SubstituteType getType()
		{
		return type;
		}

	public void setType(SubstituteType type)
		{
		this.type = type;
		}
	
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

