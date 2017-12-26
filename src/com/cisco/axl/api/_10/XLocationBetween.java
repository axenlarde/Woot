
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLocationBetween complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLocationBetween">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="weight" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="audioBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="videoBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="immersiveBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLocationBetween", propOrder = {
    "locationName",
    "weight",
    "audioBandwidth",
    "videoBandwidth",
    "immersiveBandwidth"
})
public class XLocationBetween {

    protected XFkType locationName;
    @XmlElement(defaultValue = "50")
    protected String weight;
    protected String audioBandwidth;
    @XmlElement(defaultValue = "384")
    protected String videoBandwidth;
    @XmlElement(defaultValue = "384")
    protected String immersiveBandwidth;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLocationName(XFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the audioBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioBandwidth() {
        return audioBandwidth;
    }

    /**
     * Sets the value of the audioBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioBandwidth(String value) {
        this.audioBandwidth = value;
    }

    /**
     * Gets the value of the videoBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoBandwidth() {
        return videoBandwidth;
    }

    /**
     * Sets the value of the videoBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoBandwidth(String value) {
        this.videoBandwidth = value;
    }

    /**
     * Gets the value of the immersiveBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmersiveBandwidth() {
        return immersiveBandwidth;
    }

    /**
     * Sets the value of the immersiveBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmersiveBandwidth(String value) {
        this.immersiveBandwidth = value;
    }

}
