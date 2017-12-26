
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCallManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCallManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="autoRegistration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                   &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                   &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *                   &lt;element name="autoRegistrationEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="lineTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="processNodeName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="lbmGroup" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctiid" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCallManager", propOrder = {
    "name",
    "description",
    "autoRegistration",
    "processNodeName",
    "lbmGroup"
})
public class LCallManager {

    protected String name;
    protected String description;
    protected LCallManager.AutoRegistration autoRegistration;
    protected XFkType processNodeName;
    protected XFkType lbmGroup;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ctiid;
    @XmlAttribute
    protected String uuid;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the autoRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link LCallManager.AutoRegistration }
     *     
     */
    public LCallManager.AutoRegistration getAutoRegistration() {
        return autoRegistration;
    }

    /**
     * Sets the value of the autoRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCallManager.AutoRegistration }
     *     
     */
    public void setAutoRegistration(LCallManager.AutoRegistration value) {
        this.autoRegistration = value;
    }

    /**
     * Gets the value of the processNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProcessNodeName() {
        return processNodeName;
    }

    /**
     * Sets the value of the processNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProcessNodeName(XFkType value) {
        this.processNodeName = value;
    }

    /**
     * Gets the value of the lbmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getLbmGroup() {
        return lbmGroup;
    }

    /**
     * Sets the value of the lbmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setLbmGroup(XFkType value) {
        this.lbmGroup = value;
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
     *         &lt;element name="startDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="endDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="nextDn" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="e164Mask" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
     *         &lt;element name="autoRegistrationEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="universalDeviceTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="lineTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
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
        "startDn",
        "endDn",
        "nextDn",
        "routePartitionName",
        "e164Mask",
        "autoRegistrationEnabled",
        "universalDeviceTemplate",
        "lineTemplate"
    })
    public static class AutoRegistration {

        protected String startDn;
        protected String endDn;
        protected String nextDn;
        protected XFkType routePartitionName;
        protected String e164Mask;
        protected String autoRegistrationEnabled;
        protected XFkType universalDeviceTemplate;
        protected XFkType lineTemplate;

        /**
         * Gets the value of the startDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDn() {
            return startDn;
        }

        /**
         * Sets the value of the startDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDn(String value) {
            this.startDn = value;
        }

        /**
         * Gets the value of the endDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDn() {
            return endDn;
        }

        /**
         * Sets the value of the endDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDn(String value) {
            this.endDn = value;
        }

        /**
         * Gets the value of the nextDn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextDn() {
            return nextDn;
        }

        /**
         * Sets the value of the nextDn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextDn(String value) {
            this.nextDn = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setRoutePartitionName(XFkType value) {
            this.routePartitionName = value;
        }

        /**
         * Gets the value of the e164Mask property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getE164Mask() {
            return e164Mask;
        }

        /**
         * Sets the value of the e164Mask property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setE164Mask(String value) {
            this.e164Mask = value;
        }

        /**
         * Gets the value of the autoRegistrationEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutoRegistrationEnabled() {
            return autoRegistrationEnabled;
        }

        /**
         * Sets the value of the autoRegistrationEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutoRegistrationEnabled(String value) {
            this.autoRegistrationEnabled = value;
        }

        /**
         * Gets the value of the universalDeviceTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getUniversalDeviceTemplate() {
            return universalDeviceTemplate;
        }

        /**
         * Sets the value of the universalDeviceTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setUniversalDeviceTemplate(XFkType value) {
            this.universalDeviceTemplate = value;
        }

        /**
         * Gets the value of the lineTemplate property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getLineTemplate() {
            return lineTemplate;
        }

        /**
         * Sets the value of the lineTemplate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setLineTemplate(XFkType value) {
            this.lineTemplate = value;
        }

    }

}
