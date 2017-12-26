
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWLANProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWLANProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="wLANProfile" type="{http://www.cisco.com/AXL/API/10.5}RWLANProfile"/>
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
@XmlType(name = "GetWLANProfileRes", propOrder = {
    "_return"
})
public class GetWLANProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetWLANProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetWLANProfileRes.Return }
     *     
     */
    public GetWLANProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWLANProfileRes.Return }
     *     
     */
    public void setReturn(GetWLANProfileRes.Return value) {
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
     *         &lt;element name="wLANProfile" type="{http://www.cisco.com/AXL/API/10.5}RWLANProfile"/>
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
        "wlanProfile"
    })
    public static class Return {

        @XmlElement(name = "wLANProfile", required = true)
        protected RWLANProfile wlanProfile;

        /**
         * Gets the value of the wlanProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RWLANProfile }
         *     
         */
        public RWLANProfile getWLANProfile() {
            return wlanProfile;
        }

        /**
         * Sets the value of the wlanProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RWLANProfile }
         *     
         */
        public void setWLANProfile(RWLANProfile value) {
            this.wlanProfile = value;
        }

    }

}
