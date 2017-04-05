/**
* Customer Billing Credit ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9420B65450160-content.html">Customer Billing Credit ABE</a> 
* Keep track of the credit. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_account_balance_abe.customer_billing_credit_business_entity ;

/**
* The amount of a deduction that can be applied against an amount charge 
* d for a Product on a CustomerBill. Billing credits are typically gover 
* ned by ProductPriceRule(s) and ProductPriceAlteration(s). 
 @since SID_R16.5
*/ 

public abstract class CustomerBillingCredit  {



/**  
* Field creditForPeriod
* The period for which the credit is valid. 

*/
protected TimePeriod creditForPeriod ;




/**  
* Field customerBillingCreditBalance
*/
protected CustomerBillingCreditBalance customerBillingCreditBalance ;


}