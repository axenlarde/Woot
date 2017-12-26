
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}XPatternUsage" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="aarDestinationMask" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="aarKeepCallHistory" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="aarVoiceMailEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/10.5}XAutoAnswer" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="alertingName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="asciiAlertingName" type="{http://www.cisco.com/AXL/API/10.5}String32" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="shareLineAppearanceCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}XReleaseCauseValue" minOccurs="0"/>
 *         &lt;element name="hrDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="hrInterval" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="cfaCssPolicy" type="{http://www.cisco.com/AXL/API/10.5}XCFACSSActivationPolicy" minOccurs="0"/>
 *         &lt;element name="defaultActivatedDeviceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveDn" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntDn" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveVmEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntVmEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntCssName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonReversionTimer" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="allowCtiControlFlag" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="rejectAnonymousCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode" minOccurs="0"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enterpriseAltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="e164AltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pstnFailover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedDevices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "LLine", propOrder = {
    "pattern",
    "description",
    "usage",
    "routePartitionName",
    "aarNeighborhoodName",
    "aarDestinationMask",
    "aarKeepCallHistory",
    "aarVoiceMailEnabled",
    "callPickupGroupName",
    "autoAnswer",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "alertingName",
    "asciiAlertingName",
    "presenceGroupName",
    "shareLineAppearanceCssName",
    "voiceMailProfileName",
    "patternPrecedence",
    "releaseClause",
    "hrDuration",
    "hrInterval",
    "cfaCssPolicy",
    "defaultActivatedDeviceName",
    "parkMonForwardNoRetrieveDn",
    "parkMonForwardNoRetrieveIntDn",
    "parkMonForwardNoRetrieveVmEnabled",
    "parkMonForwardNoRetrieveIntVmEnabled",
    "parkMonForwardNoRetrieveCssName",
    "parkMonForwardNoRetrieveIntCssName",
    "parkMonReversionTimer",
    "partyEntranceTone",
    "allowCtiControlFlag",
    "rejectAnonymousCall",
    "confidentialAccess",
    "externalCallControlProfile",
    "enterpriseAltNum",
    "e164AltNum",
    "pstnFailover",
    "associatedDevices"
})
public class LLine {

    protected String pattern;
    protected String description;
    protected String usage;
    protected XFkType routePartitionName;
    protected XFkType aarNeighborhoodName;
    protected String aarDestinationMask;
    protected String aarKeepCallHistory;
    protected String aarVoiceMailEnabled;
    protected XFkType callPickupGroupName;
    protected String autoAnswer;
    protected String networkHoldMohAudioSourceId;
    protected String userHoldMohAudioSourceId;
    protected String alertingName;
    protected String asciiAlertingName;
    protected XFkType presenceGroupName;
    protected XFkType shareLineAppearanceCssName;
    protected XFkType voiceMailProfileName;
    protected String patternPrecedence;
    protected String releaseClause;
    protected String hrDuration;
    protected String hrInterval;
    protected String cfaCssPolicy;
    protected XFkType defaultActivatedDeviceName;
    protected String parkMonForwardNoRetrieveDn;
    protected String parkMonForwardNoRetrieveIntDn;
    protected String parkMonForwardNoRetrieveVmEnabled;
    protected String parkMonForwardNoRetrieveIntVmEnabled;
    protected XFkType parkMonForwardNoRetrieveCssName;
    protected XFkType parkMonForwardNoRetrieveIntCssName;
    protected String parkMonReversionTimer;
    protected String partyEntranceTone;
    protected String allowCtiControlFlag;
    protected String rejectAnonymousCall;
    protected LLine.ConfidentialAccess confidentialAccess;
    protected XFkType externalCallControlProfile;
    protected LLine.EnterpriseAltNum enterpriseAltNum;
    protected LLine.E164AltNum e164AltNum;
    protected String pstnFailover;
    protected LLine.AssociatedDevices associatedDevices;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setRoutePartitionName(XFkType value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarNeighborhoodName(XFkType value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the aarDestinationMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarDestinationMask() {
        return aarDestinationMask;
    }

    /**
     * Sets the value of the aarDestinationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarDestinationMask(String value) {
        this.aarDestinationMask = value;
    }

    /**
     * Gets the value of the aarKeepCallHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarKeepCallHistory() {
        return aarKeepCallHistory;
    }

    /**
     * Sets the value of the aarKeepCallHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarKeepCallHistory(String value) {
        this.aarKeepCallHistory = value;
    }

    /**
     * Gets the value of the aarVoiceMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAarVoiceMailEnabled() {
        return aarVoiceMailEnabled;
    }

    /**
     * Sets the value of the aarVoiceMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAarVoiceMailEnabled(String value) {
        this.aarVoiceMailEnabled = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallPickupGroupName(XFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoAnswer(String value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(String value) {
        this.networkHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSourceId(String value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the alertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingName() {
        return alertingName;
    }

    /**
     * Sets the value of the alertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingName(String value) {
        this.alertingName = value;
    }

    /**
     * Gets the value of the asciiAlertingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsciiAlertingName() {
        return asciiAlertingName;
    }

    /**
     * Sets the value of the asciiAlertingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsciiAlertingName(String value) {
        this.asciiAlertingName = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the shareLineAppearanceCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getShareLineAppearanceCssName() {
        return shareLineAppearanceCssName;
    }

    /**
     * Sets the value of the shareLineAppearanceCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setShareLineAppearanceCssName(XFkType value) {
        this.shareLineAppearanceCssName = value;
    }

    /**
     * Gets the value of the voiceMailProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVoiceMailProfileName() {
        return voiceMailProfileName;
    }

    /**
     * Sets the value of the voiceMailProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVoiceMailProfileName(XFkType value) {
        this.voiceMailProfileName = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPrecedence(String value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseClause(String value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the hrDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrDuration() {
        return hrDuration;
    }

    /**
     * Sets the value of the hrDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrDuration(String value) {
        this.hrDuration = value;
    }

    /**
     * Gets the value of the hrInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrInterval() {
        return hrInterval;
    }

    /**
     * Sets the value of the hrInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrInterval(String value) {
        this.hrInterval = value;
    }

    /**
     * Gets the value of the cfaCssPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfaCssPolicy() {
        return cfaCssPolicy;
    }

    /**
     * Sets the value of the cfaCssPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfaCssPolicy(String value) {
        this.cfaCssPolicy = value;
    }

    /**
     * Gets the value of the defaultActivatedDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultActivatedDeviceName() {
        return defaultActivatedDeviceName;
    }

    /**
     * Sets the value of the defaultActivatedDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultActivatedDeviceName(XFkType value) {
        this.defaultActivatedDeviceName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveDn() {
        return parkMonForwardNoRetrieveDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveDn(String value) {
        this.parkMonForwardNoRetrieveDn = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveIntDn() {
        return parkMonForwardNoRetrieveIntDn;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveIntDn(String value) {
        this.parkMonForwardNoRetrieveIntDn = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveVmEnabled() {
        return parkMonForwardNoRetrieveVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveVmEnabled(String value) {
        this.parkMonForwardNoRetrieveVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonForwardNoRetrieveIntVmEnabled() {
        return parkMonForwardNoRetrieveIntVmEnabled;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntVmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonForwardNoRetrieveIntVmEnabled(String value) {
        this.parkMonForwardNoRetrieveIntVmEnabled = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getParkMonForwardNoRetrieveCssName() {
        return parkMonForwardNoRetrieveCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveCssName(XFkType value) {
        this.parkMonForwardNoRetrieveCssName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getParkMonForwardNoRetrieveIntCssName() {
        return parkMonForwardNoRetrieveIntCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveIntCssName(XFkType value) {
        this.parkMonForwardNoRetrieveIntCssName = value;
    }

    /**
     * Gets the value of the parkMonReversionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonReversionTimer() {
        return parkMonReversionTimer;
    }

    /**
     * Sets the value of the parkMonReversionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonReversionTimer(String value) {
        this.parkMonReversionTimer = value;
    }

    /**
     * Gets the value of the partyEntranceTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyEntranceTone() {
        return partyEntranceTone;
    }

    /**
     * Sets the value of the partyEntranceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyEntranceTone(String value) {
        this.partyEntranceTone = value;
    }

    /**
     * Gets the value of the allowCtiControlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCtiControlFlag() {
        return allowCtiControlFlag;
    }

    /**
     * Sets the value of the allowCtiControlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCtiControlFlag(String value) {
        this.allowCtiControlFlag = value;
    }

    /**
     * Gets the value of the rejectAnonymousCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectAnonymousCall() {
        return rejectAnonymousCall;
    }

    /**
     * Sets the value of the rejectAnonymousCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectAnonymousCall(String value) {
        this.rejectAnonymousCall = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link LLine.ConfidentialAccess }
     *     
     */
    public LLine.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLine.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(LLine.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setExternalCallControlProfile(XFkType value) {
        this.externalCallControlProfile = value;
    }

    /**
     * Gets the value of the enterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link LLine.EnterpriseAltNum }
     *     
     */
    public LLine.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLine.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(LLine.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link LLine.E164AltNum }
     *     
     */
    public LLine.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLine.E164AltNum }
     *     
     */
    public void setE164AltNum(LLine.E164AltNum value) {
        this.e164AltNum = value;
    }

    /**
     * Gets the value of the pstnFailover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnFailover() {
        return pstnFailover;
    }

    /**
     * Sets the value of the pstnFailover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnFailover(String value) {
        this.pstnFailover = value;
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link LLine.AssociatedDevices }
     *     
     */
    public LLine.AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLine.AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(LLine.AssociatedDevices value) {
        this.associatedDevices = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="device" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "device"
    })
    public static class AssociatedDevices {

        protected List<String> device;

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDevice() {
            if (device == null) {
                device = new ArrayList<String>();
            }
            return this.device;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode" minOccurs="0"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
        "confidentialAccessMode",
        "confidentialAccessLevel"
    })
    public static class ConfidentialAccess {

        protected String confidentialAccessMode;
        protected String confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessMode(String value) {
            this.confidentialAccessMode = value;
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialAccessLevel(String value) {
            this.confidentialAccessLevel = value;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "numMask",
        "isUrgent",
        "addLocalRoutePartition",
        "routePartition",
        "advertiseGloballyIls"
    })
    public static class E164AltNum {

        protected String numMask;
        protected String isUrgent;
        protected String addLocalRoutePartition;
        protected XFkType routePartition;
        protected String advertiseGloballyIls;

        /**
         * Gets the value of the numMask property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumMask() {
            return numMask;
        }

        /**
         * Sets the value of the numMask property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumMask(String value) {
            this.numMask = value;
        }

        /**
         * Gets the value of the isUrgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsUrgent() {
            return isUrgent;
        }

        /**
         * Sets the value of the isUrgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsUrgent(String value) {
            this.isUrgent = value;
        }

        /**
         * Gets the value of the addLocalRoutePartition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddLocalRoutePartition() {
            return addLocalRoutePartition;
        }

        /**
         * Sets the value of the addLocalRoutePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddLocalRoutePartition(String value) {
            this.addLocalRoutePartition = value;
        }

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartition(XFkType value) {
            this.routePartition = value;
        }

        /**
         * Gets the value of the advertiseGloballyIls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvertiseGloballyIls() {
            return advertiseGloballyIls;
        }

        /**
         * Sets the value of the advertiseGloballyIls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvertiseGloballyIls(String value) {
            this.advertiseGloballyIls = value;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "numMask",
        "isUrgent",
        "addLocalRoutePartition",
        "routePartition",
        "advertiseGloballyIls"
    })
    public static class EnterpriseAltNum {

        protected String numMask;
        protected String isUrgent;
        protected String addLocalRoutePartition;
        protected XFkType routePartition;
        protected String advertiseGloballyIls;

        /**
         * Gets the value of the numMask property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumMask() {
            return numMask;
        }

        /**
         * Sets the value of the numMask property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumMask(String value) {
            this.numMask = value;
        }

        /**
         * Gets the value of the isUrgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsUrgent() {
            return isUrgent;
        }

        /**
         * Sets the value of the isUrgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsUrgent(String value) {
            this.isUrgent = value;
        }

        /**
         * Gets the value of the addLocalRoutePartition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddLocalRoutePartition() {
            return addLocalRoutePartition;
        }

        /**
         * Sets the value of the addLocalRoutePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddLocalRoutePartition(String value) {
            this.addLocalRoutePartition = value;
        }

        /**
         * Gets the value of the routePartition property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartition(XFkType value) {
            this.routePartition = value;
        }

        /**
         * Gets the value of the advertiseGloballyIls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvertiseGloballyIls() {
            return advertiseGloballyIls;
        }

        /**
         * Sets the value of the advertiseGloballyIls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvertiseGloballyIls(String value) {
            this.advertiseGloballyIls = value;
        }

    }

}
