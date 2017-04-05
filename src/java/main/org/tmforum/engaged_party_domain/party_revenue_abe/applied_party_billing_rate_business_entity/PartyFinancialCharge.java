/**
* Applied Party Billing Rate ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eW3QE4.cE.eO_X.pEX.s37Q.e.w-content.html">Applied Party Billing Rate ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.applied_party_billing_rate_business_entity ;

/**
* FinancialCharge represent a normalized aggregation of AtomicAppliedPar 
* tyBillingRate so every AtomicAppliedPartyBillingRate appears in exactl 
* y one FinancialCharge. This is critical for financial reporting. 
 @since SID_R16.5
*/ 

public  class PartyFinancialCharge  {



/**  
* Field atomicAppliedPartyBillingRate
*/
protected List<AtomicAppliedPartyBillingRate> atomicAppliedPartyBillingRate ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;


}