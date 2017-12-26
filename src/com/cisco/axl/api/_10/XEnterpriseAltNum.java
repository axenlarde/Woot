
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XEnterpriseAltNum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XEnterpriseAltNum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="numberMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addToLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XEnterpriseAltNum", propOrder = {
    "numberMask",
    "addToLocalRoutePartition",
    "routePartition",
    "isUrgent",
    "advertiseGloballyIls"
})
public class XEnterpriseAltNum {

    @XmlElementRef(name = "numberMask", type = JAXBElement.class)
    protected JAXBElement<String> numberMask;
    protected String addToLocalRoutePartition;
    @XmlElementRef(name = "routePartition", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartition;
    protected String isUrgent;
    protected String advertiseGloballyIls;

    /**
     * Gets the value of the numberMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberMask() {
        return numberMask;
    }

    /**
     * Sets the value of the numberMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberMask(JAXBElement<String> value) {
        this.numberMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addToLocalRoutePartition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToLocalRoutePartition() {
        return addToLocalRoutePartition;
    }

    /**
     * Sets the value of the addToLocalRoutePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToLocalRoutePartition(String value) {
        this.addToLocalRoutePartition = value;
    }

    /**
     * Gets the value of the routePartition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartition(JAXBElement<XFkType> value) {
        this.routePartition = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the isUrgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUrgent() {
        return isUrgent;
    }

    /**
     * Sets the value of the isUrgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUrgent(String value) {
        this.isUrgent = value;
    }

    /**
     * Gets the value of the advertiseGloballyIls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiseGloballyIls() {
        return advertiseGloballyIls;
    }

    /**
     * Sets the value of the advertiseGloballyIls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiseGloballyIls(String value) {
        this.advertiseGloballyIls = value;
    }

}
