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
* A detailed description of when to initiate a billing cycle and the var 
* ious sub steps of a billing cycle. 
 @since SID_R16.5
*/ 

public  class CustomerBillingCycleSpecification  {



/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail the semantics of this component. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the CustomerBillingCycleSpecification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field billingDateShift
* An offset of a billing date. The offset is expressed as number of days 

*  with regard to the start of the BillingPeriod. 

*/
protected Integer billingDateShift ;




/**  
* Field chargeDateOffset
* An offset of a date through which charges previously received by the b 

* illing system will appear on the bill. The offset is expressed as numb 

* er of days with regard to the start of the BillingPeriod. 

*/
protected Integer chargeDateOffset ;




/**  
* Field creditDateOffset
* An offset of a date through which credits previously received by the b 

* illing system will appear on the bill. The offset is expressed as numb 

* er of days with regard to the start of the BillingPeriod. 

*/
protected Integer creditDateOffset ;




/**  
* Field mailingDateOffset
* An offset of a customer bill mailing date. The offset is expressed as  

* number of days with regard to the start of the BillingPeriod. 

*/
protected Integer mailingDateOffset ;




/**  
* Field paymentDueDateOffset
* An offset of a payment due date. The offset is expressed as number of  

* days with regard to the start of the BillingPeriod. 

*/
protected Integer paymentDueDateOffset ;




/**  
* Field billingPeriod
*/
protected BillingPeriod billingPeriod ;




/**  
* Field customerBillingCycle
*/
protected List<CustomerBillingCycle> customerBillingCycle ;




/**  
* Field customerBillSpec
*/
protected List<CustomerBillSpec> customerBillSpec ;


}