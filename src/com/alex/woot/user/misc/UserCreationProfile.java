package com.alex.woot.user.misc;

import java.util.ArrayList;

/**********************************
 * Class used to store a User Creation Profile
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserCreationProfile
	{
	/**
	 * Variables
	 */
	private String name;
	private ArrayList<UserTemplate> templateList;
	
	/***************
	 * Constructor
	 ***************/
	public UserCreationProfile(String name, ArrayList<UserTemplate> templateList)
		{
		super();
		this.name = name;
		this.templateList = templateList;
		}
	
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public ArrayList<UserTemplate> getTemplateList()
		{
		return templateList;
		}
	public void setTemplateList(ArrayList<UserTemplate> templateList)
		{
		this.templateList = templateList;
		} 
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

