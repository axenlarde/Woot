
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLineAppearanceAssociationForPresence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLineAppearanceAssociationForPresence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="laapAssociate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="laapProductType" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="laapDeviceName" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="laapDirectory" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="laapPartition" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="laapDescription" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LLineAppearanceAssociationForPresence", propOrder = {
    "laapAssociate",
    "laapProductType",
    "laapDeviceName",
    "laapDirectory",
    "laapPartition",
    "laapDescription"
})
public class LLineAppearanceAssociationForPresence {

    protected XFkType laapAssociate;
    protected String laapProductType;
    protected String laapDeviceName;
    protected String laapDirectory;
    protected String laapPartition;
    protected String laapDescription;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the laapAssociate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLaapAssociate() {
        return laapAssociate;
    }

    /**
     * Sets the value of the laapAssociate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLaapAssociate(XFkType value) {
        this.laapAssociate = value;
    }

    /**
     * Gets the value of the laapProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaapProductType() {
        return laapProductType;
    }

    /**
     * Sets the value of the laapProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaapProductType(String value) {
        this.laapProductType = value;
    }

    /**
     * Gets the value of the laapDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaapDeviceName() {
        return laapDeviceName;
    }

    /**
     * Sets the value of the laapDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaapDeviceName(String value) {
        this.laapDeviceName = value;
    }

    /**
     * Gets the value of the laapDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaapDirectory() {
        return laapDirectory;
    }

    /**
     * Sets the value of the laapDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaapDirectory(String value) {
        this.laapDirectory = value;
    }

    /**
     * Gets the value of the laapPartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaapPartition() {
        return laapPartition;
    }

    /**
     * Sets the value of the laapPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaapPartition(String value) {
        this.laapPartition = value;
    }

    /**
     * Gets the value of the laapDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaapDescription() {
        return laapDescription;
    }

    /**
     * Sets the value of the laapDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaapDescription(String value) {
        this.laapDescription = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
