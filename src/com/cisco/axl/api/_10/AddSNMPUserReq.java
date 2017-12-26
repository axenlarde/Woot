
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSNMPUserReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSNMPUserReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.cisco.com/AXL/API/10.5}RSNMPUser"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSNMPUserReq", propOrder = {
    "user"
})
public class AddSNMPUserReq
    extends APIRequest
{

    @XmlElement(required = true, nillable = true)
    protected RSNMPUser user;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link RSNMPUser }
     *     
     */
    public RSNMPUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSNMPUser }
     *     
     */
    public void setUser(RSNMPUser value) {
        this.user = value;
    }

}
