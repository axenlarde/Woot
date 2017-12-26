package com.alex.woot.user.misc;

import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * 
 * 
 * @author RATEL Alexandre
 **********************************/
public class UserError extends ErrorTemplate
	{

	/***************
	 * Constructor
	 ***************/
	public UserError(String targetName, String issueName, String errorDesc,
			itemType tagetType, itemType issueType, errorType error)
		{
		super(targetName, issueName, errorDesc, tagetType, issueType, error);
		// TODO Auto-generated constructor stub
		}

	/***************
	 * Constructor
	 ***************/
	public UserError(String targetName, String issueName, String errorDesc,
			String advice, itemType tagetType, itemType issueType,
			errorType error, boolean warning)
		{
		super(targetName, issueName, errorDesc, advice, tagetType, issueType, error,
				warning);
		// TODO Auto-generated constructor stub
		}

	/***************
	 * Constructor
	 ***************/
	public UserError(String errorDesc)
		{
		super(errorDesc);
		// TODO Auto-generated constructor stub
		}

	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

