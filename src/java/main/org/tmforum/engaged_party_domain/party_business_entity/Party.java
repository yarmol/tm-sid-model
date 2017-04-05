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
import org.tmforum.common_business_entities_domain.business_interaction_business_entity.PartyInteractionRole;
import org.tmforum.common_business_entities_domain.metric_abe.metric_definition_business_entity.MetricDefinitionInvolvement;
import org.tmforum.common_business_entities_domain.users_and_roles_business_entity.PartyUser;
import org.tmforum.engaged_party_domain.party_abe.contact_business_entity.ContactMedium;
import org.tmforum.engaged_party_domain.party_abe.party_profile_business_entity.PartyProfile;
import org.tmforum.engaged_party_domain.party_abe.skill_business_entity.Skill;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_entity_business_entity.PartySecurityEntity;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity.SecurityEventCollectionMethod;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_business_entity.PartySecurityThreatActor;

import java.util.List;

/**
* Represents an  individual, organization or organization unit.Party is  
* an abstract concept that should be used in places where the business s 
* ays something can be an organization , organization unit or an individ 
* ual  
 @since SID_R16.5
*/ 

public abstract class Party  {



/**  
* Field partyId
* Unique identifier for Party 

*/
protected String partyId ;




/**  
* Field validFor
* The time period that the Party is valid for 

*/
protected TimePeriod validFor ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partySecurityEntity
*/
protected PartySecurityEntity partySecurityEntity ;




/**  
* Field partySecurityThreatActor
*/
protected PartySecurityThreatActor partySecurityThreatActor ;




/**  
* Field securityEventCollectionMethod
*/
protected List<SecurityEventCollectionMethod> securityEventCollectionMethod ;




/**  
* Field skill
*/
protected List<Skill> skill ;




/**  
* Field partyUser
*/
protected List<PartyUser> partyUser ;




/**  
* Field metricDefinitionInvolvement
*/
protected List<MetricDefinitionInvolvement> metricDefinitionInvolvement ;




/**  
* Field partyInteractionRole
*/
protected List<PartyInteractionRole> partyInteractionRole ;




/**  
* Field contactMedium
*/
protected List<ContactMedium> contactMedium ;




/**  
* Field partyProfile
*/
protected List<PartyProfile> partyProfile ;


}