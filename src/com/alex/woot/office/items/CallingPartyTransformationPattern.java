package com.alex.woot.office.items;

import com.alex.woot.axlitems.linkers.TranslationPatternLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;

/**********************************
 * Class used to define an item of type "Calling Party Transformation Pattern"
 * 
 * @author RATEL Alexandre
 **********************************/

public class CallingPartyTransformationPattern extends ItemToInject
	{
	/**
	 * Variables
	 */
	private TranslationPatternLinker myTranslationPattern;
	private String description,
	routePartitionName,
	useCallingPartyPhoneMask,
	callingPartyTransformationMask,
	callingPartyPrefixDigits,
	callingLinePresentationBit,
	callingPartyNumberType,
	callingPartyNumberingPlan;

	
	/***************
	 * Constructor
	 * @throws Exception
	 ***************/
	public CallingPartyTransformationPattern(String name,
			String description,
			String routePartitionName, String callingSearchSpaceName,
			String patternUrgency, String useCallingPartyPhoneMask,
			String calledPartyTransformationMask,
			String callingPartyTransformationMask,
			String digitDiscardInstructionName) throws Exception
		{
		super(itemType.translationpattern, name);
		myTranslationPattern = new TranslationPatternLinker(name,routePartitionName);
		this.usage = "Translation";
		this.provideOutsideDialtone = "true";
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.callingSearchSpaceName = callingSearchSpaceName;
		this.patternUrgency = patternUrgency;
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		this.calledPartyTransformationMask = calledPartyTransformationMask;
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public CallingPartyTransformationPattern(String name, String routePartitionName) throws Exception
		{
		super(itemType.translationpattern, name);
		myTranslationPattern = new TranslationPatternLinker(name, routePartitionName);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myTranslationPattern.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myTranslationPattern.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myTranslationPattern.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myTranslationPattern.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			CallingPartyTransformationPattern myTP = (CallingPartyTransformationPattern) myTranslationPattern.get();
			this.UUID = myTP.getUUID();
			
			Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
			return true;
			}
		catch (Exception e)
			{
			//If we reach this point, it means that the item doesn't already exist
			Variables.getLogger().debug("Item "+this.name+" doesn't already exist in the CUCM");
			}
		return false;
		}
	
	
	/**
	 * Method used to resolve pattern into real value
	 * @throws Exception 
	 */
	public void resolve() throws Exception
		{
		this.name = CollectionTools.getRawValue(this.name, this, true);
		this.description = CollectionTools.getRawValue(this.description, this, true);
		this.routePartitionName = CollectionTools.getRawValue(this.routePartitionName, this, true);
		this.callingSearchSpaceName = CollectionTools.getRawValue(this.callingSearchSpaceName, this, true);
		this.patternUrgency = CollectionTools.getRawValue(this.patternUrgency, this, true);
		this.useCallingPartyPhoneMask = CollectionTools.getRawValue(this.useCallingPartyPhoneMask, this, true);
		this.callingPartyTransformationMask = CollectionTools.getRawValue(this.callingPartyTransformationMask, this, true);
		this.calledPartyTransformationMask = CollectionTools.getRawValue(this.calledPartyTransformationMask, this, true);
		this.digitDiscardInstructionName = CollectionTools.getRawValue(this.digitDiscardInstructionName, this, true);
		
		/**
		 * We set the item parameters
		 */
		myTranslationPattern.setName(this.getName());
		myTranslationPattern.setRoutePartitionName(routePartitionName);
		myTranslationPattern.setCalledPartyTransformationMask(calledPartyTransformationMask);
		myTranslationPattern.setCallingSearchSpaceName(callingSearchSpaceName);
		myTranslationPattern.setDescription(description);
		myTranslationPattern.setDigitDiscardInstructionName(digitDiscardInstructionName);
		myTranslationPattern.setPatternUrgency(patternUrgency);
		myTranslationPattern.setProvideOutsideDialtone(provideOutsideDialtone);
		myTranslationPattern.setUsage(usage);
		myTranslationPattern.setUseCallingPartyPhoneMask(useCallingPartyPhoneMask);
		myTranslationPattern.setCallingPartyTransformationMask(callingPartyTransformationMask);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(calledPartyTransformationMask))tuList.add(TranslationPatternLinker.toUpdate.calledPartyTransformationMask);
		if(UsefulMethod.isNotEmpty(callingSearchSpaceName))tuList.add(TranslationPatternLinker.toUpdate.callingSearchSpaceName);
		if(UsefulMethod.isNotEmpty(description))tuList.add(TranslationPatternLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(digitDiscardInstructionName))tuList.add(TranslationPatternLinker.toUpdate.digitDiscardInstructionName);
		if(UsefulMethod.isNotEmpty(patternUrgency))tuList.add(TranslationPatternLinker.toUpdate.patternUrgency);
		if(UsefulMethod.isNotEmpty(provideOutsideDialtone))tuList.add(TranslationPatternLinker.toUpdate.provideOutsideDialtone);
		if(UsefulMethod.isNotEmpty(usage))tuList.add(TranslationPatternLinker.toUpdate.usage);
		if(UsefulMethod.isNotEmpty(useCallingPartyPhoneMask))tuList.add(TranslationPatternLinker.toUpdate.useCallingPartyPhoneMask);
		if(UsefulMethod.isNotEmpty(callingPartyTransformationMask))tuList.add(TranslationPatternLinker.toUpdate.callingPartyTransformationMask);
		}

	public String getUsage()
		{
		return usage;
		}

	public void setUsage(String usage)
		{
		this.usage = usage;
		}

	public String getProvideOutsideDialtone()
		{
		return provideOutsideDialtone;
		}

	public void setProvideOutsideDialtone(String provideOutsideDialtone)
		{
		this.provideOutsideDialtone = provideOutsideDialtone;
		}

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getRoutePartitionName()
		{
		return routePartitionName;
		}

	public void setRoutePartitionName(String routePartitionName)
		{
		this.routePartitionName = routePartitionName;
		}

	public String getCallingSearchSpaceName()
		{
		return callingSearchSpaceName;
		}

	public void setCallingSearchSpaceName(String callingSearchSpaceName)
		{
		this.callingSearchSpaceName = callingSearchSpaceName;
		}

	public String getPatternUrgency()
		{
		return patternUrgency;
		}

	public void setPatternUrgency(String patternUrgency)
		{
		this.patternUrgency = patternUrgency;
		}

	public String getUseCallingPartyPhoneMask()
		{
		return useCallingPartyPhoneMask;
		}

	public void setUseCallingPartyPhoneMask(String useCallingPartyPhoneMask)
		{
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		}

	public String getCalledPartyTransformationMask()
		{
		return calledPartyTransformationMask;
		}

	public void setCalledPartyTransformationMask(
			String calledPartyTransformationMask)
		{
		this.calledPartyTransformationMask = calledPartyTransformationMask;
		}

	public String getDigitDiscardInstructionName()
		{
		return digitDiscardInstructionName;
		}

	public void setDigitDiscardInstructionName(String digitDiscardInstructionName)
		{
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public String getCallingPartyTransformationMask()
		{
		return callingPartyTransformationMask;
		}

	public void setCallingPartyTransformationMask(
			String callingPartyTransformationMask)
		{
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		}

	

	
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

