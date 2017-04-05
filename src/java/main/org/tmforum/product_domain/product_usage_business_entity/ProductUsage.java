/**
* Product Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C6C9C60191-content.html">Product Usage ABE</a> 
* Represents usage of products associated with Customers used for chargi 
* ng that may appear on a Customer Bill. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_usage_business_entity ;

/**
* An occurrence of employing a Product for its intended purpose. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Usage ABE::Usage @since SID_R16.5
*/ 

public abstract class ProductUsage extends Usage {



/**  
* Field product
*/
protected Product product ;




/**  
* Field productBundleUsage
*/
protected ProductBundleUsage productBundleUsage ;




/**  
* Field appliedCustomerBillingProductUsageRate
*/
protected List<AppliedCustomerBillingProductUsageRate> appliedCustomerBillingProductUsageRate ;




/**  
* Field appliedPartyBillingProductUsageRate
*/
protected List<AppliedPartyBillingProductUsageRate> appliedPartyBillingProductUsageRate ;




/**  
* Field productUsageSpec
*/
protected ProductUsageSpec productUsageSpec ;




/**  
* Field serviceUsage
*/
protected List<ServiceUsage> serviceUsage ;


}