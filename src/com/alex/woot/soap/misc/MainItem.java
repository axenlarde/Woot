package com.alex.woot.soap.misc;

import java.util.ArrayList;

import com.alex.woot.misc.ItemToInject;

/**********************************
 * Class used to represent an item with its associated itemToInject
 * 
 * It can be a user or a callpickupgroup or a line group, etc..
 * 
 * @author RATEL Alexandre
 **********************************/
public abstract class MainItem
	{
	/**
	 * Variables
	 */
	protected String description;
	ArrayList<ItemToInject> associatedItems;
	
	/***************
	 * Constructor
	 ***************/
	public MainItem(String description)
		{
		super();
		this.description = description;
		this.description = this.description.trim();
		
		this.associatedItems = new ArrayList<ItemToInject>();
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public ArrayList<ItemToInject> getAssociatedItems()
		{
		return associatedItems;
		}

	public void setAssociatedItems(ArrayList<ItemToInject> associatedItems)
		{
		this.associatedItems = associatedItems;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

