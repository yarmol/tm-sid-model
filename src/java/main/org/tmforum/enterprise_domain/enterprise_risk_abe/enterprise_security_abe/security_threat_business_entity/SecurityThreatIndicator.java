/**
* Security Threat ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.bHFW.oG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Threat ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_business_entity ;

/**
* A unique name for the threat indicator 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SecurityThreatIndicator extends Entity {



/**  
* Field securityThreat
*/
protected SecurityThreat securityThreat ;




/**  
* Field securityThreatTool
*/
protected List<SecurityThreatTool> securityThreatTool ;




/**  
* Field securityThreatExploit
*/
protected List<SecurityThreatExploit> securityThreatExploit ;




/**  
* Field securityThreatIndicatorSpecification
*/
protected SecurityThreatIndicatorSpecification securityThreatIndicatorSpecification ;




/**  
* Field securityThreatTechnique
*/
protected List<SecurityThreatTechnique> securityThreatTechnique ;




/**  
* Field name
* A unique name for the threat indicator 

*/
protected String name ;




/**  
* Field description
* Description the threat indicator 

*/
protected String description ;


}