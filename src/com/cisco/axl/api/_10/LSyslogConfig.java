
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LSyslogConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LSyslogConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="AlarmLevelEvent" type="{http://www.cisco.com/AXL/API/10.5}XAlarmSeverity" minOccurs="0"/>
 *         &lt;element name="RemoteServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LSyslogConfig", propOrder = {
    "alarmLevelEvent",
    "remoteServerName",
    "monitor",
    "enable"
})
public class LSyslogConfig {

    @XmlElement(name = "AlarmLevelEvent")
    protected String alarmLevelEvent;
    @XmlElement(name = "RemoteServerName")
    protected String remoteServerName;
    protected String monitor;
    @XmlElement(name = "Enable")
    protected String enable;

    /**
     * Gets the value of the alarmLevelEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmLevelEvent() {
        return alarmLevelEvent;
    }

    /**
     * Sets the value of the alarmLevelEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmLevelEvent(String value) {
        this.alarmLevelEvent = value;
    }

    /**
     * Gets the value of the remoteServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName() {
        return remoteServerName;
    }

    /**
     * Sets the value of the remoteServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName(String value) {
        this.remoteServerName = value;
    }

    /**
     * Gets the value of the monitor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitor(String value) {
        this.monitor = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnable(String value) {
        this.enable = value;
    }

}
