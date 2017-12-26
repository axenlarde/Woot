package com.alex.woot.utils;

/**
 * @author "Alexandre RATEL"
 *
 * Class used to represent an auto correction error
 */
public class autoCorrectError
	{
	/**
	 * Variables
	 */
	private int errorLine;
	private String str;
	private String errorDesc;
	private String advice;
	private boolean warning;
	private String usedToCompare;
	
	/**
	 * Constructor
	 */
	public autoCorrectError(String str, int errorLine, String errorDesc, String advice, boolean warning)
		{
		this.str = str;
		this.errorLine = errorLine;
		this.errorDesc = errorDesc;
		this.advice = advice;
		this.warning = warning;
		
		usedToCompare = new String(errorLine+errorDesc);
		}

	
	
	public int getErrorLine()
		{
		return errorLine;
		}

	public void setErrorLine(int errorLine)
		{
		this.errorLine = errorLine;
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

	public String getUsedToCompare()
		{
		return usedToCompare;
		}

	public void setUsedToCompare(String usedToCompare)
		{
		this.usedToCompare = usedToCompare;
		}

	public String getStr()
		{
		return str;
		}
	
	public void setStr(String str)
		{
		this.str = str;
		}
	
	
	
	
	/*2014*//*AR 8)*/
	}
