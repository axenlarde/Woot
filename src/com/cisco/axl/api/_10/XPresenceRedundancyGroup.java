
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XPresenceRedundancyGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XPresenceRedundancyGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="server1" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="server2" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="haEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XPresenceRedundancyGroup", propOrder = {
    "name",
    "description",
    "server1",
    "server2",
    "haEnabled"
})
public class XPresenceRedundancyGroup {

    protected String name;
    protected String description;
    @XmlElementRef(name = "server1", type = JAXBElement.class)
    protected JAXBElement<XFkType> server1;
    @XmlElementRef(name = "server2", type = JAXBElement.class)
    protected JAXBElement<XFkType> server2;
    @XmlElement(defaultValue = "false")
    protected String haEnabled;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the server1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getServer1() {
        return server1;
    }

    /**
     * Sets the value of the server1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setServer1(JAXBElement<XFkType> value) {
        this.server1 = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the server2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getServer2() {
        return server2;
    }

    /**
     * Sets the value of the server2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setServer2(JAXBElement<XFkType> value) {
        this.server2 = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the haEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaEnabled() {
        return haEnabled;
    }

    /**
     * Sets the value of the haEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaEnabled(String value) {
        this.haEnabled = value;
    }

}
