
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUniversalLineTemplateRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUniversalLineTemplateRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/10.5}RUniversalLineTemplate"/>
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
@XmlType(name = "GetUniversalLineTemplateRes", propOrder = {
    "_return"
})
public class GetUniversalLineTemplateRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUniversalLineTemplateRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUniversalLineTemplateRes.Return }
     *     
     */
    public GetUniversalLineTemplateRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUniversalLineTemplateRes.Return }
     *     
     */
    public void setReturn(GetUniversalLineTemplateRes.Return value) {
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
     *         &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/10.5}RUniversalLineTemplate"/>
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
        "universalLineTemplate"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUniversalLineTemplate universalLineTemplate;

        /**
         * Gets the value of the universalLineTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link RUniversalLineTemplate }
         *     
         */
        public RUniversalLineTemplate getUniversalLineTemplate() {
            return universalLineTemplate;
        }

        /**
         * Sets the value of the universalLineTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUniversalLineTemplate }
         *     
         */
        public void setUniversalLineTemplate(RUniversalLineTemplate value) {
            this.universalLineTemplate = value;
        }

    }

}
