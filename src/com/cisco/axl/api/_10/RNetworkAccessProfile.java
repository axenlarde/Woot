
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RNetworkAccessProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RNetworkAccessProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}UniqueString128" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="vpnRequired" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="proxySettings" type="{http://www.cisco.com/AXL/API/10.5}XHTTPProxy" minOccurs="0"/>
 *         &lt;element name="proxyHostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyPort" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="proxyRequiresAuthentication" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="provideSharedCredentials" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RNetworkAccessProfile", propOrder = {
    "name",
    "description",
    "vpnRequired",
    "proxySettings",
    "proxyHostname",
    "proxyPort",
    "proxyRequiresAuthentication",
    "provideSharedCredentials",
    "username",
    "password"
})
public class RNetworkAccessProfile {

    protected String name;
    protected String description;
    protected String vpnRequired;
    protected String proxySettings;
    protected String proxyHostname;
    protected String proxyPort;
    protected String proxyRequiresAuthentication;
    protected String provideSharedCredentials;
    protected String username;
    protected String password;
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
     * Gets the value of the vpnRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnRequired() {
        return vpnRequired;
    }

    /**
     * Sets the value of the vpnRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnRequired(String value) {
        this.vpnRequired = value;
    }

    /**
     * Gets the value of the proxySettings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxySettings() {
        return proxySettings;
    }

    /**
     * Sets the value of the proxySettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxySettings(String value) {
        this.proxySettings = value;
    }

    /**
     * Gets the value of the proxyHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyHostname() {
        return proxyHostname;
    }

    /**
     * Sets the value of the proxyHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyHostname(String value) {
        this.proxyHostname = value;
    }

    /**
     * Gets the value of the proxyPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * Sets the value of the proxyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPort(String value) {
        this.proxyPort = value;
    }

    /**
     * Gets the value of the proxyRequiresAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyRequiresAuthentication() {
        return proxyRequiresAuthentication;
    }

    /**
     * Sets the value of the proxyRequiresAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyRequiresAuthentication(String value) {
        this.proxyRequiresAuthentication = value;
    }

    /**
     * Gets the value of the provideSharedCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideSharedCredentials() {
        return provideSharedCredentials;
    }

    /**
     * Sets the value of the provideSharedCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideSharedCredentials(String value) {
        this.provideSharedCredentials = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
