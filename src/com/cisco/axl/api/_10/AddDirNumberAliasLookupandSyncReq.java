
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDirNumberAliasLookupandSyncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDirNumberAliasLookupandSyncReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="dirNumberAliasLookupandSync" type="{http://www.cisco.com/AXL/API/10.5}XDirNumberAliasLookupandSync"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDirNumberAliasLookupandSyncReq", propOrder = {
    "dirNumberAliasLookupandSync"
})
public class AddDirNumberAliasLookupandSyncReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XDirNumberAliasLookupandSync dirNumberAliasLookupandSync;

    /**
     * Gets the value of the dirNumberAliasLookupandSync property.
     * 
     * @return
     *     possible object is
     *     {@link XDirNumberAliasLookupandSync }
     *     
     */
    public XDirNumberAliasLookupandSync getDirNumberAliasLookupandSync() {
        return dirNumberAliasLookupandSync;
    }

    /**
     * Sets the value of the dirNumberAliasLookupandSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDirNumberAliasLookupandSync }
     *     
     */
    public void setDirNumberAliasLookupandSync(XDirNumberAliasLookupandSync value) {
        this.dirNumberAliasLookupandSync = value;
    }

}
