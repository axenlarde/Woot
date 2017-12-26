
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUcServiceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUcServiceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ucService" type="{http://www.cisco.com/AXL/API/10.5}RUcService"/>
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
@XmlType(name = "GetUcServiceRes", propOrder = {
    "_return"
})
public class GetUcServiceRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUcServiceRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUcServiceRes.Return }
     *     
     */
    public GetUcServiceRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUcServiceRes.Return }
     *     
     */
    public void setReturn(GetUcServiceRes.Return value) {
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
     *         &lt;element name="ucService" type="{http://www.cisco.com/AXL/API/10.5}RUcService"/>
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
        "ucService"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUcService ucService;

        /**
         * Gets the value of the ucService property.
         * 
         * @return
         *     possible object is
         *     {@link RUcService }
         *     
         */
        public RUcService getUcService() {
            return ucService;
        }

        /**
         * Sets the value of the ucService property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUcService }
         *     
         */
        public void setUcService(RUcService value) {
            this.ucService = value;
        }

    }

}
