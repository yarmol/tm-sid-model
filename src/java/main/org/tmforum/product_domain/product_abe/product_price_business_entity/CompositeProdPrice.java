/**
* Product Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C7E8570285-content.html">Product Price ABE</a> 
* The Product Price ABE describes all the prices applied to Products. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_abe.product_price_business_entity ;

/**
* A ProductPrice that is made up of parts. The parts may be other Compos 
* iteProdPrices or ComponentProdPrices. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice" href="_3E3F0EC000E941C7ED3803C2-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice</a> @since SID_R16.5
*/ 

public  class CompositeProdPrice extends ProductPrice {



/**  
* Field productPrice
*/
protected List<ProductPrice> productPrice ;


}