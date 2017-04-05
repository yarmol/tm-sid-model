/**
* Characteristic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94462ADB002F3-content.html">Characteristic ABE</a> 
* A pattern (the content of the ABE) enables attributes unique to a type 
*  of entity to be created via its association to EntitySpecification an 
* d enables attributes unique to a certain entity to be created via its  
* association to RootEntityType.  A RootEntityType is an entity in the S 
* ID.  For example, characteristics could be defined for entities (insta 
* nces of RootEntityType) such as Product, Customer, and ProductSpecific 
* ation that apply to all instances of those entities.   
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity ;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import org.junit.Test;
import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.catalog_business_entity.Catalog;
import org.tmforum.common_business_entities_domain.configuration_and_profiling_business_entity.Configuration;
import org.tmforum.common_business_entities_domain.metric_abe.metric_definition_business_entity.MetricDefinition;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.RootEntity;
import org.tmforum.customer_domain.applied_customer_billing_rate_business_entity.AppliedCustomerBillingRate;
import org.tmforum.customer_domain.applied_customer_billing_rate_business_entity.FinancialCharge;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.engaged_party_domain.party_revenue_abe.applied_party_billing_rate_business_entity.AppliedPartyBillingRate;
import org.tmforum.engaged_party_domain.party_revenue_abe.applied_party_billing_rate_business_entity.PartyFinancialCharge;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity.PaymentMethod;
import org.tmforum.engaged_party_domain.party_revenue_abe.party_settlement_business_entity.PartySettlement;
import org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_business_entity.MatrixCharValueIndex;
import org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_business_entity.PricingLogicAlgorithm;
import org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity.ComponentProdOfferPrice;
import org.tmforum.service_domain.tip_service_management_business_entity.ServiceAccessPoint;

import java.util.List;

/**
* A value of a CharacteristicSpecifcation chosen or entered (if no value 
* s are specified) for a Entity that further defines what the Entity is. 
 @since SID_R16.5
*/ 

public  class CharacteristicValue  {



/**  
* Field value
* A fact that describes a Entity. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the characteristic value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field rootEntity
*/
protected RootEntity rootEntity ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field characteristicValue1
*/
protected CharacteristicValue characteristicValue1 ;




/**  
* Field pricingLogicAlgorithm
*/
protected PricingLogicAlgorithm pricingLogicAlgorithm ;




/**  
* Field matrixCharValueIndex2
*/
protected List<MatrixCharValueIndex> matrixCharValueIndex2 ;




/**  
* Field serviceAccessPoint
*/
protected ServiceAccessPoint serviceAccessPoint ;




/**  
* Field componentProdOfferPrice
*/
protected List<ComponentProdOfferPrice> componentProdOfferPrice ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field work
*/
protected Work work ;




/**  
* Field catalog
*/
protected Catalog catalog ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field appliedCustomerBillingRate
*/
protected AppliedCustomerBillingRate appliedCustomerBillingRate ;




/**  
* Field partyFinancialCharge
*/
protected PartyFinancialCharge partyFinancialCharge ;




/**  
* Field financialCharge
*/
protected FinancialCharge financialCharge ;




/**  
* Field appliedPartyBillingRate
*/
protected AppliedPartyBillingRate appliedPartyBillingRate ;




/**  
* Field configuration
*/
protected Configuration configuration ;




/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field characteristicSpecValue
*/
protected CharacteristicSpecValue characteristicSpecValue ;




/**  
* Field entitySpecCharValueUse
*/
protected EntitySpecCharValueUse entitySpecCharValueUse ;




/**  
* Field entitySpecCharUse
*/
protected EntitySpecCharUse entitySpecCharUse ;




/**  
* Field rootEntityTypeCharUse
*/
protected RootEntityTypeCharUse rootEntityTypeCharUse ;




/**  
* Field rootEntityTypeCharValueUse
*/
protected RootEntityTypeCharValueUse rootEntityTypeCharValueUse ;




/**  
* Field test
*/
protected Test test ;




/**  
* Field partySettlement
*/
protected PartySettlement partySettlement ;




/**  
* Field paymentMethod
*/
protected PaymentMethod paymentMethod ;


}