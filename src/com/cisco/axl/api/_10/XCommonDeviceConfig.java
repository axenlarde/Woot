
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonDeviceConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonDeviceConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}UniqueString50"/>
 *         &lt;element name="softkeyTemplateName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="userHoldMohAudioSourceId" type="{http://www.cisco.com/AXL/API/10.5}XMOHAudioSourceId" minOccurs="0"/>
 *         &lt;element name="mlppDomainId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="mlppIndicationStatus" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="useTrustedRelayPoint" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="preemption" type="{http://www.cisco.com/AXL/API/10.5}XPreemption" minOccurs="0"/>
 *         &lt;element name="ipAddressingMode" type="{http://www.cisco.com/AXL/API/10.5}XIPAddressingMode" minOccurs="0"/>
 *         &lt;element name="ipAddressingModePreferenceControl" type="{http://www.cisco.com/AXL/API/10.5}XIPAddressingModePrefControl" minOccurs="0"/>
 *         &lt;element name="allowAutoConfigurationForPhones" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="useImeForOutboundCalls" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
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
 *         &lt;element name="allowDuplicateAddressDetection" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="acceptRedirectMessages" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *         &lt;element name="replyMulticastEchoRequest" type="{http://www.cisco.com/AXL/API/10.5}XStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonDeviceConfig", propOrder = {
    "name",
    "softkeyTemplateName",
    "userLocale",
    "networkHoldMohAudioSourceId",
    "userHoldMohAudioSourceId",
    "mlppDomainId",
    "mlppIndicationStatus",
    "useTrustedRelayPoint",
    "preemption",
    "ipAddressingMode",
    "ipAddressingModePreferenceControl",
    "allowAutoConfigurationForPhones",
    "useImeForOutboundCalls",
    "confidentialAccess",
    "allowDuplicateAddressDetection",
    "acceptRedirectMessages",
    "replyMulticastEchoRequest"
})
public class XCommonDeviceConfig {

    protected String name;
    @XmlElementRef(name = "softkeyTemplateName", type = JAXBElement.class)
    protected JAXBElement<XFkType> softkeyTemplateName;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    @XmlElementRef(name = "networkHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSourceId;
    @XmlElementRef(name = "userHoldMohAudioSourceId", type = JAXBElement.class)
    protected JAXBElement<String> userHoldMohAudioSourceId;
    @XmlElementRef(name = "mlppDomainId", type = JAXBElement.class)
    protected JAXBElement<String> mlppDomainId;
    @XmlElement(defaultValue = "Default")
    protected String mlppIndicationStatus;
    @XmlElement(defaultValue = "false")
    protected String useTrustedRelayPoint;
    @XmlElement(defaultValue = "Default")
    protected String preemption;
    @XmlElement(defaultValue = "IPv4 and IPv6")
    protected String ipAddressingMode;
    @XmlElement(defaultValue = "Use System Default")
    protected String ipAddressingModePreferenceControl;
    @XmlElement(defaultValue = "Default")
    protected String allowAutoConfigurationForPhones;
    @XmlElement(defaultValue = "Default")
    protected String useImeForOutboundCalls;
    protected XCommonDeviceConfig.ConfidentialAccess confidentialAccess;
    @XmlElement(defaultValue = "Default")
    protected String allowDuplicateAddressDetection;
    @XmlElement(defaultValue = "Default")
    protected String acceptRedirectMessages;
    @XmlElement(defaultValue = "Default")
    protected String replyMulticastEchoRequest;

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
     * Gets the value of the softkeyTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSoftkeyTemplateName() {
        return softkeyTemplateName;
    }

    /**
     * Sets the value of the softkeyTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSoftkeyTemplateName(JAXBElement<XFkType> value) {
        this.softkeyTemplateName = ((JAXBElement<XFkType> ) value);
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
     * Gets the value of the networkHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHoldMohAudioSourceId() {
        return networkHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHoldMohAudioSourceId(JAXBElement<String> value) {
        this.networkHoldMohAudioSourceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userHoldMohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserHoldMohAudioSourceId() {
        return userHoldMohAudioSourceId;
    }

    /**
     * Sets the value of the userHoldMohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserHoldMohAudioSourceId(JAXBElement<String> value) {
        this.userHoldMohAudioSourceId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mlppDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppDomainId() {
        return mlppDomainId;
    }

    /**
     * Sets the value of the mlppDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppDomainId(JAXBElement<String> value) {
        this.mlppDomainId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mlppIndicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlppIndicationStatus() {
        return mlppIndicationStatus;
    }

    /**
     * Sets the value of the mlppIndicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlppIndicationStatus(String value) {
        this.mlppIndicationStatus = value;
    }

    /**
     * Gets the value of the useTrustedRelayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTrustedRelayPoint() {
        return useTrustedRelayPoint;
    }

    /**
     * Sets the value of the useTrustedRelayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTrustedRelayPoint(String value) {
        this.useTrustedRelayPoint = value;
    }

    /**
     * Gets the value of the preemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemption() {
        return preemption;
    }

    /**
     * Sets the value of the preemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemption(String value) {
        this.preemption = value;
    }

    /**
     * Gets the value of the ipAddressingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingMode() {
        return ipAddressingMode;
    }

    /**
     * Sets the value of the ipAddressingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingMode(String value) {
        this.ipAddressingMode = value;
    }

    /**
     * Gets the value of the ipAddressingModePreferenceControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressingModePreferenceControl() {
        return ipAddressingModePreferenceControl;
    }

    /**
     * Sets the value of the ipAddressingModePreferenceControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressingModePreferenceControl(String value) {
        this.ipAddressingModePreferenceControl = value;
    }

    /**
     * Gets the value of the allowAutoConfigurationForPhones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAutoConfigurationForPhones() {
        return allowAutoConfigurationForPhones;
    }

    /**
     * Sets the value of the allowAutoConfigurationForPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAutoConfigurationForPhones(String value) {
        this.allowAutoConfigurationForPhones = value;
    }

    /**
     * Gets the value of the useImeForOutboundCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseImeForOutboundCalls() {
        return useImeForOutboundCalls;
    }

    /**
     * Sets the value of the useImeForOutboundCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseImeForOutboundCalls(String value) {
        this.useImeForOutboundCalls = value;
    }

    /**
     * Gets the value of the confidentialAccess property.
     * 
     * @return
     *     possible object is
     *     {@link XCommonDeviceConfig.ConfidentialAccess }
     *     
     */
    public XCommonDeviceConfig.ConfidentialAccess getConfidentialAccess() {
        return confidentialAccess;
    }

    /**
     * Sets the value of the confidentialAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCommonDeviceConfig.ConfidentialAccess }
     *     
     */
    public void setConfidentialAccess(XCommonDeviceConfig.ConfidentialAccess value) {
        this.confidentialAccess = value;
    }

    /**
     * Gets the value of the allowDuplicateAddressDetection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDuplicateAddressDetection() {
        return allowDuplicateAddressDetection;
    }

    /**
     * Sets the value of the allowDuplicateAddressDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDuplicateAddressDetection(String value) {
        this.allowDuplicateAddressDetection = value;
    }

    /**
     * Gets the value of the acceptRedirectMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptRedirectMessages() {
        return acceptRedirectMessages;
    }

    /**
     * Sets the value of the acceptRedirectMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptRedirectMessages(String value) {
        this.acceptRedirectMessages = value;
    }

    /**
     * Gets the value of the replyMulticastEchoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyMulticastEchoRequest() {
        return replyMulticastEchoRequest;
    }

    /**
     * Sets the value of the replyMulticastEchoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyMulticastEchoRequest(String value) {
        this.replyMulticastEchoRequest = value;
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

}
