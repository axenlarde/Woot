
package com.cisco.axl.api._10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePageLayoutPreferencesReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePageLayoutPreferencesReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="pageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageSections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pageSection" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePageLayoutPreferencesReq", propOrder = {
    "pageName",
    "pageSections"
})
public class UpdatePageLayoutPreferencesReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected String pageName;
    @XmlElement(required = true)
    protected UpdatePageLayoutPreferencesReq.PageSections pageSections;

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
     *     {@link UpdatePageLayoutPreferencesReq.PageSections }
     *     
     */
    public UpdatePageLayoutPreferencesReq.PageSections getPageSections() {
        return pageSections;
    }

    /**
     * Sets the value of the pageSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePageLayoutPreferencesReq.PageSections }
     *     
     */
    public void setPageSections(UpdatePageLayoutPreferencesReq.PageSections value) {
        this.pageSections = value;
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
     *         &lt;element name="pageSection" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection"/>
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

        @XmlElement(required = true)
        protected List<UpdatePageLayoutPreferencesReq.PageSections.PageSection> pageSection;

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
         * {@link UpdatePageLayoutPreferencesReq.PageSections.PageSection }
         * 
         * 
         */
        public List<UpdatePageLayoutPreferencesReq.PageSections.PageSection> getPageSection() {
            if (pageSection == null) {
                pageSection = new ArrayList<UpdatePageLayoutPreferencesReq.PageSections.PageSection>();
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
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}XWebPageSection"/>
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

            @XmlElement(required = true)
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
