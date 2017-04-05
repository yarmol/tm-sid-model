/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* An arrangement that a party has with an enterprise that provides produ 
* cts to the party and collects AppliedPartyBillingRate that are used to 
*  produce PartyBill. 
 @since SID_R16.5
*/ 

public  class PartyAccount  {



/**  
* Field ID
* A unique identifier. 

*/
protected String ID ;




/**  
* Field name
* The name of the account. 

*/
protected String name ;




/**  
* Field accountType
* A categorization of an account, such as individual, joint, and so fort 

* h, whose instances share some of the same characteristics.</br>For exa 

* mple the accountType might be "BillingAccount" corresponding to an acc 

* ount for which Invoices are produced or "SettlementAccount" correspond 

* ing to an account for which Settlement notes are produced.. 

*/
protected String accountType ;




/**  
* Field accountStatus
* The condition of the account, such as due, paid, in arrears. 

*/
protected String accountStatus ;




/**  
* Field creditLimit
* The maximum amount of money that may be charged on a account.</br></br 

* > 

*/
protected long creditLimit ;




/**  
* Field pin
* A multidigit personal identification numbe that is used by a Party to  

* gain access to a PartyAccount at an ATM, a computer, or a telephone sy 

* stem, and so forth. 

*/
protected String pin ;




/**  
* Field partyAccountTaxExemption
*/
protected List<PartyAccountTaxExemption> partyAccountTaxExemption ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyAccount1
*/
protected List<PartyAccount> partyAccount1 ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field partyBill
*/
protected List<PartyBill> partyBill ;




/**  
* Field partyBillSpec
*/
protected List<PartyBillSpec> partyBillSpec ;




/**  
* Field partyAccountChargeSum
*/
protected List<PartyAccountChargeSum> partyAccountChargeSum ;




/**  
* Field partyAccountChargeSumSpec
*/
protected List<PartyAccountChargeSumSpec> partyAccountChargeSumSpec ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field paymentPlan
*/
protected List<PaymentPlan> paymentPlan ;




/**  
* Field partyDisputedAmount
*/
protected List<PartyDisputedAmount> partyDisputedAmount ;




/**  
* Field partyDisputedAmount2
*/
protected List<PartyDisputedAmount> partyDisputedAmount2 ;




/**  
* Field financialCharge
*/
protected List<PartyFinancialCharge> financialCharge ;




/**  
* Field dunningScenario
*/
protected DunningScenario dunningScenario ;




/**  
* Field dunningCase
*/
protected List<DunningCase> dunningCase ;




/**  
* Field involvementRole
*/
protected List<InvolvementRole> involvementRole ;




/**  
* Field partyAccountContact
*/
protected List<PartyAccountContact> partyAccountContact ;




/**  
* Field partyAccountInteractionRole
*/
protected List<PartyAccountInteractionRole> partyAccountInteractionRole ;




/**  
* Field partySettlement
*/
protected List<PartySettlement> partySettlement ;




/**  
* Field customerAccount
*/
protected CustomerAccount customerAccount ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field partyOrder
*/
protected List<PartyOrder> partyOrder ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;


}