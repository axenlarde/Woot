package com.alex.woot.soap.items;

/**********************************
 * Class used to store a related region
 * 
 * @author RATEL Alexandre
 **********************************/
public class RelatedRegionDetail
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
		this.regionName = regionName;
		this.videoBandwidth = videoBandwidth;
		this.bandwidth = bandwidth;
		}
	
	public RelatedRegionDetail()
		{
		this.bandwidth = "G.729";
		this.videoBandwidth = "384";
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

