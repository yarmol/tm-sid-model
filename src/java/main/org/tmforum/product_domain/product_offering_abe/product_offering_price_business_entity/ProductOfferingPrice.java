/**
* Product Offering Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E283DAF018F-content.html">Product Offering Price ABE</a> 
* The Product Offering Price ABE describes all the prices related to Pro 
* ductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_offering_price_business_entity ;

/**
* An amount, usually of money, that is asked for or allowed when a Produ 
* ctOffering is bought, rented, or leased. The price is valid for a defi 
* ned period of time and may not represent the actual price paid by a cu 
* stomer. 
 @since SID_R16.5
*/ 

public abstract class ProductOfferingPrice  {



/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field name
* A short descriptive name such as "affinity discount" .</br> 

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
* Field compositeProdOfferPrice
*/
protected List<CompositeProdOfferPrice> compositeProdOfferPrice ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field priceEvent
*/
protected List<PriceEvent> priceEvent ;




/**  
* Field productSpecCharacteristicValueUse
*/
protected List<ProdSpecCharValueUse> productSpecCharacteristicValueUse ;




/**  
* Field prodOfferPricePolicyValue
*/
protected List<ProdOfferPricePolicyValue> prodOfferPricePolicyValue ;




/**  
* Field prodOfferPricePolicyVariable
*/
protected List<ProdOfferPricePolicyVariable> prodOfferPricePolicyVariable ;




/**  
* Field prodOfferPriceAction
*/
protected List<ProdOfferPriceAction> prodOfferPriceAction ;




/**  
* Field prodCatalogProdOffer
*/
protected List<ProdCatProdOffer> prodCatalogProdOffer ;




/**  
* Field productPrice
*/
protected List<ProductPrice> productPrice ;




/**  
* Field businessInteractionItempPice
*/
protected List<BusinessInteractionItemPrice> businessInteractionItempPice ;




/**  
* Field productOfferingTerm
*/
protected List<ProductOfferingTerm> productOfferingTerm ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;




/**  
* Field partyRevenueSharingModelInvolvement
*/
protected PartyRevenueSharingModelInvolvement partyRevenueSharingModelInvolvement ;




/**  
* Field policySet
*/
protected List<PolicySet> policySet ;


}