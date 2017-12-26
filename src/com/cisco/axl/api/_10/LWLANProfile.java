
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LWLANProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LWLANProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequencyBand" type="{http://www.cisco.com/AXL/API/10.5}XWiFiFrequency" minOccurs="0"/>
 *         &lt;element name="userModifiable" type="{http://www.cisco.com/AXL/API/10.5}XWLANProfileChanges" minOccurs="0"/>
 *         &lt;element name="authMethod" type="{http://www.cisco.com/AXL/API/10.5}XWiFiAuthenticationMethod" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pskPassphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wepKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
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
@XmlType(name = "LWLANProfile", propOrder = {
    "name",
    "description",
    "ssid",
    "frequencyBand",
    "userModifiable",
    "authMethod",
    "userName",
    "password",
    "pskPassphrase",
    "wepKey",
    "passwordDescription",
    "networkAccessProfile"
})
public class LWLANProfile {

    protected String name;
    protected String description;
    protected String ssid;
    protected String frequencyBand;
    protected String userModifiable;
    protected String authMethod;
    protected String userName;
    protected String password;
    protected String pskPassphrase;
    protected String wepKey;
    protected String passwordDescription;
    protected XFkType networkAccessProfile;
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
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsid(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the frequencyBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyBand() {
        return frequencyBand;
    }

    /**
     * Sets the value of the frequencyBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyBand(String value) {
        this.frequencyBand = value;
    }

    /**
     * Gets the value of the userModifiable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserModifiable() {
        return userModifiable;
    }

    /**
     * Sets the value of the userModifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserModifiable(String value) {
        this.userModifiable = value;
    }

    /**
     * Gets the value of the authMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthMethod() {
        return authMethod;
    }

    /**
     * Sets the value of the authMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthMethod(String value) {
        this.authMethod = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the pskPassphrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPskPassphrase() {
        return pskPassphrase;
    }

    /**
     * Sets the value of the pskPassphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPskPassphrase(String value) {
        this.pskPassphrase = value;
    }

    /**
     * Gets the value of the wepKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWepKey() {
        return wepKey;
    }

    /**
     * Sets the value of the wepKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWepKey(String value) {
        this.wepKey = value;
    }

    /**
     * Gets the value of the passwordDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordDescription() {
        return passwordDescription;
    }

    /**
     * Sets the value of the passwordDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordDescription(String value) {
        this.passwordDescription = value;
    }

    /**
     * Gets the value of the networkAccessProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNetworkAccessProfile() {
        return networkAccessProfile;
    }

    /**
     * Sets the value of the networkAccessProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNetworkAccessProfile(XFkType value) {
        this.networkAccessProfile = value;
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
