
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDeviceProfileOptionsRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeviceProfileOptionsRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deviceProfile" type="{http://www.cisco.com/AXL/API/10.5}ORDeviceProfile"/>
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
@XmlType(name = "GetDeviceProfileOptionsRes", propOrder = {
    "_return"
})
public class GetDeviceProfileOptionsRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetDeviceProfileOptionsRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceProfileOptionsRes.Return }
     *     
     */
    public GetDeviceProfileOptionsRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceProfileOptionsRes.Return }
     *     
     */
    public void setReturn(GetDeviceProfileOptionsRes.Return value) {
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
     *         &lt;element name="deviceProfile" type="{http://www.cisco.com/AXL/API/10.5}ORDeviceProfile"/>
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
        "deviceProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected ORDeviceProfile deviceProfile;

        /**
         * Gets the value of the deviceProfile property.
         * 
         * @return
         *     possible object is
         *     {@link ORDeviceProfile }
         *     
         */
        public ORDeviceProfile getDeviceProfile() {
            return deviceProfile;
        }

        /**
         * Sets the value of the deviceProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORDeviceProfile }
         *     
         */
        public void setDeviceProfile(ORDeviceProfile value) {
            this.deviceProfile = value;
        }

    }

}
