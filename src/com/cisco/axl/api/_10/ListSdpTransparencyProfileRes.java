
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListSdpTransparencyProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSdpTransparencyProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sdpTransparencyProfile" type="{http://www.cisco.com/AXL/API/10.5}LSdpTransparencyProfile" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListSdpTransparencyProfileRes", propOrder = {
    "_return"
})
public class ListSdpTransparencyProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected ListSdpTransparencyProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListSdpTransparencyProfileRes.Return }
     *     
     */
    public ListSdpTransparencyProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSdpTransparencyProfileRes.Return }
     *     
     */
    public void setReturn(ListSdpTransparencyProfileRes.Return value) {
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
     *         &lt;element name="sdpTransparencyProfile" type="{http://www.cisco.com/AXL/API/10.5}LSdpTransparencyProfile" maxOccurs="unbounded" minOccurs="0"/>
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
        "sdpTransparencyProfile"
    })
    public static class Return {

        protected List<LSdpTransparencyProfile> sdpTransparencyProfile;

        /**
         * Gets the value of the sdpTransparencyProfile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sdpTransparencyProfile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSdpTransparencyProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LSdpTransparencyProfile }
         * 
         * 
         */
        public List<LSdpTransparencyProfile> getSdpTransparencyProfile() {
            if (sdpTransparencyProfile == null) {
                sdpTransparencyProfile = new ArrayList<LSdpTransparencyProfile>();
            }
            return this.sdpTransparencyProfile;
        }

    }

}
