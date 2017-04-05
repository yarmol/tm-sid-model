/**
* Product Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C7E8570285-content.html">Product Price ABE</a> 
* The Product Price ABE describes all the prices applied to Products. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_abe.product_price_business_entity ;

/**
* An amount, usually of money, that represents the actual price paid by  
* a Customer for a purchase, a rent or a lease of a Product. The price i 
* s valid for a defined period of time. 
 @since SID_R16.5
*/ 

public abstract class ProductPrice  {



/**  
* Field policySet
*/
protected PolicySet policySet ;




/**  
* Field name
* A short descriptive name such as "affinity discount".</br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail the semantics of this component. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the price is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field productOfferingPrice
*/
protected ProductOfferingPrice productOfferingPrice ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field compositeProdPrice
*/
protected CompositeProdPrice compositeProdPrice ;




/**  
* Field productPricePartyRole
*/
protected List<ProductPricePartyRole> productPricePartyRole ;




/**  
* Field usage
*/
protected List<Usage> usage ;




/**  
* Field componentRevShareProdOfferItem
*/
protected List<ComponentRevShareProdOfferItem> componentRevShareProdOfferItem ;


}