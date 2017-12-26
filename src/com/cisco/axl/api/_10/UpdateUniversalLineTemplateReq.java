
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateUniversalLineTemplateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUniversalLineTemplateReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
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
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}XEnterpriseAltNum" minOccurs="0"/>
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
 *                   &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}XE164AltNum" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="advertisedFailoverNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUniversalLineTemplateReq", propOrder = {
    "newName",
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
public class UpdateUniversalLineTemplateReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String urgentPriority;
    protected String lineDescription;
    @XmlElementRef(name = "routePartition", type = JAXBElement.class)
    protected JAXBElement<XFkType> routePartition;
    @XmlElementRef(name = "voiceMailProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> voiceMailProfile;
    @XmlElementRef(name = "callingSearchSpace", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpace;
    protected String alertingName;
    @XmlElementRef(name = "extCallControlProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> extCallControlProfile;
    protected XFkType blfPresenceGroup;
    protected XFkType callPickupGroup;
    @XmlElement(defaultValue = "Default")
    protected String partyEntranceTone;
    @XmlElement(defaultValue = "Auto Answer Off")
    protected String autoAnswer;
    protected String rejectAnonymousCall;
    @XmlElementRef(name = "userHoldMohAudioSource", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSource;
    @XmlElementRef(name = "networkHoldMohAudioSource", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSource;
    @XmlElementRef(name = "aarDestinationMask", type = JAXBElement.class)
    protected JAXBElement<String> aarDestinationMask;
    @XmlElementRef(name = "aarGroup", type = JAXBElement.class)
    protected JAXBElement<XFkType> aarGroup;
    protected String retainDestInCallFwdHistory;
    protected String forwardDestAllCalls;
    @XmlElementRef(name = "primaryCssForwardingAllCalls", type = JAXBElement.class)
    protected JAXBElement<XFkType> primaryCssForwardingAllCalls;
    @XmlElementRef(name = "secondaryCssForwardingAllCalls", type = JAXBElement.class)
    protected JAXBElement<XFkType> secondaryCssForwardingAllCalls;
    @XmlElement(name = "CssActivationPolicy", defaultValue = "Use System Default")
    protected String cssActivationPolicy;
    @XmlElementRef(name = "fwdDestExtCallsWhenNotRetrieved", type = JAXBElement.class)
    protected JAXBElement<String> fwdDestExtCallsWhenNotRetrieved;
    @XmlElementRef(name = "cssFwdExtCallsWhenNotRetrieved", type = JAXBElement.class)
    protected JAXBElement<XFkType> cssFwdExtCallsWhenNotRetrieved;
    protected String fwdDestInternalCallsWhenNotRetrieved;
    @XmlElementRef(name = "cssFwdInternalCallsWhenNotRetrieved", type = JAXBElement.class)
    protected JAXBElement<XFkType> cssFwdInternalCallsWhenNotRetrieved;
    @XmlElementRef(name = "parkMonitorReversionTime", type = JAXBElement.class)
    protected JAXBElement<String> parkMonitorReversionTime;
    @XmlElementRef(name = "target", type = JAXBElement.class)
    protected JAXBElement<String> target;
    @XmlElementRef(name = "mlppCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> mlppCss;
    @XmlElementRef(name = "mlppNoAnsRingDuration", type = JAXBElement.class)
    protected JAXBElement<String> mlppNoAnsRingDuration;
    protected UpdateUniversalLineTemplateReq.ConfidentialAccess confidentialAccess;
    @XmlElementRef(name = "holdReversionRingDuration", type = JAXBElement.class)
    protected JAXBElement<String> holdReversionRingDuration;
    @XmlElementRef(name = "holdReversionNotificationInterval", type = JAXBElement.class)
    protected JAXBElement<String> holdReversionNotificationInterval;
    protected String busyIntCallsDestination;
    @XmlElementRef(name = "busyIntCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> busyIntCallsCss;
    protected String busyExtCallsDestination;
    @XmlElementRef(name = "busyExtCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> busyExtCallsCss;
    protected String noAnsIntCallsDestination;
    @XmlElementRef(name = "noAnsIntCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> noAnsIntCallsCss;
    protected String noAnsExtCallsDestination;
    @XmlElementRef(name = "noAnsExtCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> noAnsExtCallsCss;
    protected String noCoverageIntCallsDestination;
    @XmlElementRef(name = "noCoverageIntCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> noCoverageIntCallsCss;
    protected String noCoverageExtCallsDestination;
    @XmlElementRef(name = "noCoverageExtCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> noCoverageExtCallsCss;
    protected String unregisteredIntCallsDestination;
    @XmlElementRef(name = "unregisteredIntCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> unregisteredIntCallsCss;
    protected String unregisteredExtCallsDestination;
    @XmlElementRef(name = "unregisteredExtCallsCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> unregisteredExtCallsCss;
    protected String ctiFailureDestination;
    @XmlElementRef(name = "ctiFailureCss", type = JAXBElement.class)
    protected JAXBElement<XFkType> ctiFailureCss;
    protected String callControlAgentProfile;
    protected UpdateUniversalLineTemplateReq.EnterpriseAltNum enterpriseAltNum;
    protected UpdateUniversalLineTemplateReq.E164AltNum e164AltNum;
    protected String advertisedFailoverNumber;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartition() {
        return routePartition;
    }

    /**
     * Sets the value of the routePartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartition(JAXBElement<XFkType> value) {
        this.routePartition = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the voiceMailProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getVoiceMailProfile() {
        return voiceMailProfile;
    }

    /**
     * Sets the value of the voiceMailProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setVoiceMailProfile(JAXBElement<XFkType> value) {
        this.voiceMailProfile = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the callingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpace() {
        return callingSearchSpace;
    }

    /**
     * Sets the value of the callingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpace(JAXBElement<XFkType> value) {
        this.callingSearchSpace = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getExtCallControlProfile() {
        return extCallControlProfile;
    }

    /**
     * Sets the value of the extCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setExtCallControlProfile(JAXBElement<XFkType> value) {
        this.extCallControlProfile = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHoldMohAudioSource() {
        return userHoldMohAudioSource;
    }

    /**
     * Sets the value of the userHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHoldMohAudioSource(JAXBElement<String> value) {
        this.userHoldMohAudioSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the networkHoldMohAudioSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHoldMohAudioSource() {
        return networkHoldMohAudioSource;
    }

    /**
     * Sets the value of the networkHoldMohAudioSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHoldMohAudioSource(JAXBElement<String> value) {
        this.networkHoldMohAudioSource = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aarDestinationMask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAarDestinationMask() {
        return aarDestinationMask;
    }

    /**
     * Sets the value of the aarDestinationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAarDestinationMask(JAXBElement<String> value) {
        this.aarDestinationMask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the aarGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getAarGroup() {
        return aarGroup;
    }

    /**
     * Sets the value of the aarGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setAarGroup(JAXBElement<XFkType> value) {
        this.aarGroup = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getPrimaryCssForwardingAllCalls() {
        return primaryCssForwardingAllCalls;
    }

    /**
     * Sets the value of the primaryCssForwardingAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setPrimaryCssForwardingAllCalls(JAXBElement<XFkType> value) {
        this.primaryCssForwardingAllCalls = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the secondaryCssForwardingAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSecondaryCssForwardingAllCalls() {
        return secondaryCssForwardingAllCalls;
    }

    /**
     * Sets the value of the secondaryCssForwardingAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSecondaryCssForwardingAllCalls(JAXBElement<XFkType> value) {
        this.secondaryCssForwardingAllCalls = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFwdDestExtCallsWhenNotRetrieved() {
        return fwdDestExtCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the fwdDestExtCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFwdDestExtCallsWhenNotRetrieved(JAXBElement<String> value) {
        this.fwdDestExtCallsWhenNotRetrieved = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cssFwdExtCallsWhenNotRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCssFwdExtCallsWhenNotRetrieved() {
        return cssFwdExtCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the cssFwdExtCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCssFwdExtCallsWhenNotRetrieved(JAXBElement<XFkType> value) {
        this.cssFwdExtCallsWhenNotRetrieved = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCssFwdInternalCallsWhenNotRetrieved() {
        return cssFwdInternalCallsWhenNotRetrieved;
    }

    /**
     * Sets the value of the cssFwdInternalCallsWhenNotRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCssFwdInternalCallsWhenNotRetrieved(JAXBElement<XFkType> value) {
        this.cssFwdInternalCallsWhenNotRetrieved = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the parkMonitorReversionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParkMonitorReversionTime() {
        return parkMonitorReversionTime;
    }

    /**
     * Sets the value of the parkMonitorReversionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParkMonitorReversionTime(JAXBElement<String> value) {
        this.parkMonitorReversionTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTarget(JAXBElement<String> value) {
        this.target = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mlppCss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getMlppCss() {
        return mlppCss;
    }

    /**
     * Sets the value of the mlppCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setMlppCss(JAXBElement<XFkType> value) {
        this.mlppCss = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the mlppNoAnsRingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppNoAnsRingDuration() {
        return mlppNoAnsRingDuration;
    }

    /**
     * Sets the value of the mlppNoAnsRingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppNoAnsRingDuration(JAXBElement<String> value) {
        this.mlppNoAnsRingDuration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUniversalLineTemplateReq.ConfidentialAccess }
     *     
     */
    public UpdateUniversalLineTemplateReq.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUniversalLineTemplateReq.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(UpdateUniversalLineTemplateReq.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the holdReversionRingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldReversionRingDuration() {
        return holdReversionRingDuration;
    }

    /**
     * Sets the value of the holdReversionRingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldReversionRingDuration(JAXBElement<String> value) {
        this.holdReversionRingDuration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the holdReversionNotificationInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldReversionNotificationInterval() {
        return holdReversionNotificationInterval;
    }

    /**
     * Sets the value of the holdReversionNotificationInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldReversionNotificationInterval(JAXBElement<String> value) {
        this.holdReversionNotificationInterval = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getBusyIntCallsCss() {
        return busyIntCallsCss;
    }

    /**
     * Sets the value of the busyIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setBusyIntCallsCss(JAXBElement<XFkType> value) {
        this.busyIntCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getBusyExtCallsCss() {
        return busyExtCallsCss;
    }

    /**
     * Sets the value of the busyExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setBusyExtCallsCss(JAXBElement<XFkType> value) {
        this.busyExtCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNoAnsIntCallsCss() {
        return noAnsIntCallsCss;
    }

    /**
     * Sets the value of the noAnsIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNoAnsIntCallsCss(JAXBElement<XFkType> value) {
        this.noAnsIntCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNoAnsExtCallsCss() {
        return noAnsExtCallsCss;
    }

    /**
     * Sets the value of the noAnsExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNoAnsExtCallsCss(JAXBElement<XFkType> value) {
        this.noAnsExtCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNoCoverageIntCallsCss() {
        return noCoverageIntCallsCss;
    }

    /**
     * Sets the value of the noCoverageIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNoCoverageIntCallsCss(JAXBElement<XFkType> value) {
        this.noCoverageIntCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getNoCoverageExtCallsCss() {
        return noCoverageExtCallsCss;
    }

    /**
     * Sets the value of the noCoverageExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setNoCoverageExtCallsCss(JAXBElement<XFkType> value) {
        this.noCoverageExtCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnregisteredIntCallsCss() {
        return unregisteredIntCallsCss;
    }

    /**
     * Sets the value of the unregisteredIntCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnregisteredIntCallsCss(JAXBElement<XFkType> value) {
        this.unregisteredIntCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUnregisteredExtCallsCss() {
        return unregisteredExtCallsCss;
    }

    /**
     * Sets the value of the unregisteredExtCallsCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUnregisteredExtCallsCss(JAXBElement<XFkType> value) {
        this.unregisteredExtCallsCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCtiFailureCss() {
        return ctiFailureCss;
    }

    /**
     * Sets the value of the ctiFailureCss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCtiFailureCss(JAXBElement<XFkType> value) {
        this.ctiFailureCss = ((JAXBElement<XFkType> ) value);
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
     *     {@link UpdateUniversalLineTemplateReq.EnterpriseAltNum }
     *     
     */
    public UpdateUniversalLineTemplateReq.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUniversalLineTemplateReq.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(UpdateUniversalLineTemplateReq.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUniversalLineTemplateReq.E164AltNum }
     *     
     */
    public UpdateUniversalLineTemplateReq.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUniversalLineTemplateReq.E164AltNum }
     *     
     */
    public void setE164AltNum(UpdateUniversalLineTemplateReq.E164AltNum value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}XCALMode"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
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

        @XmlElementRef(name = "confidentialAccessMode", type = JAXBElement.class)
        protected JAXBElement<String> confidentialAccessMode;
        @XmlElementRef(name = "confidentialAccessLevel", type = JAXBElement.class)
        protected JAXBElement<String> confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessMode(JAXBElement<String> value) {
            this.confidentialAccessMode = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the confidentialAccessLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setConfidentialAccessLevel(JAXBElement<String> value) {
            this.confidentialAccessLevel = ((JAXBElement<String> ) value);
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}XE164AltNum" minOccurs="0"/>
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

        protected XE164AltNum member;

        /**
         * Gets the value of the member property.
         * 
         * @return
         *     possible object is
         *     {@link XE164AltNum }
         *     
         */
        public XE164AltNum getMember() {
            return member;
        }

        /**
         * Sets the value of the member property.
         * 
         * @param value
         *     allowed object is
         *     {@link XE164AltNum }
         *     
         */
        public void setMember(XE164AltNum value) {
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
     *         &lt;element name="member" type="{http://www.cisco.com/AXL/API/10.5}XEnterpriseAltNum" minOccurs="0"/>
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

        protected XEnterpriseAltNum member;

        /**
         * Gets the value of the member property.
         * 
         * @return
         *     possible object is
         *     {@link XEnterpriseAltNum }
         *     
         */
        public XEnterpriseAltNum getMember() {
            return member;
        }

        /**
         * Sets the value of the member property.
         * 
         * @param value
         *     allowed object is
         *     {@link XEnterpriseAltNum }
         *     
         */
        public void setMember(XEnterpriseAltNum value) {
            this.member = value;
        }

    }

}
