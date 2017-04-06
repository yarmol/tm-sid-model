/**
* Product Offering ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA620398-content.html">Product Offering ABE</a> 
* The Product Offering ABE describes tangible and intangible goods made  
* available for a certain price to the market in the form of product cat 
* alogs.  This ABE is also responsible for targeting market segments bas 
* ed on the appropriate market strategy. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionItem;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ProductCapacity;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ProductCapacityDemand;
import org.tmforum.common_business_entities_domain.location_business_entity.Place;
import org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity.PolicySet;
import org.tmforum.customer_domain.customer_order_business_entity.CustomerOrderItem;
import org.tmforum.engaged_party_domain.party_abe.party_demographic_business_entity.PartyDemographic;
import org.tmforum.engaged_party_domain.party_abe.party_profile_business_entity.PartyProfileType;
import org.tmforum.engaged_party_domain.party_abe.party_profile_business_entity.PartyProfileTypeCharacteristic;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.engaged_party_domain.party_order_business_entity.PartyOrderItem;
import org.tmforum.engaged_party_domain.party_privacy_abe.party_privacy_profile_type_business_entity.PartyPrivacyProfileType;
import org.tmforum.engaged_party_domain.party_product_specification_and_offering_abe.party_role_product_offering_business_entity.PartyRoleProductOffering;
import org.tmforum.market_sales_domain.competitor_abe.competitor_intelligence_business_entity.CompetitorIntelligence;
import org.tmforum.market_sales_domain.market_segment_abe.market_statistic_business_entity.MarketStatistic;
import org.tmforum.market_sales_domain.market_segment_business_entity.MarketSegment;
import org.tmforum.market_sales_domain.market_segment_business_entity.MarketSegmentCharacteristic;
import org.tmforum.market_sales_domain.market_strategy_plan_business_entity.MarketStrategy;
import org.tmforum.market_sales_domain.sales_channel_business_entity.SalesChannel;
import org.tmforum.product_domain.product_business_entity.Product;
import org.tmforum.product_domain.product_configuration_abe.product_action_business_entity.AllowedProductAction;
import org.tmforum.product_domain.product_offering_abe.product_catalog_business_entity.ProdCatProdOffer;
import org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity.ProductOfferingPrice;
import org.tmforum.product_domain.product_offering_abe.product_offering_price_rule_business_entity.ProdOfferPricePolicyVariable;
import org.tmforum.product_domain.product_specification_business_entity.ProductSpecification;
import org.tmforum.product_domain.strategic_product_portfolio_plan_business_entity.ProductOfferingStrategy;
import org.tmforum.resource_domain.resource_specification_abe.resource_catalog_business_entity.ResourceCandidate;
import org.tmforum.service_domain.service_performance_abe.service_level_spec_business_entity.ServiceLevelSpecification;
import org.tmforum.service_domain.service_specification_abe.service_catalog_business_entity.ServiceCandidate;

import java.util.List;

/**
* The presentation of one or more ProductSpecifications to the marketpla 
* ce for sale, rental, or lease for a ProductOfferingPrice. A ProductOff 
* ering may target one or more MarketSegments, be included in one or mor 
* e ProductCatalog, presented in support of one or more ProductStrategie 
* s, and made available in one or more Places. ProductOffering may repre 
* sent a simple offering of a single ProductSpecification or could repre 
* sent a bundling of one or more other ProductOffering. 
 @since SID_R16.5
*/ 

public abstract class ProductOffering  {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;




/**  
* Field marketSegmentCharacteristic
*/
protected List<MarketSegmentCharacteristic> marketSegmentCharacteristic ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field partyDemographic
*/
protected List<PartyDemographic> partyDemographic ;




/**  
* Field partyProfileTypeCharacteristic
*/
protected List<PartyProfileTypeCharacteristic> partyProfileTypeCharacteristic ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;




/**  
* Field competitorIntelligence
*/
protected List<CompetitorIntelligence> competitorIntelligence ;




/**  
* Field ID
* A unique identifier for the ProductOffering. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the ProductOffeirng is known and dist 

* inguished from other ProductOfferings. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the offering is. 

*/
protected String description ;




/**  
* Field validFor
* The period during which the offering is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition in which the offering exists, such as planned, obsolete, 

*  active 

*/
protected String status ;




/**  
* Field bundledProductOffering
*/
protected List<BundledProductOffering> bundledProductOffering ;




/**  
* Field productOfferingTerm
*/
protected List<ProductOfferingTerm> productOfferingTerm ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field salesChannel
*/
protected List<SalesChannel> salesChannel ;




/**  
* Field marketStrategy
*/
protected List<MarketStrategy> marketStrategy ;




/**  
* Field prodOfferPricePolicyVariable
*/
protected List<ProdOfferPricePolicyVariable> prodOfferPricePolicyVariable ;




/**  
* Field policySet
*/
protected List<PolicySet> policySet ;




/**  
* Field distributionChannel
*/
protected List<DistributionChannel> distributionChannel ;




/**  
* Field productOfferingStrategy
*/
protected List<ProductOfferingStrategy> productOfferingStrategy ;




/**  
* Field distChannelProdOffer
*/
protected List<DistChannelProdOffer> distChannelProdOffer ;




/**  
* Field productOffering3
*/
protected List<ProductOffering> productOffering3 ;




/**  
* Field productOffering2
*/
protected List<ProductOffering> productOffering2 ;




/**  
* Field productCapacity
*/
protected List<ProductCapacity> productCapacity ;




/**  
* Field productCapacityDemand
*/
protected List<ProductCapacityDemand> productCapacityDemand ;




/**  
* Field serviceCandidate2
*/
protected List<ServiceCandidate> serviceCandidate2 ;




/**  
* Field resourceCandidate
*/
protected List<ResourceCandidate> resourceCandidate ;




/**  
* Field prodSpecCharValueUse
*/
protected List<ProdSpecCharValueUse> prodSpecCharValueUse ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;




/**  
* Field prodCatProdOffer
*/
protected List<ProdCatProdOffer> prodCatProdOffer ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field partyPrivacyProfileType
*/
protected List<PartyPrivacyProfileType> partyPrivacyProfileType ;




/**  
* Field productOfferingRelationship
*/
protected List<ProductOfferingRelationship> productOfferingRelationship ;




/**  
* Field productOfferingRelationship2
*/
protected List<ProductOfferingRelationship> productOfferingRelationship2 ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field productOffering2
*/
protected List<ProductOffering> productOffering2 ;




/**  
* Field allowedProductAction
*/
protected AllowedProductAction allowedProductAction ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}