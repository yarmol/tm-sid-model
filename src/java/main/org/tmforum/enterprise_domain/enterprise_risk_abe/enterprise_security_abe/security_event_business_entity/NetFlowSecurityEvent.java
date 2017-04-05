/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* A NetFlowSecurityEvent is a capture of IP traffic between two end host 
* s.  The number of packets, number of bytes, and other characteristics  
* about the flow are captured, so further analysis can be performed with 
*  other inputs to determine malicious activity.    

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class NetFlowSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field protocol
* Integer number of the protocol used in the network flow. 

*/
protected Integer protocol ;




/**  
* Field numberOfPackets
* Total number of packets in the network flow 

*/
protected Integer numberOfPackets ;




/**  
* Field numberOfBytes
* Total number of bytes captured in a network flow 

*/
protected Integer numberOfBytes ;




/**  
* Field flags
* Flags set in packet headers 

*/
protected String flags ;




/**  
* Field securityEventEndpoint
*/
protected SecurityEventEndpoint securityEventEndpoint ;


}