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
* A role a party plays in a relationship to a Commitment, such as a Buye 
* r or Supplier, and in that role the party has procured the commitment  
* of another party playing a role. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionRole @since SID_R16.5
*/ 

public  class CommitmentProcurementRole extends BusinessInteractionRole {



/**  
* Field buyer
*/
protected Buyer buyer ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field community
*/
protected Community community ;


}