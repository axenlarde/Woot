
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPageLayoutPreferencesRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPageLayoutPreferencesRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pageLayoutPreferences" type="{http://www.cisco.com/AXL/API/10.5}RPageLayoutPreferences"/>
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
@XmlType(name = "GetPageLayoutPreferencesRes", propOrder = {
    "_return"
})
public class GetPageLayoutPreferencesRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetPageLayoutPreferencesRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetPageLayoutPreferencesRes.Return }
     *     
     */
    public GetPageLayoutPreferencesRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPageLayoutPreferencesRes.Return }
     *     
     */
    public void setReturn(GetPageLayoutPreferencesRes.Return value) {
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
     *         &lt;element name="pageLayoutPreferences" type="{http://www.cisco.com/AXL/API/10.5}RPageLayoutPreferences"/>
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
        "pageLayoutPreferences"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RPageLayoutPreferences pageLayoutPreferences;

        /**
         * Gets the value of the pageLayoutPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link RPageLayoutPreferences }
         *     
         */
        public RPageLayoutPreferences getPageLayoutPreferences() {
            return pageLayoutPreferences;
        }

        /**
         * Sets the value of the pageLayoutPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link RPageLayoutPreferences }
         *     
         */
        public void setPageLayoutPreferences(RPageLayoutPreferences value) {
            this.pageLayoutPreferences = value;
        }

    }

}
