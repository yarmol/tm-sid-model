/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A detailed description of when to initiate a billing cycle and the var 
* ious sub steps of a billing cycle. 
 @since SID_R16.5
*/ 

public  class PartyBillingCycleSpecification  {



/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field description
*/
protected String description ;




/**  
* Field validFor
* The period for which the PartyBillingCycleSpecification is valid. 

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
* An offset of a party bill mailing date. The offset is expressed as num 

* ber of days with regard to the start of the BillingPeriod. 

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
* Field partyBillingCycle
*/
protected List<PartyBillingCycle> partyBillingCycle ;




/**  
* Field partyBillSpec
*/
protected List<PartyBillSpec> partyBillSpec ;


}