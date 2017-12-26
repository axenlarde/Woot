
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAdvertisedPatternsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAdvertisedPatternsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="advertisedPatterns" type="{http://www.cisco.com/AXL/API/10.5}XAdvertisedPatterns"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAdvertisedPatternsReq", propOrder = {
    "advertisedPatterns"
})
public class AddAdvertisedPatternsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAdvertisedPatterns advertisedPatterns;

    /**
     * Gets the value of the advertisedPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link XAdvertisedPatterns }
     *     
     */
    public XAdvertisedPatterns getAdvertisedPatterns() {
        return advertisedPatterns;
    }

    /**
     * Sets the value of the advertisedPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAdvertisedPatterns }
     *     
     */
    public void setAdvertisedPatterns(XAdvertisedPatterns value) {
        this.advertisedPatterns = value;
    }

}
