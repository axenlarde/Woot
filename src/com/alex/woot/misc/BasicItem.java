package com.alex.woot.misc;

import java.util.ArrayList;

/**
 * Class used to define the items used to complete the configuration of
 * an ItemToInject class
 * 
 * @author Alexandre
 *
 */
public abstract class BasicItem implements BasicItemImpl
	{
	/**
	 * Variables
	 */
	protected ArrayList<ErrorTemplate> errorList;
	protected ArrayList<Correction> correctionList;
	
	/**
	 * Contructor
	 */
	public BasicItem()
		{
		errorList = new ArrayList<ErrorTemplate>();
		correctionList = new ArrayList<Correction>();
		}

	public void addNewError(ErrorTemplate error)
		{
		//We check for duplicate
		boolean exists = false;
		for(ErrorTemplate e : errorList)
			{
			if(e.getErrorDesc().equals(error.getErrorDesc()))
				{
				exists = true;
				break;
				}
			}
		if(!exists)errorList.add(error);
		}
	
	public void addNewCorrection(Correction correction)
		{
		//We check for duplicate
		boolean exists = false;
		for(Correction c : correctionList)
			{
			if(c.getDescription().equals(correction.getDescription()))
				{
				exists = true;
				break;
				}
			}
		if(!exists)correctionList.add(correction);
		}
	
	public ArrayList<ErrorTemplate> getErrorList()
		{
		return errorList;
		}

	public void setErrorList(ArrayList<ErrorTemplate> errorList)
		{
		this.errorList = errorList;
		}

	public ArrayList<Correction> getCorrectionList()
		{
		return correctionList;
		}

	public void setCorrectionList(ArrayList<Correction> correctionList)
		{
		this.correctionList = correctionList;
		}
	
	
	}
