package com.alex.woot.user.misc;

import com.alex.woot.soap.misc.MainItem;

/**********************************
 * Class used to gather everything about a User
 * 
 * @author RATEL Alexandre
 **********************************/
public class MItemUser extends MainItem
	{
	/**
	 * Variables
	 */
	private String userid,
	lastname,
	firstname;

	/***************
	 * Constructor
	 ***************/
	public MItemUser(String userid, String lastname,
			String firstname)
		{
		super(lastname+" "+firstname+" - "+userid);
		this.userid = userid;
		this.lastname = lastname;
		this.firstname = firstname;
		
		if(this.userid.equals(""))this.description = lastname+" "+firstname;
		}

	public String getUserid()
		{
		return userid;
		}

	public void setUserid(String userid)
		{
		this.userid = userid;
		}

	public String getLastname()
		{
		return lastname;
		}

	public void setLastname(String lastname)
		{
		this.lastname = lastname;
		}

	public String getFirstname()
		{
		return firstname;
		}

	public void setFirstname(String firstname)
		{
		this.firstname = firstname;
		}
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

