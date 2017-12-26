
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveSNMPCommunityStringReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveSNMPCommunityStringReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="CommunityString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSNMPCommunityStringReq", propOrder = {
    "communityString"
})
public class RemoveSNMPCommunityStringReq
    extends APIRequest
{

    @XmlElement(name = "CommunityString", required = true)
    protected String communityString;

    /**
     * Gets the value of the communityString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityString() {
        return communityString;
    }

    /**
     * Sets the value of the communityString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityString(String value) {
        this.communityString = value;
    }

}
