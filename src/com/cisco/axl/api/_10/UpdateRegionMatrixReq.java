
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRegionMatrixReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRegionMatrixReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="regionAName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *             &lt;element name="regionBName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="videoBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="codecPreference" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRegionMatrixReq", propOrder = {
    "uuid",
    "regionAName",
    "regionBName",
    "bandwidth",
    "videoBandwidth",
    "codecPreference"
})
public class UpdateRegionMatrixReq
    extends APIRequest
{

    protected String uuid;
    protected XFkType regionAName;
    protected XFkType regionBName;
    protected String bandwidth;
    @XmlElement(defaultValue = "384")
    protected String videoBandwidth;
    @XmlElementRef(name = "codecPreference", type = JAXBElement.class)
    protected JAXBElement<XFkType> codecPreference;

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

    /**
     * Gets the value of the regionAName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRegionAName() {
        return regionAName;
    }

    /**
     * Sets the value of the regionAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRegionAName(XFkType value) {
        this.regionAName = value;
    }

    /**
     * Gets the value of the regionBName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRegionBName() {
        return regionBName;
    }

    /**
     * Sets the value of the regionBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRegionBName(XFkType value) {
        this.regionBName = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
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
     * Gets the value of the codecPreference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCodecPreference() {
        return codecPreference;
    }

    /**
     * Sets the value of the codecPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCodecPreference(JAXBElement<XFkType> value) {
        this.codecPreference = ((JAXBElement<XFkType> ) value);
    }

}
