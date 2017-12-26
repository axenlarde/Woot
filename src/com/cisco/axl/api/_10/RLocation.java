
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="relatedLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/10.5}RLocationRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="withinAudioBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="withinVideoBandwidth" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="withinImmersiveKbits" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="betweenLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="betweenLocation" type="{http://www.cisco.com/AXL/API/10.5}RLocationBetween" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "RLocation", propOrder = {
    "name",
    "id",
    "relatedLocations",
    "withinAudioBandwidth",
    "withinVideoBandwidth",
    "withinImmersiveKbits",
    "betweenLocations"
})
public class RLocation {

    protected String name;
    protected String id;
    protected RLocation.RelatedLocations relatedLocations;
    protected String withinAudioBandwidth;
    protected String withinVideoBandwidth;
    protected String withinImmersiveKbits;
    protected RLocation.BetweenLocations betweenLocations;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the relatedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link RLocation.RelatedLocations }
     *     
     */
    public RLocation.RelatedLocations getRelatedLocations() {
        return relatedLocations;
    }

    /**
     * Sets the value of the relatedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RLocation.RelatedLocations }
     *     
     */
    public void setRelatedLocations(RLocation.RelatedLocations value) {
        this.relatedLocations = value;
    }

    /**
     * Gets the value of the withinAudioBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinAudioBandwidth() {
        return withinAudioBandwidth;
    }

    /**
     * Sets the value of the withinAudioBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinAudioBandwidth(String value) {
        this.withinAudioBandwidth = value;
    }

    /**
     * Gets the value of the withinVideoBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinVideoBandwidth() {
        return withinVideoBandwidth;
    }

    /**
     * Sets the value of the withinVideoBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinVideoBandwidth(String value) {
        this.withinVideoBandwidth = value;
    }

    /**
     * Gets the value of the withinImmersiveKbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithinImmersiveKbits() {
        return withinImmersiveKbits;
    }

    /**
     * Sets the value of the withinImmersiveKbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithinImmersiveKbits(String value) {
        this.withinImmersiveKbits = value;
    }

    /**
     * Gets the value of the betweenLocations property.
     * 
     * @return
     *     possible object is
     *     {@link RLocation.BetweenLocations }
     *     
     */
    public RLocation.BetweenLocations getBetweenLocations() {
        return betweenLocations;
    }

    /**
     * Sets the value of the betweenLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RLocation.BetweenLocations }
     *     
     */
    public void setBetweenLocations(RLocation.BetweenLocations value) {
        this.betweenLocations = value;
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
     *         &lt;element name="betweenLocation" type="{http://www.cisco.com/AXL/API/10.5}RLocationBetween" maxOccurs="unbounded" minOccurs="0"/>
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
        "betweenLocation"
    })
    public static class BetweenLocations {

        protected List<RLocationBetween> betweenLocation;

        /**
         * Gets the value of the betweenLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the betweenLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBetweenLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RLocationBetween }
         * 
         * 
         */
        public List<RLocationBetween> getBetweenLocation() {
            if (betweenLocation == null) {
                betweenLocation = new ArrayList<RLocationBetween>();
            }
            return this.betweenLocation;
        }

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
     *         &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/10.5}RLocationRelationship" maxOccurs="unbounded" minOccurs="0"/>
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
        "relatedLocation"
    })
    public static class RelatedLocations {

        protected List<RLocationRelationship> relatedLocation;

        /**
         * Gets the value of the relatedLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RLocationRelationship }
         * 
         * 
         */
        public List<RLocationRelationship> getRelatedLocation() {
            if (relatedLocation == null) {
                relatedLocation = new ArrayList<RLocationRelationship>();
            }
            return this.relatedLocation;
        }

    }

}
