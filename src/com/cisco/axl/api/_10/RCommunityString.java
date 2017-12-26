
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCommunityString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCommunityString">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessPrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "RCommunityString", propOrder = {
    "communityName",
    "accessPrivilege",
    "arrayOfHosts"
})
public class RCommunityString {

    @XmlElement(required = true)
    protected String communityName;
    @XmlElement(required = true)
    protected String accessPrivilege;
    @XmlElement(name = "ArrayOfHosts", required = true)
    protected RArrayOfHosts arrayOfHosts;

    /**
     * Gets the value of the communityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * Sets the value of the communityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityName(String value) {
        this.communityName = value;
    }

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
