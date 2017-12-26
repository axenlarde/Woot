
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLicensedUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLicensedUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snrEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLicensedUser", propOrder = {
    "userId",
    "firstName",
    "lastName",
    "snrEnabled",
    "emEnabled",
    "deviceCount",
    "licenseType",
    "licenseUsed"
})
public class XLicensedUser {

    @XmlElementRef(name = "userId", type = JAXBElement.class)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "firstName", type = JAXBElement.class)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "lastName", type = JAXBElement.class)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "snrEnabled", type = JAXBElement.class)
    protected JAXBElement<String> snrEnabled;
    @XmlElementRef(name = "emEnabled", type = JAXBElement.class)
    protected JAXBElement<String> emEnabled;
    @XmlElementRef(name = "deviceCount", type = JAXBElement.class)
    protected JAXBElement<String> deviceCount;
    @XmlElementRef(name = "licenseType", type = JAXBElement.class)
    protected JAXBElement<String> licenseType;
    @XmlElementRef(name = "licenseUsed", type = JAXBElement.class)
    protected JAXBElement<String> licenseUsed;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the snrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSnrEnabled() {
        return snrEnabled;
    }

    /**
     * Sets the value of the snrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSnrEnabled(JAXBElement<String> value) {
        this.snrEnabled = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmEnabled() {
        return emEnabled;
    }

    /**
     * Sets the value of the emEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmEnabled(JAXBElement<String> value) {
        this.emEnabled = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceCount() {
        return deviceCount;
    }

    /**
     * Sets the value of the deviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceCount(JAXBElement<String> value) {
        this.deviceCount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseType(JAXBElement<String> value) {
        this.licenseType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the licenseUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseUsed() {
        return licenseUsed;
    }

    /**
     * Sets the value of the licenseUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseUsed(JAXBElement<String> value) {
        this.licenseUsed = ((JAXBElement<String> ) value);
    }

}
