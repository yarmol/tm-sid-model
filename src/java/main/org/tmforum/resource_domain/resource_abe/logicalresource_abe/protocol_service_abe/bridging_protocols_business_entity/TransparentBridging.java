/**
* Bridging Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E60323C035F-content.html">Bridging Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.bridging_protocols_business_entity ;

/**
* Transparent bridges are used almost exclusively in Ethernet networks.  
* They are so named because their presence and operation are transparent 
*  to the network hosts. This type of bridge learns host locations by an 
* alyzing the source address of incoming frames from all attached networ 
* ks, and then uses this information to forward traffic. If a bridge rec 
* eives a frame to which no association is found, it floods all ports ex 
* cept the inbound port. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Bridging Protocols ABE::BridgingProtocol" href="_3E3F0EC000E93E6032A00182-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Bridging Protocols ABE::BridgingProtocol</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TransparentBridging extends BridgingProtocol,Protocol,LogicalResource,Resource,Entity,RootEntity {

}