
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXSipProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXSipProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="userInfo" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dtmfDbLevel" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callHoldRingback" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="anonymousCallBlock" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callerIdBlock" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dndControl" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="telnetLevel" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="rerouteIncomingRequest" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceListName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="rsvpOverSip" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="sipRe11XxEnabled" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="gClear" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="sipBandwidthModifier" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="userAgentServerHeaderInfo" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="sipNormalizationScript" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dialStringInterpretation" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="acceptAudioCodecPreferences" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespace" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingLineIdentification" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="videoCallTrafficClass" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="sdpTransparency" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="sipSessionRefreshMethod" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="earlyOfferSuppVoiceCall" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="cucmVersionInSipHeader" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccessLevelHeaders" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
@XmlType(name = "OXSipProfile", propOrder = {
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
public class OXSipProfile {

    protected OXFkType userInfo;
    protected OXFkType dtmfDbLevel;
    protected OXFkType callHoldRingback;
    protected OXFkType anonymousCallBlock;
    protected OXFkType callerIdBlock;
    protected OXFkType dndControl;
    protected OXFkType telnetLevel;
    protected OXFkType rerouteIncomingRequest;
    protected OXFkType resourcePriorityNamespaceListName;
    protected OXFkType rsvpOverSip;
    protected OXFkType sipRe11XxEnabled;
    protected OXFkType gClear;
    protected OXFkType sipBandwidthModifier;
    protected OXFkType userAgentServerHeaderInfo;
    protected OXFkType sipNormalizationScript;
    protected OXFkType dialStringInterpretation;
    protected OXFkType acceptAudioCodecPreferences;
    protected OXFkType resourcePriorityNamespace;
    protected OXFkType callingLineIdentification;
    protected OXFkType videoCallTrafficClass;
    protected OXFkType sdpTransparency;
    protected OXFkType sipSessionRefreshMethod;
    protected OXFkType earlyOfferSuppVoiceCall;
    protected OXFkType cucmVersionInSipHeader;
    protected OXFkType confidentialAccessLevelHeaders;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUserInfo(OXFkType value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the dtmfDbLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDtmfDbLevel() {
        return dtmfDbLevel;
    }

    /**
     * Sets the value of the dtmfDbLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDtmfDbLevel(OXFkType value) {
        this.dtmfDbLevel = value;
    }

    /**
     * Gets the value of the callHoldRingback property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallHoldRingback() {
        return callHoldRingback;
    }

    /**
     * Sets the value of the callHoldRingback property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallHoldRingback(OXFkType value) {
        this.callHoldRingback = value;
    }

    /**
     * Gets the value of the anonymousCallBlock property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAnonymousCallBlock() {
        return anonymousCallBlock;
    }

    /**
     * Sets the value of the anonymousCallBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAnonymousCallBlock(OXFkType value) {
        this.anonymousCallBlock = value;
    }

    /**
     * Gets the value of the callerIdBlock property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallerIdBlock() {
        return callerIdBlock;
    }

    /**
     * Sets the value of the callerIdBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallerIdBlock(OXFkType value) {
        this.callerIdBlock = value;
    }

    /**
     * Gets the value of the dndControl property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDndControl() {
        return dndControl;
    }

    /**
     * Sets the value of the dndControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDndControl(OXFkType value) {
        this.dndControl = value;
    }

    /**
     * Gets the value of the telnetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getTelnetLevel() {
        return telnetLevel;
    }

    /**
     * Sets the value of the telnetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setTelnetLevel(OXFkType value) {
        this.telnetLevel = value;
    }

    /**
     * Gets the value of the rerouteIncomingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRerouteIncomingRequest() {
        return rerouteIncomingRequest;
    }

    /**
     * Sets the value of the rerouteIncomingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRerouteIncomingRequest(OXFkType value) {
        this.rerouteIncomingRequest = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceListName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getResourcePriorityNamespaceListName() {
        return resourcePriorityNamespaceListName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setResourcePriorityNamespaceListName(OXFkType value) {
        this.resourcePriorityNamespaceListName = value;
    }

    /**
     * Gets the value of the rsvpOverSip property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRsvpOverSip() {
        return rsvpOverSip;
    }

    /**
     * Sets the value of the rsvpOverSip property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRsvpOverSip(OXFkType value) {
        this.rsvpOverSip = value;
    }

    /**
     * Gets the value of the sipRe11XxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSipRe11XxEnabled() {
        return sipRe11XxEnabled;
    }

    /**
     * Sets the value of the sipRe11XxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSipRe11XxEnabled(OXFkType value) {
        this.sipRe11XxEnabled = value;
    }

    /**
     * Gets the value of the gClear property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getGClear() {
        return gClear;
    }

    /**
     * Sets the value of the gClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setGClear(OXFkType value) {
        this.gClear = value;
    }

    /**
     * Gets the value of the sipBandwidthModifier property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSipBandwidthModifier() {
        return sipBandwidthModifier;
    }

    /**
     * Sets the value of the sipBandwidthModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSipBandwidthModifier(OXFkType value) {
        this.sipBandwidthModifier = value;
    }

    /**
     * Gets the value of the userAgentServerHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUserAgentServerHeaderInfo() {
        return userAgentServerHeaderInfo;
    }

    /**
     * Sets the value of the userAgentServerHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUserAgentServerHeaderInfo(OXFkType value) {
        this.userAgentServerHeaderInfo = value;
    }

    /**
     * Gets the value of the sipNormalizationScript property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSipNormalizationScript() {
        return sipNormalizationScript;
    }

    /**
     * Sets the value of the sipNormalizationScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSipNormalizationScript(OXFkType value) {
        this.sipNormalizationScript = value;
    }

    /**
     * Gets the value of the dialStringInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDialStringInterpretation() {
        return dialStringInterpretation;
    }

    /**
     * Sets the value of the dialStringInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDialStringInterpretation(OXFkType value) {
        this.dialStringInterpretation = value;
    }

    /**
     * Gets the value of the acceptAudioCodecPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAcceptAudioCodecPreferences() {
        return acceptAudioCodecPreferences;
    }

    /**
     * Sets the value of the acceptAudioCodecPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAcceptAudioCodecPreferences(OXFkType value) {
        this.acceptAudioCodecPreferences = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getResourcePriorityNamespace() {
        return resourcePriorityNamespace;
    }

    /**
     * Sets the value of the resourcePriorityNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setResourcePriorityNamespace(OXFkType value) {
        this.resourcePriorityNamespace = value;
    }

    /**
     * Gets the value of the callingLineIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingLineIdentification() {
        return callingLineIdentification;
    }

    /**
     * Sets the value of the callingLineIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingLineIdentification(OXFkType value) {
        this.callingLineIdentification = value;
    }

    /**
     * Gets the value of the videoCallTrafficClass property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getVideoCallTrafficClass() {
        return videoCallTrafficClass;
    }

    /**
     * Sets the value of the videoCallTrafficClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setVideoCallTrafficClass(OXFkType value) {
        this.videoCallTrafficClass = value;
    }

    /**
     * Gets the value of the sdpTransparency property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSdpTransparency() {
        return sdpTransparency;
    }

    /**
     * Sets the value of the sdpTransparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSdpTransparency(OXFkType value) {
        this.sdpTransparency = value;
    }

    /**
     * Gets the value of the sipSessionRefreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSipSessionRefreshMethod() {
        return sipSessionRefreshMethod;
    }

    /**
     * Sets the value of the sipSessionRefreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSipSessionRefreshMethod(OXFkType value) {
        this.sipSessionRefreshMethod = value;
    }

    /**
     * Gets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getEarlyOfferSuppVoiceCall() {
        return earlyOfferSuppVoiceCall;
    }

    /**
     * Sets the value of the earlyOfferSuppVoiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setEarlyOfferSuppVoiceCall(OXFkType value) {
        this.earlyOfferSuppVoiceCall = value;
    }

    /**
     * Gets the value of the cucmVersionInSipHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCucmVersionInSipHeader() {
        return cucmVersionInSipHeader;
    }

    /**
     * Sets the value of the cucmVersionInSipHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCucmVersionInSipHeader(OXFkType value) {
        this.cucmVersionInSipHeader = value;
    }

    /**
     * Gets the value of the confidentialAccessLevelHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getConfidentialAccessLevelHeaders() {
        return confidentialAccessLevelHeaders;
    }

    /**
     * Sets the value of the confidentialAccessLevelHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setConfidentialAccessLevelHeaders(OXFkType value) {
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
