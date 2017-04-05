/**
* Security Threat ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.bHFW.oG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Threat ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_business_entity ;

/**
* The type of threat, such as: OrganizationPersonTool - A tool will cont 
* ain some number of exploits in addition to means to propagate and exer 
* cise the exploits against a target.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SecurityThreat extends Entity {



/**  
* Field securityThreatActor
*/
protected SecurityThreatActor securityThreatActor ;




/**  
* Field securityThreatIndicator
*/
protected List<SecurityThreatIndicator> securityThreatIndicator ;




/**  
* Field securityThreatTechnique
*/
protected List<SecurityThreatTechnique> securityThreatTechnique ;




/**  
* Field securityThreatExploit
*/
protected List<SecurityThreatExploit> securityThreatExploit ;




/**  
* Field entityIdentification
*/
protected List<EntityIdentification> entityIdentification ;




/**  
* Field type
* The type of threat, such as: </br></br>Organization</br>Person</br>Too 

* l - A tool will contain some number of exploits in addition to means t 

* o propagate and exercise the exploits against a target.  

*/
protected String type ;


}