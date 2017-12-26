
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAudioCodecPreferenceListRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAudioCodecPreferenceListRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/10.5}RAudioCodecPreferenceList"/>
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
@XmlType(name = "GetAudioCodecPreferenceListRes", propOrder = {
    "_return"
})
public class GetAudioCodecPreferenceListRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetAudioCodecPreferenceListRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetAudioCodecPreferenceListRes.Return }
     *     
     */
    public GetAudioCodecPreferenceListRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAudioCodecPreferenceListRes.Return }
     *     
     */
    public void setReturn(GetAudioCodecPreferenceListRes.Return value) {
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
     *         &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/10.5}RAudioCodecPreferenceList"/>
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
        "audioCodecPreferenceList"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RAudioCodecPreferenceList audioCodecPreferenceList;

        /**
         * Gets the value of the audioCodecPreferenceList property.
         * 
         * @return
         *     possible object is
         *     {@link RAudioCodecPreferenceList }
         *     
         */
        public RAudioCodecPreferenceList getAudioCodecPreferenceList() {
            return audioCodecPreferenceList;
        }

        /**
         * Sets the value of the audioCodecPreferenceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAudioCodecPreferenceList }
         *     
         */
        public void setAudioCodecPreferenceList(RAudioCodecPreferenceList value) {
            this.audioCodecPreferenceList = value;
        }

    }

}
