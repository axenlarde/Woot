
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCcdFeatureConfigRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCcdFeatureConfigRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ccdFeatureConfig" type="{http://www.cisco.com/AXL/API/10.5}XCcdFeatureConfig"/>
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
@XmlType(name = "GetCcdFeatureConfigRes", propOrder = {
    "_return"
})
public class GetCcdFeatureConfigRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetCcdFeatureConfigRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCcdFeatureConfigRes.Return }
     *     
     */
    public GetCcdFeatureConfigRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCcdFeatureConfigRes.Return }
     *     
     */
    public void setReturn(GetCcdFeatureConfigRes.Return value) {
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
     *         &lt;element name="ccdFeatureConfig" type="{http://www.cisco.com/AXL/API/10.5}XCcdFeatureConfig"/>
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
        "ccdFeatureConfig"
    })
    public static class Return {

        @XmlElement(required = true)
        protected XCcdFeatureConfig ccdFeatureConfig;

        /**
         * Gets the value of the ccdFeatureConfig property.
         * 
         * @return
         *     possible object is
         *     {@link XCcdFeatureConfig }
         *     
         */
        public XCcdFeatureConfig getCcdFeatureConfig() {
            return ccdFeatureConfig;
        }

        /**
         * Sets the value of the ccdFeatureConfig property.
         * 
         * @param value
         *     allowed object is
         *     {@link XCcdFeatureConfig }
         *     
         */
        public void setCcdFeatureConfig(XCcdFeatureConfig value) {
            this.ccdFeatureConfig = value;
        }

    }

}
