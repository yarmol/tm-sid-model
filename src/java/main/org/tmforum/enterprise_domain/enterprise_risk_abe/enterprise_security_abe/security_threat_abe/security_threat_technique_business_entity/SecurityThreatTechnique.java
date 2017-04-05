/**
* Security Threat Technique ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.e.p.yMHKPE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Threat Technique ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_abe.security_threat_technique_business_entity ;

/**
* A misuse of a legitimate service to exploit and an IT resource.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SecurityThreatTechnique extends Entity {



/**  
* Field securityThreat
*/
protected List<SecurityThreat> securityThreat ;




/**  
* Field securityThreatExploit
*/
protected List<SecurityThreatExploit> securityThreatExploit ;




/**  
* Field securityVulnerability
*/
protected List<SecurityVulnerability> securityVulnerability ;




/**  
* Field securityThreatActor
*/
protected SecurityThreatActor securityThreatActor ;




/**  
* Field securityThreatTechniqueSpecification
*/
protected SecurityThreatTechniqueSpecification securityThreatTechniqueSpecification ;




/**  
* Field securityThreatIndicator
*/
protected List<SecurityThreatIndicator> securityThreatIndicator ;




/**  
* Field name
* A human-readable name to a given threat technique. 

*/
protected String name ;




/**  
* Field type
* Enumerated List of the technique types, such as: </br></br>Social Engi 

* neering</br>Physical Insertion</br>Physical Destruction</br>Physical D 

* enial of Service</br>Logical Denial of Service</br>Logical Code Insert 

* ion</br>Logical Destruction  

*/
protected String type ;




/**  
* Field cweUsed
* The weakness used by the technique defined as a Common Weakness Enumer 

* ation (CWE).  Http://cwe.mitre.org 

*/
protected List<String> cweUsed ;




/**  
* Field description
* Free text description of the technique. 

*/
protected String description ;




/**  
* Field unauthorizedResults
* Description of the unauthorized results obtained through the use of th 

* is technique 

*/
protected String unauthorizedResults ;


}