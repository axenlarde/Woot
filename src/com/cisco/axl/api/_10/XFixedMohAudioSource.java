
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XFixedMohAudioSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XFixedMohAudioSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multicast" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="periodicAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="periodicAnnouncementInterval" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="localeAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale"/>
 *         &lt;element name="initialAnnouncementPlayed" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XFixedMohAudioSource", propOrder = {
    "name",
    "multicast",
    "enable",
    "initialAnnouncement",
    "periodicAnnouncement",
    "periodicAnnouncementInterval",
    "localeAnnouncement",
    "initialAnnouncementPlayed"
})
public class XFixedMohAudioSource {

    protected String name;
    protected String multicast;
    protected String enable;
    @XmlElementRef(name = "initialAnnouncement", type = JAXBElement.class)
    protected JAXBElement<XFkType> initialAnnouncement;
    @XmlElementRef(name = "periodicAnnouncement", type = JAXBElement.class)
    protected JAXBElement<XFkType> periodicAnnouncement;
    @XmlElement(defaultValue = "30")
    protected String periodicAnnouncementInterval;
    @XmlElement(defaultValue = "English United States")
    protected String localeAnnouncement;
    protected String initialAnnouncementPlayed;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulticast(String value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnable(String value) {
        this.enable = value;
    }

    /**
     * Gets the value of the initialAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getInitialAnnouncement() {
        return initialAnnouncement;
    }

    /**
     * Sets the value of the initialAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setInitialAnnouncement(JAXBElement<XFkType> value) {
        this.initialAnnouncement = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the periodicAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPeriodicAnnouncement() {
        return periodicAnnouncement;
    }

    /**
     * Sets the value of the periodicAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPeriodicAnnouncement(JAXBElement<XFkType> value) {
        this.periodicAnnouncement = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the periodicAnnouncementInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicAnnouncementInterval() {
        return periodicAnnouncementInterval;
    }

    /**
     * Sets the value of the periodicAnnouncementInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicAnnouncementInterval(String value) {
        this.periodicAnnouncementInterval = value;
    }

    /**
     * Gets the value of the localeAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleAnnouncement() {
        return localeAnnouncement;
    }

    /**
     * Sets the value of the localeAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleAnnouncement(String value) {
        this.localeAnnouncement = value;
    }

    /**
     * Gets the value of the initialAnnouncementPlayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialAnnouncementPlayed() {
        return initialAnnouncementPlayed;
    }

    /**
     * Sets the value of the initialAnnouncementPlayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialAnnouncementPlayed(String value) {
        this.initialAnnouncementPlayed = value;
    }

}
