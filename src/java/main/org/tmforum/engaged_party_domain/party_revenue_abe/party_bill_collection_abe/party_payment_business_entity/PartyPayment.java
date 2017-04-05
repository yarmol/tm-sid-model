/**
* Party Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.wY.k4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Payment ABE</a> 
* The Party Payment ABE contains all Entities required to describe a pay 
* ment such as PaymentMethod and BankAccount. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity ;

/**
* The PartyPayment represents the transfer of wealth from any Party to a 
* nother one. 
 @since SID_R16.5
*/ 

public  class PartyPayment  {



/**  
* Field ID
* Unique identifier  

*/
protected String ID ;




/**  
* Field amount
* The monetary form of the PartyPayment. 

*/
protected Money amount ;




/**  
* Field paymentDate
* The date the PartyPayment was made 

*/
protected DateTime paymentDate ;




/**  
* Field remainingAmount
* The payment amount that has not been applied as payment item. 

*/
protected Money remainingAmount ;




/**  
* Field paymentMethod
*/
protected PaymentMethod paymentMethod ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field paymentPlan
*/
protected List<PaymentPlan> paymentPlan ;




/**  
* Field paymentItem
*/
protected List<PartyPaymentItem> paymentItem ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field partySettlementPayment
*/
protected List<PartySettlementPayment> partySettlementPayment ;




/**  
* Field paymentDirection
* The direction of the payment seen by the company. It can be be inbound 

*  (payment mate to the company) or outbound (payment made by the compan 

* y). 

*/
protected String paymentDirection ;




/**  
* Field status
* The payment might be either requested, accepted or rejected. 

*/
protected String status ;




/**  
* Field description
* Description about the payment. 

*/
protected String description ;




/**  
* Field bankAccount
*/
protected BankAccount bankAccount ;




/**  
* Field customerPayment
*/
protected CustomerPayment customerPayment ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyOrder
*/
protected List<PartyOrder> partyOrder ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field partyRevShareReconciliationItem
*/
protected List<PartyRevShareReconciliationItem> partyRevShareReconciliationItem ;




/**  
* Field partyRevShareReconDiscrepancy
*/
protected List<PartyRevShareReconDiscrepancy> partyRevShareReconDiscrepancy ;




/**  
* Field partyRevenueShare
*/
protected List<PartyRevenueShare> partyRevenueShare ;


}