
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callForwardAll" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardAll" minOccurs="0"/>
 *         &lt;element name="callForwardBusy" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardBusy" minOccurs="0"/>
 *         &lt;element name="callForwardBusyInt" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardBusyInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswer" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNoAnswer" minOccurs="0"/>
 *         &lt;element name="callForwardNoAnswerInt" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNoAnswerInt" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverage" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNoCoverage" minOccurs="0"/>
 *         &lt;element name="callForwardNoCoverageInt" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNoCoverageInt" minOccurs="0"/>
 *         &lt;element name="callForwardOnFailure" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardOnFailure" minOccurs="0"/>
 *         &lt;element name="callForwardAlternateParty" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardAlternateParty" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegistered" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNotRegistered" minOccurs="0"/>
 *         &lt;element name="callForwardNotRegisteredInt" type="{http://www.cisco.com/AXL/API/10.5}ORCallForwardNotRegisteredInt" minOccurs="0"/>
 *         &lt;element name="callPickupGroupName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="autoAnswer" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="shareLineAppearanceCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="voiceMailProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="cfaCssPolicy" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="defaultActivatedDeviceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="parkMonForwardNoRetrieveIntCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="partyEntranceTone" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="directoryURIs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}ORDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="externalCallControlProfile" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="enterpriseAltNum" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="numMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isUrgent" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="addLocalRoutePartition" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
 *                   &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
@XmlType(name = "ORLine", propOrder = {
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
public class ORLine {

    protected ORFkType usage;
    protected ORFkType routePartitionName;
    protected ORFkType aarNeighborhoodName;
    protected ORCallForwardAll callForwardAll;
    protected ORCallForwardBusy callForwardBusy;
    protected ORCallForwardBusyInt callForwardBusyInt;
    protected ORCallForwardNoAnswer callForwardNoAnswer;
    protected ORCallForwardNoAnswerInt callForwardNoAnswerInt;
    protected ORCallForwardNoCoverage callForwardNoCoverage;
    protected ORCallForwardNoCoverageInt callForwardNoCoverageInt;
    protected ORCallForwardOnFailure callForwardOnFailure;
    protected ORCallForwardAlternateParty callForwardAlternateParty;
    protected ORCallForwardNotRegistered callForwardNotRegistered;
    protected ORCallForwardNotRegisteredInt callForwardNotRegisteredInt;
    protected ORFkType callPickupGroupName;
    protected ORFkType autoAnswer;
    protected ORFkType networkHoldMohAudioSourceId;
    protected ORFkType userHoldMohAudioSourceId;
    protected ORFkType presenceGroupName;
    protected ORFkType shareLineAppearanceCssName;
    protected ORFkType voiceMailProfileName;
    protected ORFkType patternPrecedence;
    protected ORFkType releaseClause;
    protected ORFkType cfaCssPolicy;
    protected ORFkType defaultActivatedDeviceName;
    protected ORFkType parkMonForwardNoRetrieveCssName;
    protected ORFkType parkMonForwardNoRetrieveIntCssName;
    protected ORFkType partyEntranceTone;
    protected ORLine.DirectoryURIs directoryURIs;
    protected ORLine.ConfidentialAccess confidentialAccess;
    protected ORFkType externalCallControlProfile;
    protected ORLine.EnterpriseAltNum enterpriseAltNum;
    protected ORLine.E164AltNum e164AltNum;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUsage(ORFkType value) {
        this.usage = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRoutePartitionName(ORFkType value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the aarNeighborhoodName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAarNeighborhoodName() {
        return aarNeighborhoodName;
    }

    /**
     * Sets the value of the aarNeighborhoodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAarNeighborhoodName(ORFkType value) {
        this.aarNeighborhoodName = value;
    }

    /**
     * Gets the value of the callForwardAll property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardAll }
     *     
     */
    public ORCallForwardAll getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * Sets the value of the callForwardAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardAll }
     *     
     */
    public void setCallForwardAll(ORCallForwardAll value) {
        this.callForwardAll = value;
    }

    /**
     * Gets the value of the callForwardBusy property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardBusy }
     *     
     */
    public ORCallForwardBusy getCallForwardBusy() {
        return callForwardBusy;
    }

    /**
     * Sets the value of the callForwardBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardBusy }
     *     
     */
    public void setCallForwardBusy(ORCallForwardBusy value) {
        this.callForwardBusy = value;
    }

    /**
     * Gets the value of the callForwardBusyInt property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardBusyInt }
     *     
     */
    public ORCallForwardBusyInt getCallForwardBusyInt() {
        return callForwardBusyInt;
    }

    /**
     * Sets the value of the callForwardBusyInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardBusyInt }
     *     
     */
    public void setCallForwardBusyInt(ORCallForwardBusyInt value) {
        this.callForwardBusyInt = value;
    }

    /**
     * Gets the value of the callForwardNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNoAnswer }
     *     
     */
    public ORCallForwardNoAnswer getCallForwardNoAnswer() {
        return callForwardNoAnswer;
    }

    /**
     * Sets the value of the callForwardNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNoAnswer }
     *     
     */
    public void setCallForwardNoAnswer(ORCallForwardNoAnswer value) {
        this.callForwardNoAnswer = value;
    }

    /**
     * Gets the value of the callForwardNoAnswerInt property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNoAnswerInt }
     *     
     */
    public ORCallForwardNoAnswerInt getCallForwardNoAnswerInt() {
        return callForwardNoAnswerInt;
    }

    /**
     * Sets the value of the callForwardNoAnswerInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNoAnswerInt }
     *     
     */
    public void setCallForwardNoAnswerInt(ORCallForwardNoAnswerInt value) {
        this.callForwardNoAnswerInt = value;
    }

    /**
     * Gets the value of the callForwardNoCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNoCoverage }
     *     
     */
    public ORCallForwardNoCoverage getCallForwardNoCoverage() {
        return callForwardNoCoverage;
    }

    /**
     * Sets the value of the callForwardNoCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNoCoverage }
     *     
     */
    public void setCallForwardNoCoverage(ORCallForwardNoCoverage value) {
        this.callForwardNoCoverage = value;
    }

    /**
     * Gets the value of the callForwardNoCoverageInt property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNoCoverageInt }
     *     
     */
    public ORCallForwardNoCoverageInt getCallForwardNoCoverageInt() {
        return callForwardNoCoverageInt;
    }

    /**
     * Sets the value of the callForwardNoCoverageInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNoCoverageInt }
     *     
     */
    public void setCallForwardNoCoverageInt(ORCallForwardNoCoverageInt value) {
        this.callForwardNoCoverageInt = value;
    }

    /**
     * Gets the value of the callForwardOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardOnFailure }
     *     
     */
    public ORCallForwardOnFailure getCallForwardOnFailure() {
        return callForwardOnFailure;
    }

    /**
     * Sets the value of the callForwardOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardOnFailure }
     *     
     */
    public void setCallForwardOnFailure(ORCallForwardOnFailure value) {
        this.callForwardOnFailure = value;
    }

    /**
     * Gets the value of the callForwardAlternateParty property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardAlternateParty }
     *     
     */
    public ORCallForwardAlternateParty getCallForwardAlternateParty() {
        return callForwardAlternateParty;
    }

    /**
     * Sets the value of the callForwardAlternateParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardAlternateParty }
     *     
     */
    public void setCallForwardAlternateParty(ORCallForwardAlternateParty value) {
        this.callForwardAlternateParty = value;
    }

    /**
     * Gets the value of the callForwardNotRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNotRegistered }
     *     
     */
    public ORCallForwardNotRegistered getCallForwardNotRegistered() {
        return callForwardNotRegistered;
    }

    /**
     * Sets the value of the callForwardNotRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNotRegistered }
     *     
     */
    public void setCallForwardNotRegistered(ORCallForwardNotRegistered value) {
        this.callForwardNotRegistered = value;
    }

    /**
     * Gets the value of the callForwardNotRegisteredInt property.
     * 
     * @return
     *     possible object is
     *     {@link ORCallForwardNotRegisteredInt }
     *     
     */
    public ORCallForwardNotRegisteredInt getCallForwardNotRegisteredInt() {
        return callForwardNotRegisteredInt;
    }

    /**
     * Sets the value of the callForwardNotRegisteredInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCallForwardNotRegisteredInt }
     *     
     */
    public void setCallForwardNotRegisteredInt(ORCallForwardNotRegisteredInt value) {
        this.callForwardNotRegisteredInt = value;
    }

    /**
     * Gets the value of the callPickupGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallPickupGroupName() {
        return callPickupGroupName;
    }

    /**
     * Sets the value of the callPickupGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallPickupGroupName(ORFkType value) {
        this.callPickupGroupName = value;
    }

    /**
     * Gets the value of the autoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets the value of the autoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAutoAnswer(ORFkType value) {
        this.autoAnswer = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setNetworkHoldMohAudioSourceId(ORFkType value) {
        this.networkHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUserHoldMohAudioSourceId(ORFkType value) {
        this.userHoldMohAudioSourceId = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPresenceGroupName(ORFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the shareLineAppearanceCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getShareLineAppearanceCssName() {
        return shareLineAppearanceCssName;
    }

    /**
     * Sets the value of the shareLineAppearanceCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setShareLineAppearanceCssName(ORFkType value) {
        this.shareLineAppearanceCssName = value;
    }

    /**
     * Gets the value of the voiceMailProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getVoiceMailProfileName() {
        return voiceMailProfileName;
    }

    /**
     * Sets the value of the voiceMailProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setVoiceMailProfileName(ORFkType value) {
        this.voiceMailProfileName = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPatternPrecedence(ORFkType value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the releaseClause property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getReleaseClause() {
        return releaseClause;
    }

    /**
     * Sets the value of the releaseClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setReleaseClause(ORFkType value) {
        this.releaseClause = value;
    }

    /**
     * Gets the value of the cfaCssPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCfaCssPolicy() {
        return cfaCssPolicy;
    }

    /**
     * Sets the value of the cfaCssPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCfaCssPolicy(ORFkType value) {
        this.cfaCssPolicy = value;
    }

    /**
     * Gets the value of the defaultActivatedDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDefaultActivatedDeviceName() {
        return defaultActivatedDeviceName;
    }

    /**
     * Sets the value of the defaultActivatedDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDefaultActivatedDeviceName(ORFkType value) {
        this.defaultActivatedDeviceName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getParkMonForwardNoRetrieveCssName() {
        return parkMonForwardNoRetrieveCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveCssName(ORFkType value) {
        this.parkMonForwardNoRetrieveCssName = value;
    }

    /**
     * Gets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getParkMonForwardNoRetrieveIntCssName() {
        return parkMonForwardNoRetrieveIntCssName;
    }

    /**
     * Sets the value of the parkMonForwardNoRetrieveIntCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setParkMonForwardNoRetrieveIntCssName(ORFkType value) {
        this.parkMonForwardNoRetrieveIntCssName = value;
    }

    /**
     * Gets the value of the partyEntranceTone property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPartyEntranceTone() {
        return partyEntranceTone;
    }

    /**
     * Sets the value of the partyEntranceTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPartyEntranceTone(ORFkType value) {
        this.partyEntranceTone = value;
    }

    /**
     * Gets the value of the directoryURIs property.
     * 
     * @return
     *     possible object is
     *     {@link ORLine.DirectoryURIs }
     *     
     */
    public ORLine.DirectoryURIs getDirectoryURIs() {
        return directoryURIs;
    }

    /**
     * Sets the value of the directoryURIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORLine.DirectoryURIs }
     *     
     */
    public void setDirectoryURIs(ORLine.DirectoryURIs value) {
        this.directoryURIs = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ORLine.ConfidentialAccess }
     *     
     */
    public ORLine.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORLine.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(ORLine.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the externalCallControlProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getExternalCallControlProfile() {
        return externalCallControlProfile;
    }

    /**
     * Sets the value of the externalCallControlProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setExternalCallControlProfile(ORFkType value) {
        this.externalCallControlProfile = value;
    }

    /**
     * Gets the value of the enterpriseAltNum property.
     * 
     * @return
     *     possible object is
     *     {@link ORLine.EnterpriseAltNum }
     *     
     */
    public ORLine.EnterpriseAltNum getEnterpriseAltNum() {
        return enterpriseAltNum;
    }

    /**
     * Sets the value of the enterpriseAltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORLine.EnterpriseAltNum }
     *     
     */
    public void setEnterpriseAltNum(ORLine.EnterpriseAltNum value) {
        this.enterpriseAltNum = value;
    }

    /**
     * Gets the value of the e164AltNum property.
     * 
     * @return
     *     possible object is
     *     {@link ORLine.E164AltNum }
     *     
     */
    public ORLine.E164AltNum getE164AltNum() {
        return e164AltNum;
    }

    /**
     * Sets the value of the e164AltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORLine.E164AltNum }
     *     
     */
    public void setE164AltNum(ORLine.E164AltNum value) {
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
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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

        protected ORFkType confidentialAccessMode;
        protected String confidentialAccessLevel;

        /**
         * Gets the value of the confidentialAccessMode property.
         * 
         * @return
         *     possible object is
         *     {@link ORFkType }
         *     
         */
        public ORFkType getConfidentialAccessMode() {
            return confidentialAccessMode;
        }

        /**
         * Sets the value of the confidentialAccessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORFkType }
         *     
         */
        public void setConfidentialAccessMode(ORFkType value) {
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
     *         &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}ORDirectoryUri" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<ORDirectoryUri> directoryUri;

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
         * {@link ORDirectoryUri }
         * 
         * 
         */
        public List<ORDirectoryUri> getDirectoryUri() {
            if (directoryUri == null) {
                directoryUri = new ArrayList<ORDirectoryUri>();
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
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
        protected ORFkType routePartition;
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
         *     {@link ORFkType }
         *     
         */
        public ORFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORFkType }
         *     
         */
        public void setRoutePartition(ORFkType value) {
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
     *         &lt;element name="routePartition" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
        protected ORFkType routePartition;
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
         *     {@link ORFkType }
         *     
         */
        public ORFkType getRoutePartition() {
            return routePartition;
        }

        /**
         * Sets the value of the routePartition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORFkType }
         *     
         */
        public void setRoutePartition(ORFkType value) {
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
