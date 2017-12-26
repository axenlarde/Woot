
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
 * <p>Java class for OXDeviceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXDeviceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="product" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.cisco.com/AXL/API/10.5}OXFkTypeProduct" minOccurs="0"/>
 *         &lt;element name="protocolSide" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}OXPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}OXNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneTemplateName" type="{http://www.cisco.com/AXL/API/10.5}OXFkTypeProduct_Protocol" minOccurs="0"/>
 *         &lt;element name="blfDirectedCallParks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}OXBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}OXAddOnModule" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="singleButtonBarge" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="joinAcrossLines" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="loginUserId" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dndOption" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dndRingSetting" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="emccCallingSearchSpace" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLine" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="alwaysUsePrimeLineForVoiceMessage" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callInfoPrivacyStatus" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}OXSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="featureControlPolicy" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
@XmlType(name = "OXDeviceProfile", propOrder = {
    "product",
    "clazz",
    "protocol",
    "protocolSide",
    "userHoldMohAudioSourceId",
    "mlppIndicationStatus",
    "preemption",
    "lines",
    "phoneTemplateName",
    "blfDirectedCallParks",
    "addOnModules",
    "userLocale",
    "singleButtonBarge",
    "joinAcrossLines",
    "loginUserId",
    "dndOption",
    "dndRingSetting",
    "emccCallingSearchSpace",
    "alwaysUsePrimeLine",
    "alwaysUsePrimeLineForVoiceMessage",
    "softkeyTemplateName",
    "callInfoPrivacyStatus",
    "services",
    "featureControlPolicy"
})
public class OXDeviceProfile {

    protected OXFkType product;
    @XmlElement(name = "class")
    protected OXFkType clazz;
    protected OXFkTypeProduct protocol;
    protected OXFkType protocolSide;
    protected OXFkType userHoldMohAudioSourceId;
    protected OXFkType mlppIndicationStatus;
    protected OXFkType preemption;
    protected OXDeviceProfile.Lines lines;
    protected OXFkTypeProductProtocol phoneTemplateName;
    protected OXDeviceProfile.BlfDirectedCallParks blfDirectedCallParks;
    protected OXDeviceProfile.AddOnModules addOnModules;
    protected OXFkType userLocale;
    protected OXFkType singleButtonBarge;
    protected OXFkType joinAcrossLines;
    protected OXFkType loginUserId;
    protected OXFkType dndOption;
    protected OXFkType dndRingSetting;
    protected OXFkType emccCallingSearchSpace;
    protected OXFkType alwaysUsePrimeLine;
    protected OXFkType alwaysUsePrimeLineForVoiceMessage;
    protected OXFkType softkeyTemplateName;
    protected OXFkType callInfoPrivacyStatus;
    protected OXDeviceProfile.Services services;
    protected OXFkType featureControlPolicy;
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
     *     {@link OXFkType }
     *     
     */
    public OXFkType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setProduct(OXFkType value) {
        this.product = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setClazz(OXFkType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkTypeProduct }
     *     
     */
    public OXFkTypeProduct getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkTypeProduct }
     *     
     */
    public void setProtocol(OXFkTypeProduct value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the protocolSide property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getProtocolSide() {
        return protocolSide;
    }

    /**
     * Sets the value of the protocolSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setProtocolSide(OXFkType value) {
        this.protocolSide = value;
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
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setMlppIndicationStatus(OXFkType value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPreemption(OXFkType value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link OXDeviceProfile.Lines }
     *     
     */
    public OXDeviceProfile.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXDeviceProfile.Lines }
     *     
     */
    public void setLines(OXDeviceProfile.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the phoneTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkTypeProductProtocol }
     *     
     */
    public OXFkTypeProductProtocol getPhoneTemplateName() {
        return phoneTemplateName;
    }

    /**
     * Sets the value of the phoneTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkTypeProductProtocol }
     *     
     */
    public void setPhoneTemplateName(OXFkTypeProductProtocol value) {
        this.phoneTemplateName = value;
    }

    /**
     * Gets the value of the blfDirectedCallParks property.
     * 
     * @return
     *     possible object is
     *     {@link OXDeviceProfile.BlfDirectedCallParks }
     *     
     */
    public OXDeviceProfile.BlfDirectedCallParks getBlfDirectedCallParks() {
        return blfDirectedCallParks;
    }

    /**
     * Sets the value of the blfDirectedCallParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXDeviceProfile.BlfDirectedCallParks }
     *     
     */
    public void setBlfDirectedCallParks(OXDeviceProfile.BlfDirectedCallParks value) {
        this.blfDirectedCallParks = value;
    }

    /**
     * Gets the value of the addOnModules property.
     * 
     * @return
     *     possible object is
     *     {@link OXDeviceProfile.AddOnModules }
     *     
     */
    public OXDeviceProfile.AddOnModules getAddOnModules() {
        return addOnModules;
    }

    /**
     * Sets the value of the addOnModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXDeviceProfile.AddOnModules }
     *     
     */
    public void setAddOnModules(OXDeviceProfile.AddOnModules value) {
        this.addOnModules = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUserLocale(OXFkType value) {
        this.userLocale = value;
    }

    /**
     * Gets the value of the singleButtonBarge property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSingleButtonBarge() {
        return singleButtonBarge;
    }

    /**
     * Sets the value of the singleButtonBarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSingleButtonBarge(OXFkType value) {
        this.singleButtonBarge = value;
    }

    /**
     * Gets the value of the joinAcrossLines property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getJoinAcrossLines() {
        return joinAcrossLines;
    }

    /**
     * Sets the value of the joinAcrossLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setJoinAcrossLines(OXFkType value) {
        this.joinAcrossLines = value;
    }

    /**
     * Gets the value of the loginUserId property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getLoginUserId() {
        return loginUserId;
    }

    /**
     * Sets the value of the loginUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setLoginUserId(OXFkType value) {
        this.loginUserId = value;
    }

    /**
     * Gets the value of the dndOption property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDndOption() {
        return dndOption;
    }

    /**
     * Sets the value of the dndOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDndOption(OXFkType value) {
        this.dndOption = value;
    }

    /**
     * Gets the value of the dndRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDndRingSetting() {
        return dndRingSetting;
    }

    /**
     * Sets the value of the dndRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDndRingSetting(OXFkType value) {
        this.dndRingSetting = value;
    }

    /**
     * Gets the value of the emccCallingSearchSpace property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getEmccCallingSearchSpace() {
        return emccCallingSearchSpace;
    }

    /**
     * Sets the value of the emccCallingSearchSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setEmccCallingSearchSpace(OXFkType value) {
        this.emccCallingSearchSpace = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLine property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAlwaysUsePrimeLine() {
        return alwaysUsePrimeLine;
    }

    /**
     * Sets the value of the alwaysUsePrimeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAlwaysUsePrimeLine(OXFkType value) {
        this.alwaysUsePrimeLine = value;
    }

    /**
     * Gets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAlwaysUsePrimeLineForVoiceMessage() {
        return alwaysUsePrimeLineForVoiceMessage;
    }

    /**
     * Sets the value of the alwaysUsePrimeLineForVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAlwaysUsePrimeLineForVoiceMessage(OXFkType value) {
        this.alwaysUsePrimeLineForVoiceMessage = value;
    }

    /**
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setSoftkeyTemplateName(OXFkType value) {
        this.softkeyTemplateName = value;
    }

    /**
     * Gets the value of the callInfoPrivacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallInfoPrivacyStatus() {
        return callInfoPrivacyStatus;
    }

    /**
     * Sets the value of the callInfoPrivacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallInfoPrivacyStatus(OXFkType value) {
        this.callInfoPrivacyStatus = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link OXDeviceProfile.Services }
     *     
     */
    public OXDeviceProfile.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXDeviceProfile.Services }
     *     
     */
    public void setServices(OXDeviceProfile.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the featureControlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getFeatureControlPolicy() {
        return featureControlPolicy;
    }

    /**
     * Sets the value of the featureControlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setFeatureControlPolicy(OXFkType value) {
        this.featureControlPolicy = value;
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
     *         &lt;element name="addOnModule" type="{http://www.cisco.com/AXL/API/10.5}OXAddOnModule" maxOccurs="2" minOccurs="0"/>
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

        protected List<OXAddOnModule> addOnModule;

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
         * {@link OXAddOnModule }
         * 
         * 
         */
        public List<OXAddOnModule> getAddOnModule() {
            if (addOnModule == null) {
                addOnModule = new ArrayList<OXAddOnModule>();
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
     *         &lt;element name="blfDirectedCallPark" type="{http://www.cisco.com/AXL/API/10.5}OXBLFDirectedCallPark" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<OXBLFDirectedCallPark> blfDirectedCallPark;

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
         * {@link OXBLFDirectedCallPark }
         * 
         * 
         */
        public List<OXBLFDirectedCallPark> getBlfDirectedCallPark() {
            if (blfDirectedCallPark == null) {
                blfDirectedCallPark = new ArrayList<OXBLFDirectedCallPark>();
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
     *       &lt;choice minOccurs="0">
     *         &lt;element name="line" type="{http://www.cisco.com/AXL/API/10.5}OXPhoneLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="lineIdentifier" type="{http://www.cisco.com/AXL/API/10.5}OXNumplanIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<OXPhoneLine> line;
        protected List<OXNumplanIdentifier> lineIdentifier;

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
         * {@link OXPhoneLine }
         * 
         * 
         */
        public List<OXPhoneLine> getLine() {
            if (line == null) {
                line = new ArrayList<OXPhoneLine>();
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
         * {@link OXNumplanIdentifier }
         * 
         * 
         */
        public List<OXNumplanIdentifier> getLineIdentifier() {
            if (lineIdentifier == null) {
                lineIdentifier = new ArrayList<OXNumplanIdentifier>();
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
     *         &lt;element name="service" type="{http://www.cisco.com/AXL/API/10.5}OXSubscribedService" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<OXSubscribedService> service;

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
         * {@link OXSubscribedService }
         * 
         * 
         */
        public List<OXSubscribedService> getService() {
            if (service == null) {
                service = new ArrayList<OXSubscribedService>();
            }
            return this.service;
        }

    }

}
