
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCCAProfilesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCCAProfilesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="cCAProfiles" type="{http://www.cisco.com/AXL/API/10.5}XCCAProfiles"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCCAProfilesReq", propOrder = {
    "ccaProfiles"
})
public class AddCCAProfilesReq
    extends APIRequest
{

    @XmlElement(name = "cCAProfiles", required = true)
    protected XCCAProfiles ccaProfiles;

    /**
     * Gets the value of the ccaProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link XCCAProfiles }
     *     
     */
    public XCCAProfiles getCCAProfiles() {
        return ccaProfiles;
    }

    /**
     * Sets the value of the ccaProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCCAProfiles }
     *     
     */
    public void setCCAProfiles(XCCAProfiles value) {
        this.ccaProfiles = value;
    }

}
