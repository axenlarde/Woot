package com.alex.woot.office.items;


import com.alex.woot.axlitems.linkers.CallingPartyTransformationPatternLinker;
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
	private CallingPartyTransformationPatternLinker myCallingPartyTransformationPattern;
	private String description,
	routePartitionName,
	callingPartyTransformationMask,
	useCallingPartyPhoneMask,
	digitDiscardInstructionName,
	callingPartyPrefixDigits,
	callingLinePresentationBit,
	callingPartyNumberingPlan,
	callingPartyNumberType;

	
	
	/***************
	 * Constructor
	 * @throws Exception
	 ***************/
	public CallingPartyTransformationPattern(String name, String description, String routePartitionName,
			String callingPartyTransformationMask, String useCallingPartyPhoneMask, String digitDiscardInstructionName,
			String callingPartyPrefixDigits, String callingLinePresentationBit, String callingPartyNumberingPlan,
			String callingPartyNumberType) throws Exception
		{
		super(itemType.callingpartytransformationpattern, name);
		myCallingPartyTransformationPattern = new CallingPartyTransformationPatternLinker(name, routePartitionName);
		this.description = description;
		this.routePartitionName = routePartitionName;
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		this.callingPartyPrefixDigits = callingPartyPrefixDigits;
		this.callingLinePresentationBit = callingLinePresentationBit;
		this.callingPartyNumberingPlan = callingPartyNumberingPlan;
		this.callingPartyNumberType = callingPartyNumberType;
		}

	public CallingPartyTransformationPattern(String name, String routePartitionName) throws Exception
		{
		super(itemType.callingpartytransformationpattern, name);
		this.routePartitionName = routePartitionName;
		myCallingPartyTransformationPattern = new CallingPartyTransformationPatternLinker(name, routePartitionName);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		this.errorList.addAll(myCallingPartyTransformationPattern.init());
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myCallingPartyTransformationPattern.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myCallingPartyTransformationPattern.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myCallingPartyTransformationPattern.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		CallingPartyTransformationPattern myCPTP = (CallingPartyTransformationPattern) myCallingPartyTransformationPattern.get();
		this.UUID = myCPTP.getUUID();
		
		Variables.getLogger().debug("Item "+this.name+" already exist in the CUCM");
		return true;
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
		this.callingPartyTransformationMask = CollectionTools.getRawValue(this.callingPartyTransformationMask, this, false);
		this.useCallingPartyPhoneMask = CollectionTools.getRawValue(this.useCallingPartyPhoneMask, this, false);
		this.digitDiscardInstructionName = CollectionTools.getRawValue(this.digitDiscardInstructionName, this, false);
		this.callingPartyPrefixDigits = CollectionTools.getRawValue(this.callingPartyPrefixDigits, this, false);
		this.callingLinePresentationBit = CollectionTools.getRawValue(this.callingLinePresentationBit, this, false);
		this.callingPartyNumberingPlan = CollectionTools.getRawValue(this.callingPartyNumberingPlan, this, false);
		this.callingPartyNumberType = CollectionTools.getRawValue(this.callingPartyNumberType, this, false);
		
		/**
		 * We set the item parameters
		 */
		myCallingPartyTransformationPattern.setName(this.getName());
		myCallingPartyTransformationPattern.setDescription(description);
		myCallingPartyTransformationPattern.setRoutePartitionName(routePartitionName);
		myCallingPartyTransformationPattern.setCallingPartyTransformationMask(callingPartyTransformationMask);
		myCallingPartyTransformationPattern.setUseCallingPartyPhoneMask(useCallingPartyPhoneMask);
		myCallingPartyTransformationPattern.setDigitDiscardInstructionName(digitDiscardInstructionName);
		myCallingPartyTransformationPattern.setCallingPartyPrefixDigits(callingPartyPrefixDigits);
		myCallingPartyTransformationPattern.setCallingLinePresentationBit(callingLinePresentationBit);
		myCallingPartyTransformationPattern.setCallingPartyNumberingPlan(callingPartyNumberingPlan);
		myCallingPartyTransformationPattern.setCallingPartyNumberType(callingPartyNumberType);
		/*********/
		}
	
	/**
	 * Manage the content of the "To Update List"
	 */
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(description))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.description);
		if(UsefulMethod.isNotEmpty(callingPartyTransformationMask))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.callingPartyTransformationMask);
		if(UsefulMethod.isNotEmpty(useCallingPartyPhoneMask))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.useCallingPartyPhoneMask);
		if(UsefulMethod.isNotEmpty(digitDiscardInstructionName))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.digitDiscardInstructionName);
		if(UsefulMethod.isNotEmpty(callingPartyPrefixDigits))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.callingPartyPrefixDigits);
		if(UsefulMethod.isNotEmpty(callingLinePresentationBit))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.callingLinePresentationBit);
		if(UsefulMethod.isNotEmpty(callingPartyNumberingPlan))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.callingPartyNumberingPlan);
		if(UsefulMethod.isNotEmpty(callingPartyNumberType))tuList.add(CallingPartyTransformationPatternLinker.toUpdate.callingPartyNumberType);
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

	public String getCallingPartyTransformationMask()
		{
		return callingPartyTransformationMask;
		}

	public void setCallingPartyTransformationMask(String callingPartyTransformationMask)
		{
		this.callingPartyTransformationMask = callingPartyTransformationMask;
		}

	public String getUseCallingPartyPhoneMask()
		{
		return useCallingPartyPhoneMask;
		}

	public void setUseCallingPartyPhoneMask(String useCallingPartyPhoneMask)
		{
		this.useCallingPartyPhoneMask = useCallingPartyPhoneMask;
		}

	public String getDigitDiscardInstructionName()
		{
		return digitDiscardInstructionName;
		}

	public void setDigitDiscardInstructionName(String digitDiscardInstructionName)
		{
		this.digitDiscardInstructionName = digitDiscardInstructionName;
		}

	public String getCallingPartyPrefixDigits()
		{
		return callingPartyPrefixDigits;
		}

	public void setCallingPartyPrefixDigits(String callingPartyPrefixDigits)
		{
		this.callingPartyPrefixDigits = callingPartyPrefixDigits;
		}

	public String getCallingLinePresentationBit()
		{
		return callingLinePresentationBit;
		}

	public void setCallingLinePresentationBit(String callingLinePresentationBit)
		{
		this.callingLinePresentationBit = callingLinePresentationBit;
		}

	public String getCallingPartyNumberingPlan()
		{
		return callingPartyNumberingPlan;
		}

	public void setCallingPartyNumberingPlan(String callingPartyNumberingPlan)
		{
		this.callingPartyNumberingPlan = callingPartyNumberingPlan;
		}

	public String getCallingPartyNumberType()
		{
		return callingPartyNumberType;
		}

	public void setCallingPartyNumberType(String callingPartyNumberType)
		{
		this.callingPartyNumberType = callingPartyNumberType;
		}
	
	
	/*2018*//*RATEL Alexandre 8)*/
	}

