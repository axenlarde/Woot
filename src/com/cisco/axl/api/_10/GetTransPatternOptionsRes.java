
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransPatternOptionsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransPatternOptionsRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/10.5}ORTransPattern"/>
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
@XmlType(name = "GetTransPatternOptionsRes", propOrder = {
    "_return"
})
public class GetTransPatternOptionsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetTransPatternOptionsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransPatternOptionsRes.Return }
     *     
     */
    public GetTransPatternOptionsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransPatternOptionsRes.Return }
     *     
     */
    public void setReturn(GetTransPatternOptionsRes.Return value) {
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
     *         &lt;element name="transPattern" type="{http://www.cisco.com/AXL/API/10.5}ORTransPattern"/>
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
        "transPattern"
    })
    public static class Return {

        @XmlElement(required = true)
        protected ORTransPattern transPattern;

        /**
         * Gets the value of the transPattern property.
         * 
         * @return
         *     possible object is
         *     {@link ORTransPattern }
         *     
         */
        public ORTransPattern getTransPattern() {
            return transPattern;
        }

        /**
         * Sets the value of the transPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORTransPattern }
         *     
         */
        public void setTransPattern(ORTransPattern value) {
            this.transPattern = value;
        }

    }

}
