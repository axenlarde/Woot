
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LMohAudioSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LMohAudioSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="sourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="sourceFile" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="multicast" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mohFileStatus" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="initialAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="periodicAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="periodicAnnouncementInterval" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="localeAnnouncement" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="initialAnnouncementPlayed" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LMohAudioSource", propOrder = {
    "sourceId",
    "name",
    "sourceFile",
    "multicast",
    "mohFileStatus",
    "initialAnnouncement",
    "periodicAnnouncement",
    "periodicAnnouncementInterval",
    "localeAnnouncement",
    "initialAnnouncementPlayed"
})
public class LMohAudioSource {

    protected String sourceId;
    protected String name;
    protected String sourceFile;
    protected String multicast;
    protected String mohFileStatus;
    protected XFkType initialAnnouncement;
    protected XFkType periodicAnnouncement;
    protected String periodicAnnouncementInterval;
    protected String localeAnnouncement;
    protected String initialAnnouncementPlayed;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

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
     * Gets the value of the sourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFile(String value) {
        this.sourceFile = value;
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
     * Gets the value of the mohFileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMohFileStatus() {
        return mohFileStatus;
    }

    /**
     * Sets the value of the mohFileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMohFileStatus(String value) {
        this.mohFileStatus = value;
    }

    /**
     * Gets the value of the initialAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getInitialAnnouncement() {
        return initialAnnouncement;
    }

    /**
     * Sets the value of the initialAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setInitialAnnouncement(XFkType value) {
        this.initialAnnouncement = value;
    }

    /**
     * Gets the value of the periodicAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPeriodicAnnouncement() {
        return periodicAnnouncement;
    }

    /**
     * Sets the value of the periodicAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPeriodicAnnouncement(XFkType value) {
        this.periodicAnnouncement = value;
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

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
