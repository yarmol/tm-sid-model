/**
* Security Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.x.pHZIG.p.xE.d-YI.u.d.m.h.f.tT.l.g-content.html">Security Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity ;

/**
* Represents an IP address and a port in a connection during a security  
* event 
 @since SID_R16.5
*/ 

public  class SecurityEventEndpoint  {



/**  
* Field NATSecurityEvent
*/
protected NATSecurityEvent NATSecurityEvent ;




/**  
* Field endpointRole
*/
protected String endpointRole ;




/**  
* Field ipAddress
*/
protected IPAddress ipAddress ;




/**  
* Field netFlowSecurityEvent
*/
protected List<NetFlowSecurityEvent> netFlowSecurityEvent ;




/**  
* Field signatureSecurityEvent
*/
protected List<SignatureSecurityEvent> signatureSecurityEvent ;




/**  
* Field port
* The IP port associated with the IP address in the translation 

*/
protected Integer port ;


}