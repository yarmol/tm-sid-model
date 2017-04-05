/**
* Product Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C7E8570285-content.html">Product Price ABE</a> 
* The Product Price ABE describes all the prices applied to Products. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_abe.product_price_business_entity ;

/**
* An amount, usually of money, that is asked for when a Product is bough 
* t, rented, or leased. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ComponentProdPrice" href="_3E3F0EC000E941C831C902F0-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ComponentProdPrice</a> |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice" href="_3E3F0EC000E941C7ED3803C2-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice</a> @since SID_R16.5
*/ 

public  class ProdPriceCharge extends ComponentProdPrice,ProductPrice {



/**  
* Field prodPriceAlteration
*/
protected List<ProdPriceAlteration> prodPriceAlteration ;




/**  
* Field appliedCustomerBillingProductCharge
*/
protected List<AppliedCustomerBillingProductCharge> appliedCustomerBillingProductCharge ;




/**  
* Field appliedPartyBillingProductCharge
*/
protected List<AppliedPartyBillingProductCharge> appliedPartyBillingProductCharge ;


}