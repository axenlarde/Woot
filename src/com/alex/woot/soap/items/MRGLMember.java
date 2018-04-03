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
	
	/***************
	 * Constructor
	 ***************/
	public MRGLMember(String name)
		{
		super();
		this.name = name;
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getRawValue(this.name, this, true);
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

