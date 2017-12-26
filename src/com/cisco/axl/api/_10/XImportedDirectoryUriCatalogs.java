
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XImportedDirectoryUriCatalogs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XImportedDirectoryUriCatalogs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastLoadedFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileLoadDateTime" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XImportedDirectoryUriCatalogs", propOrder = {
    "name",
    "description",
    "routeString",
    "lastLoadedFileName",
    "fileLoadDateTime"
})
public class XImportedDirectoryUriCatalogs {

    protected String name;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    protected String routeString;
    @XmlElementRef(name = "lastLoadedFileName", type = JAXBElement.class)
    protected JAXBElement<String> lastLoadedFileName;
    @XmlElementRef(name = "fileLoadDateTime", type = JAXBElement.class)
    protected JAXBElement<String> fileLoadDateTime;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the routeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteString() {
        return routeString;
    }

    /**
     * Sets the value of the routeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteString(String value) {
        this.routeString = value;
    }

    /**
     * Gets the value of the lastLoadedFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastLoadedFileName() {
        return lastLoadedFileName;
    }

    /**
     * Sets the value of the lastLoadedFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastLoadedFileName(JAXBElement<String> value) {
        this.lastLoadedFileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileLoadDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileLoadDateTime() {
        return fileLoadDateTime;
    }

    /**
     * Sets the value of the fileLoadDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileLoadDateTime(JAXBElement<String> value) {
        this.fileLoadDateTime = ((JAXBElement<String> ) value);
    }

}
