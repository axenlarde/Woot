
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSNMPCommunityString1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSNMPCommunityString1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="accessPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrayOfHosts" type="{http://www.cisco.com/AXL/API/10.5}RArrayOfHosts"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSNMPCommunityString1", propOrder = {
    "accessPrivilege",
    "arrayOfHosts"
})
public class RSNMPCommunityString1 {

    protected String accessPrivilege;
    @XmlElement(name = "ArrayOfHosts")
    protected RArrayOfHosts arrayOfHosts;

    /**
     * Gets the value of the accessPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPrivilege() {
        return accessPrivilege;
    }

    /**
     * Sets the value of the accessPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPrivilege(String value) {
        this.accessPrivilege = value;
    }

    /**
     * Gets the value of the arrayOfHosts property.
     * 
     * @return
     *     possible object is
     *     {@link RArrayOfHosts }
     *     
     */
    public RArrayOfHosts getArrayOfHosts() {
        return arrayOfHosts;
    }

    /**
     * Sets the value of the arrayOfHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RArrayOfHosts }
     *     
     */
    public void setArrayOfHosts(RArrayOfHosts value) {
        this.arrayOfHosts = value;
    }

}
