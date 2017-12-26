
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSNMPMIB2ListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSNMPMIB2ListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SNMPMIB2List" type="{http://www.cisco.com/AXL/API/10.5}RSNMPMIB2List"/>
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
@XmlType(name = "GetSNMPMIB2ListRes", propOrder = {
    "_return"
})
public class GetSNMPMIB2ListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSNMPMIB2ListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSNMPMIB2ListRes.Return }
     *     
     */
    public GetSNMPMIB2ListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSNMPMIB2ListRes.Return }
     *     
     */
    public void setReturn(GetSNMPMIB2ListRes.Return value) {
        this._return = value;
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
     *         &lt;element name="SNMPMIB2List" type="{http://www.cisco.com/AXL/API/10.5}RSNMPMIB2List"/>
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
        "snmpmib2List"
    })
    public static class Return {

        @XmlElement(name = "SNMPMIB2List", required = true)
        protected RSNMPMIB2List snmpmib2List;

        /**
         * Gets the value of the snmpmib2List property.
         * 
         * @return
         *     possible object is
         *     {@link RSNMPMIB2List }
         *     
         */
        public RSNMPMIB2List getSNMPMIB2List() {
            return snmpmib2List;
        }

        /**
         * Sets the value of the snmpmib2List property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSNMPMIB2List }
         *     
         */
        public void setSNMPMIB2List(RSNMPMIB2List value) {
            this.snmpmib2List = value;
        }

    }

}
