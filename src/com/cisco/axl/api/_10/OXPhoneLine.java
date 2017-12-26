
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OXPhoneLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OXPhoneLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/10.5}OXDirn" minOccurs="0"/>
 *         &lt;element name="ringSetting" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="consecutiveRingSetting" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingIdlePickupAlert" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingActivePickupAlert" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="mwlPolicy" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="recordingProfileName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="monitoringCssName" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="recordingFlag" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="audibleMwi" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="partitionUsage" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
 *         &lt;element name="recordingMediaSource" type="{http://www.cisco.com/AXL/API/10.5}OXFkType" minOccurs="0"/>
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
@XmlType(name = "OXPhoneLine", propOrder = {
    "dirn",
    "ringSetting",
    "consecutiveRingSetting",
    "ringSettingIdlePickupAlert",
    "ringSettingActivePickupAlert",
    "mwlPolicy",
    "recordingProfileName",
    "monitoringCssName",
    "recordingFlag",
    "audibleMwi",
    "partitionUsage",
    "recordingMediaSource"
})
public class OXPhoneLine {

    protected OXDirn dirn;
    protected OXFkType ringSetting;
    protected OXFkType consecutiveRingSetting;
    protected OXFkType ringSettingIdlePickupAlert;
    protected OXFkType ringSettingActivePickupAlert;
    protected OXFkType mwlPolicy;
    protected OXFkType recordingProfileName;
    protected OXFkType monitoringCssName;
    protected OXFkType recordingFlag;
    protected OXFkType audibleMwi;
    protected OXFkType partitionUsage;
    protected OXFkType recordingMediaSource;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ctiid;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the dirn property.
     * 
     * @return
     *     possible object is
     *     {@link OXDirn }
     *     
     */
    public OXDirn getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXDirn }
     *     
     */
    public void setDirn(OXDirn value) {
        this.dirn = value;
    }

    /**
     * Gets the value of the ringSetting property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRingSetting() {
        return ringSetting;
    }

    /**
     * Sets the value of the ringSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRingSetting(OXFkType value) {
        this.ringSetting = value;
    }

    /**
     * Gets the value of the consecutiveRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getConsecutiveRingSetting() {
        return consecutiveRingSetting;
    }

    /**
     * Sets the value of the consecutiveRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setConsecutiveRingSetting(OXFkType value) {
        this.consecutiveRingSetting = value;
    }

    /**
     * Gets the value of the ringSettingIdlePickupAlert property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRingSettingIdlePickupAlert() {
        return ringSettingIdlePickupAlert;
    }

    /**
     * Sets the value of the ringSettingIdlePickupAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRingSettingIdlePickupAlert(OXFkType value) {
        this.ringSettingIdlePickupAlert = value;
    }

    /**
     * Gets the value of the ringSettingActivePickupAlert property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRingSettingActivePickupAlert() {
        return ringSettingActivePickupAlert;
    }

    /**
     * Sets the value of the ringSettingActivePickupAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRingSettingActivePickupAlert(OXFkType value) {
        this.ringSettingActivePickupAlert = value;
    }

    /**
     * Gets the value of the mwlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getMwlPolicy() {
        return mwlPolicy;
    }

    /**
     * Sets the value of the mwlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setMwlPolicy(OXFkType value) {
        this.mwlPolicy = value;
    }

    /**
     * Gets the value of the recordingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRecordingProfileName() {
        return recordingProfileName;
    }

    /**
     * Sets the value of the recordingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRecordingProfileName(OXFkType value) {
        this.recordingProfileName = value;
    }

    /**
     * Gets the value of the monitoringCssName property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getMonitoringCssName() {
        return monitoringCssName;
    }

    /**
     * Sets the value of the monitoringCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setMonitoringCssName(OXFkType value) {
        this.monitoringCssName = value;
    }

    /**
     * Gets the value of the recordingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRecordingFlag() {
        return recordingFlag;
    }

    /**
     * Sets the value of the recordingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRecordingFlag(OXFkType value) {
        this.recordingFlag = value;
    }

    /**
     * Gets the value of the audibleMwi property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getAudibleMwi() {
        return audibleMwi;
    }

    /**
     * Sets the value of the audibleMwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setAudibleMwi(OXFkType value) {
        this.audibleMwi = value;
    }

    /**
     * Gets the value of the partitionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getPartitionUsage() {
        return partitionUsage;
    }

    /**
     * Sets the value of the partitionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setPartitionUsage(OXFkType value) {
        this.partitionUsage = value;
    }

    /**
     * Gets the value of the recordingMediaSource property.
     * 
     * @return
     *     possible object is
     *     {@link OXFkType }
     *     
     */
    public OXFkType getRecordingMediaSource() {
        return recordingMediaSource;
    }

    /**
     * Sets the value of the recordingMediaSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OXFkType }
     *     
     */
    public void setRecordingMediaSource(OXFkType value) {
        this.recordingMediaSource = value;
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

}
