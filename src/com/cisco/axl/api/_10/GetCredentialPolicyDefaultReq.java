
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCredentialPolicyDefaultReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCredentialPolicyDefaultReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="credentialUser" type="{http://www.cisco.com/AXL/API/10.5}XCredentialUser"/>
 *             &lt;element name="credentialType" type="{http://www.cisco.com/AXL/API/10.5}XCredential"/>
 *             &lt;element name="credPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/10.5}RCredentialPolicyDefault" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCredentialPolicyDefaultReq", propOrder = {
    "credentialUser",
    "credentialType",
    "credPolicyName",
    "returnedTags"
})
public class GetCredentialPolicyDefaultReq {

    protected String credentialUser;
    protected String credentialType;
    protected XFkType credPolicyName;
    protected RCredentialPolicyDefault returnedTags;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link RCredentialPolicyDefault }
     *     
     */
    public RCredentialPolicyDefault getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCredentialPolicyDefault }
     *     
     */
    public void setReturnedTags(RCredentialPolicyDefault value) {
        this.returnedTags = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
