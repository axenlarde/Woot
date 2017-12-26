
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPCommunityStringRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPCommunityStringRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SNMPCommunityString" type="{http://www.cisco.com/AXL/API/10.5}RSNMPCommunityString"/>
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
@XmlType(name = "GetSNMPCommunityStringRes", propOrder = {
    "_return"
})
public class GetSNMPCommunityStringRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSNMPCommunityStringRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSNMPCommunityStringRes.Return }
     *     
     */
    public GetSNMPCommunityStringRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSNMPCommunityStringRes.Return }
     *     
     */
    public void setReturn(GetSNMPCommunityStringRes.Return value) {
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
     *         &lt;element name="SNMPCommunityString" type="{http://www.cisco.com/AXL/API/10.5}RSNMPCommunityString"/>
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
        "snmpCommunityString"
    })
    public static class Return {

        @XmlElement(name = "SNMPCommunityString", required = true)
        protected RSNMPCommunityString snmpCommunityString;

        /**
         * Gets the value of the snmpCommunityString property.
         * 
         * @return
         *     possible object is
         *     {@link RSNMPCommunityString }
         *     
         */
        public RSNMPCommunityString getSNMPCommunityString() {
            return snmpCommunityString;
        }

        /**
         * Sets the value of the snmpCommunityString property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSNMPCommunityString }
         *     
         */
        public void setSNMPCommunityString(RSNMPCommunityString value) {
            this.snmpCommunityString = value;
        }

    }

}
