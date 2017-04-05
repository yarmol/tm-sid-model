/**
* Security Entity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.nOT-.cG9.kE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Entity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_entity_business_entity ;

/**
* The party, resource, or role involved in Enterprise Security  
 @since SID_R16.5
*/ 

public abstract class SecurityEntity  {



/**  
* Field entityIdentification
*/
protected List<EntityIdentification> entityIdentification ;




/**  
* Field securityVulnerability
*/
protected List<SecurityVulnerability> securityVulnerability ;




/**  
* Field securityEntity
*/
protected List<SecurityEntity> securityEntity ;




/**  
* Field securityEntity2
*/
protected List<SecurityEntity> securityEntity2 ;




/**  
* Field securityVulnerabilityFixAction
*/
protected List<SecurityVulnerabilityFixAction> securityVulnerabilityFixAction ;




/**  
* Field securityIncidentAssessment
*/
protected SecurityIncidentImpact securityIncidentAssessment ;


}