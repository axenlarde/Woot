
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSNMPMIB2List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSNMPMIB2List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sysLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sysContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSNMPMIB2List", propOrder = {
    "sysLocation",
    "sysContact"
})
public class RSNMPMIB2List {

    @XmlElement(required = true)
    protected String sysLocation;
    @XmlElement(required = true)
    protected String sysContact;

    /**
     * Gets the value of the sysLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysLocation() {
        return sysLocation;
    }

    /**
     * Sets the value of the sysLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysLocation(String value) {
        this.sysLocation = value;
    }

    /**
     * Gets the value of the sysContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysContact() {
        return sysContact;
    }

    /**
     * Sets the value of the sysContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysContact(String value) {
        this.sysContact = value;
    }

}
