
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XServiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XServiceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDefault" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="serviceProfileInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="serviceProfileInfo" type="{http://www.cisco.com/AXL/API/10.5}XServiceProfileList" maxOccurs="7" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XServiceProfile", propOrder = {
    "name",
    "description",
    "isDefault",
    "serviceProfileInfos"
})
public class XServiceProfile {

    protected String name;
    protected String description;
    protected String isDefault;
    protected XServiceProfile.ServiceProfileInfos serviceProfileInfos;

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
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the serviceProfileInfos property.
     * 
     * @return
     *     possible object is
     *     {@link XServiceProfile.ServiceProfileInfos }
     *     
     */
    public XServiceProfile.ServiceProfileInfos getServiceProfileInfos() {
        return serviceProfileInfos;
    }

    /**
     * Sets the value of the serviceProfileInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XServiceProfile.ServiceProfileInfos }
     *     
     */
    public void setServiceProfileInfos(XServiceProfile.ServiceProfileInfos value) {
        this.serviceProfileInfos = value;
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
     *         &lt;element name="serviceProfileInfo" type="{http://www.cisco.com/AXL/API/10.5}XServiceProfileList" maxOccurs="7" minOccurs="0"/>
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
        "serviceProfileInfo"
    })
    public static class ServiceProfileInfos {

        protected List<XServiceProfileList> serviceProfileInfo;

        /**
         * Gets the value of the serviceProfileInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceProfileInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceProfileInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XServiceProfileList }
         * 
         * 
         */
        public List<XServiceProfileList> getServiceProfileInfo() {
            if (serviceProfileInfo == null) {
                serviceProfileInfo = new ArrayList<XServiceProfileList>();
            }
            return this.serviceProfileInfo;
        }

    }

}
