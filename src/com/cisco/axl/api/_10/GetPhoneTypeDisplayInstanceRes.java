
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPhoneTypeDisplayInstanceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneTypeDisplayInstanceRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="displayInstance" type="{http://www.cisco.com/AXL/API/10.5}String32"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPhoneTypeDisplayInstanceRes", propOrder = {
    "displayInstance"
})
public class GetPhoneTypeDisplayInstanceRes
    extends APIResponse
{

    @XmlElement(required = true)
    protected String displayInstance;

    /**
     * Gets the value of the displayInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayInstance() {
        return displayInstance;
    }

    /**
     * Sets the value of the displayInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayInstance(String value) {
        this.displayInstance = value;
    }

}
