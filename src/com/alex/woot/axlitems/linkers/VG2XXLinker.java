package com.alex.woot.axlitems.linkers;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import com.alex.yuza.axlitems.misc.AXLItemLinker;
import com.alex.yuza.misc.ItemToInject;
import com.alex.yuza.misc.SimpleRequest;
import com.alex.yuza.site.VG2XX;
import com.alex.yuza.utils.Variables;
import com.alex.yuza.utils.Variables.itemType;


/**********************************
 * Is the AXLItem design to link the item "VG2XX"
 * and the Cisco AXL API without version dependencies
 * 
 * @author RATEL Alexandre
 **********************************/
public class VG2XXLinker extends AXLItemLinker
	{
	/**
	 * Variables
	 */
	private String description,
	product,
	protocol,
	callManagerGroupName;
	
	private int size;
	private boolean t38Enable;
	
	/***************
	 * Constructor
	 * @throws Exception 
	 ***************/
	public VG2XXLinker(String name) throws Exception
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
		com.cisco.axl.api._10.RemoveGatewayReq deleteReq = new com.cisco.axl.api._10.RemoveGatewayReq();
		
		deleteReq.setDomainName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().removeGateway(deleteReq);//We send the request to the CUCM
		}

	public void doDeleteVersion85() throws Exception
		{
		com.cisco.axl.api._8.RemoveGatewayReq deleteReq = new com.cisco.axl.api._8.RemoveGatewayReq();
		
		deleteReq.setDomainName(this.getName());//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().removeGateway(deleteReq);//We send the request to the CUCM
		}
	/**************/

	/***************
	 * Injection
	 */
	public String doInjectVersion105() throws Exception
		{
		com.cisco.axl.api._10.AddGatewayReq req = new com.cisco.axl.api._10.AddGatewayReq();
		com.cisco.axl.api._10.XGateway params = new com.cisco.axl.api._10.XGateway();
		
		/**
		 * We set the item parameters
		 */
		params.setDomainName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(new JAXBElement(new QName("product"), String.class, product));
		params.setProtocol(protocol);
		params.setCallManagerGroupName(new JAXBElement(new QName("callManagerGroupName"), com.cisco.axl.api._10.XFkType.class, SimpleRequest.getUUIDV105(itemType.callmanagergroup, this.callManagerGroupName)));
		
		//We define the units and subunit
		com.cisco.axl.api._10.XGateway.Units myUnits = new com.cisco.axl.api._10.XGateway.Units();
		com.cisco.axl.api._10.XGateway.Units.Unit myUnit = new com.cisco.axl.api._10.XGateway.Units.Unit();
		myUnit.setIndex("0");
		myUnit.setProduct(new JAXBElement(new QName("product"), String.class, "ANALOG"));
		
		com.cisco.axl.api._10.XGateway.Units.Unit.Subunits mySubunits = new com.cisco.axl.api._10.XGateway.Units.Unit.Subunits();
		com.cisco.axl.api._10.XGateway.Units.Unit.Subunits.Subunit mySubunit = new com.cisco.axl.api._10.XGateway.Units.Unit.Subunits.Subunit();
		mySubunit.setIndex(new JAXBElement(new QName("index"), String.class, "0"));
		mySubunit.setProduct(new JAXBElement(new QName("product"), String.class, size+"FXS-SCCP"));
		mySubunit.setBeginPort(new JAXBElement(new QName("beginPort"), String.class, "0"));
		
		mySubunits.getSubunit().add(mySubunit);
		myUnit.setSubunits(mySubunits);
		myUnits.getUnit().add(myUnit);
		params.setUnits(myUnits);
		
		//Vendor Config Definition
		if(t38Enable)
			{
			com.cisco.axl.api._10.XVendorConfig myVendorConfig = new com.cisco.axl.api._10.XVendorConfig();
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("T38FaxRelay");
			doc.appendChild(rootElement);
			rootElement.appendChild(doc.createTextNode("Enable"));
			
			myVendorConfig.getAny().add(rootElement);
			
			params.setVendorConfig(new JAXBElement(new QName("vendorConfig"), com.cisco.axl.api._10.XVendorConfig.class, myVendorConfig));
			}
		/************/
		
		req.setGateway(params);//We add the parameters to the request
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().addGateway(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}

	public String doInjectVersion85() throws Exception
		{
		com.cisco.axl.api._8.AddGatewayReq req = new com.cisco.axl.api._8.AddGatewayReq();
		com.cisco.axl.api._8.XGateway params = new com.cisco.axl.api._8.XGateway();
		
		/**
		 * We set the item parameters
		 */
		params.setDomainName(this.getName());//Name
		params.setDescription(this.description);
		params.setProduct(new JAXBElement(new QName("product"), String.class, product));
		params.setProtocol(protocol);
		params.setCallManagerGroupName(new JAXBElement(new QName("callManagerGroupName"), com.cisco.axl.api._8.XFkType.class, SimpleRequest.getUUIDV85(itemType.callmanagergroup, this.callManagerGroupName)));
		
		//We define the units and subunit
		com.cisco.axl.api._8.XGateway.Units myUnits = new com.cisco.axl.api._8.XGateway.Units();
		com.cisco.axl.api._8.XGateway.Units.Unit myUnit = new com.cisco.axl.api._8.XGateway.Units.Unit();
		myUnit.setIndex("0");
		myUnit.setProduct(new JAXBElement(new QName("product"), String.class, "ANALOG"));
		
		com.cisco.axl.api._8.XGateway.Units.Unit.Subunits mySubunits = new com.cisco.axl.api._8.XGateway.Units.Unit.Subunits();
		com.cisco.axl.api._8.XGateway.Units.Unit.Subunits.Subunit mySubunit = new com.cisco.axl.api._8.XGateway.Units.Unit.Subunits.Subunit();
		mySubunit.setIndex(new JAXBElement(new QName("index"), String.class, "0"));
		mySubunit.setProduct(new JAXBElement(new QName("product"), String.class, size+"FXS-SCCP"));
		mySubunit.setBeginPort(new JAXBElement(new QName("beginPort"), String.class, "0"));
		
		mySubunits.getSubunit().add(mySubunit);
		myUnit.setSubunits(mySubunits);
		myUnits.getUnit().add(myUnit);
		params.setUnits(myUnits);
		
		//Vendor Config Definition
		if(t38Enable)
			{
			com.cisco.axl.api._8.XVendorConfig myVendorConfig = new com.cisco.axl.api._8.XVendorConfig();
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("T38FaxRelay");
			doc.appendChild(rootElement);
			rootElement.appendChild(doc.createTextNode("Enable"));
			
			myVendorConfig.getAny().add(rootElement);
			
			params.setVendorConfig(new JAXBElement(new QName("vendorConfig"), com.cisco.axl.api._8.XVendorConfig.class, myVendorConfig));
			}
		/************/
		
		req.setGateway(params);//We add the parameters to the request
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().addGateway(req);//We send the request to the CUCM
		
		return resp.getReturn();//Return UUID
		}
	/**************/
	
	/***************
	 * Update
	 */
	public void doUpdateVersion105() throws Exception
		{
		com.cisco.axl.api._10.UpdateGatewayReq req = new com.cisco.axl.api._10.UpdateGatewayReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setDomainName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._10.StandardResponse resp = Variables.getAXLConnectionToCUCMV105().updateGateway(req);//We send the request to the CUCM
		}

	public void doUpdateVersion85() throws Exception
		{
		com.cisco.axl.api._8.UpdateGatewayReq req = new com.cisco.axl.api._8.UpdateGatewayReq();
		
		/***********
		 * We set the item parameters
		 */
		req.setDomainName(this.getName());
		//Has to be written
		/************/
		
		com.cisco.axl.api._8.StandardResponse resp = Variables.getAXLConnectionToCUCM().updateGateway(req);//We send the request to the CUCM
		}
	/**************/
	
	
	/*************
	 * Get
	 */
	public ItemToInject doGetVersion105() throws Exception
		{
		com.cisco.axl.api._10.GetGatewayReq req = new com.cisco.axl.api._10.GetGatewayReq();
		
		/**
		 * We set the item parameters
		 */
		req.setDomainName(this.getName());
		/************/
		
		com.cisco.axl.api._10.GetGatewayRes resp = Variables.getAXLConnectionToCUCMV105().getGateway(req);//We send the request to the CUCM
		
		VG2XX myVg = new VG2XX(this.getName());
		myVg.setUUID(resp.getReturn().getGateway().getUuid());
		
		//Has to be written
		
		return myVg;//Return a VG
		}

	public ItemToInject doGetVersion85() throws Exception
		{
		com.cisco.axl.api._8.GetGatewayReq req = new com.cisco.axl.api._8.GetGatewayReq();
		
		/**
		 * We set the item parameters
		 */
		req.setDomainName(this.getName());
		/************/
		
		com.cisco.axl.api._8.GetGatewayRes resp = Variables.getAXLConnectionToCUCM().getGateway(req);//We send the request to the CUCM
		
		VG2XX myVg = new VG2XX(this.getName());
		myVg.setUUID(resp.getReturn().getGateway().getUuid());
		
		//Has to be written
		
		return myVg;//Return a VG
		}
	/****************/

	public String getDescription()
		{
		return description;
		}

	public void setDescription(String description)
		{
		this.description = description;
		}

	public String getProduct()
		{
		return product;
		}

	public void setProduct(String product)
		{
		this.product = product;
		}

	public String getProtocol()
		{
		return protocol;
		}

	public void setProtocol(String protocol)
		{
		this.protocol = protocol;
		}

	public String getCallManagerGroupName()
		{
		return callManagerGroupName;
		}

	public void setCallManagerGroupName(String callManagerGroupName)
		{
		this.callManagerGroupName = callManagerGroupName;
		}

	public boolean isT38Enable()
		{
		return t38Enable;
		}

	public void setT38Enable(boolean t38Enable)
		{
		this.t38Enable = t38Enable;
		}

	public int getSize()
		{
		return size;
		}

	public void setSize(int size)
		{
		this.size = size;
		}
	
	
	
	
	/*2015*//*RATEL Alexandre 8)*/
	}

