/**
* Routing Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C35F8008C-content.html">Routing Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.routing_protocols_business_entity ;

/**
* This is an abstract base class for representing different types of rou 
* ting protocols that can be managed. Routing protocols are used to dete 
* rmine how information is routed (e.g., how it traverses an intermediat 
* e system). This class represents a convenient aggregation point for de 
* fining how routing protocols are managed and used.The SID model define 
* s LinkStateRoutingProtocols (e.g., OSPF and IS-IS), DistanceVectorRout 
* ingProtocols (e.g., RIP and IGRP), PathVectorRoutingProtocols (e.g., B 
* GP) and HybridRoutingProtocols (e.g., EIGRP) as examples of subclasses 
*  of this class. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class RoutingProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {

}