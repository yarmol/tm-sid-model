/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* An amount, usually of money, that modifies a price charged for a Produ 
* ctOffering. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice" href="_3E3F0EC000E93E28C3CD0383-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice</a> |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice" href="_3E3F0EC000E93CD366DF029E-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice</a> @since SID_R16.5
*/ 

public  class ProdOfferPriceAlteration extends ComponentProdOfferPrice,ProductOfferingPrice {



/**  
* Field prodOfferPriceCharge
*/
protected List<ProdOfferPriceCharge> prodOfferPriceCharge ;


}