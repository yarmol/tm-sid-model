/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* The official date of the bill 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill ABE::PartyBill" href="_.a.e.bI_04.cE.eO_X.pEX.s37Q.e.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill ABE::PartyBill</a> @since SID_R16.5
*/ 

public  class OffCyclePartyBill extends PartyBill {



/**  
* Field billDate
* The official date of the bill 

*/
protected DateTime billDate ;




/**  
* Field chargeDate
* A date through which charges previously received by the billing system 

*  appear on the bill. 

*/
protected DateTime chargeDate ;




/**  
* Field creditDate
* A date through which credits previously received by the billing system 

*  appear on the bill 

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
* Field offCycleProductionReason
* The reason for this cycle run reason, values may be CUSTOMER_REQUEST,  

* ACCOUNT_CLOSE or others</br> 

*/
protected String offCycleProductionReason ;


}