
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XServiceProfileList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XServiceProfileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tertiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverCertificateVerification" type="{http://www.cisco.com/AXL/API/10.5}XCertificateVerificationLevel" minOccurs="0"/>
 *         &lt;element name="serviceProfileXml" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XServiceProfileList", propOrder = {
    "profileName",
    "primary",
    "secondary",
    "tertiary",
    "serverCertificateVerification",
    "serviceProfileXml"
})
public class XServiceProfileList {

    protected String profileName;
    @XmlElementRef(name = "primary", type = JAXBElement.class)
    protected JAXBElement<String> primary;
    @XmlElementRef(name = "secondary", type = JAXBElement.class)
    protected JAXBElement<String> secondary;
    @XmlElementRef(name = "tertiary", type = JAXBElement.class)
    protected JAXBElement<String> tertiary;
    @XmlElementRef(name = "serverCertificateVerification", type = JAXBElement.class)
    protected JAXBElement<String> serverCertificateVerification;
    protected XVendorConfig serviceProfileXml;

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimary(JAXBElement<String> value) {
        this.primary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondary(JAXBElement<String> value) {
        this.secondary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tertiary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTertiary() {
        return tertiary;
    }

    /**
     * Sets the value of the tertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTertiary(JAXBElement<String> value) {
        this.tertiary = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serverCertificateVerification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerCertificateVerification() {
        return serverCertificateVerification;
    }

    /**
     * Sets the value of the serverCertificateVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerCertificateVerification(JAXBElement<String> value) {
        this.serverCertificateVerification = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serviceProfileXml property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getServiceProfileXml() {
        return serviceProfileXml;
    }

    /**
     * Sets the value of the serviceProfileXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setServiceProfileXml(XVendorConfig value) {
        this.serviceProfileXml = value;
    }

}
