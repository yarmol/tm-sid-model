/**
* Customer Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C9633A02D5-content.html">Customer Bill ABE</a> 
* The Customer Billng ABE hjndles real-time and non-real-time Call Detai 
* l Records (CDRs) and other sources of data that result in invoice item 
* s.  The Customer Bill ABE also represents the format of a bill, schedu 
* le the production of bills, customer invoicing profiles, all the finan 
* cial calculations necessary to deter¬mine the total of the bill (excep 
* t for rating and rating discounts), and credits and adjustments to bil 
* ls. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_business_entity ;

/**
* An occurrence of a billing cycle. Besides significant dates, it record 
* s who triggered the cycle. 
 @since SID_R16.5
*/ 

public  class CustomerBillingCycle  {



/**  
* Field billingDate
* A billing date. 

*/
protected DateTime billingDate ;




/**  
* Field chargeDate
* A date through which charges previously received by the billing system 

*  appear on the bill. 

*/
protected DateTime chargeDate ;




/**  
* Field creditDate
* A date through which credits previously received by the billing system 

*  appear on the bill. 

*/
protected DateTime creditDate ;




/**  
* Field mailingDate
* A customer bill mailing date. 

*/
protected DateTime mailingDate ;




/**  
* Field paymentDueDate
* A customer bill payment due date. 

*/
protected DateTime paymentDueDate ;




/**  
* Field customerBillingCycleSpecification
*/
protected CustomerBillingCycleSpecification customerBillingCycleSpecification ;




/**  
* Field customerBill
*/
protected List<OnCycleCustomerBill> customerBill ;




/**  
* Field customerBillSpec
*/
protected CustomerBillSpec customerBillSpec ;




/**  
* Field productionReason
* The reason for this cycle run. Values may be SCHEDULE_RUN, PROVEIDER_R 

* EQUEST or others</br> 

*/
protected String productionReason ;


}