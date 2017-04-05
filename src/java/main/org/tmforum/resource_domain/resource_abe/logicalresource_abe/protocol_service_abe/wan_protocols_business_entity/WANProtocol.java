/**
* WAN Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E6030E00355-content.html">WAN Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.wan_protocols_business_entity ;

/**
* WAN Protocols operate at the lowest three levels of the OSI model (i.e 
* ., physical, data link, and network) and are used to define communicat 
* ions over different types of wide-area media.The SID model defines ATM 
* , FrameRelay, HDLC, ISDN, PPP, SLIP, SMDS, and X.25 as examples of sub 
* classes of this class. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class WANProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface1
*/
protected DeviceInterface deviceInterface1 ;


}