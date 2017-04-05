/**
* Party ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D812BC602C5-content.html">Party ABE</a> 
* A Party represents an individual or an organization, or an organizatio 
* n unit that are of interest, involved or that provide value directly o 
* r indirectly from an enterprise perspective (Enterprise is to be under 
* stood here as provider, service provider or operator). Hence the Party 
*  plays one or more roles with the enterprise or with another Party pla 
* ying a role with the enterprise (indirectly). This is introduced to sp 
* ecify that the only party an enterprise would be interested in and wil 
* l consider in its systems is a party playing a role (directly or indir 
* ectly). Roles would be represented by the PartyRole concept. Additiona 
* l roles will be defined to cover the needs of the new digital ecosyste 
* m."Examples of roles played by Parties include those:•&nbsp;&nbsp;&nbs 
* p;&nbsp;Of interest, such as competitors, sales prospects •&nbsp;&nbsp 
* ;&nbsp;&nbsp;Involved, such as customers, users, employees•&nbsp;&nbsp 
* ;&nbsp;&nbsp;That provides value directly or indirectly, such as servi 
* ce providers, operators, cloud brokers, infrastructure providers, appl 
* ication developers. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_business_entity ;

import com.sun.deploy.model.Resource;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.sun.prism.Texture;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionVersion;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.PartyInteractionRole;
import org.tmforum.common_business_entities_domain.calendar_business_entity.Calendar;
import org.tmforum.common_business_entities_domain.calendar_business_entity.CalendarEntry;
import org.tmforum.common_business_entities_domain.calendar_business_entity.CalendarPartyRole;
import org.tmforum.common_business_entities_domain.location_abe.geographic_place_business_entity.AdministrativeArea;
import org.tmforum.common_business_entities_domain.location_business_entity.Place;
import org.tmforum.common_business_entities_domain.metric_abe.metric_definition_business_entity.MetricDefinitionInvolvement;
import org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_business_entity.MetricMeasurementObservation;
import org.tmforum.common_business_entities_domain.performance_business_entity.Performance;
import org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity.ProjectElement;
import org.tmforum.common_business_entities_domain.project_abe.project_resource_business_entity.ProjectResource;
import org.tmforum.common_business_entities_domain.project_abe.work_order_business_entity.WorkOrder;
import org.tmforum.common_business_entities_domain.project_business_entity.PartyResource;
import org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity.CharacteristicValue;
import org.tmforum.common_business_entities_domain.users_and_roles_business_entity.InvolvementRole;
import org.tmforum.customer_domain.customer_business_entity.CustCreditProfileReference;
import org.tmforum.customer_domain.customer_business_entity.CustomerAccount;
import org.tmforum.customer_domain.customer_business_entity.CustomerAccountContact;
import org.tmforum.customer_domain.customer_order_business_entity.CustomerOrder;
import org.tmforum.customer_domain.customer_order_business_entity.CustomerOrderItem;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.AdditionalPartyAttributes;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyAccount;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyAccountContact;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyCreditProfile;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyCreditProfileReference;
import org.tmforum.engaged_party_domain.agreement_abe.commitment_business_entity.CommitmentFulfilmentRole;
import org.tmforum.engaged_party_domain.agreement_abe.commitment_business_entity.CommitmentProcurementRole;
import org.tmforum.engaged_party_domain.party_abe.contact_business_entity.ContactMedium;
import org.tmforum.engaged_party_domain.party_abe.party_demographic_business_entity.PartyDemographic;
import org.tmforum.engaged_party_domain.party_abe.party_profile_business_entity.PartyProfile;
import org.tmforum.engaged_party_domain.party_abe.party_role_group_business_entity.PartyRoleGroup;
import org.tmforum.engaged_party_domain.party_abe.skill_business_entity.Skill;
import org.tmforum.engaged_party_domain.party_abe.skill_business_entity.SkillSpecification;
import org.tmforum.engaged_party_domain.party_order_business_entity.PartyOrder;
import org.tmforum.engaged_party_domain.party_order_business_entity.PartyOrderItem;
import org.tmforum.engaged_party_domain.party_privacy_abe.party_privacy_profile_business_entity.PartyPrivacyProfile;
import org.tmforum.engaged_party_domain.party_privacy_abe.party_privacy_profile_business_entity.PartyPrivacyProfileCharValue;
import org.tmforum.engaged_party_domain.party_product_specification_and_offering_abe.party_role_product_offering_business_entity.PartyRoleProductOffering;
import org.tmforum.engaged_party_domain.party_product_specification_and_offering_abe.party_role_product_specification_business_entity.PartyRoleProductSpecification;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity.PaymentMethod;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity.PartyPayment;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_settlement_business_entity.PartySettlementRole;
import org.tmforum.enterprise_domain.enterprise_effectiveness_abe.business_objective_business_entity.BusinessObjective;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_entity_business_entity.PartyRoleSecurityEntity;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity.SecurityEventCollectionMethod;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_business_entity.PartyRoleSecurityThreatActor;
import org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_assessment_business_entity.RevenueAssuranceAssessment;
import org.tmforum.market_sales_domain.competitor_abe.competitor_intelligence_business_entity.CompetitorIntelligence;
import org.tmforum.market_sales_domain.competitor_business_entity.Competitor;
import org.tmforum.market_sales_domain.market_segment_abe.market_statistic_business_entity.MarketStatistic;
import org.tmforum.product_domain.product_abe.product_price_business_entity.ProductPricePartyRole;
import org.tmforum.product_domain.product_offering_business_entity.ProductOffering;
import org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity.SoftwareResource;
import org.tmforum.resource_domain.resource_business_entity.ResourceRole;
import org.tmforum.service_domain.service_business_entity.Service;

import java.util.List;

/**
* The part played by a party in a given context with any characteristics 
* , such as expected pattern of behavior, attributes, and/or association 
* s that it entails.PartyRole is an abstract concept that should be used 
*  in places where the business refers to a Party playing a Role 
 @since SID_R16.5
*/ 

public  class PartyRole  {



/**  
* Field partyInteractionRole
*/
protected List<PartyInteractionRole> partyInteractionRole ;




/**  
* Field businessInteractionVersion
*/
protected List<BusinessInteractionVersion> businessInteractionVersion ;




/**  
* Field administrativeArea
*/
protected List<AdministrativeArea> administrativeArea ;




/**  
* Field partyRoleSpecification
*/
protected PartyRoleSpecification partyRoleSpecification ;




/**  
* Field party
*/
protected Party party ;




/**  
* Field partyRoleCategory
*/
protected List<PartyRoleCategory> partyRoleCategory ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field contactMedium
*/
protected List<ContactMedium> contactMedium ;




/**  
* Field partyRoleId
* Unique identifier for PartyRoles 

*/
protected String partyRoleId ;




/**  
* Field status
* Used to track the lifecycle status, e.g. existing, prospective or form 

* er customers. 

*/
protected String status ;




/**  
* Field validFor
* The time period that the PartyRole is valid for 

*/
protected TimePeriod validFor ;




/**  
* Field name
* A word, term, or phrase by which the PartyRole is known and distinguis 

* hed from other PartyRoles. 

*/
protected String name ;




/**  
* Field projectResource
*/
protected List<ProjectResource> projectResource ;




/**  
* Field partyResource
*/
protected PartyResource partyResource ;




/**  
* Field workOrder
*/
protected List<WorkOrder> workOrder ;




/**  
* Field projectElement
*/
protected List<ProjectElement> projectElement ;




/**  
* Field calendarEntry
*/
protected List<CalendarEntry> calendarEntry ;




/**  
* Field calendar
*/
protected List<Calendar> calendar ;




/**  
* Field calendarPartyRole
*/
protected List<CalendarPartyRole> calendarPartyRole ;




/**  
* Field calendarEntryParticipation
*/
protected List<CalendarEntryParticipation> calendarEntryParticipation ;




/**  
* Field usage
*/
protected List<Texture.Usage> usage ;




/**  
* Field softwareResource
*/
protected List<SoftwareResource> softwareResource ;




/**  
* Field softwareResource1
*/
protected List<SoftwareResource> softwareResource1 ;




/**  
* Field resourceRole
*/
protected List<ResourceRole> resourceRole ;




/**  
* Field revenueAssuranceAssessment
*/
protected List<RevenueAssuranceAssessment> revenueAssuranceAssessment ;




/**  
* Field partyDemographic
*/
protected List<PartyDemographic> partyDemographic ;




/**  
* Field partyProfile
*/
protected List<PartyProfile> partyProfile ;




/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;




/**  
* Field competitor
*/
protected List<Competitor> competitor ;




/**  
* Field competitorIntelligence
*/
protected List<CompetitorIntelligence> competitorIntelligence ;




/**  
* Field productPricePartyRole
*/
protected List<ProductPricePartyRole> productPricePartyRole ;




/**  
* Field partyRoleSecurityEntity
*/
protected PartyRoleSecurityEntity partyRoleSecurityEntity ;




/**  
* Field partyRoleSecurityThreatActor
*/
protected PartyRoleSecurityThreatActor partyRoleSecurityThreatActor ;




/**  
* Field securityEventCollectionMethod
*/
protected List<SecurityEventCollectionMethod> securityEventCollectionMethod ;




/**  
* Field businessObjective
*/
protected BusinessObjective businessObjective ;




/**  
* Field partyRoleAssociation
*/
protected List<PartyRoleAssociation> partyRoleAssociation ;




/**  
* Field partyRoleAssociation2
*/
protected List<PartyRoleAssociation> partyRoleAssociation2 ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field service
*/
protected List<Service> service ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field skillSpec
*/
protected List<SkillSpecification> skillSpec ;




/**  
* Field skill
*/
protected List<Skill> skill ;




/**  
* Field involvementRole
*/
protected List<InvolvementRole> involvementRole ;




/**  
* Field metricDefinitionInvolvement
*/
protected List<MetricDefinitionInvolvement> metricDefinitionInvolvement ;




/**  
* Field customerAccountContact
*/
protected List<CustomerAccountContact> customerAccountContact ;




/**  
* Field custCreditProfileReference
*/
protected List<CustCreditProfileReference> custCreditProfileReference ;




/**  
* Field custCreditProfileReference2
*/
protected List<CustCreditProfileReference> custCreditProfileReference2 ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyCreditProfile
*/
protected List<PartyCreditProfile> partyCreditProfile ;




/**  
* Field partyCreditProfileReference
*/
protected List<PartyCreditProfileReference> partyCreditProfileReference ;




/**  
* Field partyCreditProfileReference2
*/
protected List<PartyCreditProfileReference> partyCreditProfileReference2 ;




/**  
* Field partyAccountContact
*/
protected List<PartyAccountContact> partyAccountContact ;




/**  
* Field additionalPartyAttributes
*/
protected AdditionalPartyAttributes additionalPartyAttributes ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field performance
*/
protected List<Performance> performance ;




/**  
* Field resource1
*/
protected List<Resource> resource1 ;




/**  
* Field service1
*/
protected List<Service> service1 ;




/**  
* Field metricMeasurementObservation
*/
protected List<MetricMeasurementObservation> metricMeasurementObservation ;




/**  
* Field partySettlementRole
*/
protected List<PartySettlementRole> partySettlementRole ;




/**  
* Field partyPayment2
*/
protected List<PartyPayment> partyPayment2 ;




/**  
* Field partyRoleProductSpecification
*/
protected List<PartyRoleProductSpecification> partyRoleProductSpecification ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;




/**  
* Field catalog
*/
protected List<Catalog> catalog ;




/**  
* Field commitmentFulfilmentRole
*/
protected List<CommitmentFulfilmentRole> commitmentFulfilmentRole ;




/**  
* Field commitmentProcurementRole
*/
protected List<CommitmentProcurementRole> commitmentProcurementRole ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field partyPrivacyProfile
*/
protected List<PartyPrivacyProfile> partyPrivacyProfile ;




/**  
* Field partyPrivacyProfileCharValue
*/
protected List<PartyPrivacyProfileCharValue> partyPrivacyProfileCharValue ;




/**  
* Field paymentMethod
*/
protected List<PaymentMethod> paymentMethod ;




/**  
* Field partyRoleCurrency
*/
protected List<PartyRoleCurrency> partyRoleCurrency ;




/**  
* Field partyOrder
*/
protected List<PartyOrder> partyOrder ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field customerOrder
*/
protected List<CustomerOrder> customerOrder ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field partyRoleGroup
*/
protected PartyRoleGroup partyRoleGroup ;


}