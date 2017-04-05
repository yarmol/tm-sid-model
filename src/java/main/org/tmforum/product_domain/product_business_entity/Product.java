/**
* Product ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA6D00A4-content.html">Product ABE</a> 
* Represents an instance of a product offering subscribed to by a party, 
*  such as a customer, the place where the product is in use, as well as 
*  configuration characteristics, such as assigned telephone numbers and 
*  internet addresses.  The Product ABE also tracks the services and/or  
* resources through which the product is realized. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionItem;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ProductCapacity;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ProductCapacityDemand;
import org.tmforum.common_business_entities_domain.location_business_entity.Place;
import org.tmforum.common_business_entities_domain.metric_abe.example_metric_entities.ProductMetric;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Entity;
import org.tmforum.customer_domain.customer_bill_abe.customer_billing_statistic_business_entity.CustomerBillingProductChargeSum;
import org.tmforum.customer_domain.customer_order_business_entity.CustomerOrderItem;
import org.tmforum.engaged_party_domain.party_order_business_entity.PartyOrderItem;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_abe.party_billing_statistic_business_entity.PartyBillingProductChargeSum;
import org.tmforum.product_domain.product_abe.product_price_business_entity.ProductPrice;
import org.tmforum.product_domain.product_configuration_business_entity.ProductConfigSpec;
import org.tmforum.product_domain.product_configuration_business_entity.ProductConfiguration;
import org.tmforum.product_domain.product_offering_business_entity.ProductOffering;
import org.tmforum.product_domain.product_specification_business_entity.ProductSpecification;
import org.tmforum.product_domain.product_test_business_entity.ProductTest;
import org.tmforum.product_domain.product_usage_business_entity.ProductUsage;
import org.tmforum.resource_domain.resource_abe.physicalresource_business_entity.PhysicalResource;
import org.tmforum.resource_domain.resource_business_entity.Resource;
import org.tmforum.service_domain.service_abe.customer_facing_service_business_entity.CustomerFacingService;

import java.util.List;

/**
* A ProductOffering obtained by a Customer, or other interested Party pl 
* aying a PartyRole, appearing as a BusinessInteractionItem, which could 
*  take the form of a Agreement. ProductSpecificationCharacteristic(s) i 
* n part define the Product. A Product is realized as one or more Servic 
* e(s) and/or Resource(s). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Product extends Entity {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field physicalResource
*/
protected List<PhysicalResource> physicalResource ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field productStatus
* The condition of the product, such as planned, designed, activated, di 

* sconnected. 

*/
protected String productStatus ;




/**  
* Field validFor
* The period during which the product is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field product1
*/
protected List<Product> product1 ;




/**  
* Field productBundle
*/
protected ProductBundle productBundle ;




/**  
* Field productCharacteristicValue
*/
protected List<ProductCharacteristicValue> productCharacteristicValue ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field productInvolvementRole
*/
protected List<ProductInvolvementRole> productInvolvementRole ;




/**  
* Field productPrice
*/
protected List<ProductPrice> productPrice ;




/**  
* Field productUsage
*/
protected List<ProductUsage> productUsage ;




/**  
* Field customerBillingProductChargeSum
*/
protected List<CustomerBillingProductChargeSum> customerBillingProductChargeSum ;




/**  
* Field customerFacingService
*/
protected List<CustomerFacingService> customerFacingService ;




/**  
* Field productCapacity
*/
protected List<ProductCapacity> productCapacity ;




/**  
* Field productCapacityDemand
*/
protected List<ProductCapacityDemand> productCapacityDemand ;




/**  
* Field productMetric
*/
protected List<ProductMetric> productMetric ;




/**  
* Field partyBillingProductChargeSum
*/
protected List<PartyBillingProductChargeSum> partyBillingProductChargeSum ;




/**  
* Field productConfiguration
*/
protected List<ProductConfiguration> productConfiguration ;




/**  
* Field productConfigSpec
*/
protected List<ProductConfigSpec> productConfigSpec ;




/**  
* Field productTest
*/
protected List<ProductTest> productTest ;




/**  
* Field productRelationship
*/
protected List<ProductRelationship> productRelationship ;




/**  
* Field productRelationship2
*/
protected List<ProductRelationship> productRelationship2 ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}