
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUcServiceReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUcServiceReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="ucService" type="{http://www.cisco.com/AXL/API/10.5}XUcService"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUcServiceReq", propOrder = {
    "ucService"
})
public class AddUcServiceReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUcService ucService;

    /**
     * Gets the value of the ucService property.
     * 
     * @return
     *     possible object is
     *     {@link XUcService }
     *     
     */
    public XUcService getUcService() {
        return ucService;
    }

    /**
     * Sets the value of the ucService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUcService }
     *     
     */
    public void setUcService(XUcService value) {
        this.ucService = value;
    }

}
