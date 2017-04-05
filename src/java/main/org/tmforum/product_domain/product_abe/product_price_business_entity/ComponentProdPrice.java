/**
* Product Price ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C7E8570285-content.html">Product Price ABE</a> 
* The Product Price ABE describes all the prices applied to Products. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_abe.product_price_business_entity ;

/**
* Part of a ProductPrice representing a single element of the price. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice" href="_3E3F0EC000E941C7ED3803C2-content.html">SID Models::Product Domain::Product ABE::Product Price ABE::ProductPrice</a> @since SID_R16.5
*/ 

public abstract class ComponentProdPrice extends ProductPrice {



/**  
* Field priceType
* A category that describes the price, such as recurring, discount, allo 

* wance, penalty, and so forth. 

*/
protected String priceType ;




/**  
* Field unitofmeasure
* A number representing the value of this component and units (such as e 

* ach) of the price. Its meaning depends on the priceType. It could be a 

*  price, a rate, or a discount. 

*/
protected Quantity unitofmeasure ;




/**  
* Field price
* The amount of money that characterizes the price. 

*/
protected Money price ;


}