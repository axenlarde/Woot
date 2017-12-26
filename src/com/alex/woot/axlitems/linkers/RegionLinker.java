package com.alex.woot.axlitems.linkers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.RelatedRegionDetail;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.Region;
import com.alex.yuza.utils.UsefulMethod;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;
import com.cisco.axl.api._8.RRegion;
import com.cisco.axl.api._8.XRegion;
import com.cisco.axl.api._8.XRegionRelationship;
import com.cisco.axl.api._8.RRegion.RelatedRegions;


/**********************************
 * Is the AXLItem design to link the item "Device Pool"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class RegionLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String defaultCodec;
	private ArrayList<RelatedRegionDetail> g711RegionList;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public RegionLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public void doInitVersion85() throws Exception
		{
		//If needed
		}
	
	public void doInitVersion105() throws Exception
		{
		//If needed
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		com.cisco.axl.api._10.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._10.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeRegion(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.NameAndGUIDRequest deleteReq = new com.cisco.axl.api._8.NameAndGUIDRequest();
		
		deleteReq.setName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeRegion(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddRegionReq req = new com.cisco.axl.api._10.AddRegionReq();
		com.cisco.axl.api._10.XRegion params = new com.cisco.axl.api._10.XRegion();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDefaultCodec(this.defaultCodec);
		
		/*
		com.cisco.axl.api._10.XRegion.RelatedRegions myRRS = new com.cisco.axl.api._10.XRegion.RelatedRegions();
		
		for(RelatedRegionDetail r : g711RegionList)
			{
			com.cisco.axl.api._10.XRegionRelationship myRR = new com.cisco.axl.api._10.XRegionRelationship();
			myRR.setRegionName(SimpleRequest.getUUIDV105(itemType.region, r.getRegionName()));
			myRR.setBandwidth(r.getBandwidth());
			myRR.setVideoBandwidth(r.getVideoBandwidth());
			
			myRRS.getRelatedRegion().add(myRR);
			}
		
		params.setRelatedRegions(myRRS);
		*/
		/************/
		
		req.setRegion(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addRegion(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddRegionReq req = new com.cisco.axl.api._8.AddRegionReq();
		com.cisco.axl.api._8.XRegion params = new com.cisco.axl.api._8.XRegion();
		
		/**
		 * We set the item parameters
		 */
		params.setName(this.getName());//Name
		params.setDefaultCodec(this.defaultCodec);
		
		/*
		com.cisco.axl.api._8.XRegion.RelatedRegions myRRS = new com.cisco.axl.api._8.XRegion.RelatedRegions();
		
		for(RelatedRegionDetail r : g711RegionList)
			{
			com.cisco.axl.api._8.XRegionRelationship myRR = new com.cisco.axl.api._8.XRegionRelationship();
			myRR.setRegionName(SimpleRequest.getUUIDV85(itemType.region, r.getRegionName()));
			myRR.setBandwidth(r.getBandwidth());
			myRR.setVideoBandwidth(r.getVideoBandwidth());
			
			myRRS.getRelatedRegion().add(myRR);
			}
		
		params.setRelatedRegions(myRRS);*/
		/************/
		
		req.setRegion(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addRegion(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		/*
		com.cisco.axl.api._10.UpdateRegionReq req = new com.cisco.axl.api._10.UpdateRegionReq();
		
		req.setName(this.name);
		
		com.cisco.axl.api._10.UpdateRegionReq.RelatedRegions myRRS = new com.cisco.axl.api._10.UpdateRegionReq.RelatedRegions();
		
		for(RelatedRegionDetail r : g711RegionList)
			{
			com.cisco.axl.api._10.XRegionRelationship myRR = new com.cisco.axl.api._10.XRegionRelationship();
			myRR.setRegionName(SimpleRequest.getUUIDV105(itemType.region, r.getRegionName()));
			myRR.setBandwidth(r.getBandwidth());
			myRR.setVideoBandwidth(r.getVideoBandwidth());
			
			myRRS.getRelatedRegion().add(myRR);
			}
		
		req.setRelatedRegions(myRRS);
		
		Variables.getAXLConnectionToCUCMV105().updateRegion(req);//We send the request to the CUCM
		*/
		
		//Here we add new lines in the RegionMatrix table using SQL query
		
		for(RelatedRegionDetail r : g711RegionList)
			{
			String regionA = SimpleRequest.getUUIDV105(itemType.region, this.name).getUuid().toLowerCase().replace("{", "").replace("}", "");
			String regionB = SimpleRequest.getUUIDV105(itemType.region, r.getRegionName()).getUuid().toLowerCase().replace("{", "").replace("}", "");
			
			try
				{
				SimpleRequest.doSQLUpdate("INSERT INTO regionmatrix (fkregion_a,fkregion_b,audiobandwidth,videobandwidth) VALUES ('"+
						regionA+"','"+
						regionB+"','"+
						UsefulMethod.findCodecBandwidth(r.getBandwidth())+"','"+
						r.getVideoBandwidth()+"')");
				}
			catch (Exception e)
				{
				if((e.getMessage().contains("duplicate")) || (e.getMessage().contains("Unique constraint")))
					{
					Variables.getLogger().debug("This regionmatrix row already exists so we do not add it again");
					}
				else
					{
					throw new Exception(e);
					}
				}
			}
		}

	public void doUpdateVersion85() throws Exception
		{
		/*
		com.cisco.axl.api._8.UpdateRegionReq req = new com.cisco.axl.api._8.UpdateRegionReq();
		
		req.setName(this.name);
		
		com.cisco.axl.api._8.UpdateRegionReq.RelatedRegions myRRS = new com.cisco.axl.api._8.UpdateRegionReq.RelatedRegions();
		
		for(RelatedRegionDetail r : g711RegionList)
			{
			com.cisco.axl.api._8.XRegionRelationship myRR = new com.cisco.axl.api._8.XRegionRelationship();
			myRR.setRegionName(SimpleRequest.getUUIDV85(itemType.region, r.getRegionName()));
			myRR.setBandwidth(r.getBandwidth());
			myRR.setVideoBandwidth(r.getVideoBandwidth());
			
			myRRS.getRelatedRegion().add(myRR);
			}
		
		req.setRelatedRegions(myRRS);
		
		Variables.getAXLConnectionToCUCM().updateRegion(req);//We send the request to the CUCM
		*/
		
		//Here we add new lines in the RegionMatrix table using SQL query
		for(RelatedRegionDetail r : g711RegionList)
			{
			String regionA = SimpleRequest.getUUIDV85(itemType.region, this.name).getUuid().toLowerCase().replace("{", "").replace("}", "");
			String regionB = SimpleRequest.getUUIDV85(itemType.region, r.getRegionName()).getUuid().toLowerCase().replace("{", "").replace("}", "");
			
			try
				{
				SimpleRequest.doSQLUpdate("INSERT INTO regionmatrix (fkregion_a,fkregion_b,tkbandwidth,videobandwidth) VALUES ('"+
						regionA+"','"+
						regionB+"','"+
						UsefulMethod.findCodecBandwidth(r.getBandwidth())+"','"+
						r.getVideoBandwidth()+"')");
				}
			catch (Exception e)
				{
				if(e.getMessage().contains("duplicate"))
					{
					Variables.getLogger().debug("This regionmatrix row already exists so we do not add it again");
					}
				else
					{
					throw new Exception(e);
					}
				}
			}
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetRegionReq req = new com.cisco.axl.api._10.GetRegionReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetRegionRes resp = Variables.getAXLConnectionToCUCMV105().getRegion(req);//We send the request to the CUCM
		
		Region myR = new Region(this.getName());
		myR.setUUID(resp.getReturn().getRegion().getUuid());
		//Etc...
		//Has to be written
		
		return myR;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetRegionReq req = new com.cisco.axl.api._8.GetRegionReq();
		
		/**
		 * We set the item parameters
		 */
		req.setName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetRegionRes resp = Variables.getAXLConnectionToCUCM().getRegion(req);//We send the request to the CUCM
		
		Region myR = new Region(this.getName());
		myR.setUUID(resp.getReturn().getRegion().getUuid());
		//Etc...
		//Has to be written
		
		return myR;
		}
	/****************/

	
	/**
	 * Method used to get all the region of the CUCM
	 * @throws Exception 
	 * 
	 * I have to change the way I am doing here.
	 * I should instead set the default codec to G729 and put in
	 * the request only the G711 region as "related regions"
	 */
	public ArrayList<RelatedRegionDetail> getRegions() throws Exception
		{
		ArrayList<RelatedRegionDetail> myRRList = new ArrayList<RelatedRegionDetail>();
		
		List<Object> SQLResp = SimpleRequest.doSQLQuery("select name from region");
		
		for(Object o : SQLResp)
			{
			Element rowElement = (Element) o;
			NodeList list = rowElement.getChildNodes();
			RelatedRegionDetail myRR = new RelatedRegionDetail();
			
			for(int i = 0; i< list.getLength(); i++)
				{
				if(list.item(i).getNodeName().equals("name"))myRR.setRegionName(list.item(i).getTextContent());
				}
			
			myRRList.add(myRR);
			}
		
		return myRRList;
		}
	
	
	
	public String getDefaultCodec()
		{
		return defaultCodec;
		}

	public void setDefaultCodec(String defaultCodec)
		{
		this.defaultCodec = defaultCodec;
		}

	public ArrayList<RelatedRegionDetail> getG711RegionList()
		{
		return g711RegionList;
		}

	public void setG711RegionList(ArrayList<RelatedRegionDetail> g711RegionList)
		{
		this.g711RegionList = g711RegionList;
		}

	

	
	
	

	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

