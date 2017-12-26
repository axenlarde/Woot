
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLocalRouteGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateLocalRouteGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="localRouteGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="newDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "UpdateLocalRouteGroupReq", propOrder = {
    "localRouteGroup"
})
public class UpdateLocalRouteGroupReq
    extends APIRequest
{

    protected UpdateLocalRouteGroupReq.LocalRouteGroup localRouteGroup;

    /**
     * Gets the value of the localRouteGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLocalRouteGroupReq.LocalRouteGroup }
     *     
     */
    public UpdateLocalRouteGroupReq.LocalRouteGroup getLocalRouteGroup() {
        return localRouteGroup;
    }

    /**
     * Sets the value of the localRouteGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLocalRouteGroupReq.LocalRouteGroup }
     *     
     */
    public void setLocalRouteGroup(UpdateLocalRouteGroupReq.LocalRouteGroup value) {
        this.localRouteGroup = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="newName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="newDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "name",
        "description",
        "newName",
        "newDescription"
    })
    public static class LocalRouteGroup {

        protected String name;
        protected String description;
        protected String newName;
        protected String newDescription;

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
         * Gets the value of the newDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewDescription() {
            return newDescription;
        }

        /**
         * Sets the value of the newDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewDescription(String value) {
            this.newDescription = value;
        }

    }

}
