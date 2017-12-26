
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWifiHotspotRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWifiHotspotRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/10.5}RWifiHotspot"/>
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
@XmlType(name = "GetWifiHotspotRes", propOrder = {
    "_return"
})
public class GetWifiHotspotRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetWifiHotspotRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetWifiHotspotRes.Return }
     *     
     */
    public GetWifiHotspotRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWifiHotspotRes.Return }
     *     
     */
    public void setReturn(GetWifiHotspotRes.Return value) {
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
     *         &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/10.5}RWifiHotspot"/>
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
        "wifiHotspot"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RWifiHotspot wifiHotspot;

        /**
         * Gets the value of the wifiHotspot property.
         * 
         * @return
         *     possible object is
         *     {@link RWifiHotspot }
         *     
         */
        public RWifiHotspot getWifiHotspot() {
            return wifiHotspot;
        }

        /**
         * Sets the value of the wifiHotspot property.
         * 
         * @param value
         *     allowed object is
         *     {@link RWifiHotspot }
         *     
         */
        public void setWifiHotspot(RWifiHotspot value) {
            this.wifiHotspot = value;
        }

    }

}
