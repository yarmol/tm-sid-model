/**
* Commitment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_F.b64YN35E.d-N.iI2.iK4.pCF.g-content.html">Commitment ABE</a> 
* The Commitment ABE, derived from the Business Interaction ABE, reflect 
* s the mutual agreement between parties about services, products, resou 
* rces or some other kind of deliverable that has to be provided by the  
* party playing the role of a Commitment fulfiller to the party, playing 
*  the role of a Commitment procurer. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.agreement_abe.commitment_business_entity ;

/**
* A formal term or condition to govern a commitment. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Agreement ABE::AgreementTermOrCondition @since SID_R16.5
*/ 

public  class CommitmentTermOrCondition extends AgreementTermOrCondition {



/**  
* Field projectDeliverable
*/
protected ProjectDeliverable projectDeliverable ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}