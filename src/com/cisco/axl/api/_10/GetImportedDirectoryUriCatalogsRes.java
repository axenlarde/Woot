
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetImportedDirectoryUriCatalogsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetImportedDirectoryUriCatalogsRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="importedDirectoryUriCatalogs" type="{http://www.cisco.com/AXL/API/10.5}RImportedDirectoryUriCatalogs"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetImportedDirectoryUriCatalogsRes", propOrder = {
    "_return"
})
public class GetImportedDirectoryUriCatalogsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetImportedDirectoryUriCatalogsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetImportedDirectoryUriCatalogsRes.Return }
     *     
     */
    public GetImportedDirectoryUriCatalogsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetImportedDirectoryUriCatalogsRes.Return }
     *     
     */
    public void setReturn(GetImportedDirectoryUriCatalogsRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="importedDirectoryUriCatalogs" type="{http://www.cisco.com/AXL/API/10.5}RImportedDirectoryUriCatalogs"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "importedDirectoryUriCatalogs"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RImportedDirectoryUriCatalogs importedDirectoryUriCatalogs;

        /**
         * Gets the value of the importedDirectoryUriCatalogs property.
         * 
         * @return
         *     possible object is
         *     {@link RImportedDirectoryUriCatalogs }
         *     
         */
        public RImportedDirectoryUriCatalogs getImportedDirectoryUriCatalogs() {
            return importedDirectoryUriCatalogs;
        }

        /**
         * Sets the value of the importedDirectoryUriCatalogs property.
         * 
         * @param value
         *     allowed object is
         *     {@link RImportedDirectoryUriCatalogs }
         *     
         */
        public void setImportedDirectoryUriCatalogs(RImportedDirectoryUriCatalogs value) {
            this.importedDirectoryUriCatalogs = value;
        }

    }

}
