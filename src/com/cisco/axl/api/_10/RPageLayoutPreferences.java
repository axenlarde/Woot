
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPageLayoutPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPageLayoutPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="pageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageSections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="pageSection" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection" minOccurs="0"/>
 *                             &lt;element name="state" type="{http://www.cisco.com/AXL/API/10.5}XWebPageDisplay" minOccurs="0"/>
 *                             &lt;element name="order" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
 *       &lt;attribute name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPageLayoutPreferences", propOrder = {
    "pageName",
    "pageSections"
})
public class RPageLayoutPreferences {

    protected String pageName;
    protected RPageLayoutPreferences.PageSections pageSections;
    @XmlAttribute
    protected String uuid;

    /**
     * Gets the value of the pageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * Sets the value of the pageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageName(String value) {
        this.pageName = value;
    }

    /**
     * Gets the value of the pageSections property.
     * 
     * @return
     *     possible object is
     *     {@link RPageLayoutPreferences.PageSections }
     *     
     */
    public RPageLayoutPreferences.PageSections getPageSections() {
        return pageSections;
    }

    /**
     * Sets the value of the pageSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPageLayoutPreferences.PageSections }
     *     
     */
    public void setPageSections(RPageLayoutPreferences.PageSections value) {
        this.pageSections = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="pageSection" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection" minOccurs="0"/>
     *                   &lt;element name="state" type="{http://www.cisco.com/AXL/API/10.5}XWebPageDisplay" minOccurs="0"/>
     *                   &lt;element name="order" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
        "pageSection"
    })
    public static class PageSections {

        protected List<RPageLayoutPreferences.PageSections.PageSection> pageSection;

        /**
         * Gets the value of the pageSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pageSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPageSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RPageLayoutPreferences.PageSections.PageSection }
         * 
         * 
         */
        public List<RPageLayoutPreferences.PageSections.PageSection> getPageSection() {
            if (pageSection == null) {
                pageSection = new ArrayList<RPageLayoutPreferences.PageSections.PageSection>();
            }
            return this.pageSection;
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
         *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection" minOccurs="0"/>
         *         &lt;element name="state" type="{http://www.cisco.com/AXL/API/10.5}XWebPageDisplay" minOccurs="0"/>
         *         &lt;element name="order" type="{http://www.cisco.com/AXL/API/10.5}XInteger" minOccurs="0"/>
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
            "state",
            "order"
        })
        public static class PageSection {

            protected String name;
            protected String state;
            protected String order;

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
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the order property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrder() {
                return order;
            }

            /**
             * Sets the value of the order property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrder(String value) {
                this.order = value;
            }

        }

    }

}
