package com.alex.woot.misc;

import org.apache.poi.ss.usermodel.Workbook;


/**********************************
 * Used to store an IP Phone Service
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhoneService
	{
	/**
	 * Variables
	 */
	private String template, servicename,
	surl;

	/***************
	 * Constructor
	 ***************/
	public PhoneService(String template)
		{
		super();
		this.template = template;
		}

	/******
	 * Method used to resolve the service variables
	 * 
	 * In this case, "resolve" means apply regex variables
	 * For instance : cucm.firstname becomes "alexandre"
	 * @throws Exception 
	 */
	public void resolve(int index) throws Exception
		{
		template = CollectionTools.getValueFromCollectionFile(index, template);
		
		if(template.contains(":"))
			{
			String[] tab = template.split(":");
			servicename = tab[0];
			surl = tab[1];
			}
		else
			{
			servicename = template;
			}
		}
	
	
	public String getServicename()
		{
		return servicename;
		}

	public void setServicename(String servicename)
		{
		this.servicename = servicename;
		}

	public String getSurl()
		{
		return surl;
		}

	public void setSurl(String surl)
		{
		this.surl = surl;
		}

	public String getTemplate()
		{
		return template;
		}

	public void setTemplate(String template)
		{
		this.template = template;
		}
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

