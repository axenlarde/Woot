
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLocalRouteGroupRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLocalRouteGroupRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="localRouteGroup" type="{http://www.cisco.com/AXL/API/10.5}RLocalRouteGroup"/>
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
@XmlType(name = "GetLocalRouteGroupRes", propOrder = {
    "_return"
})
public class GetLocalRouteGroupRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetLocalRouteGroupRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetLocalRouteGroupRes.Return }
     *     
     */
    public GetLocalRouteGroupRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLocalRouteGroupRes.Return }
     *     
     */
    public void setReturn(GetLocalRouteGroupRes.Return value) {
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
     *         &lt;element name="localRouteGroup" type="{http://www.cisco.com/AXL/API/10.5}RLocalRouteGroup"/>
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
        "localRouteGroup"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RLocalRouteGroup localRouteGroup;

        /**
         * Gets the value of the localRouteGroup property.
         * 
         * @return
         *     possible object is
         *     {@link RLocalRouteGroup }
         *     
         */
        public RLocalRouteGroup getLocalRouteGroup() {
            return localRouteGroup;
        }

        /**
         * Sets the value of the localRouteGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link RLocalRouteGroup }
         *     
         */
        public void setLocalRouteGroup(RLocalRouteGroup value) {
            this.localRouteGroup = value;
        }

    }

}
