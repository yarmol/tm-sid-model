/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* A SignatureSecurityEvent is an event detected by a signature-based sen 
* sor (e.g. an Intrusion Detection System (IDS) or anti-virus software) 

Inheritance tree: |- 
 <a title="SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent" href="_KPL6.gG.p.zE.d-YI.u.d.m.h.f.tT.l.g-content.html">SID Models::Enterprise Domain::Enterprise Risk ABE::Enterprise Security ABE::Security Event ABE::SecurityEvent</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SignatureSecurityEvent extends SecurityEvent,Entity,RootEntity {



/**  
* Field numberOfPackets
* Total packets collected by the sensor for the event 

*/
protected Integer numberOfPackets ;




/**  
* Field numberOfBytes
* Total bytes collected by the sensor for the event. 

*/
protected Integer numberOfBytes ;




/**  
* Field packetCaptureData
* Text field to capture PCAP (packet capture) data (i.e. full packets in 

* volved in the SecurityEvent) 

*/
protected List<String> packetCaptureData ;




/**  
* Field dataFlowDirection
* This indicates the overall flow of data for the connection - inbound i 

* mplies that more data (bytes) was received by the destination than by  

* the source.  Enumeration values:  </br></br>inbound </br></br>outbound 

*   

*/
protected String dataFlowDirection ;




/**  
* Field securitySignature
*/
protected SecuritySignature securitySignature ;




/**  
* Field securityEventEndpoint
*/
protected SecurityEventEndpoint securityEventEndpoint ;


}