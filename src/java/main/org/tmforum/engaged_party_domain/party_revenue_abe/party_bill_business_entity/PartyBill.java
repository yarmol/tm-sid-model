/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A total amount due from a PartyAccount for all products during the bil 
* ling period. 
 @since SID_R16.5
*/ 

public  class PartyBill  {



/**  
* Field billNo
* A unique identification number of a bill. 

*/
protected String billNo ;




/**  
* Field billAmount
* A total party bill amount due. 

*/
protected Money billAmount ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field partyBillSpec
*/
protected PartyBillSpec partyBillSpec ;




/**  
* Field appliedPartyBillingRate
*/
protected List<AppliedPartyBillingRate> appliedPartyBillingRate ;




/**  
* Field paymentItem
*/
protected List<PartyPaymentItem> paymentItem ;




/**  
* Field partyDisputedAmount
*/
protected List<PartyDisputedAmount> partyDisputedAmount ;




/**  
* Field financialCharge
*/
protected List<PartyFinancialCharge> financialCharge ;




/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;




/**  
* Field customerBill
*/
protected CustomerBill customerBill ;




/**  
* Field partyRevShareReconciliationItem
*/
protected List<PartyRevShareReconciliationItem> partyRevShareReconciliationItem ;




/**  
* Field partyRevenueShare
*/
protected List<PartyRevenueShare> partyRevenueShare ;




/**  
* Field partyRevenueShare2
*/
protected List<PartyRevenueShare> partyRevenueShare2 ;


}