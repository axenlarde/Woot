
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSIPNormalizationScriptReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSIPNormalizationScriptReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="sIPNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}XSIPNormalizationScript"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSIPNormalizationScriptReq", propOrder = {
    "sipNormalizationScript"
})
public class AddSIPNormalizationScriptReq
    extends APIRequest
{

    @XmlElement(name = "sIPNormalizationScript", required = true)
    protected XSIPNormalizationScript sipNormalizationScript;

    /**
     * Gets the value of the sipNormalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link XSIPNormalizationScript }
     *     
     */
    public XSIPNormalizationScript getSIPNormalizationScript() {
        return sipNormalizationScript;
    }

    /**
     * Sets the value of the sipNormalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSIPNormalizationScript }
     *     
     */
    public void setSIPNormalizationScript(XSIPNormalizationScript value) {
        this.sipNormalizationScript = value;
    }

}
