
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callForwardAll" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardAll" minOccurs="0"/>
 *         &lt;element name="callForwardBusy" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardBusy" minOccurs="0"/>
 *         &lt;element name="callForwardBusyInt" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardBusyInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswer" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNoAnswer" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswerInt" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNoAnswerInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverage" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNoCoverage" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverageInt" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNoCoverageInt" minOccurs="0"/>
 *         &lt;element name="callForwardOnFailure" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardOnFailure" minOccurs="0"/>
 *         &lt;element name="callForwardAlternateParty" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardAlternateParty" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegistered" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNotRegistered" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegisteredInt" type="{http://www.cisco.com/AXL/API/10.5}OXCallForwardNotRegisteredInt" minOccurs="0"/>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="shareLineAppearanceCssName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfileName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="cfaCssPolicy" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="defaultActivatedDeviceName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveCssName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntCssName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="directoryURIs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}OXDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="enterpriseAltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *                   &lt;element name="advertiseGloballyIls" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
@XmlType(name = "OXLine", propOrder = {
    "usage",
    "routePartitionName",
    "aarNeighborhoodName",
    "callForwardAll",
    "callForwardBusy",
    "callForwardBusyInt",
    "callForwardNoAnswer",
    "callForwardNoAnswerInt",
    "callForwardNoCoverage",
    "callForwardNoCoverageInt",
    "callForwardOnFailure",
    "callForwardAlternateParty",
    "callForwardNotRegistered",
    "callForwardNotRegisteredInt",
    "callPickupGroupName",
    "autoAnswer",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "presenceGroupName",
    "shareLineAppearanceCssName",
    "voiceMailProfileName",
    "patternPrecedence",
    "releaseClause",
    "cfaCssPolicy",
    "defaultActivatedDeviceName",
    "parkMonForwardNoRetrieveCssName",
    "parkMonForwardNoRetrieveIntCssName",
    "partyEntranceTone",
    "directoryURIs",
    "confidentialAccess",
    "externalCallControlProfile",
    "enterpriseAltNum",
    "e164AltNum"
})
public class OXLine {

    protected OXFkType usage;
    protected OXFkType routePartitionName;
    protected OXFkType aarNeighborhoodName;
    protected OXCallForwardAll callForwardAll;
    protected OXCallForwardBusy callForwardBusy;
    protected OXCallForwardBusyInt callForwardBusyInt;
    protected OXCallForwardNoAnswer callForwardNoAnswer;
    protected OXCallForwardNoAnswerInt callForwardNoAnswerInt;
    protected OXCallForwardNoCoverage callForwardNoCoverage;
    protected OXCallForwardNoCoverageInt callForwardNoCoverageInt;
    protected OXCallForwardOnFailure callForwardOnFailure;
    protected OXCallForwardAlternateParty callForwardAlternateParty;
    protected OXCallForwardNotRegistered callForwardNotRegistered;
    protected OXCallForwardNotRegisteredInt callForwardNotRegisteredInt;
    protected OXFkType callPickupGroupName;
    protected OXFkType autoAnswer;
    protected OXFkType networkHoldMohAudioSourceId;
    protected OXFkType userHoldMohAudioSourceId;
    protected OXFkType presenceGroupName;
    protected OXFkType shareLineAppearanceCssName;
    protected OXFkType voiceMailProfileName;
    protected OXFkType patternPrecedence;
    protected OXFkType releaseClause;
    protected OXFkType cfaCssPolicy;
    protected OXFkType defaultActivatedDeviceName;
    protected OXFkType parkMonForwardNoRetrieveCssName;
    protected OXFkType parkMonForwardNoRetrieveIntCssName;
    protected OXFkType partyEntranceTone;
    protected OXLine.DirectoryURIs directoryURIs;
    protected OXLine.ConfidentialAccess confidentialAccess;
    protected OXFkType externalCallControlProfile;
    protected OXLine.EnterpriseAltNum enterpriseAltNum;
    protected OXLine.E164AltNum e164AltNum;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUsage(OXFkType value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRoutePartitionName(OXFkType value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAarNeighborhoodName(OXFkType value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the callForwardAll property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardAll }
     *     
     */
    public OXCallForwardAll getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * Sets the value of the callForwardAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardAll }
     *     
     */
    public void setCallForwardAll(OXCallForwardAll value) {
        this.callForwardAll = value;
    }

    /**
     * Gets the value of the callForwardBusy property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardBusy }
     *     
     */
    public OXCallForwardBusy getCallForwardBusy() {
        return callForwardBusy;
    }

    /**
     * Sets the value of the callForwardBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardBusy }
     *     
     */
    public void setCallForwardBusy(OXCallForwardBusy value) {
        this.callForwardBusy = value;
    }

    /**
     * Gets the value of the callForwardBusyInt property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardBusyInt }
     *     
     */
    public OXCallForwardBusyInt getCallForwardBusyInt() {
        return callForwardBusyInt;
    }

    /**
     * Sets the value of the callForwardBusyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardBusyInt }
     *     
     */
    public void setCallForwardBusyInt(OXCallForwardBusyInt value) {
        this.callForwardBusyInt = value;
    }

    /**
     * Gets the value of the callForwardNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNoAnswer }
     *     
     */
    public OXCallForwardNoAnswer getCallForwardNoAnswer() {
        return callForwardNoAnswer;
    }

    /**
     * Sets the value of the callForwardNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNoAnswer }
     *     
     */
    public void setCallForwardNoAnswer(OXCallForwardNoAnswer value) {
        this.callForwardNoAnswer = value;
    }

    /**
     * Gets the value of the callForwardNoAnswerInt property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNoAnswerInt }
     *     
     */
    public OXCallForwardNoAnswerInt getCallForwardNoAnswerInt() {
        return callForwardNoAnswerInt;
    }

    /**
     * Sets the value of the callForwardNoAnswerInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNoAnswerInt }
     *     
     */
    public void setCallForwardNoAnswerInt(OXCallForwardNoAnswerInt value) {
        this.callForwardNoAnswerInt = value;
    }

    /**
     * Gets the value of the callForwardNoCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNoCoverage }
     *     
     */
    public OXCallForwardNoCoverage getCallForwardNoCoverage() {
        return callForwardNoCoverage;
    }

    /**
     * Sets the value of the callForwardNoCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNoCoverage }
     *     
     */
    public void setCallForwardNoCoverage(OXCallForwardNoCoverage value) {
        this.callForwardNoCoverage = value;
    }

    /**
     * Gets the value of the callForwardNoCoverageInt property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNoCoverageInt }
     *     
     */
    public OXCallForwardNoCoverageInt getCallForwardNoCoverageInt() {
        return callForwardNoCoverageInt;
    }

    /**
     * Sets the value of the callForwardNoCoverageInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNoCoverageInt }
     *     
     */
    public void setCallForwardNoCoverageInt(OXCallForwardNoCoverageInt value) {
        this.callForwardNoCoverageInt = value;
    }

    /**
     * Gets the value of the callForwardOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardOnFailure }
     *     
     */
    public OXCallForwardOnFailure getCallForwardOnFailure() {
        return callForwardOnFailure;
    }

    /**
     * Sets the value of the callForwardOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardOnFailure }
     *     
     */
    public void setCallForwardOnFailure(OXCallForwardOnFailure value) {
        this.callForwardOnFailure = value;
    }

    /**
     * Gets the value of the callForwardAlternateParty property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardAlternateParty }
     *     
     */
    public OXCallForwardAlternateParty getCallForwardAlternateParty() {
        return callForwardAlternateParty;
    }

    /**
     * Sets the value of the callForwardAlternateParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardAlternateParty }
     *     
     */
    public void setCallForwardAlternateParty(OXCallForwardAlternateParty value) {
        this.callForwardAlternateParty = value;
    }

    /**
     * Gets the value of the callForwardNotRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNotRegistered }
     *     
     */
    public OXCallForwardNotRegistered getCallForwardNotRegistered() {
        return callForwardNotRegistered;
    }

    /**
     * Sets the value of the callForwardNotRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNotRegistered }
     *     
     */
    public void setCallForwardNotRegistered(OXCallForwardNotRegistered value) {
        this.callForwardNotRegistered = value;
    }

    /**
     * Gets the value of the callForwardNotRegisteredInt property.
     * 
     * @return
     *     possible object is
     *     {@link OXCallForwardNotRegisteredInt }
     *     
     */
    public OXCallForwardNotRegisteredInt getCallForwardNotRegisteredInt() {
        return callForwardNotRegisteredInt;
    }

    /**
     * Sets the value of the callForwardNotRegisteredInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXCallForwardNotRegisteredInt }
     *     
     */
    public void setCallForwardNotRegisteredInt(OXCallForwardNotRegisteredInt value) {
        this.callForwardNotRegisteredInt = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallPickupGroupName(OXFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAutoAnswer(OXFkType value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(OXFkType value) {
        this.networkHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUserHoldMohAudioSourceId(OXFkType value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPresenceGroupName(OXFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the shareLineAppearanceCssName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getShareLineAppearanceCssName() {
        return shareLineAppearanceCssName;
    }

    /**
     * Sets the value of the shareLineAppearanceCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setShareLineAppearanceCssName(OXFkType value) {
        this.shareLineAppearanceCssName = value;
    }

    /**
     * Gets the value of the voiceMailProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getVoiceMailProfileName() {
        return voiceMailProfileName;
    }

    /**
     * Sets the value of the voiceMailProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setVoiceMailProfileName(OXFkType value) {
        this.voiceMailProfileName = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPatternPrecedence(OXFkType value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setReleaseClause(OXFkType value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the cfaCssPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCfaCssPolicy() {
        return cfaCssPolicy;
    }

    /**
     * Sets the value of the cfaCssPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCfaCssPolicy(OXFkType value) {
        this.cfaCssPolicy = value;
    }

    /**
     * Gets the value of the defaultActivatedDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDefaultActivatedDeviceName() {
        return defaultActivatedDeviceName;
    }

    /**
     * Sets the value of the defaultActivatedDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDefaultActivatedDeviceName(OXFkType value) {
        this.defaultActivatedDeviceName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getParkMonForwardNoRetrieveCssName() {
        return parkMonForwardNoRetrieveCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveCssName(OXFkType value) {
        this.parkMonForwardNoRetrieveCssName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getParkMonForwardNoRetrieveIntCssName() {
        return parkMonForwardNoRetrieveIntCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveIntCssName(OXFkType value) {
        this.parkMonForwardNoRetrieveIntCssName = value;
    }

    /**
     * Gets the value of the partyEntranceTone property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPartyEntranceTone() {
        return partyEntranceTone;
    }

    /**
     * Sets the value of the partyEntranceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPartyEntranceTone(OXFkType value) {
        this.partyEntranceTone = value;
    }

    /**
     * Gets the value of the directoryURIs property.
     * 
     * @return
     *     possible object is
     *     {@link OXLine.DirectoryURIs }
     *     
     */
    public OXLine.DirectoryURIs getDirectoryURIs() {
        return directoryURIs;
    }

    /**
     * Sets the value of the directoryURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXLine.DirectoryURIs }
     *     
     */
    public void setDirectoryURIs(OXLine.DirectoryURIs value) {
        this.directoryURIs = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link OXLine.ConfidentialAccess }
     *     
     */
    public OXLine.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXLine.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(OXLine.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setExternalCallControlProfile(OXFkType value) {
        this.externalCallControlProfile = value;
    }

    /**
     * Gets the value of the enterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link OXLine.EnterpriseAltNum }
     *     
     */
    public OXLine.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXLine.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(OXLine.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link OXLine.E164AltNum }
     *     
     */
    public OXLine.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXLine.E164AltNum }
     *     
     */
    public void setE164AltNum(OXLine.E164AltNum value) {
        this.e164AltNum = value;
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
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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

        protected OXFkType confidentialAccessMode;
        protected String confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link OXFkType }
         *     
         */
        public OXFkType getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link OXFkType }
         *     
         */
        public void setConfidentialAccessMode(OXFkType value) {
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
     *         &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}OXDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
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
        "directoryUri"
    })
    public static class DirectoryURIs {

        protected List<OXDirectoryUri> directoryUri;

        /**
         * Gets the value of the directoryUri property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directoryUri property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirectoryUri().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OXDirectoryUri }
         * 
         * 
         */
        public List<OXDirectoryUri> getDirectoryUri() {
            if (directoryUri == null) {
                directoryUri = new ArrayList<OXDirectoryUri>();
            }
            return this.directoryUri;
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
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
        protected OXFkType routePartition;
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
         *     {@link OXFkType }
         *     
         */
        public OXFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link OXFkType }
         *     
         */
        public void setRoutePartition(OXFkType value) {
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
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
        protected OXFkType routePartition;
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
         *     {@link OXFkType }
         *     
         */
        public OXFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link OXFkType }
         *     
         */
        public void setRoutePartition(OXFkType value) {
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
