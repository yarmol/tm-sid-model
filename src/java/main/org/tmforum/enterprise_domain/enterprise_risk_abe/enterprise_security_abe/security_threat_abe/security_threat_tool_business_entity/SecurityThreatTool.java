/**
* Security Threat Tool ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.oJ.pEIHM.bE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Threat Tool ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_abe.security_threat_tool_business_entity ;

/**
* Human-readable name of the tool used 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SecurityThreatTool extends Entity {



/**  
* Field securityThreatIndicator
*/
protected SecurityThreatIndicator securityThreatIndicator ;




/**  
* Field securityThreatExploit
*/
protected List<SecurityThreatExploit> securityThreatExploit ;




/**  
* Field securityThreatActor
*/
protected SecurityThreatActor securityThreatActor ;




/**  
* Field securityThreatToolSpecification
*/
protected SecurityThreatToolSpecification securityThreatToolSpecification ;




/**  
* Field resource
*/
protected Resource resource ;




/**  
* Field name
* Human-readable name of the tool used 

*/
protected String name ;




/**  
* Field unauthorizedResults
* Description of the unauthorized results obtained through the use of th 

* is tool 

*/
protected String unauthorizedResults ;


}