
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListChangeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListChangeReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="startChangeId" type="{http://www.cisco.com/AXL/API/10.5}StartChangeId" minOccurs="0"/>
 *         &lt;element name="objectList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="object" type="{http://www.cisco.com/AXL/API/10.5}XChangeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ListChangeReq", propOrder = {
    "startChangeId",
    "objectList"
})
public class ListChangeReq
    extends APIRequest
{

    protected StartChangeId startChangeId;
    protected ListChangeReq.ObjectList objectList;

    /**
     * Gets the value of the startChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link StartChangeId }
     *     
     */
    public StartChangeId getStartChangeId() {
        return startChangeId;
    }

    /**
     * Sets the value of the startChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartChangeId }
     *     
     */
    public void setStartChangeId(StartChangeId value) {
        this.startChangeId = value;
    }

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link ListChangeReq.ObjectList }
     *     
     */
    public ListChangeReq.ObjectList getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListChangeReq.ObjectList }
     *     
     */
    public void setObjectList(ListChangeReq.ObjectList value) {
        this.objectList = value;
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
     *         &lt;element name="object" type="{http://www.cisco.com/AXL/API/10.5}XChangeType" maxOccurs="unbounded" minOccurs="0"/>
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
        "object"
    })
    public static class ObjectList {

        protected List<String> object;

        /**
         * Gets the value of the object property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the object property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getObject() {
            if (object == null) {
                object = new ArrayList<String>();
            }
            return this.object;
        }

    }

}
