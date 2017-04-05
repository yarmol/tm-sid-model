/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* An allowance is a number of something allowed before charging begins.  
* 300 free minutes per month is an example of an allowance. Another exam 
* ple would be a minimum monthly charge, where a ten dollar per month re 
* curring charge would be combined with a ten dollar allowance. The prod 
* uct offer price contains attributes that describe what the allowed uni 
* t is (i.e. minutes, dollars), the number of units as well as the perio 
* d (per month, per call). Note: the unit and number are represented by  
* the composite attribute quantity. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProdOfferPriceAlteration" href="_3E3F0EC000E93EBFC1820164-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProdOfferPriceAlteration</a> |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice" href="_3E3F0EC000E93E28C3CD0383-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice</a> |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice" href="_3E3F0EC000E93CD366DF029E-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice</a> @since SID_R16.5
*/ 

public  class AllowanceProdOfferPriceAlteration extends ProdOfferPriceAlteration,ComponentProdOfferPrice,ProductOfferingPrice {

}