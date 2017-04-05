/**
* Product Offering ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA620398-content.html">Product Offering ABE</a> 
* The Product Offering ABE describes tangible and intangible goods made  
* available for a certain price to the market in the form of product cat 
* alogs.  This ABE is also responsible for targeting market segments bas 
* ed on the appropriate market strategy. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_business_entity ;

/**
* A type of ProductOffering that represents a grouping of ProductOfferin 
* gs made available to the market.  The grouping may consist of other Bu 
* ndledProductOffering(s) or SimpleProductOffering(s). 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::ProductOffering" href="_3E3F0EC000E93C5DB96E00DD-content.html">SID Models::Product Domain::Product Offering ABE::ProductOffering</a> @since SID_R16.5
*/ 

public  class BundledProductOffering extends ProductOffering {



/**  
* Field productOffering4
*/
protected List<ProductOffering> productOffering4 ;




/**  
* Field productBundle
*/
protected List<ProductBundle> productBundle ;


}