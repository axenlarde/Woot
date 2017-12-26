package com.alex.woot.user.misc;

import java.util.ArrayList;

import com.alex.woot.user.items.Phone;

/**********************************
 * Class used to store a user Item
 * 
 * A user Item will be used to represent a user with
 * its associated items but it is not an item to inject
 * in the CUCM
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserData
	{
	/**
	 * Variables
	 */
	String firstName,
	lastName,
	userID,
	profil,
	department,
	language,
	lineNumber,
	externalPhoneNumberMask;
	
	int index;
	
	ArrayList<Phone> associatedPhones;

	/***************
	 * Constructor
	 ***************/
	public UserData(String firstName, String lastName, String userID,
			String profil, String department, String language,
			String lineNumber, String externalPhoneNumberMask, int index,
			ArrayList<Phone> associatedPhones)
		{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userID = userID;
		this.profil = profil;
		this.department = department;
		this.language = language;
		this.lineNumber = lineNumber;
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		this.index = index;
		this.associatedPhones = associatedPhones;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public String getUserID()
		{
		return userID;
		}

	public void setUserID(String userID)
		{
		this.userID = userID;
		}

	public String getProfil()
		{
		return profil;
		}

	public void setProfil(String profil)
		{
		this.profil = profil;
		}

	public String getDepartment()
		{
		return department;
		}

	public void setDepartment(String department)
		{
		this.department = department;
		}

	public String getLanguage()
		{
		return language;
		}

	public void setLanguage(String language)
		{
		this.language = language;
		}

	public String getLineNumber()
		{
		return lineNumber;
		}

	public void setLineNumber(String lineNumber)
		{
		this.lineNumber = lineNumber;
		}

	public String getExternalPhoneNumberMask()
		{
		return externalPhoneNumberMask;
		}

	public void setExternalPhoneNumberMask(String externalPhoneNumberMask)
		{
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	public ArrayList<Phone> getAssociatedPhones()
		{
		return associatedPhones;
		}

	public void setAssociatedPhones(ArrayList<Phone> associatedPhones)
		{
		this.associatedPhones = associatedPhones;
		}


	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

