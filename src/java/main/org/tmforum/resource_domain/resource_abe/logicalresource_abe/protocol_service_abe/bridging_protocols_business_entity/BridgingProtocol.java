/**
* Bridging Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E60323C035F-content.html">Bridging Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.bridging_protocols_business_entity ;

/**
* Bridging Protocols operate at the data link layer of the OSI model, an 
* d are used to define communications over different types of homogeneou 
* s and heterogeneous local area networks. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class BridgingProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface7
*/
protected DeviceInterface deviceInterface7 ;




/**  
* Field logicalDevice8
*/
protected LogicalDevice logicalDevice8 ;


}