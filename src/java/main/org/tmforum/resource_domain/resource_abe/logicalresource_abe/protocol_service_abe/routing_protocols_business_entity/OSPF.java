/**
* Routing Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C35F8008C-content.html">Routing Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.routing_protocols_business_entity ;

/**
* This is the base class for representing the OSPF protocol. This class  
* represents a convenient aggregation point for defining how the OSPF pr 
* otocol is managed, configured and used. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Routing Protocols ABE::LinkStateRoutingProtocol" href="_3E3F0EC000E93E5FFFA90388-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Routing Protocols ABE::LinkStateRoutingProtocol</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class OSPF extends LinkStateRoutingProtocol,Protocol,LogicalResource,Resource,Entity,RootEntity {

}