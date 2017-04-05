/**
* Payment Method ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.sGBQFJGE.eWPA.vIYYW.iWM.g-content.html">Payment Method ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity ;

/**
* A PaymentMethodSpecification defines characteristics that mighnt be us 
* ed to describe a PaymentMethod. 
 @since SID_R16.5
*/ 

public  class PaymentMethodSpecification  {



/**  
* Field ID
* Unique identifier  

*/
protected String ID ;




/**  
* Field name
* Name given to the PaymentMethondSpecification (type of PaymentMethod). 

*/
protected String name ;




/**  
* Field description
* Description given to the PaymentMethondSpecification (type of PaymentM 

* ethod). 

*/
protected String description ;




/**  
* Field validFor
* Valid period for the PaymentMethodSpecification. 

*/
protected TimePeriod validFor ;




/**  
* Field paymentMethod
*/
protected List<PaymentMethod> paymentMethod ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;


}