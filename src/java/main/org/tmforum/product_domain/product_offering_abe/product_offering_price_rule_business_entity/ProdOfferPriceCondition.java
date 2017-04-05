/**
* Product Offering Price Rule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E32012B03B2-content.html">Product Offering Price Rule ABE</a> 
* The Product Offering Price Rule ABE describes all rules related to pri 
* ces concerning ProductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_rule_business_entity ;

/**
* Part of a PolicyStatement representing a single constraint that define 
* s the assessment of the rule. The constraint is specified in terms of  
* one or more ProductOffering, ProductSpecificationType, ProductOffering 
* Price, and/or ProductOfferingPriceComponent. ProdOfferPriceRuleConditi 
* on is a type of PolicyCondition. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyConditionAtomic |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyCondition |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ProdOfferPriceCondition extends PolicyConditionAtomic,PolicyCondition,Policy,RootEntity {



/**  
* Field priceRuleConditionType
* A character string that specifies how to interpret the condition. A va 

* lue of "Buy" means that the condition specifies how many of an entity  

* must be procured to satisfy the rule. A value of "Price" means that th 

* e condition specifies that there is a relationship between prices of t 

* wo entities that must exist for the condition to be satisfied. The val 

* ue “ObtainedWithin” specifies dates within which a Product Offering mu 

* st be procured to satisfy the Policy Condition. 

*/
protected String priceRuleConditionType ;


}