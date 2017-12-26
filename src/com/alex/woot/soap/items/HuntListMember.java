package com.alex.woot.soap.items;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a Hunt List member
 * 
 * @author RATEL Alexandre
 **********************************/
public class HuntListMember
	{
	/**
	 * Variables
	 */
	private String lineGroupName;
	private int order;
	
	
	
	/***************
	 * Constructor
	 ***************/
	public HuntListMember(String lineGroupName, int order)
		{
		this.lineGroupName = lineGroupName;
		this.order = order;
		}

	/**********
	 * Method used to resolve this member's value
	 * @throws Exception 
	 */
	public void resolve(int index) throws Exception
		{
		lineGroupName = CollectionTools.getValueFromCollectionFile(index, lineGroupName);
		}
	
	public String getLineGroupName()
		{
		return lineGroupName;
		}
	
	public void setLineGroupName(String lineGroupName)
		{
		this.lineGroupName = lineGroupName;
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

