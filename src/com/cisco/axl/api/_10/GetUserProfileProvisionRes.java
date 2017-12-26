
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUserProfileProvisionRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserProfileProvisionRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userProfileProvision" type="{http://www.cisco.com/AXL/API/10.5}RUserProfileProvision"/>
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
@XmlType(name = "GetUserProfileProvisionRes", propOrder = {
    "_return"
})
public class GetUserProfileProvisionRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetUserProfileProvisionRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserProfileProvisionRes.Return }
     *     
     */
    public GetUserProfileProvisionRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserProfileProvisionRes.Return }
     *     
     */
    public void setReturn(GetUserProfileProvisionRes.Return value) {
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
     *         &lt;element name="userProfileProvision" type="{http://www.cisco.com/AXL/API/10.5}RUserProfileProvision"/>
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
        "userProfileProvision"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RUserProfileProvision userProfileProvision;

        /**
         * Gets the value of the userProfileProvision property.
         * 
         * @return
         *     possible object is
         *     {@link RUserProfileProvision }
         *     
         */
        public RUserProfileProvision getUserProfileProvision() {
            return userProfileProvision;
        }

        /**
         * Sets the value of the userProfileProvision property.
         * 
         * @param value
         *     allowed object is
         *     {@link RUserProfileProvision }
         *     
         */
        public void setUserProfileProvision(RUserProfileProvision value) {
            this.userProfileProvision = value;
        }

    }

}
