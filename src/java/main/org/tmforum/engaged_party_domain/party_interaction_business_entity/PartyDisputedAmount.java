/**
* Party Interaction ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eK.qAE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Interaction ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_interaction_business_entity ;

/**
* PartyDisputedAmount is a type of DisputedAmount which represents an am 
* ount of money in dispute between the enterprise and one of its partys 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::Disputed Amount ABE::DisputedAmount |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class PartyDisputedAmount extends DisputedAmount,BusinessInteraction {



/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field appliedPartyBillingCharge
*/
protected AppliedPartyBillingCharge appliedPartyBillingCharge ;




/**  
* Field appliedPartyBillingCredit
*/
protected AppliedPartyBillingCredit appliedPartyBillingCredit ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field partyAccount2
*/
protected PartyAccount partyAccount2 ;


}