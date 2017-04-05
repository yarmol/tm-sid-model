/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A date through which charges previously received by the billing system 
*  appear on the bill. 
 @since SID_R16.5
*/ 

public  class PartyBillingCycle  {



/**  
* Field billingDate
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
* A party bill mailing date. 

*/
protected DateTime mailingDate ;




/**  
* Field paymentDueDate
* A party bill payment due date. 

*/
protected DateTime paymentDueDate ;




/**  
* Field partyBillingCycleSpecification
*/
protected PartyBillingCycleSpecification partyBillingCycleSpecification ;




/**  
* Field partyBill
*/
protected List<OnCyclePartyBill> partyBill ;




/**  
* Field partyBillSpec
*/
protected PartyBillSpec partyBillSpec ;




/**  
* Field productionReason
* The reason for this cycle run. Values may be SCHEDULE_RUN, PROVEIDER_R 

* EQUEST or others</br> 

*/
protected String productionReason ;


}