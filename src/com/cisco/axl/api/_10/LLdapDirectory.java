
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LLdapDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LLdapDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="ldapDn" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="userSearchBase" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="repeatable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="intervalValue" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="scheduleUnit" type="{http://www.cisco.com/AXL/API/10.5}XScheduleUnit" minOccurs="0"/>
 *         &lt;element name="nextExecTime" type="{http://www.cisco.com/AXL/API/10.5}String32" minOccurs="0"/>
 *         &lt;element name="accessControlGroupInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="accessControlGroupName" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="accessControlGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "LLdapDirectory", propOrder = {
    "name",
    "ldapDn",
    "userSearchBase",
    "repeatable",
    "intervalValue",
    "scheduleUnit",
    "nextExecTime",
    "accessControlGroupInfo"
})
public class LLdapDirectory {

    protected String name;
    protected String ldapDn;
    protected String userSearchBase;
    protected String repeatable;
    protected String intervalValue;
    protected String scheduleUnit;
    protected String nextExecTime;
    protected LLdapDirectory.AccessControlGroupInfo accessControlGroupInfo;
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
     * Gets the value of the ldapDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapDn() {
        return ldapDn;
    }

    /**
     * Sets the value of the ldapDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapDn(String value) {
        this.ldapDn = value;
    }

    /**
     * Gets the value of the userSearchBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSearchBase() {
        return userSearchBase;
    }

    /**
     * Sets the value of the userSearchBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSearchBase(String value) {
        this.userSearchBase = value;
    }

    /**
     * Gets the value of the repeatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatable() {
        return repeatable;
    }

    /**
     * Sets the value of the repeatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatable(String value) {
        this.repeatable = value;
    }

    /**
     * Gets the value of the intervalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalValue() {
        return intervalValue;
    }

    /**
     * Sets the value of the intervalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalValue(String value) {
        this.intervalValue = value;
    }

    /**
     * Gets the value of the scheduleUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleUnit() {
        return scheduleUnit;
    }

    /**
     * Sets the value of the scheduleUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleUnit(String value) {
        this.scheduleUnit = value;
    }

    /**
     * Gets the value of the nextExecTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextExecTime() {
        return nextExecTime;
    }

    /**
     * Sets the value of the nextExecTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextExecTime(String value) {
        this.nextExecTime = value;
    }

    /**
     * Gets the value of the accessControlGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LLdapDirectory.AccessControlGroupInfo }
     *     
     */
    public LLdapDirectory.AccessControlGroupInfo getAccessControlGroupInfo() {
        return accessControlGroupInfo;
    }

    /**
     * Sets the value of the accessControlGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LLdapDirectory.AccessControlGroupInfo }
     *     
     */
    public void setAccessControlGroupInfo(LLdapDirectory.AccessControlGroupInfo value) {
        this.accessControlGroupInfo = value;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="accessControlGroupName" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="accessControlGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "accessControlGroupName"
    })
    public static class AccessControlGroupInfo
        extends XCommonMembersExtension
    {

        protected List<LLdapDirectory.AccessControlGroupInfo.AccessControlGroupName> accessControlGroupName;

        /**
         * Gets the value of the accessControlGroupName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accessControlGroupName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessControlGroupName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LLdapDirectory.AccessControlGroupInfo.AccessControlGroupName }
         * 
         * 
         */
        public List<LLdapDirectory.AccessControlGroupInfo.AccessControlGroupName> getAccessControlGroupName() {
            if (accessControlGroupName == null) {
                accessControlGroupName = new ArrayList<LLdapDirectory.AccessControlGroupInfo.AccessControlGroupName>();
            }
            return this.accessControlGroupName;
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
         *         &lt;element name="accessControlGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "accessControlGroup"
        })
        public static class AccessControlGroupName {

            protected String accessControlGroup;

            /**
             * Gets the value of the accessControlGroup property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccessControlGroup() {
                return accessControlGroup;
            }

            /**
             * Sets the value of the accessControlGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccessControlGroup(String value) {
                this.accessControlGroup = value;
            }

        }

    }

}
