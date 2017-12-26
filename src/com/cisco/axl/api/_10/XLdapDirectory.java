
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLdapDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLdapDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String50"/>
 *         &lt;element name="ldapDn" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
 *         &lt;element name="ldapPassword" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
 *         &lt;element name="userSearchBase" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *         &lt;element name="repeatable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="intervalValue" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *         &lt;element name="scheduleUnit" type="{http://www.cisco.com/AXL/API/10.5}XScheduleUnit" minOccurs="0"/>
 *         &lt;element name="nextExecTime" type="{http://www.cisco.com/AXL/API/10.5}String32"/>
 *         &lt;element name="servers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="server" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="hostName" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
 *                             &lt;element name="ldapPortNumber" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
 *                             &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="middleName" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="mailId" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
 *         &lt;element name="ldapFilter" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="directoryUri" type="{http://www.cisco.com/AXL/API/10.5}String128" minOccurs="0"/>
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
 *         &lt;element name="featureGroupTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="applyMask" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyPoolList" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="addDns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="addDn" maxOccurs="3" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="startDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="endDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dnPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "XLdapDirectory", propOrder = {
    "name",
    "ldapDn",
    "ldapPassword",
    "userSearchBase",
    "repeatable",
    "intervalValue",
    "scheduleUnit",
    "nextExecTime",
    "servers",
    "middleName",
    "phoneNumber",
    "mailId",
    "ldapFilter",
    "directoryUri",
    "accessControlGroupInfo",
    "featureGroupTemplate",
    "applyMask",
    "mask",
    "applyPoolList",
    "addDns"
})
public class XLdapDirectory {

    protected String name;
    protected String ldapDn;
    protected String ldapPassword;
    protected String userSearchBase;
    protected String repeatable;
    @XmlElementRef(name = "intervalValue", type = JAXBElement.class)
    protected JAXBElement<String> intervalValue;
    @XmlElement(defaultValue = "DAY")
    protected String scheduleUnit;
    protected String nextExecTime;
    protected XLdapDirectory.Servers servers;
    protected String middleName;
    protected String phoneNumber;
    protected String mailId;
    @XmlElementRef(name = "ldapFilter", type = JAXBElement.class)
    protected JAXBElement<XFkType> ldapFilter;
    protected String directoryUri;
    protected XLdapDirectory.AccessControlGroupInfo accessControlGroupInfo;
    @XmlElementRef(name = "featureGroupTemplate", type = JAXBElement.class)
    protected JAXBElement<XFkType> featureGroupTemplate;
    @XmlElement(defaultValue = "false")
    protected String applyMask;
    @XmlElementRef(name = "mask", type = JAXBElement.class)
    protected JAXBElement<String> mask;
    @XmlElement(defaultValue = "false")
    protected String applyPoolList;
    protected XLdapDirectory.AddDns addDns;

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
     * Gets the value of the ldapPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapPassword() {
        return ldapPassword;
    }

    /**
     * Sets the value of the ldapPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapPassword(String value) {
        this.ldapPassword = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntervalValue() {
        return intervalValue;
    }

    /**
     * Sets the value of the intervalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntervalValue(JAXBElement<String> value) {
        this.intervalValue = ((JAXBElement<String> ) value);
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
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapDirectory.Servers }
     *     
     */
    public XLdapDirectory.Servers getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapDirectory.Servers }
     *     
     */
    public void setServers(XLdapDirectory.Servers value) {
        this.servers = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the mailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailId() {
        return mailId;
    }

    /**
     * Sets the value of the mailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailId(String value) {
        this.mailId = value;
    }

    /**
     * Gets the value of the ldapFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLdapFilter() {
        return ldapFilter;
    }

    /**
     * Sets the value of the ldapFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLdapFilter(JAXBElement<XFkType> value) {
        this.ldapFilter = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the directoryUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryUri() {
        return directoryUri;
    }

    /**
     * Sets the value of the directoryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryUri(String value) {
        this.directoryUri = value;
    }

    /**
     * Gets the value of the accessControlGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapDirectory.AccessControlGroupInfo }
     *     
     */
    public XLdapDirectory.AccessControlGroupInfo getAccessControlGroupInfo() {
        return accessControlGroupInfo;
    }

    /**
     * Sets the value of the accessControlGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapDirectory.AccessControlGroupInfo }
     *     
     */
    public void setAccessControlGroupInfo(XLdapDirectory.AccessControlGroupInfo value) {
        this.accessControlGroupInfo = value;
    }

    /**
     * Gets the value of the featureGroupTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getFeatureGroupTemplate() {
        return featureGroupTemplate;
    }

    /**
     * Sets the value of the featureGroupTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setFeatureGroupTemplate(JAXBElement<XFkType> value) {
        this.featureGroupTemplate = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the applyMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyMask() {
        return applyMask;
    }

    /**
     * Sets the value of the applyMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyMask(String value) {
        this.applyMask = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMask(JAXBElement<String> value) {
        this.mask = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the applyPoolList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyPoolList() {
        return applyPoolList;
    }

    /**
     * Sets the value of the applyPoolList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyPoolList(String value) {
        this.applyPoolList = value;
    }

    /**
     * Gets the value of the addDns property.
     * 
     * @return
     *     possible object is
     *     {@link XLdapDirectory.AddDns }
     *     
     */
    public XLdapDirectory.AddDns getAddDns() {
        return addDns;
    }

    /**
     * Sets the value of the addDns property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLdapDirectory.AddDns }
     *     
     */
    public void setAddDns(XLdapDirectory.AddDns value) {
        this.addDns = value;
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

        protected List<XLdapDirectory.AccessControlGroupInfo.AccessControlGroupName> accessControlGroupName;

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
         * {@link XLdapDirectory.AccessControlGroupInfo.AccessControlGroupName }
         * 
         * 
         */
        public List<XLdapDirectory.AccessControlGroupInfo.AccessControlGroupName> getAccessControlGroupName() {
            if (accessControlGroupName == null) {
                accessControlGroupName = new ArrayList<XLdapDirectory.AccessControlGroupInfo.AccessControlGroupName>();
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
     *         &lt;element name="addDn" maxOccurs="3" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="startDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="endDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dnPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "addDn"
    })
    public static class AddDns {

        protected List<XLdapDirectory.AddDns.AddDn> addDn;

        /**
         * Gets the value of the addDn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addDn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddDn().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XLdapDirectory.AddDns.AddDn }
         * 
         * 
         */
        public List<XLdapDirectory.AddDns.AddDn> getAddDn() {
            if (addDn == null) {
                addDn = new ArrayList<XLdapDirectory.AddDns.AddDn>();
            }
            return this.addDn;
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
         *         &lt;element name="startDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="endDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dnPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "startDn",
            "endDn",
            "dnPrefix"
        })
        public static class AddDn {

            protected String startDn;
            protected String endDn;
            protected String dnPrefix;

            /**
             * Gets the value of the startDn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartDn() {
                return startDn;
            }

            /**
             * Sets the value of the startDn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartDn(String value) {
                this.startDn = value;
            }

            /**
             * Gets the value of the endDn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndDn() {
                return endDn;
            }

            /**
             * Sets the value of the endDn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndDn(String value) {
                this.endDn = value;
            }

            /**
             * Gets the value of the dnPrefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDnPrefix() {
                return dnPrefix;
            }

            /**
             * Sets the value of the dnPrefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDnPrefix(String value) {
                this.dnPrefix = value;
            }

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
     *         &lt;element name="server" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="hostName" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
     *                   &lt;element name="ldapPortNumber" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
     *                   &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "server"
    })
    public static class Servers {

        protected List<XLdapDirectory.Servers.Server> server;

        /**
         * Gets the value of the server property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the server property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XLdapDirectory.Servers.Server }
         * 
         * 
         */
        public List<XLdapDirectory.Servers.Server> getServer() {
            if (server == null) {
                server = new ArrayList<XLdapDirectory.Servers.Server>();
            }
            return this.server;
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
         *         &lt;element name="hostName" type="{http://www.cisco.com/AXL/API/10.5}String128"/>
         *         &lt;element name="ldapPortNumber" type="{http://www.cisco.com/AXL/API/10.5}XInteger"/>
         *         &lt;element name="sslEnabled" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
            "hostName",
            "ldapPortNumber",
            "sslEnabled"
        })
        public static class Server {

            protected String hostName;
            protected String ldapPortNumber;
            protected String sslEnabled;

            /**
             * Gets the value of the hostName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHostName() {
                return hostName;
            }

            /**
             * Sets the value of the hostName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHostName(String value) {
                this.hostName = value;
            }

            /**
             * Gets the value of the ldapPortNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLdapPortNumber() {
                return ldapPortNumber;
            }

            /**
             * Sets the value of the ldapPortNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLdapPortNumber(String value) {
                this.ldapPortNumber = value;
            }

            /**
             * Gets the value of the sslEnabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSslEnabled() {
                return sslEnabled;
            }

            /**
             * Sets the value of the sslEnabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSslEnabled(String value) {
                this.sslEnabled = value;
            }

        }

    }

}
