/**
* Security Incident ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3U.o.x.gG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Incident ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_incident_business_entity ;

/**
* Date and time initially reported. 
 @since SID_R16.5
*/ 

public  class SecurityIncident  {



/**  
* Field securityIncidentAttachment
*/
protected List<SecurityIncidentAttachment> securityIncidentAttachment ;




/**  
* Field securityIncidentAttackMethod
*/
protected List<SecurityIncidentAttackMethod> securityIncidentAttackMethod ;




/**  
* Field securityIncidentHistory
*/
protected List<SecurityIncidentHistory> securityIncidentHistory ;




/**  
* Field securityThreatActor
*/
protected List<SecurityThreatActor> securityThreatActor ;




/**  
* Field entityIdentification
*/
protected List<EntityIdentification> entityIdentification ;




/**  
* Field troubleTicket
*/
protected List<TroubleTicket> troubleTicket ;




/**  
* Field securityIncidentAssessment
*/
protected SecurityIncidentAssessment securityIncidentAssessment ;




/**  
* Field intiallyReportedDateTime
* Date and time initially reported. 

*/
protected Object intiallyReportedDateTime ;




/**  
* Field validFor
* Assessment of start and end date/time event activity associated with t 

* his incident occurred. 

*/
protected TimePeriod validFor ;




/**  
* Field initialDetectionDateTime
* Date/time initial detection of activity occurred associated with this  

* incident. 

*/
protected Object initialDetectionDateTime ;




/**  
* Field isFalsePositive
* Boolean for the evaluation whether this incident is a false positive o 

* r not. 

*/
protected Boolean isFalsePositive ;




/**  
* Field isExercise
* Indicates whether this incident is real or part of an exercise (i.e. p 

* art of a test of an organization's security posture). 

*/
protected Boolean isExercise ;




/**  
* Field exerciseDescription
* If the incident is part of an exercise, this attribute describes that  

* exercise. 

*/
protected String exerciseDescription ;




/**  
* Field lastUpdateDateTime
* Last date/time the incident was updated. 

*/
protected Object lastUpdateDateTime ;




/**  
* Field status
* Free-text analyst description of the current status of the incident 

*/
protected String status ;




/**  
* Field synopsis
* Free text synopsis for analyst notes 

*/
protected String synopsis ;




/**  
* Field detectionMethod
* Method used for detection (e.g. user report, detected by sensor, netwo 

* rk flow analysis) 

*/
protected List<String> detectionMethod ;




/**  
* Field targetUsedAs
* Description of the how the compromised resource was used by the attack 

* er. 

*/
protected List<String> targetUsedAs ;




/**  
* Field securityEvent
*/
protected List<SecurityEvent> securityEvent ;




/**  
* Field securityTrackingParty
*/
protected List<SecurityIncidentRelatedParty> securityTrackingParty ;


}