package com.alex.woot.misc;

import com.alex.woot.utils.Variables.itemType;

/**
 * @author "Alexandre RATEL"
 *
 * Class used to represent an error
 */
public class ErrorTemplate
	{
	/**
	 * Variables
	 */
	public enum errorType
		{
		notFound,
		duplicate,
		tooLong,
		other
		};
	
	protected String targetName;
	protected String issueName;
	protected String errorDesc;
	protected String advice;
	protected itemType tagetType;
	protected itemType issueType;
	protected errorType error;
	protected boolean warning;
	
	/**
	 * Constructor
	 */
	public ErrorTemplate(String targetName, String issueName, String errorDesc, String advice, itemType tagetType,
			itemType issueType, errorType error, boolean warning)
		{
		super();
		this.targetName = targetName;
		this.issueName = issueName;
		this.errorDesc = errorDesc;
		this.advice = advice;
		this.tagetType = tagetType;
		this.issueType = issueType;
		this.error = error;
		this.warning = warning;
		}
	
	public ErrorTemplate(String targetName, String issueName, String errorDesc, itemType tagetType,
			itemType issueType, errorType error)
		{
		super();
		this.targetName = targetName;
		this.issueName = issueName;
		this.errorDesc = errorDesc;
		this.advice = "";
		this.tagetType = tagetType;
		this.issueType = issueType;
		this.error = error;
		this.warning = true;
		}
	
	public ErrorTemplate(String errorDesc)
		{
		super();
		this.errorDesc = errorDesc;
		this.advice = "";
		this.error = errorType.other;
		this.warning = true;
		}
	
	
	public String getErrorDesc()
		{
		return errorDesc;
		}

	public void setErrorDesc(String errorDesc)
		{
		this.errorDesc = errorDesc;
		}

	public boolean isWarning()
		{
		return warning;
		}

	public void setWarning(boolean warning)
		{
		this.warning = warning;
		}
	
	public String getAdvice()
		{
		return advice;
		}
	
	public void setAdvice(String advice)
		{
		this.advice = advice;
		}

	public itemType getTagetType()
		{
		return tagetType;
		}

	public void setTagetType(itemType tagetType)
		{
		this.tagetType = tagetType;
		}

	public itemType getIssueType()
		{
		return issueType;
		}

	public void setIssueType(itemType issueType)
		{
		this.issueType = issueType;
		}

	public errorType getError()
		{
		return error;
		}

	public void setError(errorType error)
		{
		this.error = error;
		}

	public String getTargetName()
		{
		return targetName;
		}

	public void setTargetName(String targetName)
		{
		this.targetName = targetName;
		}

	public String getIssueName()
		{
		return issueName;
		}

	public void setIssueName(String issueName)
		{
		this.issueName = issueName;
		}

	
	
	
	
	/*2016*//*AR 8)*/
	}
