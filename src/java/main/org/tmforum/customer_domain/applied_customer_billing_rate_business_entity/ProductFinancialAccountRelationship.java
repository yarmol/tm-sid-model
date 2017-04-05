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
* ProductChargeAccountRelationship entity relates product charge to one  
* or more CustomerAccount(s) via which associated charging information i 
* s maintained. ProductChargeAccountRelationship uses rule information(f 
* rom ChargeSplittingRule and ChargeAmountThreshold) and charge informat 
* ion held by FinancialChargeSpec and AtomicAppliedCustomerBillingRate t 
* o decide the charge relationship, such as which charge from one produc 
* t usage should be directed to which CustomerAccount(s) and the charge  
* amount.  
 @since SID_R16.5
*/ 

public  class ProductFinancialAccountRelationship  {



/**  
* Field name
* Name of the ProductFinancialAccountRelationship. 

*/
protected String name ;




/**  
* Field description
* Description of the ProductFinancialAccountRelationship. 

*/
protected String description ;




/**  
* Field relationshipType
* A categorization of the relationship, such as aggregation, substitutio 

* n, dependency, exclusivity. 

*/
protected String relationshipType ;




/**  
* Field financialChargeSpec
*/
protected List<FinancialChargeSpec> financialChargeSpec ;




/**  
* Field productinvolvementrole
*/
protected ProductInvolvementRole productinvolvementrole ;




/**  
* Field chargeAmountThreshold
*/
protected ChargeAmountThreshold chargeAmountThreshold ;




/**  
* Field chargeSplittingRule
*/
protected List<ChargeSplittingRule> chargeSplittingRule ;




/**  
* Field customerAccount
*/
protected CustomerAccount customerAccount ;




/**  
* Field atomicAppliedCustomerBillingRate
*/
protected List<AtomicAppliedCustomerBillingRate> atomicAppliedCustomerBillingRate ;


}