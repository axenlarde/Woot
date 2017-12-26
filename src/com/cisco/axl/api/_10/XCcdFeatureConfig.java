
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCcdFeatureConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCcdFeatureConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccdParamName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ccdParamValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCcdFeatureConfig", propOrder = {
    "ccdParamName",
    "ccdParamValue"
})
public class XCcdFeatureConfig {

    @XmlElement(required = true)
    protected String ccdParamName;
    @XmlElement(required = true)
    protected String ccdParamValue;

    /**
     * Gets the value of the ccdParamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcdParamName() {
        return ccdParamName;
    }

    /**
     * Sets the value of the ccdParamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcdParamName(String value) {
        this.ccdParamName = value;
    }

    /**
     * Gets the value of the ccdParamValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcdParamValue() {
        return ccdParamValue;
    }

    /**
     * Sets the value of the ccdParamValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcdParamValue(String value) {
        this.ccdParamValue = value;
    }

}
