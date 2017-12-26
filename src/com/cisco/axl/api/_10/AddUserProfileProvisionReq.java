
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddUserProfileProvisionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddUserProfileProvisionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="userProfileProvision" type="{http://www.cisco.com/AXL/API/10.5}XUserProfileProvision"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddUserProfileProvisionReq", propOrder = {
    "userProfileProvision"
})
public class AddUserProfileProvisionReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XUserProfileProvision userProfileProvision;

    /**
     * Gets the value of the userProfileProvision property.
     * 
     * @return
     *     possible object is
     *     {@link XUserProfileProvision }
     *     
     */
    public XUserProfileProvision getUserProfileProvision() {
        return userProfileProvision;
    }

    /**
     * Sets the value of the userProfileProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XUserProfileProvision }
     *     
     */
    public void setUserProfileProvision(XUserProfileProvision value) {
        this.userProfileProvision = value;
    }

}
