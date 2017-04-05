/**
* Product ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA6D00A4-content.html">Product ABE</a> 
* Represents an instance of a product offering subscribed to by a party, 
*  such as a customer, the place where the product is in use, as well as 
*  configuration characteristics, such as assigned telephone numbers and 
*  internet addresses.  The Product ABE also tracks the services and/or  
* resources through which the product is realized. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_business_entity ;

/**
* A ProductBundle is an instantiation of BundledProductOffering which ke 
* eps the business terms under which the customer purchased the product  
* bundle (using a BundledProductOffering). 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product ABE::Product" href="_3E3F0EC000E93C5DB98B03E2-content.html">SID Models::Product Domain::Product ABE::Product</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ProductBundle extends Product,Entity,RootEntity {



/**  
* Field bundledProductOffering
*/
protected BundledProductOffering bundledProductOffering ;




/**  
* Field product2
*/
protected List<Product> product2 ;




/**  
* Field productBundleUsage
*/
protected List<ProductBundleUsage> productBundleUsage ;


}