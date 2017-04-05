/**
* Party Role Examples ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B34027A-content.html">Party Role Examples ABE</a> 
* A set of example PartyRoles that a Party may play. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_examples_business_entity ;

import org.tmforum.engaged_party_domain.agreement_abe.commitment_business_entity.CommitmentFulfilmentRole;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.resource_domain.resource_specification_business_entity.ResourceSpecification;

import java.util.List;

/**
* A PartyRole played by a Party, who commits to provide a deliverable to 
*  a Buyer by a formal Agreement (Commitment) 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class Supplier extends PartyRole {



/**  
* Field commitmentFulfilmentRole
*/
protected CommitmentFulfilmentRole commitmentFulfilmentRole ;




/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;


}