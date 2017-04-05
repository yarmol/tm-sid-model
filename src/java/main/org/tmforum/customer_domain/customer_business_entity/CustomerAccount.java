/**
* Customer ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8CEBE701B5-content.html">Customer ABE</a> 
* The Customer ABE is the focus for the Customer domain.  Customer data  
* is the enterprise’s knowledge of the customer and accounts held by a c 
* ustomer. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_business_entity ;

/**
* An arrangement that a customer has with an enterprise that provides pr 
* oducts to the customer and collects AppliedCustomerBillingRate that ar 
* e used to produce CustomerBill. 
 @since SID_R16.5
*/ 

public  class CustomerAccount  {



/**  
* Field customerAccountInteractionRole
*/
protected List<CustomerAccountInteractionRole> customerAccountInteractionRole ;




/**  
* Field customerAccountTaxExemption
*/
protected List<CustomerAccountTaxExemption> customerAccountTaxExemption ;




/**  
* Field customer
*/
protected Customer customer ;




/**  
* Field customerBill
*/
protected List<CustomerBill> customerBill ;




/**  
* Field customerBillSpec
*/
protected List<CustomerBillSpec> customerBillSpec ;




/**  
* Field customerAccountChargeSum
*/
protected List<CustomerAccountChargeSum> customerAccountChargeSum ;




/**  
* Field customerAccountChargeSumSpec
*/
protected List<CustomerAccountChargeSumSpec> customerAccountChargeSumSpec ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;




/**  
* Field customerDisputedAmount
*/
protected List<CustomerDisputedAmount> customerDisputedAmount ;




/**  
* Field customerDisputedAmount2
*/
protected List<CustomerDisputedAmount> customerDisputedAmount2 ;




/**  
* Field financialCharge
*/
protected List<FinancialCharge> financialCharge ;




/**  
* Field dunningScenario
*/
protected DunningScenario dunningScenario ;




/**  
* Field dunningCase
*/
protected List<DunningCase> dunningCase ;




/**  
* Field involvementRole
*/
protected List<InvolvementRole> involvementRole ;




/**  
* Field customerAccountContact
*/
protected List<CustomerAccountContact> customerAccountContact ;




/**  
* Field productFinancialAccountRelationship
*/
protected List<ProductFinancialAccountRelationship> productFinancialAccountRelationship ;




/**  
* Field customerAccountBalance2
*/
protected List<CustomerAccountBalance> customerAccountBalance2 ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;




/**  
* Field paymentPlan
*/
protected List<PaymentPlan> paymentPlan ;




/**  
* Field customerOrder
*/
protected List<CustomerOrder> customerOrder ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}