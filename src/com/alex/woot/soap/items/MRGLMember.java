package com.alex.woot.soap.items;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a MRG
 * 
 * @author RATEL Alexandre
 **********************************/
public class MRGLMember extends BasicItem
	{
	/**
	 * Variables
	 */
	private String name;
	private int order;
	
	/***************
	 * Constructor
	 ***************/
	public MRGLMember(String name, int order)
		{
		super();
		this.name = name;
		this.order = order;
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getValueFromCollectionFile(0, this.name, this, true);
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
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

