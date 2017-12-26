
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="withinAudioBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="withinVideoBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="withinImmersiveKbits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
@XmlType(name = "LLocation", propOrder = {
    "name",
    "id",
    "withinAudioBandwidth",
    "withinVideoBandwidth",
    "withinImmersiveKbits"
})
public class LLocation {

    protected String name;
    protected String id;
    protected String withinAudioBandwidth;
    protected String withinVideoBandwidth;
    protected String withinImmersiveKbits;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the withinAudioBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinAudioBandwidth() {
        return withinAudioBandwidth;
    }

    /**
     * Sets the value of the withinAudioBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinAudioBandwidth(String value) {
        this.withinAudioBandwidth = value;
    }

    /**
     * Gets the value of the withinVideoBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinVideoBandwidth() {
        return withinVideoBandwidth;
    }

    /**
     * Sets the value of the withinVideoBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinVideoBandwidth(String value) {
        this.withinVideoBandwidth = value;
    }

    /**
     * Gets the value of the withinImmersiveKbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinImmersiveKbits() {
        return withinImmersiveKbits;
    }

    /**
     * Sets the value of the withinImmersiveKbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinImmersiveKbits(String value) {
        this.withinImmersiveKbits = value;
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
