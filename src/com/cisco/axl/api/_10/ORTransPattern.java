
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORTransPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORTransPattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="usage" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="useCallingPartyPhoneMask" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="dialPlanName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="digitDiscardInstructionName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="routeFilterName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingLinePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingNamePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="connectedLinePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="connectedNamePresentationBit" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingPartyNumberType" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberingPlan" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="calledPartyNumberType" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="resourcePriorityNamespaceName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="routeClass" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="callInterceptProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="releaseClause" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
@XmlType(name = "ORTransPattern", propOrder = {
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
public class ORTransPattern {

    protected ORFkType usage;
    protected ORFkType routePartitionName;
    protected ORFkType useCallingPartyPhoneMask;
    protected ORFkType dialPlanName;
    protected ORFkType digitDiscardInstructionName;
    protected ORFkType routeFilterName;
    protected ORFkType callingLinePresentationBit;
    protected ORFkType callingNamePresentationBit;
    protected ORFkType connectedLinePresentationBit;
    protected ORFkType connectedNamePresentationBit;
    protected ORFkType patternPrecedence;
    protected ORFkType callingPartyNumberingPlan;
    protected ORFkType callingPartyNumberType;
    protected ORFkType calledPartyNumberingPlan;
    protected ORFkType calledPartyNumberType;
    protected ORFkType callingSearchSpaceName;
    protected ORFkType resourcePriorityNamespaceName;
    protected ORFkType routeClass;
    protected ORFkType callInterceptProfileName;
    protected ORFkType releaseClause;
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
     * Gets the value of the useCallingPartyPhoneMask property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getUseCallingPartyPhoneMask() {
        return useCallingPartyPhoneMask;
    }

    /**
     * Sets the value of the useCallingPartyPhoneMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setUseCallingPartyPhoneMask(ORFkType value) {
        this.useCallingPartyPhoneMask = value;
    }

    /**
     * Gets the value of the dialPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDialPlanName() {
        return dialPlanName;
    }

    /**
     * Sets the value of the dialPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDialPlanName(ORFkType value) {
        this.dialPlanName = value;
    }

    /**
     * Gets the value of the digitDiscardInstructionName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getDigitDiscardInstructionName() {
        return digitDiscardInstructionName;
    }

    /**
     * Sets the value of the digitDiscardInstructionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setDigitDiscardInstructionName(ORFkType value) {
        this.digitDiscardInstructionName = value;
    }

    /**
     * Gets the value of the routeFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRouteFilterName() {
        return routeFilterName;
    }

    /**
     * Sets the value of the routeFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRouteFilterName(ORFkType value) {
        this.routeFilterName = value;
    }

    /**
     * Gets the value of the callingLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingLinePresentationBit() {
        return callingLinePresentationBit;
    }

    /**
     * Sets the value of the callingLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingLinePresentationBit(ORFkType value) {
        this.callingLinePresentationBit = value;
    }

    /**
     * Gets the value of the callingNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingNamePresentationBit() {
        return callingNamePresentationBit;
    }

    /**
     * Sets the value of the callingNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingNamePresentationBit(ORFkType value) {
        this.callingNamePresentationBit = value;
    }

    /**
     * Gets the value of the connectedLinePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getConnectedLinePresentationBit() {
        return connectedLinePresentationBit;
    }

    /**
     * Sets the value of the connectedLinePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setConnectedLinePresentationBit(ORFkType value) {
        this.connectedLinePresentationBit = value;
    }

    /**
     * Gets the value of the connectedNamePresentationBit property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getConnectedNamePresentationBit() {
        return connectedNamePresentationBit;
    }

    /**
     * Sets the value of the connectedNamePresentationBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setConnectedNamePresentationBit(ORFkType value) {
        this.connectedNamePresentationBit = value;
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
     * Gets the value of the callingPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingPartyNumberingPlan() {
        return callingPartyNumberingPlan;
    }

    /**
     * Sets the value of the callingPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingPartyNumberingPlan(ORFkType value) {
        this.callingPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the callingPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallingPartyNumberType() {
        return callingPartyNumberType;
    }

    /**
     * Sets the value of the callingPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallingPartyNumberType(ORFkType value) {
        this.callingPartyNumberType = value;
    }

    /**
     * Gets the value of the calledPartyNumberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCalledPartyNumberingPlan() {
        return calledPartyNumberingPlan;
    }

    /**
     * Sets the value of the calledPartyNumberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCalledPartyNumberingPlan(ORFkType value) {
        this.calledPartyNumberingPlan = value;
    }

    /**
     * Gets the value of the calledPartyNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCalledPartyNumberType() {
        return calledPartyNumberType;
    }

    /**
     * Sets the value of the calledPartyNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCalledPartyNumberType(ORFkType value) {
        this.calledPartyNumberType = value;
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
     * Gets the value of the resourcePriorityNamespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getResourcePriorityNamespaceName() {
        return resourcePriorityNamespaceName;
    }

    /**
     * Sets the value of the resourcePriorityNamespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setResourcePriorityNamespaceName(ORFkType value) {
        this.resourcePriorityNamespaceName = value;
    }

    /**
     * Gets the value of the routeClass property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRouteClass() {
        return routeClass;
    }

    /**
     * Sets the value of the routeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRouteClass(ORFkType value) {
        this.routeClass = value;
    }

    /**
     * Gets the value of the callInterceptProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getCallInterceptProfileName() {
        return callInterceptProfileName;
    }

    /**
     * Sets the value of the callInterceptProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setCallInterceptProfileName(ORFkType value) {
        this.callInterceptProfileName = value;
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
