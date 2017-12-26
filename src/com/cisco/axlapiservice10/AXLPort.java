
package com.cisco.axlapiservice10;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.cisco.axl.api._10.AddAarGroupReq;
import com.cisco.axl.api._10.AddAdvertisedPatternsReq;
import com.cisco.axl.api._10.AddAnnouncementReq;
import com.cisco.axl.api._10.AddAppServerInfoReq;
import com.cisco.axl.api._10.AddAppUserReq;
import com.cisco.axl.api._10.AddApplicationDialRulesReq;
import com.cisco.axl.api._10.AddApplicationServerReq;
import com.cisco.axl.api._10.AddApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._10.AddApplicationUserCapfProfileReq;
import com.cisco.axl.api._10.AddAudioCodecPreferenceListReq;
import com.cisco.axl.api._10.AddBillingServerReq;
import com.cisco.axl.api._10.AddBlockedLearnedPatternsReq;
import com.cisco.axl.api._10.AddCCAProfilesReq;
import com.cisco.axl.api._10.AddCallManagerGroupReq;
import com.cisco.axl.api._10.AddCallParkReq;
import com.cisco.axl.api._10.AddCallPickupGroupReq;
import com.cisco.axl.api._10.AddCalledPartyTracingReq;
import com.cisco.axl.api._10.AddCalledPartyTransformationPatternReq;
import com.cisco.axl.api._10.AddCallerFilterListReq;
import com.cisco.axl.api._10.AddCallingPartyTransformationPatternReq;
import com.cisco.axl.api._10.AddCcdAdvertisingServiceReq;
import com.cisco.axl.api._10.AddCcdHostedDNGroupReq;
import com.cisco.axl.api._10.AddCcdHostedDNReq;
import com.cisco.axl.api._10.AddCcdRequestingServiceReq;
import com.cisco.axl.api._10.AddCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._10.AddCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._10.AddCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._10.AddCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._10.AddCmcInfoReq;
import com.cisco.axl.api._10.AddCommonDeviceConfigReq;
import com.cisco.axl.api._10.AddCommonPhoneConfigReq;
import com.cisco.axl.api._10.AddConferenceBridgeReq;
import com.cisco.axl.api._10.AddCredentialPolicyReq;
import com.cisco.axl.api._10.AddCssReq;
import com.cisco.axl.api._10.AddCtiRoutePointReq;
import com.cisco.axl.api._10.AddCumaServerSecurityProfileReq;
import com.cisco.axl.api._10.AddCustomUserFieldReq;
import com.cisco.axl.api._10.AddDateTimeGroupReq;
import com.cisco.axl.api._10.AddDefaultDeviceProfileReq;
import com.cisco.axl.api._10.AddDeviceMobilityGroupReq;
import com.cisco.axl.api._10.AddDeviceMobilityReq;
import com.cisco.axl.api._10.AddDevicePoolReq;
import com.cisco.axl.api._10.AddDeviceProfileReq;
import com.cisco.axl.api._10.AddDhcpServerReq;
import com.cisco.axl.api._10.AddDhcpSubnetReq;
import com.cisco.axl.api._10.AddDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._10.AddDirectedCallParkReq;
import com.cisco.axl.api._10.AddDirectoryLookupDialRulesReq;
import com.cisco.axl.api._10.AddEndUserCapfProfileReq;
import com.cisco.axl.api._10.AddEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._10.AddExternalCallControlProfileReq;
import com.cisco.axl.api._10.AddFacInfoReq;
import com.cisco.axl.api._10.AddFallbackProfileReq;
import com.cisco.axl.api._10.AddFeatureControlPolicyReq;
import com.cisco.axl.api._10.AddFeatureGroupTemplateReq;
import com.cisco.axl.api._10.AddGatekeeperReq;
import com.cisco.axl.api._10.AddGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._10.AddGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._10.AddGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._10.AddGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._10.AddGatewayReq;
import com.cisco.axl.api._10.AddGatewaySccpEndpointsReq;
import com.cisco.axl.api._10.AddGatewaySubunitsReq;
import com.cisco.axl.api._10.AddGeoLocationFilterReq;
import com.cisco.axl.api._10.AddGeoLocationPolicyReq;
import com.cisco.axl.api._10.AddGeoLocationReq;
import com.cisco.axl.api._10.AddH323GatewayReq;
import com.cisco.axl.api._10.AddH323PhoneReq;
import com.cisco.axl.api._10.AddH323TrunkReq;
import com.cisco.axl.api._10.AddHandoffConfigurationReq;
import com.cisco.axl.api._10.AddHuntListReq;
import com.cisco.axl.api._10.AddHuntPilotReq;
import com.cisco.axl.api._10.AddImeClientReq;
import com.cisco.axl.api._10.AddImeE164TransformationReq;
import com.cisco.axl.api._10.AddImeEnrolledPatternGroupReq;
import com.cisco.axl.api._10.AddImeEnrolledPatternReq;
import com.cisco.axl.api._10.AddImeExclusionNumberGroupReq;
import com.cisco.axl.api._10.AddImeExclusionNumberReq;
import com.cisco.axl.api._10.AddImeFirewallReq;
import com.cisco.axl.api._10.AddImeRouteFilterElementReq;
import com.cisco.axl.api._10.AddImeRouteFilterGroupReq;
import com.cisco.axl.api._10.AddImeServerReq;
import com.cisco.axl.api._10.AddImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._10.AddIpPhoneServicesReq;
import com.cisco.axl.api._10.AddIvrUserLocaleReq;
import com.cisco.axl.api._10.AddLbmGroupReq;
import com.cisco.axl.api._10.AddLbmHubGroupReq;
import com.cisco.axl.api._10.AddLdapDirectoryReq;
import com.cisco.axl.api._10.AddLdapFilterReq;
import com.cisco.axl.api._10.AddLdapSyncCustomFieldReq;
import com.cisco.axl.api._10.AddLineGroupReq;
import com.cisco.axl.api._10.AddLineReq;
import com.cisco.axl.api._10.AddLocalRouteGroupReq;
import com.cisco.axl.api._10.AddLocationReq;
import com.cisco.axl.api._10.AddMediaResourceGroupReq;
import com.cisco.axl.api._10.AddMediaResourceListReq;
import com.cisco.axl.api._10.AddMeetMeReq;
import com.cisco.axl.api._10.AddMessageWaitingReq;
import com.cisco.axl.api._10.AddMlppDomainReq;
import com.cisco.axl.api._10.AddMobileVoiceAccessReq;
import com.cisco.axl.api._10.AddMobilityProfileReq;
import com.cisco.axl.api._10.AddMobilityReq;
import com.cisco.axl.api._10.AddMtpReq;
import com.cisco.axl.api._10.AddNetworkAccessProfileReq;
import com.cisco.axl.api._10.AddPhoneButtonTemplateReq;
import com.cisco.axl.api._10.AddPhoneNtpReq;
import com.cisco.axl.api._10.AddPhoneReq;
import com.cisco.axl.api._10.AddPhoneSecurityProfileReq;
import com.cisco.axl.api._10.AddPhysicalLocationReq;
import com.cisco.axl.api._10.AddPresenceGroupReq;
import com.cisco.axl.api._10.AddPresenceRedundancyGroupReq;
import com.cisco.axl.api._10.AddProcessNodeReq;
import com.cisco.axl.api._10.AddRecordingProfileReq;
import com.cisco.axl.api._10.AddRegionReq;
import com.cisco.axl.api._10.AddRemoteClusterReq;
import com.cisco.axl.api._10.AddRemoteDestinationProfileReq;
import com.cisco.axl.api._10.AddRemoteDestinationReq;
import com.cisco.axl.api._10.AddResourcePriorityNamespaceListReq;
import com.cisco.axl.api._10.AddResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.AddRouteFilterReq;
import com.cisco.axl.api._10.AddRouteGroupReq;
import com.cisco.axl.api._10.AddRouteListReq;
import com.cisco.axl.api._10.AddRoutePartitionReq;
import com.cisco.axl.api._10.AddRoutePatternReq;
import com.cisco.axl.api._10.AddSIPNormalizationScriptReq;
import com.cisco.axl.api._10.AddSNMPCommunityStringReq;
import com.cisco.axl.api._10.AddSNMPCommunityStringRes;
import com.cisco.axl.api._10.AddSNMPUserReq;
import com.cisco.axl.api._10.AddSNMPUserRes;
import com.cisco.axl.api._10.AddSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._10.AddSafForwarderReq;
import com.cisco.axl.api._10.AddSafSecurityProfileReq;
import com.cisco.axl.api._10.AddSdpTransparencyProfileReq;
import com.cisco.axl.api._10.AddServiceProfileReq;
import com.cisco.axl.api._10.AddSipDialRulesReq;
import com.cisco.axl.api._10.AddSipProfileReq;
import com.cisco.axl.api._10.AddSipRealmReq;
import com.cisco.axl.api._10.AddSipRoutePatternReq;
import com.cisco.axl.api._10.AddSipTrunkReq;
import com.cisco.axl.api._10.AddSipTrunkSecurityProfileReq;
import com.cisco.axl.api._10.AddSoftKeyTemplateReq;
import com.cisco.axl.api._10.AddSrstReq;
import com.cisco.axl.api._10.AddTimePeriodReq;
import com.cisco.axl.api._10.AddTimeScheduleReq;
import com.cisco.axl.api._10.AddTodAccessReq;
import com.cisco.axl.api._10.AddTransPatternReq;
import com.cisco.axl.api._10.AddTranscoderReq;
import com.cisco.axl.api._10.AddTransformationProfileReq;
import com.cisco.axl.api._10.AddUcServiceReq;
import com.cisco.axl.api._10.AddUnitsToGatewayReq;
import com.cisco.axl.api._10.AddUniversalDeviceTemplateReq;
import com.cisco.axl.api._10.AddUniversalLineTemplateReq;
import com.cisco.axl.api._10.AddUserGroupReq;
import com.cisco.axl.api._10.AddUserPhoneAssociationReq;
import com.cisco.axl.api._10.AddUserProfileProvisionReq;
import com.cisco.axl.api._10.AddUserReq;
import com.cisco.axl.api._10.AddVg224Req;
import com.cisco.axl.api._10.AddVohServerReq;
import com.cisco.axl.api._10.AddVoiceMailPilotReq;
import com.cisco.axl.api._10.AddVoiceMailPortReq;
import com.cisco.axl.api._10.AddVoiceMailProfileReq;
import com.cisco.axl.api._10.AddVpnGatewayReq;
import com.cisco.axl.api._10.AddVpnGroupReq;
import com.cisco.axl.api._10.AddVpnProfileReq;
import com.cisco.axl.api._10.AddWLANProfileReq;
import com.cisco.axl.api._10.AddWifiHotspotReq;
import com.cisco.axl.api._10.AddWlanProfileGroupReq;
import com.cisco.axl.api._10.ApplyDirectedCallParkReq;
import com.cisco.axl.api._10.ApplyGatewayReq;
import com.cisco.axl.api._10.ApplyLineReq;
import com.cisco.axl.api._10.ApplyResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.AssignPresenceUserReq;
import com.cisco.axl.api._10.DoAuthenticateUserReq;
import com.cisco.axl.api._10.DoAuthenticateUserRes;
import com.cisco.axl.api._10.DoChangeDNDStatusReq;
import com.cisco.axl.api._10.DoChangeDNDStatusRes;
import com.cisco.axl.api._10.DoDeviceLoginReq;
import com.cisco.axl.api._10.DoDeviceLoginRes;
import com.cisco.axl.api._10.DoDeviceLogoutReq;
import com.cisco.axl.api._10.DoDeviceLogoutRes;
import com.cisco.axl.api._10.DoDeviceResetReq;
import com.cisco.axl.api._10.DoDeviceResetRes;
import com.cisco.axl.api._10.DoLdapSyncReq;
import com.cisco.axl.api._10.DoLdapSyncRes;
import com.cisco.axl.api._10.DoUpdateRemoteClusterReq;
import com.cisco.axl.api._10.DoUpdateRemoteClusterRes;
import com.cisco.axl.api._10.ExecuteSQLQueryReq;
import com.cisco.axl.api._10.ExecuteSQLQueryRes;
import com.cisco.axl.api._10.ExecuteSQLUpdateReq;
import com.cisco.axl.api._10.ExecuteSQLUpdateRes;
import com.cisco.axl.api._10.GetAarGroupReq;
import com.cisco.axl.api._10.GetAarGroupRes;
import com.cisco.axl.api._10.GetAdvertisedPatternsReq;
import com.cisco.axl.api._10.GetAdvertisedPatternsRes;
import com.cisco.axl.api._10.GetAnnouncementReq;
import com.cisco.axl.api._10.GetAnnouncementRes;
import com.cisco.axl.api._10.GetAnnunciatorReq;
import com.cisco.axl.api._10.GetAnnunciatorRes;
import com.cisco.axl.api._10.GetAppServerInfoReq;
import com.cisco.axl.api._10.GetAppServerInfoRes;
import com.cisco.axl.api._10.GetAppUserReq;
import com.cisco.axl.api._10.GetAppUserRes;
import com.cisco.axl.api._10.GetApplicationDialRulesReq;
import com.cisco.axl.api._10.GetApplicationDialRulesRes;
import com.cisco.axl.api._10.GetApplicationServerReq;
import com.cisco.axl.api._10.GetApplicationServerRes;
import com.cisco.axl.api._10.GetApplicationUserCapfProfileReq;
import com.cisco.axl.api._10.GetApplicationUserCapfProfileRes;
import com.cisco.axl.api._10.GetAudioCodecPreferenceListReq;
import com.cisco.axl.api._10.GetAudioCodecPreferenceListRes;
import com.cisco.axl.api._10.GetBillingServerReq;
import com.cisco.axl.api._10.GetBillingServerRes;
import com.cisco.axl.api._10.GetBlockedLearnedPatternsReq;
import com.cisco.axl.api._10.GetBlockedLearnedPatternsRes;
import com.cisco.axl.api._10.GetCCAProfilesReq;
import com.cisco.axl.api._10.GetCCAProfilesRes;
import com.cisco.axl.api._10.GetCCMVersionReq;
import com.cisco.axl.api._10.GetCCMVersionRes;
import com.cisco.axl.api._10.GetCallManagerGroupReq;
import com.cisco.axl.api._10.GetCallManagerGroupRes;
import com.cisco.axl.api._10.GetCallManagerReq;
import com.cisco.axl.api._10.GetCallManagerRes;
import com.cisco.axl.api._10.GetCallParkReq;
import com.cisco.axl.api._10.GetCallParkRes;
import com.cisco.axl.api._10.GetCallPickupGroupReq;
import com.cisco.axl.api._10.GetCallPickupGroupRes;
import com.cisco.axl.api._10.GetCalledPartyTransformationPatternReq;
import com.cisco.axl.api._10.GetCalledPartyTransformationPatternRes;
import com.cisco.axl.api._10.GetCallerFilterListReq;
import com.cisco.axl.api._10.GetCallerFilterListRes;
import com.cisco.axl.api._10.GetCallingPartyTransformationPatternReq;
import com.cisco.axl.api._10.GetCallingPartyTransformationPatternRes;
import com.cisco.axl.api._10.GetCcdAdvertisingServiceReq;
import com.cisco.axl.api._10.GetCcdAdvertisingServiceRes;
import com.cisco.axl.api._10.GetCcdFeatureConfigReq;
import com.cisco.axl.api._10.GetCcdFeatureConfigRes;
import com.cisco.axl.api._10.GetCcdHostedDNGroupReq;
import com.cisco.axl.api._10.GetCcdHostedDNGroupRes;
import com.cisco.axl.api._10.GetCcdHostedDNReq;
import com.cisco.axl.api._10.GetCcdHostedDNRes;
import com.cisco.axl.api._10.GetCcdRequestingServiceReq;
import com.cisco.axl.api._10.GetCcdRequestingServiceRes;
import com.cisco.axl.api._10.GetCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._10.GetCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._10.GetCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._10.GetCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._10.GetCmcInfoReq;
import com.cisco.axl.api._10.GetCmcInfoRes;
import com.cisco.axl.api._10.GetCommonDeviceConfigReq;
import com.cisco.axl.api._10.GetCommonDeviceConfigRes;
import com.cisco.axl.api._10.GetCommonPhoneConfigReq;
import com.cisco.axl.api._10.GetCommonPhoneConfigRes;
import com.cisco.axl.api._10.GetConferenceBridgeReq;
import com.cisco.axl.api._10.GetConferenceBridgeRes;
import com.cisco.axl.api._10.GetCredentialPolicyDefaultReq;
import com.cisco.axl.api._10.GetCredentialPolicyDefaultRes;
import com.cisco.axl.api._10.GetCredentialPolicyReq;
import com.cisco.axl.api._10.GetCredentialPolicyRes;
import com.cisco.axl.api._10.GetCssReq;
import com.cisco.axl.api._10.GetCssRes;
import com.cisco.axl.api._10.GetCtiRoutePointReq;
import com.cisco.axl.api._10.GetCtiRoutePointRes;
import com.cisco.axl.api._10.GetCumaServerSecurityProfileReq;
import com.cisco.axl.api._10.GetCumaServerSecurityProfileRes;
import com.cisco.axl.api._10.GetCustomUserFieldReq;
import com.cisco.axl.api._10.GetCustomUserFieldRes;
import com.cisco.axl.api._10.GetDateTimeGroupReq;
import com.cisco.axl.api._10.GetDateTimeGroupRes;
import com.cisco.axl.api._10.GetDdiReq;
import com.cisco.axl.api._10.GetDdiRes;
import com.cisco.axl.api._10.GetDefaultDeviceProfileReq;
import com.cisco.axl.api._10.GetDefaultDeviceProfileRes;
import com.cisco.axl.api._10.GetDeviceMobilityGroupReq;
import com.cisco.axl.api._10.GetDeviceMobilityGroupRes;
import com.cisco.axl.api._10.GetDeviceMobilityReq;
import com.cisco.axl.api._10.GetDeviceMobilityRes;
import com.cisco.axl.api._10.GetDevicePoolReq;
import com.cisco.axl.api._10.GetDevicePoolRes;
import com.cisco.axl.api._10.GetDeviceProfileOptionsReq;
import com.cisco.axl.api._10.GetDeviceProfileOptionsRes;
import com.cisco.axl.api._10.GetDeviceProfileReq;
import com.cisco.axl.api._10.GetDeviceProfileRes;
import com.cisco.axl.api._10.GetDhcpServerReq;
import com.cisco.axl.api._10.GetDhcpServerRes;
import com.cisco.axl.api._10.GetDhcpSubnetReq;
import com.cisco.axl.api._10.GetDhcpSubnetRes;
import com.cisco.axl.api._10.GetDialPlanReq;
import com.cisco.axl.api._10.GetDialPlanRes;
import com.cisco.axl.api._10.GetDialPlanTagReq;
import com.cisco.axl.api._10.GetDialPlanTagRes;
import com.cisco.axl.api._10.GetDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._10.GetDirNumberAliasLookupandSyncRes;
import com.cisco.axl.api._10.GetDirectedCallParkReq;
import com.cisco.axl.api._10.GetDirectedCallParkRes;
import com.cisco.axl.api._10.GetDirectoryLookupDialRulesReq;
import com.cisco.axl.api._10.GetDirectoryLookupDialRulesRes;
import com.cisco.axl.api._10.GetEmccFeatureConfigReq;
import com.cisco.axl.api._10.GetEmccFeatureConfigRes;
import com.cisco.axl.api._10.GetEndUserCapfProfileReq;
import com.cisco.axl.api._10.GetEndUserCapfProfileRes;
import com.cisco.axl.api._10.GetEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._10.GetEnterpriseFeatureAccessConfigurationRes;
import com.cisco.axl.api._10.GetEnterprisePhoneConfigReq;
import com.cisco.axl.api._10.GetEnterprisePhoneConfigRes;
import com.cisco.axl.api._10.GetExternalCallControlProfileReq;
import com.cisco.axl.api._10.GetExternalCallControlProfileRes;
import com.cisco.axl.api._10.GetFacInfoReq;
import com.cisco.axl.api._10.GetFacInfoRes;
import com.cisco.axl.api._10.GetFallbackFeatureConfigReq;
import com.cisco.axl.api._10.GetFallbackFeatureConfigRes;
import com.cisco.axl.api._10.GetFallbackProfileReq;
import com.cisco.axl.api._10.GetFallbackProfileRes;
import com.cisco.axl.api._10.GetFeatureControlPolicyReq;
import com.cisco.axl.api._10.GetFeatureControlPolicyRes;
import com.cisco.axl.api._10.GetFeatureGroupTemplateReq;
import com.cisco.axl.api._10.GetFeatureGroupTemplateRes;
import com.cisco.axl.api._10.GetFixedMohAudioSourceReq;
import com.cisco.axl.api._10.GetFixedMohAudioSourceRes;
import com.cisco.axl.api._10.GetGatekeeperReq;
import com.cisco.axl.api._10.GetGatekeeperRes;
import com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessRes;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessBriRes;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessPriRes;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessT1Res;
import com.cisco.axl.api._10.GetGatewayReq;
import com.cisco.axl.api._10.GetGatewayRes;
import com.cisco.axl.api._10.GetGatewaySccpEndpointsReq;
import com.cisco.axl.api._10.GetGatewaySccpEndpointsRes;
import com.cisco.axl.api._10.GetGeoLocationFilterReq;
import com.cisco.axl.api._10.GetGeoLocationFilterRes;
import com.cisco.axl.api._10.GetGeoLocationPolicyReq;
import com.cisco.axl.api._10.GetGeoLocationPolicyRes;
import com.cisco.axl.api._10.GetGeoLocationReq;
import com.cisco.axl.api._10.GetGeoLocationRes;
import com.cisco.axl.api._10.GetH323GatewayReq;
import com.cisco.axl.api._10.GetH323GatewayRes;
import com.cisco.axl.api._10.GetH323PhoneReq;
import com.cisco.axl.api._10.GetH323PhoneRes;
import com.cisco.axl.api._10.GetH323TrunkReq;
import com.cisco.axl.api._10.GetH323TrunkRes;
import com.cisco.axl.api._10.GetHandoffConfigurationReq;
import com.cisco.axl.api._10.GetHandoffConfigurationRes;
import com.cisco.axl.api._10.GetHuntListReq;
import com.cisco.axl.api._10.GetHuntListRes;
import com.cisco.axl.api._10.GetHuntPilotReq;
import com.cisco.axl.api._10.GetHuntPilotRes;
import com.cisco.axl.api._10.GetIlsConfigReq;
import com.cisco.axl.api._10.GetIlsConfigRes;
import com.cisco.axl.api._10.GetImeClientReq;
import com.cisco.axl.api._10.GetImeClientRes;
import com.cisco.axl.api._10.GetImeE164TransformationReq;
import com.cisco.axl.api._10.GetImeE164TransformationRes;
import com.cisco.axl.api._10.GetImeEnrolledPatternGroupReq;
import com.cisco.axl.api._10.GetImeEnrolledPatternGroupRes;
import com.cisco.axl.api._10.GetImeEnrolledPatternReq;
import com.cisco.axl.api._10.GetImeEnrolledPatternRes;
import com.cisco.axl.api._10.GetImeExclusionNumberGroupReq;
import com.cisco.axl.api._10.GetImeExclusionNumberGroupRes;
import com.cisco.axl.api._10.GetImeExclusionNumberReq;
import com.cisco.axl.api._10.GetImeExclusionNumberRes;
import com.cisco.axl.api._10.GetImeFeatureConfigReq;
import com.cisco.axl.api._10.GetImeFeatureConfigRes;
import com.cisco.axl.api._10.GetImeFirewallReq;
import com.cisco.axl.api._10.GetImeFirewallRes;
import com.cisco.axl.api._10.GetImeLearnedRoutesReq;
import com.cisco.axl.api._10.GetImeLearnedRoutesRes;
import com.cisco.axl.api._10.GetImeRouteFilterElementReq;
import com.cisco.axl.api._10.GetImeRouteFilterElementRes;
import com.cisco.axl.api._10.GetImeRouteFilterGroupReq;
import com.cisco.axl.api._10.GetImeRouteFilterGroupRes;
import com.cisco.axl.api._10.GetImeServerReq;
import com.cisco.axl.api._10.GetImeServerRes;
import com.cisco.axl.api._10.GetImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._10.GetImportedDirectoryUriCatalogsRes;
import com.cisco.axl.api._10.GetInterClusterServiceProfileReq;
import com.cisco.axl.api._10.GetInterClusterServiceProfileRes;
import com.cisco.axl.api._10.GetIpPhoneServicesReq;
import com.cisco.axl.api._10.GetIpPhoneServicesRes;
import com.cisco.axl.api._10.GetIvrUserLocaleReq;
import com.cisco.axl.api._10.GetIvrUserLocaleRes;
import com.cisco.axl.api._10.GetLbmGroupReq;
import com.cisco.axl.api._10.GetLbmGroupRes;
import com.cisco.axl.api._10.GetLbmHubGroupReq;
import com.cisco.axl.api._10.GetLbmHubGroupRes;
import com.cisco.axl.api._10.GetLdapAuthenticationReq;
import com.cisco.axl.api._10.GetLdapAuthenticationRes;
import com.cisco.axl.api._10.GetLdapDirectoryReq;
import com.cisco.axl.api._10.GetLdapDirectoryRes;
import com.cisco.axl.api._10.GetLdapFilterReq;
import com.cisco.axl.api._10.GetLdapFilterRes;
import com.cisco.axl.api._10.GetLdapSyncCustomFieldReq;
import com.cisco.axl.api._10.GetLdapSyncCustomFieldRes;
import com.cisco.axl.api._10.GetLdapSyncStatusReq;
import com.cisco.axl.api._10.GetLdapSyncStatusRes;
import com.cisco.axl.api._10.GetLdapSystemReq;
import com.cisco.axl.api._10.GetLdapSystemRes;
import com.cisco.axl.api._10.GetLicensedUserReq;
import com.cisco.axl.api._10.GetLicensedUserRes;
import com.cisco.axl.api._10.GetLineGroupReq;
import com.cisco.axl.api._10.GetLineGroupRes;
import com.cisco.axl.api._10.GetLineOptionsReq;
import com.cisco.axl.api._10.GetLineOptionsRes;
import com.cisco.axl.api._10.GetLineReq;
import com.cisco.axl.api._10.GetLineRes;
import com.cisco.axl.api._10.GetLocalRouteGroupReq;
import com.cisco.axl.api._10.GetLocalRouteGroupRes;
import com.cisco.axl.api._10.GetLocationReq;
import com.cisco.axl.api._10.GetLocationRes;
import com.cisco.axl.api._10.GetMediaResourceGroupReq;
import com.cisco.axl.api._10.GetMediaResourceGroupRes;
import com.cisco.axl.api._10.GetMediaResourceListReq;
import com.cisco.axl.api._10.GetMediaResourceListRes;
import com.cisco.axl.api._10.GetMeetMeReq;
import com.cisco.axl.api._10.GetMeetMeRes;
import com.cisco.axl.api._10.GetMessageWaitingReq;
import com.cisco.axl.api._10.GetMessageWaitingRes;
import com.cisco.axl.api._10.GetMlppDomainReq;
import com.cisco.axl.api._10.GetMlppDomainRes;
import com.cisco.axl.api._10.GetMobileSmartClientProfileReq;
import com.cisco.axl.api._10.GetMobileSmartClientProfileRes;
import com.cisco.axl.api._10.GetMobileVoiceAccessReq;
import com.cisco.axl.api._10.GetMobileVoiceAccessRes;
import com.cisco.axl.api._10.GetMobilityProfileReq;
import com.cisco.axl.api._10.GetMobilityProfileRes;
import com.cisco.axl.api._10.GetMobilityReq;
import com.cisco.axl.api._10.GetMobilityRes;
import com.cisco.axl.api._10.GetMohAudioSourceReq;
import com.cisco.axl.api._10.GetMohAudioSourceRes;
import com.cisco.axl.api._10.GetMohServerReq;
import com.cisco.axl.api._10.GetMohServerRes;
import com.cisco.axl.api._10.GetMtpReq;
import com.cisco.axl.api._10.GetMtpRes;
import com.cisco.axl.api._10.GetNetworkAccessProfileReq;
import com.cisco.axl.api._10.GetNetworkAccessProfileRes;
import com.cisco.axl.api._10.GetNumDevicesReq;
import com.cisco.axl.api._10.GetNumDevicesResponse;
import com.cisco.axl.api._10.GetOSVersionReq;
import com.cisco.axl.api._10.GetOSVersionRes;
import com.cisco.axl.api._10.GetPageLayoutPreferencesReq;
import com.cisco.axl.api._10.GetPageLayoutPreferencesRes;
import com.cisco.axl.api._10.GetPhoneButtonTemplateReq;
import com.cisco.axl.api._10.GetPhoneButtonTemplateRes;
import com.cisco.axl.api._10.GetPhoneNtpReq;
import com.cisco.axl.api._10.GetPhoneNtpRes;
import com.cisco.axl.api._10.GetPhoneOptionsReq;
import com.cisco.axl.api._10.GetPhoneOptionsRes;
import com.cisco.axl.api._10.GetPhoneReq;
import com.cisco.axl.api._10.GetPhoneRes;
import com.cisco.axl.api._10.GetPhoneSecurityProfileReq;
import com.cisco.axl.api._10.GetPhoneSecurityProfileRes;
import com.cisco.axl.api._10.GetPhoneTypeDisplayInstanceReq;
import com.cisco.axl.api._10.GetPhoneTypeDisplayInstanceRes;
import com.cisco.axl.api._10.GetPhysicalLocationReq;
import com.cisco.axl.api._10.GetPhysicalLocationRes;
import com.cisco.axl.api._10.GetPresenceGroupReq;
import com.cisco.axl.api._10.GetPresenceGroupRes;
import com.cisco.axl.api._10.GetPresenceRedundancyGroupReq;
import com.cisco.axl.api._10.GetPresenceRedundancyGroupRes;
import com.cisco.axl.api._10.GetProcessNodeReq;
import com.cisco.axl.api._10.GetProcessNodeRes;
import com.cisco.axl.api._10.GetProcessNodeServiceReq;
import com.cisco.axl.api._10.GetProcessNodeServiceRes;
import com.cisco.axl.api._10.GetRecordingProfileReq;
import com.cisco.axl.api._10.GetRecordingProfileRes;
import com.cisco.axl.api._10.GetRegionReq;
import com.cisco.axl.api._10.GetRegionRes;
import com.cisco.axl.api._10.GetRemoteClusterReq;
import com.cisco.axl.api._10.GetRemoteClusterRes;
import com.cisco.axl.api._10.GetRemoteDestinationProfileReq;
import com.cisco.axl.api._10.GetRemoteDestinationProfileRes;
import com.cisco.axl.api._10.GetRemoteDestinationReq;
import com.cisco.axl.api._10.GetRemoteDestinationRes;
import com.cisco.axl.api._10.GetResourcePriorityNamespaceListReq;
import com.cisco.axl.api._10.GetResourcePriorityNamespaceListRes;
import com.cisco.axl.api._10.GetResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.GetResourcePriorityNamespaceRes;
import com.cisco.axl.api._10.GetRouteFilterReq;
import com.cisco.axl.api._10.GetRouteFilterRes;
import com.cisco.axl.api._10.GetRouteGroupReq;
import com.cisco.axl.api._10.GetRouteGroupRes;
import com.cisco.axl.api._10.GetRouteListReq;
import com.cisco.axl.api._10.GetRouteListRes;
import com.cisco.axl.api._10.GetRoutePartitionReq;
import com.cisco.axl.api._10.GetRoutePartitionRes;
import com.cisco.axl.api._10.GetRoutePatternReq;
import com.cisco.axl.api._10.GetRoutePatternRes;
import com.cisco.axl.api._10.GetSIPNormalizationScriptReq;
import com.cisco.axl.api._10.GetSIPNormalizationScriptRes;
import com.cisco.axl.api._10.GetSNMPCommunityStringReq;
import com.cisco.axl.api._10.GetSNMPCommunityStringRes;
import com.cisco.axl.api._10.GetSNMPMIB2ListReq;
import com.cisco.axl.api._10.GetSNMPMIB2ListRes;
import com.cisco.axl.api._10.GetSNMPUserReq;
import com.cisco.axl.api._10.GetSNMPUserRes;
import com.cisco.axl.api._10.GetSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._10.GetSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._10.GetSafForwarderReq;
import com.cisco.axl.api._10.GetSafForwarderRes;
import com.cisco.axl.api._10.GetSafSecurityProfileReq;
import com.cisco.axl.api._10.GetSafSecurityProfileRes;
import com.cisco.axl.api._10.GetSdpTransparencyProfileReq;
import com.cisco.axl.api._10.GetSdpTransparencyProfileRes;
import com.cisco.axl.api._10.GetServiceParameterReq;
import com.cisco.axl.api._10.GetServiceParameterRes;
import com.cisco.axl.api._10.GetServiceProfileReq;
import com.cisco.axl.api._10.GetServiceProfileRes;
import com.cisco.axl.api._10.GetSipDialRulesReq;
import com.cisco.axl.api._10.GetSipDialRulesRes;
import com.cisco.axl.api._10.GetSipProfileOptionsReq;
import com.cisco.axl.api._10.GetSipProfileOptionsRes;
import com.cisco.axl.api._10.GetSipProfileReq;
import com.cisco.axl.api._10.GetSipProfileRes;
import com.cisco.axl.api._10.GetSipRealmReq;
import com.cisco.axl.api._10.GetSipRealmRes;
import com.cisco.axl.api._10.GetSipRoutePatternReq;
import com.cisco.axl.api._10.GetSipRoutePatternRes;
import com.cisco.axl.api._10.GetSipTrunkReq;
import com.cisco.axl.api._10.GetSipTrunkRes;
import com.cisco.axl.api._10.GetSipTrunkSecurityProfileReq;
import com.cisco.axl.api._10.GetSipTrunkSecurityProfileRes;
import com.cisco.axl.api._10.GetSoftKeySetReq;
import com.cisco.axl.api._10.GetSoftKeySetRes;
import com.cisco.axl.api._10.GetSoftKeyTemplateReq;
import com.cisco.axl.api._10.GetSoftKeyTemplateRes;
import com.cisco.axl.api._10.GetSrstReq;
import com.cisco.axl.api._10.GetSrstRes;
import com.cisco.axl.api._10.GetSyslogConfigurationReq;
import com.cisco.axl.api._10.GetSyslogConfigurationRes;
import com.cisco.axl.api._10.GetTimePeriodReq;
import com.cisco.axl.api._10.GetTimePeriodRes;
import com.cisco.axl.api._10.GetTimeScheduleReq;
import com.cisco.axl.api._10.GetTimeScheduleRes;
import com.cisco.axl.api._10.GetTodAccessReq;
import com.cisco.axl.api._10.GetTodAccessRes;
import com.cisco.axl.api._10.GetTransPatternOptionsReq;
import com.cisco.axl.api._10.GetTransPatternOptionsRes;
import com.cisco.axl.api._10.GetTransPatternReq;
import com.cisco.axl.api._10.GetTransPatternRes;
import com.cisco.axl.api._10.GetTranscoderReq;
import com.cisco.axl.api._10.GetTranscoderRes;
import com.cisco.axl.api._10.GetTransformationProfileReq;
import com.cisco.axl.api._10.GetTransformationProfileRes;
import com.cisco.axl.api._10.GetTvsCertificateReq;
import com.cisco.axl.api._10.GetTvsCertificateRes;
import com.cisco.axl.api._10.GetUcServiceReq;
import com.cisco.axl.api._10.GetUcServiceRes;
import com.cisco.axl.api._10.GetUniversalDeviceTemplateReq;
import com.cisco.axl.api._10.GetUniversalDeviceTemplateRes;
import com.cisco.axl.api._10.GetUniversalLineTemplateReq;
import com.cisco.axl.api._10.GetUniversalLineTemplateRes;
import com.cisco.axl.api._10.GetUserGroupReq;
import com.cisco.axl.api._10.GetUserGroupRes;
import com.cisco.axl.api._10.GetUserProfileProvisionReq;
import com.cisco.axl.api._10.GetUserProfileProvisionRes;
import com.cisco.axl.api._10.GetUserReq;
import com.cisco.axl.api._10.GetUserRes;
import com.cisco.axl.api._10.GetVg224Req;
import com.cisco.axl.api._10.GetVg224Res;
import com.cisco.axl.api._10.GetVohServerReq;
import com.cisco.axl.api._10.GetVohServerRes;
import com.cisco.axl.api._10.GetVoiceMailPilotReq;
import com.cisco.axl.api._10.GetVoiceMailPilotRes;
import com.cisco.axl.api._10.GetVoiceMailPortReq;
import com.cisco.axl.api._10.GetVoiceMailPortRes;
import com.cisco.axl.api._10.GetVoiceMailProfileReq;
import com.cisco.axl.api._10.GetVoiceMailProfileRes;
import com.cisco.axl.api._10.GetVpnGatewayReq;
import com.cisco.axl.api._10.GetVpnGatewayRes;
import com.cisco.axl.api._10.GetVpnGroupReq;
import com.cisco.axl.api._10.GetVpnGroupRes;
import com.cisco.axl.api._10.GetVpnProfileReq;
import com.cisco.axl.api._10.GetVpnProfileRes;
import com.cisco.axl.api._10.GetWLANProfileReq;
import com.cisco.axl.api._10.GetWLANProfileRes;
import com.cisco.axl.api._10.GetWifiHotspotReq;
import com.cisco.axl.api._10.GetWifiHotspotRes;
import com.cisco.axl.api._10.GetWlanProfileGroupReq;
import com.cisco.axl.api._10.GetWlanProfileGroupRes;
import com.cisco.axl.api._10.ListAarGroupReq;
import com.cisco.axl.api._10.ListAarGroupRes;
import com.cisco.axl.api._10.ListAdvertisedPatternsReq;
import com.cisco.axl.api._10.ListAdvertisedPatternsRes;
import com.cisco.axl.api._10.ListAnnouncementReq;
import com.cisco.axl.api._10.ListAnnouncementRes;
import com.cisco.axl.api._10.ListAnnunciatorReq;
import com.cisco.axl.api._10.ListAnnunciatorRes;
import com.cisco.axl.api._10.ListAppUserReq;
import com.cisco.axl.api._10.ListAppUserRes;
import com.cisco.axl.api._10.ListApplicationDialRulesReq;
import com.cisco.axl.api._10.ListApplicationDialRulesRes;
import com.cisco.axl.api._10.ListApplicationServerReq;
import com.cisco.axl.api._10.ListApplicationServerRes;
import com.cisco.axl.api._10.ListApplicationUserCapfProfileReq;
import com.cisco.axl.api._10.ListApplicationUserCapfProfileRes;
import com.cisco.axl.api._10.ListAssignedPresenceServersReq;
import com.cisco.axl.api._10.ListAssignedPresenceServersRes;
import com.cisco.axl.api._10.ListAssignedPresenceUsersReq;
import com.cisco.axl.api._10.ListAssignedPresenceUsersRes;
import com.cisco.axl.api._10.ListAudioCodecPreferenceListReq;
import com.cisco.axl.api._10.ListAudioCodecPreferenceListRes;
import com.cisco.axl.api._10.ListBillingServerReq;
import com.cisco.axl.api._10.ListBillingServerRes;
import com.cisco.axl.api._10.ListBlockedLearnedPatternsReq;
import com.cisco.axl.api._10.ListBlockedLearnedPatternsRes;
import com.cisco.axl.api._10.ListCCAProfilesReq;
import com.cisco.axl.api._10.ListCCAProfilesRes;
import com.cisco.axl.api._10.ListCallManagerGroupReq;
import com.cisco.axl.api._10.ListCallManagerGroupRes;
import com.cisco.axl.api._10.ListCallManagerReq;
import com.cisco.axl.api._10.ListCallManagerRes;
import com.cisco.axl.api._10.ListCallParkReq;
import com.cisco.axl.api._10.ListCallParkRes;
import com.cisco.axl.api._10.ListCallPickupGroupReq;
import com.cisco.axl.api._10.ListCallPickupGroupRes;
import com.cisco.axl.api._10.ListCalledPartyTracingReq;
import com.cisco.axl.api._10.ListCalledPartyTracingRes;
import com.cisco.axl.api._10.ListCalledPartyTransformationPatternReq;
import com.cisco.axl.api._10.ListCalledPartyTransformationPatternRes;
import com.cisco.axl.api._10.ListCallerFilterListReq;
import com.cisco.axl.api._10.ListCallerFilterListRes;
import com.cisco.axl.api._10.ListCallingPartyTransformationPatternReq;
import com.cisco.axl.api._10.ListCallingPartyTransformationPatternRes;
import com.cisco.axl.api._10.ListCcdAdvertisingServiceReq;
import com.cisco.axl.api._10.ListCcdAdvertisingServiceRes;
import com.cisco.axl.api._10.ListCcdHostedDNGroupReq;
import com.cisco.axl.api._10.ListCcdHostedDNGroupRes;
import com.cisco.axl.api._10.ListCcdHostedDNReq;
import com.cisco.axl.api._10.ListCcdHostedDNRes;
import com.cisco.axl.api._10.ListChangeReq;
import com.cisco.axl.api._10.ListChangeRes;
import com.cisco.axl.api._10.ListCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._10.ListCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._10.ListCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._10.ListCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._10.ListCmcInfoReq;
import com.cisco.axl.api._10.ListCmcInfoRes;
import com.cisco.axl.api._10.ListCommonDeviceConfigReq;
import com.cisco.axl.api._10.ListCommonDeviceConfigRes;
import com.cisco.axl.api._10.ListCommonPhoneConfigReq;
import com.cisco.axl.api._10.ListCommonPhoneConfigRes;
import com.cisco.axl.api._10.ListConferenceBridgeReq;
import com.cisco.axl.api._10.ListConferenceBridgeRes;
import com.cisco.axl.api._10.ListCredentialPolicyReq;
import com.cisco.axl.api._10.ListCredentialPolicyRes;
import com.cisco.axl.api._10.ListCssReq;
import com.cisco.axl.api._10.ListCssRes;
import com.cisco.axl.api._10.ListCtiRoutePointReq;
import com.cisco.axl.api._10.ListCtiRoutePointRes;
import com.cisco.axl.api._10.ListCumaServerSecurityProfileReq;
import com.cisco.axl.api._10.ListCumaServerSecurityProfileRes;
import com.cisco.axl.api._10.ListCustomUserFieldReq;
import com.cisco.axl.api._10.ListCustomUserFieldRes;
import com.cisco.axl.api._10.ListDateTimeGroupReq;
import com.cisco.axl.api._10.ListDateTimeGroupRes;
import com.cisco.axl.api._10.ListDdiReq;
import com.cisco.axl.api._10.ListDdiRes;
import com.cisco.axl.api._10.ListDefaultDeviceProfileReq;
import com.cisco.axl.api._10.ListDefaultDeviceProfileRes;
import com.cisco.axl.api._10.ListDeviceMobilityGroupReq;
import com.cisco.axl.api._10.ListDeviceMobilityGroupRes;
import com.cisco.axl.api._10.ListDeviceMobilityReq;
import com.cisco.axl.api._10.ListDeviceMobilityRes;
import com.cisco.axl.api._10.ListDevicePoolReq;
import com.cisco.axl.api._10.ListDevicePoolRes;
import com.cisco.axl.api._10.ListDeviceProfileReq;
import com.cisco.axl.api._10.ListDeviceProfileRes;
import com.cisco.axl.api._10.ListDhcpServerReq;
import com.cisco.axl.api._10.ListDhcpServerRes;
import com.cisco.axl.api._10.ListDhcpSubnetReq;
import com.cisco.axl.api._10.ListDhcpSubnetRes;
import com.cisco.axl.api._10.ListDialPlanReq;
import com.cisco.axl.api._10.ListDialPlanRes;
import com.cisco.axl.api._10.ListDialPlanTagReq;
import com.cisco.axl.api._10.ListDialPlanTagRes;
import com.cisco.axl.api._10.ListDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._10.ListDirNumberAliasLookupandSyncRes;
import com.cisco.axl.api._10.ListDirectedCallParkReq;
import com.cisco.axl.api._10.ListDirectedCallParkRes;
import com.cisco.axl.api._10.ListDirectoryLookupDialRulesReq;
import com.cisco.axl.api._10.ListDirectoryLookupDialRulesRes;
import com.cisco.axl.api._10.ListEndUserCapfProfileReq;
import com.cisco.axl.api._10.ListEndUserCapfProfileRes;
import com.cisco.axl.api._10.ListEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._10.ListEnterpriseFeatureAccessConfigurationRes;
import com.cisco.axl.api._10.ListExternalCallControlProfileReq;
import com.cisco.axl.api._10.ListExternalCallControlProfileRes;
import com.cisco.axl.api._10.ListFacInfoReq;
import com.cisco.axl.api._10.ListFacInfoRes;
import com.cisco.axl.api._10.ListFallbackProfileReq;
import com.cisco.axl.api._10.ListFallbackProfileRes;
import com.cisco.axl.api._10.ListFeatureControlPolicyReq;
import com.cisco.axl.api._10.ListFeatureControlPolicyRes;
import com.cisco.axl.api._10.ListFeatureGroupTemplateReq;
import com.cisco.axl.api._10.ListFeatureGroupTemplateRes;
import com.cisco.axl.api._10.ListGatekeeperReq;
import com.cisco.axl.api._10.ListGatekeeperRes;
import com.cisco.axl.api._10.ListGatewayReq;
import com.cisco.axl.api._10.ListGatewayRes;
import com.cisco.axl.api._10.ListGeoLocationFilterReq;
import com.cisco.axl.api._10.ListGeoLocationFilterRes;
import com.cisco.axl.api._10.ListGeoLocationPolicyReq;
import com.cisco.axl.api._10.ListGeoLocationPolicyRes;
import com.cisco.axl.api._10.ListGeoLocationReq;
import com.cisco.axl.api._10.ListGeoLocationRes;
import com.cisco.axl.api._10.ListH323GatewayReq;
import com.cisco.axl.api._10.ListH323GatewayRes;
import com.cisco.axl.api._10.ListH323PhoneReq;
import com.cisco.axl.api._10.ListH323PhoneRes;
import com.cisco.axl.api._10.ListH323TrunkReq;
import com.cisco.axl.api._10.ListH323TrunkRes;
import com.cisco.axl.api._10.ListHuntListReq;
import com.cisco.axl.api._10.ListHuntListRes;
import com.cisco.axl.api._10.ListHuntPilotReq;
import com.cisco.axl.api._10.ListHuntPilotRes;
import com.cisco.axl.api._10.ListImeClientReq;
import com.cisco.axl.api._10.ListImeClientRes;
import com.cisco.axl.api._10.ListImeE164TransformationReq;
import com.cisco.axl.api._10.ListImeE164TransformationRes;
import com.cisco.axl.api._10.ListImeEnrolledPatternGroupReq;
import com.cisco.axl.api._10.ListImeEnrolledPatternGroupRes;
import com.cisco.axl.api._10.ListImeEnrolledPatternReq;
import com.cisco.axl.api._10.ListImeEnrolledPatternRes;
import com.cisco.axl.api._10.ListImeExclusionNumberGroupReq;
import com.cisco.axl.api._10.ListImeExclusionNumberGroupRes;
import com.cisco.axl.api._10.ListImeExclusionNumberReq;
import com.cisco.axl.api._10.ListImeExclusionNumberRes;
import com.cisco.axl.api._10.ListImeFirewallReq;
import com.cisco.axl.api._10.ListImeFirewallRes;
import com.cisco.axl.api._10.ListImeRouteFilterElementReq;
import com.cisco.axl.api._10.ListImeRouteFilterElementRes;
import com.cisco.axl.api._10.ListImeRouteFilterGroupReq;
import com.cisco.axl.api._10.ListImeRouteFilterGroupRes;
import com.cisco.axl.api._10.ListImeServerReq;
import com.cisco.axl.api._10.ListImeServerRes;
import com.cisco.axl.api._10.ListImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._10.ListImportedDirectoryUriCatalogsRes;
import com.cisco.axl.api._10.ListIpPhoneServicesReq;
import com.cisco.axl.api._10.ListIpPhoneServicesRes;
import com.cisco.axl.api._10.ListIvrUserLocaleReq;
import com.cisco.axl.api._10.ListIvrUserLocaleRes;
import com.cisco.axl.api._10.ListLbmGroupReq;
import com.cisco.axl.api._10.ListLbmGroupRes;
import com.cisco.axl.api._10.ListLbmHubGroupReq;
import com.cisco.axl.api._10.ListLbmHubGroupRes;
import com.cisco.axl.api._10.ListLdapDirectoryReq;
import com.cisco.axl.api._10.ListLdapDirectoryRes;
import com.cisco.axl.api._10.ListLdapFilterReq;
import com.cisco.axl.api._10.ListLdapFilterRes;
import com.cisco.axl.api._10.ListLdapSyncCustomFieldReq;
import com.cisco.axl.api._10.ListLdapSyncCustomFieldRes;
import com.cisco.axl.api._10.ListLineGroupReq;
import com.cisco.axl.api._10.ListLineGroupRes;
import com.cisco.axl.api._10.ListLineReq;
import com.cisco.axl.api._10.ListLineRes;
import com.cisco.axl.api._10.ListLocalRouteGroupReq;
import com.cisco.axl.api._10.ListLocalRouteGroupRes;
import com.cisco.axl.api._10.ListLocationReq;
import com.cisco.axl.api._10.ListLocationRes;
import com.cisco.axl.api._10.ListMediaResourceGroupReq;
import com.cisco.axl.api._10.ListMediaResourceGroupRes;
import com.cisco.axl.api._10.ListMediaResourceListReq;
import com.cisco.axl.api._10.ListMediaResourceListRes;
import com.cisco.axl.api._10.ListMeetMeReq;
import com.cisco.axl.api._10.ListMeetMeRes;
import com.cisco.axl.api._10.ListMessageWaitingReq;
import com.cisco.axl.api._10.ListMessageWaitingRes;
import com.cisco.axl.api._10.ListMlppDomainReq;
import com.cisco.axl.api._10.ListMlppDomainRes;
import com.cisco.axl.api._10.ListMobileSmartClientProfileReq;
import com.cisco.axl.api._10.ListMobileSmartClientProfileRes;
import com.cisco.axl.api._10.ListMobilityProfileReq;
import com.cisco.axl.api._10.ListMobilityProfileRes;
import com.cisco.axl.api._10.ListMohAudioSourceReq;
import com.cisco.axl.api._10.ListMohAudioSourceRes;
import com.cisco.axl.api._10.ListMohServerReq;
import com.cisco.axl.api._10.ListMohServerRes;
import com.cisco.axl.api._10.ListMtpReq;
import com.cisco.axl.api._10.ListMtpRes;
import com.cisco.axl.api._10.ListNetworkAccessProfileReq;
import com.cisco.axl.api._10.ListNetworkAccessProfileRes;
import com.cisco.axl.api._10.ListPhoneButtonTemplateReq;
import com.cisco.axl.api._10.ListPhoneButtonTemplateRes;
import com.cisco.axl.api._10.ListPhoneNtpReq;
import com.cisco.axl.api._10.ListPhoneNtpRes;
import com.cisco.axl.api._10.ListPhoneReq;
import com.cisco.axl.api._10.ListPhoneRes;
import com.cisco.axl.api._10.ListPhoneSecurityProfileReq;
import com.cisco.axl.api._10.ListPhoneSecurityProfileRes;
import com.cisco.axl.api._10.ListPhysicalLocationReq;
import com.cisco.axl.api._10.ListPhysicalLocationRes;
import com.cisco.axl.api._10.ListPresenceGroupReq;
import com.cisco.axl.api._10.ListPresenceGroupRes;
import com.cisco.axl.api._10.ListPresenceRedundancyGroupReq;
import com.cisco.axl.api._10.ListPresenceRedundancyGroupRes;
import com.cisco.axl.api._10.ListProcessNodeReq;
import com.cisco.axl.api._10.ListProcessNodeRes;
import com.cisco.axl.api._10.ListProcessNodeServiceReq;
import com.cisco.axl.api._10.ListProcessNodeServiceRes;
import com.cisco.axl.api._10.ListRecordingProfileReq;
import com.cisco.axl.api._10.ListRecordingProfileRes;
import com.cisco.axl.api._10.ListRegionReq;
import com.cisco.axl.api._10.ListRegionRes;
import com.cisco.axl.api._10.ListRemoteClusterReq;
import com.cisco.axl.api._10.ListRemoteClusterRes;
import com.cisco.axl.api._10.ListRemoteDestinationProfileReq;
import com.cisco.axl.api._10.ListRemoteDestinationProfileRes;
import com.cisco.axl.api._10.ListRemoteDestinationReq;
import com.cisco.axl.api._10.ListRemoteDestinationRes;
import com.cisco.axl.api._10.ListResourcePriorityNamespaceListReq;
import com.cisco.axl.api._10.ListResourcePriorityNamespaceListRes;
import com.cisco.axl.api._10.ListResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.ListResourcePriorityNamespaceRes;
import com.cisco.axl.api._10.ListRouteFilterReq;
import com.cisco.axl.api._10.ListRouteFilterRes;
import com.cisco.axl.api._10.ListRouteGroupReq;
import com.cisco.axl.api._10.ListRouteGroupRes;
import com.cisco.axl.api._10.ListRouteListReq;
import com.cisco.axl.api._10.ListRouteListRes;
import com.cisco.axl.api._10.ListRoutePartitionReq;
import com.cisco.axl.api._10.ListRoutePartitionRes;
import com.cisco.axl.api._10.ListRoutePatternReq;
import com.cisco.axl.api._10.ListRoutePatternRes;
import com.cisco.axl.api._10.ListRoutePlanReq;
import com.cisco.axl.api._10.ListRoutePlanRes;
import com.cisco.axl.api._10.ListSIPNormalizationScriptReq;
import com.cisco.axl.api._10.ListSIPNormalizationScriptRes;
import com.cisco.axl.api._10.ListSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._10.ListSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._10.ListSafForwarderReq;
import com.cisco.axl.api._10.ListSafForwarderRes;
import com.cisco.axl.api._10.ListSafSecurityProfileReq;
import com.cisco.axl.api._10.ListSafSecurityProfileRes;
import com.cisco.axl.api._10.ListSdpTransparencyProfileReq;
import com.cisco.axl.api._10.ListSdpTransparencyProfileRes;
import com.cisco.axl.api._10.ListServiceParameterReq;
import com.cisco.axl.api._10.ListServiceParameterRes;
import com.cisco.axl.api._10.ListServiceProfileReq;
import com.cisco.axl.api._10.ListServiceProfileRes;
import com.cisco.axl.api._10.ListSipDialRulesReq;
import com.cisco.axl.api._10.ListSipDialRulesRes;
import com.cisco.axl.api._10.ListSipProfileReq;
import com.cisco.axl.api._10.ListSipProfileRes;
import com.cisco.axl.api._10.ListSipRealmReq;
import com.cisco.axl.api._10.ListSipRealmRes;
import com.cisco.axl.api._10.ListSipRoutePatternReq;
import com.cisco.axl.api._10.ListSipRoutePatternRes;
import com.cisco.axl.api._10.ListSipTrunkReq;
import com.cisco.axl.api._10.ListSipTrunkRes;
import com.cisco.axl.api._10.ListSipTrunkSecurityProfileReq;
import com.cisco.axl.api._10.ListSipTrunkSecurityProfileRes;
import com.cisco.axl.api._10.ListSoftKeyTemplateReq;
import com.cisco.axl.api._10.ListSoftKeyTemplateRes;
import com.cisco.axl.api._10.ListSrstReq;
import com.cisco.axl.api._10.ListSrstRes;
import com.cisco.axl.api._10.ListTimePeriodReq;
import com.cisco.axl.api._10.ListTimePeriodRes;
import com.cisco.axl.api._10.ListTimeScheduleReq;
import com.cisco.axl.api._10.ListTimeScheduleRes;
import com.cisco.axl.api._10.ListTodAccessReq;
import com.cisco.axl.api._10.ListTodAccessRes;
import com.cisco.axl.api._10.ListTransPatternReq;
import com.cisco.axl.api._10.ListTransPatternRes;
import com.cisco.axl.api._10.ListTranscoderReq;
import com.cisco.axl.api._10.ListTranscoderRes;
import com.cisco.axl.api._10.ListTransformationProfileReq;
import com.cisco.axl.api._10.ListTransformationProfileRes;
import com.cisco.axl.api._10.ListTvsCertificateReq;
import com.cisco.axl.api._10.ListTvsCertificateRes;
import com.cisco.axl.api._10.ListUcServiceReq;
import com.cisco.axl.api._10.ListUcServiceRes;
import com.cisco.axl.api._10.ListUnassignedPresenceServersReq;
import com.cisco.axl.api._10.ListUnassignedPresenceServersRes;
import com.cisco.axl.api._10.ListUnassignedPresenceUsersReq;
import com.cisco.axl.api._10.ListUnassignedPresenceUsersRes;
import com.cisco.axl.api._10.ListUniversalDeviceTemplateReq;
import com.cisco.axl.api._10.ListUniversalDeviceTemplateRes;
import com.cisco.axl.api._10.ListUniversalLineTemplateReq;
import com.cisco.axl.api._10.ListUniversalLineTemplateRes;
import com.cisco.axl.api._10.ListUserGroupReq;
import com.cisco.axl.api._10.ListUserGroupRes;
import com.cisco.axl.api._10.ListUserProfileProvisionReq;
import com.cisco.axl.api._10.ListUserProfileProvisionRes;
import com.cisco.axl.api._10.ListUserReq;
import com.cisco.axl.api._10.ListUserRes;
import com.cisco.axl.api._10.ListVohServerReq;
import com.cisco.axl.api._10.ListVohServerRes;
import com.cisco.axl.api._10.ListVoiceMailPilotReq;
import com.cisco.axl.api._10.ListVoiceMailPilotRes;
import com.cisco.axl.api._10.ListVoiceMailPortReq;
import com.cisco.axl.api._10.ListVoiceMailPortRes;
import com.cisco.axl.api._10.ListVoiceMailProfileReq;
import com.cisco.axl.api._10.ListVoiceMailProfileRes;
import com.cisco.axl.api._10.ListVpnGatewayReq;
import com.cisco.axl.api._10.ListVpnGatewayRes;
import com.cisco.axl.api._10.ListVpnGroupReq;
import com.cisco.axl.api._10.ListVpnGroupRes;
import com.cisco.axl.api._10.ListVpnProfileReq;
import com.cisco.axl.api._10.ListVpnProfileRes;
import com.cisco.axl.api._10.ListWLANProfileReq;
import com.cisco.axl.api._10.ListWLANProfileRes;
import com.cisco.axl.api._10.ListWifiHotspotReq;
import com.cisco.axl.api._10.ListWifiHotspotRes;
import com.cisco.axl.api._10.ListWlanProfileGroupReq;
import com.cisco.axl.api._10.ListWlanProfileGroupRes;
import com.cisco.axl.api._10.NameAndGUIDRequest;
import com.cisco.axl.api._10.ObjectFactory;
import com.cisco.axl.api._10.RemoveAdvertisedPatternsReq;
import com.cisco.axl.api._10.RemoveAppServerInfoReq;
import com.cisco.axl.api._10.RemoveAppUserReq;
import com.cisco.axl.api._10.RemoveApplicationServerReq;
import com.cisco.axl.api._10.RemoveApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._10.RemoveApplicationUserCapfProfileReq;
import com.cisco.axl.api._10.RemoveBillingServerReq;
import com.cisco.axl.api._10.RemoveBlockedLearnedPatternsReq;
import com.cisco.axl.api._10.RemoveCCAProfilesReq;
import com.cisco.axl.api._10.RemoveCallParkReq;
import com.cisco.axl.api._10.RemoveCallPickupGroupReq;
import com.cisco.axl.api._10.RemoveCalledPartyTracingReq;
import com.cisco.axl.api._10.RemoveCalledPartyTransformationPatternReq;
import com.cisco.axl.api._10.RemoveCallingPartyTransformationPatternReq;
import com.cisco.axl.api._10.RemoveCcdHostedDNReq;
import com.cisco.axl.api._10.RemoveCmcInfoReq;
import com.cisco.axl.api._10.RemoveCustomUserFieldReq;
import com.cisco.axl.api._10.RemoveDhcpServerReq;
import com.cisco.axl.api._10.RemoveDhcpSubnetReq;
import com.cisco.axl.api._10.RemoveDirectedCallParkReq;
import com.cisco.axl.api._10.RemoveEndUserCapfProfileReq;
import com.cisco.axl.api._10.RemoveEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._10.RemoveGatewayReq;
import com.cisco.axl.api._10.RemoveGatewaySubunitsReq;
import com.cisco.axl.api._10.RemoveHandoffConfigurationReq;
import com.cisco.axl.api._10.RemoveHuntPilotReq;
import com.cisco.axl.api._10.RemoveImeEnrolledPatternReq;
import com.cisco.axl.api._10.RemoveImeExclusionNumberReq;
import com.cisco.axl.api._10.RemoveImeLearnedRoutesReq;
import com.cisco.axl.api._10.RemoveIpPhoneServicesReq;
import com.cisco.axl.api._10.RemoveIvrUserLocaleReq;
import com.cisco.axl.api._10.RemoveLdapSyncCustomFieldReq;
import com.cisco.axl.api._10.RemoveLineReq;
import com.cisco.axl.api._10.RemoveLocalRouteGroupReq;
import com.cisco.axl.api._10.RemoveMeetMeReq;
import com.cisco.axl.api._10.RemoveMessageWaitingReq;
import com.cisco.axl.api._10.RemoveMlppDomainReq;
import com.cisco.axl.api._10.RemoveMobileVoiceAccessReq;
import com.cisco.axl.api._10.RemoveMohAudioSourceReq;
import com.cisco.axl.api._10.RemovePhoneNtpReq;
import com.cisco.axl.api._10.RemoveRemoteClusterReq;
import com.cisco.axl.api._10.RemoveRemoteDestinationReq;
import com.cisco.axl.api._10.RemoveResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.RemoveRoutePatternReq;
import com.cisco.axl.api._10.RemoveSNMPCommunityStringReq;
import com.cisco.axl.api._10.RemoveSNMPCommunityStringRes;
import com.cisco.axl.api._10.RemoveSNMPUserReq;
import com.cisco.axl.api._10.RemoveSNMPUserRes;
import com.cisco.axl.api._10.RemoveSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._10.RemoveSipRealmReq;
import com.cisco.axl.api._10.RemoveSipRoutePatternReq;
import com.cisco.axl.api._10.RemoveTransPatternReq;
import com.cisco.axl.api._10.RemoveUnitsToGatewayReq;
import com.cisco.axl.api._10.RemoveUserReq;
import com.cisco.axl.api._10.RemoveVg224Req;
import com.cisco.axl.api._10.RemoveVoiceMailPilotReq;
import com.cisco.axl.api._10.ResetDirectedCallParkReq;
import com.cisco.axl.api._10.ResetGatewayReq;
import com.cisco.axl.api._10.ResetLineReq;
import com.cisco.axl.api._10.ResetResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.RestartLineReq;
import com.cisco.axl.api._10.RestartResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.StandardResponse;
import com.cisco.axl.api._10.UnassignPresenceUserReq;
import com.cisco.axl.api._10.UpdateAarGroupMatrixReq;
import com.cisco.axl.api._10.UpdateAarGroupReq;
import com.cisco.axl.api._10.UpdateAdvertisedPatternsReq;
import com.cisco.axl.api._10.UpdateAnnouncementReq;
import com.cisco.axl.api._10.UpdateAnnunciatorReq;
import com.cisco.axl.api._10.UpdateAppServerInfoReq;
import com.cisco.axl.api._10.UpdateAppUserReq;
import com.cisco.axl.api._10.UpdateApplicationDialRulesReq;
import com.cisco.axl.api._10.UpdateApplicationServerReq;
import com.cisco.axl.api._10.UpdateApplicationUserCapfProfileReq;
import com.cisco.axl.api._10.UpdateAudioCodecPreferenceListReq;
import com.cisco.axl.api._10.UpdateBillingServerReq;
import com.cisco.axl.api._10.UpdateBlockedLearnedPatternsReq;
import com.cisco.axl.api._10.UpdateCCAProfilesReq;
import com.cisco.axl.api._10.UpdateCallManagerGroupReq;
import com.cisco.axl.api._10.UpdateCallManagerReq;
import com.cisco.axl.api._10.UpdateCallParkReq;
import com.cisco.axl.api._10.UpdateCallPickupGroupReq;
import com.cisco.axl.api._10.UpdateCalledPartyTransformationPatternReq;
import com.cisco.axl.api._10.UpdateCallerFilterListReq;
import com.cisco.axl.api._10.UpdateCallingPartyTransformationPatternReq;
import com.cisco.axl.api._10.UpdateCcdAdvertisingServiceReq;
import com.cisco.axl.api._10.UpdateCcdFeatureConfigReq;
import com.cisco.axl.api._10.UpdateCcdFeatureConfigRes;
import com.cisco.axl.api._10.UpdateCcdHostedDNGroupReq;
import com.cisco.axl.api._10.UpdateCcdHostedDNReq;
import com.cisco.axl.api._10.UpdateCcdRequestingServiceReq;
import com.cisco.axl.api._10.UpdateCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._10.UpdateCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._10.UpdateCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._10.UpdateCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._10.UpdateCmcInfoReq;
import com.cisco.axl.api._10.UpdateCommonDeviceConfigReq;
import com.cisco.axl.api._10.UpdateCommonPhoneConfigReq;
import com.cisco.axl.api._10.UpdateConferenceBridgeReq;
import com.cisco.axl.api._10.UpdateCredentialPolicyDefaultReq;
import com.cisco.axl.api._10.UpdateCredentialPolicyReq;
import com.cisco.axl.api._10.UpdateCssReq;
import com.cisco.axl.api._10.UpdateCtiRoutePointReq;
import com.cisco.axl.api._10.UpdateCumaServerSecurityProfileReq;
import com.cisco.axl.api._10.UpdateCustomUserFieldReq;
import com.cisco.axl.api._10.UpdateDateTimeGroupReq;
import com.cisco.axl.api._10.UpdateDefaultDeviceProfileReq;
import com.cisco.axl.api._10.UpdateDeviceMobilityGroupReq;
import com.cisco.axl.api._10.UpdateDeviceMobilityReq;
import com.cisco.axl.api._10.UpdateDevicePoolReq;
import com.cisco.axl.api._10.UpdateDeviceProfileReq;
import com.cisco.axl.api._10.UpdateDhcpServerReq;
import com.cisco.axl.api._10.UpdateDhcpSubnetReq;
import com.cisco.axl.api._10.UpdateDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._10.UpdateDirectedCallParkReq;
import com.cisco.axl.api._10.UpdateDirectoryLookupDialRulesReq;
import com.cisco.axl.api._10.UpdateEmccFeatureConfigReq;
import com.cisco.axl.api._10.UpdateEndUserCapfProfileReq;
import com.cisco.axl.api._10.UpdateEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._10.UpdateEnterprisePhoneConfigReq;
import com.cisco.axl.api._10.UpdateExternalCallControlProfileReq;
import com.cisco.axl.api._10.UpdateFacInfoReq;
import com.cisco.axl.api._10.UpdateFallbackFeatureConfigReq;
import com.cisco.axl.api._10.UpdateFallbackProfileReq;
import com.cisco.axl.api._10.UpdateFeatureControlPolicyReq;
import com.cisco.axl.api._10.UpdateFeatureGroupTemplateReq;
import com.cisco.axl.api._10.UpdateFixedMohAudioSourceReq;
import com.cisco.axl.api._10.UpdateGatekeeperReq;
import com.cisco.axl.api._10.UpdateGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._10.UpdateGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._10.UpdateGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._10.UpdateGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._10.UpdateGatewayReq;
import com.cisco.axl.api._10.UpdateGatewaySccpEndpointsReq;
import com.cisco.axl.api._10.UpdateGeoLocationFilterReq;
import com.cisco.axl.api._10.UpdateGeoLocationPolicyReq;
import com.cisco.axl.api._10.UpdateGeoLocationReq;
import com.cisco.axl.api._10.UpdateH323GatewayReq;
import com.cisco.axl.api._10.UpdateH323PhoneReq;
import com.cisco.axl.api._10.UpdateH323TrunkReq;
import com.cisco.axl.api._10.UpdateHandoffConfigurationReq;
import com.cisco.axl.api._10.UpdateHuntListReq;
import com.cisco.axl.api._10.UpdateHuntPilotReq;
import com.cisco.axl.api._10.UpdateIlsConfigReq;
import com.cisco.axl.api._10.UpdateImeClientReq;
import com.cisco.axl.api._10.UpdateImeE164TransformationReq;
import com.cisco.axl.api._10.UpdateImeEnrolledPatternGroupReq;
import com.cisco.axl.api._10.UpdateImeEnrolledPatternReq;
import com.cisco.axl.api._10.UpdateImeExclusionNumberGroupReq;
import com.cisco.axl.api._10.UpdateImeExclusionNumberReq;
import com.cisco.axl.api._10.UpdateImeFeatureConfigReq;
import com.cisco.axl.api._10.UpdateImeFirewallReq;
import com.cisco.axl.api._10.UpdateImeLearnedRoutesReq;
import com.cisco.axl.api._10.UpdateImeRouteFilterElementReq;
import com.cisco.axl.api._10.UpdateImeRouteFilterGroupReq;
import com.cisco.axl.api._10.UpdateImeServerReq;
import com.cisco.axl.api._10.UpdateImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._10.UpdateInterClusterDirectoryUriReq;
import com.cisco.axl.api._10.UpdateInterClusterServiceProfileReq;
import com.cisco.axl.api._10.UpdateIpPhoneServicesReq;
import com.cisco.axl.api._10.UpdateIvrUserLocaleReq;
import com.cisco.axl.api._10.UpdateLbmGroupReq;
import com.cisco.axl.api._10.UpdateLbmHubGroupReq;
import com.cisco.axl.api._10.UpdateLdapAuthenticationReq;
import com.cisco.axl.api._10.UpdateLdapDirectoryReq;
import com.cisco.axl.api._10.UpdateLdapFilterReq;
import com.cisco.axl.api._10.UpdateLdapSyncCustomFieldReq;
import com.cisco.axl.api._10.UpdateLdapSystemReq;
import com.cisco.axl.api._10.UpdateLineGroupReq;
import com.cisco.axl.api._10.UpdateLineReq;
import com.cisco.axl.api._10.UpdateLocalRouteGroupReq;
import com.cisco.axl.api._10.UpdateLocationReq;
import com.cisco.axl.api._10.UpdateMediaResourceGroupReq;
import com.cisco.axl.api._10.UpdateMediaResourceListReq;
import com.cisco.axl.api._10.UpdateMeetMeReq;
import com.cisco.axl.api._10.UpdateMessageWaitingReq;
import com.cisco.axl.api._10.UpdateMlppDomainReq;
import com.cisco.axl.api._10.UpdateMobileVoiceAccessReq;
import com.cisco.axl.api._10.UpdateMobilityProfileReq;
import com.cisco.axl.api._10.UpdateMobilityReq;
import com.cisco.axl.api._10.UpdateMohAudioSourceReq;
import com.cisco.axl.api._10.UpdateMohServerReq;
import com.cisco.axl.api._10.UpdateMtpReq;
import com.cisco.axl.api._10.UpdateNetworkAccessProfileReq;
import com.cisco.axl.api._10.UpdatePageLayoutPreferencesReq;
import com.cisco.axl.api._10.UpdatePhoneButtonTemplateReq;
import com.cisco.axl.api._10.UpdatePhoneNtpReq;
import com.cisco.axl.api._10.UpdatePhoneReq;
import com.cisco.axl.api._10.UpdatePhoneSecurityProfileReq;
import com.cisco.axl.api._10.UpdatePhysicalLocationReq;
import com.cisco.axl.api._10.UpdatePresenceGroupReq;
import com.cisco.axl.api._10.UpdatePresenceRedundancyGroupReq;
import com.cisco.axl.api._10.UpdateProcessNodeReq;
import com.cisco.axl.api._10.UpdateProcessNodeServiceReq;
import com.cisco.axl.api._10.UpdateRecordingProfileReq;
import com.cisco.axl.api._10.UpdateRegionMatrixReq;
import com.cisco.axl.api._10.UpdateRegionReq;
import com.cisco.axl.api._10.UpdateRemoteClusterReq;
import com.cisco.axl.api._10.UpdateRemoteDestinationProfileReq;
import com.cisco.axl.api._10.UpdateRemoteDestinationReq;
import com.cisco.axl.api._10.UpdateResourcePriorityNamespaceListReq;
import com.cisco.axl.api._10.UpdateResourcePriorityNamespaceReq;
import com.cisco.axl.api._10.UpdateRouteFilterReq;
import com.cisco.axl.api._10.UpdateRouteGroupReq;
import com.cisco.axl.api._10.UpdateRouteListReq;
import com.cisco.axl.api._10.UpdateRoutePartitionReq;
import com.cisco.axl.api._10.UpdateRoutePartitionsForLearnedPatternsReq;
import com.cisco.axl.api._10.UpdateRoutePatternReq;
import com.cisco.axl.api._10.UpdateSIPNormalizationScriptReq;
import com.cisco.axl.api._10.UpdateSNMPCommunityStringReq;
import com.cisco.axl.api._10.UpdateSNMPCommunityStringRes;
import com.cisco.axl.api._10.UpdateSNMPMIB2ListReq;
import com.cisco.axl.api._10.UpdateSNMPMIB2ListRes;
import com.cisco.axl.api._10.UpdateSNMPUserReq;
import com.cisco.axl.api._10.UpdateSNMPUserRes;
import com.cisco.axl.api._10.UpdateSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._10.UpdateSafForwarderReq;
import com.cisco.axl.api._10.UpdateSafSecurityProfileReq;
import com.cisco.axl.api._10.UpdateSdpTransparencyProfileReq;
import com.cisco.axl.api._10.UpdateSelfProvisioningReq;
import com.cisco.axl.api._10.UpdateServiceParameterReq;
import com.cisco.axl.api._10.UpdateServiceProfileReq;
import com.cisco.axl.api._10.UpdateSipDialRulesReq;
import com.cisco.axl.api._10.UpdateSipProfileReq;
import com.cisco.axl.api._10.UpdateSipRealmReq;
import com.cisco.axl.api._10.UpdateSipRoutePatternReq;
import com.cisco.axl.api._10.UpdateSipTrunkReq;
import com.cisco.axl.api._10.UpdateSipTrunkSecurityProfileReq;
import com.cisco.axl.api._10.UpdateSoftKeySetReq;
import com.cisco.axl.api._10.UpdateSoftKeyTemplateReq;
import com.cisco.axl.api._10.UpdateSrstReq;
import com.cisco.axl.api._10.UpdateSyslogConfigurationReq;
import com.cisco.axl.api._10.UpdateSyslogConfigurationRes;
import com.cisco.axl.api._10.UpdateTimePeriodReq;
import com.cisco.axl.api._10.UpdateTimeScheduleReq;
import com.cisco.axl.api._10.UpdateTodAccessReq;
import com.cisco.axl.api._10.UpdateTransPatternReq;
import com.cisco.axl.api._10.UpdateTranscoderReq;
import com.cisco.axl.api._10.UpdateTransformationProfileReq;
import com.cisco.axl.api._10.UpdateTvsCertificateReq;
import com.cisco.axl.api._10.UpdateUcServiceReq;
import com.cisco.axl.api._10.UpdateUniversalDeviceTemplateReq;
import com.cisco.axl.api._10.UpdateUniversalLineTemplateReq;
import com.cisco.axl.api._10.UpdateUserGroupReq;
import com.cisco.axl.api._10.UpdateUserProfileProvisionReq;
import com.cisco.axl.api._10.UpdateUserReq;
import com.cisco.axl.api._10.UpdateVg224Req;
import com.cisco.axl.api._10.UpdateVohServerReq;
import com.cisco.axl.api._10.UpdateVoiceMailPilotReq;
import com.cisco.axl.api._10.UpdateVoiceMailPortReq;
import com.cisco.axl.api._10.UpdateVoiceMailProfileReq;
import com.cisco.axl.api._10.UpdateVpnGatewayReq;
import com.cisco.axl.api._10.UpdateVpnGroupReq;
import com.cisco.axl.api._10.UpdateVpnProfileReq;
import com.cisco.axl.api._10.UpdateWLANProfileReq;
import com.cisco.axl.api._10.UpdateWifiHotspotReq;
import com.cisco.axl.api._10.UpdateWlanProfileGroupReq;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AXLPort", targetNamespace = "http://www.cisco.com/AXLAPIService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AXLPort {


    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipProfile")
    @WebResult(name = "addSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipProfile(
        @WebParam(name = "addSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipProfile")
    @WebResult(name = "updateSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipProfile(
        @WebParam(name = "updateSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipProfile")
    @WebResult(name = "getSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipProfileRes getSipProfile(
        @WebParam(name = "getSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipProfile")
    @WebResult(name = "removeSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipProfile(
        @WebParam(name = "removeSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipProfile")
    @WebResult(name = "listSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipProfileRes listSipProfile(
        @WebParam(name = "listSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartSipProfile")
    @WebResult(name = "restartSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartSipProfile(
        @WebParam(name = "restartSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applySipProfile")
    @WebResult(name = "applySipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applySipProfile(
        @WebParam(name = "applySipProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipProfileOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipProfileOptions")
    @WebResult(name = "getSipProfileOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipProfileOptionsRes getSipProfileOptions(
        @WebParam(name = "getSipProfileOptions", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipProfileOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipTrunkSecurityProfile")
    @WebResult(name = "addSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipTrunkSecurityProfile(
        @WebParam(name = "addSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipTrunkSecurityProfile")
    @WebResult(name = "updateSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipTrunkSecurityProfile(
        @WebParam(name = "updateSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipTrunkSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipTrunkSecurityProfile")
    @WebResult(name = "getSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipTrunkSecurityProfileRes getSipTrunkSecurityProfile(
        @WebParam(name = "getSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipTrunkSecurityProfile")
    @WebResult(name = "removeSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipTrunkSecurityProfile(
        @WebParam(name = "removeSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipTrunkSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipTrunkSecurityProfile")
    @WebResult(name = "listSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipTrunkSecurityProfileRes listSipTrunkSecurityProfile(
        @WebParam(name = "listSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetSipTrunkSecurityProfile")
    @WebResult(name = "resetSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetSipTrunkSecurityProfile(
        @WebParam(name = "resetSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applySipTrunkSecurityProfile")
    @WebResult(name = "applySipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applySipTrunkSecurityProfile(
        @WebParam(name = "applySipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTimePeriod")
    @WebResult(name = "addTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTimePeriod(
        @WebParam(name = "addTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTimePeriod")
    @WebResult(name = "updateTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTimePeriod(
        @WebParam(name = "updateTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTimePeriodRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTimePeriod")
    @WebResult(name = "getTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTimePeriodRes getTimePeriod(
        @WebParam(name = "getTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTimePeriod")
    @WebResult(name = "removeTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTimePeriod(
        @WebParam(name = "removeTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTimePeriodRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTimePeriod")
    @WebResult(name = "listTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTimePeriodRes listTimePeriod(
        @WebParam(name = "listTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTimeSchedule")
    @WebResult(name = "addTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTimeSchedule(
        @WebParam(name = "addTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTimeSchedule")
    @WebResult(name = "updateTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTimeSchedule(
        @WebParam(name = "updateTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTimeScheduleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTimeSchedule")
    @WebResult(name = "getTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTimeScheduleRes getTimeSchedule(
        @WebParam(name = "getTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTimeSchedule")
    @WebResult(name = "removeTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTimeSchedule(
        @WebParam(name = "removeTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTimeScheduleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTimeSchedule")
    @WebResult(name = "listTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTimeScheduleRes listTimeSchedule(
        @WebParam(name = "listTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTodAccess")
    @WebResult(name = "addTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTodAccess(
        @WebParam(name = "addTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTodAccess")
    @WebResult(name = "updateTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTodAccess(
        @WebParam(name = "updateTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTodAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTodAccess")
    @WebResult(name = "getTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTodAccessRes getTodAccess(
        @WebParam(name = "getTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTodAccess")
    @WebResult(name = "removeTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTodAccess(
        @WebParam(name = "removeTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTodAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTodAccess")
    @WebResult(name = "listTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTodAccessRes listTodAccess(
        @WebParam(name = "listTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVoiceMailPilot")
    @WebResult(name = "addVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVoiceMailPilot(
        @WebParam(name = "addVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVoiceMailPilot")
    @WebResult(name = "updateVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVoiceMailPilot(
        @WebParam(name = "updateVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVoiceMailPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVoiceMailPilot")
    @WebResult(name = "getVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVoiceMailPilotRes getVoiceMailPilot(
        @WebParam(name = "getVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVoiceMailPilot")
    @WebResult(name = "removeVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVoiceMailPilot(
        @WebParam(name = "removeVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVoiceMailPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVoiceMailPilot")
    @WebResult(name = "listVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVoiceMailPilotRes listVoiceMailPilot(
        @WebParam(name = "listVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addProcessNode")
    @WebResult(name = "addProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addProcessNode(
        @WebParam(name = "addProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateProcessNode")
    @WebResult(name = "updateProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateProcessNode(
        @WebParam(name = "updateProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetProcessNodeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getProcessNode")
    @WebResult(name = "getProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetProcessNodeRes getProcessNode(
        @WebParam(name = "getProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeProcessNode")
    @WebResult(name = "removeProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeProcessNode(
        @WebParam(name = "removeProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListProcessNodeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listProcessNode")
    @WebResult(name = "listProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListProcessNodeRes listProcessNode(
        @WebParam(name = "listProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCallerFilterList")
    @WebResult(name = "addCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCallerFilterList(
        @WebParam(name = "addCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallerFilterList")
    @WebResult(name = "updateCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallerFilterList(
        @WebParam(name = "updateCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallerFilterListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallerFilterList")
    @WebResult(name = "getCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallerFilterListRes getCallerFilterList(
        @WebParam(name = "getCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCallerFilterList")
    @WebResult(name = "removeCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCallerFilterList(
        @WebParam(name = "removeCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallerFilterListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallerFilterList")
    @WebResult(name = "listCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallerFilterListRes listCallerFilterList(
        @WebParam(name = "listCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRoutePartition")
    @WebResult(name = "addRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRoutePartition(
        @WebParam(name = "addRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRoutePartition")
    @WebResult(name = "updateRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRoutePartition(
        @WebParam(name = "updateRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRoutePartitionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRoutePartition")
    @WebResult(name = "getRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRoutePartitionRes getRoutePartition(
        @WebParam(name = "getRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRoutePartition")
    @WebResult(name = "removeRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRoutePartition(
        @WebParam(name = "removeRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRoutePartitionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRoutePartition")
    @WebResult(name = "listRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRoutePartitionRes listRoutePartition(
        @WebParam(name = "listRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartRoutePartition")
    @WebResult(name = "restartRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartRoutePartition(
        @WebParam(name = "restartRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyRoutePartition")
    @WebResult(name = "applyRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyRoutePartition(
        @WebParam(name = "applyRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCss")
    @WebResult(name = "addCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCss(
        @WebParam(name = "addCss", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCss")
    @WebResult(name = "updateCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCss(
        @WebParam(name = "updateCss", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCssRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCss")
    @WebResult(name = "getCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCssRes getCss(
        @WebParam(name = "getCss", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCss")
    @WebResult(name = "removeCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCss(
        @WebParam(name = "removeCss", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCssRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCss")
    @WebResult(name = "listCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCssRes listCss(
        @WebParam(name = "listCss", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallManager")
    @WebResult(name = "updateCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallManager(
        @WebParam(name = "updateCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallManagerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallManager")
    @WebResult(name = "getCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallManagerRes getCallManager(
        @WebParam(name = "getCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallManagerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallManager")
    @WebResult(name = "listCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallManagerRes listCallManager(
        @WebParam(name = "listCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCallManager")
    @WebResult(name = "resetCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCallManager(
        @WebParam(name = "resetCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCallManager")
    @WebResult(name = "restartCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCallManager(
        @WebParam(name = "restartCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCallManager")
    @WebResult(name = "applyCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCallManager(
        @WebParam(name = "applyCallManager", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMediaResourceGroup")
    @WebResult(name = "addMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMediaResourceGroup(
        @WebParam(name = "addMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMediaResourceGroup")
    @WebResult(name = "updateMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMediaResourceGroup(
        @WebParam(name = "updateMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMediaResourceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMediaResourceGroup")
    @WebResult(name = "getMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMediaResourceGroupRes getMediaResourceGroup(
        @WebParam(name = "getMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMediaResourceGroup")
    @WebResult(name = "removeMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMediaResourceGroup(
        @WebParam(name = "removeMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMediaResourceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMediaResourceGroup")
    @WebResult(name = "listMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMediaResourceGroupRes listMediaResourceGroup(
        @WebParam(name = "listMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMediaResourceList")
    @WebResult(name = "addMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMediaResourceList(
        @WebParam(name = "addMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMediaResourceList")
    @WebResult(name = "updateMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMediaResourceList(
        @WebParam(name = "updateMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMediaResourceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMediaResourceList")
    @WebResult(name = "getMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMediaResourceListRes getMediaResourceList(
        @WebParam(name = "getMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMediaResourceList")
    @WebResult(name = "removeMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMediaResourceList(
        @WebParam(name = "removeMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMediaResourceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMediaResourceList")
    @WebResult(name = "listMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMediaResourceListRes listMediaResourceList(
        @WebParam(name = "listMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRegion")
    @WebResult(name = "addRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRegion(
        @WebParam(name = "addRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRegion")
    @WebResult(name = "updateRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRegion(
        @WebParam(name = "updateRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRegionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRegion")
    @WebResult(name = "getRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRegionRes getRegion(
        @WebParam(name = "getRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRegion")
    @WebResult(name = "removeRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRegion(
        @WebParam(name = "removeRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRegionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRegion")
    @WebResult(name = "listRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRegionRes listRegion(
        @WebParam(name = "listRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartRegion")
    @WebResult(name = "restartRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartRegion(
        @WebParam(name = "restartRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyRegion")
    @WebResult(name = "applyRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyRegion(
        @WebParam(name = "applyRegion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAarGroup")
    @WebResult(name = "addAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAarGroup(
        @WebParam(name = "addAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAarGroup")
    @WebResult(name = "updateAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAarGroup(
        @WebParam(name = "updateAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAarGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAarGroup")
    @WebResult(name = "getAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAarGroupRes getAarGroup(
        @WebParam(name = "getAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAarGroup")
    @WebResult(name = "removeAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAarGroup(
        @WebParam(name = "removeAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAarGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAarGroup")
    @WebResult(name = "listAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAarGroupRes listAarGroup(
        @WebParam(name = "listAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPhysicalLocation")
    @WebResult(name = "addPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPhysicalLocation(
        @WebParam(name = "addPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePhysicalLocation")
    @WebResult(name = "updatePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePhysicalLocation(
        @WebParam(name = "updatePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhysicalLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhysicalLocation")
    @WebResult(name = "getPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhysicalLocationRes getPhysicalLocation(
        @WebParam(name = "getPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePhysicalLocation")
    @WebResult(name = "removePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePhysicalLocation(
        @WebParam(name = "removePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPhysicalLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPhysicalLocation")
    @WebResult(name = "listPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPhysicalLocationRes listPhysicalLocation(
        @WebParam(name = "listPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRouteGroup")
    @WebResult(name = "addRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRouteGroup(
        @WebParam(name = "addRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRouteGroup")
    @WebResult(name = "updateRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRouteGroup(
        @WebParam(name = "updateRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRouteGroup")
    @WebResult(name = "getRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRouteGroupRes getRouteGroup(
        @WebParam(name = "getRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRouteGroup")
    @WebResult(name = "removeRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRouteGroup(
        @WebParam(name = "removeRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRouteGroup")
    @WebResult(name = "listRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRouteGroupRes listRouteGroup(
        @WebParam(name = "listRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDevicePool")
    @WebResult(name = "addDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDevicePool(
        @WebParam(name = "addDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDevicePool")
    @WebResult(name = "updateDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDevicePool(
        @WebParam(name = "updateDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDevicePoolRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDevicePool")
    @WebResult(name = "getDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDevicePoolRes getDevicePool(
        @WebParam(name = "getDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDevicePool")
    @WebResult(name = "removeDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDevicePool(
        @WebParam(name = "removeDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDevicePoolRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDevicePool")
    @WebResult(name = "listDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDevicePoolRes listDevicePool(
        @WebParam(name = "listDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetDevicePool")
    @WebResult(name = "resetDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetDevicePool(
        @WebParam(name = "resetDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartDevicePool")
    @WebResult(name = "restartDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartDevicePool(
        @WebParam(name = "restartDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyDevicePool")
    @WebResult(name = "applyDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyDevicePool(
        @WebParam(name = "applyDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDeviceMobilityGroup")
    @WebResult(name = "addDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDeviceMobilityGroup(
        @WebParam(name = "addDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDeviceMobilityGroup")
    @WebResult(name = "updateDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDeviceMobilityGroup(
        @WebParam(name = "updateDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDeviceMobilityGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDeviceMobilityGroup")
    @WebResult(name = "getDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDeviceMobilityGroupRes getDeviceMobilityGroup(
        @WebParam(name = "getDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDeviceMobilityGroup")
    @WebResult(name = "removeDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDeviceMobilityGroup(
        @WebParam(name = "removeDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDeviceMobilityGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDeviceMobilityGroup")
    @WebResult(name = "listDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDeviceMobilityGroupRes listDeviceMobilityGroup(
        @WebParam(name = "listDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLocation")
    @WebResult(name = "addLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLocation(
        @WebParam(name = "addLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLocation")
    @WebResult(name = "updateLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLocation(
        @WebParam(name = "updateLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLocation")
    @WebResult(name = "getLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLocationRes getLocation(
        @WebParam(name = "getLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLocation")
    @WebResult(name = "removeLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLocation(
        @WebParam(name = "removeLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLocation")
    @WebResult(name = "listLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLocationRes listLocation(
        @WebParam(name = "listLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSoftKeyTemplate")
    @WebResult(name = "addSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSoftKeyTemplate(
        @WebParam(name = "addSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSoftKeyTemplate")
    @WebResult(name = "updateSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSoftKeyTemplate(
        @WebParam(name = "updateSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSoftKeyTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSoftKeyTemplate")
    @WebResult(name = "getSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSoftKeyTemplateRes getSoftKeyTemplate(
        @WebParam(name = "getSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSoftKeyTemplate")
    @WebResult(name = "removeSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSoftKeyTemplate(
        @WebParam(name = "removeSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSoftKeyTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSoftKeyTemplate")
    @WebResult(name = "listSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSoftKeyTemplateRes listSoftKeyTemplate(
        @WebParam(name = "listSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartSoftKeyTemplate")
    @WebResult(name = "restartSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartSoftKeyTemplate(
        @WebParam(name = "restartSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applySoftKeyTemplate")
    @WebResult(name = "applySoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applySoftKeyTemplate(
        @WebParam(name = "applySoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTranscoder")
    @WebResult(name = "addTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTranscoder(
        @WebParam(name = "addTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTranscoder")
    @WebResult(name = "updateTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTranscoder(
        @WebParam(name = "updateTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTranscoderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTranscoder")
    @WebResult(name = "getTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTranscoderRes getTranscoder(
        @WebParam(name = "getTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTranscoder")
    @WebResult(name = "removeTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTranscoder(
        @WebParam(name = "removeTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTranscoderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTranscoder")
    @WebResult(name = "listTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTranscoderRes listTranscoder(
        @WebParam(name = "listTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetTranscoder")
    @WebResult(name = "resetTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetTranscoder(
        @WebParam(name = "resetTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyTranscoder")
    @WebResult(name = "applyTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyTranscoder(
        @WebParam(name = "applyTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCommonDeviceConfig")
    @WebResult(name = "addCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCommonDeviceConfig(
        @WebParam(name = "addCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCommonDeviceConfig")
    @WebResult(name = "updateCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCommonDeviceConfig(
        @WebParam(name = "updateCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCommonDeviceConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCommonDeviceConfig")
    @WebResult(name = "getCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCommonDeviceConfigRes getCommonDeviceConfig(
        @WebParam(name = "getCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCommonDeviceConfig")
    @WebResult(name = "removeCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCommonDeviceConfig(
        @WebParam(name = "removeCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCommonDeviceConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCommonDeviceConfig")
    @WebResult(name = "listCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCommonDeviceConfigRes listCommonDeviceConfig(
        @WebParam(name = "listCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCommonDeviceConfig")
    @WebResult(name = "resetCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCommonDeviceConfig(
        @WebParam(name = "resetCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCommonDeviceConfig")
    @WebResult(name = "applyCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCommonDeviceConfig(
        @WebParam(name = "applyCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addResourcePriorityNamespace")
    @WebResult(name = "addResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespace(
        @WebParam(name = "addResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateResourcePriorityNamespace")
    @WebResult(name = "updateResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespace(
        @WebParam(name = "updateResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetResourcePriorityNamespaceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getResourcePriorityNamespace")
    @WebResult(name = "getResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetResourcePriorityNamespaceRes getResourcePriorityNamespace(
        @WebParam(name = "getResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeResourcePriorityNamespace")
    @WebResult(name = "removeResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespace(
        @WebParam(name = "removeResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListResourcePriorityNamespaceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listResourcePriorityNamespace")
    @WebResult(name = "listResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListResourcePriorityNamespaceRes listResourcePriorityNamespace(
        @WebParam(name = "listResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetResourcePriorityNamespace")
    @WebResult(name = "resetResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetResourcePriorityNamespace(
        @WebParam(name = "resetResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ResetResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartResourcePriorityNamespace")
    @WebResult(name = "restartResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartResourcePriorityNamespace(
        @WebParam(name = "restartResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RestartResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyResourcePriorityNamespace")
    @WebResult(name = "applyResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyResourcePriorityNamespace(
        @WebParam(name = "applyResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ApplyResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addResourcePriorityNamespaceList")
    @WebResult(name = "addResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespaceList(
        @WebParam(name = "addResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateResourcePriorityNamespaceList")
    @WebResult(name = "updateResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespaceList(
        @WebParam(name = "updateResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetResourcePriorityNamespaceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getResourcePriorityNamespaceList")
    @WebResult(name = "getResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetResourcePriorityNamespaceListRes getResourcePriorityNamespaceList(
        @WebParam(name = "getResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeResourcePriorityNamespaceList")
    @WebResult(name = "removeResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespaceList(
        @WebParam(name = "removeResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListResourcePriorityNamespaceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listResourcePriorityNamespaceList")
    @WebResult(name = "listResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListResourcePriorityNamespaceListRes listResourcePriorityNamespaceList(
        @WebParam(name = "listResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetResourcePriorityNamespaceList")
    @WebResult(name = "resetResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetResourcePriorityNamespaceList(
        @WebParam(name = "resetResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartResourcePriorityNamespaceList")
    @WebResult(name = "restartResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartResourcePriorityNamespaceList(
        @WebParam(name = "restartResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyResourcePriorityNamespaceList")
    @WebResult(name = "applyResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyResourcePriorityNamespaceList(
        @WebParam(name = "applyResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDeviceMobility")
    @WebResult(name = "addDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDeviceMobility(
        @WebParam(name = "addDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDeviceMobility")
    @WebResult(name = "updateDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDeviceMobility(
        @WebParam(name = "updateDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDeviceMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDeviceMobility")
    @WebResult(name = "getDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDeviceMobilityRes getDeviceMobility(
        @WebParam(name = "getDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDeviceMobility")
    @WebResult(name = "removeDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDeviceMobility(
        @WebParam(name = "removeDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDeviceMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDeviceMobility")
    @WebResult(name = "listDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDeviceMobilityRes listDeviceMobility(
        @WebParam(name = "listDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCmcInfo")
    @WebResult(name = "addCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCmcInfo(
        @WebParam(name = "addCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCmcInfo")
    @WebResult(name = "updateCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCmcInfo(
        @WebParam(name = "updateCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCmcInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCmcInfo")
    @WebResult(name = "getCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCmcInfoRes getCmcInfo(
        @WebParam(name = "getCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCmcInfo")
    @WebResult(name = "removeCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCmcInfo(
        @WebParam(name = "removeCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCmcInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCmcInfo")
    @WebResult(name = "listCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCmcInfoRes listCmcInfo(
        @WebParam(name = "listCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCredentialPolicy")
    @WebResult(name = "addCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCredentialPolicy(
        @WebParam(name = "addCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCredentialPolicy")
    @WebResult(name = "updateCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCredentialPolicy(
        @WebParam(name = "updateCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCredentialPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCredentialPolicy")
    @WebResult(name = "getCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCredentialPolicyRes getCredentialPolicy(
        @WebParam(name = "getCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCredentialPolicy")
    @WebResult(name = "removeCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCredentialPolicy(
        @WebParam(name = "removeCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCredentialPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCredentialPolicy")
    @WebResult(name = "listCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCredentialPolicyRes listCredentialPolicy(
        @WebParam(name = "listCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addFacInfo")
    @WebResult(name = "addFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addFacInfo(
        @WebParam(name = "addFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFacInfo")
    @WebResult(name = "updateFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFacInfo(
        @WebParam(name = "updateFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFacInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFacInfo")
    @WebResult(name = "getFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFacInfoRes getFacInfo(
        @WebParam(name = "getFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeFacInfo")
    @WebResult(name = "removeFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeFacInfo(
        @WebParam(name = "removeFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListFacInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listFacInfo")
    @WebResult(name = "listFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListFacInfoRes listFacInfo(
        @WebParam(name = "listFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addHuntList")
    @WebResult(name = "addHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addHuntList(
        @WebParam(name = "addHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateHuntList")
    @WebResult(name = "updateHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateHuntList(
        @WebParam(name = "updateHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetHuntListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getHuntList")
    @WebResult(name = "getHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetHuntListRes getHuntList(
        @WebParam(name = "getHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeHuntList")
    @WebResult(name = "removeHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeHuntList(
        @WebParam(name = "removeHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListHuntListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listHuntList")
    @WebResult(name = "listHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListHuntListRes listHuntList(
        @WebParam(name = "listHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetHuntList")
    @WebResult(name = "resetHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetHuntList(
        @WebParam(name = "resetHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyHuntList")
    @WebResult(name = "applyHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyHuntList(
        @WebParam(name = "applyHuntList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addIvrUserLocale")
    @WebResult(name = "addIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addIvrUserLocale(
        @WebParam(name = "addIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateIvrUserLocale")
    @WebResult(name = "updateIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateIvrUserLocale(
        @WebParam(name = "updateIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetIvrUserLocaleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getIvrUserLocale")
    @WebResult(name = "getIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetIvrUserLocaleRes getIvrUserLocale(
        @WebParam(name = "getIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeIvrUserLocale")
    @WebResult(name = "removeIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeIvrUserLocale(
        @WebParam(name = "removeIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListIvrUserLocaleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listIvrUserLocale")
    @WebResult(name = "listIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListIvrUserLocaleRes listIvrUserLocale(
        @WebParam(name = "listIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLineGroup")
    @WebResult(name = "addLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLineGroup(
        @WebParam(name = "addLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLineGroup")
    @WebResult(name = "updateLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLineGroup(
        @WebParam(name = "updateLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLineGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLineGroup")
    @WebResult(name = "getLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLineGroupRes getLineGroup(
        @WebParam(name = "getLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLineGroup")
    @WebResult(name = "removeLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLineGroup(
        @WebParam(name = "removeLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLineGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLineGroup")
    @WebResult(name = "listLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLineGroupRes listLineGroup(
        @WebParam(name = "listLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRecordingProfile")
    @WebResult(name = "addRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRecordingProfile(
        @WebParam(name = "addRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRecordingProfile")
    @WebResult(name = "updateRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRecordingProfile(
        @WebParam(name = "updateRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRecordingProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRecordingProfile")
    @WebResult(name = "getRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRecordingProfileRes getRecordingProfile(
        @WebParam(name = "getRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRecordingProfile")
    @WebResult(name = "removeRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRecordingProfile(
        @WebParam(name = "removeRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRecordingProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRecordingProfile")
    @WebResult(name = "listRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRecordingProfileRes listRecordingProfile(
        @WebParam(name = "listRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRouteFilter")
    @WebResult(name = "addRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRouteFilter(
        @WebParam(name = "addRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRouteFilter")
    @WebResult(name = "updateRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRouteFilter(
        @WebParam(name = "updateRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRouteFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRouteFilter")
    @WebResult(name = "getRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRouteFilterRes getRouteFilter(
        @WebParam(name = "getRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRouteFilter")
    @WebResult(name = "removeRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRouteFilter(
        @WebParam(name = "removeRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRouteFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRouteFilter")
    @WebResult(name = "listRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRouteFilterRes listRouteFilter(
        @WebParam(name = "listRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCallManagerGroup")
    @WebResult(name = "addCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCallManagerGroup(
        @WebParam(name = "addCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallManagerGroup")
    @WebResult(name = "updateCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallManagerGroup(
        @WebParam(name = "updateCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallManagerGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallManagerGroup")
    @WebResult(name = "getCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallManagerGroupRes getCallManagerGroup(
        @WebParam(name = "getCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCallManagerGroup")
    @WebResult(name = "removeCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCallManagerGroup(
        @WebParam(name = "removeCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallManagerGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallManagerGroup")
    @WebResult(name = "listCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallManagerGroupRes listCallManagerGroup(
        @WebParam(name = "listCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCallManagerGroup")
    @WebResult(name = "resetCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCallManagerGroup(
        @WebParam(name = "resetCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCallManagerGroup")
    @WebResult(name = "applyCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCallManagerGroup(
        @WebParam(name = "applyCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUserGroup")
    @WebResult(name = "addUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUserGroup(
        @WebParam(name = "addUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUserGroup")
    @WebResult(name = "updateUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUserGroup(
        @WebParam(name = "updateUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUserGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUserGroup")
    @WebResult(name = "getUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUserGroupRes getUserGroup(
        @WebParam(name = "getUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUserGroup")
    @WebResult(name = "removeUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUserGroup(
        @WebParam(name = "removeUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUserGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUserGroup")
    @WebResult(name = "listUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUserGroupRes listUserGroup(
        @WebParam(name = "listUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDialPlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDialPlan")
    @WebResult(name = "getDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDialPlanRes getDialPlan(
        @WebParam(name = "getDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDialPlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDialPlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDialPlan")
    @WebResult(name = "listDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDialPlanRes listDialPlan(
        @WebParam(name = "listDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDialPlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDialPlanTagRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDialPlanTag")
    @WebResult(name = "getDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDialPlanTagRes getDialPlanTag(
        @WebParam(name = "getDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDialPlanTagReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDialPlanTagRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDialPlanTag")
    @WebResult(name = "listDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDialPlanTagRes listDialPlanTag(
        @WebParam(name = "listDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDialPlanTagReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDdiRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDdi")
    @WebResult(name = "getDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDdiRes getDdi(
        @WebParam(name = "getDdi", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDdiReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDdiRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDdi")
    @WebResult(name = "listDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDdiRes listDdi(
        @WebParam(name = "listDdi", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDdiReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMobileSmartClientProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMobileSmartClientProfile")
    @WebResult(name = "getMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMobileSmartClientProfileRes getMobileSmartClientProfile(
        @WebParam(name = "getMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMobileSmartClientProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMobileSmartClientProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMobileSmartClientProfile")
    @WebResult(name = "listMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMobileSmartClientProfileRes listMobileSmartClientProfile(
        @WebParam(name = "listMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMobileSmartClientProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateProcessNodeService")
    @WebResult(name = "updateProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateProcessNodeService(
        @WebParam(name = "updateProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetProcessNodeServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getProcessNodeService")
    @WebResult(name = "getProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetProcessNodeServiceRes getProcessNodeService(
        @WebParam(name = "getProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListProcessNodeServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listProcessNodeService")
    @WebResult(name = "listProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListProcessNodeServiceRes listProcessNodeService(
        @WebParam(name = "listProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMohAudioSource")
    @WebResult(name = "updateMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMohAudioSource(
        @WebParam(name = "updateMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMohAudioSource")
    @WebResult(name = "getMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMohAudioSourceRes getMohAudioSource(
        @WebParam(name = "getMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMohAudioSource")
    @WebResult(name = "removeMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMohAudioSource(
        @WebParam(name = "removeMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMohAudioSource")
    @WebResult(name = "listMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMohAudioSourceRes listMohAudioSource(
        @WebParam(name = "listMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDhcpServer")
    @WebResult(name = "addDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDhcpServer(
        @WebParam(name = "addDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDhcpServer")
    @WebResult(name = "updateDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDhcpServer(
        @WebParam(name = "updateDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDhcpServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDhcpServer")
    @WebResult(name = "getDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDhcpServerRes getDhcpServer(
        @WebParam(name = "getDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDhcpServer")
    @WebResult(name = "removeDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDhcpServer(
        @WebParam(name = "removeDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDhcpServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDhcpServer")
    @WebResult(name = "listDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDhcpServerRes listDhcpServer(
        @WebParam(name = "listDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDhcpSubnet")
    @WebResult(name = "addDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDhcpSubnet(
        @WebParam(name = "addDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDhcpSubnet")
    @WebResult(name = "updateDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDhcpSubnet(
        @WebParam(name = "updateDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDhcpSubnetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDhcpSubnet")
    @WebResult(name = "getDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDhcpSubnetRes getDhcpSubnet(
        @WebParam(name = "getDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDhcpSubnet")
    @WebResult(name = "removeDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDhcpSubnet(
        @WebParam(name = "removeDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDhcpSubnetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDhcpSubnet")
    @WebResult(name = "listDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDhcpSubnetRes listDhcpSubnet(
        @WebParam(name = "listDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCallPark")
    @WebResult(name = "addCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCallPark(
        @WebParam(name = "addCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallPark")
    @WebResult(name = "updateCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallPark(
        @WebParam(name = "updateCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallPark")
    @WebResult(name = "getCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallParkRes getCallPark(
        @WebParam(name = "getCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCallPark")
    @WebResult(name = "removeCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCallPark(
        @WebParam(name = "removeCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallPark")
    @WebResult(name = "listCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallParkRes listCallPark(
        @WebParam(name = "listCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDirectedCallPark")
    @WebResult(name = "addDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDirectedCallPark(
        @WebParam(name = "addDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDirectedCallPark")
    @WebResult(name = "updateDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDirectedCallPark(
        @WebParam(name = "updateDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDirectedCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDirectedCallPark")
    @WebResult(name = "getDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDirectedCallParkRes getDirectedCallPark(
        @WebParam(name = "getDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDirectedCallPark")
    @WebResult(name = "removeDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDirectedCallPark(
        @WebParam(name = "removeDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDirectedCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDirectedCallPark")
    @WebResult(name = "listDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDirectedCallParkRes listDirectedCallPark(
        @WebParam(name = "listDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetDirectedCallPark")
    @WebResult(name = "resetDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetDirectedCallPark(
        @WebParam(name = "resetDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ResetDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyDirectedCallPark")
    @WebResult(name = "applyDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyDirectedCallPark(
        @WebParam(name = "applyDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ApplyDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMeetMe")
    @WebResult(name = "addMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMeetMe(
        @WebParam(name = "addMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMeetMe")
    @WebResult(name = "updateMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMeetMe(
        @WebParam(name = "updateMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMeetMeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMeetMe")
    @WebResult(name = "getMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMeetMeRes getMeetMe(
        @WebParam(name = "getMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMeetMe")
    @WebResult(name = "removeMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMeetMe(
        @WebParam(name = "removeMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMeetMeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMeetMe")
    @WebResult(name = "listMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMeetMeRes listMeetMe(
        @WebParam(name = "listMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMobileVoiceAccess")
    @WebResult(name = "addMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMobileVoiceAccess(
        @WebParam(name = "addMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMobileVoiceAccess")
    @WebResult(name = "updateMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMobileVoiceAccess(
        @WebParam(name = "updateMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMobileVoiceAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMobileVoiceAccess")
    @WebResult(name = "getMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMobileVoiceAccessRes getMobileVoiceAccess(
        @WebParam(name = "getMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMobileVoiceAccess")
    @WebResult(name = "removeMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMobileVoiceAccess(
        @WebParam(name = "removeMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRouteList")
    @WebResult(name = "addRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRouteList(
        @WebParam(name = "addRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRouteList")
    @WebResult(name = "updateRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRouteList(
        @WebParam(name = "updateRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRouteListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRouteList")
    @WebResult(name = "getRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRouteListRes getRouteList(
        @WebParam(name = "getRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRouteList")
    @WebResult(name = "removeRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRouteList(
        @WebParam(name = "removeRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRouteListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRouteList")
    @WebResult(name = "listRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRouteListRes listRouteList(
        @WebParam(name = "listRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetRouteList")
    @WebResult(name = "resetRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetRouteList(
        @WebParam(name = "resetRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyRouteList")
    @WebResult(name = "applyRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyRouteList(
        @WebParam(name = "applyRouteList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUser")
    @WebResult(name = "addUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUser(
        @WebParam(name = "addUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUser")
    @WebResult(name = "updateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUser(
        @WebParam(name = "updateUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUser")
    @WebResult(name = "getUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUserRes getUser(
        @WebParam(name = "getUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUser")
    @WebResult(name = "removeUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUser(
        @WebParam(name = "removeUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUser")
    @WebResult(name = "listUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUserRes listUser(
        @WebParam(name = "listUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAppUser")
    @WebResult(name = "addAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAppUser(
        @WebParam(name = "addAppUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAppUser")
    @WebResult(name = "updateAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAppUser(
        @WebParam(name = "updateAppUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAppUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAppUser")
    @WebResult(name = "getAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAppUserRes getAppUser(
        @WebParam(name = "getAppUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAppUser")
    @WebResult(name = "removeAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAppUser(
        @WebParam(name = "removeAppUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAppUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAppUser")
    @WebResult(name = "listAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAppUserRes listAppUser(
        @WebParam(name = "listAppUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipRealm")
    @WebResult(name = "addSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipRealm(
        @WebParam(name = "addSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipRealm")
    @WebResult(name = "updateSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipRealm(
        @WebParam(name = "updateSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipRealmRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipRealm")
    @WebResult(name = "getSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipRealmRes getSipRealm(
        @WebParam(name = "getSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipRealm")
    @WebResult(name = "removeSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipRealm(
        @WebParam(name = "removeSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipRealmRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipRealm")
    @WebResult(name = "listSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipRealmRes listSipRealm(
        @WebParam(name = "listSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPhoneNtp")
    @WebResult(name = "addPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPhoneNtp(
        @WebParam(name = "addPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePhoneNtp")
    @WebResult(name = "updatePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePhoneNtp(
        @WebParam(name = "updatePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneNtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhoneNtp")
    @WebResult(name = "getPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneNtpRes getPhoneNtp(
        @WebParam(name = "getPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePhoneNtp")
    @WebResult(name = "removePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePhoneNtp(
        @WebParam(name = "removePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemovePhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPhoneNtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPhoneNtp")
    @WebResult(name = "listPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPhoneNtpRes listPhoneNtp(
        @WebParam(name = "listPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDateTimeGroup")
    @WebResult(name = "addDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDateTimeGroup(
        @WebParam(name = "addDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDateTimeGroup")
    @WebResult(name = "updateDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDateTimeGroup(
        @WebParam(name = "updateDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDateTimeGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDateTimeGroup")
    @WebResult(name = "getDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDateTimeGroupRes getDateTimeGroup(
        @WebParam(name = "getDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDateTimeGroup")
    @WebResult(name = "removeDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDateTimeGroup(
        @WebParam(name = "removeDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDateTimeGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDateTimeGroup")
    @WebResult(name = "listDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDateTimeGroupRes listDateTimeGroup(
        @WebParam(name = "listDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetDateTimeGroup")
    @WebResult(name = "resetDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetDateTimeGroup(
        @WebParam(name = "resetDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyDateTimeGroup")
    @WebResult(name = "applyDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyDateTimeGroup(
        @WebParam(name = "applyDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPresenceGroup")
    @WebResult(name = "addPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPresenceGroup(
        @WebParam(name = "addPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePresenceGroup")
    @WebResult(name = "updatePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePresenceGroup(
        @WebParam(name = "updatePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPresenceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPresenceGroup")
    @WebResult(name = "getPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPresenceGroupRes getPresenceGroup(
        @WebParam(name = "getPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePresenceGroup")
    @WebResult(name = "removePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePresenceGroup(
        @WebParam(name = "removePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPresenceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPresenceGroup")
    @WebResult(name = "listPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPresenceGroupRes listPresenceGroup(
        @WebParam(name = "listPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGeoLocation")
    @WebResult(name = "addGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGeoLocation(
        @WebParam(name = "addGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGeoLocation")
    @WebResult(name = "updateGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGeoLocation(
        @WebParam(name = "updateGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGeoLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGeoLocation")
    @WebResult(name = "getGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGeoLocationRes getGeoLocation(
        @WebParam(name = "getGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGeoLocation")
    @WebResult(name = "removeGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGeoLocation(
        @WebParam(name = "removeGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListGeoLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listGeoLocation")
    @WebResult(name = "listGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListGeoLocationRes listGeoLocation(
        @WebParam(name = "listGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSrst")
    @WebResult(name = "addSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSrst(
        @WebParam(name = "addSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSrst")
    @WebResult(name = "updateSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSrst(
        @WebParam(name = "updateSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSrstRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSrst")
    @WebResult(name = "getSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSrstRes getSrst(
        @WebParam(name = "getSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSrst")
    @WebResult(name = "removeSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSrst(
        @WebParam(name = "removeSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSrstRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSrst")
    @WebResult(name = "listSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSrstRes listSrst(
        @WebParam(name = "listSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetSrst")
    @WebResult(name = "resetSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetSrst(
        @WebParam(name = "resetSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartSrst")
    @WebResult(name = "restartSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartSrst(
        @WebParam(name = "restartSrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applySrst")
    @WebResult(name = "applySrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applySrst(
        @WebParam(name = "applySrst", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMlppDomain")
    @WebResult(name = "addMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMlppDomain(
        @WebParam(name = "addMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMlppDomain")
    @WebResult(name = "updateMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMlppDomain(
        @WebParam(name = "updateMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMlppDomainRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMlppDomain")
    @WebResult(name = "getMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMlppDomainRes getMlppDomain(
        @WebParam(name = "getMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMlppDomain")
    @WebResult(name = "removeMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMlppDomain(
        @WebParam(name = "removeMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMlppDomainRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMlppDomain")
    @WebResult(name = "listMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMlppDomainRes listMlppDomain(
        @WebParam(name = "listMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCumaServerSecurityProfile")
    @WebResult(name = "addCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCumaServerSecurityProfile(
        @WebParam(name = "addCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCumaServerSecurityProfile")
    @WebResult(name = "updateCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCumaServerSecurityProfile(
        @WebParam(name = "updateCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCumaServerSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCumaServerSecurityProfile")
    @WebResult(name = "getCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCumaServerSecurityProfileRes getCumaServerSecurityProfile(
        @WebParam(name = "getCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCumaServerSecurityProfile")
    @WebResult(name = "removeCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCumaServerSecurityProfile(
        @WebParam(name = "removeCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCumaServerSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCumaServerSecurityProfile")
    @WebResult(name = "listCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCumaServerSecurityProfileRes listCumaServerSecurityProfile(
        @WebParam(name = "listCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addApplicationServer")
    @WebResult(name = "addApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addApplicationServer(
        @WebParam(name = "addApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateApplicationServer")
    @WebResult(name = "updateApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateApplicationServer(
        @WebParam(name = "updateApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetApplicationServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getApplicationServer")
    @WebResult(name = "getApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetApplicationServerRes getApplicationServer(
        @WebParam(name = "getApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeApplicationServer")
    @WebResult(name = "removeApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeApplicationServer(
        @WebParam(name = "removeApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListApplicationServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listApplicationServer")
    @WebResult(name = "listApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListApplicationServerRes listApplicationServer(
        @WebParam(name = "listApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addApplicationUserCapfProfile")
    @WebResult(name = "addApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addApplicationUserCapfProfile(
        @WebParam(name = "addApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateApplicationUserCapfProfile")
    @WebResult(name = "updateApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateApplicationUserCapfProfile(
        @WebParam(name = "updateApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetApplicationUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getApplicationUserCapfProfile")
    @WebResult(name = "getApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetApplicationUserCapfProfileRes getApplicationUserCapfProfile(
        @WebParam(name = "getApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeApplicationUserCapfProfile")
    @WebResult(name = "removeApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeApplicationUserCapfProfile(
        @WebParam(name = "removeApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListApplicationUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listApplicationUserCapfProfile")
    @WebResult(name = "listApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListApplicationUserCapfProfileRes listApplicationUserCapfProfile(
        @WebParam(name = "listApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addEndUserCapfProfile")
    @WebResult(name = "addEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addEndUserCapfProfile(
        @WebParam(name = "addEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateEndUserCapfProfile")
    @WebResult(name = "updateEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateEndUserCapfProfile(
        @WebParam(name = "updateEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetEndUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getEndUserCapfProfile")
    @WebResult(name = "getEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetEndUserCapfProfileRes getEndUserCapfProfile(
        @WebParam(name = "getEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeEndUserCapfProfile")
    @WebResult(name = "removeEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeEndUserCapfProfile(
        @WebParam(name = "removeEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListEndUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listEndUserCapfProfile")
    @WebResult(name = "listEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListEndUserCapfProfileRes listEndUserCapfProfile(
        @WebParam(name = "listEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateServiceParameter")
    @WebResult(name = "updateServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateServiceParameter(
        @WebParam(name = "updateServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetServiceParameterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getServiceParameter")
    @WebResult(name = "getServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetServiceParameterRes getServiceParameter(
        @WebParam(name = "getServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListServiceParameterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listServiceParameter")
    @WebResult(name = "listServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListServiceParameterRes listServiceParameter(
        @WebParam(name = "listServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUserPhoneAssociation")
    @WebResult(name = "addUserPhoneAssociationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUserPhoneAssociation(
        @WebParam(name = "addUserPhoneAssociation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUserPhoneAssociationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGeoLocationFilter")
    @WebResult(name = "addGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGeoLocationFilter(
        @WebParam(name = "addGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGeoLocationFilter")
    @WebResult(name = "updateGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGeoLocationFilter(
        @WebParam(name = "updateGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGeoLocationFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGeoLocationFilter")
    @WebResult(name = "getGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGeoLocationFilterRes getGeoLocationFilter(
        @WebParam(name = "getGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGeoLocationFilter")
    @WebResult(name = "removeGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGeoLocationFilter(
        @WebParam(name = "removeGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListGeoLocationFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listGeoLocationFilter")
    @WebResult(name = "listGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListGeoLocationFilterRes listGeoLocationFilter(
        @WebParam(name = "listGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVoiceMailProfile")
    @WebResult(name = "addVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVoiceMailProfile(
        @WebParam(name = "addVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVoiceMailProfile")
    @WebResult(name = "updateVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVoiceMailProfile(
        @WebParam(name = "updateVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVoiceMailProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVoiceMailProfile")
    @WebResult(name = "getVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVoiceMailProfileRes getVoiceMailProfile(
        @WebParam(name = "getVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVoiceMailProfile")
    @WebResult(name = "removeVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVoiceMailProfile(
        @WebParam(name = "removeVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVoiceMailProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVoiceMailProfile")
    @WebResult(name = "listVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVoiceMailProfileRes listVoiceMailProfile(
        @WebParam(name = "listVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetVoiceMailProfile")
    @WebResult(name = "resetVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetVoiceMailProfile(
        @WebParam(name = "resetVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartVoiceMailProfile")
    @WebResult(name = "restartVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartVoiceMailProfile(
        @WebParam(name = "restartVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyVoiceMailProfile")
    @WebResult(name = "applyVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyVoiceMailProfile(
        @WebParam(name = "applyVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVoiceMailPort")
    @WebResult(name = "addVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVoiceMailPort(
        @WebParam(name = "addVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVoiceMailPort")
    @WebResult(name = "updateVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVoiceMailPort(
        @WebParam(name = "updateVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVoiceMailPortRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVoiceMailPort")
    @WebResult(name = "getVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVoiceMailPortRes getVoiceMailPort(
        @WebParam(name = "getVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVoiceMailPort")
    @WebResult(name = "removeVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVoiceMailPort(
        @WebParam(name = "removeVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVoiceMailPortRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVoiceMailPort")
    @WebResult(name = "listVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVoiceMailPortRes listVoiceMailPort(
        @WebParam(name = "listVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetVoiceMailPort")
    @WebResult(name = "resetVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetVoiceMailPort(
        @WebParam(name = "resetVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartVoiceMailPort")
    @WebResult(name = "restartVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartVoiceMailPort(
        @WebParam(name = "restartVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyVoiceMailPort")
    @WebResult(name = "applyVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyVoiceMailPort(
        @WebParam(name = "applyVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatekeeper")
    @WebResult(name = "addGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatekeeper(
        @WebParam(name = "addGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatekeeper")
    @WebResult(name = "updateGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatekeeper(
        @WebParam(name = "updateGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatekeeperRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatekeeper")
    @WebResult(name = "getGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatekeeperRes getGatekeeper(
        @WebParam(name = "getGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatekeeper")
    @WebResult(name = "removeGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatekeeper(
        @WebParam(name = "removeGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListGatekeeperRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listGatekeeper")
    @WebResult(name = "listGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListGatekeeperRes listGatekeeper(
        @WebParam(name = "listGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetGatekeeper")
    @WebResult(name = "resetGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetGatekeeper(
        @WebParam(name = "resetGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartGatekeeper")
    @WebResult(name = "restartGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartGatekeeper(
        @WebParam(name = "restartGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyGatekeeper")
    @WebResult(name = "applyGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyGatekeeper(
        @WebParam(name = "applyGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPhoneButtonTemplate")
    @WebResult(name = "addPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPhoneButtonTemplate(
        @WebParam(name = "addPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePhoneButtonTemplate")
    @WebResult(name = "updatePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePhoneButtonTemplate(
        @WebParam(name = "updatePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneButtonTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhoneButtonTemplate")
    @WebResult(name = "getPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneButtonTemplateRes getPhoneButtonTemplate(
        @WebParam(name = "getPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePhoneButtonTemplate")
    @WebResult(name = "removePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePhoneButtonTemplate(
        @WebParam(name = "removePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPhoneButtonTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPhoneButtonTemplate")
    @WebResult(name = "listPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPhoneButtonTemplateRes listPhoneButtonTemplate(
        @WebParam(name = "listPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartPhoneButtonTemplate")
    @WebResult(name = "restartPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartPhoneButtonTemplate(
        @WebParam(name = "restartPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyPhoneButtonTemplate")
    @WebResult(name = "applyPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyPhoneButtonTemplate(
        @WebParam(name = "applyPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCommonPhoneConfig")
    @WebResult(name = "addCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCommonPhoneConfig(
        @WebParam(name = "addCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCommonPhoneConfig")
    @WebResult(name = "updateCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCommonPhoneConfig(
        @WebParam(name = "updateCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCommonPhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCommonPhoneConfig")
    @WebResult(name = "getCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCommonPhoneConfigRes getCommonPhoneConfig(
        @WebParam(name = "getCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCommonPhoneConfig")
    @WebResult(name = "removeCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCommonPhoneConfig(
        @WebParam(name = "removeCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCommonPhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCommonPhoneConfig")
    @WebResult(name = "listCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCommonPhoneConfigRes listCommonPhoneConfig(
        @WebParam(name = "listCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCommonPhoneConfig")
    @WebResult(name = "resetCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCommonPhoneConfig(
        @WebParam(name = "resetCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCommonPhoneConfig")
    @WebResult(name = "applyCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCommonPhoneConfig(
        @WebParam(name = "applyCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMessageWaiting")
    @WebResult(name = "addMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMessageWaiting(
        @WebParam(name = "addMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMessageWaiting")
    @WebResult(name = "updateMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMessageWaiting(
        @WebParam(name = "updateMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMessageWaitingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMessageWaiting")
    @WebResult(name = "getMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMessageWaitingRes getMessageWaiting(
        @WebParam(name = "getMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMessageWaiting")
    @WebResult(name = "removeMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMessageWaiting(
        @WebParam(name = "removeMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMessageWaitingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMessageWaiting")
    @WebResult(name = "listMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMessageWaitingRes listMessageWaiting(
        @WebParam(name = "listMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addIpPhoneServices")
    @WebResult(name = "addIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addIpPhoneServices(
        @WebParam(name = "addIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateIpPhoneServices")
    @WebResult(name = "updateIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateIpPhoneServices(
        @WebParam(name = "updateIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetIpPhoneServicesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getIpPhoneServices")
    @WebResult(name = "getIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetIpPhoneServicesRes getIpPhoneServices(
        @WebParam(name = "getIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeIpPhoneServices")
    @WebResult(name = "removeIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeIpPhoneServices(
        @WebParam(name = "removeIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListIpPhoneServicesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listIpPhoneServices")
    @WebResult(name = "listIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListIpPhoneServicesRes listIpPhoneServices(
        @WebParam(name = "listIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCtiRoutePoint")
    @WebResult(name = "addCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCtiRoutePoint(
        @WebParam(name = "addCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCtiRoutePoint")
    @WebResult(name = "updateCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCtiRoutePoint(
        @WebParam(name = "updateCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCtiRoutePointRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCtiRoutePoint")
    @WebResult(name = "getCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCtiRoutePointRes getCtiRoutePoint(
        @WebParam(name = "getCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCtiRoutePoint")
    @WebResult(name = "removeCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCtiRoutePoint(
        @WebParam(name = "removeCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCtiRoutePointRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCtiRoutePoint")
    @WebResult(name = "listCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCtiRoutePointRes listCtiRoutePoint(
        @WebParam(name = "listCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCtiRoutePoint")
    @WebResult(name = "resetCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCtiRoutePoint(
        @WebParam(name = "resetCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCtiRoutePoint")
    @WebResult(name = "restartCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCtiRoutePoint(
        @WebParam(name = "restartCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCtiRoutePoint")
    @WebResult(name = "applyCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCtiRoutePoint(
        @WebParam(name = "applyCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTransPattern")
    @WebResult(name = "addTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTransPattern(
        @WebParam(name = "addTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTransPattern")
    @WebResult(name = "updateTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTransPattern(
        @WebParam(name = "updateTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTransPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTransPattern")
    @WebResult(name = "getTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTransPatternRes getTransPattern(
        @WebParam(name = "getTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTransPattern")
    @WebResult(name = "removeTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTransPattern(
        @WebParam(name = "removeTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTransPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTransPattern")
    @WebResult(name = "listTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTransPatternRes listTransPattern(
        @WebParam(name = "listTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTransPatternOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTransPatternOptions")
    @WebResult(name = "getTransPatternOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTransPatternOptionsRes getTransPatternOptions(
        @WebParam(name = "getTransPatternOptions", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTransPatternOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCallingPartyTransformationPattern")
    @WebResult(name = "addCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCallingPartyTransformationPattern(
        @WebParam(name = "addCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallingPartyTransformationPattern")
    @WebResult(name = "updateCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallingPartyTransformationPattern(
        @WebParam(name = "updateCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallingPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallingPartyTransformationPattern")
    @WebResult(name = "getCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallingPartyTransformationPatternRes getCallingPartyTransformationPattern(
        @WebParam(name = "getCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCallingPartyTransformationPattern")
    @WebResult(name = "removeCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCallingPartyTransformationPattern(
        @WebParam(name = "removeCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallingPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallingPartyTransformationPattern")
    @WebResult(name = "listCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallingPartyTransformationPatternRes listCallingPartyTransformationPattern(
        @WebParam(name = "listCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipRoutePattern")
    @WebResult(name = "addSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipRoutePattern(
        @WebParam(name = "addSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipRoutePattern")
    @WebResult(name = "updateSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipRoutePattern(
        @WebParam(name = "updateSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipRoutePattern")
    @WebResult(name = "getSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipRoutePatternRes getSipRoutePattern(
        @WebParam(name = "getSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipRoutePattern")
    @WebResult(name = "removeSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipRoutePattern(
        @WebParam(name = "removeSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipRoutePattern")
    @WebResult(name = "listSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipRoutePatternRes listSipRoutePattern(
        @WebParam(name = "listSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addHuntPilot")
    @WebResult(name = "addHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addHuntPilot(
        @WebParam(name = "addHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateHuntPilot")
    @WebResult(name = "updateHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateHuntPilot(
        @WebParam(name = "updateHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetHuntPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getHuntPilot")
    @WebResult(name = "getHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetHuntPilotRes getHuntPilot(
        @WebParam(name = "getHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeHuntPilot")
    @WebResult(name = "removeHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeHuntPilot(
        @WebParam(name = "removeHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListHuntPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listHuntPilot")
    @WebResult(name = "listHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListHuntPilotRes listHuntPilot(
        @WebParam(name = "listHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRoutePattern")
    @WebResult(name = "addRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRoutePattern(
        @WebParam(name = "addRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRoutePattern")
    @WebResult(name = "updateRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRoutePattern(
        @WebParam(name = "updateRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRoutePattern")
    @WebResult(name = "getRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRoutePatternRes getRoutePattern(
        @WebParam(name = "getRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRoutePattern")
    @WebResult(name = "removeRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRoutePattern(
        @WebParam(name = "removeRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRoutePattern")
    @WebResult(name = "listRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRoutePatternRes listRoutePattern(
        @WebParam(name = "listRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addApplicationDialRules")
    @WebResult(name = "addApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addApplicationDialRules(
        @WebParam(name = "addApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateApplicationDialRules")
    @WebResult(name = "updateApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateApplicationDialRules(
        @WebParam(name = "updateApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetApplicationDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getApplicationDialRules")
    @WebResult(name = "getApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetApplicationDialRulesRes getApplicationDialRules(
        @WebParam(name = "getApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeApplicationDialRules")
    @WebResult(name = "removeApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeApplicationDialRules(
        @WebParam(name = "removeApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListApplicationDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listApplicationDialRules")
    @WebResult(name = "listApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListApplicationDialRulesRes listApplicationDialRules(
        @WebParam(name = "listApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDirectoryLookupDialRules")
    @WebResult(name = "addDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDirectoryLookupDialRules(
        @WebParam(name = "addDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDirectoryLookupDialRules")
    @WebResult(name = "updateDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDirectoryLookupDialRules(
        @WebParam(name = "updateDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDirectoryLookupDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDirectoryLookupDialRules")
    @WebResult(name = "getDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDirectoryLookupDialRulesRes getDirectoryLookupDialRules(
        @WebParam(name = "getDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDirectoryLookupDialRules")
    @WebResult(name = "removeDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDirectoryLookupDialRules(
        @WebParam(name = "removeDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDirectoryLookupDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDirectoryLookupDialRules")
    @WebResult(name = "listDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDirectoryLookupDialRulesRes listDirectoryLookupDialRules(
        @WebParam(name = "listDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPhoneSecurityProfile")
    @WebResult(name = "addPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPhoneSecurityProfile(
        @WebParam(name = "addPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePhoneSecurityProfile")
    @WebResult(name = "updatePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePhoneSecurityProfile(
        @WebParam(name = "updatePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhoneSecurityProfile")
    @WebResult(name = "getPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneSecurityProfileRes getPhoneSecurityProfile(
        @WebParam(name = "getPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePhoneSecurityProfile")
    @WebResult(name = "removePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePhoneSecurityProfile(
        @WebParam(name = "removePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPhoneSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPhoneSecurityProfile")
    @WebResult(name = "listPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPhoneSecurityProfileRes listPhoneSecurityProfile(
        @WebParam(name = "listPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetPhoneSecurityProfile")
    @WebResult(name = "resetPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetPhoneSecurityProfile(
        @WebParam(name = "resetPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyPhoneSecurityProfile")
    @WebResult(name = "applyPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyPhoneSecurityProfile(
        @WebParam(name = "applyPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipDialRules")
    @WebResult(name = "addSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipDialRules(
        @WebParam(name = "addSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipDialRules")
    @WebResult(name = "updateSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipDialRules(
        @WebParam(name = "updateSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipDialRules")
    @WebResult(name = "getSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipDialRulesRes getSipDialRules(
        @WebParam(name = "getSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipDialRules")
    @WebResult(name = "removeSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipDialRules(
        @WebParam(name = "removeSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipDialRules")
    @WebResult(name = "listSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipDialRulesRes listSipDialRules(
        @WebParam(name = "listSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addConferenceBridge")
    @WebResult(name = "addConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addConferenceBridge(
        @WebParam(name = "addConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateConferenceBridge")
    @WebResult(name = "updateConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateConferenceBridge(
        @WebParam(name = "updateConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetConferenceBridgeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getConferenceBridge")
    @WebResult(name = "getConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetConferenceBridgeRes getConferenceBridge(
        @WebParam(name = "getConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeConferenceBridge")
    @WebResult(name = "removeConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeConferenceBridge(
        @WebParam(name = "removeConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListConferenceBridgeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listConferenceBridge")
    @WebResult(name = "listConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListConferenceBridgeRes listConferenceBridge(
        @WebParam(name = "listConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetConferenceBridge")
    @WebResult(name = "resetConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetConferenceBridge(
        @WebParam(name = "resetConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartConferenceBridge")
    @WebResult(name = "restartConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartConferenceBridge(
        @WebParam(name = "restartConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyConferenceBridge")
    @WebResult(name = "applyConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyConferenceBridge(
        @WebParam(name = "applyConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAnnunciator")
    @WebResult(name = "updateAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAnnunciator(
        @WebParam(name = "updateAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAnnunciatorRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAnnunciator")
    @WebResult(name = "getAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAnnunciatorRes getAnnunciator(
        @WebParam(name = "getAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAnnunciatorRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAnnunciator")
    @WebResult(name = "listAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAnnunciatorRes listAnnunciator(
        @WebParam(name = "listAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMtp")
    @WebResult(name = "addMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMtp(
        @WebParam(name = "addMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMtp")
    @WebResult(name = "updateMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMtp(
        @WebParam(name = "updateMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMtp")
    @WebResult(name = "getMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMtpRes getMtp(
        @WebParam(name = "getMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMtp")
    @WebResult(name = "removeMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMtp(
        @WebParam(name = "removeMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMtp")
    @WebResult(name = "listMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMtpRes listMtp(
        @WebParam(name = "listMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetMtp")
    @WebResult(name = "resetMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetMtp(
        @WebParam(name = "resetMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartMtp")
    @WebResult(name = "restartMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartMtp(
        @WebParam(name = "restartMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyMtp")
    @WebResult(name = "applyMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyMtp(
        @WebParam(name = "applyMtp", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFixedMohAudioSource")
    @WebResult(name = "updateFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFixedMohAudioSource(
        @WebParam(name = "updateFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFixedMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFixedMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFixedMohAudioSource")
    @WebResult(name = "getFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFixedMohAudioSourceRes getFixedMohAudioSource(
        @WebParam(name = "getFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFixedMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAarGroupMatrix")
    @WebResult(name = "updateAarGroupMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAarGroupMatrix(
        @WebParam(name = "updateAarGroupMatrix", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAarGroupMatrixReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRemoteDestinationProfile")
    @WebResult(name = "addRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRemoteDestinationProfile(
        @WebParam(name = "addRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRemoteDestinationProfile")
    @WebResult(name = "updateRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRemoteDestinationProfile(
        @WebParam(name = "updateRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRemoteDestinationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRemoteDestinationProfile")
    @WebResult(name = "getRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRemoteDestinationProfileRes getRemoteDestinationProfile(
        @WebParam(name = "getRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRemoteDestinationProfile")
    @WebResult(name = "removeRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRemoteDestinationProfile(
        @WebParam(name = "removeRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRemoteDestinationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRemoteDestinationProfile")
    @WebResult(name = "listRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRemoteDestinationProfileRes listRemoteDestinationProfile(
        @WebParam(name = "listRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLine")
    @WebResult(name = "addLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLine(
        @WebParam(name = "addLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLine")
    @WebResult(name = "updateLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLine(
        @WebParam(name = "updateLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLineRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLine")
    @WebResult(name = "getLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLineRes getLine(
        @WebParam(name = "getLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLine")
    @WebResult(name = "removeLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLine(
        @WebParam(name = "removeLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLineRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLine")
    @WebResult(name = "listLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLineRes listLine(
        @WebParam(name = "listLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetLine")
    @WebResult(name = "resetLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetLine(
        @WebParam(name = "resetLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ResetLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartLine")
    @WebResult(name = "restartLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartLine(
        @WebParam(name = "restartLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RestartLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyLine")
    @WebResult(name = "applyLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyLine(
        @WebParam(name = "applyLine", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ApplyLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLineOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLineOptions")
    @WebResult(name = "getLineOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLineOptionsRes getLineOptions(
        @WebParam(name = "getLineOptions", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLineOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDefaultDeviceProfile")
    @WebResult(name = "addDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDefaultDeviceProfile(
        @WebParam(name = "addDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDefaultDeviceProfile")
    @WebResult(name = "updateDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDefaultDeviceProfile(
        @WebParam(name = "updateDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDefaultDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDefaultDeviceProfile")
    @WebResult(name = "getDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDefaultDeviceProfileRes getDefaultDeviceProfile(
        @WebParam(name = "getDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDefaultDeviceProfile")
    @WebResult(name = "removeDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDefaultDeviceProfile(
        @WebParam(name = "removeDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDefaultDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDefaultDeviceProfile")
    @WebResult(name = "listDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDefaultDeviceProfileRes listDefaultDeviceProfile(
        @WebParam(name = "listDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addH323Phone")
    @WebResult(name = "addH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addH323Phone(
        @WebParam(name = "addH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateH323Phone")
    @WebResult(name = "updateH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateH323Phone(
        @WebParam(name = "updateH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetH323PhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getH323Phone")
    @WebResult(name = "getH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetH323PhoneRes getH323Phone(
        @WebParam(name = "getH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeH323Phone")
    @WebResult(name = "removeH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeH323Phone(
        @WebParam(name = "removeH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListH323PhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listH323Phone")
    @WebResult(name = "listH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListH323PhoneRes listH323Phone(
        @WebParam(name = "listH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetH323Phone")
    @WebResult(name = "resetH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetH323Phone(
        @WebParam(name = "resetH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartH323Phone")
    @WebResult(name = "restartH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartH323Phone(
        @WebParam(name = "restartH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyH323Phone")
    @WebResult(name = "applyH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyH323Phone(
        @WebParam(name = "applyH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMohServer")
    @WebResult(name = "updateMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMohServer(
        @WebParam(name = "updateMohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMohServer")
    @WebResult(name = "getMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMohServerRes getMohServer(
        @WebParam(name = "getMohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMohServer")
    @WebResult(name = "listMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMohServerRes listMohServer(
        @WebParam(name = "listMohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addH323Trunk")
    @WebResult(name = "addH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addH323Trunk(
        @WebParam(name = "addH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateH323Trunk")
    @WebResult(name = "updateH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateH323Trunk(
        @WebParam(name = "updateH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetH323TrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getH323Trunk")
    @WebResult(name = "getH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetH323TrunkRes getH323Trunk(
        @WebParam(name = "getH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeH323Trunk")
    @WebResult(name = "removeH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeH323Trunk(
        @WebParam(name = "removeH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListH323TrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listH323Trunk")
    @WebResult(name = "listH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListH323TrunkRes listH323Trunk(
        @WebParam(name = "listH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetH323Trunk")
    @WebResult(name = "resetH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetH323Trunk(
        @WebParam(name = "resetH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartH323Trunk")
    @WebResult(name = "restartH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartH323Trunk(
        @WebParam(name = "restartH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPhone")
    @WebResult(name = "addPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPhone(
        @WebParam(name = "addPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePhone")
    @WebResult(name = "updatePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePhone(
        @WebParam(name = "updatePhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhone")
    @WebResult(name = "getPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneRes getPhone(
        @WebParam(name = "getPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePhone")
    @WebResult(name = "removePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePhone(
        @WebParam(name = "removePhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPhone")
    @WebResult(name = "listPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPhoneRes listPhone(
        @WebParam(name = "listPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetPhone")
    @WebResult(name = "resetPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetPhone(
        @WebParam(name = "resetPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartPhone")
    @WebResult(name = "restartPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartPhone(
        @WebParam(name = "restartPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyPhone")
    @WebResult(name = "applyPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyPhone(
        @WebParam(name = "applyPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 wipePhone")
    @WebResult(name = "wipePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse wipePhone(
        @WebParam(name = "wipePhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 lockPhone")
    @WebResult(name = "lockPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse lockPhone(
        @WebParam(name = "lockPhone", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhoneOptions")
    @WebResult(name = "getPhoneOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneOptionsRes getPhoneOptions(
        @WebParam(name = "getPhoneOptions", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addH323Gateway")
    @WebResult(name = "addH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addH323Gateway(
        @WebParam(name = "addH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateH323Gateway")
    @WebResult(name = "updateH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateH323Gateway(
        @WebParam(name = "updateH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetH323GatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getH323Gateway")
    @WebResult(name = "getH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetH323GatewayRes getH323Gateway(
        @WebParam(name = "getH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeH323Gateway")
    @WebResult(name = "removeH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeH323Gateway(
        @WebParam(name = "removeH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListH323GatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listH323Gateway")
    @WebResult(name = "listH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListH323GatewayRes listH323Gateway(
        @WebParam(name = "listH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetH323Gateway")
    @WebResult(name = "resetH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetH323Gateway(
        @WebParam(name = "resetH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartH323Gateway")
    @WebResult(name = "restartH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartH323Gateway(
        @WebParam(name = "restartH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyH323Gateway")
    @WebResult(name = "applyH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyH323Gateway(
        @WebParam(name = "applyH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDeviceProfile")
    @WebResult(name = "addDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDeviceProfile(
        @WebParam(name = "addDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDeviceProfile")
    @WebResult(name = "updateDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDeviceProfile(
        @WebParam(name = "updateDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDeviceProfile")
    @WebResult(name = "getDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDeviceProfileRes getDeviceProfile(
        @WebParam(name = "getDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDeviceProfile")
    @WebResult(name = "removeDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDeviceProfile(
        @WebParam(name = "removeDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDeviceProfile")
    @WebResult(name = "listDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDeviceProfileRes listDeviceProfile(
        @WebParam(name = "listDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDeviceProfileOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDeviceProfileOptions")
    @WebResult(name = "getDeviceProfileOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDeviceProfileOptionsRes getDeviceProfileOptions(
        @WebParam(name = "getDeviceProfileOptions", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDeviceProfileOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRemoteDestination")
    @WebResult(name = "addRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRemoteDestination(
        @WebParam(name = "addRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRemoteDestination")
    @WebResult(name = "updateRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRemoteDestination(
        @WebParam(name = "updateRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRemoteDestinationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRemoteDestination")
    @WebResult(name = "getRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRemoteDestinationRes getRemoteDestination(
        @WebParam(name = "getRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRemoteDestination")
    @WebResult(name = "removeRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRemoteDestination(
        @WebParam(name = "removeRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRemoteDestinationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRemoteDestination")
    @WebResult(name = "listRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRemoteDestinationRes listRemoteDestination(
        @WebParam(name = "listRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVg224")
    @WebResult(name = "addVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVg224(
        @WebParam(name = "addVg224", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVg224")
    @WebResult(name = "updateVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVg224(
        @WebParam(name = "updateVg224", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVg224Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVg224")
    @WebResult(name = "getVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVg224Res getVg224(
        @WebParam(name = "getVg224", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVg224")
    @WebResult(name = "removeVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVg224(
        @WebParam(name = "removeVg224", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGateway")
    @WebResult(name = "addGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGateway(
        @WebParam(name = "addGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGateway")
    @WebResult(name = "updateGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGateway(
        @WebParam(name = "updateGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGateway")
    @WebResult(name = "getGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewayRes getGateway(
        @WebParam(name = "getGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGateway")
    @WebResult(name = "removeGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGateway(
        @WebParam(name = "removeGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listGateway")
    @WebResult(name = "listGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListGatewayRes listGateway(
        @WebParam(name = "listGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetGateway")
    @WebResult(name = "resetGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetGateway(
        @WebParam(name = "resetGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ResetGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyGateway")
    @WebResult(name = "applyGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyGateway(
        @WebParam(name = "applyGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ApplyGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewayEndpointAnalogAccess")
    @WebResult(name = "addGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewayEndpointAnalogAccess(
        @WebParam(name = "addGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatewayEndpointAnalogAccess")
    @WebResult(name = "updateGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatewayEndpointAnalogAccess(
        @WebParam(name = "updateGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewayEndpointAnalogAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatewayEndpointAnalogAccess")
    @WebResult(name = "getGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewayEndpointAnalogAccessRes getGatewayEndpointAnalogAccess(
        @WebParam(name = "getGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewayEndpointAnalogAccess")
    @WebResult(name = "removeGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewayEndpointAnalogAccess(
        @WebParam(name = "removeGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewayEndpointDigitalAccessPri")
    @WebResult(name = "addGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessPri(
        @WebParam(name = "addGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatewayEndpointDigitalAccessPri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessPri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatewayEndpointDigitalAccessPri")
    @WebResult(name = "getGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessPriRes getGatewayEndpointDigitalAccessPri(
        @WebParam(name = "getGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewayEndpointDigitalAccessPri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessPri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewayEndpointDigitalAccessBri")
    @WebResult(name = "addGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessBri(
        @WebParam(name = "addGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatewayEndpointDigitalAccessBri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessBri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessBriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatewayEndpointDigitalAccessBri")
    @WebResult(name = "getGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessBriRes getGatewayEndpointDigitalAccessBri(
        @WebParam(name = "getGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewayEndpointDigitalAccessBri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessBri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewayEndpointDigitalAccessT1")
    @WebResult(name = "addGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessT1(
        @WebParam(name = "addGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatewayEndpointDigitalAccessT1")
    @WebResult(name = "updateGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessT1(
        @WebParam(name = "updateGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewayEndpointDigitalAccessT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatewayEndpointDigitalAccessT1")
    @WebResult(name = "getGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessT1Res getGatewayEndpointDigitalAccessT1(
        @WebParam(name = "getGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewayEndpointDigitalAccessT1")
    @WebResult(name = "removeGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessT1(
        @WebParam(name = "removeGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "addCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "addCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "updateCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "updateCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCiscoCatalyst600024PortFXSGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "getCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCiscoCatalyst600024PortFXSGatewayRes getCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "getCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "removeCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "removeCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCiscoCatalyst600024PortFXSGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "listCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCiscoCatalyst600024PortFXSGatewayRes listCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "listCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "resetCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "resetCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "restartCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "restartCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "applyCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "applyCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "addCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "addCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "updateCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "updateCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCiscoCatalyst6000E1VoIPGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "getCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCiscoCatalyst6000E1VoIPGatewayRes getCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "getCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "removeCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "removeCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCiscoCatalyst6000E1VoIPGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "listCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCiscoCatalyst6000E1VoIPGatewayRes listCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "listCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "resetCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "resetCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "restartCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "restartCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "applyCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "applyCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayPriRes getCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayPriRes listCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "resetCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "resetCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "restartCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "restartCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "applyCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "applyCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCiscoCatalyst6000T1VoIPGatewayT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayT1Res getCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCiscoCatalyst6000T1VoIPGatewayT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayT1Res listCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "resetCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "resetCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "restartCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "restartCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 applyCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "applyCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "applyCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCallPickupGroup")
    @WebResult(name = "addCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCallPickupGroup(
        @WebParam(name = "addCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCallPickupGroup")
    @WebResult(name = "updateCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCallPickupGroup(
        @WebParam(name = "updateCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCallPickupGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCallPickupGroup")
    @WebResult(name = "getCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCallPickupGroupRes getCallPickupGroup(
        @WebParam(name = "getCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCallPickupGroup")
    @WebResult(name = "removeCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCallPickupGroup(
        @WebParam(name = "removeCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCallPickupGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCallPickupGroup")
    @WebResult(name = "listCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCallPickupGroupRes listCallPickupGroup(
        @WebParam(name = "listCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRoutePlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRoutePlan")
    @WebResult(name = "listRoutePlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRoutePlanRes listRoutePlan(
        @WebParam(name = "listRoutePlan", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRoutePlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGeoLocationPolicy")
    @WebResult(name = "addGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGeoLocationPolicy(
        @WebParam(name = "addGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGeoLocationPolicy")
    @WebResult(name = "updateGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGeoLocationPolicy(
        @WebParam(name = "updateGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGeoLocationPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGeoLocationPolicy")
    @WebResult(name = "getGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGeoLocationPolicyRes getGeoLocationPolicy(
        @WebParam(name = "getGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGeoLocationPolicy")
    @WebResult(name = "removeGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGeoLocationPolicy(
        @WebParam(name = "removeGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListGeoLocationPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listGeoLocationPolicy")
    @WebResult(name = "listGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListGeoLocationPolicyRes listGeoLocationPolicy(
        @WebParam(name = "listGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSipTrunk")
    @WebResult(name = "addSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSipTrunk(
        @WebParam(name = "addSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSipTrunk")
    @WebResult(name = "updateSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSipTrunk(
        @WebParam(name = "updateSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSipTrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSipTrunk")
    @WebResult(name = "getSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSipTrunkRes getSipTrunk(
        @WebParam(name = "getSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSipTrunk")
    @WebResult(name = "removeSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSipTrunk(
        @WebParam(name = "removeSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSipTrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSipTrunk")
    @WebResult(name = "listSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSipTrunkRes listSipTrunk(
        @WebParam(name = "listSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 resetSipTrunk")
    @WebResult(name = "resetSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse resetSipTrunk(
        @WebParam(name = "resetSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 restartSipTrunk")
    @WebResult(name = "restartSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse restartSipTrunk(
        @WebParam(name = "restartSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRegionMatrix")
    @WebResult(name = "updateRegionMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRegionMatrix(
        @WebParam(name = "updateRegionMatrix", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRegionMatrixReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCalledPartyTransformationPattern")
    @WebResult(name = "addCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCalledPartyTransformationPattern(
        @WebParam(name = "addCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCalledPartyTransformationPattern")
    @WebResult(name = "updateCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCalledPartyTransformationPattern(
        @WebParam(name = "updateCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCalledPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCalledPartyTransformationPattern")
    @WebResult(name = "getCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCalledPartyTransformationPatternRes getCalledPartyTransformationPattern(
        @WebParam(name = "getCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCalledPartyTransformationPattern")
    @WebResult(name = "removeCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCalledPartyTransformationPattern(
        @WebParam(name = "removeCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCalledPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCalledPartyTransformationPattern")
    @WebResult(name = "listCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCalledPartyTransformationPatternRes listCalledPartyTransformationPattern(
        @WebParam(name = "listCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addExternalCallControlProfile")
    @WebResult(name = "addExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addExternalCallControlProfile(
        @WebParam(name = "addExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateExternalCallControlProfile")
    @WebResult(name = "updateExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateExternalCallControlProfile(
        @WebParam(name = "updateExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetExternalCallControlProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getExternalCallControlProfile")
    @WebResult(name = "getExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetExternalCallControlProfileRes getExternalCallControlProfile(
        @WebParam(name = "getExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeExternalCallControlProfile")
    @WebResult(name = "removeExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeExternalCallControlProfile(
        @WebParam(name = "removeExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListExternalCallControlProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listExternalCallControlProfile")
    @WebResult(name = "listExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListExternalCallControlProfileRes listExternalCallControlProfile(
        @WebParam(name = "listExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSafSecurityProfile")
    @WebResult(name = "addSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSafSecurityProfile(
        @WebParam(name = "addSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSafSecurityProfile")
    @WebResult(name = "updateSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSafSecurityProfile(
        @WebParam(name = "updateSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSafSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSafSecurityProfile")
    @WebResult(name = "getSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSafSecurityProfileRes getSafSecurityProfile(
        @WebParam(name = "getSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSafSecurityProfile")
    @WebResult(name = "removeSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSafSecurityProfile(
        @WebParam(name = "removeSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSafSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSafSecurityProfile")
    @WebResult(name = "listSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSafSecurityProfileRes listSafSecurityProfile(
        @WebParam(name = "listSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSafForwarder")
    @WebResult(name = "addSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSafForwarder(
        @WebParam(name = "addSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSafForwarder")
    @WebResult(name = "updateSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSafForwarder(
        @WebParam(name = "updateSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSafForwarderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSafForwarder")
    @WebResult(name = "getSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSafForwarderRes getSafForwarder(
        @WebParam(name = "getSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSafForwarder")
    @WebResult(name = "removeSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSafForwarder(
        @WebParam(name = "removeSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSafForwarderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSafForwarder")
    @WebResult(name = "listSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSafForwarderRes listSafForwarder(
        @WebParam(name = "listSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCcdHostedDN")
    @WebResult(name = "addCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCcdHostedDN(
        @WebParam(name = "addCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCcdHostedDN")
    @WebResult(name = "updateCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCcdHostedDN(
        @WebParam(name = "updateCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCcdHostedDNRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCcdHostedDN")
    @WebResult(name = "getCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCcdHostedDNRes getCcdHostedDN(
        @WebParam(name = "getCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCcdHostedDN")
    @WebResult(name = "removeCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCcdHostedDN(
        @WebParam(name = "removeCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCcdHostedDNRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCcdHostedDN")
    @WebResult(name = "listCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCcdHostedDNRes listCcdHostedDN(
        @WebParam(name = "listCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCcdHostedDNGroup")
    @WebResult(name = "addCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCcdHostedDNGroup(
        @WebParam(name = "addCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCcdHostedDNGroup")
    @WebResult(name = "updateCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCcdHostedDNGroup(
        @WebParam(name = "updateCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCcdHostedDNGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCcdHostedDNGroup")
    @WebResult(name = "getCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCcdHostedDNGroupRes getCcdHostedDNGroup(
        @WebParam(name = "getCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCcdHostedDNGroup")
    @WebResult(name = "removeCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCcdHostedDNGroup(
        @WebParam(name = "removeCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCcdHostedDNGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCcdHostedDNGroup")
    @WebResult(name = "listCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCcdHostedDNGroupRes listCcdHostedDNGroup(
        @WebParam(name = "listCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCcdRequestingService")
    @WebResult(name = "addCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCcdRequestingService(
        @WebParam(name = "addCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCcdRequestingService")
    @WebResult(name = "updateCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCcdRequestingService(
        @WebParam(name = "updateCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCcdRequestingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCcdRequestingService")
    @WebResult(name = "getCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCcdRequestingServiceRes getCcdRequestingService(
        @WebParam(name = "getCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCcdRequestingService")
    @WebResult(name = "removeCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCcdRequestingService(
        @WebParam(name = "removeCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateInterClusterServiceProfile")
    @WebResult(name = "updateInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateInterClusterServiceProfile(
        @WebParam(name = "updateInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateInterClusterServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetInterClusterServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getInterClusterServiceProfile")
    @WebResult(name = "getInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetInterClusterServiceProfileRes getInterClusterServiceProfile(
        @WebParam(name = "getInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetInterClusterServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addRemoteCluster")
    @WebResult(name = "addRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addRemoteCluster(
        @WebParam(name = "addRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRemoteCluster")
    @WebResult(name = "updateRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRemoteCluster(
        @WebParam(name = "updateRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getRemoteCluster")
    @WebResult(name = "getRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetRemoteClusterRes getRemoteCluster(
        @WebParam(name = "getRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeRemoteCluster")
    @WebResult(name = "removeRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeRemoteCluster(
        @WebParam(name = "removeRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listRemoteCluster")
    @WebResult(name = "listRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListRemoteClusterRes listRemoteCluster(
        @WebParam(name = "listRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCcdAdvertisingService")
    @WebResult(name = "addCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCcdAdvertisingService(
        @WebParam(name = "addCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCcdAdvertisingService")
    @WebResult(name = "updateCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCcdAdvertisingService(
        @WebParam(name = "updateCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCcdAdvertisingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCcdAdvertisingService")
    @WebResult(name = "getCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCcdAdvertisingServiceRes getCcdAdvertisingService(
        @WebParam(name = "getCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCcdAdvertisingService")
    @WebResult(name = "removeCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCcdAdvertisingService(
        @WebParam(name = "removeCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCcdAdvertisingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCcdAdvertisingService")
    @WebResult(name = "listCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCcdAdvertisingServiceRes listCcdAdvertisingService(
        @WebParam(name = "listCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUnitsToGateway")
    @WebResult(name = "addUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUnitsToGateway(
        @WebParam(name = "addUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUnitsToGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewaySubunits")
    @WebResult(name = "addGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewaySubunits(
        @WebParam(name = "addGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewaySubunitsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLdapDirectory")
    @WebResult(name = "addLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLdapDirectory(
        @WebParam(name = "addLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLdapDirectory")
    @WebResult(name = "updateLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLdapDirectory(
        @WebParam(name = "updateLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapDirectoryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapDirectory")
    @WebResult(name = "getLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapDirectoryRes getLdapDirectory(
        @WebParam(name = "getLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLdapDirectory")
    @WebResult(name = "removeLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLdapDirectory(
        @WebParam(name = "removeLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLdapDirectoryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLdapDirectory")
    @WebResult(name = "listLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLdapDirectoryRes listLdapDirectory(
        @WebParam(name = "listLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateEmccFeatureConfig")
    @WebResult(name = "updateEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateEmccFeatureConfig(
        @WebParam(name = "updateEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateEmccFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetEmccFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getEmccFeatureConfig")
    @WebResult(name = "getEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetEmccFeatureConfigRes getEmccFeatureConfig(
        @WebParam(name = "getEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetEmccFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "addSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "addSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "updateSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "updateSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSafCcdPurgeBlockLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "getSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSafCcdPurgeBlockLearnedRoutesRes getSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "getSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "removeSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "removeSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSafCcdPurgeBlockLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "listSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSafCcdPurgeBlockLearnedRoutesRes listSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "listSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVpnGateway")
    @WebResult(name = "addVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVpnGateway(
        @WebParam(name = "addVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVpnGateway")
    @WebResult(name = "updateVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVpnGateway(
        @WebParam(name = "updateVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVpnGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVpnGateway")
    @WebResult(name = "getVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVpnGatewayRes getVpnGateway(
        @WebParam(name = "getVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVpnGateway")
    @WebResult(name = "removeVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVpnGateway(
        @WebParam(name = "removeVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVpnGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVpnGateway")
    @WebResult(name = "listVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVpnGatewayRes listVpnGateway(
        @WebParam(name = "listVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVpnGroup")
    @WebResult(name = "addVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVpnGroup(
        @WebParam(name = "addVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVpnGroup")
    @WebResult(name = "updateVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVpnGroup(
        @WebParam(name = "updateVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVpnGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVpnGroup")
    @WebResult(name = "getVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVpnGroupRes getVpnGroup(
        @WebParam(name = "getVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVpnGroup")
    @WebResult(name = "removeVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVpnGroup(
        @WebParam(name = "removeVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVpnGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVpnGroup")
    @WebResult(name = "listVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVpnGroupRes listVpnGroup(
        @WebParam(name = "listVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVpnProfile")
    @WebResult(name = "addVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVpnProfile(
        @WebParam(name = "addVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVpnProfile")
    @WebResult(name = "updateVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVpnProfile(
        @WebParam(name = "updateVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVpnProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVpnProfile")
    @WebResult(name = "getVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVpnProfileRes getVpnProfile(
        @WebParam(name = "getVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVpnProfile")
    @WebResult(name = "removeVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVpnProfile(
        @WebParam(name = "removeVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVpnProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVpnProfile")
    @WebResult(name = "listVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVpnProfileRes listVpnProfile(
        @WebParam(name = "listVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeServer")
    @WebResult(name = "addImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeServer(
        @WebParam(name = "addImeServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeServer")
    @WebResult(name = "updateImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeServer(
        @WebParam(name = "updateImeServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeServer")
    @WebResult(name = "getImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeServerRes getImeServer(
        @WebParam(name = "getImeServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeServer")
    @WebResult(name = "removeImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeServer(
        @WebParam(name = "removeImeServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeServer")
    @WebResult(name = "listImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeServerRes listImeServer(
        @WebParam(name = "listImeServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeRouteFilterGroup")
    @WebResult(name = "addImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeRouteFilterGroup(
        @WebParam(name = "addImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeRouteFilterGroup")
    @WebResult(name = "updateImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeRouteFilterGroup(
        @WebParam(name = "updateImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeRouteFilterGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeRouteFilterGroup")
    @WebResult(name = "getImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeRouteFilterGroupRes getImeRouteFilterGroup(
        @WebParam(name = "getImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeRouteFilterGroup")
    @WebResult(name = "removeImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeRouteFilterGroup(
        @WebParam(name = "removeImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeRouteFilterGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeRouteFilterGroup")
    @WebResult(name = "listImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeRouteFilterGroupRes listImeRouteFilterGroup(
        @WebParam(name = "listImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeRouteFilterElement")
    @WebResult(name = "addImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeRouteFilterElement(
        @WebParam(name = "addImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeRouteFilterElement")
    @WebResult(name = "updateImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeRouteFilterElement(
        @WebParam(name = "updateImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeRouteFilterElementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeRouteFilterElement")
    @WebResult(name = "getImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeRouteFilterElementRes getImeRouteFilterElement(
        @WebParam(name = "getImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeRouteFilterElement")
    @WebResult(name = "removeImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeRouteFilterElement(
        @WebParam(name = "removeImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeRouteFilterElementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeRouteFilterElement")
    @WebResult(name = "listImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeRouteFilterElementRes listImeRouteFilterElement(
        @WebParam(name = "listImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeClient")
    @WebResult(name = "addImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeClient(
        @WebParam(name = "addImeClient", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeClient")
    @WebResult(name = "updateImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeClient(
        @WebParam(name = "updateImeClient", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeClientRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeClient")
    @WebResult(name = "getImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeClientRes getImeClient(
        @WebParam(name = "getImeClient", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeClient")
    @WebResult(name = "removeImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeClient(
        @WebParam(name = "removeImeClient", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeClientRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeClient")
    @WebResult(name = "listImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeClientRes listImeClient(
        @WebParam(name = "listImeClient", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeEnrolledPattern")
    @WebResult(name = "addImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeEnrolledPattern(
        @WebParam(name = "addImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeEnrolledPattern")
    @WebResult(name = "updateImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeEnrolledPattern(
        @WebParam(name = "updateImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeEnrolledPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeEnrolledPattern")
    @WebResult(name = "getImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeEnrolledPatternRes getImeEnrolledPattern(
        @WebParam(name = "getImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeEnrolledPattern")
    @WebResult(name = "removeImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeEnrolledPattern(
        @WebParam(name = "removeImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeEnrolledPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeEnrolledPattern")
    @WebResult(name = "listImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeEnrolledPatternRes listImeEnrolledPattern(
        @WebParam(name = "listImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeEnrolledPatternGroup")
    @WebResult(name = "addImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeEnrolledPatternGroup(
        @WebParam(name = "addImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeEnrolledPatternGroup")
    @WebResult(name = "updateImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeEnrolledPatternGroup(
        @WebParam(name = "updateImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeEnrolledPatternGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeEnrolledPatternGroup")
    @WebResult(name = "getImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeEnrolledPatternGroupRes getImeEnrolledPatternGroup(
        @WebParam(name = "getImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeEnrolledPatternGroup")
    @WebResult(name = "removeImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeEnrolledPatternGroup(
        @WebParam(name = "removeImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeEnrolledPatternGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeEnrolledPatternGroup")
    @WebResult(name = "listImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeEnrolledPatternGroupRes listImeEnrolledPatternGroup(
        @WebParam(name = "listImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeExclusionNumber")
    @WebResult(name = "addImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeExclusionNumber(
        @WebParam(name = "addImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeExclusionNumber")
    @WebResult(name = "updateImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeExclusionNumber(
        @WebParam(name = "updateImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeExclusionNumberRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeExclusionNumber")
    @WebResult(name = "getImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeExclusionNumberRes getImeExclusionNumber(
        @WebParam(name = "getImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeExclusionNumber")
    @WebResult(name = "removeImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeExclusionNumber(
        @WebParam(name = "removeImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeExclusionNumberRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeExclusionNumber")
    @WebResult(name = "listImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeExclusionNumberRes listImeExclusionNumber(
        @WebParam(name = "listImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeExclusionNumberGroup")
    @WebResult(name = "addImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeExclusionNumberGroup(
        @WebParam(name = "addImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeExclusionNumberGroup")
    @WebResult(name = "updateImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeExclusionNumberGroup(
        @WebParam(name = "updateImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeExclusionNumberGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeExclusionNumberGroup")
    @WebResult(name = "getImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeExclusionNumberGroupRes getImeExclusionNumberGroup(
        @WebParam(name = "getImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeExclusionNumberGroup")
    @WebResult(name = "removeImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeExclusionNumberGroup(
        @WebParam(name = "removeImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeExclusionNumberGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeExclusionNumberGroup")
    @WebResult(name = "listImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeExclusionNumberGroupRes listImeExclusionNumberGroup(
        @WebParam(name = "listImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeFirewall")
    @WebResult(name = "addImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeFirewall(
        @WebParam(name = "addImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeFirewall")
    @WebResult(name = "updateImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeFirewall(
        @WebParam(name = "updateImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeFirewallRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeFirewall")
    @WebResult(name = "getImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeFirewallRes getImeFirewall(
        @WebParam(name = "getImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeFirewall")
    @WebResult(name = "removeImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeFirewall(
        @WebParam(name = "removeImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeFirewallRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeFirewall")
    @WebResult(name = "listImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeFirewallRes listImeFirewall(
        @WebParam(name = "listImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImeE164Transformation")
    @WebResult(name = "addImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImeE164Transformation(
        @WebParam(name = "addImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeE164Transformation")
    @WebResult(name = "updateImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeE164Transformation(
        @WebParam(name = "updateImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeE164TransformationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeE164Transformation")
    @WebResult(name = "getImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeE164TransformationRes getImeE164Transformation(
        @WebParam(name = "getImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeE164Transformation")
    @WebResult(name = "removeImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeE164Transformation(
        @WebParam(name = "removeImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImeE164TransformationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImeE164Transformation")
    @WebResult(name = "listImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImeE164TransformationRes listImeE164Transformation(
        @WebParam(name = "listImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addTransformationProfile")
    @WebResult(name = "addTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addTransformationProfile(
        @WebParam(name = "addTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTransformationProfile")
    @WebResult(name = "updateTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTransformationProfile(
        @WebParam(name = "updateTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTransformationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTransformationProfile")
    @WebResult(name = "getTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTransformationProfileRes getTransformationProfile(
        @WebParam(name = "getTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeTransformationProfile")
    @WebResult(name = "removeTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeTransformationProfile(
        @WebParam(name = "removeTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTransformationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTransformationProfile")
    @WebResult(name = "listTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTransformationProfileRes listTransformationProfile(
        @WebParam(name = "listTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addFallbackProfile")
    @WebResult(name = "addFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addFallbackProfile(
        @WebParam(name = "addFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFallbackProfile")
    @WebResult(name = "updateFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFallbackProfile(
        @WebParam(name = "updateFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFallbackProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFallbackProfile")
    @WebResult(name = "getFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFallbackProfileRes getFallbackProfile(
        @WebParam(name = "getFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeFallbackProfile")
    @WebResult(name = "removeFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeFallbackProfile(
        @WebParam(name = "removeFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListFallbackProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listFallbackProfile")
    @WebResult(name = "listFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListFallbackProfileRes listFallbackProfile(
        @WebParam(name = "listFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLdapFilter")
    @WebResult(name = "addLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLdapFilter(
        @WebParam(name = "addLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLdapFilter")
    @WebResult(name = "updateLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLdapFilter(
        @WebParam(name = "updateLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapFilter")
    @WebResult(name = "getLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapFilterRes getLdapFilter(
        @WebParam(name = "getLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLdapFilter")
    @WebResult(name = "removeLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLdapFilter(
        @WebParam(name = "removeLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLdapFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLdapFilter")
    @WebResult(name = "listLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLdapFilterRes listLdapFilter(
        @WebParam(name = "listLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAppServerInfo")
    @WebResult(name = "addAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAppServerInfo(
        @WebParam(name = "addAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAppServerInfo")
    @WebResult(name = "updateAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAppServerInfo(
        @WebParam(name = "updateAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateTvsCertificate")
    @WebResult(name = "updateTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateTvsCertificate(
        @WebParam(name = "updateTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetTvsCertificateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getTvsCertificate")
    @WebResult(name = "getTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetTvsCertificateRes getTvsCertificate(
        @WebParam(name = "getTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListTvsCertificateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listTvsCertificate")
    @WebResult(name = "listTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListTvsCertificateRes listTvsCertificate(
        @WebParam(name = "listTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addFeatureControlPolicy")
    @WebResult(name = "addFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addFeatureControlPolicy(
        @WebParam(name = "addFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFeatureControlPolicy")
    @WebResult(name = "updateFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFeatureControlPolicy(
        @WebParam(name = "updateFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFeatureControlPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFeatureControlPolicy")
    @WebResult(name = "getFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFeatureControlPolicyRes getFeatureControlPolicy(
        @WebParam(name = "getFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeFeatureControlPolicy")
    @WebResult(name = "removeFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeFeatureControlPolicy(
        @WebParam(name = "removeFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListFeatureControlPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listFeatureControlPolicy")
    @WebResult(name = "listFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListFeatureControlPolicyRes listFeatureControlPolicy(
        @WebParam(name = "listFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMobilityProfile")
    @WebResult(name = "addMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMobilityProfile(
        @WebParam(name = "addMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMobilityProfile")
    @WebResult(name = "updateMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMobilityProfile(
        @WebParam(name = "updateMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMobilityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMobilityProfile")
    @WebResult(name = "getMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMobilityProfileRes getMobilityProfile(
        @WebParam(name = "getMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeMobilityProfile")
    @WebResult(name = "removeMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeMobilityProfile(
        @WebParam(name = "removeMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListMobilityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listMobilityProfile")
    @WebResult(name = "listMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListMobilityProfileRes listMobilityProfile(
        @WebParam(name = "listMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "addEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "addEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "updateEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "updateEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetEnterpriseFeatureAccessConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "getEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetEnterpriseFeatureAccessConfigurationRes getEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "getEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "removeEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "removeEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListEnterpriseFeatureAccessConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "listEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListEnterpriseFeatureAccessConfigurationRes listEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "listEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addHandoffConfiguration")
    @WebResult(name = "addHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addHandoffConfiguration(
        @WebParam(name = "addHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateHandoffConfiguration")
    @WebResult(name = "updateHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateHandoffConfiguration(
        @WebParam(name = "updateHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetHandoffConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getHandoffConfiguration")
    @WebResult(name = "getHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetHandoffConfigurationRes getHandoffConfiguration(
        @WebParam(name = "getHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeHandoffConfiguration")
    @WebResult(name = "removeHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeHandoffConfiguration(
        @WebParam(name = "removeHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCalledPartyTracing")
    @WebResult(name = "addCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCalledPartyTracing(
        @WebParam(name = "addCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCalledPartyTracing")
    @WebResult(name = "removeCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCalledPartyTracing(
        @WebParam(name = "removeCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCalledPartyTracingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCalledPartyTracing")
    @WebResult(name = "listCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCalledPartyTracingRes listCalledPartyTracing(
        @WebParam(name = "listCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSIPNormalizationScript")
    @WebResult(name = "addSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSIPNormalizationScript(
        @WebParam(name = "addSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSIPNormalizationScript")
    @WebResult(name = "updateSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSIPNormalizationScript(
        @WebParam(name = "updateSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSIPNormalizationScriptRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSIPNormalizationScript")
    @WebResult(name = "getSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSIPNormalizationScriptRes getSIPNormalizationScript(
        @WebParam(name = "getSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSIPNormalizationScript")
    @WebResult(name = "removeSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSIPNormalizationScript(
        @WebParam(name = "removeSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSIPNormalizationScriptRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSIPNormalizationScript")
    @WebResult(name = "listSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSIPNormalizationScriptRes listSIPNormalizationScript(
        @WebParam(name = "listSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCustomUserField")
    @WebResult(name = "addCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCustomUserField(
        @WebParam(name = "addCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCustomUserField")
    @WebResult(name = "updateCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCustomUserField(
        @WebParam(name = "updateCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCustomUserFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCustomUserField")
    @WebResult(name = "getCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCustomUserFieldRes getCustomUserField(
        @WebParam(name = "getCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCustomUserField")
    @WebResult(name = "removeCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCustomUserField(
        @WebParam(name = "removeCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCustomUserFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCustomUserField")
    @WebResult(name = "listCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCustomUserFieldRes listCustomUserField(
        @WebParam(name = "listCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addGatewaySccpEndpoints")
    @WebResult(name = "addGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addGatewaySccpEndpoints(
        @WebParam(name = "addGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateGatewaySccpEndpoints")
    @WebResult(name = "updateGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateGatewaySccpEndpoints(
        @WebParam(name = "updateGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetGatewaySccpEndpointsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getGatewaySccpEndpoints")
    @WebResult(name = "getGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetGatewaySccpEndpointsRes getGatewaySccpEndpoints(
        @WebParam(name = "getGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewaySccpEndpoints")
    @WebResult(name = "removeGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewaySccpEndpoints(
        @WebParam(name = "removeGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addBillingServer")
    @WebResult(name = "addBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addBillingServer(
        @WebParam(name = "addBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListBillingServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listBillingServer")
    @WebResult(name = "listBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListBillingServerRes listBillingServer(
        @WebParam(name = "listBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLbmGroup")
    @WebResult(name = "addLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLbmGroup(
        @WebParam(name = "addLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLbmGroup")
    @WebResult(name = "updateLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLbmGroup(
        @WebParam(name = "updateLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLbmGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLbmGroup")
    @WebResult(name = "getLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLbmGroupRes getLbmGroup(
        @WebParam(name = "getLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLbmGroup")
    @WebResult(name = "removeLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLbmGroup(
        @WebParam(name = "removeLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLbmGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLbmGroup")
    @WebResult(name = "listLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLbmGroupRes listLbmGroup(
        @WebParam(name = "listLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAnnouncement")
    @WebResult(name = "addAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAnnouncement(
        @WebParam(name = "addAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAnnouncement")
    @WebResult(name = "updateAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAnnouncement(
        @WebParam(name = "updateAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAnnouncementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAnnouncement")
    @WebResult(name = "getAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAnnouncementRes getAnnouncement(
        @WebParam(name = "getAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAnnouncement")
    @WebResult(name = "removeAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAnnouncement(
        @WebParam(name = "removeAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAnnouncementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAnnouncement")
    @WebResult(name = "listAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAnnouncementRes listAnnouncement(
        @WebParam(name = "listAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addServiceProfile")
    @WebResult(name = "addServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addServiceProfile(
        @WebParam(name = "addServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateServiceProfile")
    @WebResult(name = "updateServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateServiceProfile(
        @WebParam(name = "updateServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getServiceProfile")
    @WebResult(name = "getServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetServiceProfileRes getServiceProfile(
        @WebParam(name = "getServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeServiceProfile")
    @WebResult(name = "removeServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeServiceProfile(
        @WebParam(name = "removeServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listServiceProfile")
    @WebResult(name = "listServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListServiceProfileRes listServiceProfile(
        @WebParam(name = "listServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLdapSyncCustomField")
    @WebResult(name = "addLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLdapSyncCustomField(
        @WebParam(name = "addLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLdapSyncCustomField")
    @WebResult(name = "updateLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLdapSyncCustomField(
        @WebParam(name = "updateLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapSyncCustomFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapSyncCustomField")
    @WebResult(name = "getLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapSyncCustomFieldRes getLdapSyncCustomField(
        @WebParam(name = "getLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLdapSyncCustomField")
    @WebResult(name = "removeLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLdapSyncCustomField(
        @WebParam(name = "removeLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAudioCodecPreferenceList")
    @WebResult(name = "addAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAudioCodecPreferenceList(
        @WebParam(name = "addAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAudioCodecPreferenceList")
    @WebResult(name = "updateAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAudioCodecPreferenceList(
        @WebParam(name = "updateAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAudioCodecPreferenceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAudioCodecPreferenceList")
    @WebResult(name = "getAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAudioCodecPreferenceListRes getAudioCodecPreferenceList(
        @WebParam(name = "getAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAudioCodecPreferenceList")
    @WebResult(name = "removeAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAudioCodecPreferenceList(
        @WebParam(name = "removeAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAudioCodecPreferenceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAudioCodecPreferenceList")
    @WebResult(name = "listAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAudioCodecPreferenceListRes listAudioCodecPreferenceList(
        @WebParam(name = "listAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUcService")
    @WebResult(name = "addUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUcService(
        @WebParam(name = "addUcService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUcService")
    @WebResult(name = "updateUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUcService(
        @WebParam(name = "updateUcService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUcServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUcService")
    @WebResult(name = "getUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUcServiceRes getUcService(
        @WebParam(name = "getUcService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUcService")
    @WebResult(name = "removeUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUcService(
        @WebParam(name = "removeUcService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUcServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUcService")
    @WebResult(name = "listUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUcServiceRes listUcService(
        @WebParam(name = "listUcService", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLbmHubGroup")
    @WebResult(name = "addLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLbmHubGroup(
        @WebParam(name = "addLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLbmHubGroup")
    @WebResult(name = "updateLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLbmHubGroup(
        @WebParam(name = "updateLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLbmHubGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLbmHubGroup")
    @WebResult(name = "getLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLbmHubGroupRes getLbmHubGroup(
        @WebParam(name = "getLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLbmHubGroup")
    @WebResult(name = "removeLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLbmHubGroup(
        @WebParam(name = "removeLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLbmHubGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLbmHubGroup")
    @WebResult(name = "listLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLbmHubGroupRes listLbmHubGroup(
        @WebParam(name = "listLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addImportedDirectoryUriCatalogs")
    @WebResult(name = "addImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addImportedDirectoryUriCatalogs(
        @WebParam(name = "addImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImportedDirectoryUriCatalogs")
    @WebResult(name = "updateImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImportedDirectoryUriCatalogs(
        @WebParam(name = "updateImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImportedDirectoryUriCatalogsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImportedDirectoryUriCatalogs")
    @WebResult(name = "getImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImportedDirectoryUriCatalogsRes getImportedDirectoryUriCatalogs(
        @WebParam(name = "getImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImportedDirectoryUriCatalogs")
    @WebResult(name = "removeImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImportedDirectoryUriCatalogs(
        @WebParam(name = "removeImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListImportedDirectoryUriCatalogsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listImportedDirectoryUriCatalogs")
    @WebResult(name = "listImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListImportedDirectoryUriCatalogsRes listImportedDirectoryUriCatalogs(
        @WebParam(name = "listImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addVohServer")
    @WebResult(name = "addVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addVohServer(
        @WebParam(name = "addVohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateVohServer")
    @WebResult(name = "updateVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateVohServer(
        @WebParam(name = "updateVohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetVohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getVohServer")
    @WebResult(name = "getVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetVohServerRes getVohServer(
        @WebParam(name = "getVohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeVohServer")
    @WebResult(name = "removeVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeVohServer(
        @WebParam(name = "removeVohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListVohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listVohServer")
    @WebResult(name = "listVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListVohServerRes listVohServer(
        @WebParam(name = "listVohServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSdpTransparencyProfile")
    @WebResult(name = "addSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addSdpTransparencyProfile(
        @WebParam(name = "addSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSdpTransparencyProfile")
    @WebResult(name = "updateSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSdpTransparencyProfile(
        @WebParam(name = "updateSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSdpTransparencyProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSdpTransparencyProfile")
    @WebResult(name = "getSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSdpTransparencyProfileRes getSdpTransparencyProfile(
        @WebParam(name = "getSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSdpTransparencyProfile")
    @WebResult(name = "removeSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeSdpTransparencyProfile(
        @WebParam(name = "removeSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListSdpTransparencyProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listSdpTransparencyProfile")
    @WebResult(name = "listSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListSdpTransparencyProfileRes listSdpTransparencyProfile(
        @WebParam(name = "listSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addFeatureGroupTemplate")
    @WebResult(name = "addFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addFeatureGroupTemplate(
        @WebParam(name = "addFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFeatureGroupTemplate")
    @WebResult(name = "updateFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFeatureGroupTemplate(
        @WebParam(name = "updateFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFeatureGroupTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFeatureGroupTemplate")
    @WebResult(name = "getFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFeatureGroupTemplateRes getFeatureGroupTemplate(
        @WebParam(name = "getFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeFeatureGroupTemplate")
    @WebResult(name = "removeFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeFeatureGroupTemplate(
        @WebParam(name = "removeFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListFeatureGroupTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listFeatureGroupTemplate")
    @WebResult(name = "listFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListFeatureGroupTemplateRes listFeatureGroupTemplate(
        @WebParam(name = "listFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addDirNumberAliasLookupandSync")
    @WebResult(name = "addDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addDirNumberAliasLookupandSync(
        @WebParam(name = "addDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateDirNumberAliasLookupandSync")
    @WebResult(name = "updateDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateDirNumberAliasLookupandSync(
        @WebParam(name = "updateDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetDirNumberAliasLookupandSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getDirNumberAliasLookupandSync")
    @WebResult(name = "getDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetDirNumberAliasLookupandSyncRes getDirNumberAliasLookupandSync(
        @WebParam(name = "getDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeDirNumberAliasLookupandSync")
    @WebResult(name = "removeDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeDirNumberAliasLookupandSync(
        @WebParam(name = "removeDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListDirNumberAliasLookupandSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listDirNumberAliasLookupandSync")
    @WebResult(name = "listDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListDirNumberAliasLookupandSyncRes listDirNumberAliasLookupandSync(
        @WebParam(name = "listDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addLocalRouteGroup")
    @WebResult(name = "addLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addLocalRouteGroup(
        @WebParam(name = "addLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLocalRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLocalRouteGroup")
    @WebResult(name = "getLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLocalRouteGroupRes getLocalRouteGroup(
        @WebParam(name = "getLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLocalRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLocalRouteGroup")
    @WebResult(name = "listLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLocalRouteGroupRes listLocalRouteGroup(
        @WebParam(name = "listLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addAdvertisedPatterns")
    @WebResult(name = "addAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addAdvertisedPatterns(
        @WebParam(name = "addAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateAdvertisedPatterns")
    @WebResult(name = "updateAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateAdvertisedPatterns(
        @WebParam(name = "updateAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAdvertisedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAdvertisedPatterns")
    @WebResult(name = "getAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAdvertisedPatternsRes getAdvertisedPatterns(
        @WebParam(name = "getAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAdvertisedPatterns")
    @WebResult(name = "removeAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAdvertisedPatterns(
        @WebParam(name = "removeAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAdvertisedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAdvertisedPatterns")
    @WebResult(name = "listAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAdvertisedPatternsRes listAdvertisedPatterns(
        @WebParam(name = "listAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addBlockedLearnedPatterns")
    @WebResult(name = "addBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addBlockedLearnedPatterns(
        @WebParam(name = "addBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateBlockedLearnedPatterns")
    @WebResult(name = "updateBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateBlockedLearnedPatterns(
        @WebParam(name = "updateBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetBlockedLearnedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getBlockedLearnedPatterns")
    @WebResult(name = "getBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetBlockedLearnedPatternsRes getBlockedLearnedPatterns(
        @WebParam(name = "getBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeBlockedLearnedPatterns")
    @WebResult(name = "removeBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeBlockedLearnedPatterns(
        @WebParam(name = "removeBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListBlockedLearnedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listBlockedLearnedPatterns")
    @WebResult(name = "listBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListBlockedLearnedPatternsRes listBlockedLearnedPatterns(
        @WebParam(name = "listBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addCCAProfiles")
    @WebResult(name = "addCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addCCAProfiles(
        @WebParam(name = "addCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCCAProfiles")
    @WebResult(name = "updateCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCCAProfiles(
        @WebParam(name = "updateCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCCAProfilesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCCAProfiles")
    @WebResult(name = "getCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCCAProfilesRes getCCAProfiles(
        @WebParam(name = "getCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeCCAProfiles")
    @WebResult(name = "removeCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeCCAProfiles(
        @WebParam(name = "removeCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListCCAProfilesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listCCAProfiles")
    @WebResult(name = "listCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListCCAProfilesRes listCCAProfiles(
        @WebParam(name = "listCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUniversalDeviceTemplate")
    @WebResult(name = "addUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUniversalDeviceTemplate(
        @WebParam(name = "addUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUniversalDeviceTemplate")
    @WebResult(name = "updateUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUniversalDeviceTemplate(
        @WebParam(name = "updateUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUniversalDeviceTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUniversalDeviceTemplate")
    @WebResult(name = "getUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUniversalDeviceTemplateRes getUniversalDeviceTemplate(
        @WebParam(name = "getUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUniversalDeviceTemplate")
    @WebResult(name = "removeUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUniversalDeviceTemplate(
        @WebParam(name = "removeUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUniversalDeviceTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUniversalDeviceTemplate")
    @WebResult(name = "listUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUniversalDeviceTemplateRes listUniversalDeviceTemplate(
        @WebParam(name = "listUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUserProfileProvision")
    @WebResult(name = "addUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUserProfileProvision(
        @WebParam(name = "addUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUserProfileProvision")
    @WebResult(name = "updateUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUserProfileProvision(
        @WebParam(name = "updateUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUserProfileProvisionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUserProfileProvision")
    @WebResult(name = "getUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUserProfileProvisionRes getUserProfileProvision(
        @WebParam(name = "getUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUserProfileProvision")
    @WebResult(name = "removeUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUserProfileProvision(
        @WebParam(name = "removeUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUserProfileProvisionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUserProfileProvision")
    @WebResult(name = "listUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUserProfileProvisionRes listUserProfileProvision(
        @WebParam(name = "listUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addPresenceRedundancyGroup")
    @WebResult(name = "addPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addPresenceRedundancyGroup(
        @WebParam(name = "addPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePresenceRedundancyGroup")
    @WebResult(name = "updatePresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePresenceRedundancyGroup(
        @WebParam(name = "updatePresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPresenceRedundancyGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPresenceRedundancyGroup")
    @WebResult(name = "getPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPresenceRedundancyGroupRes getPresenceRedundancyGroup(
        @WebParam(name = "getPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removePresenceRedundancyGroup")
    @WebResult(name = "removePresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removePresenceRedundancyGroup(
        @WebParam(name = "removePresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListPresenceRedundancyGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listPresenceRedundancyGroup")
    @WebResult(name = "listPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListPresenceRedundancyGroupRes listPresenceRedundancyGroup(
        @WebParam(name = "listPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAssignedPresenceServersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAssignedPresenceServers")
    @WebResult(name = "listAssignedPresenceServersResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAssignedPresenceServersRes listAssignedPresenceServers(
        @WebParam(name = "listAssignedPresenceServers", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAssignedPresenceServersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUnassignedPresenceServersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUnassignedPresenceServers")
    @WebResult(name = "listUnassignedPresenceServersResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUnassignedPresenceServersRes listUnassignedPresenceServers(
        @WebParam(name = "listUnassignedPresenceServers", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUnassignedPresenceServersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListAssignedPresenceUsersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listAssignedPresenceUsers")
    @WebResult(name = "listAssignedPresenceUsersResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListAssignedPresenceUsersRes listAssignedPresenceUsers(
        @WebParam(name = "listAssignedPresenceUsers", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListAssignedPresenceUsersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUnassignedPresenceUsersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUnassignedPresenceUsers")
    @WebResult(name = "listUnassignedPresenceUsersResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUnassignedPresenceUsersRes listUnassignedPresenceUsers(
        @WebParam(name = "listUnassignedPresenceUsers", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUnassignedPresenceUsersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addWifiHotspot")
    @WebResult(name = "addWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addWifiHotspot(
        @WebParam(name = "addWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateWifiHotspot")
    @WebResult(name = "updateWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateWifiHotspot(
        @WebParam(name = "updateWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetWifiHotspotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getWifiHotspot")
    @WebResult(name = "getWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetWifiHotspotRes getWifiHotspot(
        @WebParam(name = "getWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeWifiHotspot")
    @WebResult(name = "removeWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeWifiHotspot(
        @WebParam(name = "removeWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListWifiHotspotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listWifiHotspot")
    @WebResult(name = "listWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListWifiHotspotRes listWifiHotspot(
        @WebParam(name = "listWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addWlanProfileGroup")
    @WebResult(name = "addWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addWlanProfileGroup(
        @WebParam(name = "addWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateWlanProfileGroup")
    @WebResult(name = "updateWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateWlanProfileGroup(
        @WebParam(name = "updateWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetWlanProfileGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getWlanProfileGroup")
    @WebResult(name = "getWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetWlanProfileGroupRes getWlanProfileGroup(
        @WebParam(name = "getWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeWlanProfileGroup")
    @WebResult(name = "removeWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeWlanProfileGroup(
        @WebParam(name = "removeWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListWlanProfileGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listWlanProfileGroup")
    @WebResult(name = "listWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListWlanProfileGroupRes listWlanProfileGroup(
        @WebParam(name = "listWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addWLANProfile")
    @WebResult(name = "addWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addWLANProfile(
        @WebParam(name = "addWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateWLANProfile")
    @WebResult(name = "updateWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateWLANProfile(
        @WebParam(name = "updateWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetWLANProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getWLANProfile")
    @WebResult(name = "getWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetWLANProfileRes getWLANProfile(
        @WebParam(name = "getWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeWLANProfile")
    @WebResult(name = "removeWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeWLANProfile(
        @WebParam(name = "removeWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListWLANProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listWLANProfile")
    @WebResult(name = "listWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListWLANProfileRes listWLANProfile(
        @WebParam(name = "listWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addUniversalLineTemplate")
    @WebResult(name = "addUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addUniversalLineTemplate(
        @WebParam(name = "addUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateUniversalLineTemplate")
    @WebResult(name = "updateUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateUniversalLineTemplate(
        @WebParam(name = "updateUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetUniversalLineTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getUniversalLineTemplate")
    @WebResult(name = "getUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetUniversalLineTemplateRes getUniversalLineTemplate(
        @WebParam(name = "getUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUniversalLineTemplate")
    @WebResult(name = "removeUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUniversalLineTemplate(
        @WebParam(name = "removeUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListUniversalLineTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listUniversalLineTemplate")
    @WebResult(name = "listUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListUniversalLineTemplateRes listUniversalLineTemplate(
        @WebParam(name = "listUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addNetworkAccessProfile")
    @WebResult(name = "addNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addNetworkAccessProfile(
        @WebParam(name = "addNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateNetworkAccessProfile")
    @WebResult(name = "updateNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateNetworkAccessProfile(
        @WebParam(name = "updateNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetNetworkAccessProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getNetworkAccessProfile")
    @WebResult(name = "getNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetNetworkAccessProfileRes getNetworkAccessProfile(
        @WebParam(name = "getNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeNetworkAccessProfile")
    @WebResult(name = "removeNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeNetworkAccessProfile(
        @WebParam(name = "removeNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListNetworkAccessProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listNetworkAccessProfile")
    @WebResult(name = "listNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListNetworkAccessProfileRes listNetworkAccessProfile(
        @WebParam(name = "listNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLicensedUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLicensedUser")
    @WebResult(name = "getLicensedUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLicensedUserRes getLicensedUser(
        @WebParam(name = "getLicensedUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLicensedUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ExecuteSQLQueryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 executeSQLQuery")
    @WebResult(name = "executeSQLQueryResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ExecuteSQLQueryRes executeSQLQuery(
        @WebParam(name = "executeSQLQuery", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ExecuteSQLQueryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ExecuteSQLUpdateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 executeSQLUpdate")
    @WebResult(name = "executeSQLUpdateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ExecuteSQLUpdateRes executeSQLUpdate(
        @WebParam(name = "executeSQLUpdate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ExecuteSQLUpdateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoAuthenticateUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doAuthenticateUser")
    @WebResult(name = "doAuthenticateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoAuthenticateUserRes doAuthenticateUser(
        @WebParam(name = "doAuthenticateUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoAuthenticateUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoDeviceLoginRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doDeviceLogin")
    @WebResult(name = "doDeviceLoginResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoDeviceLoginRes doDeviceLogin(
        @WebParam(name = "doDeviceLogin", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoDeviceLoginReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoDeviceLogoutRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doDeviceLogout")
    @WebResult(name = "doDeviceLogoutResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoDeviceLogoutRes doDeviceLogout(
        @WebParam(name = "doDeviceLogout", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoDeviceLogoutReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoDeviceResetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doDeviceReset")
    @WebResult(name = "doDeviceResetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoDeviceResetRes doDeviceReset(
        @WebParam(name = "doDeviceReset", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoDeviceResetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetOSVersionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getOSVersion")
    @WebResult(name = "getOSVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetOSVersionRes getOSVersion(
        @WebParam(name = "getOSVersion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetOSVersionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetNumDevicesResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getNumDevices")
    @WebResult(name = "getNumDevicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetNumDevicesResponse getNumDevices(
        @WebParam(name = "getNumDevices", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetNumDevicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addMobility")
    @WebResult(name = "addMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addMobility(
        @WebParam(name = "addMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateMobility")
    @WebResult(name = "updateMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateMobility(
        @WebParam(name = "updateMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getMobility")
    @WebResult(name = "getMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetMobilityRes getMobility(
        @WebParam(name = "getMobility", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetEnterprisePhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getEnterprisePhoneConfig")
    @WebResult(name = "getEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetEnterprisePhoneConfigRes getEnterprisePhoneConfig(
        @WebParam(name = "getEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetEnterprisePhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateEnterprisePhoneConfig")
    @WebResult(name = "updateEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateEnterprisePhoneConfig(
        @WebParam(name = "updateEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateEnterprisePhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapSystemRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapSystem")
    @WebResult(name = "getLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapSystemRes getLdapSystem(
        @WebParam(name = "getLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapSystemReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLdapSystem")
    @WebResult(name = "updateLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLdapSystem(
        @WebParam(name = "updateLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLdapSystemReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapAuthenticationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapAuthentication")
    @WebResult(name = "getLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapAuthenticationRes getLdapAuthentication(
        @WebParam(name = "getLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapAuthenticationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLdapAuthentication")
    @WebResult(name = "updateLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLdapAuthentication(
        @WebParam(name = "updateLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLdapAuthenticationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addApplicationToSoftkeyTemplate")
    @WebResult(name = "addApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse addApplicationToSoftkeyTemplate(
        @WebParam(name = "addApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddApplicationToSoftkeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeApplicationToSoftkeyTemplate")
    @WebResult(name = "removeApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeApplicationToSoftkeyTemplate(
        @WebParam(name = "removeApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveApplicationToSoftkeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCCMVersionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCCMVersion")
    @WebResult(name = "getCCMVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCCMVersionRes getCCMVersion(
        @WebParam(name = "getCCMVersion", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCCMVersionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeUnitsToGateway")
    @WebResult(name = "removeUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeUnitsToGateway(
        @WebParam(name = "removeUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveUnitsToGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeGatewaySubunits")
    @WebResult(name = "removeGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeGatewaySubunits(
        @WebParam(name = "removeGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveGatewaySubunitsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeFeatureConfig")
    @WebResult(name = "updateImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeFeatureConfig(
        @WebParam(name = "updateImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateFallbackFeatureConfig")
    @WebResult(name = "updateFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateFallbackFeatureConfig(
        @WebParam(name = "updateFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateFallbackFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeImeLearnedRoutes")
    @WebResult(name = "removeImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeImeLearnedRoutes(
        @WebParam(name = "removeImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateImeLearnedRoutes")
    @WebResult(name = "updateImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateImeLearnedRoutes(
        @WebParam(name = "updateImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeLearnedRoutes")
    @WebResult(name = "getImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeLearnedRoutesRes getImeLearnedRoutes(
        @WebParam(name = "getImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetImeFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getImeFeatureConfig")
    @WebResult(name = "getImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetImeFeatureConfigRes getImeFeatureConfig(
        @WebParam(name = "getImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetImeFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetFallbackFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getFallbackFeatureConfig")
    @WebResult(name = "getFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetFallbackFeatureConfigRes getFallbackFeatureConfig(
        @WebParam(name = "getFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetFallbackFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetAppServerInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getAppServerInfo")
    @WebResult(name = "getAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetAppServerInfoRes getAppServerInfo(
        @WebParam(name = "getAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeAppServerInfo")
    @WebResult(name = "removeAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeAppServerInfo(
        @WebParam(name = "removeAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoLdapSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doLdapSync")
    @WebResult(name = "doLdapSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoLdapSyncRes doLdapSync(
        @WebParam(name = "doLdapSync", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoLdapSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetLdapSyncStatusRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getLdapSyncStatus")
    @WebResult(name = "getLdapSyncStatusResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetLdapSyncStatusRes getLdapSyncStatus(
        @WebParam(name = "getLdapSyncStatus", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetLdapSyncStatusReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSoftKeySet")
    @WebResult(name = "updateSoftKeySetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSoftKeySet(
        @WebParam(name = "updateSoftKeySet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSoftKeySetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSoftKeySetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSoftKeySet")
    @WebResult(name = "getSoftKeySetResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSoftKeySetRes getSoftKeySet(
        @WebParam(name = "getSoftKeySet", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSoftKeySetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoUpdateRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doUpdateRemoteCluster")
    @WebResult(name = "doUpdateRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoUpdateRemoteClusterRes doUpdateRemoteCluster(
        @WebParam(name = "doUpdateRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoUpdateRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.UpdateSyslogConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSyslogConfiguration")
    @WebResult(name = "updateSyslogConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public UpdateSyslogConfigurationRes updateSyslogConfiguration(
        @WebParam(name = "updateSyslogConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSyslogConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSyslogConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSyslogConfiguration")
    @WebResult(name = "getSyslogConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSyslogConfigurationRes getSyslogConfiguration(
        @WebParam(name = "getSyslogConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSyslogConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListLdapSyncCustomFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listLdapSyncCustomField")
    @WebResult(name = "listLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListLdapSyncCustomFieldRes listLdapSyncCustomField(
        @WebParam(name = "listLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPhoneTypeDisplayInstanceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPhoneTypeDisplayInstance")
    @WebResult(name = "getPhoneTypeDisplayInstanceResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPhoneTypeDisplayInstanceRes getPhoneTypeDisplayInstance(
        @WebParam(name = "getPhoneTypeDisplayInstance", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPhoneTypeDisplayInstanceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateInterClusterDirectoryUri")
    @WebResult(name = "updateInterClusterDirectoryUriResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateInterClusterDirectoryUri(
        @WebParam(name = "updateInterClusterDirectoryUri", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateInterClusterDirectoryUriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateIlsConfig")
    @WebResult(name = "updateIlsConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateIlsConfig(
        @WebParam(name = "updateIlsConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateIlsConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetIlsConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getIlsConfig")
    @WebResult(name = "getIlsConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetIlsConfigRes getIlsConfig(
        @WebParam(name = "getIlsConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetIlsConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.AddSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSNMPCommunityString")
    @WebResult(name = "addSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public AddSNMPCommunityStringRes addSNMPCommunityString(
        @WebParam(name = "addSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.RemoveSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSNMPCommunityString")
    @WebResult(name = "removeSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public RemoveSNMPCommunityStringRes removeSNMPCommunityString(
        @WebParam(name = "removeSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSNMPCommunityString")
    @WebResult(name = "getSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSNMPCommunityStringRes getSNMPCommunityString(
        @WebParam(name = "getSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.UpdateSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSNMPCommunityString")
    @WebResult(name = "updateSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public UpdateSNMPCommunityStringRes updateSNMPCommunityString(
        @WebParam(name = "updateSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.AddSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 addSNMPUser")
    @WebResult(name = "addSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public AddSNMPUserRes addSNMPUser(
        @WebParam(name = "addSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AddSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSNMPUser")
    @WebResult(name = "getSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSNMPUserRes getSNMPUser(
        @WebParam(name = "getSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.RemoveSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeSNMPUser")
    @WebResult(name = "removeSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public RemoveSNMPUserRes removeSNMPUser(
        @WebParam(name = "removeSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.UpdateSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSNMPUser")
    @WebResult(name = "updateSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public UpdateSNMPUserRes updateSNMPUser(
        @WebParam(name = "updateSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetSNMPMIB2ListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getSNMPMIB2List")
    @WebResult(name = "getSNMPMIB2ListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetSNMPMIB2ListRes getSNMPMIB2List(
        @WebParam(name = "getSNMPMIB2List", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetSNMPMIB2ListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.UpdateSNMPMIB2ListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSNMPMIB2List")
    @WebResult(name = "updateSNMPMIB2ListResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public UpdateSNMPMIB2ListRes updateSNMPMIB2List(
        @WebParam(name = "updateSNMPMIB2List", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSNMPMIB2ListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateBillingServer")
    @WebResult(name = "updateBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateBillingServer(
        @WebParam(name = "updateBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetBillingServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getBillingServer")
    @WebResult(name = "getBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetBillingServerRes getBillingServer(
        @WebParam(name = "getBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeBillingServer")
    @WebResult(name = "removeBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeBillingServer(
        @WebParam(name = "removeBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.UpdateCcdFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCcdFeatureConfig")
    @WebResult(name = "updateCcdFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public UpdateCcdFeatureConfigRes updateCcdFeatureConfig(
        @WebParam(name = "updateCcdFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCcdFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCcdFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCcdFeatureConfig")
    @WebResult(name = "getCcdFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCcdFeatureConfigRes getCcdFeatureConfig(
        @WebParam(name = "getCcdFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCcdFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateRoutePartitionsForLearnedPatterns")
    @WebResult(name = "updateRoutePartitionsForLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateRoutePartitionsForLearnedPatterns(
        @WebParam(name = "updateRoutePartitionsForLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateRoutePartitionsForLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateLocalRouteGroup")
    @WebResult(name = "updateLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateLocalRouteGroup(
        @WebParam(name = "updateLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 removeLocalRouteGroup")
    @WebResult(name = "removeLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse removeLocalRouteGroup(
        @WebParam(name = "removeLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        RemoveLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updatePageLayoutPreferences")
    @WebResult(name = "updatePageLayoutPreferencesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updatePageLayoutPreferences(
        @WebParam(name = "updatePageLayoutPreferences", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdatePageLayoutPreferencesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetPageLayoutPreferencesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getPageLayoutPreferences")
    @WebResult(name = "getPageLayoutPreferencesResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetPageLayoutPreferencesRes getPageLayoutPreferences(
        @WebParam(name = "getPageLayoutPreferences", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetPageLayoutPreferencesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 assignPresenceUser")
    @WebResult(name = "assignPresenceUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse assignPresenceUser(
        @WebParam(name = "assignPresenceUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        AssignPresenceUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 unassignPresenceUser")
    @WebResult(name = "unassignPresenceUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse unassignPresenceUser(
        @WebParam(name = "unassignPresenceUser", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UnassignPresenceUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.GetCredentialPolicyDefaultRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 getCredentialPolicyDefault")
    @WebResult(name = "getCredentialPolicyDefaultResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public GetCredentialPolicyDefaultRes getCredentialPolicyDefault(
        @WebParam(name = "getCredentialPolicyDefault", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        GetCredentialPolicyDefaultReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateCredentialPolicyDefault")
    @WebResult(name = "updateCredentialPolicyDefaultResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateCredentialPolicyDefault(
        @WebParam(name = "updateCredentialPolicyDefault", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateCredentialPolicyDefaultReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 updateSelfProvisioning")
    @WebResult(name = "updateSelfProvisioningResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public StandardResponse updateSelfProvisioning(
        @WebParam(name = "updateSelfProvisioning", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        UpdateSelfProvisioningReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.ListChangeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 listChange")
    @WebResult(name = "listChangeResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public ListChangeRes listChange(
        @WebParam(name = "listChange", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        ListChangeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._10.DoChangeDNDStatusRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=10.5 doChangeDNDStatus")
    @WebResult(name = "doChangeDNDStatusResponse", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
    public DoChangeDNDStatusRes doChangeDNDStatus(
        @WebParam(name = "doChangeDNDStatus", targetNamespace = "http://www.cisco.com/AXL/API/10.5", partName = "axlParams")
        DoChangeDNDStatusReq axlParams)
        throws AXLError
    ;

}
