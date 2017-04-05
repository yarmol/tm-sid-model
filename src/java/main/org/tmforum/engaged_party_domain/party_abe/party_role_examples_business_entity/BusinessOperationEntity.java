/**
* Party Role Examples ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B34027A-content.html">Party Role Examples ABE</a> 
* A set of example PartyRoles that a Party may play. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_examples_business_entity ;

import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;

/**
* An entity operating its business independently based on its business o 
* bjective and which a Customer, Partner or other business related Party 
* Role has an agreement with. For example, from Enterprise’s perspective 
* , BusinessOperationEntity can be used to model MVNO and MVNE. For Busi 
* nessOperationEntity, the type of Organization might be company.  

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class BusinessOperationEntity extends PartyRole {



/**  
* Field description
* An explanation about business operation related to the BusinessOperati 

* onEntity. 

*/
protected String description ;


}