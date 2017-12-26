
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XAdvertisedPatterns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XAdvertisedPatterns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patternType" type="{http://www.cisco.com/AXL/API/10.5}XGlobalNumber" minOccurs="0"/>
 *         &lt;element name="hostedRoutePSTNRule" type="{http://www.cisco.com/AXL/API/10.5}XHostedRoutePatternPSTNRule" minOccurs="0"/>
 *         &lt;element name="pstnFailStrip" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="pstnFailPrepend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAdvertisedPatterns", propOrder = {
    "description",
    "pattern",
    "patternType",
    "hostedRoutePSTNRule",
    "pstnFailStrip",
    "pstnFailPrepend"
})
public class XAdvertisedPatterns {

    protected String description;
    protected String pattern;
    @XmlElement(defaultValue = "Enterprise Number")
    protected String patternType;
    @XmlElement(defaultValue = "Specify")
    protected String hostedRoutePSTNRule;
    @XmlElement(defaultValue = "0")
    protected String pstnFailStrip;
    protected String pstnFailPrepend;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the patternType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternType() {
        return patternType;
    }

    /**
     * Sets the value of the patternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternType(String value) {
        this.patternType = value;
    }

    /**
     * Gets the value of the hostedRoutePSTNRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedRoutePSTNRule() {
        return hostedRoutePSTNRule;
    }

    /**
     * Sets the value of the hostedRoutePSTNRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedRoutePSTNRule(String value) {
        this.hostedRoutePSTNRule = value;
    }

    /**
     * Gets the value of the pstnFailStrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailStrip() {
        return pstnFailStrip;
    }

    /**
     * Sets the value of the pstnFailStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailStrip(String value) {
        this.pstnFailStrip = value;
    }

    /**
     * Gets the value of the pstnFailPrepend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailPrepend() {
        return pstnFailPrepend;
    }

    /**
     * Sets the value of the pstnFailPrepend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailPrepend(String value) {
        this.pstnFailPrepend = value;
    }

}
