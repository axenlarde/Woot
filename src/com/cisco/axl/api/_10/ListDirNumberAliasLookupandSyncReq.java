
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDirNumberAliasLookupandSyncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDirNumberAliasLookupandSyncReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ldapConfigName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ldapManagerDisgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ldapUserSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="returnedTags" type="{http://www.cisco.com/AXL/API/10.5}LDirNumberAliasLookupandSync"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDirNumberAliasLookupandSyncReq", propOrder = {
    "searchCriteria",
    "returnedTags",
    "skip",
    "first"
})
public class ListDirNumberAliasLookupandSyncReq {

    @XmlElement(required = true)
    protected ListDirNumberAliasLookupandSyncReq.SearchCriteria searchCriteria;
    @XmlElement(required = true)
    protected LDirNumberAliasLookupandSync returnedTags;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger skip;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger first;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ListDirNumberAliasLookupandSyncReq.SearchCriteria }
     *     
     */
    public ListDirNumberAliasLookupandSyncReq.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDirNumberAliasLookupandSyncReq.SearchCriteria }
     *     
     */
    public void setSearchCriteria(ListDirNumberAliasLookupandSyncReq.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the returnedTags property.
     * 
     * @return
     *     possible object is
     *     {@link LDirNumberAliasLookupandSync }
     *     
     */
    public LDirNumberAliasLookupandSync getReturnedTags() {
        return returnedTags;
    }

    /**
     * Sets the value of the returnedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDirNumberAliasLookupandSync }
     *     
     */
    public void setReturnedTags(LDirNumberAliasLookupandSync value) {
        this.returnedTags = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkip(BigInteger value) {
        this.skip = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirst(BigInteger value) {
        this.first = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
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
     *         &lt;element name="ldapConfigName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ldapManagerDisgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ldapUserSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ldapConfigName",
        "ldapManagerDisgName",
        "ldapUserSearch"
    })
    public static class SearchCriteria {

        protected String ldapConfigName;
        protected String ldapManagerDisgName;
        protected String ldapUserSearch;

        /**
         * Gets the value of the ldapConfigName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLdapConfigName() {
            return ldapConfigName;
        }

        /**
         * Sets the value of the ldapConfigName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLdapConfigName(String value) {
            this.ldapConfigName = value;
        }

        /**
         * Gets the value of the ldapManagerDisgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLdapManagerDisgName() {
            return ldapManagerDisgName;
        }

        /**
         * Sets the value of the ldapManagerDisgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLdapManagerDisgName(String value) {
            this.ldapManagerDisgName = value;
        }

        /**
         * Gets the value of the ldapUserSearch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLdapUserSearch() {
            return ldapUserSearch;
        }

        /**
         * Sets the value of the ldapUserSearch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLdapUserSearch(String value) {
            this.ldapUserSearch = value;
        }

    }

}
