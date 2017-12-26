
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBillingServerReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBillingServerReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resendOnFailure" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="billingServerProtocol" type="{http://www.cisco.com/AXL/API/10.5}XBillingserverprotocol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBillingServerReq", propOrder = {
    "uuid",
    "userId",
    "password",
    "resendOnFailure",
    "billingServerProtocol"
})
public class UpdateBillingServerReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String uuid;
    protected String userId;
    protected String password;
    @XmlElement(defaultValue = "true")
    protected String resendOnFailure;
    @XmlElement(defaultValue = "SFTP")
    protected String billingServerProtocol;

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

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
     * Gets the value of the resendOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResendOnFailure() {
        return resendOnFailure;
    }

    /**
     * Sets the value of the resendOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResendOnFailure(String value) {
        this.resendOnFailure = value;
    }

    /**
     * Gets the value of the billingServerProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingServerProtocol() {
        return billingServerProtocol;
    }

    /**
     * Sets the value of the billingServerProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingServerProtocol(String value) {
        this.billingServerProtocol = value;
    }

}
