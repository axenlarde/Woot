
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LSIPNormalizationScript complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LSIPNormalizationScript">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scriptExecutionErrorRecoveryAction" type="{http://www.cisco.com/AXL/API/10.5}XSIPScriptErrorHandling" minOccurs="0"/>
 *         &lt;element name="systemResourceErrorRecoveryAction" type="{http://www.cisco.com/AXL/API/10.5}XSIPScriptErrorHandling" minOccurs="0"/>
 *         &lt;element name="maxMemoryThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxLuaInstructionsThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isStandard" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
@XmlType(name = "LSIPNormalizationScript", propOrder = {
    "name",
    "description",
    "scriptExecutionErrorRecoveryAction",
    "systemResourceErrorRecoveryAction",
    "maxMemoryThreshold",
    "maxLuaInstructionsThreshold",
    "isStandard"
})
public class LSIPNormalizationScript {

    protected String name;
    protected String description;
    protected String scriptExecutionErrorRecoveryAction;
    protected String systemResourceErrorRecoveryAction;
    protected String maxMemoryThreshold;
    protected String maxLuaInstructionsThreshold;
    protected String isStandard;
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
     * Gets the value of the scriptExecutionErrorRecoveryAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptExecutionErrorRecoveryAction() {
        return scriptExecutionErrorRecoveryAction;
    }

    /**
     * Sets the value of the scriptExecutionErrorRecoveryAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptExecutionErrorRecoveryAction(String value) {
        this.scriptExecutionErrorRecoveryAction = value;
    }

    /**
     * Gets the value of the systemResourceErrorRecoveryAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemResourceErrorRecoveryAction() {
        return systemResourceErrorRecoveryAction;
    }

    /**
     * Sets the value of the systemResourceErrorRecoveryAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemResourceErrorRecoveryAction(String value) {
        this.systemResourceErrorRecoveryAction = value;
    }

    /**
     * Gets the value of the maxMemoryThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMemoryThreshold() {
        return maxMemoryThreshold;
    }

    /**
     * Sets the value of the maxMemoryThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxMemoryThreshold(String value) {
        this.maxMemoryThreshold = value;
    }

    /**
     * Gets the value of the maxLuaInstructionsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLuaInstructionsThreshold() {
        return maxLuaInstructionsThreshold;
    }

    /**
     * Sets the value of the maxLuaInstructionsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLuaInstructionsThreshold(String value) {
        this.maxLuaInstructionsThreshold = value;
    }

    /**
     * Gets the value of the isStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandard() {
        return isStandard;
    }

    /**
     * Sets the value of the isStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandard(String value) {
        this.isStandard = value;
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
