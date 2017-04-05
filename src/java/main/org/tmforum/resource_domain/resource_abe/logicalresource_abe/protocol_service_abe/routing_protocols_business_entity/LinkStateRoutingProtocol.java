/**
* Routing Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C35F8008C-content.html">Routing Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.routing_protocols_business_entity ;

/**
* This is the base class for defining protocols that use a link state ro 
* uting algorithm. In this algorithm, each router broadcasts or multicas 
* ts information regarding the cost of reaching each of its neighbors to 
*  all nodes in the internetwork. In other words, each router sends only 
*  the portion of its routing table that describes the state of its own  
* link. Link state algorithms enable each router to build a picture of t 
* he entire network in its routing table. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LinkStateRoutingProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface3
*/
protected DeviceInterface deviceInterface3 ;




/**  
* Field logicalDevice3
*/
protected LogicalDevice logicalDevice3 ;


}