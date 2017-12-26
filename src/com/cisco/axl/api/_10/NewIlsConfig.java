
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewIlsConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewIlsConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="clusterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastContactTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clusterUriString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastDataRecieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncronizationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "NewIlsConfig", propOrder = {
    "clusterId",
    "lastContactTime",
    "clusterUriString",
    "role",
    "lastDataRecieved",
    "syncronizationStatus"
})
public class NewIlsConfig {

    protected String clusterId;
    protected String lastContactTime;
    protected String clusterUriString;
    protected String role;
    protected String lastDataRecieved;
    protected String syncronizationStatus;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterId(String value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the lastContactTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastContactTime() {
        return lastContactTime;
    }

    /**
     * Sets the value of the lastContactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastContactTime(String value) {
        this.lastContactTime = value;
    }

    /**
     * Gets the value of the clusterUriString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterUriString() {
        return clusterUriString;
    }

    /**
     * Sets the value of the clusterUriString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterUriString(String value) {
        this.clusterUriString = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the lastDataRecieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDataRecieved() {
        return lastDataRecieved;
    }

    /**
     * Sets the value of the lastDataRecieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDataRecieved(String value) {
        this.lastDataRecieved = value;
    }

    /**
     * Gets the value of the syncronizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncronizationStatus() {
        return syncronizationStatus;
    }

    /**
     * Sets the value of the syncronizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncronizationStatus(String value) {
        this.syncronizationStatus = value;
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
