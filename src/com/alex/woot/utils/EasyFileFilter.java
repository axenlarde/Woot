package com.alex.woot.utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;

/**********************************
 * Class used to set a file filter
 * 
 * @author RATEL Alexandre
 **********************************/
public class EasyFileFilter extends FileFilter
	{
	/**
	 * Variables
	 */
	private ArrayList<String> allowedExtensionList;
	
	
	/**
	 * Constructor
	 */
	public EasyFileFilter(ArrayList<String> allowedExtensionList)
		{
		this.allowedExtensionList = allowedExtensionList;
		}

	public boolean accept(File file)
		{
		for(String allowedExtension : allowedExtensionList)
			{
			if(file.getName().toLowerCase().endsWith(allowedExtension))return true;
			}
		return false;
		}


	public String getDescription()
		{
		// TODO Auto-generated method stub
		return null;
		}
	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

