
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XFeatureGroupTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XFeatureGroupTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeCluster" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="imAndUcPresenceEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowCTIControl" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableEMCC" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileVoiceAccess" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="maxDeskPickupWait" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="remoteDestinationLimit" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="BLFPresenceGp" type="{http://www.cisco.com/AXL/API/10.5}XFkType"/>
 *         &lt;element name="subscribeCallingSearch" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="meetingInformation" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XFeatureGroupTemplate", propOrder = {
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
public class XFeatureGroupTemplate {

    protected String name;
    protected String description;
    protected String homeCluster;
    protected String imAndUcPresenceEnable;
    @XmlElementRef(name = "serviceProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> serviceProfile;
    protected String allowCTIControl;
    protected String enableEMCC;
    protected String enableMobility;
    protected String enableMobileVoiceAccess;
    @XmlElement(defaultValue = "10000")
    protected String maxDeskPickupWait;
    @XmlElement(defaultValue = "4")
    protected String remoteDestinationLimit;
    @XmlElement(name = "BLFPresenceGp")
    protected XFkType blfPresenceGp;
    @XmlElementRef(name = "subscribeCallingSearch", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscribeCallingSearch;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    @XmlElementRef(name = "userProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> userProfile;
    protected String meetingInformation;

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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setServiceProfile(JAXBElement<XFkType> value) {
        this.serviceProfile = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscribeCallingSearch() {
        return subscribeCallingSearch;
    }

    /**
     * Sets the value of the subscribeCallingSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscribeCallingSearch(JAXBElement<XFkType> value) {
        this.subscribeCallingSearch = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocale(JAXBElement<String> value) {
        this.userLocale = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUserProfile(JAXBElement<XFkType> value) {
        this.userProfile = ((JAXBElement<XFkType> ) value);
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

}
