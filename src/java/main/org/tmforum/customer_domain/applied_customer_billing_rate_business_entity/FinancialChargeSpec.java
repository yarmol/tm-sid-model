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
* FinancialChargeSpec defines one specification for certain kind(s) of F 
* inancialCharge. FinancialChargeSpec could be applied to BalanceUsageRu 
* le to help to describe specification of FinancialCharge and relate the 
* m to the sharing information and the private usage information.  
 @since SID_R16.5
*/ 

public  class FinancialChargeSpec  {



/**  
* Field ID
* A unique identifier for the FinancialChargeSpec. 

*/
protected String ID ;




/**  
* Field name
* Name of the FinancialChargeSpec. 

*/
protected String name ;




/**  
* Field description
* An explanation of the FinancialChargeSpec. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition in which the FinancialChargeSpec  exists, such as planne 

* d, obsolete, active. 

*/
protected String status ;




/**  
* Field productFinancialAccountRelationship
*/
protected List<ProductFinancialAccountRelationship> productFinancialAccountRelationship ;




/**  
* Field balanceUsageRule
*/
protected List<BalanceUsageRule> balanceUsageRule ;




/**  
* Field financialcharge
*/
protected List<FinancialCharge> financialcharge ;


}