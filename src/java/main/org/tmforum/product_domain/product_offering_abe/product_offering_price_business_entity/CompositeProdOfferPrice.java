/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* A ProductOfferingPrice that is made up of parts. The parts may be othe 
* r CompositeProdOfferPrices or ComponentProdOfferPrices. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice" href="_3E3F0EC000E93CD366DF029E-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice</a> @since SID_R16.5
*/ 

public  class CompositeProdOfferPrice extends ProductOfferingPrice {



/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;


}