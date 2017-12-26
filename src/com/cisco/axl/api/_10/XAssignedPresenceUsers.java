
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XAssignedPresenceUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XAssignedPresenceUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="server" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="presenceRedundancyGroup" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAssignedPresenceUsers", propOrder = {
    "userid",
    "server",
    "presenceRedundancyGroup"
})
public class XAssignedPresenceUsers {

    protected String userid;
    @XmlElementRef(name = "server", type = JAXBElement.class)
    protected JAXBElement<XFkType> server;
    protected String presenceRedundancyGroup;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setServer(JAXBElement<XFkType> value) {
        this.server = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the presenceRedundancyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceRedundancyGroup() {
        return presenceRedundancyGroup;
    }

    /**
     * Sets the value of the presenceRedundancyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceRedundancyGroup(String value) {
        this.presenceRedundancyGroup = value;
    }

}
