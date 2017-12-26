
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a utility object that created because many of the Get, Remove, and Update methods allow the user to specify either the name or the uuid.
 * 
 * <p>Java class for NameAndGUIDRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndGUIDRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/10.5}APIRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.cisco.com/AXL/API/10.5}String100"/>
 *           &lt;element name="uuid" type="{http://www.cisco.com/AXL/API/10.5}XUUID"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndGUIDRequest", propOrder = {
    "name",
    "uuid"
})
@XmlSeeAlso({
    UpdatePresenceGroupReq.class,
    UpdateCcdRequestingServiceReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    UpdateCommonDeviceConfigReq.class,
    UpdateDeviceProfileReq.class,
    UpdateSafForwarderReq.class,
    UpdateTransformationProfileReq.class,
    UpdateRecordingProfileReq.class,
    UpdateCommonPhoneConfigReq.class,
    UpdateLdapFilterReq.class,
    UpdateHuntListReq.class,
    UpdateWifiHotspotReq.class,
    UpdateCiscoCatalyst6000E1VoIPGatewayReq.class,
    UpdateGatewaySccpEndpointsReq.class,
    UpdateUniversalDeviceTemplateReq.class,
    UpdateGeoLocationPolicyReq.class,
    UpdateFixedMohAudioSourceReq.class,
    UpdateImeClientReq.class,
    UpdateCumaServerSecurityProfileReq.class,
    UpdateExternalCallControlProfileReq.class,
    UpdateAarGroupReq.class,
    UpdateImeEnrolledPatternGroupReq.class,
    UpdateSipProfileReq.class,
    UpdateApplicationDialRulesReq.class,
    UpdateUcServiceReq.class,
    UpdateSrstReq.class,
    UpdateImeExclusionNumberGroupReq.class,
    UpdateConferenceBridgeReq.class,
    UpdateAudioCodecPreferenceListReq.class,
    UpdateTimePeriodReq.class,
    UpdateRegionReq.class,
    UpdateImeRouteFilterElementReq.class,
    UpdateDefaultDeviceProfileReq.class,
    UpdateDeviceMobilityGroupReq.class,
    UpdateSafSecurityProfileReq.class,
    UpdateMediaResourceListReq.class,
    UpdatePhoneSecurityProfileReq.class,
    UpdateRouteFilterReq.class,
    UpdateDirNumberAliasLookupandSyncReq.class,
    UpdateSdpTransparencyProfileReq.class,
    UpdateH323PhoneReq.class,
    UpdatePhoneButtonTemplateReq.class,
    UpdateMobilityProfileReq.class,
    UpdateH323GatewayReq.class,
    UpdateVpnGatewayReq.class,
    UpdateGeoLocationReq.class,
    UpdateVoiceMailPortReq.class,
    UpdateLocationReq.class,
    UpdateFacInfoReq.class,
    UpdateFeatureControlPolicyReq.class,
    UpdateLbmHubGroupReq.class,
    UpdateServiceProfileReq.class,
    UpdateLbmGroupReq.class,
    UpdateRemoteDestinationProfileReq.class,
    UpdateWLANProfileReq.class,
    UpdateGatewayEndpointDigitalAccessBriReq.class,
    UpdateImeRouteFilterGroupReq.class,
    UpdateAnnouncementReq.class,
    UpdateRouteGroupReq.class,
    UpdateCcdHostedDNGroupReq.class,
    UpdateCtiRoutePointReq.class,
    UpdateVohServerReq.class,
    UpdateTodAccessReq.class,
    UpdateCallManagerGroupReq.class,
    UpdateFallbackProfileReq.class,
    UpdateCredentialPolicyReq.class,
    UpdateSipDialRulesReq.class,
    UpdateCiscoCatalyst600024PortFXSGatewayReq.class,
    UpdateAnnunciatorReq.class,
    UpdateUserProfileProvisionReq.class,
    UpdateGatewayEndpointDigitalAccessT1Req.class,
    UpdateImeE164TransformationReq.class,
    UpdateCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    UpdateFeatureGroupTemplateReq.class,
    UpdateImeServerReq.class,
    UpdateCcdAdvertisingServiceReq.class,
    UpdateNetworkAccessProfileReq.class,
    UpdatePresenceRedundancyGroupReq.class,
    UpdateDeviceMobilityReq.class,
    UpdateSipTrunkReq.class,
    UpdateDateTimeGroupReq.class,
    UpdateH323TrunkReq.class,
    UpdateMediaResourceGroupReq.class,
    UpdateGatekeeperReq.class,
    UpdateLdapDirectoryReq.class,
    UpdateWlanProfileGroupReq.class,
    UpdateVpnProfileReq.class,
    UpdatePhysicalLocationReq.class,
    UpdateDirectoryLookupDialRulesReq.class,
    UpdateGeoLocationFilterReq.class,
    UpdateSoftKeySetReq.class,
    UpdateRoutePartitionReq.class,
    UpdateCallerFilterListReq.class,
    UpdateGatewayEndpointAnalogAccessReq.class,
    UpdateProcessNodeReq.class,
    UpdateUserGroupReq.class,
    UpdateMohServerReq.class,
    UpdateVpnGroupReq.class,
    UpdateTranscoderReq.class,
    UpdateCallManagerReq.class,
    UpdateDevicePoolReq.class,
    UpdateGatewayEndpointDigitalAccessPriReq.class,
    UpdateSoftKeyTemplateReq.class,
    UpdateUniversalLineTemplateReq.class,
    UpdateVoiceMailProfileReq.class,
    UpdateMtpReq.class,
    UpdateCssReq.class,
    UpdateTimeScheduleReq.class,
    UpdateSIPNormalizationScriptReq.class,
    UpdateResourcePriorityNamespaceListReq.class,
    UpdateRouteListReq.class,
    UpdatePhoneReq.class,
    UpdateSipTrunkSecurityProfileReq.class,
    UpdateImeFirewallReq.class,
    UpdateLineGroupReq.class,
    UpdateImportedDirectoryUriCatalogsReq.class
})
public class NameAndGUIDRequest
    extends APIRequest
{

    protected String name;
    protected String uuid;

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

}
