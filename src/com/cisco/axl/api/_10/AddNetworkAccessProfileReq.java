
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNetworkAccessProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNetworkAccessProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/10.5}XNetworkAccessProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNetworkAccessProfileReq", propOrder = {
    "networkAccessProfile"
})
public class AddNetworkAccessProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XNetworkAccessProfile networkAccessProfile;

    /**
     * Gets the value of the networkAccessProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XNetworkAccessProfile }
     *     
     */
    public XNetworkAccessProfile getNetworkAccessProfile() {
        return networkAccessProfile;
    }

    /**
     * Sets the value of the networkAccessProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XNetworkAccessProfile }
     *     
     */
    public void setNetworkAccessProfile(XNetworkAccessProfile value) {
        this.networkAccessProfile = value;
    }

}
