
package com.cisco.axl.api._10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCallsQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCallsQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="maxCallersInQueue" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="queueFullDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpacePilotQueueFull" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="maxWaitTimeInQueue" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="maxWaitTimeDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceMaxWaitTime" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="noAgentDestination" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceNoAgent" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="networkHoldMohAudioSourceID" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCallsQueue", propOrder = {
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
public class XCallsQueue {

    @XmlElement(defaultValue = "32")
    protected String maxCallersInQueue;
    @XmlElementRef(name = "queueFullDestination", type = JAXBElement.class)
    protected JAXBElement<String> queueFullDestination;
    @XmlElementRef(name = "callingSearchSpacePilotQueueFull", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpacePilotQueueFull;
    @XmlElement(defaultValue = "900")
    protected String maxWaitTimeInQueue;
    @XmlElementRef(name = "maxWaitTimeDestination", type = JAXBElement.class)
    protected JAXBElement<String> maxWaitTimeDestination;
    @XmlElementRef(name = "callingSearchSpaceMaxWaitTime", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceMaxWaitTime;
    @XmlElementRef(name = "noAgentDestination", type = JAXBElement.class)
    protected JAXBElement<String> noAgentDestination;
    @XmlElementRef(name = "callingSearchSpaceNoAgent", type = JAXBElement.class)
    protected JAXBElement<XFkType> callingSearchSpaceNoAgent;
    @XmlElementRef(name = "networkHoldMohAudioSourceID", type = JAXBElement.class)
    protected JAXBElement<String> networkHoldMohAudioSourceID;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueFullDestination() {
        return queueFullDestination;
    }

    /**
     * Sets the value of the queueFullDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueFullDestination(JAXBElement<String> value) {
        this.queueFullDestination = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingSearchSpacePilotQueueFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpacePilotQueueFull() {
        return callingSearchSpacePilotQueueFull;
    }

    /**
     * Sets the value of the callingSearchSpacePilotQueueFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpacePilotQueueFull(JAXBElement<XFkType> value) {
        this.callingSearchSpacePilotQueueFull = ((JAXBElement<XFkType> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxWaitTimeDestination() {
        return maxWaitTimeDestination;
    }

    /**
     * Sets the value of the maxWaitTimeDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxWaitTimeDestination(JAXBElement<String> value) {
        this.maxWaitTimeDestination = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingSearchSpaceMaxWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceMaxWaitTime() {
        return callingSearchSpaceMaxWaitTime;
    }

    /**
     * Sets the value of the callingSearchSpaceMaxWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceMaxWaitTime(JAXBElement<XFkType> value) {
        this.callingSearchSpaceMaxWaitTime = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the noAgentDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoAgentDestination() {
        return noAgentDestination;
    }

    /**
     * Sets the value of the noAgentDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoAgentDestination(JAXBElement<String> value) {
        this.noAgentDestination = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the callingSearchSpaceNoAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getCallingSearchSpaceNoAgent() {
        return callingSearchSpaceNoAgent;
    }

    /**
     * Sets the value of the callingSearchSpaceNoAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setCallingSearchSpaceNoAgent(JAXBElement<XFkType> value) {
        this.callingSearchSpaceNoAgent = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the networkHoldMohAudioSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkHoldMohAudioSourceID() {
        return networkHoldMohAudioSourceID;
    }

    /**
     * Sets the value of the networkHoldMohAudioSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkHoldMohAudioSourceID(JAXBElement<String> value) {
        this.networkHoldMohAudioSourceID = ((JAXBElement<String> ) value);
    }

}
