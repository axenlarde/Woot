package com.alex.woot.soap.items;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a line group member
 * 
 * @author RATEL Alexandre
 **********************************/
public class LineGroupMember extends BasicItem
	{
	/**
	 * Variables
	 */
	private String number, partition;
	private int order;
	private int index;
	
	/***************
	 * Constructor
	 ***************/
	public LineGroupMember(String number, String partition, int order)
		{
		super();
		this.number = number;
		this.partition = partition;
		this.order = order;
		}
	
	/**********
	 * Method used to resolve this member's value
	 * @throws Exception 
	 */
	public void resolve() throws Exception
		{
		number = CollectionTools.getValueFromCollectionFile(index, number, this, true);
		partition = CollectionTools.getValueFromCollectionFile(index, partition, this, true);
		}
	
	public String getNumber()
		{
		return number;
		}
	public void setNumber(String number)
		{
		this.number = number;
		}
	public String getPartition()
		{
		return partition;
		}
	public void setPartition(String partition)
		{
		this.partition = partition;
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

