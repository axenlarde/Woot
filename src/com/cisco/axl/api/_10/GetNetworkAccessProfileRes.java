
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNetworkAccessProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNetworkAccessProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/10.5}RNetworkAccessProfile"/>
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
@XmlType(name = "GetNetworkAccessProfileRes", propOrder = {
    "_return"
})
public class GetNetworkAccessProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetNetworkAccessProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetNetworkAccessProfileRes.Return }
     *     
     */
    public GetNetworkAccessProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNetworkAccessProfileRes.Return }
     *     
     */
    public void setReturn(GetNetworkAccessProfileRes.Return value) {
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
     *         &lt;element name="networkAccessProfile" type="{http://www.cisco.com/AXL/API/10.5}RNetworkAccessProfile"/>
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
        "networkAccessProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RNetworkAccessProfile networkAccessProfile;

        /**
         * Gets the value of the networkAccessProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RNetworkAccessProfile }
         *     
         */
        public RNetworkAccessProfile getNetworkAccessProfile() {
            return networkAccessProfile;
        }

        /**
         * Sets the value of the networkAccessProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RNetworkAccessProfile }
         *     
         */
        public void setNetworkAccessProfile(RNetworkAccessProfile value) {
            this.networkAccessProfile = value;
        }

    }

}
