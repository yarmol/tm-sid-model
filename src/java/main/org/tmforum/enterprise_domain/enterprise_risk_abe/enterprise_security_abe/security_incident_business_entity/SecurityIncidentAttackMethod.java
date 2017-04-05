/**
* Security Incident ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3U.o.x.gG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Incident ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_incident_business_entity ;

/**
* Attack method chosen from the following enumerated list: Exploited New 
*  VulnerabilityExploited Known VulnerabilitySelf Propagating Malicious  
* LogicInsider PurposefulInsider AccidentalDistributed Network ActivityN 
* on Distributed Network ActivityNetwork ScanSystem ScanCompromise Throu 
* gh Another SystemReconnaissanceUnknown/NAOther (See Comment)  
 @since SID_R16.5
*/ 

public  class SecurityIncidentAttackMethod  {



/**  
* Field securityIncident
*/
protected SecurityIncident securityIncident ;




/**  
* Field attackVector
* Attack method chosen from the following enumerated list: </br></br>Exp 

* loited New Vulnerability</br>Exploited Known Vulnerability</br>Self Pr 

* opagating Malicious Logic</br>Insider Purposeful</br>Insider Accidenta 

* l</br>Distributed Network Activity</br>Non Distributed Network Activit 

* y</br>Network Scan</br>System Scan</br>Compromise Through Another Syst 

* em</br>Reconnaissance</br>Unknown/NA</br>Other (See Comment)  

*/
protected String attackVector ;




/**  
* Field description
* Free text field descriping the attack method 

*/
protected String description ;




/**  
* Field rootCause
* Description of the root cause of the attack 

*/
protected String rootCause ;


}