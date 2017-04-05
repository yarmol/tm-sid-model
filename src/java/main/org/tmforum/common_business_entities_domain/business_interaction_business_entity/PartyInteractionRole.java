/**
* Business Interaction ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C18FFFD032B-content.html">Business Interaction ABE</a> 
* The Business Interaction ABE represents an arrangement, contract, or c 
* ommunication between an enterprise and one or more other entities such 
*  as individuals and organizations (or parts of organizations).  Intera 
* ctions take on the form of requests, responses, and notifications. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.business_interaction_business_entity ;

/**
* A Party (represented as a Party or PartyRole) playing a role in a Busi 
* ness Interaction.  An instantiation of this class is associated either 
*  to a Party or PartRole (mutually exclusive) but not both. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionRole" href="_3E3F0EC000E93C1909F90127-content.html">SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionRole</a> @since SID_R16.5
*/ 

public  class PartyInteractionRole extends BusinessInteractionRole {



/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field party
*/
protected Party party ;




/**  
* Field partyRevenueShare
*/
protected List<PartyRevenueShare> partyRevenueShare ;


}