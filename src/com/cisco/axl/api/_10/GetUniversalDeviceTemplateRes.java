
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUniversalDeviceTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUniversalDeviceTemplateRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/10.5}RUniversalDeviceTemplate"/>
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
@XmlType(name = "GetUniversalDeviceTemplateRes", propOrder = {
    "_return"
})
public class GetUniversalDeviceTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUniversalDeviceTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUniversalDeviceTemplateRes.Return }
     *     
     */
    public GetUniversalDeviceTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUniversalDeviceTemplateRes.Return }
     *     
     */
    public void setReturn(GetUniversalDeviceTemplateRes.Return value) {
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
     *         &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/10.5}RUniversalDeviceTemplate"/>
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
        "universalDeviceTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUniversalDeviceTemplate universalDeviceTemplate;

        /**
         * Gets the value of the universalDeviceTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RUniversalDeviceTemplate }
         *     
         */
        public RUniversalDeviceTemplate getUniversalDeviceTemplate() {
            return universalDeviceTemplate;
        }

        /**
         * Sets the value of the universalDeviceTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUniversalDeviceTemplate }
         *     
         */
        public void setUniversalDeviceTemplate(RUniversalDeviceTemplate value) {
            this.universalDeviceTemplate = value;
        }

    }

}
