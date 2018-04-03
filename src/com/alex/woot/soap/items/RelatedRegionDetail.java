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
	bandwidth,
	codecPreference;

	public RelatedRegionDetail(String regionName, String videoBandwidth, String bandwidth,
			String codecPreference)
		{
		super();
		this.regionName = regionName;
		this.videoBandwidth = videoBandwidth;
		this.bandwidth = bandwidth;
		this.codecPreference = codecPreference;
		}

	public RelatedRegionDetail(String regionName)
		{
		super();
		this.regionName = regionName;
		this.bandwidth = "G.729";
		this.videoBandwidth = "384";
		this.codecPreference = ";
		}
	
	@Override
	public void resolve() throws Exception
		{
		this.regionName = CollectionTools.getRawValue(this.regionName, this, true);
		this.videoBandwidth = CollectionTools.getRawValue(this.videoBandwidth, this, false);
		this.bandwidth = CollectionTools.getRawValue(this.bandwidth, this, false);
		this.codecPreference = CollectionTools.getRawValue(this.codecPreference, this, false);
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

	public String getCodecPreference()
		{
		return codecPreference;
		}

	public void setCodecPreference(String codecPreference)
		{
		this.codecPreference = codecPreference;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

