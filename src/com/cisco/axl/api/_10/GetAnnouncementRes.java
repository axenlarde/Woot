
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAnnouncementRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAnnouncementRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="announcement" type="{http://www.cisco.com/AXL/API/10.5}RAnnouncement"/>
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
@XmlType(name = "GetAnnouncementRes", propOrder = {
    "_return"
})
public class GetAnnouncementRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAnnouncementRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAnnouncementRes.Return }
     *     
     */
    public GetAnnouncementRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAnnouncementRes.Return }
     *     
     */
    public void setReturn(GetAnnouncementRes.Return value) {
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
     *         &lt;element name="announcement" type="{http://www.cisco.com/AXL/API/10.5}RAnnouncement"/>
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
        "announcement"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAnnouncement announcement;

        /**
         * Gets the value of the announcement property.
         * 
         * @return
         *     possible object is
         *     {@link RAnnouncement }
         *     
         */
        public RAnnouncement getAnnouncement() {
            return announcement;
        }

        /**
         * Sets the value of the announcement property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAnnouncement }
         *     
         */
        public void setAnnouncement(RAnnouncement value) {
            this.announcement = value;
        }

    }

}
