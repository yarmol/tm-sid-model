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
* A type of ProductOffering that does not have any subordinate ProductOf 
* ferings, that is, an SimpleProductOffering is a leaf-level ProductOffe 
* ring. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::ProductOffering" href="_3E3F0EC000E93C5DB96E00DD-content.html">SID Models::Product Domain::Product Offering ABE::ProductOffering</a> @since SID_R16.5
*/ 

public  class SimpleProductOffering extends ProductOffering {



/**  
* Field productSpecification2
*/
protected ProductSpecification productSpecification2 ;




/**  
* Field productComponent
*/
protected List<ProductComponent> productComponent ;


}