
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewayEndpointDigitalAccessPriReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewayEndpointDigitalAccessPriReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/10.5}XGatewayEndpointDigitalPri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewayEndpointDigitalAccessPriReq", propOrder = {
    "endpoint"
})
public class UpdateGatewayEndpointDigitalAccessPriReq
    extends NameAndGUIDRequest
{

    protected XGatewayEndpointDigitalPri endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewayEndpointDigitalPri }
     *     
     */
    public XGatewayEndpointDigitalPri getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewayEndpointDigitalPri }
     *     
     */
    public void setEndpoint(XGatewayEndpointDigitalPri value) {
        this.endpoint = value;
    }

}
