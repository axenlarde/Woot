
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLbmGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLbmGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="lbmGroup" type="{http://www.cisco.com/AXL/API/10.5}XLbmGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLbmGroupReq", propOrder = {
    "lbmGroup"
})
public class AddLbmGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XLbmGroup lbmGroup;

    /**
     * Gets the value of the lbmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XLbmGroup }
     *     
     */
    public XLbmGroup getLbmGroup() {
        return lbmGroup;
    }

    /**
     * Sets the value of the lbmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLbmGroup }
     *     
     */
    public void setLbmGroup(XLbmGroup value) {
        this.lbmGroup = value;
    }

}
