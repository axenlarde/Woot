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
		
		if(pattern.contains(":"))
			{
			String[] tab = pattern.split(":");
			this.first = tab[0];
			this.last = tab[1];
			}
		else
			{
			this.pattern = pattern;
			}
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
	
	/*2018*//*RATEL Alexandre 8)*/
	}

