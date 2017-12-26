
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocationReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLocationReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="relatedLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/10.5}XLocationRelationship" maxOccurs="unbounded"/>
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
 *                   &lt;element name="betweenLocation" type="{http://www.cisco.com/AXL/API/10.5}XLocationBetween" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLocationReq", propOrder = {
    "newName",
    "relatedLocations",
    "withinAudioBandwidth",
    "withinVideoBandwidth",
    "withinImmersiveKbits",
    "betweenLocations"
})
public class UpdateLocationReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected UpdateLocationReq.RelatedLocations relatedLocations;
    @XmlElement(defaultValue = "0")
    protected String withinAudioBandwidth;
    @XmlElement(defaultValue = "0")
    protected String withinVideoBandwidth;
    @XmlElement(defaultValue = "0")
    protected String withinImmersiveKbits;
    protected UpdateLocationReq.BetweenLocations betweenLocations;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the relatedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLocationReq.RelatedLocations }
     *     
     */
    public UpdateLocationReq.RelatedLocations getRelatedLocations() {
        return relatedLocations;
    }

    /**
     * Sets the value of the relatedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLocationReq.RelatedLocations }
     *     
     */
    public void setRelatedLocations(UpdateLocationReq.RelatedLocations value) {
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
     *     {@link UpdateLocationReq.BetweenLocations }
     *     
     */
    public UpdateLocationReq.BetweenLocations getBetweenLocations() {
        return betweenLocations;
    }

    /**
     * Sets the value of the betweenLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLocationReq.BetweenLocations }
     *     
     */
    public void setBetweenLocations(UpdateLocationReq.BetweenLocations value) {
        this.betweenLocations = value;
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
     *         &lt;element name="betweenLocation" type="{http://www.cisco.com/AXL/API/10.5}XLocationBetween" maxOccurs="unbounded"/>
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

        protected List<XLocationBetween> betweenLocation;

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
         * {@link XLocationBetween }
         * 
         * 
         */
        public List<XLocationBetween> getBetweenLocation() {
            if (betweenLocation == null) {
                betweenLocation = new ArrayList<XLocationBetween>();
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
     *         &lt;element name="relatedLocation" type="{http://www.cisco.com/AXL/API/10.5}XLocationRelationship" maxOccurs="unbounded"/>
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

        protected List<XLocationRelationship> relatedLocation;

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
         * {@link XLocationRelationship }
         * 
         * 
         */
        public List<XLocationRelationship> getRelatedLocation() {
            if (relatedLocation == null) {
                relatedLocation = new ArrayList<XLocationRelationship>();
            }
            return this.relatedLocation;
        }

    }

}
