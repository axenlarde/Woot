
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSyslogConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSyslogConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceGroup" type="{http://www.cisco.com/AXL/API/10.5}XServiceGrouping"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmConfigs" type="{http://www.cisco.com/AXL/API/10.5}XSyslogConfig"/>
 *         &lt;element name="EndPointAlarm" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XSyslogConfiguration", propOrder = {
    "serverName",
    "serviceGroup",
    "service",
    "alarmConfigs",
    "endPointAlarm"
})
public class XSyslogConfiguration {

    protected String serverName;
    @XmlElement(defaultValue = "CM Services")
    protected String serviceGroup;
    protected String service;
    protected XSyslogConfig alarmConfigs;
    @XmlElement(name = "EndPointAlarm")
    protected String endPointAlarm;

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceGroup(String value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the alarmConfigs property.
     * 
     * @return
     *     possible object is
     *     {@link XSyslogConfig }
     *     
     */
    public XSyslogConfig getAlarmConfigs() {
        return alarmConfigs;
    }

    /**
     * Sets the value of the alarmConfigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSyslogConfig }
     *     
     */
    public void setAlarmConfigs(XSyslogConfig value) {
        this.alarmConfigs = value;
    }

    /**
     * Gets the value of the endPointAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPointAlarm() {
        return endPointAlarm;
    }

    /**
     * Sets the value of the endPointAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPointAlarm(String value) {
        this.endPointAlarm = value;
    }

}
