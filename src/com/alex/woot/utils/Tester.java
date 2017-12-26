package com.alex.woot.utils;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;





public class Tester
	{
	/************
	 * Variables
	 ************/
	
	public static boolean testSuccess(String texte)
		{
		texte.replace("\n", "");
		
		if(Pattern.matches(".*<success/>.*", texte))
			{
			return true;
			}
		return false;
		}
	
	
	/*******************************************************
	 * Methode qui vérifie une adresse IP
	 *******************************************************/
	public static boolean IPValide(String IP)
		{
		boolean done = true;
		int a=0;
		try
			{
			StringTokenizer st = new StringTokenizer(IP,".");
			while(st.hasMoreTokens() && done)
				{
				String tok = st.nextToken();
				if(Pattern.matches("\\d*", tok))
					{
					int nb = Integer.parseInt(tok);
					if((nb>=0)&&(nb<=255))
						{
						done = true;
						}
					else
						{
						done = false;
						}
					}
				else
					{
					done = false;
					}
				a++;
				}
			if(done && (a == 4))
				{
				return true;
				}
			}
		catch(Exception e)
			{
			Variables.getLogger().error("Unable to check if the value is an IP address");
			e.printStackTrace();
			}
		return false;
		}
	
	/*************************************
	 * Methode qui vérfie une adresse MAC
	 *************************************/
	public static boolean macValide(String mac)
		{
		try
			{
			if(mac != null)
				{
				if((mac.compareTo("") != 0) && (mac.length() == 12) && Pattern.matches("\\p{XDigit}*", mac))
					{
					return true;
					}
				}
			}
		catch(Exception e)
			{
			Variables.getLogger().error("Error while checking if this MAC address was a correct one : "+mac);
			}
		return false;
		}
	
	/*********************************************************************
	 * Method used to check if a string length is less than 30 characters 
	 *********************************************************************/
	public static boolean lengthValide(String str, int index, String newStr)
		{
		if(str.length()>30)
			{
			if(newStr.length()>30)
				{
				//Variables.setOverSize(true);
				//Variables.getDebugError().add(new autoCorrectError(str, index, "\""+str+"\" , sera remplacée par : \""+newStr+"\"","Même avec correction la taille est ici supérieur à 30 caractères. Essayez d'y remédier",true));
				}
			else
				{
				//Variables.getDebugError().add(new autoCorrectError(str, index, "\""+str+"\" , sera remplacée par : \""+newStr+"\"","",false));	
				}
			return false;
			}
		else
			{
			return true;
			}
		}
	
	public static boolean duplicationPresent(ArrayList<String> list)
		{
		for(int i=0;i<list.size();i++)
			{
			for(int j=i+1;j<list.size();j++)
				{
				if(list.get(i).compareTo(list.get(j)) == 0)
					{
					return true;
					}
				}
			}
		return false;
		}
	
	public static ArrayList<String> listDuplication(ArrayList<String> list)
		{
		ArrayList<String> duplicateList = new ArrayList<String>();
		for(int i=0;i<list.size();i++)
			{
			for(int j=i+1;j<list.size();j++)
				{
				if(list.get(i).compareTo(list.get(j)) == 0)
					{
					duplicateList.add(list.get(i));
					}
				}
			}
		return duplicateList;
		}
	
	/*2011*//*AR 8)*/
	}
