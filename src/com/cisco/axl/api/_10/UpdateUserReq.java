
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
 * <p>Java class for UpdateUserReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID"/>
 *           &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocale" type="{http://www.cisco.com/AXL/API/10.5}XUserLocale" minOccurs="0"/>
 *         &lt;element name="associatedDevices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="device" type="{http://www.cisco.com/AXL/API/10.5}String50" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryExtension" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
 *                   &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="associatedPc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100"/>
 *                             &lt;element name="userRoles" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="enableCti" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="digestCredentials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="presenceGroupName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="subscribeCallingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableMobility" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="enableMobileVoiceAccess" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="maxDeskPickupWaitTime" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="remoteDestinationLimit" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="passwordCredentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pinCredentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pinCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *                   &lt;element name="pinCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredTimeChanged" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                   &lt;element name="pinCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pinCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primaryDevice" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="enableEmcc" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ctiControlledDeviceProfiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="patternPrecedence" type="{http://www.cisco.com/AXL/API/10.5}XPatternPrecedence" minOccurs="0"/>
 *         &lt;element name="numericUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mlppPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customUserFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/10.5}XUserCustomUserField" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="homeCluster" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="imAndPresenceEnable" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="serviceProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="lineAppearanceAssociationForPresences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="lineAppearanceAssociationForPresence" type="{http://www.cisco.com/AXL/API/10.5}XLineAppearanceAssociationForPresence" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="directoryUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeExtensionsInfo" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addExtensionsInfo" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="extensionsInfo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="selfService" type="{http://www.cisco.com/AXL/API/10.5}UniqueString50" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="calendarPresence" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="ldapDirectoryName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="userIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameDialing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipccExtension" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="convertUserAccount" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.cisco.com/AXL/API/10.5}XAccountType" minOccurs="0"/>
 *         &lt;element name="authenticationType" type="{http://www.cisco.com/AXL/API/10.5}XAuthenticationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserReq", propOrder = {
    "uuid",
    "userid",
    "firstName",
    "middleName",
    "lastName",
    "newUserid",
    "password",
    "pin",
    "mailid",
    "department",
    "manager",
    "userLocale",
    "associatedDevices",
    "primaryExtension",
    "associatedPc",
    "associatedGroups",
    "enableCti",
    "digestCredentials",
    "phoneProfiles",
    "defaultProfile",
    "presenceGroupName",
    "subscribeCallingSearchSpaceName",
    "enableMobility",
    "enableMobileVoiceAccess",
    "maxDeskPickupWaitTime",
    "remoteDestinationLimit",
    "passwordCredentials",
    "pinCredentials",
    "primaryDevice",
    "enableEmcc",
    "ctiControlledDeviceProfiles",
    "patternPrecedence",
    "numericUserId",
    "mlppPassword",
    "customUserFields",
    "homeCluster",
    "imAndPresenceEnable",
    "serviceProfile",
    "lineAppearanceAssociationForPresences",
    "directoryUri",
    "telephoneNumber",
    "title",
    "mobileNumber",
    "homeNumber",
    "pagerNumber",
    "removeExtensionsInfo",
    "addExtensionsInfo",
    "extensionsInfo",
    "selfService",
    "userProfile",
    "calendarPresence",
    "ldapDirectoryName",
    "userIdentity",
    "nameDialing",
    "ipccExtension",
    "convertUserAccount",
    "accountType",
    "authenticationType"
})
public class UpdateUserReq
    extends APIRequest
{

    protected String uuid;
    protected String userid;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String newUserid;
    protected String password;
    protected String pin;
    protected String mailid;
    protected String department;
    protected String manager;
    @XmlElementRef(name = "userLocale", type = JAXBElement.class)
    protected JAXBElement<String> userLocale;
    protected UpdateUserReq.AssociatedDevices associatedDevices;
    protected UpdateUserReq.PrimaryExtension primaryExtension;
    protected String associatedPc;
    protected UpdateUserReq.AssociatedGroups associatedGroups;
    @XmlElement(defaultValue = "true")
    protected String enableCti;
    @XmlElementRef(name = "digestCredentials", type = JAXBElement.class)
    protected JAXBElement<String> digestCredentials;
    protected UpdateUserReq.PhoneProfiles phoneProfiles;
    protected XFkType defaultProfile;
    protected XFkType presenceGroupName;
    @XmlElementRef(name = "subscribeCallingSearchSpaceName", type = JAXBElement.class)
    protected JAXBElement<XFkType> subscribeCallingSearchSpaceName;
    @XmlElement(defaultValue = "false")
    protected String enableMobility;
    @XmlElement(defaultValue = "false")
    protected String enableMobileVoiceAccess;
    @XmlElement(defaultValue = "10000")
    protected String maxDeskPickupWaitTime;
    @XmlElement(defaultValue = "4")
    protected String remoteDestinationLimit;
    protected UpdateUserReq.PasswordCredentials passwordCredentials;
    protected UpdateUserReq.PinCredentials pinCredentials;
    protected XFkType primaryDevice;
    protected String enableEmcc;
    protected UpdateUserReq.CtiControlledDeviceProfiles ctiControlledDeviceProfiles;
    @XmlElement(defaultValue = "Default")
    protected String patternPrecedence;
    protected String numericUserId;
    @XmlElementRef(name = "mlppPassword", type = JAXBElement.class)
    protected JAXBElement<String> mlppPassword;
    protected UpdateUserReq.CustomUserFields customUserFields;
    @XmlElement(defaultValue = "true")
    protected String homeCluster;
    protected String imAndPresenceEnable;
    @XmlElementRef(name = "serviceProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> serviceProfile;
    protected UpdateUserReq.LineAppearanceAssociationForPresences lineAppearanceAssociationForPresences;
    @XmlElementRef(name = "directoryUri", type = JAXBElement.class)
    protected JAXBElement<String> directoryUri;
    protected String telephoneNumber;
    protected String title;
    protected String mobileNumber;
    protected String homeNumber;
    protected String pagerNumber;
    protected UpdateUserReq.RemoveExtensionsInfo removeExtensionsInfo;
    protected UpdateUserReq.AddExtensionsInfo addExtensionsInfo;
    protected UpdateUserReq.ExtensionsInfo extensionsInfo;
    @XmlElementRef(name = "selfService", type = JAXBElement.class)
    protected JAXBElement<String> selfService;
    @XmlElementRef(name = "userProfile", type = JAXBElement.class)
    protected JAXBElement<XFkType> userProfile;
    @XmlElement(defaultValue = "false")
    protected String calendarPresence;
    @XmlElementRef(name = "ldapDirectoryName", type = JAXBElement.class)
    protected JAXBElement<XFkType> ldapDirectoryName;
    protected String userIdentity;
    protected String nameDialing;
    @XmlElementRef(name = "ipccExtension", type = JAXBElement.class)
    protected JAXBElement<XFkType> ipccExtension;
    @XmlElementRef(name = "convertUserAccount", type = JAXBElement.class)
    protected JAXBElement<XFkType> convertUserAccount;
    @XmlElement(defaultValue = "Local")
    protected String accountType;
    @XmlElement(defaultValue = "Local")
    protected String authenticationType;

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
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the newUserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUserid() {
        return newUserid;
    }

    /**
     * Sets the value of the newUserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUserid(String value) {
        this.newUserid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the mailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * Sets the value of the mailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailid(String value) {
        this.mailid = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the userLocale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocale() {
        return userLocale;
    }

    /**
     * Sets the value of the userLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocale(JAXBElement<String> value) {
        this.userLocale = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.AssociatedDevices }
     *     
     */
    public UpdateUserReq.AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(UpdateUserReq.AssociatedDevices value) {
        this.associatedDevices = value;
    }

    /**
     * Gets the value of the primaryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.PrimaryExtension }
     *     
     */
    public UpdateUserReq.PrimaryExtension getPrimaryExtension() {
        return primaryExtension;
    }

    /**
     * Sets the value of the primaryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.PrimaryExtension }
     *     
     */
    public void setPrimaryExtension(UpdateUserReq.PrimaryExtension value) {
        this.primaryExtension = value;
    }

    /**
     * Gets the value of the associatedPc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedPc() {
        return associatedPc;
    }

    /**
     * Sets the value of the associatedPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedPc(String value) {
        this.associatedPc = value;
    }

    /**
     * Gets the value of the associatedGroups property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.AssociatedGroups }
     *     
     */
    public UpdateUserReq.AssociatedGroups getAssociatedGroups() {
        return associatedGroups;
    }

    /**
     * Sets the value of the associatedGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.AssociatedGroups }
     *     
     */
    public void setAssociatedGroups(UpdateUserReq.AssociatedGroups value) {
        this.associatedGroups = value;
    }

    /**
     * Gets the value of the enableCti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableCti() {
        return enableCti;
    }

    /**
     * Sets the value of the enableCti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableCti(String value) {
        this.enableCti = value;
    }

    /**
     * Gets the value of the digestCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigestCredentials() {
        return digestCredentials;
    }

    /**
     * Sets the value of the digestCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigestCredentials(JAXBElement<String> value) {
        this.digestCredentials = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.PhoneProfiles }
     *     
     */
    public UpdateUserReq.PhoneProfiles getPhoneProfiles() {
        return phoneProfiles;
    }

    /**
     * Sets the value of the phoneProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.PhoneProfiles }
     *     
     */
    public void setPhoneProfiles(UpdateUserReq.PhoneProfiles value) {
        this.phoneProfiles = value;
    }

    /**
     * Gets the value of the defaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultProfile() {
        return defaultProfile;
    }

    /**
     * Sets the value of the defaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultProfile(XFkType value) {
        this.defaultProfile = value;
    }

    /**
     * Gets the value of the presenceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPresenceGroupName() {
        return presenceGroupName;
    }

    /**
     * Sets the value of the presenceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPresenceGroupName(XFkType value) {
        this.presenceGroupName = value;
    }

    /**
     * Gets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getSubscribeCallingSearchSpaceName() {
        return subscribeCallingSearchSpaceName;
    }

    /**
     * Sets the value of the subscribeCallingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setSubscribeCallingSearchSpaceName(JAXBElement<XFkType> value) {
        this.subscribeCallingSearchSpaceName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the enableMobility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobility() {
        return enableMobility;
    }

    /**
     * Sets the value of the enableMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobility(String value) {
        this.enableMobility = value;
    }

    /**
     * Gets the value of the enableMobileVoiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableMobileVoiceAccess() {
        return enableMobileVoiceAccess;
    }

    /**
     * Sets the value of the enableMobileVoiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableMobileVoiceAccess(String value) {
        this.enableMobileVoiceAccess = value;
    }

    /**
     * Gets the value of the maxDeskPickupWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDeskPickupWaitTime() {
        return maxDeskPickupWaitTime;
    }

    /**
     * Sets the value of the maxDeskPickupWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDeskPickupWaitTime(String value) {
        this.maxDeskPickupWaitTime = value;
    }

    /**
     * Gets the value of the remoteDestinationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDestinationLimit() {
        return remoteDestinationLimit;
    }

    /**
     * Sets the value of the remoteDestinationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDestinationLimit(String value) {
        this.remoteDestinationLimit = value;
    }

    /**
     * Gets the value of the passwordCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.PasswordCredentials }
     *     
     */
    public UpdateUserReq.PasswordCredentials getPasswordCredentials() {
        return passwordCredentials;
    }

    /**
     * Sets the value of the passwordCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.PasswordCredentials }
     *     
     */
    public void setPasswordCredentials(UpdateUserReq.PasswordCredentials value) {
        this.passwordCredentials = value;
    }

    /**
     * Gets the value of the pinCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.PinCredentials }
     *     
     */
    public UpdateUserReq.PinCredentials getPinCredentials() {
        return pinCredentials;
    }

    /**
     * Sets the value of the pinCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.PinCredentials }
     *     
     */
    public void setPinCredentials(UpdateUserReq.PinCredentials value) {
        this.pinCredentials = value;
    }

    /**
     * Gets the value of the primaryDevice property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getPrimaryDevice() {
        return primaryDevice;
    }

    /**
     * Sets the value of the primaryDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setPrimaryDevice(XFkType value) {
        this.primaryDevice = value;
    }

    /**
     * Gets the value of the enableEmcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableEmcc() {
        return enableEmcc;
    }

    /**
     * Sets the value of the enableEmcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableEmcc(String value) {
        this.enableEmcc = value;
    }

    /**
     * Gets the value of the ctiControlledDeviceProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.CtiControlledDeviceProfiles }
     *     
     */
    public UpdateUserReq.CtiControlledDeviceProfiles getCtiControlledDeviceProfiles() {
        return ctiControlledDeviceProfiles;
    }

    /**
     * Sets the value of the ctiControlledDeviceProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.CtiControlledDeviceProfiles }
     *     
     */
    public void setCtiControlledDeviceProfiles(UpdateUserReq.CtiControlledDeviceProfiles value) {
        this.ctiControlledDeviceProfiles = value;
    }

    /**
     * Gets the value of the patternPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternPrecedence() {
        return patternPrecedence;
    }

    /**
     * Sets the value of the patternPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternPrecedence(String value) {
        this.patternPrecedence = value;
    }

    /**
     * Gets the value of the numericUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericUserId() {
        return numericUserId;
    }

    /**
     * Sets the value of the numericUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericUserId(String value) {
        this.numericUserId = value;
    }

    /**
     * Gets the value of the mlppPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMlppPassword() {
        return mlppPassword;
    }

    /**
     * Sets the value of the mlppPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMlppPassword(JAXBElement<String> value) {
        this.mlppPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customUserFields property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.CustomUserFields }
     *     
     */
    public UpdateUserReq.CustomUserFields getCustomUserFields() {
        return customUserFields;
    }

    /**
     * Sets the value of the customUserFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.CustomUserFields }
     *     
     */
    public void setCustomUserFields(UpdateUserReq.CustomUserFields value) {
        this.customUserFields = value;
    }

    /**
     * Gets the value of the homeCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCluster() {
        return homeCluster;
    }

    /**
     * Sets the value of the homeCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCluster(String value) {
        this.homeCluster = value;
    }

    /**
     * Gets the value of the imAndPresenceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAndPresenceEnable() {
        return imAndPresenceEnable;
    }

    /**
     * Sets the value of the imAndPresenceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAndPresenceEnable(String value) {
        this.imAndPresenceEnable = value;
    }

    /**
     * Gets the value of the serviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getServiceProfile() {
        return serviceProfile;
    }

    /**
     * Sets the value of the serviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setServiceProfile(JAXBElement<XFkType> value) {
        this.serviceProfile = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the lineAppearanceAssociationForPresences property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.LineAppearanceAssociationForPresences }
     *     
     */
    public UpdateUserReq.LineAppearanceAssociationForPresences getLineAppearanceAssociationForPresences() {
        return lineAppearanceAssociationForPresences;
    }

    /**
     * Sets the value of the lineAppearanceAssociationForPresences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.LineAppearanceAssociationForPresences }
     *     
     */
    public void setLineAppearanceAssociationForPresences(UpdateUserReq.LineAppearanceAssociationForPresences value) {
        this.lineAppearanceAssociationForPresences = value;
    }

    /**
     * Gets the value of the directoryUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirectoryUri() {
        return directoryUri;
    }

    /**
     * Sets the value of the directoryUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirectoryUri(JAXBElement<String> value) {
        this.directoryUri = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the homeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeNumber() {
        return homeNumber;
    }

    /**
     * Sets the value of the homeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeNumber(String value) {
        this.homeNumber = value;
    }

    /**
     * Gets the value of the pagerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerNumber() {
        return pagerNumber;
    }

    /**
     * Sets the value of the pagerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerNumber(String value) {
        this.pagerNumber = value;
    }

    /**
     * Gets the value of the removeExtensionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.RemoveExtensionsInfo }
     *     
     */
    public UpdateUserReq.RemoveExtensionsInfo getRemoveExtensionsInfo() {
        return removeExtensionsInfo;
    }

    /**
     * Sets the value of the removeExtensionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.RemoveExtensionsInfo }
     *     
     */
    public void setRemoveExtensionsInfo(UpdateUserReq.RemoveExtensionsInfo value) {
        this.removeExtensionsInfo = value;
    }

    /**
     * Gets the value of the addExtensionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.AddExtensionsInfo }
     *     
     */
    public UpdateUserReq.AddExtensionsInfo getAddExtensionsInfo() {
        return addExtensionsInfo;
    }

    /**
     * Sets the value of the addExtensionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.AddExtensionsInfo }
     *     
     */
    public void setAddExtensionsInfo(UpdateUserReq.AddExtensionsInfo value) {
        this.addExtensionsInfo = value;
    }

    /**
     * Gets the value of the extensionsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateUserReq.ExtensionsInfo }
     *     
     */
    public UpdateUserReq.ExtensionsInfo getExtensionsInfo() {
        return extensionsInfo;
    }

    /**
     * Sets the value of the extensionsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateUserReq.ExtensionsInfo }
     *     
     */
    public void setExtensionsInfo(UpdateUserReq.ExtensionsInfo value) {
        this.extensionsInfo = value;
    }

    /**
     * Gets the value of the selfService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelfService() {
        return selfService;
    }

    /**
     * Sets the value of the selfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelfService(JAXBElement<String> value) {
        this.selfService = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setUserProfile(JAXBElement<XFkType> value) {
        this.userProfile = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the calendarPresence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarPresence() {
        return calendarPresence;
    }

    /**
     * Sets the value of the calendarPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarPresence(String value) {
        this.calendarPresence = value;
    }

    /**
     * Gets the value of the ldapDirectoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getLdapDirectoryName() {
        return ldapDirectoryName;
    }

    /**
     * Sets the value of the ldapDirectoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setLdapDirectoryName(JAXBElement<XFkType> value) {
        this.ldapDirectoryName = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the userIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentity() {
        return userIdentity;
    }

    /**
     * Sets the value of the userIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentity(String value) {
        this.userIdentity = value;
    }

    /**
     * Gets the value of the nameDialing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDialing() {
        return nameDialing;
    }

    /**
     * Sets the value of the nameDialing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDialing(String value) {
        this.nameDialing = value;
    }

    /**
     * Gets the value of the ipccExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getIpccExtension() {
        return ipccExtension;
    }

    /**
     * Sets the value of the ipccExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setIpccExtension(JAXBElement<XFkType> value) {
        this.ipccExtension = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the convertUserAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getConvertUserAccount() {
        return convertUserAccount;
    }

    /**
     * Sets the value of the convertUserAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setConvertUserAccount(JAXBElement<XFkType> value) {
        this.convertUserAccount = ((JAXBElement<XFkType> ) value);
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
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
     *         &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
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
        "extension"
    })
    public static class AddExtensionsInfo
        extends XCommonMembersExtension
    {

        protected List<XExtension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XExtension }
         * 
         * 
         */
        public List<XExtension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<XExtension>();
            }
            return this.extension;
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
     *         &lt;element name="device" type="{http://www.cisco.com/AXL/API/10.5}String50" maxOccurs="unbounded" minOccurs="0"/>
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
        "device"
    })
    public static class AssociatedDevices {

        protected List<String> device;

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDevice() {
            if (device == null) {
                device = new ArrayList<String>();
            }
            return this.device;
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
     *         &lt;element name="userGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100"/>
     *                   &lt;element name="userRoles" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "userGroup"
    })
    public static class AssociatedGroups {

        protected List<UpdateUserReq.AssociatedGroups.UserGroup> userGroup;

        /**
         * Gets the value of the userGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateUserReq.AssociatedGroups.UserGroup }
         * 
         * 
         */
        public List<UpdateUserReq.AssociatedGroups.UserGroup> getUserGroup() {
            if (userGroup == null) {
                userGroup = new ArrayList<UpdateUserReq.AssociatedGroups.UserGroup>();
            }
            return this.userGroup;
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
         *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100"/>
         *         &lt;element name="userRoles" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
            "name",
            "userRoles"
        })
        public static class UserGroup {

            protected String name;
            protected UpdateUserReq.AssociatedGroups.UserGroup.UserRoles userRoles;

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
             * Gets the value of the userRoles property.
             * 
             * @return
             *     possible object is
             *     {@link UpdateUserReq.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public UpdateUserReq.AssociatedGroups.UserGroup.UserRoles getUserRoles() {
                return userRoles;
            }

            /**
             * Sets the value of the userRoles property.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateUserReq.AssociatedGroups.UserGroup.UserRoles }
             *     
             */
            public void setUserRoles(UpdateUserReq.AssociatedGroups.UserGroup.UserRoles value) {
                this.userRoles = value;
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
             *         &lt;element name="userRole" type="{http://www.cisco.com/AXL/API/10.5}String100" maxOccurs="unbounded" minOccurs="0"/>
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
                "userRole"
            })
            public static class UserRoles {

                protected List<String> userRole;

                /**
                 * Gets the value of the userRole property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the userRole property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUserRole().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getUserRole() {
                    if (userRole == null) {
                        userRole = new ArrayList<String>();
                    }
                    return this.userRole;
                }

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
     *         &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded"/>
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
        "profileName"
    })
    public static class CtiControlledDeviceProfiles {

        protected List<XFkType> profileName;

        /**
         * Gets the value of the profileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XFkType }
         * 
         * 
         */
        public List<XFkType> getProfileName() {
            if (profileName == null) {
                profileName = new ArrayList<XFkType>();
            }
            return this.profileName;
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
     *       &lt;choice>
     *         &lt;element name="customUserField" type="{http://www.cisco.com/AXL/API/10.5}XUserCustomUserField" maxOccurs="5" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customUserField"
    })
    public static class CustomUserFields {

        protected List<XUserCustomUserField> customUserField;

        /**
         * Gets the value of the customUserField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customUserField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomUserField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XUserCustomUserField }
         * 
         * 
         */
        public List<XUserCustomUserField> getCustomUserField() {
            if (customUserField == null) {
                customUserField = new ArrayList<XUserCustomUserField>();
            }
            return this.customUserField;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
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
        "extension"
    })
    public static class ExtensionsInfo
        extends XCommonMembersExtension
    {

        protected List<XExtension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XExtension }
         * 
         * 
         */
        public List<XExtension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<XExtension>();
            }
            return this.extension;
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
     *         &lt;element name="lineAppearanceAssociationForPresence" type="{http://www.cisco.com/AXL/API/10.5}XLineAppearanceAssociationForPresence" maxOccurs="unbounded" minOccurs="0"/>
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
        "lineAppearanceAssociationForPresence"
    })
    public static class LineAppearanceAssociationForPresences {

        protected List<XLineAppearanceAssociationForPresence> lineAppearanceAssociationForPresence;

        /**
         * Gets the value of the lineAppearanceAssociationForPresence property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineAppearanceAssociationForPresence property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineAppearanceAssociationForPresence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XLineAppearanceAssociationForPresence }
         * 
         * 
         */
        public List<XLineAppearanceAssociationForPresence> getLineAppearanceAssociationForPresence() {
            if (lineAppearanceAssociationForPresence == null) {
                lineAppearanceAssociationForPresence = new ArrayList<XLineAppearanceAssociationForPresence>();
            }
            return this.lineAppearanceAssociationForPresence;
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
     *         &lt;element name="pwdCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="pwdCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeChanged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pwdCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "pwdCredPolicyName",
        "pwdCredUserCantChange",
        "pwdCredUserMustChange",
        "pwdCredDoesNotExpire",
        "pwdCredTimeChanged",
        "pwdCredTimeAdminLockout",
        "pwdCredLockedByAdministrator"
    })
    public static class PasswordCredentials {

        protected XFkType pwdCredPolicyName;
        protected String pwdCredUserCantChange;
        protected String pwdCredUserMustChange;
        protected String pwdCredDoesNotExpire;
        protected String pwdCredTimeChanged;
        @XmlElementRef(name = "pwdCredTimeAdminLockout", type = JAXBElement.class)
        protected JAXBElement<String> pwdCredTimeAdminLockout;
        protected String pwdCredLockedByAdministrator;

        /**
         * Gets the value of the pwdCredPolicyName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPwdCredPolicyName() {
            return pwdCredPolicyName;
        }

        /**
         * Sets the value of the pwdCredPolicyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPwdCredPolicyName(XFkType value) {
            this.pwdCredPolicyName = value;
        }

        /**
         * Gets the value of the pwdCredUserCantChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserCantChange() {
            return pwdCredUserCantChange;
        }

        /**
         * Sets the value of the pwdCredUserCantChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserCantChange(String value) {
            this.pwdCredUserCantChange = value;
        }

        /**
         * Gets the value of the pwdCredUserMustChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredUserMustChange() {
            return pwdCredUserMustChange;
        }

        /**
         * Sets the value of the pwdCredUserMustChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredUserMustChange(String value) {
            this.pwdCredUserMustChange = value;
        }

        /**
         * Gets the value of the pwdCredDoesNotExpire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredDoesNotExpire() {
            return pwdCredDoesNotExpire;
        }

        /**
         * Sets the value of the pwdCredDoesNotExpire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredDoesNotExpire(String value) {
            this.pwdCredDoesNotExpire = value;
        }

        /**
         * Gets the value of the pwdCredTimeChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredTimeChanged() {
            return pwdCredTimeChanged;
        }

        /**
         * Sets the value of the pwdCredTimeChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredTimeChanged(String value) {
            this.pwdCredTimeChanged = value;
        }

        /**
         * Gets the value of the pwdCredTimeAdminLockout property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPwdCredTimeAdminLockout() {
            return pwdCredTimeAdminLockout;
        }

        /**
         * Sets the value of the pwdCredTimeAdminLockout property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPwdCredTimeAdminLockout(JAXBElement<String> value) {
            this.pwdCredTimeAdminLockout = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the pwdCredLockedByAdministrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCredLockedByAdministrator() {
            return pwdCredLockedByAdministrator;
        }

        /**
         * Sets the value of the pwdCredLockedByAdministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCredLockedByAdministrator(String value) {
            this.pwdCredLockedByAdministrator = value;
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
     *         &lt;element name="profileName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" maxOccurs="unbounded"/>
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
        "profileName"
    })
    public static class PhoneProfiles {

        protected List<XFkType> profileName;

        /**
         * Gets the value of the profileName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XFkType }
         * 
         * 
         */
        public List<XFkType> getProfileName() {
            if (profileName == null) {
                profileName = new ArrayList<XFkType>();
            }
            return this.profileName;
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
     *         &lt;element name="pinCredPolicyName" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
     *         &lt;element name="pinCredUserCantChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredUserMustChange" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredDoesNotExpire" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredTimeChanged" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
     *         &lt;element name="pinCredTimeAdminLockout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pinCredLockedByAdministrator" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
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
        "pinCredPolicyName",
        "pinCredUserCantChange",
        "pinCredUserMustChange",
        "pinCredDoesNotExpire",
        "pinCredTimeChanged",
        "pinCredTimeAdminLockout",
        "pinCredLockedByAdministrator"
    })
    public static class PinCredentials {

        protected XFkType pinCredPolicyName;
        protected String pinCredUserCantChange;
        protected String pinCredUserMustChange;
        protected String pinCredDoesNotExpire;
        protected String pinCredTimeChanged;
        @XmlElementRef(name = "pinCredTimeAdminLockout", type = JAXBElement.class)
        protected JAXBElement<String> pinCredTimeAdminLockout;
        protected String pinCredLockedByAdministrator;

        /**
         * Gets the value of the pinCredPolicyName property.
         * 
         * @return
         *     possible object is
         *     {@link XFkType }
         *     
         */
        public XFkType getPinCredPolicyName() {
            return pinCredPolicyName;
        }

        /**
         * Sets the value of the pinCredPolicyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link XFkType }
         *     
         */
        public void setPinCredPolicyName(XFkType value) {
            this.pinCredPolicyName = value;
        }

        /**
         * Gets the value of the pinCredUserCantChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredUserCantChange() {
            return pinCredUserCantChange;
        }

        /**
         * Sets the value of the pinCredUserCantChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredUserCantChange(String value) {
            this.pinCredUserCantChange = value;
        }

        /**
         * Gets the value of the pinCredUserMustChange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredUserMustChange() {
            return pinCredUserMustChange;
        }

        /**
         * Sets the value of the pinCredUserMustChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredUserMustChange(String value) {
            this.pinCredUserMustChange = value;
        }

        /**
         * Gets the value of the pinCredDoesNotExpire property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredDoesNotExpire() {
            return pinCredDoesNotExpire;
        }

        /**
         * Sets the value of the pinCredDoesNotExpire property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredDoesNotExpire(String value) {
            this.pinCredDoesNotExpire = value;
        }

        /**
         * Gets the value of the pinCredTimeChanged property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredTimeChanged() {
            return pinCredTimeChanged;
        }

        /**
         * Sets the value of the pinCredTimeChanged property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredTimeChanged(String value) {
            this.pinCredTimeChanged = value;
        }

        /**
         * Gets the value of the pinCredTimeAdminLockout property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getPinCredTimeAdminLockout() {
            return pinCredTimeAdminLockout;
        }

        /**
         * Sets the value of the pinCredTimeAdminLockout property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setPinCredTimeAdminLockout(JAXBElement<String> value) {
            this.pinCredTimeAdminLockout = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the pinCredLockedByAdministrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPinCredLockedByAdministrator() {
            return pinCredLockedByAdministrator;
        }

        /**
         * Sets the value of the pinCredLockedByAdministrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPinCredLockedByAdministrator(String value) {
            this.pinCredLockedByAdministrator = value;
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
     *         &lt;element name="pattern" type="{http://www.cisco.com/AXL/API/10.5}String255"/>
     *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
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
        "pattern",
        "routePartitionName"
    })
    public static class PrimaryExtension {

        protected String pattern;
        protected String routePartitionName;

        /**
         * Gets the value of the pattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * Sets the value of the pattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
        }

        /**
         * Gets the value of the routePartitionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutePartitionName() {
            return routePartitionName;
        }

        /**
         * Sets the value of the routePartitionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutePartitionName(String value) {
            this.routePartitionName = value;
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
     *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="extension" type="{http://www.cisco.com/AXL/API/10.5}XExtension" maxOccurs="unbounded" minOccurs="0"/>
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
        "extension"
    })
    public static class RemoveExtensionsInfo
        extends XCommonMembersExtension
    {

        protected List<XExtension> extension;

        /**
         * Gets the value of the extension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XExtension }
         * 
         * 
         */
        public List<XExtension> getExtension() {
            if (extension == null) {
                extension = new ArrayList<XExtension>();
            }
            return this.extension;
        }

    }

}
