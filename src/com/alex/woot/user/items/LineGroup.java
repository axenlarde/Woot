package com.alex.woot.user.items;

//import jxl.Workbook;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;

import com.alex.woot.axlitems.linkers.LineGroupLinker;
import com.alex.woot.axlitems.linkers.UserLinker;
import com.alex.woot.misc.CollectionTools;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.soap.items.LineGroupMember;
import com.alex.woot.utils.UsefulMethod;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.statusType;


/**********************************
 * Class used to define an item of type "LineGroup"
 * 
 * @author RATEL Alexandre
 **********************************/

public class LineGroup extends ItemToInject
	{
	/**
	 * Variables
	 */
	private LineGroupLinker myLineGroup;
	private String distributionAlgorithm,
	rnaReversionTimeOut,
	huntAlgorithmNoAnswer,
	huntAlgorithmBusy,
	huntAlgorithmNotAvailable;
	
	private ArrayList<LineGroupMember> lineList;
	
	private int index;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public LineGroup(String name,
			String distributionAlgorithm,
			String rnaReversionTimeOut, String huntAlgorithmNoAnswer,
			String huntAlgorithmBusy, String huntAlgorithmNotAvailable) throws Exception
		{
		super(itemType.linegroup, name);
		this.myLineGroup = new LineGroupLinker(name);
		this.distributionAlgorithm = distributionAlgorithm;
		this.rnaReversionTimeOut = rnaReversionTimeOut;
		this.huntAlgorithmNoAnswer = huntAlgorithmNoAnswer;
		this.huntAlgorithmBusy = huntAlgorithmBusy;
		this.huntAlgorithmNotAvailable = huntAlgorithmNotAvailable;
		this.lineList = new ArrayList<LineGroupMember>();
		
		index = 0;
		}

	public LineGroup(String name) throws Exception
		{
		super(itemType.linegroup, name);
		myLineGroup = new LineGroupLinker(name);
		}

	/***********
	 * Method used to prepare the item for the injection
	 * by gathering the needed UUID from the CUCM 
	 */
	public void doBuild() throws Exception
		{
		//We check that the item doesn't already exist
		if(isExisting())
			{
			this.status = statusType.injected;
			}
		else
			{
			//The item doesn't already exist we have to inject it
			this.status = statusType.waiting;
			}
		}
	
	
	/**
	 * Method used to inject data in the CUCM using
	 * the Cisco API
	 * 
	 * It also return the item's UUID once injected
	 */
	public String doInject() throws Exception
		{
		return myLineGroup.inject();//Return UUID
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doDelete() throws Exception
		{
		myLineGroup.delete();
		}

	/**
	 * Method used to delete data in the CUCM using
	 * the Cisco API
	 */
	public void doUpdate() throws Exception
		{
		myLineGroup.update(tuList);
		}
	
	/**
	 * Method used to check if the element exist in the CUCM
	 */
	public boolean isExisting() throws Exception
		{
		try
			{
			LineGroup myLG = (LineGroup) myLineGroup.get();
			this.UUID = myLG.getUUID();
			//Has to be enhanced
			
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
	
	public String getInfo()
		{
		return name+" "
		+UUID;
		}
	
	/**
	 * Method used to resolve pattern into real value
	 */
	public void resolve() throws Exception
		{
		name = CollectionTools.getValueFromCollectionFile(index, name, this);
		distributionAlgorithm = CollectionTools.getValueFromCollectionFile(index, distributionAlgorithm, this);
		rnaReversionTimeOut = CollectionTools.getValueFromCollectionFile(index, rnaReversionTimeOut, this);
		huntAlgorithmNoAnswer = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmNoAnswer, this, false);
		huntAlgorithmBusy = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmBusy, this, false);
		huntAlgorithmNotAvailable = CollectionTools.getValueFromCollectionFile(index, huntAlgorithmNotAvailable, this, false);
		
		myLineGroup.setName(name);
		myLineGroup.setDistributionAlgorithm(distributionAlgorithm);
		myLineGroup.setRnaReversionTimeOut(rnaReversionTimeOut);
		myLineGroup.setHuntAlgorithmBusy(huntAlgorithmBusy);
		myLineGroup.setHuntAlgorithmNoAnswer(huntAlgorithmNoAnswer);
		myLineGroup.setHuntAlgorithmNotAvailable(huntAlgorithmNotAvailable);
		myLineGroup.setLineList(lineList);
		}
	
	public void manageTuList() throws Exception
		{
		if(UsefulMethod.isNotEmpty(distributionAlgorithm))tuList.add(LineGroupLinker.toUpdate.distributionAlgorithm);
		if(UsefulMethod.isNotEmpty(rnaReversionTimeOut))tuList.add(LineGroupLinker.toUpdate.rnaReversionTimeOut);
		if(UsefulMethod.isNotEmpty(huntAlgorithmNoAnswer))tuList.add(LineGroupLinker.toUpdate.huntAlgorithmNoAnswer);
		if(UsefulMethod.isNotEmpty(huntAlgorithmBusy))tuList.add(LineGroupLinker.toUpdate.huntAlgorithmBusy);
		if(UsefulMethod.isNotEmpty(huntAlgorithmNotAvailable))tuList.add(LineGroupLinker.toUpdate.huntAlgorithmNotAvailable);
		if((lineList != null) && (lineList.size() != 0))tuList.add(LineGroupLinker.toUpdate.lineList);
		}

	public String getDistributionAlgorithm()
		{
		return distributionAlgorithm;
		}

	public void setDistributionAlgorithm(String distributionAlgorithm)
		{
		this.distributionAlgorithm = distributionAlgorithm;
		}

	public String getRnaReversionTimeOut()
		{
		return rnaReversionTimeOut;
		}

	public void setRnaReversionTimeOut(String rnaReversionTimeOut)
		{
		this.rnaReversionTimeOut = rnaReversionTimeOut;
		}

	public String getHuntAlgorithmNoAnswer()
		{
		return huntAlgorithmNoAnswer;
		}

	public void setHuntAlgorithmNoAnswer(String huntAlgorithmNoAnswer)
		{
		this.huntAlgorithmNoAnswer = huntAlgorithmNoAnswer;
		}

	public String getHuntAlgorithmBusy()
		{
		return huntAlgorithmBusy;
		}

	public void setHuntAlgorithmBusy(String huntAlgorithmBusy)
		{
		this.huntAlgorithmBusy = huntAlgorithmBusy;
		}

	public String getHuntAlgorithmNotAvailable()
		{
		return huntAlgorithmNotAvailable;
		}

	public void setHuntAlgorithmNotAvailable(String huntAlgorithmNotAvailable)
		{
		this.huntAlgorithmNotAvailable = huntAlgorithmNotAvailable;
		}

	public ArrayList<LineGroupMember> getLineList()
		{
		return lineList;
		}

	public void setLineList(ArrayList<LineGroupMember> lineList)
		{
		this.lineList = lineList;
		}

	public int getIndex()
		{
		return index;
		}

	public void setIndex(int index)
		{
		this.index = index;
		}

	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

