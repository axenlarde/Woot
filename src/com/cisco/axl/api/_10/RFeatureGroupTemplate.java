
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RFeatureGroupTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFeatureGroupTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeCluster" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="imAndUcPresenceEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowCTIControl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableEMCC" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileVoiceAccess" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="maxDeskPickupWait" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="remoteDestinationLimit" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="BLFPresenceGp" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearch" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="meetingInformation" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
@XmlType(name = "RFeatureGroupTemplate", propOrder = {
    "name",
    "description",
    "homeCluster",
    "imAndUcPresenceEnable",
    "serviceProfile",
    "allowCTIControl",
    "enableEMCC",
    "enableMobility",
    "enableMobileVoiceAccess",
    "maxDeskPickupWait",
    "remoteDestinationLimit",
    "blfPresenceGp",
    "subscribeCallingSearch",
    "userLocale",
    "userProfile",
    "meetingInformation"
})
public class RFeatureGroupTemplate {

    protected String name;
    protected String description;
    protected String homeCluster;
    protected String imAndUcPresenceEnable;
    protected XFkType serviceProfile;
    protected String allowCTIControl;
    protected String enableEMCC;
    protected String enableMobility;
    protected String enableMobileVoiceAccess;
    protected String maxDeskPickupWait;
    protected String remoteDestinationLimit;
    @XmlElement(name = "BLFPresenceGp")
    protected XFkType blfPresenceGp;
    protected XFkType subscribeCallingSearch;
    protected String userLocale;
    protected XFkType userProfile;
    protected String meetingInformation;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the homeCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCluster() {
        return homeCluster;
    }

    /**
     * Sets the value of the homeCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCluster(String value) {
        this.homeCluster = value;
    }

    /**
     * Gets the value of the imAndUcPresenceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAndUcPresenceEnable() {
        return imAndUcPresenceEnable;
    }

    /**
     * Sets the value of the imAndUcPresenceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAndUcPresenceEnable(String value) {
        this.imAndUcPresenceEnable = value;
    }

    /**
     * Gets the value of the serviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setServiceProfile(XFkType value) {
        this.serviceProfile = value;
    }

    /**
     * Gets the value of the allowCTIControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCTIControl() {
        return allowCTIControl;
    }

    /**
     * Sets the value of the allowCTIControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCTIControl(String value) {
        this.allowCTIControl = value;
    }

    /**
     * Gets the value of the enableEMCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableEMCC() {
        return enableEMCC;
    }

    /**
     * Sets the value of the enableEMCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableEMCC(String value) {
        this.enableEMCC = value;
    }

    /**
     * Gets the value of the enableMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobility() {
        return enableMobility;
    }

    /**
     * Sets the value of the enableMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobility(String value) {
        this.enableMobility = value;
    }

    /**
     * Gets the value of the enableMobileVoiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobileVoiceAccess() {
        return enableMobileVoiceAccess;
    }

    /**
     * Sets the value of the enableMobileVoiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobileVoiceAccess(String value) {
        this.enableMobileVoiceAccess = value;
    }

    /**
     * Gets the value of the maxDeskPickupWait property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDeskPickupWait() {
        return maxDeskPickupWait;
    }

    /**
     * Sets the value of the maxDeskPickupWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDeskPickupWait(String value) {
        this.maxDeskPickupWait = value;
    }

    /**
     * Gets the value of the remoteDestinationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDestinationLimit() {
        return remoteDestinationLimit;
    }

    /**
     * Sets the value of the remoteDestinationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDestinationLimit(String value) {
        this.remoteDestinationLimit = value;
    }

    /**
     * Gets the value of the blfPresenceGp property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBLFPresenceGp() {
        return blfPresenceGp;
    }

    /**
     * Sets the value of the blfPresenceGp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBLFPresenceGp(XFkType value) {
        this.blfPresenceGp = value;
    }

    /**
     * Gets the value of the subscribeCallingSearch property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSubscribeCallingSearch() {
        return subscribeCallingSearch;
    }

    /**
     * Sets the value of the subscribeCallingSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSubscribeCallingSearch(XFkType value) {
        this.subscribeCallingSearch = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUserProfile(XFkType value) {
        this.userProfile = value;
    }

    /**
     * Gets the value of the meetingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingInformation() {
        return meetingInformation;
    }

    /**
     * Sets the value of the meetingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingInformation(String value) {
        this.meetingInformation = value;
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
