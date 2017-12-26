
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateGatewaySccpEndpointsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateGatewaySccpEndpointsReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="endpoint" type="{http://www.cisco.com/AXL/API/10.5}XGatewaySccp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGatewaySccpEndpointsReq", propOrder = {
    "endpoint"
})
public class UpdateGatewaySccpEndpointsReq
    extends NameAndGUIDRequest
{

    protected XGatewaySccp endpoint;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link XGatewaySccp }
     *     
     */
    public XGatewaySccp getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGatewaySccp }
     *     
     */
    public void setEndpoint(XGatewaySccp value) {
        this.endpoint = value;
    }

}
