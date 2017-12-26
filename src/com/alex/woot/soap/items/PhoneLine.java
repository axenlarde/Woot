package com.alex.woot.soap.items;

import com.alex.woot.misc.CollectionTools;


/**********************************
 * Class used to store Phone Line parameters
 * 
 * @author RATEL Alexandre
 **********************************/
public class PhoneLine
	{
	/***
	 * Variables
	 */
	private String description,
	lineLabel,
	asciiLineLabel,
	lineDisplay,
	lineDisplayAscii,
	externalPhoneNumberMask,
	lineNumber,
	routePartition,
	lineCSS,
	alertingName,
	asciiAlertingName,
	fwCallingSearchSpaceName,
	fwAllDestination,
	fwNoanDestination,
	fwBusyDestination,
	fwUnrDestination,
	voiceMailProfileName,
	fwAllVoicemailEnable,
	fwNoanVoicemailEnable,
	fwBusyVoicemailEnable,
	fwUnrVoicemailEnable;
	
	private int lineIndex;

	/***************
	 * Constructor
	 ***************/
	public PhoneLine(String description, String lineLabel,
			String asciiLineLabel, String lineDisplay, String lineDisplayAscii,
			String externalPhoneNumberMask,
			String lineNumber, String routePartition, String lineCSS,
			String alertingName,
			String asciiAlertingName,
			String fwCallingSearchSpaceName, String fwAllDestination,
			String fwNoanDestination, String fwBusyDestination,
			String fwUnrDestination, String voiceMailProfileName,
			String fwAllVoicemailEnable, String fwNoanVoicemailEnable,
			String fwBusyVoicemailEnable, String fwUnrVoicemailEnable,
			int lineIndex)
		{
		super();
		this.description = description;
		this.lineLabel = lineLabel;
		this.asciiLineLabel = asciiLineLabel;
		this.lineDisplay = lineDisplay;
		this.lineDisplayAscii = lineDisplayAscii;
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		this.lineNumber = lineNumber;
		this.routePartition = routePartition;
		this.lineCSS = lineCSS;
		this.alertingName = alertingName;
		this.asciiAlertingName = asciiAlertingName;
		this.fwCallingSearchSpaceName = fwCallingSearchSpaceName;
		this.fwAllDestination = fwAllDestination;
		this.fwNoanDestination = fwNoanDestination;
		this.fwBusyDestination = fwBusyDestination;
		this.fwUnrDestination = fwUnrDestination;
		this.voiceMailProfileName = voiceMailProfileName;
		this.fwAllVoicemailEnable = fwAllVoicemailEnable;
		this.fwNoanVoicemailEnable = fwNoanVoicemailEnable;
		this.fwBusyVoicemailEnable = fwBusyVoicemailEnable;
		this.fwUnrVoicemailEnable = fwUnrVoicemailEnable;
		this.lineIndex = lineIndex;
		}

	/******
	 * Method used to resolve the line variables
	 * 
	 * In this case, "resolve" means apply regex variables
	 * For instance : file.firstname becomes "alexandre"
	 * @throws Exception 
	 */
	public void resolve(int index) throws Exception
		{
		lineLabel = CollectionTools.getValueFromCollectionFile(index, lineLabel, false);
		asciiLineLabel = CollectionTools.getValueFromCollectionFile(index, asciiLineLabel, false);
		lineDisplay = CollectionTools.getValueFromCollectionFile(index, lineDisplay, false);
		lineDisplayAscii = CollectionTools.getValueFromCollectionFile(index, lineDisplayAscii, false);
		externalPhoneNumberMask = CollectionTools.getValueFromCollectionFile(index, externalPhoneNumberMask, false);
		lineNumber = CollectionTools.getValueFromCollectionFile(index, lineNumber);
		routePartition = CollectionTools.getValueFromCollectionFile(index, routePartition);
		lineCSS = CollectionTools.getValueFromCollectionFile(index, lineCSS, false);
		description = CollectionTools.getValueFromCollectionFile(index, description, false);
		alertingName = CollectionTools.getValueFromCollectionFile(index, alertingName, false);
		asciiAlertingName = CollectionTools.getValueFromCollectionFile(index, asciiAlertingName, false);
		fwCallingSearchSpaceName = CollectionTools.getValueFromCollectionFile(index, fwCallingSearchSpaceName, false);
		fwAllDestination = CollectionTools.getValueFromCollectionFile(index, fwAllDestination, false);
		fwNoanDestination = CollectionTools.getValueFromCollectionFile(index, fwNoanDestination, false);
		fwBusyDestination = CollectionTools.getValueFromCollectionFile(index, fwBusyDestination, false);
		fwUnrDestination = CollectionTools.getValueFromCollectionFile(index, fwUnrDestination, false);
		voiceMailProfileName = CollectionTools.getValueFromCollectionFile(index, voiceMailProfileName, false);
		fwAllVoicemailEnable = CollectionTools.getValueFromCollectionFile(index, fwAllVoicemailEnable, false);
		fwNoanVoicemailEnable = CollectionTools.getValueFromCollectionFile(index, fwNoanVoicemailEnable, false);
		fwBusyVoicemailEnable = CollectionTools.getValueFromCollectionFile(index, fwBusyVoicemailEnable, false);
		fwUnrVoicemailEnable = CollectionTools.getValueFromCollectionFile(index, fwUnrVoicemailEnable, false);
		}

	public String getLineLabel()
		{
		return lineLabel;
		}

	public void setLineLabel(String lineLabel)
		{
		this.lineLabel = lineLabel;
		}

	public String getAsciiLineLabel()
		{
		return asciiLineLabel;
		}

	public void setAsciiLineLabel(String asciiLineLabel)
		{
		this.asciiLineLabel = asciiLineLabel;
		}

	public String getLineDisplay()
		{
		return lineDisplay;
		}

	public void setLineDisplay(String lineDisplay)
		{
		this.lineDisplay = lineDisplay;
		}

	public String getLineDisplayAscii()
		{
		return lineDisplayAscii;
		}

	public void setLineDisplayAscii(String lineDisplayAscii)
		{
		this.lineDisplayAscii = lineDisplayAscii;
		}

	public String getExternalPhoneNumberMask()
		{
		return externalPhoneNumberMask;
		}

	public void setExternalPhoneNumberMask(String externalPhoneNumberMask)
		{
		this.externalPhoneNumberMask = externalPhoneNumberMask;
		}

	public String getLineNumber()
		{
		return lineNumber;
		}

	public void setLineNumber(String lineNumber)
		{
		this.lineNumber = lineNumber;
		}

	public String getRoutePartition()
		{
		return routePartition;
		}

	public void setRoutePartition(String routePartition)
		{
		this.routePartition = routePartition;
		}

	public int getLineIndex()
		{
		return lineIndex;
		}

	public void setLineIndex(int lineIndex)
		{
		this.lineIndex = lineIndex;
		}

	public String getLineCSS()
		{
		return lineCSS;
		}

	public void setLineCSS(String lineCSS)
		{
		this.lineCSS = lineCSS;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getAlertingName()
		{
		return alertingName;
		}

	public void setAlertingName(String alertingName)
		{
		this.alertingName = alertingName;
		}

	public String getAsciiAlertingName()
		{
		return asciiAlertingName;
		}

	public void setAsciiAlertingName(String asciiAlertingName)
		{
		this.asciiAlertingName = asciiAlertingName;
		}

	public String getFwCallingSearchSpaceName()
		{
		return fwCallingSearchSpaceName;
		}

	public void setFwCallingSearchSpaceName(String fwCallingSearchSpaceName)
		{
		this.fwCallingSearchSpaceName = fwCallingSearchSpaceName;
		}

	public String getFwAllDestination()
		{
		return fwAllDestination;
		}

	public void setFwAllDestination(String fwAllDestination)
		{
		this.fwAllDestination = fwAllDestination;
		}

	public String getFwNoanDestination()
		{
		return fwNoanDestination;
		}

	public void setFwNoanDestination(String fwNoanDestination)
		{
		this.fwNoanDestination = fwNoanDestination;
		}

	public String getFwBusyDestination()
		{
		return fwBusyDestination;
		}

	public void setFwBusyDestination(String fwBusyDestination)
		{
		this.fwBusyDestination = fwBusyDestination;
		}

	public String getFwUnrDestination()
		{
		return fwUnrDestination;
		}

	public void setFwUnrDestination(String fwUnrDestination)
		{
		this.fwUnrDestination = fwUnrDestination;
		}

	public String getVoiceMailProfileName()
		{
		return voiceMailProfileName;
		}

	public void setVoiceMailProfileName(String voiceMailProfileName)
		{
		this.voiceMailProfileName = voiceMailProfileName;
		}

	public String getFwAllVoicemailEnable()
		{
		return fwAllVoicemailEnable;
		}

	public void setFwAllVoicemailEnable(String fwAllVoicemailEnable)
		{
		this.fwAllVoicemailEnable = fwAllVoicemailEnable;
		}

	public String getFwNoanVoicemailEnable()
		{
		return fwNoanVoicemailEnable;
		}

	public void setFwNoanVoicemailEnable(String fwNoanVoicemailEnable)
		{
		this.fwNoanVoicemailEnable = fwNoanVoicemailEnable;
		}

	public String getFwBusyVoicemailEnable()
		{
		return fwBusyVoicemailEnable;
		}

	public void setFwBusyVoicemailEnable(String fwBusyVoicemailEnable)
		{
		this.fwBusyVoicemailEnable = fwBusyVoicemailEnable;
		}

	public String getFwUnrVoicemailEnable()
		{
		return fwUnrVoicemailEnable;
		}

	public void setFwUnrVoicemailEnable(String fwUnrVoicemailEnable)
		{
		this.fwUnrVoicemailEnable = fwUnrVoicemailEnable;
		}
	
	
	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

