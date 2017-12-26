
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCredentialPolicyDefault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCredentialPolicyDefault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="credentialUser" type="{http://www.cisco.com/AXL/API/10.5}XCredentialUser" minOccurs="0"/>
 *         &lt;element name="credentialType" type="{http://www.cisco.com/AXL/API/10.5}XCredential" minOccurs="0"/>
 *         &lt;element name="credPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="credentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="credUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="credDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCredentialPolicyDefault", propOrder = {
    "credentialUser",
    "credentialType",
    "credPolicyName",
    "credentials",
    "confirmCredentials",
    "credUserCantChange",
    "credUserMustChange",
    "credDoesNotExpire"
})
public class RCredentialPolicyDefault {

    protected String credentialUser;
    protected String credentialType;
    protected XFkType credPolicyName;
    protected String credentials;
    protected String confirmCredentials;
    protected String credUserCantChange;
    protected String credUserMustChange;
    protected String credDoesNotExpire;

    /**
     * Gets the value of the credentialUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialUser() {
        return credentialUser;
    }

    /**
     * Sets the value of the credentialUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialUser(String value) {
        this.credentialUser = value;
    }

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialType(String value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the credPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCredPolicyName() {
        return credPolicyName;
    }

    /**
     * Sets the value of the credPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCredPolicyName(XFkType value) {
        this.credPolicyName = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentials(String value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the confirmCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmCredentials() {
        return confirmCredentials;
    }

    /**
     * Sets the value of the confirmCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmCredentials(String value) {
        this.confirmCredentials = value;
    }

    /**
     * Gets the value of the credUserCantChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredUserCantChange() {
        return credUserCantChange;
    }

    /**
     * Sets the value of the credUserCantChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredUserCantChange(String value) {
        this.credUserCantChange = value;
    }

    /**
     * Gets the value of the credUserMustChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredUserMustChange() {
        return credUserMustChange;
    }

    /**
     * Sets the value of the credUserMustChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredUserMustChange(String value) {
        this.credUserMustChange = value;
    }

    /**
     * Gets the value of the credDoesNotExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredDoesNotExpire() {
        return credDoesNotExpire;
    }

    /**
     * Sets the value of the credDoesNotExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredDoesNotExpire(String value) {
        this.credDoesNotExpire = value;
    }

}
