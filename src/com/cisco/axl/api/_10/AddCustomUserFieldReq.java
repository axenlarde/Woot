
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomUserFieldReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomUserFieldReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/10.5}XCustomUserField"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomUserFieldReq", propOrder = {
    "customUserField"
})
public class AddCustomUserFieldReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XCustomUserField customUserField;

    /**
     * Gets the value of the customUserField property.
     * 
     * @return
     *     possible object is
     *     {@link XCustomUserField }
     *     
     */
    public XCustomUserField getCustomUserField() {
        return customUserField;
    }

    /**
     * Sets the value of the customUserField property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCustomUserField }
     *     
     */
    public void setCustomUserField(XCustomUserField value) {
        this.customUserField = value;
    }

}
