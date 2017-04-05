/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* A change of state that has significance for the security of a Configur 
* ation Item or IT Service.  SecurityEvents are designed to carry inform 
* ation about network defense-related activities that are sensed on netw 
* orks and network-connected devices.  SecurityEvents can be either asse 
* ssed in depth to determine if successful intrusions or compromises res 
* ulted, or they can be aggregated to characterize the threat environmen 
* t.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class SecurityEvent extends Entity {



/**  
* Field securityEvent
*/
protected SecurityEvent securityEvent ;




/**  
* Field securityEvent1
*/
protected List<SecurityEvent> securityEvent1 ;




/**  
* Field eventSpecification
*/
protected SecurityEventSpecification eventSpecification ;




/**  
* Field securityEventCollectionMethod
*/
protected List<SecurityEventCollectionMethod> securityEventCollectionMethod ;




/**  
* Field securityVulnerability
*/
protected List<SecurityVulnerability> securityVulnerability ;




/**  
* Field securityIncident
*/
protected List<SecurityIncident> securityIncident ;




/**  
* Field id
*/
protected String id ;




/**  
* Field comments
* Free text field for security analyst comments associated with an event 

* .  

*/
protected List<String> comments ;




/**  
* Field name
*/
protected String name ;




/**  
* Field validFor
* The start and end time the event occured during.  

*/
protected TimePeriod validFor ;


}