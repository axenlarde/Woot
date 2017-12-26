
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCredentialPolicyDefaultRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCredentialPolicyDefaultRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="credentialPolicyDefault" type="{http://www.cisco.com/AXL/API/10.5}RCredentialPolicyDefault"/>
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
@XmlType(name = "GetCredentialPolicyDefaultRes", propOrder = {
    "_return"
})
public class GetCredentialPolicyDefaultRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCredentialPolicyDefaultRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCredentialPolicyDefaultRes.Return }
     *     
     */
    public GetCredentialPolicyDefaultRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCredentialPolicyDefaultRes.Return }
     *     
     */
    public void setReturn(GetCredentialPolicyDefaultRes.Return value) {
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
     *         &lt;element name="credentialPolicyDefault" type="{http://www.cisco.com/AXL/API/10.5}RCredentialPolicyDefault"/>
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
        "credentialPolicyDefault"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RCredentialPolicyDefault credentialPolicyDefault;

        /**
         * Gets the value of the credentialPolicyDefault property.
         * 
         * @return
         *     possible object is
         *     {@link RCredentialPolicyDefault }
         *     
         */
        public RCredentialPolicyDefault getCredentialPolicyDefault() {
            return credentialPolicyDefault;
        }

        /**
         * Sets the value of the credentialPolicyDefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link RCredentialPolicyDefault }
         *     
         */
        public void setCredentialPolicyDefault(RCredentialPolicyDefault value) {
            this.credentialPolicyDefault = value;
        }

    }

}
