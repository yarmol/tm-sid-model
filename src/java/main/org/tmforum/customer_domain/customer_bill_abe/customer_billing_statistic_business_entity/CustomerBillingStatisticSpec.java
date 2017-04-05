/**
* Customer Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941DAE79F008C-content.html">Customer Billing Statistic ABE</a> 
* The Customer Billing Statistic ABE represents collected data derived f 
* rom CustomerBills. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_billing_statistic_business_entity ;

/**
* A detailed description of a collection of statistical data derived fro 
* m CustomerBills (for example, customer account charge sum over a certa 
* in period of time). Statistical data are typically collected during ra 
* ting and billing processes. A specification may be implemented using a 
*  rules engine or a policy to determine collection rules. 
 @since SID_R16.5
*/ 

public abstract class CustomerBillingStatisticSpec  {



/**  
* Field name
* The name of the specification. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the specification is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field lifecycleStatus
* The condition of the specification, such as active, inactive, planned. 

*/
protected Integer lifecycleStatus ;




/**  
* Field customerBillingStatistic
*/
protected List<CustomerBillingStatistic> customerBillingStatistic ;


}