/**
* Party ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D812BC602C5-content.html">Party ABE</a> 
* A Party represents an individual or an organization, or an organizatio 
* n unit that are of interest, involved or that provide value directly o 
* r indirectly from an enterprise perspective (Enterprise is to be under 
* stood here as provider, service provider or operator). Hence the Party 
*  plays one or more roles with the enterprise or with another Party pla 
* ying a role with the enterprise (indirectly). This is introduced to sp 
* ecify that the only party an enterprise would be interested in and wil 
* l consider in its systems is a party playing a role (directly or indir 
* ectly). Roles would be represented by the PartyRole concept. Additiona 
* l roles will be defined to cover the needs of the new digital ecosyste 
* m."Examples of roles played by Parties include those:•&nbsp;&nbsp;&nbs 
* p;&nbsp;Of interest, such as competitors, sales prospects •&nbsp;&nbsp 
* ;&nbsp;&nbsp;Involved, such as customers, users, employees•&nbsp;&nbsp 
* ;&nbsp;&nbsp;That provides value directly or indirectly, such as servi 
* ce providers, operators, cloud brokers, infrastructure providers, appl 
* ication developers. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.engaged_party_domain.party_abe.identification_business_entity.OrganizationIdentification;
import org.tmforum.engaged_party_domain.party_abe.identification_business_entity.PartyIdentification;
import org.tmforum.engaged_party_domain.party_abe.party_organization_business_entity.OrganizationDecompostionComponent;
import org.tmforum.engaged_party_domain.party_abe.party_role_group_business_entity.PartyRoleGroup;

import java.util.List;

/**
* A group of people identified by shared interests or purpose. Examples  
* include business, department, enterprise.Because of the complex nature 
*  of many businesses, both organizations and organization units are rep 
* resented by the same business entity in this model. An Organization is 
*  a type of Party 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party ABE::Party" href="_3E3F0EC000E93C23195B0104-content.html">SID Models::Engaged Party Domain::Party ABE::Party</a> @since SID_R16.5
*/ 

public  class Organization extends Party {



/**  
* Field partyIdentification
*/
protected List<PartyIdentification> partyIdentification ;




/**  
* Field isLegalEntity
* Permitted Values:</br>TRUE or FALSE</br> 

*/
protected Boolean isLegalEntity ;




/**  
* Field existsDuring
* Incorporation date to disincorporation date. 

*/
protected TimePeriod existsDuring ;




/**  
* Field type
* The type of organization</br></br>Notes:</br>Club, Society, … 

*/
protected String type ;




/**  
* Field organizationName
*/
protected OrganizationName organizationName ;




/**  
* Field organizationIdentification
* Organization Identification represents our registration of information 

*  used as proof of identity by an Organization 

*/
protected List<OrganizationIdentification> organizationIdentification ;




/**  
* Field language
*/
protected Language language ;




/**  
* Field organizationDecompostionComponent
*/
protected List<OrganizationDecompostionComponent> organizationDecompostionComponent ;




/**  
* Field partyRoleGroup
*/
protected List<PartyRoleGroup> partyRoleGroup ;


}