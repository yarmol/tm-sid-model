/**
* Customer Interaction ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C1E10CA004F-content.html">Customer Interaction ABE</a> 
* The Customer Interaction ABE represents communications with customers, 
*  and the translation of customer requests and inquiries into appropria 
* te “events” such as the creation of an customer order, the creation of 
*  a customer bill inquiry, or the creation of a customer problem. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_interaction_business_entity ;

/**
* CustomerDisputedAmount is a type of DisputedAmount which represents an 
*  amount of money in dispute between the enterprise and one of its cust 
* omers 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::Disputed Amount ABE::DisputedAmount |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class CustomerDisputedAmount extends DisputedAmount,BusinessInteraction {



/**  
* Field customerBill
*/
protected CustomerBill customerBill ;




/**  
* Field appliedCustomerBillingCharge
*/
protected AppliedCustomerBillingCharge appliedCustomerBillingCharge ;




/**  
* Field appliedCustomerBillingCredit
*/
protected AppliedCustomerBillingCredit appliedCustomerBillingCredit ;




/**  
* Field customerAccount
*/
protected CustomerAccount customerAccount ;




/**  
* Field customerAccount2
*/
protected CustomerAccount customerAccount2 ;


}