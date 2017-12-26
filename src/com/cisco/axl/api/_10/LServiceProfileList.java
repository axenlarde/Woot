
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LServiceProfileList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LServiceProfileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tertiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverCertificateVerification" type="{http://www.cisco.com/AXL/API/10.5}XCertificateVerificationLevel" minOccurs="0"/>
 *         &lt;element name="serviceProfileXml" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
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
@XmlType(name = "LServiceProfileList", propOrder = {
    "profileName",
    "primary",
    "secondary",
    "tertiary",
    "serverCertificateVerification",
    "serviceProfileXml"
})
public class LServiceProfileList {

    protected String profileName;
    protected String primary;
    protected String secondary;
    protected String tertiary;
    protected String serverCertificateVerification;
    protected XVendorConfig serviceProfileXml;
    @XmlAttribute
    protected String uuid;

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
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }

    /**
     * Gets the value of the tertiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiary() {
        return tertiary;
    }

    /**
     * Sets the value of the tertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiary(String value) {
        this.tertiary = value;
    }

    /**
     * Gets the value of the serverCertificateVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerCertificateVerification() {
        return serverCertificateVerification;
    }

    /**
     * Sets the value of the serverCertificateVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerCertificateVerification(String value) {
        this.serverCertificateVerification = value;
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
