package com.alex.woot.user.misc;

import com.alex.woot.soap.misc.MainItem;

/**********************************
 * Class used to store a MainItem of type Call Pickup group
 * 
 * @author RATEL Alexandre
 **********************************/
public class MItemCPG extends MainItem
	{
	/**
	 * Variables
	 */
	private String name;

	/***************
	 * Constructor
	 ***************/
	public MItemCPG(String name)
		{
		super(name);
		this.name = name;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

