
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWlanProfileGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWlanProfileGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wlanProfileGroup" type="{http://www.cisco.com/AXL/API/10.5}RWlanProfileGroup"/>
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
@XmlType(name = "GetWlanProfileGroupRes", propOrder = {
    "_return"
})
public class GetWlanProfileGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetWlanProfileGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetWlanProfileGroupRes.Return }
     *     
     */
    public GetWlanProfileGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWlanProfileGroupRes.Return }
     *     
     */
    public void setReturn(GetWlanProfileGroupRes.Return value) {
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
     *         &lt;element name="wlanProfileGroup" type="{http://www.cisco.com/AXL/API/10.5}RWlanProfileGroup"/>
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
        "wlanProfileGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RWlanProfileGroup wlanProfileGroup;

        /**
         * Gets the value of the wlanProfileGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RWlanProfileGroup }
         *     
         */
        public RWlanProfileGroup getWlanProfileGroup() {
            return wlanProfileGroup;
        }

        /**
         * Sets the value of the wlanProfileGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RWlanProfileGroup }
         *     
         */
        public void setWlanProfileGroup(RWlanProfileGroup value) {
            this.wlanProfileGroup = value;
        }

    }

}
