
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSNMPCommunityStringReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSNMPCommunityStringReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="communityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newValues" type="{http://www.cisco.com/AXL/API/10.5}RSNMPCommunityString1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSNMPCommunityStringReq", propOrder = {
    "communityName",
    "newValues"
})
public class UpdateSNMPCommunityStringReq
    extends APIRequest
{

    protected String communityName;
    @XmlElement(required = true)
    protected RSNMPCommunityString1 newValues;

    /**
     * Gets the value of the communityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * Sets the value of the communityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityName(String value) {
        this.communityName = value;
    }

    /**
     * Gets the value of the newValues property.
     * 
     * @return
     *     possible object is
     *     {@link RSNMPCommunityString1 }
     *     
     */
    public RSNMPCommunityString1 getNewValues() {
        return newValues;
    }

    /**
     * Sets the value of the newValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSNMPCommunityString1 }
     *     
     */
    public void setNewValues(RSNMPCommunityString1 value) {
        this.newValues = value;
    }

}
