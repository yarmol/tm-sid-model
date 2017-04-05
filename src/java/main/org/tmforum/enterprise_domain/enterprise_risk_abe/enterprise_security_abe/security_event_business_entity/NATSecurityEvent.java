/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* NAT events are recorded so that network defenders can discover the tru 
* e originating IP address and port number of a device, which has sent i 
* nformation through a firewall proxy or another type of proxying device 
* , which changes the internal source IP address.  The NAT event will re 
* cord the internal source IP address and port number, the IP address an 
* d port number it was translated to, as well as the external destinatio 
* n IP address and port number.  

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class NATSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field securityEventEndpoint
*/
protected SecurityEventEndpoint securityEventEndpoint ;


}