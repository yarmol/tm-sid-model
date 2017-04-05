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
* A charge or a credit assigned to the customer's account in the course  
* or for the purpose of the billing process. Subclasses further define t 
* hese elements.  Information about the type of ACBR (such as descriptio 
* n and revenue code) can be via the association to AppliedCustomerBilli 
* ngRateSpec 
 @since SID_R16.5
*/ 

public abstract class AppliedCustomerBillingRate  {



/**  
* Field date
* A date of creation. 

*/
protected DateTime date ;




/**  
* Field quantity
* A unit (for example, US Dollars) and number of the applied rate. 

*/
protected Money quantity ;




/**  
* Field compositeAppliedCustomerBillingRate
*/
protected List<CompositeAppliedCustomerBillingRate> compositeAppliedCustomerBillingRate ;




/**  
* Field appliedCustomerBillingTaxRate
*/
protected List<AppliedCustomerBillingTaxRate> appliedCustomerBillingTaxRate ;




/**  
* Field appliedCustomerBillingProductAlteration
*/
protected List<AppliedCustomerBillingProductAlteration> appliedCustomerBillingProductAlteration ;




/**  
* Field customerBill
*/
protected CustomerBill customerBill ;




/**  
* Field paymentItem
*/
protected List<CustomerPaymentItem> paymentItem ;




/**  
* Field appliedCustomerBillingRateSpec
*/
protected AppliedCustomerBillingRateSpec appliedCustomerBillingRateSpec ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field partySettlement
*/
protected PartySettlement partySettlement ;




/**  
* Field description
* A textual description. 

*/
protected String description ;


}