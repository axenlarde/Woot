
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWLANProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWLANProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="wLANProfile" type="{http://www.cisco.com/AXL/API/10.5}XWLANProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWLANProfileReq", propOrder = {
    "wlanProfile"
})
public class AddWLANProfileReq
    extends APIRequest
{

    @XmlElement(name = "wLANProfile", required = true)
    protected XWLANProfile wlanProfile;

    /**
     * Gets the value of the wlanProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XWLANProfile }
     *     
     */
    public XWLANProfile getWLANProfile() {
        return wlanProfile;
    }

    /**
     * Sets the value of the wlanProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWLANProfile }
     *     
     */
    public void setWLANProfile(XWLANProfile value) {
        this.wlanProfile = value;
    }

}
