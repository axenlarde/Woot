
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSdpTransparencyProfileReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSdpTransparencyProfileReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sdpTransparencyProfile" type="{http://www.cisco.com/AXL/API/10.5}XSdpTransparencyProfile"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSdpTransparencyProfileReq", propOrder = {
    "sdpTransparencyProfile"
})
public class AddSdpTransparencyProfileReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XSdpTransparencyProfile sdpTransparencyProfile;

    /**
     * Gets the value of the sdpTransparencyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XSdpTransparencyProfile }
     *     
     */
    public XSdpTransparencyProfile getSdpTransparencyProfile() {
        return sdpTransparencyProfile;
    }

    /**
     * Sets the value of the sdpTransparencyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSdpTransparencyProfile }
     *     
     */
    public void setSdpTransparencyProfile(XSdpTransparencyProfile value) {
        this.sdpTransparencyProfile = value;
    }

}
