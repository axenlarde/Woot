
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBlockedLearnedPatternsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBlockedLearnedPatternsRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="blockedLearnedPatterns" type="{http://www.cisco.com/AXL/API/10.5}RBlockedLearnedPatterns"/>
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
@XmlType(name = "GetBlockedLearnedPatternsRes", propOrder = {
    "_return"
})
public class GetBlockedLearnedPatternsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetBlockedLearnedPatternsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetBlockedLearnedPatternsRes.Return }
     *     
     */
    public GetBlockedLearnedPatternsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBlockedLearnedPatternsRes.Return }
     *     
     */
    public void setReturn(GetBlockedLearnedPatternsRes.Return value) {
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
     *         &lt;element name="blockedLearnedPatterns" type="{http://www.cisco.com/AXL/API/10.5}RBlockedLearnedPatterns"/>
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
        "blockedLearnedPatterns"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RBlockedLearnedPatterns blockedLearnedPatterns;

        /**
         * Gets the value of the blockedLearnedPatterns property.
         * 
         * @return
         *     possible object is
         *     {@link RBlockedLearnedPatterns }
         *     
         */
        public RBlockedLearnedPatterns getBlockedLearnedPatterns() {
            return blockedLearnedPatterns;
        }

        /**
         * Sets the value of the blockedLearnedPatterns property.
         * 
         * @param value
         *     allowed object is
         *     {@link RBlockedLearnedPatterns }
         *     
         */
        public void setBlockedLearnedPatterns(RBlockedLearnedPatterns value) {
            this.blockedLearnedPatterns = value;
        }

    }

}
