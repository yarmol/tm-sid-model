/**
* Security Incident ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3U.o.x.gG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Incident ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_incident_business_entity ;

/**
* Enumeration of the roles the Security Party plays in the incident, suc 
* h as Notifying, Affected, Tracking.  

Inheritance tree: |- 
 SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Entity ABE::PartySecurityEntity |- 
 SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Entity ABE::SecurityEntity @since SID_R16.5
*/ 

public  class SecurityIncidentRelatedParty extends PartySecurityEntity,SecurityEntity {



/**  
* Field securityIncident
*/
protected SecurityIncident securityIncident ;




/**  
* Field role
* Enumeration of the roles the Security Party plays in the incident, suc 

* h as Notifying, Affected, Tracking.  

*/
protected List<String> role ;


}