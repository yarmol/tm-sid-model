/**
* LAN Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA88AEF0180-content.html">LAN Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.lan_protocols_business_entity ;

/**
* LAN Protocols operate at the lowest two levels of the OSI model (i.e., 
*  physical and data link) and are used to define communications over di 
* fferent types of local area media. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LANProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface6
*/
protected DeviceInterface deviceInterface6 ;


}