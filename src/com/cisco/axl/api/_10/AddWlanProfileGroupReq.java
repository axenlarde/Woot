
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddWlanProfileGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddWlanProfileGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="wlanProfileGroup" type="{http://www.cisco.com/AXL/API/10.5}XWlanProfileGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddWlanProfileGroupReq", propOrder = {
    "wlanProfileGroup"
})
public class AddWlanProfileGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XWlanProfileGroup wlanProfileGroup;

    /**
     * Gets the value of the wlanProfileGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XWlanProfileGroup }
     *     
     */
    public XWlanProfileGroup getWlanProfileGroup() {
        return wlanProfileGroup;
    }

    /**
     * Sets the value of the wlanProfileGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XWlanProfileGroup }
     *     
     */
    public void setWlanProfileGroup(XWlanProfileGroup value) {
        this.wlanProfileGroup = value;
    }

}
