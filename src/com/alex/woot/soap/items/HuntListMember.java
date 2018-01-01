package com.alex.woot.soap.items;


import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a Hunt List member
 * 
 * @author RATEL Alexandre
 **********************************/
public class HuntListMember extends BasicItem
	{
	/**
	 * Variables
	 */
	private String lineGroupName;
	private int order;
	private int index;
	
	
	/***************
	 * Constructor
	 ***************/
	public HuntListMember(String lineGroupName, int order)
		{
		super();
		this.lineGroupName = lineGroupName;
		this.order = order;
		}

	/**********
	 * Method used to resolve this member's value
	 * @throws Exception 
	 */
	public void resolve() throws Exception
		{
		lineGroupName = CollectionTools.getValueFromCollectionFile(index, lineGroupName, this, true);
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

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

