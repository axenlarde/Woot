
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XSdpTransparencyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XSdpTransparencyProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeSet" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/10.5}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="attributeNameString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sdpAttributeHandling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="allowedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "XSdpTransparencyProfile", propOrder = {
    "name",
    "description",
    "attributeSet"
})
public class XSdpTransparencyProfile {

    protected String name;
    protected String description;
    protected List<XSdpTransparencyProfile.AttributeSet> attributeSet;

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
     * Gets the value of the attributeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XSdpTransparencyProfile.AttributeSet }
     * 
     * 
     */
    public List<XSdpTransparencyProfile.AttributeSet> getAttributeSet() {
        if (attributeSet == null) {
            attributeSet = new ArrayList<XSdpTransparencyProfile.AttributeSet>();
        }
        return this.attributeSet;
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
     *         &lt;element name="attributeNameString" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sdpAttributeHandling" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="allowedValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
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
        "attributeNameString",
        "sdpAttributeHandling",
        "allowedValue"
    })
    public static class AttributeSet
        extends XCommonMembersExtension
    {

        protected String attributeNameString;
        protected String sdpAttributeHandling;
        protected List<String> allowedValue;

        /**
         * Gets the value of the attributeNameString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeNameString() {
            return attributeNameString;
        }

        /**
         * Sets the value of the attributeNameString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeNameString(String value) {
            this.attributeNameString = value;
        }

        /**
         * Gets the value of the sdpAttributeHandling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSdpAttributeHandling() {
            return sdpAttributeHandling;
        }

        /**
         * Sets the value of the sdpAttributeHandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSdpAttributeHandling(String value) {
            this.sdpAttributeHandling = value;
        }

        /**
         * Gets the value of the allowedValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAllowedValue() {
            if (allowedValue == null) {
                allowedValue = new ArrayList<String>();
            }
            return this.allowedValue;
        }

    }

}
