/**
* Security Incident ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3U.o.x.gG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Incident ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_incident_business_entity ;

/**
* Provides the analysis of how the incident occured, what actor performe 
* d the attack which caused the incident, and the operational and techin 
* cal impact to the organization. 
 @since SID_R16.5
*/ 

public  class SecurityIncidentAssessment  {



/**  
* Field securityIncident
*/
protected SecurityIncident securityIncident ;




/**  
* Field securityIncidentImpact
*/
protected SecurityIncidentImpact securityIncidentImpact ;




/**  
* Field securityThreatActor
*/
protected SecurityThreatActor securityThreatActor ;




/**  
* Field incidentCause
* Free text description of the cause of an intrusion 

*/
protected String incidentCause ;




/**  
* Field weaknessAllowingIncidentToOccur
*/
protected String weaknessAllowingIncidentToOccur ;


}