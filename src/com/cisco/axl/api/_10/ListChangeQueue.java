
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListChangeQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListChangeQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstChangeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastChangeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nextStartChangeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="queueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListChangeQueue", propOrder = {
    "firstChangeId",
    "lastChangeId",
    "nextStartChangeId",
    "queueId"
})
public class ListChangeQueue {

    protected BigInteger firstChangeId;
    protected BigInteger lastChangeId;
    protected BigInteger nextStartChangeId;
    protected String queueId;

    /**
     * Gets the value of the firstChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstChangeId() {
        return firstChangeId;
    }

    /**
     * Sets the value of the firstChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstChangeId(BigInteger value) {
        this.firstChangeId = value;
    }

    /**
     * Gets the value of the lastChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastChangeId() {
        return lastChangeId;
    }

    /**
     * Sets the value of the lastChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastChangeId(BigInteger value) {
        this.lastChangeId = value;
    }

    /**
     * Gets the value of the nextStartChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextStartChangeId() {
        return nextStartChangeId;
    }

    /**
     * Sets the value of the nextStartChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextStartChangeId(BigInteger value) {
        this.nextStartChangeId = value;
    }

    /**
     * Gets the value of the queueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * Sets the value of the queueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueId(String value) {
        this.queueId = value;
    }

}
