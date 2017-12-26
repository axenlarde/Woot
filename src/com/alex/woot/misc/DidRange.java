package com.alex.woot.misc;

/**********************************
 * Used to store a did range
 * 
 * @author RATEL Alexandre
 **********************************/
public class DidRange
	{
	/**
	 * Variables
	 */
	private String pattern, first, last;

	/***************
	 * Constructor
	 ***************/
	public DidRange(String pattern)
		{
		super();
		this.pattern = pattern;
		this.first = new String("");
		this.last = new String("");
		}
	
	/***************
	 * Constructor
	 ***************/
	public DidRange(String first, String last)
		{
		super();
		this.pattern = new String("");
		this.first = first;
		this.last = last;
		}

	public String getPattern()
		{
		return pattern;
		}

	public void setPattern(String pattern)
		{
		this.pattern = pattern;
		}

	public String getFirst()
		{
		return first;
		}

	public void setFirst(String first)
		{
		this.first = first;
		}

	public String getLast()
		{
		return last;
		}

	public void setLast(String last)
		{
		this.last = last;
		}
	
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

