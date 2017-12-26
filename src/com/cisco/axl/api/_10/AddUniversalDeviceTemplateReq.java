
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUniversalDeviceTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUniversalDeviceTemplateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/10.5}XUniversalDeviceTemplate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUniversalDeviceTemplateReq", propOrder = {
    "universalDeviceTemplate"
})
public class AddUniversalDeviceTemplateReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUniversalDeviceTemplate universalDeviceTemplate;

    /**
     * Gets the value of the universalDeviceTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XUniversalDeviceTemplate }
     *     
     */
    public XUniversalDeviceTemplate getUniversalDeviceTemplate() {
        return universalDeviceTemplate;
    }

    /**
     * Sets the value of the universalDeviceTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUniversalDeviceTemplate }
     *     
     */
    public void setUniversalDeviceTemplate(XUniversalDeviceTemplate value) {
        this.universalDeviceTemplate = value;
    }

}
