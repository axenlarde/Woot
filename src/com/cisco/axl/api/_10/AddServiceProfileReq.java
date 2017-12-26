
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddServiceProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddServiceProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}XServiceProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddServiceProfileReq", propOrder = {
    "serviceProfile"
})
public class AddServiceProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XServiceProfile serviceProfile;

    /**
     * Gets the value of the serviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XServiceProfile }
     *     
     */
    public XServiceProfile getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XServiceProfile }
     *     
     */
    public void setServiceProfile(XServiceProfile value) {
        this.serviceProfile = value;
    }

}
