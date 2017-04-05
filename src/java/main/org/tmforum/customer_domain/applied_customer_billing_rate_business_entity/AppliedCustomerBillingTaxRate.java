/**
* Applied Customer Billing Rate ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941D002F100C1-content.html">Applied Customer Billing Rate ABE</a> 
* The Applied Customer Billing Rate ABE deals with the correlation of re 
* lated usage for subsequent rating, rates applied to the usage (both re 
* gulated and non-regulated), discounts to usage, and any taxes due on t 
* he rated usage. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.applied_customer_billing_rate_business_entity ;

/**
* An amount of money levied on the price of a Product by a legislative b 
* ody. 

Inheritance tree: |- 
 <a title="SID Models::Customer Domain::Applied Customer Billing Rate ABE::AtomicAppliedCustomerBillingRate" href="_3E3F0EC000E941CAD61C0398-content.html">SID Models::Customer Domain::Applied Customer Billing Rate ABE::AtomicAppliedCustomerBillingRate</a> |- 
 <a title="SID Models::Customer Domain::Applied Customer Billing Rate ABE::AppliedCustomerBillingRate" href="_3E3F0EC000E941CAC71B0187-content.html">SID Models::Customer Domain::Applied Customer Billing Rate ABE::AppliedCustomerBillingRate</a> @since SID_R16.5
*/ 

public  class AppliedCustomerBillingTaxRate extends AtomicAppliedCustomerBillingRate,AppliedCustomerBillingRate {



/**  
* Field taxCategory
* A categorization of the tax rate. 

*/
protected String taxCategory ;




/**  
* Field appliedCustomerBillingRate
*/
protected AppliedCustomerBillingRate appliedCustomerBillingRate ;


}