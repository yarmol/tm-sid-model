/**
* Security Threat Technique ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.e.p.yMHKPE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Threat Technique ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_abe.security_threat_technique_business_entity ;

/**
* Enables dynamic creation of new types of SecurityThreatTechniques (e.g 
* . PKI, Email, SQL) 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SecurityThreatTechniqueSpecification extends EntitySpecification,RootEntity {



/**  
* Field securityThreatTechnique
*/
protected List<SecurityThreatTechnique> securityThreatTechnique ;


}