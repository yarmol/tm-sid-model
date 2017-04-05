/**
* Applied Customer Billing Rate Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.u6S.rEGWOE.eSJS8.c-D.n.d.u9A-content.html">Applied Customer Billing Rate Spec ABE</a> 
* The Applied Customer Billing Rate Spec ABE is detailed description of  
* AppliedCustomerBillingRate entity. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.applied_customer_billing_rate_abe.applied_customer_billing_rate_spec_business_entity ;

/**
* A detailed description of AppliedCustomerBillingRate entity. This busi 
* ness entity holds the definition of all the characteristics (variant a 
* ttributes) of AppliedCustomerBillingRate, as well and type attributes  
* such as description (derived from RootEntity) and revenueType. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class AppliedCustomerBillingRateSpec extends EntitySpecification,RootEntity {



/**  
* Field appliedCustomerBillingRate
*/
protected List<AppliedCustomerBillingRate> appliedCustomerBillingRate ;




/**  
* Field revenueCode
* The revenue type represented by this AppliedCustomerBillingRateSpec. T 

* his attribute has at least 3 valid values:</br>RC - (for recurring cha 

* rge)</br>UC - (for usage charge)</br>OC - (for one-time charge)  

*/
protected String revenueCode ;


}