
package com.alex.woot.misc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.alex.woot.utils.Variables;

/****************************************************
 * Class used to access database file "database.dat"
 ****************************************************/
public class databaseAccess
	{
	/**
	 * Variables
	 */
	private static ArrayList<String[][]> customerList;
	private static ArrayList<String[][]> customerConPref;
	
	/**************************************************
	 * Method used to return the string content of the 
	 * templateCCM.xml file choose by the user
	 **************************************************/
	public static void getTemplate(JFrame maFenetre)
		{
		/**
		 * Get the Customer list contained in the database file
		 */
		//Getting database structure (String xml format)
		customerList = null;
		String fileContent = extractContentFile(Variables.getDatabasePath(),"structure.xml");
		variable.getLogger().info("FileContent : "+fileContent);
		
		//Parse XML content to extract customer list
		try
			{
			ArrayList<String> paramXML = new ArrayList<String>();
			paramXML.add("customer");
			customerList = xMLGear.getResultListTab(fileContent,paramXML);
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			System.out.println(exc.getMessage());
			JOptionPane.showMessageDialog(null,"Un problème est survenu dans la lecture d'un fichier de template XML. Il est peut être corrompu, essayer avec un autre","Error",JOptionPane.ERROR_MESSAGE);
			//System.exit(0);
			}
		
		/**
		 * Ask to the user which customer data he wants to use
		 */
		new customerSelectionWindow(maFenetre, customerList);
		
		/**
		 * Get customer connection preference 
		 */
		//Getting customer connection preference file
		fileContent = extractContentFile(variable.getDatabasePath(),"prefUser.xml");
		variable.getLogger().info("FilePath : "+customerList.get(Integer.parseInt(variable.getCustomerChoice()))[1][1]+"/prefUser.xml");
		variable.getLogger().info("FileContent : "+fileContent);
		
		//Parsing file
		try
			{
			ArrayList<String> paramXML = new ArrayList<String>();
			paramXML.add("options");
			customerConPref = xMLGear.getResultListTab(fileContent,paramXML);
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			variable.getLogger().error(exc.getMessage());
			customerConPref = null;
			}
		}
	
	public static String extractContentFile(String filePath, String fileName)
		{
		Enumeration entries;
		ZipFile zipFile;
		if(customerList != null)
			{
			fileName = customerList.get(Integer.parseInt(variable.getCustomerChoice()))[1][1]+"/"+fileName;
			}
		
		try
			{
			zipFile = new ZipFile(filePath);
			entries = zipFile.entries();
			while(entries.hasMoreElements())
				{
				ZipEntry entry = (ZipEntry)entries.nextElement();
				
				if(Pattern.matches(".*"+fileName+".*", entry.getName()))
					{
					variable.getLogger().info("Lecture du fichier \""+fileName+"\"");
					return getStringContent(zipFile.getInputStream(entry));
					}
				}
			zipFile.close();
			}
		catch(FileNotFoundException fnfexc)
			{
			fnfexc.printStackTrace();
			System.out.println(fnfexc.getMessage());
			System.out.println("Database file not found");
			}
		catch (Exception exc)
			{
			exc.printStackTrace();
			System.out.println(exc.getMessage());
			}
		return null;
		}
	
	public static String getStringContent(InputStream in)
		{
		BufferedReader myInput = new BufferedReader(new InputStreamReader(in));
		String fileContent = new String("");
		String ligne = new String("");
		
		try
			{
			while((ligne = myInput.readLine()) != null)
		    	{
		    	fileContent += ligne;
		    	}
			return fileContent;
			}
		catch(Exception exc)
			{
			exc.printStackTrace();
			System.out.println(exc.getMessage());
			return null;
			}
		}

	public static ArrayList<String[][]> getCustomerConPref()
		{
		return customerConPref;
		}
		
	}

/*2012*//*RATEL Alexandre 8)*/