/**
* Product Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C7E8570285-content.html">Product Price ABE</a> 
* The Product Price ABE describes all the prices applied to Products. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_abe.product_price_business_entity ;

/**
* An amount, usually of money, that modifies the price charged for a Pro 
* duct. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ComponentProdPrice" href="_3E3F0EC000E941C831C902F0-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ComponentProdPrice</a> |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice" href="_3E3F0EC000E941C7ED3803C2-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice</a> @since SID_R16.5
*/ 

public  class ProdPriceAlteration extends ComponentProdPrice,ProductPrice {



/**  
* Field prodPriceCharge
*/
protected List<ProdPriceCharge> prodPriceCharge ;




/**  
* Field appliedCustomerBillingProductAlteration
*/
protected List<AppliedCustomerBillingProductAlteration> appliedCustomerBillingProductAlteration ;




/**  
* Field appliedPartyBillingProductAlteration
*/
protected List<AppliedPartyBillingProductAlteration> appliedPartyBillingProductAlteration ;


}