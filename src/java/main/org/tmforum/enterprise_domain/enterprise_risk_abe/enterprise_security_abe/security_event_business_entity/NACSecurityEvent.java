/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* NAC events are generated whenever new devices and/or users attempt to  
* gain access to a network.  The NAC event record will record the name o 
* f the network where access was attempted, the access decision (permit/ 
* deny), IP and MAC address of the device/user, and the name provided on 
*  the credential that was used to gain access – X.509 subject name, MAC 
*  address, or other name.  Network access may be granted on the basis o 
* f either device or user credentials depending on the local security po 
* licy.  

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class NACSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field nacSecurityEventSubject
*/
protected NACSecurityEventSubject nacSecurityEventSubject ;




/**  
* Field targetNetwork
* URI-based name of the network the subject attempted to gain access to. 

*/
protected URI targetNetwork ;




/**  
* Field accessDecision
*/
protected String accessDecision ;


}