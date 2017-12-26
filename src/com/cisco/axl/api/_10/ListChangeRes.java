
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListChangeRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListChangeRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="queueInfo" type="{http://www.cisco.com/AXL/API/10.5}ListChangeQueue" minOccurs="0"/>
 *         &lt;element name="changes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="change" type="{http://www.cisco.com/AXL/API/10.5}Change" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListChangeRes", propOrder = {
    "queueInfo",
    "changes"
})
public class ListChangeRes
    extends APIResponse
{

    protected ListChangeQueue queueInfo;
    @XmlElement(required = true)
    protected ListChangeRes.Changes changes;

    /**
     * Gets the value of the queueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListChangeQueue }
     *     
     */
    public ListChangeQueue getQueueInfo() {
        return queueInfo;
    }

    /**
     * Sets the value of the queueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListChangeQueue }
     *     
     */
    public void setQueueInfo(ListChangeQueue value) {
        this.queueInfo = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link ListChangeRes.Changes }
     *     
     */
    public ListChangeRes.Changes getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListChangeRes.Changes }
     *     
     */
    public void setChanges(ListChangeRes.Changes value) {
        this.changes = value;
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
     *       &lt;sequence>
     *         &lt;element name="change" type="{http://www.cisco.com/AXL/API/10.5}Change" maxOccurs="unbounded" minOccurs="0"/>
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
        "change"
    })
    public static class Changes {

        protected List<Change> change;

        /**
         * Gets the value of the change property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the change property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Change }
         * 
         * 
         */
        public List<Change> getChange() {
            if (change == null) {
                change = new ArrayList<Change>();
            }
            return this.change;
        }

    }

}
