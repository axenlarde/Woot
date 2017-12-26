
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWifiHotspotReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWifiHotspotReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="wifiHotspot" type="{http://www.cisco.com/AXL/API/10.5}XWifiHotspot"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWifiHotspotReq", propOrder = {
    "wifiHotspot"
})
public class AddWifiHotspotReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XWifiHotspot wifiHotspot;

    /**
     * Gets the value of the wifiHotspot property.
     * 
     * @return
     *     possible object is
     *     {@link XWifiHotspot }
     *     
     */
    public XWifiHotspot getWifiHotspot() {
        return wifiHotspot;
    }

    /**
     * Sets the value of the wifiHotspot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWifiHotspot }
     *     
     */
    public void setWifiHotspot(XWifiHotspot value) {
        this.wifiHotspot = value;
    }

}
