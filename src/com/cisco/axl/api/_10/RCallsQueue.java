
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCallsQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCallsQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="maxCallersInQueue" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="queueFullDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpacePilotQueueFull" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="maxWaitTimeInQueue" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="maxWaitTimeDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceMaxWaitTime" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noAgentDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceNoAgent" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceID" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
@XmlType(name = "RCallsQueue", propOrder = {
    "maxCallersInQueue",
    "queueFullDestination",
    "callingSearchSpacePilotQueueFull",
    "maxWaitTimeInQueue",
    "maxWaitTimeDestination",
    "callingSearchSpaceMaxWaitTime",
    "noAgentDestination",
    "callingSearchSpaceNoAgent",
    "networkHoldMohAudioSourceID"
})
public class RCallsQueue {

    protected String maxCallersInQueue;
    protected String queueFullDestination;
    protected XFkType callingSearchSpacePilotQueueFull;
    protected String maxWaitTimeInQueue;
    protected String maxWaitTimeDestination;
    protected XFkType callingSearchSpaceMaxWaitTime;
    protected String noAgentDestination;
    protected XFkType callingSearchSpaceNoAgent;
    protected String networkHoldMohAudioSourceID;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the maxCallersInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCallersInQueue() {
        return maxCallersInQueue;
    }

    /**
     * Sets the value of the maxCallersInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCallersInQueue(String value) {
        this.maxCallersInQueue = value;
    }

    /**
     * Gets the value of the queueFullDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueFullDestination() {
        return queueFullDestination;
    }

    /**
     * Sets the value of the queueFullDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueFullDestination(String value) {
        this.queueFullDestination = value;
    }

    /**
     * Gets the value of the callingSearchSpacePilotQueueFull property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpacePilotQueueFull() {
        return callingSearchSpacePilotQueueFull;
    }

    /**
     * Sets the value of the callingSearchSpacePilotQueueFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpacePilotQueueFull(XFkType value) {
        this.callingSearchSpacePilotQueueFull = value;
    }

    /**
     * Gets the value of the maxWaitTimeInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWaitTimeInQueue() {
        return maxWaitTimeInQueue;
    }

    /**
     * Sets the value of the maxWaitTimeInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWaitTimeInQueue(String value) {
        this.maxWaitTimeInQueue = value;
    }

    /**
     * Gets the value of the maxWaitTimeDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWaitTimeDestination() {
        return maxWaitTimeDestination;
    }

    /**
     * Sets the value of the maxWaitTimeDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWaitTimeDestination(String value) {
        this.maxWaitTimeDestination = value;
    }

    /**
     * Gets the value of the callingSearchSpaceMaxWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpaceMaxWaitTime() {
        return callingSearchSpaceMaxWaitTime;
    }

    /**
     * Sets the value of the callingSearchSpaceMaxWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpaceMaxWaitTime(XFkType value) {
        this.callingSearchSpaceMaxWaitTime = value;
    }

    /**
     * Gets the value of the noAgentDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAgentDestination() {
        return noAgentDestination;
    }

    /**
     * Sets the value of the noAgentDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAgentDestination(String value) {
        this.noAgentDestination = value;
    }

    /**
     * Gets the value of the callingSearchSpaceNoAgent property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpaceNoAgent() {
        return callingSearchSpaceNoAgent;
    }

    /**
     * Sets the value of the callingSearchSpaceNoAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpaceNoAgent(XFkType value) {
        this.callingSearchSpaceNoAgent = value;
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkHoldMohAudioSourceID() {
        return networkHoldMohAudioSourceID;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkHoldMohAudioSourceID(String value) {
        this.networkHoldMohAudioSourceID = value;
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
