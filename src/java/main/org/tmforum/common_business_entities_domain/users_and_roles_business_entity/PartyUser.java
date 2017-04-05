/**
* Users and Roles ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.yGXR.wE.d0E.eG.cM.fR.d.w6U4D.g-content.html">Users and Roles ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.users_and_roles_business_entity ;

import org.tmforum.engaged_party_domain.party_business_entity.Party;

/**
* A specialization of the InvolvementIdentification entity used to indic 
* ate that he actor identified is a party (an individual or an organizat 
* ion). 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Users and Roles ABE::InvolvementIdentification" href="_.e.k.pT.sE.d2E.eG.cM.fR.d.w6U4D.g-content.html">SID Models::Common Business Entities Domain::Users and Roles ABE::InvolvementIdentification</a> @since SID_R16.5
*/ 

public  class PartyUser extends InvolvementIdentification {



/**  
* Field party
*/
protected Party party ;


}