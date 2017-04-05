/**
* Product Offering Price Rule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E32012B03B2-content.html">Product Offering Price Rule ABE</a> 
* The Product Offering Price Rule ABE describes all rules related to pri 
* ces concerning ProductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_rule_business_entity ;

/**
* An amount expressed in money or another medium of exchange that is tho 
* ught to be a fair exchange for a ProductOffering as the result of the  
* evaluation of a PolicyStatement. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Value ABE::PolicyValue |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ProdOfferPricePolicyValue extends PolicyValue,Policy,RootEntity {



/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;


}