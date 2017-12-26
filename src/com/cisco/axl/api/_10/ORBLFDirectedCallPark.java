
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORBLFDirectedCallPark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORBLFDirectedCallPark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="directedCallParkId" type="{http://www.cisco.com/AXL/API/10.5}XUUID" minOccurs="0"/>
 *           &lt;element name="directedCallParkDnAndPartition" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *                     &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORBLFDirectedCallPark", propOrder = {
    "directedCallParkId",
    "directedCallParkDnAndPartition"
})
public class ORBLFDirectedCallPark {

    protected String directedCallParkId;
    protected ORBLFDirectedCallPark.DirectedCallParkDnAndPartition directedCallParkDnAndPartition;

    /**
     * Gets the value of the directedCallParkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallParkId() {
        return directedCallParkId;
    }

    /**
     * Sets the value of the directedCallParkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallParkId(String value) {
        this.directedCallParkId = value;
    }

    /**
     * Gets the value of the directedCallParkDnAndPartition property.
     * 
     * @return
     *     possible object is
     *     {@link ORBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public ORBLFDirectedCallPark.DirectedCallParkDnAndPartition getDirectedCallParkDnAndPartition() {
        return directedCallParkDnAndPartition;
    }

    /**
     * Sets the value of the directedCallParkDnAndPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ORBLFDirectedCallPark.DirectedCallParkDnAndPartition }
     *     
     */
    public void setDirectedCallParkDnAndPartition(ORBLFDirectedCallPark.DirectedCallParkDnAndPartition value) {
        this.directedCallParkDnAndPartition = value;
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
     *         &lt;element name="dnPattern" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}ORFkType" minOccurs="0"/>
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
        "dnPattern",
        "routePartitionName"
    })
    public static class DirectedCallParkDnAndPartition {

        protected String dnPattern;
        protected ORFkType routePartitionName;

        /**
         * Gets the value of the dnPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDnPattern() {
            return dnPattern;
        }

        /**
         * Sets the value of the dnPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDnPattern(String value) {
            this.dnPattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link ORFkType }
         *     
         */
        public ORFkType getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORFkType }
         *     
         */
        public void setRoutePartitionName(ORFkType value) {
            this.routePartitionName = value;
        }

    }

}
