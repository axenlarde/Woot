
package com.cisco.axl.api._10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * All requests must extend abstractRequest.
 * 
 * <p>Java class for APIRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIRequest")
@XmlSeeAlso({
    AddUserReq.class,
    AddDirNumberAliasLookupandSyncReq.class,
    UpdateAdvertisedPatternsReq.class,
    AddSafForwarderReq.class,
    UpdateMessageWaitingReq.class,
    AddH323TrunkReq.class,
    AddRouteFilterReq.class,
    AddRemoteClusterReq.class,
    AddPhoneNtpReq.class,
    AddResourcePriorityNamespaceListReq.class,
    UpdateApplicationServerReq.class,
    AddSafCcdPurgeBlockLearnedRoutesReq.class,
    AddCustomUserFieldReq.class,
    AddSNMPCommunityStringReq.class,
    UpdateInterClusterServiceProfileReq.class,
    AddSipTrunkSecurityProfileReq.class,
    UpdateDhcpSubnetReq.class,
    AddCssReq.class,
    AddLineReq.class,
    UpdateSipRealmReq.class,
    AddRemoteDestinationReq.class,
    AddDeviceProfileReq.class,
    GetSNMPCommunityStringReq.class,
    AddMessageWaitingReq.class,
    AddServiceProfileReq.class,
    AddPhoneSecurityProfileReq.class,
    AddAudioCodecPreferenceListReq.class,
    AddMediaResourceListReq.class,
    UpdateDirectedCallParkReq.class,
    UpdateImeEnrolledPatternReq.class,
    AddLbmHubGroupReq.class,
    ExecuteSQLUpdateReq.class,
    AddSrstReq.class,
    UpdateSNMPCommunityStringReq.class,
    AddImportedDirectoryUriCatalogsReq.class,
    AddImeExclusionNumberGroupReq.class,
    AddCommonPhoneConfigReq.class,
    AddMobilityProfileReq.class,
    UnassignPresenceUserReq.class,
    AddGatewaySubunitsReq.class,
    AddCallerFilterListReq.class,
    UpdateLocalRouteGroupReq.class,
    AddConferenceBridgeReq.class,
    AddCallPickupGroupReq.class,
    UpdateSyslogConfigurationReq.class,
    AddTransPatternReq.class,
    AddGatewayEndpointAnalogAccessReq.class,
    RemoveSNMPCommunityStringReq.class,
    AddSipDialRulesReq.class,
    AddRouteGroupReq.class,
    AddVpnGatewayReq.class,
    AddSafSecurityProfileReq.class,
    AddGatewayReq.class,
    AddApplicationToSoftkeyTemplateReq.class,
    AddUserProfileProvisionReq.class,
    AddVoiceMailProfileReq.class,
    AddCallingPartyTransformationPatternReq.class,
    AddPhoneReq.class,
    AddH323PhoneReq.class,
    AddRemoteDestinationProfileReq.class,
    AddImeRouteFilterGroupReq.class,
    UpdatePageLayoutPreferencesReq.class,
    UpdateImeLearnedRoutesReq.class,
    AddCCAProfilesReq.class,
    AddLocationReq.class,
    UpdateMlppDomainReq.class,
    AddSIPNormalizationScriptReq.class,
    UpdateCallPickupGroupReq.class,
    UpdateCredentialPolicyDefaultReq.class,
    AddSipRealmReq.class,
    AddAdvertisedPatternsReq.class,
    UpdateCalledPartyTransformationPatternReq.class,
    UpdateVg224Req.class,
    UpdateSelfProvisioningReq.class,
    AddAppUserReq.class,
    AddLocalRouteGroupReq.class,
    UpdateCustomUserFieldReq.class,
    AddCcdAdvertisingServiceReq.class,
    UpdateLineReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayT1Req.class,
    AddCiscoCatalyst600024PortFXSGatewayReq.class,
    AddTimePeriodReq.class,
    AddSNMPUserReq.class,
    AddCallManagerGroupReq.class,
    DoChangeDNDStatusReq.class,
    GetLdapSyncStatusReq.class,
    AddCalledPartyTracingReq.class,
    AddHuntPilotReq.class,
    DoUpdateRemoteClusterReq.class,
    DoAuthenticateUserReq.class,
    AddProcessNodeReq.class,
    AddGeoLocationFilterReq.class,
    AddHandoffConfigurationReq.class,
    AddCcdHostedDNGroupReq.class,
    AddGatekeeperReq.class,
    AddMobilityReq.class,
    AddFeatureControlPolicyReq.class,
    AddMtpReq.class,
    AddLdapFilterReq.class,
    AddDirectoryLookupDialRulesReq.class,
    AddVpnProfileReq.class,
    GetImeLearnedRoutesReq.class,
    GetPageLayoutPreferencesReq.class,
    AddUserGroupReq.class,
    UpdateSNMPUserReq.class,
    RemoveSNMPUserReq.class,
    AssignPresenceUserReq.class,
    UpdateAppServerInfoReq.class,
    AddGeoLocationPolicyReq.class,
    GetSNMPUserReq.class,
    AddSipProfileReq.class,
    AddAarGroupReq.class,
    ListChangeReq.class,
    AddVohServerReq.class,
    AddDefaultDeviceProfileReq.class,
    AddVoiceMailPortReq.class,
    UpdateRemoteClusterReq.class,
    AddSipRoutePatternReq.class,
    UpdateAarGroupMatrixReq.class,
    AddApplicationUserCapfProfileReq.class,
    AddMlppDomainReq.class,
    AddExternalCallControlProfileReq.class,
    UpdateCCAProfilesReq.class,
    UpdateHandoffConfigurationReq.class,
    AddUcServiceReq.class,
    AddLbmGroupReq.class,
    AddSoftKeyTemplateReq.class,
    AddRegionReq.class,
    AddWLANProfileReq.class,
    AddDeviceMobilityGroupReq.class,
    AddTransformationProfileReq.class,
    AddCallParkReq.class,
    UpdateCmcInfoReq.class,
    UpdateCallParkReq.class,
    UpdateSNMPMIB2ListReq.class,
    UpdateIlsConfigReq.class,
    AddRoutePatternReq.class,
    AddPresenceRedundancyGroupReq.class,
    AddIvrUserLocaleReq.class,
    AddRecordingProfileReq.class,
    AddPresenceGroupReq.class,
    AddCalledPartyTransformationPatternReq.class,
    UpdateServiceParameterReq.class,
    AddCumaServerSecurityProfileReq.class,
    AddCcdRequestingServiceReq.class,
    AddHuntListReq.class,
    AddImeEnrolledPatternReq.class,
    DoDeviceResetReq.class,
    AddGeoLocationReq.class,
    DoLdapSyncReq.class,
    UpdateDhcpServerReq.class,
    AddUniversalLineTemplateReq.class,
    UpdateVoiceMailPilotReq.class,
    UpdateTransPatternReq.class,
    AddApplicationDialRulesReq.class,
    UpdateProcessNodeServiceReq.class,
    AddVg224Req.class,
    AddMobileVoiceAccessReq.class,
    AddDhcpSubnetReq.class,
    UpdateGatewayReq.class,
    UpdateInterClusterDirectoryUriReq.class,
    AddFeatureGroupTemplateReq.class,
    AddImeFirewallReq.class,
    AddUniversalDeviceTemplateReq.class,
    UpdateIvrUserLocaleReq.class,
    AddDeviceMobilityReq.class,
    UpdateCcdFeatureConfigReq.class,
    AddMeetMeReq.class,
    AddLdapSyncCustomFieldReq.class,
    AddUnitsToGatewayReq.class,
    UpdateSafCcdPurgeBlockLearnedRoutesReq.class,
    AddCommonDeviceConfigReq.class,
    AddEnterpriseFeatureAccessConfigurationReq.class,
    UpdateHuntPilotReq.class,
    UpdateRemoteDestinationReq.class,
    UpdateApplicationUserCapfProfileReq.class,
    AddAppServerInfoReq.class,
    AddSipTrunkReq.class,
    AddRouteListReq.class,
    UpdateBillingServerReq.class,
    AddApplicationServerReq.class,
    AddBlockedLearnedPatternsReq.class,
    UpdateRoutePatternReq.class,
    AddPhoneButtonTemplateReq.class,
    AddIpPhoneServicesReq.class,
    DoDeviceLoginReq.class,
    UpdateLdapSyncCustomFieldReq.class,
    UpdateMohAudioSourceReq.class,
    AddRoutePartitionReq.class,
    AddMediaResourceGroupReq.class,
    UpdateCcdHostedDNReq.class,
    UpdateEnterpriseFeatureAccessConfigurationReq.class,
    UpdateAppUserReq.class,
    AddEndUserCapfProfileReq.class,
    GetSNMPMIB2ListReq.class,
    AddTranscoderReq.class,
    AddImeClientReq.class,
    AddCtiRoutePointReq.class,
    AddImeRouteFilterElementReq.class,
    UpdateEmccFeatureConfigReq.class,
    AddSdpTransparencyProfileReq.class,
    UpdateRegionMatrixReq.class,
    UpdateIpPhoneServicesReq.class,
    UpdateEndUserCapfProfileReq.class,
    AddGatewayEndpointDigitalAccessT1Req.class,
    AddVpnGroupReq.class,
    UpdateBlockedLearnedPatternsReq.class,
    AddVoiceMailPilotReq.class,
    UpdateSipRoutePatternReq.class,
    AddFallbackProfileReq.class,
    UpdateRoutePartitionsForLearnedPatternsReq.class,
    AddLineGroupReq.class,
    DoDeviceLogoutReq.class,
    UpdateMobileVoiceAccessReq.class,
    AddFacInfoReq.class,
    AddGatewaySccpEndpointsReq.class,
    AddCredentialPolicyReq.class,
    AddTodAccessReq.class,
    AddDirectedCallParkReq.class,
    AddImeServerReq.class,
    AddNetworkAccessProfileReq.class,
    AddPhysicalLocationReq.class,
    AddH323GatewayReq.class,
    UpdateImeExclusionNumberReq.class,
    GetPhoneTypeDisplayInstanceReq.class,
    AddGatewayEndpointDigitalAccessBriReq.class,
    AddImeEnrolledPatternGroupReq.class,
    AddCmcInfoReq.class,
    UpdateTvsCertificateReq.class,
    AddWlanProfileGroupReq.class,
    AddDhcpServerReq.class,
    AddTimeScheduleReq.class,
    UpdateResourcePriorityNamespaceReq.class,
    GetNumDevicesReq.class,
    AddCiscoCatalyst6000E1VoIPGatewayReq.class,
    AddImeExclusionNumberReq.class,
    AddWifiHotspotReq.class,
    AddUserPhoneAssociationReq.class,
    UpdateUserReq.class,
    AddCiscoCatalyst6000T1VoIPGatewayPriReq.class,
    AddGatewayEndpointDigitalAccessPriReq.class,
    AddCcdHostedDNReq.class,
    ExecuteSQLQueryReq.class,
    AddDevicePoolReq.class,
    AddAnnouncementReq.class,
    UpdateMeetMeReq.class,
    UpdatePhoneNtpReq.class,
    AddDateTimeGroupReq.class,
    AddResourcePriorityNamespaceReq.class,
    UpdateCallingPartyTransformationPatternReq.class,
    AddLdapDirectoryReq.class,
    AddBillingServerReq.class,
    NameAndGUIDRequest.class,
    AddImeE164TransformationReq.class
})
public abstract class APIRequest {

    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;

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

}
