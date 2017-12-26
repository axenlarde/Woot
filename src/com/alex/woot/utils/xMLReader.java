package com.alex.woot.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/************************************
 * Class aims to convert XML file 
 * in String content
 * 
 * @author RATEL Alexandre
 */
public class xMLReader
	{
	/****************
	 * Variables
	 ****************/
	
	/**************************************************
	 * Method used to get XML file content and put it
	 * in a String
	 **************************************************/
	public static String fileRead(String fileName) throws IOException, FileNotFoundException
		{
		String template = new String("");
		String UTF_BOM = "\uFEFF";
		Variables.getLogger().info("File name = "+fileName);
		FileInputStream monFichier = new FileInputStream(fileName);
		
		BufferedReader tampon = new BufferedReader(new InputStreamReader(monFichier,"UTF-8"));
		
		//lecture du fichier
		while(true)
			{
			String ligne = tampon.readLine();
			if(ligne == null)
				{
				break;
				}
			if(ligne.startsWith(UTF_BOM))
				{
				template += ligne.substring(1);
				}
			else
				{
				template += ligne;
				}
			}
		
		//We remove the UTF8 header
		//template = template.substring(1, template.length());
		
		Variables.getLogger().info("File content : "+template);
		Variables.getLogger().info("Finished reading");
		tampon.close();
		monFichier.close();
		
		return template;
		}
	
	/*2013*//*RATEL Alexandre 8)*/
	}
