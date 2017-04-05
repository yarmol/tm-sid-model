/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* DHCP events are structured to allow network defenders to track a given 
*  machine, by Media Access Control (MAC) address to an Internet Protoco 
* l (IP) address.  Noting that DHCP IP addresses assign an IP address to 
*  a given MAC address for a specified lease period, the DHCP event trac 
* ks these elements.  

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class DHCPSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field ipAddress
*/
protected IPAddress ipAddress ;




/**  
* Field leaseDuration
* The time duration that the IP address has been assigned to the MAC add 

* ress for.  

*/
protected TimePeriod leaseDuration ;




/**  
* Field clientMACAddress
* The Media Access Control (MAC) address that was assigned an IP address 

*  during this DHCP event. 

*/
protected String clientMACAddress ;


}