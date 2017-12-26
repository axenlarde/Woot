
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLdapSyncCustomFieldRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLdapSyncCustomFieldRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapSyncCustomField" type="{http://www.cisco.com/AXL/API/10.5}RLdapSyncCustomField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLdapSyncCustomFieldRes", propOrder = {
    "_return"
})
public class GetLdapSyncCustomFieldRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLdapSyncCustomFieldRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLdapSyncCustomFieldRes.Return }
     *     
     */
    public GetLdapSyncCustomFieldRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLdapSyncCustomFieldRes.Return }
     *     
     */
    public void setReturn(GetLdapSyncCustomFieldRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ldapSyncCustomField" type="{http://www.cisco.com/AXL/API/10.5}RLdapSyncCustomField"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ldapSyncCustomField"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLdapSyncCustomField ldapSyncCustomField;

        /**
         * Gets the value of the ldapSyncCustomField property.
         * 
         * @return
         *     possible object is
         *     {@link RLdapSyncCustomField }
         *     
         */
        public RLdapSyncCustomField getLdapSyncCustomField() {
            return ldapSyncCustomField;
        }

        /**
         * Sets the value of the ldapSyncCustomField property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLdapSyncCustomField }
         *     
         */
        public void setLdapSyncCustomField(RLdapSyncCustomField value) {
            this.ldapSyncCustomField = value;
        }

    }

}
