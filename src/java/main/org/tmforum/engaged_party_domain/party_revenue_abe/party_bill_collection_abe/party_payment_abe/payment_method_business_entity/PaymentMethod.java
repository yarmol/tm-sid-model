/**
* Payment Method ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.sGBQFJGE.eWPA.vIYYW.iWM.g-content.html">Payment Method ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity ;

/**
* PaymentMethod is the way in which party provides payment, for example  
* cash ,credit,transfer. 
 @since SID_R16.5
*/ 

public  class PaymentMethod  {



/**  
* Field ID
* Unique identifier  

*/
protected String ID ;




/**  
* Field name
* Name that can be given to the PaymentMethod by the owner. 

*/
protected String name ;




/**  
* Field description
* Descriptionthat can be given to the PaymentMethod by the owner. 

*/
protected String description ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field paymentPlan
*/
protected List<PaymentPlan> paymentPlan ;




/**  
* Field validFor
* Valid period for the PaymentMethod. 

*/
protected TimePeriod validFor ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field paymentPlanPaymentMethod
*/
protected List<PaymentPlanPaymentMethod> paymentPlanPaymentMethod ;




/**  
* Field paymentMethodSpecification
*/
protected PaymentMethodSpecification paymentMethodSpecification ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;


}