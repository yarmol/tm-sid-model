/**
* Party Billing Credit ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.b.v704.cE.eO_X.pEX.s37Q.e.w-content.html">Party Billing Credit ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_abe.party_billing_credit_business_entity ;

/**
* The amount of a deduction that can be applied against an amount charge 
* d for a Product on a PartyBill. Billing credits are typically governed 
*  by ProductPriceRule(s) and ProductPriceAlteration(s). 
 @since SID_R16.5
*/ 

public abstract class PartyBillingCredit  {



/**  
* Field creditForPeriod
* The period for which the credit is valid. 

*/
protected TimePeriod creditForPeriod ;




/**  
* Field partyBillingCreditBalance
*/
protected PartyBillingCreditBalance partyBillingCreditBalance ;


}