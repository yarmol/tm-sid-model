/**
* Routing Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C35F8008C-content.html">Routing Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.routing_protocols_business_entity ;

/**
* This is the base class for defining protocols that use a distance vect 
* or routing algorithm. In this algorithm, each router sends its entire  
* routing table in each update, but only to its neighbors. By iterating  
* through each hop, the shortest-path spanning tree is found. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class DistanceVectorRoutingProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field logicalDevice5
*/
protected LogicalDevice logicalDevice5 ;


}