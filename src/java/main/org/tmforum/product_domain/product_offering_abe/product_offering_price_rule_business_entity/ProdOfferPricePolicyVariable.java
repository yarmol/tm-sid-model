/**
* Product Offering Price Rule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E32012B03B2-content.html">Product Offering Price Rule ABE</a> 
* The Product Offering Price Rule ABE describes all rules related to pri 
* ces concerning ProductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_rule_business_entity ;

/**
* A type of PolicyVariable that represents a ProductOffering, ProductOff 
* eringPrice, or ProductSpecificationType. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Variable ABE::PolicyVariable |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ProdOfferPricePolicyVariable extends PolicyVariable,Policy,RootEntity {



/**  
* Field derivationAlgorithm
* A reference to a logical sequence of steps for determining the value o 

* f the ProdOfferPricePolicyVariable. 

*/
protected String derivationAlgorithm ;




/**  
* Field productOfferingPrice
*/
protected ProductOfferingPrice productOfferingPrice ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field productSpecificationType
*/
protected ProductSpecificationType productSpecificationType ;


}