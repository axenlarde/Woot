
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBillingServerRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBillingServerRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="billingServer" type="{http://www.cisco.com/AXL/API/10.5}RBillingServer"/>
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
@XmlType(name = "GetBillingServerRes", propOrder = {
    "_return"
})
public class GetBillingServerRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetBillingServerRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetBillingServerRes.Return }
     *     
     */
    public GetBillingServerRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBillingServerRes.Return }
     *     
     */
    public void setReturn(GetBillingServerRes.Return value) {
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
     *         &lt;element name="billingServer" type="{http://www.cisco.com/AXL/API/10.5}RBillingServer"/>
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
        "billingServer"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RBillingServer billingServer;

        /**
         * Gets the value of the billingServer property.
         * 
         * @return
         *     possible object is
         *     {@link RBillingServer }
         *     
         */
        public RBillingServer getBillingServer() {
            return billingServer;
        }

        /**
         * Sets the value of the billingServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link RBillingServer }
         *     
         */
        public void setBillingServer(RBillingServer value) {
            this.billingServer = value;
        }

    }

}
