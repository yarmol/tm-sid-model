/**
* Party Organization ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_W2.w-8IH.mE.eW.e1.q.f.pS.tFE.qA-content.html">Party Organization ABE</a> 
* Used to model Party Organization. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_organization_business_entity ;

import org.tmforum.engaged_party_domain.party_business_entity.Organization;

/**
* A type of Organization that does not have any subordinate Organization 
* . That is, an AtomicOrganization  is a leaf-level Organization. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::Organization |- 
 SID Models::Engaged Party Domain::Party ABE::Party @since SID_R16.5
*/ 

public  class AtomicOrganization extends Organization {

}