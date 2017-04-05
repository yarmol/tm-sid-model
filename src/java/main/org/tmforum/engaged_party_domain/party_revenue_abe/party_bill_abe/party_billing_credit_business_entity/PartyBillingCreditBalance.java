/**
* Party Billing Credit ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.b.v704.cE.eO_X.pEX.s37Q.e.w-content.html">Party Billing Credit ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_abe.party_billing_credit_business_entity ;

/**
* A remaining or outstanding credit for a PartyAccount. 
 @since SID_R16.5
*/ 

public abstract class PartyBillingCreditBalance  {



/**  
* Field validFor
* The period for which the balance is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field creditBalanceAmount
* The amount of the credit and the currency in which the amount is expre 

* ssed. 

*/
protected Money creditBalanceAmount ;




/**  
* Field partyBillingCredit
*/
protected PartyBillingCredit partyBillingCredit ;


}