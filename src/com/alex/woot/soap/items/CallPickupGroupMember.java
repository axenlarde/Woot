package com.alex.woot.soap.items;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a Call Pickup group member
 * 
 * @author RATEL Alexandre
 **********************************/
public class CallPickupGroupMember
	{
	/**
	 * Variables
	 */
	private String number, partition;
	private int order;
	
	/***************
	 * Constructor
	 ***************/
	public CallPickupGroupMember(String number, String partition, int order)
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
	public void resolve(int index) throws Exception
		{
		number = CollectionTools.getValueFromCollectionFile(index, number);
		partition = CollectionTools.getValueFromCollectionFile(index, partition);
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
	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

