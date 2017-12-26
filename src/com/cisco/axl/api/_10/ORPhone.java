
package com.cisco.axl.api._10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="devicePoolName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="commonDeviceConfigName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="commonPhoneConfigName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="networkLocation" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="locationName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="mediaResourceListName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="automatedAlternateRoutingCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="aarNeighborhoodName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="securityProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="sipProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="cgpnTransformationCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="geoLocationFilterName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}ORPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}ORNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="primaryPhoneName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingIdleBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingBusyBlfAudibleAlert" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="blfDirectedCallParks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}ORBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addOnModules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}ORAddOnModule" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="networkLocale" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}ORSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="defaultProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="builtInBridgeStatus" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="ownerUserName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="packetCaptureMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="rerouteCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="certificateOperation" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="authenticationMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="keySize" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="deviceMobilityMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="mobilityUserIdName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="phoneSuite" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="phoneServiceDisplay" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="mtpPreferedCodec" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dialRulesName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="outboundCallRollover" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="deviceTrustMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="confidentialAccess" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *                   &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cgpnIngressDN" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="wifiHotspotProfile" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="wirelessLanProfileGroup" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORPhone", propOrder = {
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "callingSearchSpaceName",
    "devicePoolName",
    "commonDeviceConfigName",
    "commonPhoneConfigName",
    "networkLocation",
    "locationName",
    "mediaResourceListName",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "automatedAlternateRoutingCssName",
    "aarNeighborhoodName",
    "mlppIndicationStatus",
    "preemption",
    "useTrustedRelayPoint",
    "securityProfileName",
    "sipProfileName",
    "cgpnTransformationCssName",
    "geoLocationName",
    "geoLocationFilterName",
    "lines",
    "phoneTemplateName",
    "primaryPhoneName",
    "ringSettingIdleBlfAudibleAlert",
    "ringSettingBusyBlfAudibleAlert",
    "blfDirectedCallParks",
    "addOnModules",
    "userLocale",
    "networkLocale",
    "services",
    "softkeyTemplateName",
    "defaultProfileName",
    "singleButtonBarge",
    "joinAcrossLines",
    "builtInBridgeStatus",
    "callInfoPrivacyStatus",
    "ownerUserName",
    "packetCaptureMode",
    "subscribeCallingSearchSpaceName",
    "rerouteCallingSearchSpaceName",
    "presenceGroupName",
    "certificateOperation",
    "authenticationMode",
    "keySize",
    "deviceMobilityMode",
    "dndOption",
    "dndRingSetting",
    "mobilityUserIdName",
    "phoneSuite",
    "phoneServiceDisplay",
    "mtpPreferedCodec",
    "dialRulesName",
    "outboundCallRollover",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "featureControlPolicy",
    "deviceTrustMode",
    "confidentialAccess",
    "cgpnIngressDN",
    "wifiHotspotProfile",
    "wirelessLanProfileGroup"
})
public class ORPhone {

    protected ORFkType product;
    @XmlElement(name = "class")
    protected ORFkType clazz;
    protected ORFkType protocol;
    protected ORFkType protocolSide;
    protected ORFkType callingSearchSpaceName;
    protected ORFkType devicePoolName;
    protected ORFkType commonDeviceConfigName;
    protected ORFkType commonPhoneConfigName;
    protected ORFkType networkLocation;
    protected ORFkType locationName;
    protected ORFkType mediaResourceListName;
    protected ORFkType networkHoldMohAudioSourceId;
    protected ORFkType userHoldMohAudioSourceId;
    protected ORFkType automatedAlternateRoutingCssName;
    protected ORFkType aarNeighborhoodName;
    protected ORFkType mlppIndicationStatus;
    protected ORFkType preemption;
    protected ORFkType useTrustedRelayPoint;
    protected ORFkType securityProfileName;
    protected ORFkType sipProfileName;
    protected ORFkType cgpnTransformationCssName;
    protected ORFkType geoLocationName;
    protected ORFkType geoLocationFilterName;
    protected ORPhone.Lines lines;
    protected ORFkType phoneTemplateName;
    protected ORFkType primaryPhoneName;
    protected ORFkType ringSettingIdleBlfAudibleAlert;
    protected ORFkType ringSettingBusyBlfAudibleAlert;
    protected ORPhone.BlfDirectedCallParks blfDirectedCallParks;
    protected ORPhone.AddOnModules addOnModules;
    protected ORFkType userLocale;
    protected ORFkType networkLocale;
    protected ORPhone.Services services;
    protected ORFkType softkeyTemplateName;
    protected ORFkType defaultProfileName;
    protected ORFkType singleButtonBarge;
    protected ORFkType joinAcrossLines;
    protected ORFkType builtInBridgeStatus;
    protected ORFkType callInfoPrivacyStatus;
    protected ORFkType ownerUserName;
    protected ORFkType packetCaptureMode;
    protected ORFkType subscribeCallingSearchSpaceName;
    protected ORFkType rerouteCallingSearchSpaceName;
    protected ORFkType presenceGroupName;
    protected ORFkType certificateOperation;
    protected ORFkType authenticationMode;
    protected ORFkType keySize;
    protected ORFkType deviceMobilityMode;
    protected ORFkType dndOption;
    protected ORFkType dndRingSetting;
    protected ORFkType mobilityUserIdName;
    protected ORFkType phoneSuite;
    protected ORFkType phoneServiceDisplay;
    protected ORFkType mtpPreferedCodec;
    protected ORFkType dialRulesName;
    protected ORFkType outboundCallRollover;
    protected ORFkType alwaysUsePrimeLine;
    protected ORFkType alwaysUsePrimeLineForVoiceMessage;
    protected ORFkType featureControlPolicy;
    protected ORFkType deviceTrustMode;
    protected ORPhone.ConfidentialAccess confidentialAccess;
    protected ORFkType cgpnIngressDN;
    protected ORFkType wifiHotspotProfile;
    protected ORFkType wirelessLanProfileGroup;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ctiid;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setProduct(ORFkType value) {
        this.product = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setClazz(ORFkType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setProtocol(ORFkType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setProtocolSide(ORFkType value) {
        this.protocolSide = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingSearchSpaceName(ORFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the devicePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDevicePoolName() {
        return devicePoolName;
    }

    /**
     * Sets the value of the devicePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDevicePoolName(ORFkType value) {
        this.devicePoolName = value;
    }

    /**
     * Gets the value of the commonDeviceConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCommonDeviceConfigName() {
        return commonDeviceConfigName;
    }

    /**
     * Sets the value of the commonDeviceConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCommonDeviceConfigName(ORFkType value) {
        this.commonDeviceConfigName = value;
    }

    /**
     * Gets the value of the commonPhoneConfigName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCommonPhoneConfigName() {
        return commonPhoneConfigName;
    }

    /**
     * Sets the value of the commonPhoneConfigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCommonPhoneConfigName(ORFkType value) {
        this.commonPhoneConfigName = value;
    }

    /**
     * Gets the value of the networkLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getNetworkLocation() {
        return networkLocation;
    }

    /**
     * Sets the value of the networkLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setNetworkLocation(ORFkType value) {
        this.networkLocation = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setLocationName(ORFkType value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the mediaResourceListName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMediaResourceListName() {
        return mediaResourceListName;
    }

    /**
     * Sets the value of the mediaResourceListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMediaResourceListName(ORFkType value) {
        this.mediaResourceListName = value;
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
     * Gets the value of the automatedAlternateRoutingCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAutomatedAlternateRoutingCssName() {
        return automatedAlternateRoutingCssName;
    }

    /**
     * Sets the value of the automatedAlternateRoutingCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAutomatedAlternateRoutingCssName(ORFkType value) {
        this.automatedAlternateRoutingCssName = value;
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
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMlppIndicationStatus(ORFkType value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPreemption(ORFkType value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUseTrustedRelayPoint(ORFkType value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the securityProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * Sets the value of the securityProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSecurityProfileName(ORFkType value) {
        this.securityProfileName = value;
    }

    /**
     * Gets the value of the sipProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSipProfileName() {
        return sipProfileName;
    }

    /**
     * Sets the value of the sipProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSipProfileName(ORFkType value) {
        this.sipProfileName = value;
    }

    /**
     * Gets the value of the cgpnTransformationCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCgpnTransformationCssName() {
        return cgpnTransformationCssName;
    }

    /**
     * Sets the value of the cgpnTransformationCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCgpnTransformationCssName(ORFkType value) {
        this.cgpnTransformationCssName = value;
    }

    /**
     * Gets the value of the geoLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getGeoLocationName() {
        return geoLocationName;
    }

    /**
     * Sets the value of the geoLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setGeoLocationName(ORFkType value) {
        this.geoLocationName = value;
    }

    /**
     * Gets the value of the geoLocationFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getGeoLocationFilterName() {
        return geoLocationFilterName;
    }

    /**
     * Sets the value of the geoLocationFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setGeoLocationFilterName(ORFkType value) {
        this.geoLocationFilterName = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ORPhone.Lines }
     *     
     */
    public ORPhone.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORPhone.Lines }
     *     
     */
    public void setLines(ORPhone.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPhoneTemplateName(ORFkType value) {
        this.phoneTemplateName = value;
    }

    /**
     * Gets the value of the primaryPhoneName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPrimaryPhoneName() {
        return primaryPhoneName;
    }

    /**
     * Sets the value of the primaryPhoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPrimaryPhoneName(ORFkType value) {
        this.primaryPhoneName = value;
    }

    /**
     * Gets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRingSettingIdleBlfAudibleAlert() {
        return ringSettingIdleBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingIdleBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRingSettingIdleBlfAudibleAlert(ORFkType value) {
        this.ringSettingIdleBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRingSettingBusyBlfAudibleAlert() {
        return ringSettingBusyBlfAudibleAlert;
    }

    /**
     * Sets the value of the ringSettingBusyBlfAudibleAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRingSettingBusyBlfAudibleAlert(ORFkType value) {
        this.ringSettingBusyBlfAudibleAlert = value;
    }

    /**
     * Gets the value of the blfDirectedCallParks property.
     * 
     * @return
     *     possible object is
     *     {@link ORPhone.BlfDirectedCallParks }
     *     
     */
    public ORPhone.BlfDirectedCallParks getBlfDirectedCallParks() {
        return blfDirectedCallParks;
    }

    /**
     * Sets the value of the blfDirectedCallParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORPhone.BlfDirectedCallParks }
     *     
     */
    public void setBlfDirectedCallParks(ORPhone.BlfDirectedCallParks value) {
        this.blfDirectedCallParks = value;
    }

    /**
     * Gets the value of the addOnModules property.
     * 
     * @return
     *     possible object is
     *     {@link ORPhone.AddOnModules }
     *     
     */
    public ORPhone.AddOnModules getAddOnModules() {
        return addOnModules;
    }

    /**
     * Sets the value of the addOnModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORPhone.AddOnModules }
     *     
     */
    public void setAddOnModules(ORPhone.AddOnModules value) {
        this.addOnModules = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUserLocale(ORFkType value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the networkLocale property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getNetworkLocale() {
        return networkLocale;
    }

    /**
     * Sets the value of the networkLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setNetworkLocale(ORFkType value) {
        this.networkLocale = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ORPhone.Services }
     *     
     */
    public ORPhone.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORPhone.Services }
     *     
     */
    public void setServices(ORPhone.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSoftkeyTemplateName(ORFkType value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the defaultProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDefaultProfileName() {
        return defaultProfileName;
    }

    /**
     * Sets the value of the defaultProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDefaultProfileName(ORFkType value) {
        this.defaultProfileName = value;
    }

    /**
     * Gets the value of the singleButtonBarge property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSingleButtonBarge() {
        return singleButtonBarge;
    }

    /**
     * Sets the value of the singleButtonBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSingleButtonBarge(ORFkType value) {
        this.singleButtonBarge = value;
    }

    /**
     * Gets the value of the joinAcrossLines property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getJoinAcrossLines() {
        return joinAcrossLines;
    }

    /**
     * Sets the value of the joinAcrossLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setJoinAcrossLines(ORFkType value) {
        this.joinAcrossLines = value;
    }

    /**
     * Gets the value of the builtInBridgeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getBuiltInBridgeStatus() {
        return builtInBridgeStatus;
    }

    /**
     * Sets the value of the builtInBridgeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setBuiltInBridgeStatus(ORFkType value) {
        this.builtInBridgeStatus = value;
    }

    /**
     * Gets the value of the callInfoPrivacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallInfoPrivacyStatus() {
        return callInfoPrivacyStatus;
    }

    /**
     * Sets the value of the callInfoPrivacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallInfoPrivacyStatus(ORFkType value) {
        this.callInfoPrivacyStatus = value;
    }

    /**
     * Gets the value of the ownerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getOwnerUserName() {
        return ownerUserName;
    }

    /**
     * Sets the value of the ownerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setOwnerUserName(ORFkType value) {
        this.ownerUserName = value;
    }

    /**
     * Gets the value of the packetCaptureMode property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPacketCaptureMode() {
        return packetCaptureMode;
    }

    /**
     * Sets the value of the packetCaptureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPacketCaptureMode(ORFkType value) {
        this.packetCaptureMode = value;
    }

    /**
     * Gets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getSubscribeCallingSearchSpaceName() {
        return subscribeCallingSearchSpaceName;
    }

    /**
     * Sets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setSubscribeCallingSearchSpaceName(ORFkType value) {
        this.subscribeCallingSearchSpaceName = value;
    }

    /**
     * Gets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRerouteCallingSearchSpaceName() {
        return rerouteCallingSearchSpaceName;
    }

    /**
     * Sets the value of the rerouteCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRerouteCallingSearchSpaceName(ORFkType value) {
        this.rerouteCallingSearchSpaceName = value;
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
     * Gets the value of the certificateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCertificateOperation() {
        return certificateOperation;
    }

    /**
     * Sets the value of the certificateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCertificateOperation(ORFkType value) {
        this.certificateOperation = value;
    }

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAuthenticationMode(ORFkType value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setKeySize(ORFkType value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the deviceMobilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDeviceMobilityMode() {
        return deviceMobilityMode;
    }

    /**
     * Sets the value of the deviceMobilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDeviceMobilityMode(ORFkType value) {
        this.deviceMobilityMode = value;
    }

    /**
     * Gets the value of the dndOption property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDndOption() {
        return dndOption;
    }

    /**
     * Sets the value of the dndOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDndOption(ORFkType value) {
        this.dndOption = value;
    }

    /**
     * Gets the value of the dndRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDndRingSetting(ORFkType value) {
        this.dndRingSetting = value;
    }

    /**
     * Gets the value of the mobilityUserIdName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMobilityUserIdName() {
        return mobilityUserIdName;
    }

    /**
     * Sets the value of the mobilityUserIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMobilityUserIdName(ORFkType value) {
        this.mobilityUserIdName = value;
    }

    /**
     * Gets the value of the phoneSuite property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPhoneSuite() {
        return phoneSuite;
    }

    /**
     * Sets the value of the phoneSuite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPhoneSuite(ORFkType value) {
        this.phoneSuite = value;
    }

    /**
     * Gets the value of the phoneServiceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPhoneServiceDisplay() {
        return phoneServiceDisplay;
    }

    /**
     * Sets the value of the phoneServiceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPhoneServiceDisplay(ORFkType value) {
        this.phoneServiceDisplay = value;
    }

    /**
     * Gets the value of the mtpPreferedCodec property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMtpPreferedCodec() {
        return mtpPreferedCodec;
    }

    /**
     * Sets the value of the mtpPreferedCodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMtpPreferedCodec(ORFkType value) {
        this.mtpPreferedCodec = value;
    }

    /**
     * Gets the value of the dialRulesName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDialRulesName() {
        return dialRulesName;
    }

    /**
     * Sets the value of the dialRulesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDialRulesName(ORFkType value) {
        this.dialRulesName = value;
    }

    /**
     * Gets the value of the outboundCallRollover property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getOutboundCallRollover() {
        return outboundCallRollover;
    }

    /**
     * Sets the value of the outboundCallRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setOutboundCallRollover(ORFkType value) {
        this.outboundCallRollover = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLine property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAlwaysUsePrimeLine() {
        return alwaysUsePrimeLine;
    }

    /**
     * Sets the value of the alwaysUsePrimeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAlwaysUsePrimeLine(ORFkType value) {
        this.alwaysUsePrimeLine = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAlwaysUsePrimeLineForVoiceMessage() {
        return alwaysUsePrimeLineForVoiceMessage;
    }

    /**
     * Sets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAlwaysUsePrimeLineForVoiceMessage(ORFkType value) {
        this.alwaysUsePrimeLineForVoiceMessage = value;
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setFeatureControlPolicy(ORFkType value) {
        this.featureControlPolicy = value;
    }

    /**
     * Gets the value of the deviceTrustMode property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDeviceTrustMode() {
        return deviceTrustMode;
    }

    /**
     * Sets the value of the deviceTrustMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDeviceTrustMode(ORFkType value) {
        this.deviceTrustMode = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ORPhone.ConfidentialAccess }
     *     
     */
    public ORPhone.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORPhone.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(ORPhone.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the cgpnIngressDN property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCgpnIngressDN() {
        return cgpnIngressDN;
    }

    /**
     * Sets the value of the cgpnIngressDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCgpnIngressDN(ORFkType value) {
        this.cgpnIngressDN = value;
    }

    /**
     * Gets the value of the wifiHotspotProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getWifiHotspotProfile() {
        return wifiHotspotProfile;
    }

    /**
     * Sets the value of the wifiHotspotProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setWifiHotspotProfile(ORFkType value) {
        this.wifiHotspotProfile = value;
    }

    /**
     * Gets the value of the wirelessLanProfileGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getWirelessLanProfileGroup() {
        return wirelessLanProfileGroup;
    }

    /**
     * Sets the value of the wirelessLanProfileGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setWirelessLanProfileGroup(ORFkType value) {
        this.wirelessLanProfileGroup = value;
    }

    /**
     * Gets the value of the ctiid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCtiid() {
        return ctiid;
    }

    /**
     * Sets the value of the ctiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCtiid(BigInteger value) {
        this.ctiid = value;
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
     *         &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}ORAddOnModule" maxOccurs="3" minOccurs="0"/>
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
        "addOnModule"
    })
    public static class AddOnModules {

        protected List<ORAddOnModule> addOnModule;

        /**
         * Gets the value of the addOnModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addOnModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddOnModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORAddOnModule }
         * 
         * 
         */
        public List<ORAddOnModule> getAddOnModule() {
            if (addOnModule == null) {
                addOnModule = new ArrayList<ORAddOnModule>();
            }
            return this.addOnModule;
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
     *         &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}ORBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
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
        "blfDirectedCallPark"
    })
    public static class BlfDirectedCallParks {

        protected List<ORBLFDirectedCallPark> blfDirectedCallPark;

        /**
         * Gets the value of the blfDirectedCallPark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blfDirectedCallPark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlfDirectedCallPark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORBLFDirectedCallPark }
         * 
         * 
         */
        public List<ORBLFDirectedCallPark> getBlfDirectedCallPark() {
            if (blfDirectedCallPark == null) {
                blfDirectedCallPark = new ArrayList<ORBLFDirectedCallPark>();
            }
            return this.blfDirectedCallPark;
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
     *         &lt;element name="confidentialAccessMode" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
     *         &lt;element name="confidentialAccessLevel" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
        protected ORFkType confidentialAccessLevel;

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
         *     {@link ORFkType }
         *     
         */
        public ORFkType getConfidentialAccessLevel() {
            return confidentialAccessLevel;
        }

        /**
         * Sets the value of the confidentialAccessLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORFkType }
         *     
         */
        public void setConfidentialAccessLevel(ORFkType value) {
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}ORPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}ORNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line",
        "lineIdentifier"
    })
    public static class Lines {

        protected List<ORPhoneLine> line;
        protected List<ORNumplanIdentifier> lineIdentifier;

        /**
         * Gets the value of the line property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the line property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORPhoneLine }
         * 
         * 
         */
        public List<ORPhoneLine> getLine() {
            if (line == null) {
                line = new ArrayList<ORPhoneLine>();
            }
            return this.line;
        }

        /**
         * Gets the value of the lineIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORNumplanIdentifier }
         * 
         * 
         */
        public List<ORNumplanIdentifier> getLineIdentifier() {
            if (lineIdentifier == null) {
                lineIdentifier = new ArrayList<ORNumplanIdentifier>();
            }
            return this.lineIdentifier;
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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}ORSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
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
        "service"
    })
    public static class Services {

        protected List<ORSubscribedService> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ORSubscribedService }
         * 
         * 
         */
        public List<ORSubscribedService> getService() {
            if (service == null) {
                service = new ArrayList<ORSubscribedService>();
            }
            return this.service;
        }

    }

}
