
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLbmHubGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLbmHubGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lbmHubGroup" type="{http://www.cisco.com/AXL/API/10.5}RLbmHubGroup"/>
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
@XmlType(name = "GetLbmHubGroupRes", propOrder = {
    "_return"
})
public class GetLbmHubGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLbmHubGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLbmHubGroupRes.Return }
     *     
     */
    public GetLbmHubGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLbmHubGroupRes.Return }
     *     
     */
    public void setReturn(GetLbmHubGroupRes.Return value) {
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
     *         &lt;element name="lbmHubGroup" type="{http://www.cisco.com/AXL/API/10.5}RLbmHubGroup"/>
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
        "lbmHubGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLbmHubGroup lbmHubGroup;

        /**
         * Gets the value of the lbmHubGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RLbmHubGroup }
         *     
         */
        public RLbmHubGroup getLbmHubGroup() {
            return lbmHubGroup;
        }

        /**
         * Sets the value of the lbmHubGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLbmHubGroup }
         *     
         */
        public void setLbmHubGroup(RLbmHubGroup value) {
            this.lbmHubGroup = value;
        }

    }

}
