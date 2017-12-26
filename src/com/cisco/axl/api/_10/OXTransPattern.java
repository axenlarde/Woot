
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXTransPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXTransPattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="routeClass" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="callInterceptProfileName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
@XmlType(name = "OXTransPattern", propOrder = {
    "usage",
    "routePartitionName",
    "useCallingPartyPhoneMask",
    "dialPlanName",
    "digitDiscardInstructionName",
    "routeFilterName",
    "callingLinePresentationBit",
    "callingNamePresentationBit",
    "connectedLinePresentationBit",
    "connectedNamePresentationBit",
    "patternPrecedence",
    "callingPartyNumberingPlan",
    "callingPartyNumberType",
    "calledPartyNumberingPlan",
    "calledPartyNumberType",
    "callingSearchSpaceName",
    "resourcePriorityNamespaceName",
    "routeClass",
    "callInterceptProfileName",
    "releaseClause"
})
public class OXTransPattern {

    protected OXFkType usage;
    protected OXFkType routePartitionName;
    protected OXFkType useCallingPartyPhoneMask;
    protected OXFkType dialPlanName;
    protected OXFkType digitDiscardInstructionName;
    protected OXFkType routeFilterName;
    protected OXFkType callingLinePresentationBit;
    protected OXFkType callingNamePresentationBit;
    protected OXFkType connectedLinePresentationBit;
    protected OXFkType connectedNamePresentationBit;
    protected OXFkType patternPrecedence;
    protected OXFkType callingPartyNumberingPlan;
    protected OXFkType callingPartyNumberType;
    protected OXFkType calledPartyNumberingPlan;
    protected OXFkType calledPartyNumberType;
    protected OXFkType callingSearchSpaceName;
    protected OXFkType resourcePriorityNamespaceName;
    protected OXFkType routeClass;
    protected OXFkType callInterceptProfileName;
    protected OXFkType releaseClause;
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
     * Gets the value of the useCallingPartyPhoneMask property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getUseCallingPartyPhoneMask() {
        return useCallingPartyPhoneMask;
    }

    /**
     * Sets the value of the useCallingPartyPhoneMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setUseCallingPartyPhoneMask(OXFkType value) {
        this.useCallingPartyPhoneMask = value;
    }

    /**
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDialPlanName(OXFkType value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setDigitDiscardInstructionName(OXFkType value) {
        this.digitDiscardInstructionName = value;
    }

    /**
     * Gets the value of the routeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRouteFilterName() {
        return routeFilterName;
    }

    /**
     * Sets the value of the routeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRouteFilterName(OXFkType value) {
        this.routeFilterName = value;
    }

    /**
     * Gets the value of the callingLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingLinePresentationBit() {
        return callingLinePresentationBit;
    }

    /**
     * Sets the value of the callingLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingLinePresentationBit(OXFkType value) {
        this.callingLinePresentationBit = value;
    }

    /**
     * Gets the value of the callingNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingNamePresentationBit() {
        return callingNamePresentationBit;
    }

    /**
     * Sets the value of the callingNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingNamePresentationBit(OXFkType value) {
        this.callingNamePresentationBit = value;
    }

    /**
     * Gets the value of the connectedLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getConnectedLinePresentationBit() {
        return connectedLinePresentationBit;
    }

    /**
     * Sets the value of the connectedLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setConnectedLinePresentationBit(OXFkType value) {
        this.connectedLinePresentationBit = value;
    }

    /**
     * Gets the value of the connectedNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getConnectedNamePresentationBit() {
        return connectedNamePresentationBit;
    }

    /**
     * Sets the value of the connectedNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setConnectedNamePresentationBit(OXFkType value) {
        this.connectedNamePresentationBit = value;
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
     * Gets the value of the callingPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingPartyNumberingPlan() {
        return callingPartyNumberingPlan;
    }

    /**
     * Sets the value of the callingPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingPartyNumberingPlan(OXFkType value) {
        this.callingPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the callingPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingPartyNumberType() {
        return callingPartyNumberType;
    }

    /**
     * Sets the value of the callingPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingPartyNumberType(OXFkType value) {
        this.callingPartyNumberType = value;
    }

    /**
     * Gets the value of the calledPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCalledPartyNumberingPlan() {
        return calledPartyNumberingPlan;
    }

    /**
     * Sets the value of the calledPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCalledPartyNumberingPlan(OXFkType value) {
        this.calledPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the calledPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCalledPartyNumberType() {
        return calledPartyNumberType;
    }

    /**
     * Sets the value of the calledPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCalledPartyNumberType(OXFkType value) {
        this.calledPartyNumberType = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallingSearchSpaceName(OXFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the resourcePriorityNamespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getResourcePriorityNamespaceName() {
        return resourcePriorityNamespaceName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setResourcePriorityNamespaceName(OXFkType value) {
        this.resourcePriorityNamespaceName = value;
    }

    /**
     * Gets the value of the routeClass property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRouteClass() {
        return routeClass;
    }

    /**
     * Sets the value of the routeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRouteClass(OXFkType value) {
        this.routeClass = value;
    }

    /**
     * Gets the value of the callInterceptProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getCallInterceptProfileName() {
        return callInterceptProfileName;
    }

    /**
     * Sets the value of the callInterceptProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setCallInterceptProfileName(OXFkType value) {
        this.callInterceptProfileName = value;
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
