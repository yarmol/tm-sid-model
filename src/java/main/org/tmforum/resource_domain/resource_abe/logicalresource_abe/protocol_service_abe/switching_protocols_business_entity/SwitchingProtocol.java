/**
* Switching Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EAB28FB0327-content.html">Switching Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.switching_protocols_business_entity ;

/**
* This is an abstract base class for representing different types of swi 
* tching protocols that can be managed. Switching protocols are those pr 
* otocols that enable routing to take into account layer 2 information,  
* such as bandwidth and QoS. (Remember that traditional routing protocol 
* s are designed to evaluate each frame's layer 3 header only). Several  
* methods are available for accomplishing the task of looking at layer 2 
*  information and defining a next hop. Most now use the concept of a la 
* bel, which is a means to define the next hop without evaluating all of 
*  the information of a traditional header.The SID model currently conce 
* ntrates on defining MPLS as an example of a SwitchingProtocol. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SwitchingProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface2
*/
protected DeviceInterface deviceInterface2 ;




/**  
* Field logicalDevice1
*/
protected LogicalDevice logicalDevice1 ;


}