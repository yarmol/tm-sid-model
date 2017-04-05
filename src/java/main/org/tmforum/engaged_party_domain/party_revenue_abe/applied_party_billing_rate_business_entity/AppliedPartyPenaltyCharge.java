/**
* Applied Party Billing Rate ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eW3QE4.cE.eO_X.pEX.s37Q.e.w-content.html">Applied Party Billing Rate ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.applied_party_billing_rate_business_entity ;

/**
* The AppliedPartyPenaltyCharge is a type of AppliedPartyBillingCharge.I 
* t represents penalty charges such as late fees, payment rejection fees 
* , interests, that could be applied, linked to dunning of a due amount, 
*  in order to bill the party according to contractual terms and conditi 
* ons. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Applied Party Billing Rate ABE::AtomicAppliedPartyBillingRate" href="_.a.eW3.gU4.cE.eO_X.pEX.s37Q.e.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Applied Party Billing Rate ABE::AtomicAppliedPartyBillingRate</a> |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Applied Party Billing Rate ABE::AppliedPartyBillingRate" href="_.a.eW3ZE4.cE.eO_X.pEX.s37Q.e.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Applied Party Billing Rate ABE::AppliedPartyBillingRate</a> @since SID_R16.5
*/ 

public  class AppliedPartyPenaltyCharge extends AtomicAppliedPartyBillingRate,AppliedPartyBillingRate {



/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;


}