/**
* Product Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C6C9C60191-content.html">Product Usage ABE</a> 
* Represents usage of products associated with Customers used for chargi 
* ng that may appear on a Customer Bill. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_usage_business_entity ;

/**
* A detailed product bundle usage event, It is comprised of other Produc 
* tUsage(s), that may be either ProductBundleUsage(s) or ProductComponen 
* tUsage(s). 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Usage ABE::ProductUsage" href="_3E3F0EC000E941C6E1CA00E8-content.html">SID Models::Product Domain::Product Usage ABE::ProductUsage</a> |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public  class ProductBundleUsage extends ProductUsage,Usage {



/**  
* Field productUsage
*/
protected ProductUsage productUsage ;




/**  
* Field productBundle
*/
protected ProductBundle productBundle ;


}