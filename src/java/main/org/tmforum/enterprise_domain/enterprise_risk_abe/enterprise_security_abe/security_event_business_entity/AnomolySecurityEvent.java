/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* Several event types are set aside, primarily as placeholders, pending  
* development of better standards and guidance on how the data elements  
* they may contain are defined. The anomaly event type is one of these t 
* ypes.  The elements that are used to extend the base event type for an 
* omalies consist of a text field to describe the anomaly and a text fie 
* ld to contain log data.  

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class AnomolySecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field description
* Descriptive information about the event. 

*/
protected String description ;




/**  
* Field logData
* Text from logs that captured information relevant to the event. 

*/
protected List<String> logData ;


}