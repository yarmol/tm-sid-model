/**
* Party Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.wY.k4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Payment ABE</a> 
* The Party Payment ABE contains all Entities required to describe a pay 
* ment such as PaymentMethod and BankAccount. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity ;

/**
* PaymentItem is the application of PartyPayment. PaymentItem is applied 
*  to PartyBill or AppliedPartyBillingRate. 
 @since SID_R16.5
*/ 

public  class PartyPaymentItem  {



/**  
* Field appliedAmount
* The amount of money that has been applied to specific entity, such as  

* PartyBill. 

*/
protected Money appliedAmount ;




/**  
* Field appliedPartyBillingRate
*/
protected AppliedPartyBillingRate appliedPartyBillingRate ;




/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field partyPayment
*/
protected PartyPayment partyPayment ;




/**  
* Field customerpaymentitem
*/
protected CustomerPaymentItem customerpaymentitem ;




/**  
* Field partyRevShareReconDiscrepancy
*/
protected List<PartyRevShareReconDiscrepancy> partyRevShareReconDiscrepancy ;


}