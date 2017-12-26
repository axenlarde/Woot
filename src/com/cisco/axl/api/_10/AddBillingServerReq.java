
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddBillingServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBillingServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="billingServer" type="{http://www.cisco.com/AXL/API/10.5}XBillingServer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBillingServerReq", propOrder = {
    "billingServer"
})
public class AddBillingServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XBillingServer billingServer;

    /**
     * Gets the value of the billingServer property.
     * 
     * @return
     *     possible object is
     *     {@link XBillingServer }
     *     
     */
    public XBillingServer getBillingServer() {
        return billingServer;
    }

    /**
     * Sets the value of the billingServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XBillingServer }
     *     
     */
    public void setBillingServer(XBillingServer value) {
        this.billingServer = value;
    }

}
