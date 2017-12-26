
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetVohServerRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVohServerRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vohServer" type="{http://www.cisco.com/AXL/API/10.5}RVohServer"/>
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
@XmlType(name = "GetVohServerRes", propOrder = {
    "_return"
})
public class GetVohServerRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetVohServerRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVohServerRes.Return }
     *     
     */
    public GetVohServerRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVohServerRes.Return }
     *     
     */
    public void setReturn(GetVohServerRes.Return value) {
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
     *         &lt;element name="vohServer" type="{http://www.cisco.com/AXL/API/10.5}RVohServer"/>
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
        "vohServer"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RVohServer vohServer;

        /**
         * Gets the value of the vohServer property.
         * 
         * @return
         *     possible object is
         *     {@link RVohServer }
         *     
         */
        public RVohServer getVohServer() {
            return vohServer;
        }

        /**
         * Sets the value of the vohServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link RVohServer }
         *     
         */
        public void setVohServer(RVohServer value) {
            this.vohServer = value;
        }

    }

}
