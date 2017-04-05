/**
* Party Role Group ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.j.sY.zYK.pIE.e.a9.x.aO.u9AAIX.g-content.html">Party Role Group ABE</a> 
* Party Role Group ABE contains all Business Entities used to specify Pa 
* rtyRoleGroups. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_group_business_entity ;

/**
* A PRGSpecRule is a type of PolicyRule specifying rules that have to be 
*  checked up to allow a PartyRole to be part of a PartyRoleGroup. For e 
* xample, "all Parties must live at the same location to be considered a 
* s member of the same Family". 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy ABE::PolicyRule |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicyRuleBase |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PRGSpecRule extends PolicyRule,PolicyRuleBase,PolicySet,Policy,RootEntity {



/**  
* Field partyRoleGroupSpecification
*/
protected PartyRoleGroupSpecification partyRoleGroupSpecification ;


}