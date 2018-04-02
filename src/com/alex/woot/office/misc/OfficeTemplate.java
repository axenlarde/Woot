package com.alex.woot.office.misc;

import java.util.ArrayList;

import com.alex.woot.misc.ItemToInject;

/**
 * Class used to store the office template data
 * 
 * @author Alexandre
 *
 */
public class OfficeTemplate
	{
	/**
	 * Variables
	 */
	private String name;
	private ArrayList<ItemToInject> TemplateItemList;
	
	public OfficeTemplate(String name)
		{
		super();
		this.name = name;
		}
	
	public OfficeTemplate(String name, ArrayList<ItemToInject> templateItemList)
		{
		super();
		this.name = name;
		TemplateItemList = templateItemList;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public ArrayList<ItemToInject> getTemplateItemList()
		{
		return TemplateItemList;
		}

	public void setTemplateItemList(ArrayList<ItemToInject> templateItemList)
		{
		TemplateItemList = templateItemList;
		}
	
	/*2018*//*Alexandre RATEL 8)*/
	}
