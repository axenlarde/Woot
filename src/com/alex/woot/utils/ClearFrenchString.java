package com.alex.woot.utils;


public class ClearFrenchString
	{
	/************
	 * Variables
	 ***********/
	
	
	
	/******************************************************
	 * Method used to replace french special characters by
	 * common ASCII equivalent characters 
	 * @throws Exception 
	 ******************************************************/
	public static String translate(String src) throws Exception
		{
		StringBuffer result = new StringBuffer();
		if(src!=null && src.length()!=0)
			{
			int a = -1;
			char c = (char)0;
			String chars= "~∞() /#&-_.,'1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTU€‹VWXYZ‡‚‰ÈËÍÎÓÔÙˆ˘˚¸‹Á«…»Àœ‘”“’ÚÒ—√„";
			String replace= "        -_., 1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUUUVWXYZaaaeeeeiioouuuUcCEEEIOOOOonNAa";
			for(int i=0; i<src.length(); i++)
				{
				c = src.charAt(i);
				if((a=chars.indexOf(c))!=-1)
					{
					result.append(replace.charAt(a));
					}
				else
					{
					throw new Exception("A character is invalid : "+src.charAt(i));
					}
				}
			
			src = result.toString();
			src = src.replaceAll("( )+", " ");//Remove double whitespace
			src = src.trim();//Remove any leading and trailing whitespace
			}
		return src;
		}
	
	
	
	/*2013*//*RATEL Alexandre 8)*/
	}
