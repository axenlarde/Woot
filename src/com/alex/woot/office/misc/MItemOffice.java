package com.alex.woot.office.misc;

import com.alex.woot.soap.misc.MainItem;

/**********************************
 * Class used to gather everything about an office
 * 
 * @author RATEL Alexandre
 **********************************/
public class MItemOffice extends MainItem
	{
	/**
	 * Variables
	 */
	private String name,
	fullname;

	/***************
	 * Constructor
	 ***************/
	public MItemOffice(String name, String fullname)
		{
		super(name+" "+fullname);
		this.name = name;
		this.fullname = fullname;
		
		if(this.fullname.equals(""))this.description = name;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getFullname()
		{
		return fullname;
		}

	public void setFullname(String fullname)
		{
		this.fullname = fullname;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

