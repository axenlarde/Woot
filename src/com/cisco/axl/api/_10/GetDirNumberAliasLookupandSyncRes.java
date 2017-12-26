
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDirNumberAliasLookupandSyncRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDirNumberAliasLookupandSyncRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dirNumberAliasLookupandSync" type="{http://www.cisco.com/AXL/API/10.5}RDirNumberAliasLookupandSync"/>
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
@XmlType(name = "GetDirNumberAliasLookupandSyncRes", propOrder = {
    "_return"
})
public class GetDirNumberAliasLookupandSyncRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDirNumberAliasLookupandSyncRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDirNumberAliasLookupandSyncRes.Return }
     *     
     */
    public GetDirNumberAliasLookupandSyncRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDirNumberAliasLookupandSyncRes.Return }
     *     
     */
    public void setReturn(GetDirNumberAliasLookupandSyncRes.Return value) {
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
     *         &lt;element name="dirNumberAliasLookupandSync" type="{http://www.cisco.com/AXL/API/10.5}RDirNumberAliasLookupandSync"/>
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
        "dirNumberAliasLookupandSync"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RDirNumberAliasLookupandSync dirNumberAliasLookupandSync;

        /**
         * Gets the value of the dirNumberAliasLookupandSync property.
         * 
         * @return
         *     possible object is
         *     {@link RDirNumberAliasLookupandSync }
         *     
         */
        public RDirNumberAliasLookupandSync getDirNumberAliasLookupandSync() {
            return dirNumberAliasLookupandSync;
        }

        /**
         * Sets the value of the dirNumberAliasLookupandSync property.
         * 
         * @param value
         *     allowed object is
         *     {@link RDirNumberAliasLookupandSync }
         *     
         */
        public void setDirNumberAliasLookupandSync(RDirNumberAliasLookupandSync value) {
            this.dirNumberAliasLookupandSync = value;
        }

    }

}
