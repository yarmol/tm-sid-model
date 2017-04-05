/**
* Security Incident ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3U.o.x.gG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Incident ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_incident_business_entity ;

/**
* The encompassing impact due to an incident, including financial loss,  
* loss to operations, etc.  
 @since SID_R16.5
*/ 

public  class SecurityIncidentImpact  {



/**  
* Field securityIncidentImpactLevel
*/
protected SecurityIncidentImpactLevel securityIncidentImpactLevel ;




/**  
* Field accessLevel
*/
protected List<String> accessLevel ;




/**  
* Field encompassingFinancialImpact
* Financial impact due to Incident 

*/
protected Money encompassingFinancialImpact ;




/**  
* Field staffHoursLost
* Estimate of staff hours lost due to the incident 

*/
protected Integer staffHoursLost ;




/**  
* Field totalResourcesAffected
* Total number of resources directly impacted by the incident 

*/
protected Integer totalResourcesAffected ;




/**  
* Field securityEntity
*/
protected List<SecurityEntity> securityEntity ;




/**  
* Field securityIncidentAssessment
*/
protected SecurityIncidentAssessment securityIncidentAssessment ;


}