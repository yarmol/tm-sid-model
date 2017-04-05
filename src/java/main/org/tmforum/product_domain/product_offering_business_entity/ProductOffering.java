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