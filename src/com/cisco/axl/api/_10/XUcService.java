
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XUcService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XUcService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="serviceType" type="{http://www.cisco.com/AXL/API/10.5}XUCService"/>
 *         &lt;element name="productType" type="{http://www.cisco.com/AXL/API/10.5}XUCProduct"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostnameorip" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="port" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/10.5}XConnectProtocol" minOccurs="0"/>
 *         &lt;element name="ucServiceXml" type="{http://www.cisco.com/AXL/API/10.5}XVendorConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XUcService", propOrder = {
    "serviceType",
    "productType",
    "name",
    "description",
    "hostnameorip",
    "port",
    "protocol",
    "ucServiceXml"
})
public class XUcService {

    protected String serviceType;
    @XmlElementRef(name = "productType", type = JAXBElement.class)
    protected JAXBElement<String> productType;
    protected String name;
    protected String description;
    protected String hostnameorip;
    @XmlElementRef(name = "port", type = JAXBElement.class)
    protected JAXBElement<String> port;
    @XmlElementRef(name = "protocol", type = JAXBElement.class)
    protected JAXBElement<String> protocol;
    protected XVendorConfig ucServiceXml;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = ((JAXBElement<String> ) value);
    }

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
     * Gets the value of the hostnameorip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostnameorip() {
        return hostnameorip;
    }

    /**
     * Sets the value of the hostnameorip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostnameorip(String value) {
        this.hostnameorip = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPort(JAXBElement<String> value) {
        this.port = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocol(JAXBElement<String> value) {
        this.protocol = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ucServiceXml property.
     * 
     * @return
     *     possible object is
     *     {@link XVendorConfig }
     *     
     */
    public XVendorConfig getUcServiceXml() {
        return ucServiceXml;
    }

    /**
     * Sets the value of the ucServiceXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link XVendorConfig }
     *     
     */
    public void setUcServiceXml(XVendorConfig value) {
        this.ucServiceXml = value;
    }

}
