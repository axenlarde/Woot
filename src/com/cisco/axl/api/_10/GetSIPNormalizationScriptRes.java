
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSIPNormalizationScriptRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSIPNormalizationScriptRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sIPNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}RSIPNormalizationScript"/>
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
@XmlType(name = "GetSIPNormalizationScriptRes", propOrder = {
    "_return"
})
public class GetSIPNormalizationScriptRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSIPNormalizationScriptRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSIPNormalizationScriptRes.Return }
     *     
     */
    public GetSIPNormalizationScriptRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSIPNormalizationScriptRes.Return }
     *     
     */
    public void setReturn(GetSIPNormalizationScriptRes.Return value) {
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
     *         &lt;element name="sIPNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}RSIPNormalizationScript"/>
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
        "sipNormalizationScript"
    })
    public static class Return {

        @XmlElement(name = "sIPNormalizationScript", required = true)
        protected RSIPNormalizationScript sipNormalizationScript;

        /**
         * Gets the value of the sipNormalizationScript property.
         * 
         * @return
         *     possible object is
         *     {@link RSIPNormalizationScript }
         *     
         */
        public RSIPNormalizationScript getSIPNormalizationScript() {
            return sipNormalizationScript;
        }

        /**
         * Sets the value of the sipNormalizationScript property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSIPNormalizationScript }
         *     
         */
        public void setSIPNormalizationScript(RSIPNormalizationScript value) {
            this.sipNormalizationScript = value;
        }

    }

}
