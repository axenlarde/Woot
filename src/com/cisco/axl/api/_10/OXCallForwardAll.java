
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXCallForwardAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXCallForwardAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="secondaryCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OXCallForwardAll", propOrder = {
    "callingSearchSpaceName",
    "secondaryCallingSearchSpaceName"
})
public class OXCallForwardAll {

    protected OXFkType callingSearchSpaceName;
    protected OXFkType secondaryCallingSearchSpaceName;

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingSearchSpaceName(OXFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the secondaryCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSecondaryCallingSearchSpaceName() {
        return secondaryCallingSearchSpaceName;
    }

    /**
     * Sets the value of the secondaryCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSecondaryCallingSearchSpaceName(OXFkType value) {
        this.secondaryCallingSearchSpaceName = value;
    }

}
