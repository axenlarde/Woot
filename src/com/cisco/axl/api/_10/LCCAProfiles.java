
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCCAProfiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCCAProfiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ccaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primarySoftSwitchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondarySoftSwitchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sipAliasSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sipUserNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LCCAProfiles", propOrder = {
    "ccaId",
    "primarySoftSwitchId",
    "secondarySoftSwitchId",
    "objectClass",
    "subscriberType",
    "sipAliasSuffix",
    "sipUserNameSuffix"
})
public class LCCAProfiles {

    protected String ccaId;
    protected String primarySoftSwitchId;
    protected String secondarySoftSwitchId;
    protected String objectClass;
    protected String subscriberType;
    protected String sipAliasSuffix;
    protected String sipUserNameSuffix;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the ccaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcaId() {
        return ccaId;
    }

    /**
     * Sets the value of the ccaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcaId(String value) {
        this.ccaId = value;
    }

    /**
     * Gets the value of the primarySoftSwitchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySoftSwitchId() {
        return primarySoftSwitchId;
    }

    /**
     * Sets the value of the primarySoftSwitchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySoftSwitchId(String value) {
        this.primarySoftSwitchId = value;
    }

    /**
     * Gets the value of the secondarySoftSwitchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySoftSwitchId() {
        return secondarySoftSwitchId;
    }

    /**
     * Sets the value of the secondarySoftSwitchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySoftSwitchId(String value) {
        this.secondarySoftSwitchId = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectClass(String value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the subscriberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberType(String value) {
        this.subscriberType = value;
    }

    /**
     * Gets the value of the sipAliasSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipAliasSuffix() {
        return sipAliasSuffix;
    }

    /**
     * Sets the value of the sipAliasSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipAliasSuffix(String value) {
        this.sipAliasSuffix = value;
    }

    /**
     * Gets the value of the sipUserNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipUserNameSuffix() {
        return sipUserNameSuffix;
    }

    /**
     * Sets the value of the sipUserNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipUserNameSuffix(String value) {
        this.sipUserNameSuffix = value;
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
