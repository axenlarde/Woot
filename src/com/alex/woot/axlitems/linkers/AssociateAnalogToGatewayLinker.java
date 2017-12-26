package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.alex.woot.axlitems.misc.AXLItemLinker;
import com.alex.woot.axlitems.misc.ToUpdate;
import com.alex.woot.misc.ErrorTemplate;
import com.alex.woot.misc.ItemToInject;
import com.alex.woot.misc.PhoneService;
import com.alex.woot.misc.SimpleRequest;
import com.alex.woot.misc.SpeedDial;
import com.alex.woot.misc.ErrorTemplate.errorType;
import com.alex.woot.soap.items.PhoneLine;
import com.alex.woot.user.items.Phone;
import com.alex.woot.user.misc.UserError;
import com.alex.woot.utils.Variables;
import com.alex.woot.utils.Variables.itemType;
import com.alex.woot.utils.Variables.sdType;

import java.util.ArrayList;



/**********************************
 * Is the AXLItem design to link the item "Phone"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class AssociateAnalogToGatewayLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String gatewayName,//Name is a description
	portName,
	slot,
	subunit,
	port;
	
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public AssociateAnalogToGatewayLinker(String name) throws Exception
		{
		super(name);
		}
	
	/***************
	 * Initialization
	 */
	public ArrayList<ErrorTemplate> doInitVersion85() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		//To be written
		
		return errorList;
		}
	
	public ArrayList<ErrorTemplate> doInitVersion105() throws Exception
		{
		ArrayList<ErrorTemplate> errorList = new ArrayList<ErrorTemplate>();
		
		//Here we want to log every error, so we have to use a try/catch for each
		try
			{
			SimpleRequest.getUUIDV105(itemType.gateway, this.gatewayName);
			}
		catch (Exception e)
			{
			errorList.add(new UserError(this.name, this.gatewayName, "Not found during init : "+e.getMessage(), itemType.associateanalog, itemType.gateway, errorType.notFound));
			}
		
		return errorList;
		}
	/**************/
	
	/***************
	 * Delete
	 */
	public void doDeleteVersion105() throws Exception
		{
		//Nothing to delete in this case
		}

	public void doDeleteVersion85() throws Exception
		{
		//Nothing to delete in this case
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.ExecuteSQLUpdateReq req = new com.cisco.axl.api._10.ExecuteSQLUpdateReq();
		
		/****
		 * We set the item parameters
		 */
		StringBuffer request = new StringBuffer("insert into MGCPDeviceMember ( fkMGCP,fkDevice,pkid,Slot,Subunit,Port ) values (");
		
		String gatewayUUID = SimpleRequest.getUUID(itemType.gateway, gatewayName);
		gatewayUUID = gatewayUUID.toLowerCase().replace("{","").replace("}","");
		request.append("'"+gatewayUUID+"',");
		
		String portUUID = SimpleRequest.getUUID(itemType.phone, portName);
		portUUID = portUUID.toLowerCase().replace("{","").replace("}","");
		request.append("'"+portUUID+"',");
		
		request.append("newid(),");
		request.append("'0',");
		request.append("'0',");
		request.append("'"+port+"')");
		
		req.setSql(request.toString());
		/************/
		
		/*
		 "executeSQLUpdate",
		 "insert into MGCPDeviceMember ( fkMGCP,fkDevice,pkid,Slot,Subunit,Port ) values (
		 '"+getUUIDElementExt("getGateway","domainName", "SKIGW"+monWorkbook.getSheet(2).getCell(23,gwInfoList.get(j).getIndex()).getContents().substring(2, 12)).toLowerCase().replace("{","").replace("}", "")+"',
		 '"+UID+"',
		 newid(),
		 '"+gwInfoList.get(j).getGwInfoList().get(0)[0]+"',
		 '0',
		 '"+gwInfoList.get(j).getGwInfoList().get(k)[1]+"')");
		 */
		
		com.cisco.axl.api._10.ExecuteSQLUpdateRes resp = Variables.getAXLConnectionToCUCMV105().executeSQLUpdate(req);//We send the request to the CUCM
		
		return resp.getReturn().getRowsUpdated().toString();
		}

	public String doInjectVersion85() throws Exception
		{
		//To be written
		
		return null;
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Nothing to update in  this case
		}

	public void doUpdateVersion85(ArrayList<ToUpdate> tuList) throws Exception
		{
		//Nothing to update in  this case
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		//Nothing to update in  this case
		
		return null;
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		//Nothing to update in  this case
		
		return null;
		}
	/****************/

	public String getGatewayName()
		{
		return gatewayName;
		}

	public void setGatewayName(String gatewayName)
		{
		this.gatewayName = gatewayName;
		}

	public String getPortName()
		{
		return portName;
		}

	public void setPortName(String portName)
		{
		this.portName = portName;
		}

	public String getSlot()
		{
		return slot;
		}

	public void setSlot(String slot)
		{
		this.slot = slot;
		}

	public String getSubunit()
		{
		return subunit;
		}

	public void setSubunit(String subunit)
		{
		this.subunit = subunit;
		}

	public String getPort()
		{
		return port;
		}

	public void setPort(String port)
		{
		this.port = port;
		}

	
	
	
	/*2016*//*RATEL Alexandre 8)*/
	}

