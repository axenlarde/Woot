
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORPhoneLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORPhoneLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="dirn" type="{http://www.cisco.com/AXL/API/10.5}ORDirn" minOccurs="0"/>
 *         &lt;element name="ringSetting" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="consecutiveRingSetting" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingIdlePickupAlert" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="ringSettingActivePickupAlert" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="mwlPolicy" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="recordingProfileName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="monitoringCssName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="recordingFlag" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="audibleMwi" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="partitionUsage" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *         &lt;element name="recordingMediaSource" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
@XmlType(name = "ORPhoneLine", propOrder = {
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
public class ORPhoneLine {

    protected ORDirn dirn;
    protected ORFkType ringSetting;
    protected ORFkType consecutiveRingSetting;
    protected ORFkType ringSettingIdlePickupAlert;
    protected ORFkType ringSettingActivePickupAlert;
    protected ORFkType mwlPolicy;
    protected ORFkType recordingProfileName;
    protected ORFkType monitoringCssName;
    protected ORFkType recordingFlag;
    protected ORFkType audibleMwi;
    protected ORFkType partitionUsage;
    protected ORFkType recordingMediaSource;
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
     *     {@link ORDirn }
     *     
     */
    public ORDirn getDirn() {
        return dirn;
    }

    /**
     * Sets the value of the dirn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORDirn }
     *     
     */
    public void setDirn(ORDirn value) {
        this.dirn = value;
    }

    /**
     * Gets the value of the ringSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRingSetting() {
        return ringSetting;
    }

    /**
     * Sets the value of the ringSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRingSetting(ORFkType value) {
        this.ringSetting = value;
    }

    /**
     * Gets the value of the consecutiveRingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getConsecutiveRingSetting() {
        return consecutiveRingSetting;
    }

    /**
     * Sets the value of the consecutiveRingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setConsecutiveRingSetting(ORFkType value) {
        this.consecutiveRingSetting = value;
    }

    /**
     * Gets the value of the ringSettingIdlePickupAlert property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRingSettingIdlePickupAlert() {
        return ringSettingIdlePickupAlert;
    }

    /**
     * Sets the value of the ringSettingIdlePickupAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRingSettingIdlePickupAlert(ORFkType value) {
        this.ringSettingIdlePickupAlert = value;
    }

    /**
     * Gets the value of the ringSettingActivePickupAlert property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRingSettingActivePickupAlert() {
        return ringSettingActivePickupAlert;
    }

    /**
     * Sets the value of the ringSettingActivePickupAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRingSettingActivePickupAlert(ORFkType value) {
        this.ringSettingActivePickupAlert = value;
    }

    /**
     * Gets the value of the mwlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMwlPolicy() {
        return mwlPolicy;
    }

    /**
     * Sets the value of the mwlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMwlPolicy(ORFkType value) {
        this.mwlPolicy = value;
    }

    /**
     * Gets the value of the recordingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRecordingProfileName() {
        return recordingProfileName;
    }

    /**
     * Sets the value of the recordingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRecordingProfileName(ORFkType value) {
        this.recordingProfileName = value;
    }

    /**
     * Gets the value of the monitoringCssName property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getMonitoringCssName() {
        return monitoringCssName;
    }

    /**
     * Sets the value of the monitoringCssName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setMonitoringCssName(ORFkType value) {
        this.monitoringCssName = value;
    }

    /**
     * Gets the value of the recordingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRecordingFlag() {
        return recordingFlag;
    }

    /**
     * Sets the value of the recordingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRecordingFlag(ORFkType value) {
        this.recordingFlag = value;
    }

    /**
     * Gets the value of the audibleMwi property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getAudibleMwi() {
        return audibleMwi;
    }

    /**
     * Sets the value of the audibleMwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setAudibleMwi(ORFkType value) {
        this.audibleMwi = value;
    }

    /**
     * Gets the value of the partitionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getPartitionUsage() {
        return partitionUsage;
    }

    /**
     * Sets the value of the partitionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setPartitionUsage(ORFkType value) {
        this.partitionUsage = value;
    }

    /**
     * Gets the value of the recordingMediaSource property.
     * 
     * @return
     *     possible object is
     *     {@link ORFkType }
     *     
     */
    public ORFkType getRecordingMediaSource() {
        return recordingMediaSource;
    }

    /**
     * Sets the value of the recordingMediaSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORFkType }
     *     
     */
    public void setRecordingMediaSource(ORFkType value) {
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
