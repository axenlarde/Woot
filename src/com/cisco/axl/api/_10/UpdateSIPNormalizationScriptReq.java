
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSIPNormalizationScriptReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSIPNormalizationScriptReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scriptExecutionErrorRecoveryAction" type="{http://www.cisco.com/AXL/API/10.5}XSIPScriptErrorHandling" minOccurs="0"/>
 *         &lt;element name="systemResourceErrorRecoveryAction" type="{http://www.cisco.com/AXL/API/10.5}XSIPScriptErrorHandling" minOccurs="0"/>
 *         &lt;element name="maxMemoryThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxLuaInstructionsThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSIPNormalizationScriptReq", propOrder = {
    "newName",
    "description",
    "content",
    "scriptExecutionErrorRecoveryAction",
    "systemResourceErrorRecoveryAction",
    "maxMemoryThreshold",
    "maxLuaInstructionsThreshold"
})
public class UpdateSIPNormalizationScriptReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected String content;
    @XmlElement(defaultValue = "Message Rollback Only")
    protected String scriptExecutionErrorRecoveryAction;
    @XmlElement(defaultValue = "Disable Script")
    protected String systemResourceErrorRecoveryAction;
    @XmlElement(defaultValue = "50")
    protected String maxMemoryThreshold;
    @XmlElement(defaultValue = "1000")
    protected String maxLuaInstructionsThreshold;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
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

}
