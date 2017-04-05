/**
* Product Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA5302C4-content.html">Product Specification ABE</a> 
* The Product Specification ABE contains all what represent a product sp 
* ecification as perceived by the business user and specifies what the m 
* arketing operator wants to sell at a functional level (i.e. what are t 
* he capacities, which usages are available…). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_specification_business_entity ;

/**
* A detailed description of a tangible or intangible object made availab 
* le externally in the form of a ProductOffering to Customers or other P 
* arties playing a PartyRole. The ProductSpecification represents a prod 
* uct specification as perceived by the business user and specifies what 
*  the marketing operator wants to sell at a functional level (i.e. what 
*  are the capacities, which usages are available…).It can represent:&nb 
* sp;&nbsp;&nbsp;&nbsp;• material goods (Terminal, phone, mobile, fax, m 
* odem)&nbsp;&nbsp;&nbsp;&nbsp;• or non tangible goods (like an Anti-Spa 
* m service for email).When the ProductSpecification represents a tangib 
* le goods, it is realized as ResourceSpecification. Corresponding Resou 
* rces are stored in warehouses or bought to a supplier on demand.When t 
* he ProductSpecification is a non-tangible goods, it is either realized 
*  as a CustomerFacingService (when the Service Provider is able to real 
* ize it) or bought as a ProductSpecification proposed by a Supplier (wh 
* en the Service Provider is not able to realize it). For example, a Bro 
* adband know-how might be built or bought depending on the location of  
* it.The ProductSpecification corresponds to a sub-set of the Service Pr 
* ovider’s know-how according to what marketing people want to sell. The 
* refore, a ProductSpecification is a restriction of CustomerFacingServi 
* ceSpecs.A ProductSpecification may consist of other ProductSpecificati 
* ons supplied together as a collection. Members of the collection may b 
* e offered in their own right. ProductSpecifications may also exist wit 
* hin groupings, such as ProductCategories, ProductLines, and ProductTyp 
* es.Note: Since SID 16.0, ProductSpecification is a sub-class of Entity 
* Specification. Therefore it inherits from RootEntity's attributes (ID, 
*  name, description).That's why the previous attributes name, descripti 
* on and productNumber (corresponds to ID) have been removed from Produc 
* tSpecification.While the “description” attribute inherited from RootEn 
* tity is optional (not required in a SID implementation), in the case o 
* f ProductSpecification it is required. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ProductSpecification extends EntitySpecification,RootEntity {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field physicalResourceSpec
*/
protected List<PhysicalResourceSpec> physicalResourceSpec ;




/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;




/**  
* Field brand
* The manufacturer or trademark of the specification. 

*/
protected String brand ;




/**  
* Field validFor
* The period for which the product specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field lifecycleStatus
* The condition of the product specification, such as active, inactive,  

* planned. 

*/
protected String lifecycleStatus ;




/**  
* Field productSpecificationCost
*/
protected List<ProductSpecificationCost> productSpecificationCost ;




/**  
* Field productSpecificationType
*/
protected List<ProductSpecificationType> productSpecificationType ;




/**  
* Field productSpecificationVersion
*/
protected List<ProductSpecificationVersion> productSpecificationVersion ;




/**  
* Field productSpecCharacteristic
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic ;




/**  
* Field compositeProductSpecification
*/
protected List<CompositeProductSpecification> compositeProductSpecification ;




/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field simpleProductOffering
*/
protected List<SimpleProductOffering> simpleProductOffering ;




/**  
* Field productUsageSpec
*/
protected List<ProductUsageSpec> productUsageSpec ;




/**  
* Field customerbillingproductchargesumspec2
*/
protected List<CustomerBillingProductChargeSumSpec> customerbillingproductchargesumspec2 ;




/**  
* Field customerfacingservicespec2
*/
protected List<CustomerFacingServiceSpec> customerfacingservicespec2 ;




/**  
* Field productCapacity
*/
protected List<ProductCapacity> productCapacity ;




/**  
* Field productCapacityDemand
*/
protected List<ProductCapacityDemand> productCapacityDemand ;




/**  
* Field productMetricDefinition
*/
protected List<ProductMetricDefinition> productMetricDefinition ;




/**  
* Field partyBillingProductChargeSumSpec
*/
protected List<PartyBillingProductChargeSumSpec> partyBillingProductChargeSumSpec ;




/**  
* Field productConfigSpec
*/
protected List<ProductConfigSpec> productConfigSpec ;




/**  
* Field productTestSpec
*/
protected List<ProductTestSpec> productTestSpec ;




/**  
* Field partyRoleProductSpecification
*/
protected List<PartyRoleProductSpecification> partyRoleProductSpecification ;




/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field productSpecification2
*/
protected List<ProductSpecification> productSpecification2 ;




/**  
* Field productSpecificationRelationship
*/
protected List<ProductSpecificationRelationship> productSpecificationRelationship ;




/**  
* Field productSpecificationRelationship2
*/
protected List<ProductSpecificationRelationship> productSpecificationRelationship2 ;




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