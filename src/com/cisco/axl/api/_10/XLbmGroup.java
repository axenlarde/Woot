
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLbmGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLbmGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessnodeActive" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="ProcessnodeStandby" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLbmGroup", propOrder = {
    "name",
    "description",
    "processnodeActive",
    "processnodeStandby"
})
public class XLbmGroup {

    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "ProcessnodeActive", type = JAXBElement.class)
    protected JAXBElement<XFkType> processnodeActive;
    @XmlElementRef(name = "ProcessnodeStandby", type = JAXBElement.class)
    protected JAXBElement<XFkType> processnodeStandby;

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
     * Gets the value of the processnodeActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getProcessnodeActive() {
        return processnodeActive;
    }

    /**
     * Sets the value of the processnodeActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setProcessnodeActive(JAXBElement<XFkType> value) {
        this.processnodeActive = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the processnodeStandby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getProcessnodeStandby() {
        return processnodeStandby;
    }

    /**
     * Sets the value of the processnodeStandby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setProcessnodeStandby(JAXBElement<XFkType> value) {
        this.processnodeStandby = ((JAXBElement<XFkType> ) value);
    }

}
