
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddAudioCodecPreferenceListReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddAudioCodecPreferenceListReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="audioCodecPreferenceList" type="{http://www.cisco.com/AXL/API/10.5}XAudioCodecPreferenceList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAudioCodecPreferenceListReq", propOrder = {
    "audioCodecPreferenceList"
})
public class AddAudioCodecPreferenceListReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XAudioCodecPreferenceList audioCodecPreferenceList;

    /**
     * Gets the value of the audioCodecPreferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link XAudioCodecPreferenceList }
     *     
     */
    public XAudioCodecPreferenceList getAudioCodecPreferenceList() {
        return audioCodecPreferenceList;
    }

    /**
     * Sets the value of the audioCodecPreferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAudioCodecPreferenceList }
     *     
     */
    public void setAudioCodecPreferenceList(XAudioCodecPreferenceList value) {
        this.audioCodecPreferenceList = value;
    }

}
