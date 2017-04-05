/**
* Party Role Examples ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E961B34027A-content.html">Party Role Examples ABE</a> 
* A set of example PartyRoles that a Party may play. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_examples_business_entity ;

/**
* An OrganizationPost is a PartyRole that is used to model where a one o 
* r more employees share a function. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class OrganizationPost extends PartyRole {



/**  
* Field jobTitle
* The name of the job title associated with the OrganizationalPost. 

*/
protected String jobTitle ;


}