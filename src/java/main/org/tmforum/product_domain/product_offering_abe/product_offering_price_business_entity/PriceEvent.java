/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* An occurrence (happening) or schedule that triggers the creation of a  
* billing charge for a product offering. For example, a price event inst 
* ance may represent the end of a month when monthly recurring billing c 
* harges are created. In some cases, the creation of a charge associated 
*  with a ProductOfferingPrice may be triggered by multiple events. For  
* example, a penalty (ProductOfferingPrice) may be triggered by over- or 
*  under-usage of a service. Under- and over-usage are represented as tw 
* o separate PriceEvent entity instances. 
 @since SID_R16.5
*/ 

public  class PriceEvent  {



/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;


}