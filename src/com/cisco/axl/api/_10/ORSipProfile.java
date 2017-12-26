
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORSipProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORSipProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userInfo" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dtmfDbLevel" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callHoldRingback" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="anonymousCallBlock" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callerIdBlock" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dndControl" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="telnetLevel" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="rerouteIncomingRequest" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceListName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="rsvpOverSip" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sipRe11XxEnabled" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="gClear" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sipBandwidthModifier" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="userAgentServerHeaderInfo" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sipNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dialStringInterpretation" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="acceptAudioCodecPreferences" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingLineIdentification" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="videoCallTrafficClass" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sdpTransparency" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sipSessionRefreshMethod" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="earlyOfferSuppVoiceCall" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="cucmVersionInSipHeader" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccessLevelHeaders" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
@XmlType(name = "ORSipProfile", propOrder = {
    "userInfo",
    "dtmfDbLevel",
    "callHoldRingback",
    "anonymousCallBlock",
    "callerIdBlock",
    "dndControl",
    "telnetLevel",
    "rerouteIncomingRequest",
    "resourcePriorityNamespaceListName",
    "rsvpOverSip",
    "sipRe11XxEnabled",
    "gClear",
    "sipBandwidthModifier",
    "userAgentServerHeaderInfo",
    "sipNormalizationScript",
    "dialStringInterpretation",
    "acceptAudioCodecPreferences",
    "resourcePriorityNamespace",
    "callingLineIdentification",
    "videoCallTrafficClass",
    "sdpTransparency",
    "sipSessionRefreshMethod",
    "earlyOfferSuppVoiceCall",
    "cucmVersionInSipHeader",
    "confidentialAccessLevelHeaders"
})
public class ORSipProfile {

    protected ORFkType userInfo;
    protected ORFkType dtmfDbLevel;
    protected ORFkType callHoldRingback;
    protected ORFkType anonymousCallBlock;
    protected ORFkType callerIdBlock;
    protected ORFkType dndControl;
    protected ORFkType telnetLevel;
    protected ORFkType rerouteIncomingRequest;
    protected ORFkType resourcePriorityNamespaceListName;
    protected ORFkType rsvpOverSip;
    protected ORFkType sipRe11XxEnabled;
    protected ORFkType gClear;
    protected ORFkType sipBandwidthModifier;
    protected ORFkType userAgentServerHeaderInfo;
    protected ORFkType sipNormalizationScript;
    protected ORFkType dialStringInterpretation;
    protected ORFkType acceptAudioCodecPreferences;
    protected ORFkType resourcePriorityNamespace;
    protected ORFkType callingLineIdentification;
    protected ORFkType videoCallTrafficClass;
    protected ORFkType sdpTransparency;
    protected ORFkType sipSessionRefreshMethod;
    protected ORFkType earlyOfferSuppVoiceCall;
    protected ORFkType cucmVersionInSipHeader;
    protected ORFkType confidentialAccessLevelHeaders;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUserInfo(ORFkType value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the dtmfDbLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDtmfDbLevel() {
        return dtmfDbLevel;
    }

    /**
     * Sets the value of the dtmfDbLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDtmfDbLevel(ORFkType value) {
        this.dtmfDbLevel = value;
    }

    /**
     * Gets the value of the callHoldRingback property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallHoldRingback() {
        return callHoldRingback;
    }

    /**
     * Sets the value of the callHoldRingback property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallHoldRingback(ORFkType value) {
        this.callHoldRingback = value;
    }

    /**
     * Gets the value of the anonymousCallBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAnonymousCallBlock() {
        return anonymousCallBlock;
    }

    /**
     * Sets the value of the anonymousCallBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAnonymousCallBlock(ORFkType value) {
        this.anonymousCallBlock = value;
    }

    /**
     * Gets the value of the callerIdBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallerIdBlock() {
        return callerIdBlock;
    }

    /**
     * Sets the value of the callerIdBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallerIdBlock(ORFkType value) {
        this.callerIdBlock = value;
    }

    /**
     * Gets the value of the dndControl property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDndControl() {
        return dndControl;
    }

    /**
     * Sets the value of the dndControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDndControl(ORFkType value) {
        this.dndControl = value;
    }

    /**
     * Gets the value of the telnetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getTelnetLevel() {
        return telnetLevel;
    }

    /**
     * Sets the value of the telnetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setTelnetLevel(ORFkType value) {
        this.telnetLevel = value;
    }

    /**
     * Gets the value of the rerouteIncomingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRerouteIncomingRequest() {
        return rerouteIncomingRequest;
    }

    /**
     * Sets the value of the rerouteIncomingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRerouteIncomingRequest(ORFkType value) {
        this.rerouteIncomingRequest = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceListName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getResourcePriorityNamespaceListName() {
        return resourcePriorityNamespaceListName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setResourcePriorityNamespaceListName(ORFkType value) {
        this.resourcePriorityNamespaceListName = value;
    }

    /**
     * Gets the value of the rsvpOverSip property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRsvpOverSip() {
        return rsvpOverSip;
    }

    /**
     * Sets the value of the rsvpOverSip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRsvpOverSip(ORFkType value) {
        this.rsvpOverSip = value;
    }

    /**
     * Gets the value of the sipRe11XxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSipRe11XxEnabled() {
        return sipRe11XxEnabled;
    }

    /**
     * Sets the value of the sipRe11XxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSipRe11XxEnabled(ORFkType value) {
        this.sipRe11XxEnabled = value;
    }

    /**
     * Gets the value of the gClear property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getGClear() {
        return gClear;
    }

    /**
     * Sets the value of the gClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setGClear(ORFkType value) {
        this.gClear = value;
    }

    /**
     * Gets the value of the sipBandwidthModifier property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSipBandwidthModifier() {
        return sipBandwidthModifier;
    }

    /**
     * Sets the value of the sipBandwidthModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSipBandwidthModifier(ORFkType value) {
        this.sipBandwidthModifier = value;
    }

    /**
     * Gets the value of the userAgentServerHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUserAgentServerHeaderInfo() {
        return userAgentServerHeaderInfo;
    }

    /**
     * Sets the value of the userAgentServerHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUserAgentServerHeaderInfo(ORFkType value) {
        this.userAgentServerHeaderInfo = value;
    }

    /**
     * Gets the value of the sipNormalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSipNormalizationScript() {
        return sipNormalizationScript;
    }

    /**
     * Sets the value of the sipNormalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSipNormalizationScript(ORFkType value) {
        this.sipNormalizationScript = value;
    }

    /**
     * Gets the value of the dialStringInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDialStringInterpretation() {
        return dialStringInterpretation;
    }

    /**
     * Sets the value of the dialStringInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDialStringInterpretation(ORFkType value) {
        this.dialStringInterpretation = value;
    }

    /**
     * Gets the value of the acceptAudioCodecPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAcceptAudioCodecPreferences() {
        return acceptAudioCodecPreferences;
    }

    /**
     * Sets the value of the acceptAudioCodecPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAcceptAudioCodecPreferences(ORFkType value) {
        this.acceptAudioCodecPreferences = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getResourcePriorityNamespace() {
        return resourcePriorityNamespace;
    }

    /**
     * Sets the value of the resourcePriorityNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setResourcePriorityNamespace(ORFkType value) {
        this.resourcePriorityNamespace = value;
    }

    /**
     * Gets the value of the callingLineIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingLineIdentification() {
        return callingLineIdentification;
    }

    /**
     * Sets the value of the callingLineIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingLineIdentification(ORFkType value) {
        this.callingLineIdentification = value;
    }

    /**
     * Gets the value of the videoCallTrafficClass property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getVideoCallTrafficClass() {
        return videoCallTrafficClass;
    }

    /**
     * Sets the value of the videoCallTrafficClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setVideoCallTrafficClass(ORFkType value) {
        this.videoCallTrafficClass = value;
    }

    /**
     * Gets the value of the sdpTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSdpTransparency() {
        return sdpTransparency;
    }

    /**
     * Sets the value of the sdpTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSdpTransparency(ORFkType value) {
        this.sdpTransparency = value;
    }

    /**
     * Gets the value of the sipSessionRefreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSipSessionRefreshMethod() {
        return sipSessionRefreshMethod;
    }

    /**
     * Sets the value of the sipSessionRefreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSipSessionRefreshMethod(ORFkType value) {
        this.sipSessionRefreshMethod = value;
    }

    /**
     * Gets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getEarlyOfferSuppVoiceCall() {
        return earlyOfferSuppVoiceCall;
    }

    /**
     * Sets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setEarlyOfferSuppVoiceCall(ORFkType value) {
        this.earlyOfferSuppVoiceCall = value;
    }

    /**
     * Gets the value of the cucmVersionInSipHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCucmVersionInSipHeader() {
        return cucmVersionInSipHeader;
    }

    /**
     * Sets the value of the cucmVersionInSipHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCucmVersionInSipHeader(ORFkType value) {
        this.cucmVersionInSipHeader = value;
    }

    /**
     * Gets the value of the confidentialAccessLevelHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getConfidentialAccessLevelHeaders() {
        return confidentialAccessLevelHeaders;
    }

    /**
     * Sets the value of the confidentialAccessLevelHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setConfidentialAccessLevelHeaders(ORFkType value) {
        this.confidentialAccessLevelHeaders = value;
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
