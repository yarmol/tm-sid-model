/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* The elements that are used to extend the base event type for audit rec 
* ords consist of a single text field to contain log data.  The Common E 
* vent Expression (CEE) standard to build out the common elements that c 
* an be captured and returned as part of an audit record event. 

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class AuditRecordSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field logData
* Text from logs that captured information relevant to the event. 

*/
protected List<String> logData ;


}