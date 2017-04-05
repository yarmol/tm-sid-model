/**
* Customer Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_4.y4H.oOY.kE.d-.e.j.r.wF9U1.vR.w-content.html">Customer Payment ABE</a> 
* The Customer Payment ABE represents the transfer of wealth from a cust 
* omer for a product or usage of product. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_collection_abe.customer_payment_business_entity ;

/**
* CustomerPaymentItem is the application of CustomerPayment. CustomerPay 
* mentItem is applied to CustomerBill or AppliedCustomerBillingRate. 
 @since SID_R16.5
*/ 

public  class CustomerPaymentItem  {



/**  
* Field appliedCustomerBillingRate
*/
protected AppliedCustomerBillingRate appliedCustomerBillingRate ;




/**  
* Field customerBill
*/
protected CustomerBill customerBill ;




/**  
* Field customerPayment
*/
protected CustomerPayment customerPayment ;




/**  
* Field customeraccountbalance
*/
protected List<CustomerAccountBalance> customeraccountbalance ;




/**  
* Field financialCharge
*/
protected FinancialCharge financialCharge ;




/**  
* Field paymentItem
*/
protected PartyPaymentItem paymentItem ;


}