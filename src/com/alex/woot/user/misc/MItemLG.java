package com.alex.woot.user.misc;

import com.alex.woot.soap.misc.MainItem;

/**********************************
 * Class Used to store a Line group
 * 
 * @author RATEL Alexandre
 **********************************/
public class MItemLG extends MainItem
	{
	/**
	 * Variables
	 */
	private String name;

	/***************
	 * Constructor
	 ***************/
	public MItemLG(String name)
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

