/**
* Product Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C6C9C60191-content.html">Product Usage ABE</a> 
* Represents usage of products associated with Customers used for chargi 
* ng that may appear on a Customer Bill. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_usage_business_entity ;

/**
* A detailed product component usage event. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Usage ABE::ProductUsage" href="_3E3F0EC000E941C6E1CA00E8-content.html">SID Models::Product Domain::Product Usage ABE::ProductUsage</a> |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public  class ProductComponentUsage extends ProductUsage,Usage {



/**  
* Field resourceUsage
*/
protected List<ResourceUsage> resourceUsage ;




/**  
* Field productComponent
*/
protected ProductComponent productComponent ;




/**  
* Field serviceUsage1
*/
protected List<ServiceUsage> serviceUsage1 ;


}