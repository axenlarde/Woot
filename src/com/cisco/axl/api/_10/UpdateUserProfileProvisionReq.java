
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateUserProfileProvisionReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserProfileProvisionReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/10.5}String50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/10.5}String255" minOccurs="0"/>
 *         &lt;element name="deskPhones" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="mobileDevices" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="universalLineTemplate" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *         &lt;element name="allowProvision" type="{http://www.cisco.com/AXL/API/10.5}boolean" minOccurs="0"/>
 *         &lt;element name="limitProvision" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
 *         &lt;element name="defaultUserProfile" type="{http://www.cisco.com/AXL/API/10.5}XFkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserProfileProvisionReq", propOrder = {
    "newName",
    "description",
    "deskPhones",
    "mobileDevices",
    "profile",
    "universalLineTemplate",
    "allowProvision",
    "limitProvision",
    "defaultUserProfile"
})
public class UpdateUserProfileProvisionReq
    extends NameAndGUIDRequest
{

    protected String newName;
    protected String description;
    protected XFkType deskPhones;
    protected XFkType mobileDevices;
    protected XFkType profile;
    protected XFkType universalLineTemplate;
    @XmlElement(defaultValue = "false")
    protected String allowProvision;
    @XmlElement(defaultValue = "10")
    protected String limitProvision;
    protected XFkType defaultUserProfile;

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
     * Gets the value of the deskPhones property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDeskPhones() {
        return deskPhones;
    }

    /**
     * Sets the value of the deskPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDeskPhones(XFkType value) {
        this.deskPhones = value;
    }

    /**
     * Gets the value of the mobileDevices property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getMobileDevices() {
        return mobileDevices;
    }

    /**
     * Sets the value of the mobileDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setMobileDevices(XFkType value) {
        this.mobileDevices = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setProfile(XFkType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the universalLineTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getUniversalLineTemplate() {
        return universalLineTemplate;
    }

    /**
     * Sets the value of the universalLineTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setUniversalLineTemplate(XFkType value) {
        this.universalLineTemplate = value;
    }

    /**
     * Gets the value of the allowProvision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowProvision() {
        return allowProvision;
    }

    /**
     * Sets the value of the allowProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowProvision(String value) {
        this.allowProvision = value;
    }

    /**
     * Gets the value of the limitProvision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitProvision() {
        return limitProvision;
    }

    /**
     * Sets the value of the limitProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitProvision(String value) {
        this.limitProvision = value;
    }

    /**
     * Gets the value of the defaultUserProfile property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getDefaultUserProfile() {
        return defaultUserProfile;
    }

    /**
     * Sets the value of the defaultUserProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setDefaultUserProfile(XFkType value) {
        this.defaultUserProfile = value;
    }

}
