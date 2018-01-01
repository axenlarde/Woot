package com.alex.woot.soap.items;

import com.alex.woot.misc.BasicItem;
import com.alex.woot.misc.CollectionTools;

/**********************************
 * Class used to store a related region
 * 
 * @author RATEL Alexandre
 **********************************/
public class RelatedRegionDetail extends BasicItem
	{
	/**
	 * Variables
	 */
	String regionName,
	videoBandwidth,
	bandwidth;

	/***************
	 * Constructor
	 ***************/
	public RelatedRegionDetail(String regionName, String videoBandwidth,
			String bandwidth)
		{
		super();
		this.regionName = regionName;
		this.videoBandwidth = videoBandwidth;
		this.bandwidth = bandwidth;
		}
	
	public RelatedRegionDetail(String regionName)
		{
		super();
		this.regionName = regionName;
		this.bandwidth = "G.729";
		this.videoBandwidth = "384";
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.regionName = CollectionTools.getValueFromCollectionFile(0, this.regionName, this, true);
		}

	public String getRegionName()
		{
		return regionName;
		}

	public void setRegionName(String regionName)
		{
		this.regionName = regionName;
		}

	public String getVideoBandwidth()
		{
		return videoBandwidth;
		}

	public void setVideoBandwidth(String videoBandwidth)
		{
		this.videoBandwidth = videoBandwidth;
		}

	public String getBandwidth()
		{
		return bandwidth;
		}

	public void setBandwidth(String bandwidth)
		{
		this.bandwidth = bandwidth;
		}
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

