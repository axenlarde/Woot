
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSyslogConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSyslogConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="AlarmLevelEvent" type="{http://www.cisco.com/AXL/API/10.5}XAlarmSeverity"/>
 *         &lt;element name="RemoteServerName1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemoteServerName2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemoteServerName3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemoteServerName4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemoteServerName5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Enable" type="{http://www.cisco.com/AXL/API/10.5}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSyslogConfig", propOrder = {
    "alarmLevelEvent",
    "remoteServerName1",
    "remoteServerName2",
    "remoteServerName3",
    "remoteServerName4",
    "remoteServerName5",
    "monitor",
    "enable"
})
public class XSyslogConfig {

    @XmlElement(name = "AlarmLevelEvent")
    protected String alarmLevelEvent;
    @XmlElement(name = "RemoteServerName1")
    protected String remoteServerName1;
    @XmlElement(name = "RemoteServerName2")
    protected String remoteServerName2;
    @XmlElement(name = "RemoteServerName3")
    protected String remoteServerName3;
    @XmlElement(name = "RemoteServerName4")
    protected String remoteServerName4;
    @XmlElement(name = "RemoteServerName5")
    protected String remoteServerName5;
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
     * Gets the value of the remoteServerName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName1() {
        return remoteServerName1;
    }

    /**
     * Sets the value of the remoteServerName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName1(String value) {
        this.remoteServerName1 = value;
    }

    /**
     * Gets the value of the remoteServerName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName2() {
        return remoteServerName2;
    }

    /**
     * Sets the value of the remoteServerName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName2(String value) {
        this.remoteServerName2 = value;
    }

    /**
     * Gets the value of the remoteServerName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName3() {
        return remoteServerName3;
    }

    /**
     * Sets the value of the remoteServerName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName3(String value) {
        this.remoteServerName3 = value;
    }

    /**
     * Gets the value of the remoteServerName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName4() {
        return remoteServerName4;
    }

    /**
     * Sets the value of the remoteServerName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName4(String value) {
        this.remoteServerName4 = value;
    }

    /**
     * Gets the value of the remoteServerName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteServerName5() {
        return remoteServerName5;
    }

    /**
     * Sets the value of the remoteServerName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteServerName5(String value) {
        this.remoteServerName5 = value;
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
