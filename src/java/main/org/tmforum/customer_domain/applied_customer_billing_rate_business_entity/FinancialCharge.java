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
* FinancialCharge represent a normalized aggregation of AtomicAppliedCus 
* tomerBillingRate so every AtomicAppliedCustomerBillingRate appears in  
* exactly one FinancialCharge. This is critical for financial reporting. 
 @since SID_R16.5
*/ 

public  class FinancialCharge  {



/**  
* Field atomicAppliedCustomerBillingRate
*/
protected List<AtomicAppliedCustomerBillingRate> atomicAppliedCustomerBillingRate ;




/**  
* Field customerAccount
*/
protected CustomerAccount customerAccount ;




/**  
* Field customerBill
*/
protected CustomerBill customerBill ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field financialchargespec
*/
protected List<FinancialChargeSpec> financialchargespec ;




/**  
* Field paymentItem
*/
protected List<CustomerPaymentItem> paymentItem ;


}