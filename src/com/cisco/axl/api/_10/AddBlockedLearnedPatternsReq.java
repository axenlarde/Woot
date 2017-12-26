
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddBlockedLearnedPatternsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBlockedLearnedPatternsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="blockedLearnedPatterns" type="{http://www.cisco.com/AXL/API/10.5}XBlockedLearnedPatterns"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBlockedLearnedPatternsReq", propOrder = {
    "blockedLearnedPatterns"
})
public class AddBlockedLearnedPatternsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XBlockedLearnedPatterns blockedLearnedPatterns;

    /**
     * Gets the value of the blockedLearnedPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link XBlockedLearnedPatterns }
     *     
     */
    public XBlockedLearnedPatterns getBlockedLearnedPatterns() {
        return blockedLearnedPatterns;
    }

    /**
     * Sets the value of the blockedLearnedPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XBlockedLearnedPatterns }
     *     
     */
    public void setBlockedLearnedPatterns(XBlockedLearnedPatterns value) {
        this.blockedLearnedPatterns = value;
    }

}
