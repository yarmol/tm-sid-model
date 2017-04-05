/**
* Party Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.wY.k4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Payment ABE</a> 
* The Party Payment ABE contains all Entities required to describe a pay 
* ment such as PaymentMethod and BankAccount. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity ;

/**
* A PaymentPlanPaymentMethod specifies the priority and valid period for 
*  each PaymentMethod in a PaymentPlan context. 
 @since SID_R16.5
*/ 

public  class PaymentPlanPaymentMethod  {



/**  
* Field validFor
* Validity period of the use of a PaymentMethod for a PaymentPlan autopa 

* y. 

*/
protected TimePeriod validFor ;




/**  
* Field priority
* Priority of the use of a PaymentMethod for a PaymentPlan autopay. 

*/
protected Integer priority ;




/**  
* Field paymentPlan
*/
protected PaymentPlan paymentPlan ;




/**  
* Field paymentMethod
*/
protected PaymentMethod paymentMethod ;


}