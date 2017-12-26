package com.alex.woot.utils;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.JDOMParseException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;



/*************************************************************
 * Class ayant pour but d'exploiter facilement une source XML
 * tout en étant grandement réutilisable
 * 
 * Elle reçoit en argument la source (File ou String) et une
 * liste contenant les paramètres XML à rechercher
 * 
 * @author RATEL Alexandre
 *************************************************************/

public class xMLGear
	{
	/************
	 * Variables
	 ************/
	private static ArrayList<String> listResult;
	private static ArrayList<String[][]> listTabResult;
	private static ArrayList<ArrayList<String[][]>> listTabResultExt;
	private static Element root;
	
	public static ArrayList<String> getResultList(File fichierXML, ArrayList<String> listParams) throws Exception
		{
		root = null;
		listResult = null;
		listResult = new ArrayList<String>();
		
		root = parseXMLFile(fichierXML);
		exploreLayerElement(root,listParams,listParams.size());
		return listResult;
		}
	
	public static ArrayList<String> getResultList(String sourceXML, ArrayList<String> listParams) throws Exception
		{
		root = null;
		listResult = null;
		listResult = new ArrayList<String>();
		
		root = parseXMLString(sourceXML);
		exploreLayerElement(root,listParams,listParams.size());
		return listResult;
		}
	
	public static ArrayList<String[][]> getResultListTab(File fichierXML, ArrayList<String> listParams) throws Exception
		{
		root = null;
		listTabResult = null;
		listTabResult = new ArrayList<String[][]>();
		
		root = parseXMLFile(fichierXML);
		exploreLayerElementTab(root,listParams,listParams.size());
		return listTabResult;
		}
	
	public static ArrayList<String[][]> getResultListTab(String sourceXML, ArrayList<String> listParams) throws Exception
		{
		root = null;
		listTabResult = null;
		listTabResult = new ArrayList<String[][]>();
		
		root = parseXMLString(sourceXML);
		exploreLayerElementTab(root,listParams,listParams.size());
		return listTabResult;
		}
	
	public static ArrayList<ArrayList<String[][]>> getResultListTabExt(String sourceXML, ArrayList<String> listParams) throws Exception
		{
		root = null;
		listTabResultExt = null;
		listTabResultExt = new ArrayList<ArrayList<String[][]>>();
		
		root = parseXMLString(sourceXML);
		exploreLayerElementTabExt(root,listParams,0);
		return listTabResultExt;
		}
	
	private static void exploreLayerElementTabExt(Element layer, ArrayList<String> node, int index)
		{
		if(index+1<node.size())
			{
			Iterator i = layer.getChildren(node.get(index)).iterator();
			while(i.hasNext())
				{
				Element courant = (Element)i.next();
				exploreLayerElementTabExt(courant,node,++index);
				}
			}
		else
			{
			Iterator i = layer.getChildren(node.get(index)).iterator();
			
			while(i.hasNext())
				{
				Element courant = (Element)i.next();
				Iterator j = courant.getChildren().iterator();
				ArrayList<String[][]> arr = new ArrayList<String[][]>();
				
				while(j.hasNext())
					{
					Element courant2 = (Element)j.next();
					List list2 = courant2.getChildren();
					Iterator k = list2.iterator();
					int a = 0;
					String[][] tabArgs = new String[list2.size()][2];
					
					while(k.hasNext())
						{
						Element courant3 = (Element)k.next();
						tabArgs[a][0] = (courant3.getName());
						tabArgs[a][1] = (courant3.getText());
						a++;
						}
					arr.add(tabArgs);
					}
				listTabResultExt.add(arr);
				}
			}
		}
	
	
	private static void exploreLayerElementTab(Element layer, ArrayList<String> node, int index)
		{
		Iterator i = layer.getChildren(node.get(node.size()-index)).iterator();
		while(i.hasNext())
			{
			Element courant = (Element)i.next();
			if(index<2)
				{
				List PhoneList = courant.getChildren();
				Iterator j = PhoneList.iterator();
				
				int a = 0;
				//On créer un tableau de la bonne taille
				String[][] tabArgs = new String[PhoneList.size()][2];
				//On remplie le tableau
				while(j.hasNext())
					{
					Element courant2 = (Element)j.next();
					tabArgs[a][0] = (courant2.getName());
					tabArgs[a][1] = (courant2.getText());
					a++;
					}
				listTabResult.add(tabArgs);
				}
			else
				{
				exploreLayerElementTab(courant, node, --index);
				}
			}
		index++;
		}
	
	private static void exploreLayerElement(Element layer, ArrayList<String> node, int index) throws Exception
		{
		Iterator i = layer.getChildren(node.get(node.size()-index)).iterator();
		while(i.hasNext())
			{
			Element courant = (Element)i.next();
			if(index<2)
				{
				List PhoneList = courant.getChildren();
				Iterator j = PhoneList.iterator();
				
				while(j.hasNext())
					{
					Element courant2 = (Element)j.next();
					listResult.add(courant2.getText());
					}
				}
			else
				{
				exploreLayerElement(courant, node, --index);
				}
			}
		index++;
		}
	
	
	private static Element parseXMLFile(File FichierXML) throws JDOMException, IOException
		{
		SAXBuilder sxb = new SAXBuilder();
		return sxb.build(FichierXML).getRootElement();
		}
	
	private static Element parseXMLString(String sourceXML) throws JDOMException, IOException, JDOMParseException, Exception
		{
		SAXBuilder sxb = new SAXBuilder();
		return sxb.build(new InputSource(new StringReader(sourceXML))).getRootElement();
		}
	
	/*Fin Classe*//*AR :)*/
	}
