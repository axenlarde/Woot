
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPresenceRedundancyGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPresenceRedundancyGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="presenceRedundancyGroup" type="{http://www.cisco.com/AXL/API/10.5}XPresenceRedundancyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPresenceRedundancyGroupReq", propOrder = {
    "presenceRedundancyGroup"
})
public class AddPresenceRedundancyGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XPresenceRedundancyGroup presenceRedundancyGroup;

    /**
     * Gets the value of the presenceRedundancyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XPresenceRedundancyGroup }
     *     
     */
    public XPresenceRedundancyGroup getPresenceRedundancyGroup() {
        return presenceRedundancyGroup;
    }

    /**
     * Sets the value of the presenceRedundancyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPresenceRedundancyGroup }
     *     
     */
    public void setPresenceRedundancyGroup(XPresenceRedundancyGroup value) {
        this.presenceRedundancyGroup = value;
    }

}
