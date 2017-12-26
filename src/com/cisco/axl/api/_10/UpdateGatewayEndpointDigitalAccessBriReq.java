
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointDigitalAccessBriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointDigitalAccessBriReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/10.5}XGatewayEndpointDigitalBri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointDigitalAccessBriReq", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointDigitalAccessBriReq
    extends NameAndGUIDRequest
{

    protected XGatewayEndpointDigitalBri endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalBri }
     *     
     */
    public XGatewayEndpointDigitalBri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalBri }
     *     
     */
    public void setEndpoint(XGatewayEndpointDigitalBri value) {
        this.endpoint = value;
    }

}
