/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* A charge that is levied repeatedly. It has a period, such as monthly,  
* quarterly, or yearly. An example would be a monthly charge for long di 
* stance. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProdOfferPriceCharge" href="_3E3F0EC000E93EBFC160038C-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProdOfferPriceCharge</a> |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice" href="_3E3F0EC000E93E28C3CD0383-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ComponentProdOfferPrice</a> |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice" href="_3E3F0EC000E93CD366DF029E-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice</a> @since SID_R16.5
*/ 

public  class RecurringChargeProdOfferPriceCharge extends ProdOfferPriceCharge,ComponentProdOfferPrice,ProductOfferingPrice {



/**  
* Field period
* The frequency for which a Customer is charged the price. For example,  

* weekly, monthly, quarterly, yearly. 

*/
protected String period ;


}