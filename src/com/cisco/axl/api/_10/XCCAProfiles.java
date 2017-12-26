
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCCAProfiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCCAProfiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ccaId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primarySoftSwitchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondarySoftSwitchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sipAliasSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sipUserNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCCAProfiles", propOrder = {
    "ccaId",
    "primarySoftSwitchId",
    "secondarySoftSwitchId",
    "objectClass",
    "subscriberType",
    "sipAliasSuffix",
    "sipUserNameSuffix"
})
public class XCCAProfiles {

    protected String ccaId;
    protected String primarySoftSwitchId;
    @XmlElementRef(name = "secondarySoftSwitchId", type = JAXBElement.class)
    protected JAXBElement<String> secondarySoftSwitchId;
    protected String objectClass;
    @XmlElementRef(name = "subscriberType", type = JAXBElement.class)
    protected JAXBElement<String> subscriberType;
    @XmlElementRef(name = "sipAliasSuffix", type = JAXBElement.class)
    protected JAXBElement<String> sipAliasSuffix;
    @XmlElementRef(name = "sipUserNameSuffix", type = JAXBElement.class)
    protected JAXBElement<String> sipUserNameSuffix;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondarySoftSwitchId() {
        return secondarySoftSwitchId;
    }

    /**
     * Sets the value of the secondarySoftSwitchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondarySoftSwitchId(JAXBElement<String> value) {
        this.secondarySoftSwitchId = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberType(JAXBElement<String> value) {
        this.subscriberType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sipAliasSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSipAliasSuffix() {
        return sipAliasSuffix;
    }

    /**
     * Sets the value of the sipAliasSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSipAliasSuffix(JAXBElement<String> value) {
        this.sipAliasSuffix = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sipUserNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSipUserNameSuffix() {
        return sipUserNameSuffix;
    }

    /**
     * Sets the value of the sipUserNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSipUserNameSuffix(JAXBElement<String> value) {
        this.sipUserNameSuffix = ((JAXBElement<String> ) value);
    }

}
