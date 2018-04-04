package com.alex.woot.misc;

import java.lang.reflect.Field;
import java.util.ArrayList;


/**********************************
 * Class used to store an Office
 * 
 * @author RATEL Alexandre
 **********************************/
public class Office
	{
	/********
	 * Variables
	 */
	private String name,
	templatename,
	fullname,
	audiobandwidth,
	videobandwidth,
	softkeytemplate,
	callmanagergroup,
	datetimegroup,
	mohnumber,
	internalprefix,
	e164,
	receptionnumber,
	aargroup,
	voicemailtemplate,
	voicemailprofile,
	voicenetwork,
	userlocal,
	country;
	
	//Lists
	private ArrayList<DidRange> didRanges;
	private ArrayList<OfficeSetting> settings;
	
	
	/***************
	 * Constructor
	 ***************/
	public Office(String name, String templatename, String fullname, String audiobandwidth,
			String videobandwidth, String softkeytemplate,
			String callmanagergroup, String datetimegroup, String mohnumber,
			String internalprefix, String e164, String receptionnumber,
			String aargroup, String voicemailtemplate, String voicemailprofile,
			String voicenetwork, String userlocal, String country,
			ArrayList<DidRange> didRanges, ArrayList<OfficeSetting> settings)
		{
		super();
		this.name = name;
		this.templatename = templatename;
		this.fullname = fullname;
		this.audiobandwidth = audiobandwidth;
		this.videobandwidth = videobandwidth;
		this.softkeytemplate = softkeytemplate;
		this.callmanagergroup = callmanagergroup;
		this.datetimegroup = datetimegroup;
		this.mohnumber = mohnumber;
		this.internalprefix = internalprefix;
		this.e164 = e164;
		this.receptionnumber = receptionnumber;
		this.aargroup = aargroup;
		this.voicemailtemplate = voicemailtemplate;
		this.voicemailprofile = voicemailprofile;
		this.voicenetwork = voicenetwork;
		this.userlocal = userlocal;
		this.country = country;
		this.didRanges = didRanges;
		this.settings = settings;
		}

	/******
	 * Used to return a value based on the string provided
	 * @throws Exception 
	 */
	public String getString(String s) throws Exception
		{
		String tab[] = s.split("\\.");
		
		if(tab.length == 2)
			{
			for(Field f : this.getClass().getDeclaredFields())
				{
				if(f.getName().equals(tab[1]))
					{
					return (String) f.get(this);
					}
				}
			}
		else
			{
			//Here we treat the particular case of the "settings"
			
			}
		
		throw new Exception("ERROR : No value found");
		}
	
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public String getFullname()
		{
		return fullname;
		}
	public void setFullname(String fullname)
		{
		this.fullname = fullname;
		}
	public String getAudiobandwidth()
		{
		return audiobandwidth;
		}
	public void setAudiobandwidth(String audiobandwidth)
		{
		this.audiobandwidth = audiobandwidth;
		}
	public String getVideobandwidth()
		{
		return videobandwidth;
		}
	public void setVideobandwidth(String videobandwidth)
		{
		this.videobandwidth = videobandwidth;
		}
	public String getSoftkeytemplate()
		{
		return softkeytemplate;
		}
	public void setSoftkeytemplate(String softkeytemplate)
		{
		this.softkeytemplate = softkeytemplate;
		}
	public String getCallmanagergroup()
		{
		return callmanagergroup;
		}
	public void setCallmanagergroup(String callmanagergroup)
		{
		this.callmanagergroup = callmanagergroup;
		}
	public String getDatetimegroup()
		{
		return datetimegroup;
		}
	public void setDatetimegroup(String datetimegroup)
		{
		this.datetimegroup = datetimegroup;
		}
	public String getMohnumber()
		{
		return mohnumber;
		}
	public void setMohnumber(String mohnumber)
		{
		this.mohnumber = mohnumber;
		}
	public String getInternalprefix()
		{
		return internalprefix;
		}
	public void setInternalprefix(String internalprefix)
		{
		this.internalprefix = internalprefix;
		}
	public String getE164()
		{
		return e164;
		}
	public void setE164(String e164)
		{
		this.e164 = e164;
		}
	public String getReceptionnumber()
		{
		return receptionnumber;
		}
	public void setReceptionnumber(String receptionnumber)
		{
		this.receptionnumber = receptionnumber;
		}
	public String getAargroup()
		{
		return aargroup;
		}
	public void setAargroup(String aargroup)
		{
		this.aargroup = aargroup;
		}
	public String getVoicemailtemplate()
		{
		return voicemailtemplate;
		}
	public void setVoicemailtemplate(String voicemailtemplate)
		{
		this.voicemailtemplate = voicemailtemplate;
		}
	public String getVoicenetwork()
		{
		return voicenetwork;
		}
	public void setVoicenetwork(String voicenetwork)
		{
		this.voicenetwork = voicenetwork;
		}
	public String getUserlocal()
		{
		return userlocal;
		}
	public void setUserlocal(String userlocal)
		{
		this.userlocal = userlocal;
		}
	public String getCountry()
		{
		return country;
		}
	public void setCountry(String country)
		{
		this.country = country;
		}
	public ArrayList<DidRange> getDidRanges()
		{
		return didRanges;
		}
	public void setDidRanges(ArrayList<DidRange> didRanges)
		{
		this.didRanges = didRanges;
		}
	public ArrayList<OfficeSetting> getSettings()
		{
		return settings;
		}
	public void setSettings(ArrayList<OfficeSetting> settings)
		{
		this.settings = settings;
		}
	public String getVoicemailprofile()
		{
		return voicemailprofile;
		}
	public void setVoicemailprofile(String voicemailprofile)
		{
		this.voicemailprofile = voicemailprofile;
		}
	public String getTemplatename()
		{
		return templatename;
		}
	public void setTemplatename(String templatename)
		{
		this.templatename = templatename;
		}
	
	
	
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

