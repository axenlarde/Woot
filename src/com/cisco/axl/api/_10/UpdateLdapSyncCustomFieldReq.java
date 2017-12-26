
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLdapSyncCustomFieldReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLdapSyncCustomFieldReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID"/>
 *           &lt;sequence>
 *             &lt;element name="ldapConfigurationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="customUserField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="ldapUserField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLdapSyncCustomFieldReq", propOrder = {
    "uuid",
    "ldapConfigurationName",
    "customUserField",
    "ldapUserField"
})
public class UpdateLdapSyncCustomFieldReq
    extends APIRequest
{

    protected String uuid;
    protected String ldapConfigurationName;
    protected String customUserField;
    protected String ldapUserField;

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
     * Gets the value of the ldapConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapConfigurationName() {
        return ldapConfigurationName;
    }

    /**
     * Sets the value of the ldapConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapConfigurationName(String value) {
        this.ldapConfigurationName = value;
    }

    /**
     * Gets the value of the customUserField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomUserField() {
        return customUserField;
    }

    /**
     * Sets the value of the customUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomUserField(String value) {
        this.customUserField = value;
    }

    /**
     * Gets the value of the ldapUserField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapUserField() {
        return ldapUserField;
    }

    /**
     * Sets the value of the ldapUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapUserField(String value) {
        this.ldapUserField = value;
    }

}
