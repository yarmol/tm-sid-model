/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* Part of a ProductOfferingPrice representing a single element of the pr 
* ice. Subclasses further define these elements. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice" href="_3E3F0EC000E93CD366DF029E-content.html">SID Models::Product Domain::Product Offering ABE::Product Offering Price ABE::ProductOfferingPrice</a> @since SID_R16.5
*/ 

public abstract class ComponentProdOfferPrice extends ProductOfferingPrice {



/**  
* Field priceType
* A category that describes the price, such as recurring, discount, allo 

* wance, penalty, and so forth. 

*/
protected String priceType ;




/**  
* Field unitOfMeasure
* A number and unit representing how many (for instance 1 dozen) of an P 

* roductOffering is available at the offfered price. Its meaning depends 

*  on the priceType. It could be a price, a rate, or a discount. 

*/
protected Quantity unitOfMeasure ;




/**  
* Field price
* The amount of money that characterizes the price. 

*/
protected Money price ;




/**  
* Field pricingLogicAlgorithm
*/
protected PricingLogicAlgorithm pricingLogicAlgorithm ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field characteristicPriceDependency
*/
protected List<CharacteristicPriceDependency> characteristicPriceDependency ;


}