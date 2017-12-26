
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddImportedDirectoryUriCatalogsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddImportedDirectoryUriCatalogsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="importedDirectoryUriCatalogs" type="{http://www.cisco.com/AXL/API/10.5}XImportedDirectoryUriCatalogs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddImportedDirectoryUriCatalogsReq", propOrder = {
    "importedDirectoryUriCatalogs"
})
public class AddImportedDirectoryUriCatalogsReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XImportedDirectoryUriCatalogs importedDirectoryUriCatalogs;

    /**
     * Gets the value of the importedDirectoryUriCatalogs property.
     * 
     * @return
     *     possible object is
     *     {@link XImportedDirectoryUriCatalogs }
     *     
     */
    public XImportedDirectoryUriCatalogs getImportedDirectoryUriCatalogs() {
        return importedDirectoryUriCatalogs;
    }

    /**
     * Sets the value of the importedDirectoryUriCatalogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImportedDirectoryUriCatalogs }
     *     
     */
    public void setImportedDirectoryUriCatalogs(XImportedDirectoryUriCatalogs value) {
        this.importedDirectoryUriCatalogs = value;
    }

}
