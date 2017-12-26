
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateRoutePartitionsForLearnedPatternsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRoutePartitionsForLearnedPatternsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="partitionForEnterpriseANo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partitionForE164ANo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partitionForEnterprisePatterns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partitionForE164Pattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="markLearnedEntAltNumbers" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="markLearnedE164AltNumbers" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="markFixedLengthEntPatterns" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="markVariableLengthEntPatterns" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="markFixedLengthE164Patterns" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *         &lt;element name="markVariableLengthE164Patterns" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRoutePartitionsForLearnedPatternsReq", propOrder = {
    "partitionForEnterpriseANo",
    "partitionForE164ANo",
    "partitionForEnterprisePatterns",
    "partitionForE164Pattern",
    "markLearnedEntAltNumbers",
    "markLearnedE164AltNumbers",
    "markFixedLengthEntPatterns",
    "markVariableLengthEntPatterns",
    "markFixedLengthE164Patterns",
    "markVariableLengthE164Patterns"
})
public class UpdateRoutePartitionsForLearnedPatternsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String partitionForEnterpriseANo;
    @XmlElement(required = true)
    protected String partitionForE164ANo;
    @XmlElement(required = true)
    protected String partitionForEnterprisePatterns;
    @XmlElement(required = true)
    protected String partitionForE164Pattern;
    @XmlElement(required = true)
    protected String markLearnedEntAltNumbers;
    @XmlElement(required = true)
    protected String markLearnedE164AltNumbers;
    @XmlElement(required = true)
    protected String markFixedLengthEntPatterns;
    @XmlElement(required = true)
    protected String markVariableLengthEntPatterns;
    @XmlElement(required = true)
    protected String markFixedLengthE164Patterns;
    @XmlElement(required = true)
    protected String markVariableLengthE164Patterns;

    /**
     * Gets the value of the partitionForEnterpriseANo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionForEnterpriseANo() {
        return partitionForEnterpriseANo;
    }

    /**
     * Sets the value of the partitionForEnterpriseANo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionForEnterpriseANo(String value) {
        this.partitionForEnterpriseANo = value;
    }

    /**
     * Gets the value of the partitionForE164ANo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionForE164ANo() {
        return partitionForE164ANo;
    }

    /**
     * Sets the value of the partitionForE164ANo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionForE164ANo(String value) {
        this.partitionForE164ANo = value;
    }

    /**
     * Gets the value of the partitionForEnterprisePatterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionForEnterprisePatterns() {
        return partitionForEnterprisePatterns;
    }

    /**
     * Sets the value of the partitionForEnterprisePatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionForEnterprisePatterns(String value) {
        this.partitionForEnterprisePatterns = value;
    }

    /**
     * Gets the value of the partitionForE164Pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionForE164Pattern() {
        return partitionForE164Pattern;
    }

    /**
     * Sets the value of the partitionForE164Pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionForE164Pattern(String value) {
        this.partitionForE164Pattern = value;
    }

    /**
     * Gets the value of the markLearnedEntAltNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkLearnedEntAltNumbers() {
        return markLearnedEntAltNumbers;
    }

    /**
     * Sets the value of the markLearnedEntAltNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkLearnedEntAltNumbers(String value) {
        this.markLearnedEntAltNumbers = value;
    }

    /**
     * Gets the value of the markLearnedE164AltNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkLearnedE164AltNumbers() {
        return markLearnedE164AltNumbers;
    }

    /**
     * Sets the value of the markLearnedE164AltNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkLearnedE164AltNumbers(String value) {
        this.markLearnedE164AltNumbers = value;
    }

    /**
     * Gets the value of the markFixedLengthEntPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkFixedLengthEntPatterns() {
        return markFixedLengthEntPatterns;
    }

    /**
     * Sets the value of the markFixedLengthEntPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkFixedLengthEntPatterns(String value) {
        this.markFixedLengthEntPatterns = value;
    }

    /**
     * Gets the value of the markVariableLengthEntPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkVariableLengthEntPatterns() {
        return markVariableLengthEntPatterns;
    }

    /**
     * Sets the value of the markVariableLengthEntPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkVariableLengthEntPatterns(String value) {
        this.markVariableLengthEntPatterns = value;
    }

    /**
     * Gets the value of the markFixedLengthE164Patterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkFixedLengthE164Patterns() {
        return markFixedLengthE164Patterns;
    }

    /**
     * Sets the value of the markFixedLengthE164Patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkFixedLengthE164Patterns(String value) {
        this.markFixedLengthE164Patterns = value;
    }

    /**
     * Gets the value of the markVariableLengthE164Patterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkVariableLengthE164Patterns() {
        return markVariableLengthE164Patterns;
    }

    /**
     * Sets the value of the markVariableLengthE164Patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkVariableLengthE164Patterns(String value) {
        this.markVariableLengthE164Patterns = value;
    }

}
