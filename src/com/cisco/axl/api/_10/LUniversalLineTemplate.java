
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LUniversalLineTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LUniversalLineTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urgentPriority" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="lineDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="alertingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extCallControlProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="blfPresenceGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callPickupGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/10.5}XAutoAnswer" minOccurs="0"/>
 *         &lt;element name="rejectAnonymousCall" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSource" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSource" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="aarDestinationMask" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="aarGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="retainDestInCallFwdHistory" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="forwardDestAllCalls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="primaryCssForwardingAllCalls" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="secondaryCssForwardingAllCalls" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="CssActivationPolicy" type="{http://www.cisco.com/AXL/API/10.5}XCFACSSActivationPolicy" minOccurs="0"/>
 *         &lt;element name="fwdDestExtCallsWhenNotRetrieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cssFwdExtCallsWhenNotRetrieved" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="fwdDestInternalCallsWhenNotRetrieved" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="cssFwdInternalCallsWhenNotRetrieved" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="parkMonitorReversionTime" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mlppCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mlppNoAnsRingDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
 *         &lt;element name="holdReversionRingDuration" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="holdReversionNotificationInterval" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="busyIntCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="busyIntCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="busyExtCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="busyExtCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noAnsIntCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="noAnsIntCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noAnsExtCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="noAnsExtCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noCoverageIntCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="noCoverageIntCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noCoverageExtCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="noCoverageExtCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="unregisteredIntCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="unregisteredIntCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="unregisteredExtCallsDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="unregisteredExtCallsCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="ctiFailureDestination" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ctiFailureCss" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="callControlAgentProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseAltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}LEnterpriseAltNum" minOccurs="0"/>
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
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}LE164AltNum" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="advertisedFailoverNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LUniversalLineTemplate", propOrder = {
    "name",
    "urgentPriority",
    "lineDescription",
    "routePartition",
    "voiceMailProfile",
    "callingSearchSpace",
    "alertingName",
    "extCallControlProfile",
    "blfPresenceGroup",
    "callPickupGroup",
    "partyEntranceTone",
    "autoAnswer",
    "rejectAnonymousCall",
    "userHoldMohAudioSource",
    "networkHoldMohAudioSource",
    "aarDestinationMask",
    "aarGroup",
    "retainDestInCallFwdHistory",
    "forwardDestAllCalls",
    "primaryCssForwardingAllCalls",
    "secondaryCssForwardingAllCalls",
    "cssActivationPolicy",
    "fwdDestExtCallsWhenNotRetrieved",
    "cssFwdExtCallsWhenNotRetrieved",
    "fwdDestInternalCallsWhenNotRetrieved",
    "cssFwdInternalCallsWhenNotRetrieved",
    "parkMonitorReversionTime",
    "target",
    "mlppCss",
    "mlppNoAnsRingDuration",
    "confidentialAccess",
    "holdReversionRingDuration",
    "holdReversionNotificationInterval",
    "busyIntCallsDestination",
    "busyIntCallsCss",
    "busyExtCallsDestination",
    "busyExtCallsCss",
    "noAnsIntCallsDestination",
    "noAnsIntCallsCss",
    "noAnsExtCallsDestination",
    "noAnsExtCallsCss",
    "noCoverageIntCallsDestination",
    "noCoverageIntCallsCss",
    "noCoverageExtCallsDestination",
    "noCoverageExtCallsCss",
    "unregisteredIntCallsDestination",
    "unregisteredIntCallsCss",
    "unregisteredExtCallsDestination",
    "unregisteredExtCallsCss",
    "ctiFailureDestination",
    "ctiFailureCss",
    "callControlAgentProfile",
    "enterpriseAltNum",
    "e164AltNum",
    "advertisedFailoverNumber"
})
public class LUniversalLineTemplate {

    protected String name;
    protected String urgentPriority;
    protected String lineDescription;
    protected XFkType routePartition;
    protected XFkType voiceMailProfile;
    protected XFkType callingSearchSpace;
    protected String alertingName;
    protected XFkType extCallControlProfile;
    protected XFkType blfPresenceGroup;
    protected XFkType callPickupGroup;
    protected String partyEntranceTone;
    protected String autoAnswer;
    protected String rejectAnonymousCall;
    protected String userHoldMohAudioSource;
    protected String networkHoldMohAudioSource;
    protected String aarDestinationMask;
    protected XFkType aarGroup;
    protected String retainDestInCallFwdHistory;
    protected String forwardDestAllCalls;
    protected XFkType primaryCssForwardingAllCalls;
    protected XFkType secondaryCssForwardingAllCalls;
    @XmlElement(name = "CssActivationPolicy")
    protected String cssActivationPolicy;
    protected String fwdDestExtCallsWhenNotRetrieved;
    protected XFkType cssFwdExtCallsWhenNotRetrieved;
    protected String fwdDestInternalCallsWhenNotRetrieved;
    protected XFkType cssFwdInternalCallsWhenNotRetrieved;
    protected String parkMonitorReversionTime;
    protected String target;
    protected XFkType mlppCss;
    protected String mlppNoAnsRingDuration;
    protected LUniversalLineTemplate.ConfidentialAccess confidentialAccess;
    protected String holdReversionRingDuration;
    protected String holdReversionNotificationInterval;
    protected String busyIntCallsDestination;
    protected XFkType busyIntCallsCss;
    protected String busyExtCallsDestination;
    protected XFkType busyExtCallsCss;
    protected String noAnsIntCallsDestination;
    protected XFkType noAnsIntCallsCss;
    protected String noAnsExtCallsDestination;
    protected XFkType noAnsExtCallsCss;
    protected String noCoverageIntCallsDestination;
    protected XFkType noCoverageIntCallsCss;
    protected String noCoverageExtCallsDestination;
    protected XFkType noCoverageExtCallsCss;
    protected String unregisteredIntCallsDestination;
    protected XFkType unregisteredIntCallsCss;
    protected String unregisteredExtCallsDestination;
    protected XFkType unregisteredExtCallsCss;
    protected String ctiFailureDestination;
    protected XFkType ctiFailureCss;
    protected String callControlAgentProfile;
    protected LUniversalLineTemplate.EnterpriseAltNum enterpriseAltNum;
    protected LUniversalLineTemplate.E164AltNum e164AltNum;
    protected String advertisedFailoverNumber;
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
     * Gets the value of the urgentPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgentPriority() {
        return urgentPriority;
    }

    /**
     * Sets the value of the urgentPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgentPriority(String value) {
        this.urgentPriority = value;
    }

    /**
     * Gets the value of the lineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDescription() {
        return lineDescription;
    }

    /**
     * Sets the value of the lineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDescription(String value) {
        this.lineDescription = value;
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
     * Gets the value of the voiceMailProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getVoiceMailProfile() {
        return voiceMailProfile;
    }

    /**
     * Sets the value of the voiceMailProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setVoiceMailProfile(XFkType value) {
        this.voiceMailProfile = value;
    }

    /**
     * Gets the value of the callingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpace() {
        return callingSearchSpace;
    }

    /**
     * Sets the value of the callingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpace(XFkType value) {
        this.callingSearchSpace = value;
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
     * Gets the value of the extCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getExtCallControlProfile() {
        return extCallControlProfile;
    }

    /**
     * Sets the value of the extCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setExtCallControlProfile(XFkType value) {
        this.extCallControlProfile = value;
    }

    /**
     * Gets the value of the blfPresenceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBlfPresenceGroup() {
        return blfPresenceGroup;
    }

    /**
     * Sets the value of the blfPresenceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBlfPresenceGroup(XFkType value) {
        this.blfPresenceGroup = value;
    }

    /**
     * Gets the value of the callPickupGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallPickupGroup() {
        return callPickupGroup;
    }

    /**
     * Sets the value of the callPickupGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallPickupGroup(XFkType value) {
        this.callPickupGroup = value;
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
     * Gets the value of the userHoldMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserHoldMohAudioSource() {
        return userHoldMohAudioSource;
    }

    /**
     * Sets the value of the userHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserHoldMohAudioSource(String value) {
        this.userHoldMohAudioSource = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSource() {
        return networkHoldMohAudioSource;
    }

    /**
     * Sets the value of the networkHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSource(String value) {
        this.networkHoldMohAudioSource = value;
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
     * Gets the value of the aarGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getAarGroup() {
        return aarGroup;
    }

    /**
     * Sets the value of the aarGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setAarGroup(XFkType value) {
        this.aarGroup = value;
    }

    /**
     * Gets the value of the retainDestInCallFwdHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainDestInCallFwdHistory() {
        return retainDestInCallFwdHistory;
    }

    /**
     * Sets the value of the retainDestInCallFwdHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainDestInCallFwdHistory(String value) {
        this.retainDestInCallFwdHistory = value;
    }

    /**
     * Gets the value of the forwardDestAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardDestAllCalls() {
        return forwardDestAllCalls;
    }

    /**
     * Sets the value of the forwardDestAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardDestAllCalls(String value) {
        this.forwardDestAllCalls = value;
    }

    /**
     * Gets the value of the primaryCssForwardingAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryCssForwardingAllCalls() {
        return primaryCssForwardingAllCalls;
    }

    /**
     * Sets the value of the primaryCssForwardingAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryCssForwardingAllCalls(XFkType value) {
        this.primaryCssForwardingAllCalls = value;
    }

    /**
     * Gets the value of the secondaryCssForwardingAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getSecondaryCssForwardingAllCalls() {
        return secondaryCssForwardingAllCalls;
    }

    /**
     * Sets the value of the secondaryCssForwardingAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setSecondaryCssForwardingAllCalls(XFkType value) {
        this.secondaryCssForwardingAllCalls = value;
    }

    /**
     * Gets the value of the cssActivationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssActivationPolicy() {
        return cssActivationPolicy;
    }

    /**
     * Sets the value of the cssActivationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssActivationPolicy(String value) {
        this.cssActivationPolicy = value;
    }

    /**
     * Gets the value of the fwdDestExtCallsWhenNotRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdDestExtCallsWhenNotRetrieved() {
        return fwdDestExtCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the fwdDestExtCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdDestExtCallsWhenNotRetrieved(String value) {
        this.fwdDestExtCallsWhenNotRetrieved = value;
    }

    /**
     * Gets the value of the cssFwdExtCallsWhenNotRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCssFwdExtCallsWhenNotRetrieved() {
        return cssFwdExtCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the cssFwdExtCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCssFwdExtCallsWhenNotRetrieved(XFkType value) {
        this.cssFwdExtCallsWhenNotRetrieved = value;
    }

    /**
     * Gets the value of the fwdDestInternalCallsWhenNotRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdDestInternalCallsWhenNotRetrieved() {
        return fwdDestInternalCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the fwdDestInternalCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdDestInternalCallsWhenNotRetrieved(String value) {
        this.fwdDestInternalCallsWhenNotRetrieved = value;
    }

    /**
     * Gets the value of the cssFwdInternalCallsWhenNotRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCssFwdInternalCallsWhenNotRetrieved() {
        return cssFwdInternalCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the cssFwdInternalCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCssFwdInternalCallsWhenNotRetrieved(XFkType value) {
        this.cssFwdInternalCallsWhenNotRetrieved = value;
    }

    /**
     * Gets the value of the parkMonitorReversionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkMonitorReversionTime() {
        return parkMonitorReversionTime;
    }

    /**
     * Sets the value of the parkMonitorReversionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkMonitorReversionTime(String value) {
        this.parkMonitorReversionTime = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the mlppCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMlppCss() {
        return mlppCss;
    }

    /**
     * Sets the value of the mlppCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMlppCss(XFkType value) {
        this.mlppCss = value;
    }

    /**
     * Gets the value of the mlppNoAnsRingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppNoAnsRingDuration() {
        return mlppNoAnsRingDuration;
    }

    /**
     * Sets the value of the mlppNoAnsRingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppNoAnsRingDuration(String value) {
        this.mlppNoAnsRingDuration = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link LUniversalLineTemplate.ConfidentialAccess }
     *     
     */
    public LUniversalLineTemplate.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link LUniversalLineTemplate.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(LUniversalLineTemplate.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the holdReversionRingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReversionRingDuration() {
        return holdReversionRingDuration;
    }

    /**
     * Sets the value of the holdReversionRingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReversionRingDuration(String value) {
        this.holdReversionRingDuration = value;
    }

    /**
     * Gets the value of the holdReversionNotificationInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldReversionNotificationInterval() {
        return holdReversionNotificationInterval;
    }

    /**
     * Sets the value of the holdReversionNotificationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldReversionNotificationInterval(String value) {
        this.holdReversionNotificationInterval = value;
    }

    /**
     * Gets the value of the busyIntCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyIntCallsDestination() {
        return busyIntCallsDestination;
    }

    /**
     * Sets the value of the busyIntCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyIntCallsDestination(String value) {
        this.busyIntCallsDestination = value;
    }

    /**
     * Gets the value of the busyIntCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBusyIntCallsCss() {
        return busyIntCallsCss;
    }

    /**
     * Sets the value of the busyIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBusyIntCallsCss(XFkType value) {
        this.busyIntCallsCss = value;
    }

    /**
     * Gets the value of the busyExtCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyExtCallsDestination() {
        return busyExtCallsDestination;
    }

    /**
     * Sets the value of the busyExtCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyExtCallsDestination(String value) {
        this.busyExtCallsDestination = value;
    }

    /**
     * Gets the value of the busyExtCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getBusyExtCallsCss() {
        return busyExtCallsCss;
    }

    /**
     * Sets the value of the busyExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setBusyExtCallsCss(XFkType value) {
        this.busyExtCallsCss = value;
    }

    /**
     * Gets the value of the noAnsIntCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAnsIntCallsDestination() {
        return noAnsIntCallsDestination;
    }

    /**
     * Sets the value of the noAnsIntCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAnsIntCallsDestination(String value) {
        this.noAnsIntCallsDestination = value;
    }

    /**
     * Gets the value of the noAnsIntCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNoAnsIntCallsCss() {
        return noAnsIntCallsCss;
    }

    /**
     * Sets the value of the noAnsIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNoAnsIntCallsCss(XFkType value) {
        this.noAnsIntCallsCss = value;
    }

    /**
     * Gets the value of the noAnsExtCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAnsExtCallsDestination() {
        return noAnsExtCallsDestination;
    }

    /**
     * Sets the value of the noAnsExtCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAnsExtCallsDestination(String value) {
        this.noAnsExtCallsDestination = value;
    }

    /**
     * Gets the value of the noAnsExtCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNoAnsExtCallsCss() {
        return noAnsExtCallsCss;
    }

    /**
     * Sets the value of the noAnsExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNoAnsExtCallsCss(XFkType value) {
        this.noAnsExtCallsCss = value;
    }

    /**
     * Gets the value of the noCoverageIntCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCoverageIntCallsDestination() {
        return noCoverageIntCallsDestination;
    }

    /**
     * Sets the value of the noCoverageIntCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCoverageIntCallsDestination(String value) {
        this.noCoverageIntCallsDestination = value;
    }

    /**
     * Gets the value of the noCoverageIntCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNoCoverageIntCallsCss() {
        return noCoverageIntCallsCss;
    }

    /**
     * Sets the value of the noCoverageIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNoCoverageIntCallsCss(XFkType value) {
        this.noCoverageIntCallsCss = value;
    }

    /**
     * Gets the value of the noCoverageExtCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCoverageExtCallsDestination() {
        return noCoverageExtCallsDestination;
    }

    /**
     * Sets the value of the noCoverageExtCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCoverageExtCallsDestination(String value) {
        this.noCoverageExtCallsDestination = value;
    }

    /**
     * Gets the value of the noCoverageExtCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getNoCoverageExtCallsCss() {
        return noCoverageExtCallsCss;
    }

    /**
     * Sets the value of the noCoverageExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setNoCoverageExtCallsCss(XFkType value) {
        this.noCoverageExtCallsCss = value;
    }

    /**
     * Gets the value of the unregisteredIntCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnregisteredIntCallsDestination() {
        return unregisteredIntCallsDestination;
    }

    /**
     * Sets the value of the unregisteredIntCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnregisteredIntCallsDestination(String value) {
        this.unregisteredIntCallsDestination = value;
    }

    /**
     * Gets the value of the unregisteredIntCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUnregisteredIntCallsCss() {
        return unregisteredIntCallsCss;
    }

    /**
     * Sets the value of the unregisteredIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUnregisteredIntCallsCss(XFkType value) {
        this.unregisteredIntCallsCss = value;
    }

    /**
     * Gets the value of the unregisteredExtCallsDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnregisteredExtCallsDestination() {
        return unregisteredExtCallsDestination;
    }

    /**
     * Sets the value of the unregisteredExtCallsDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnregisteredExtCallsDestination(String value) {
        this.unregisteredExtCallsDestination = value;
    }

    /**
     * Gets the value of the unregisteredExtCallsCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUnregisteredExtCallsCss() {
        return unregisteredExtCallsCss;
    }

    /**
     * Sets the value of the unregisteredExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUnregisteredExtCallsCss(XFkType value) {
        this.unregisteredExtCallsCss = value;
    }

    /**
     * Gets the value of the ctiFailureDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtiFailureDestination() {
        return ctiFailureDestination;
    }

    /**
     * Sets the value of the ctiFailureDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtiFailureDestination(String value) {
        this.ctiFailureDestination = value;
    }

    /**
     * Gets the value of the ctiFailureCss property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCtiFailureCss() {
        return ctiFailureCss;
    }

    /**
     * Sets the value of the ctiFailureCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCtiFailureCss(XFkType value) {
        this.ctiFailureCss = value;
    }

    /**
     * Gets the value of the callControlAgentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallControlAgentProfile() {
        return callControlAgentProfile;
    }

    /**
     * Sets the value of the callControlAgentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallControlAgentProfile(String value) {
        this.callControlAgentProfile = value;
    }

    /**
     * Gets the value of the enterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link LUniversalLineTemplate.EnterpriseAltNum }
     *     
     */
    public LUniversalLineTemplate.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LUniversalLineTemplate.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(LUniversalLineTemplate.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link LUniversalLineTemplate.E164AltNum }
     *     
     */
    public LUniversalLineTemplate.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LUniversalLineTemplate.E164AltNum }
     *     
     */
    public void setE164AltNum(LUniversalLineTemplate.E164AltNum value) {
        this.e164AltNum = value;
    }

    /**
     * Gets the value of the advertisedFailoverNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisedFailoverNumber() {
        return advertisedFailoverNumber;
    }

    /**
     * Sets the value of the advertisedFailoverNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisedFailoverNumber(String value) {
        this.advertisedFailoverNumber = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}LE164AltNum" minOccurs="0"/>
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
        "member"
    })
    public static class E164AltNum {

        protected LE164AltNum member;

        /**
         * Gets the value of the member property.
         * 
         * @return
         *     possible object is
         *     {@link LE164AltNum }
         *     
         */
        public LE164AltNum getMember() {
            return member;
        }

        /**
         * Sets the value of the member property.
         * 
         * @param value
         *     allowed object is
         *     {@link LE164AltNum }
         *     
         */
        public void setMember(LE164AltNum value) {
            this.member = value;
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}LEnterpriseAltNum" minOccurs="0"/>
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
        "member"
    })
    public static class EnterpriseAltNum {

        protected LEnterpriseAltNum member;

        /**
         * Gets the value of the member property.
         * 
         * @return
         *     possible object is
         *     {@link LEnterpriseAltNum }
         *     
         */
        public LEnterpriseAltNum getMember() {
            return member;
        }

        /**
         * Sets the value of the member property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEnterpriseAltNum }
         *     
         */
        public void setMember(LEnterpriseAltNum value) {
            this.member = value;
        }

    }

}
