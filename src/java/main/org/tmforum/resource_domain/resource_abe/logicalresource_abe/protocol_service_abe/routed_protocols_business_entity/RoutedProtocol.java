/**
* Routed Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C36010130-content.html">Routed Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.routed_protocols_business_entity ;

/**
* This is an abstract base class for representing different types of rou 
* ted protocols that can be managed. Routed protocols are those protocol 
* s that can be routed by a router. Specifically, the router must be abl 
* e to interpret the logical internetwork as specified by that routed pr 
* otocol. This class represents a convenient aggregation point for defin 
* ing how routed protocols are managed and used.The SID model defines Ap 
* pleTalk, DecNET, IP, and IPX as examples of subclasses of this class. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class RoutedProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field deviceInterface5
*/
protected DeviceInterface deviceInterface5 ;




/**  
* Field logicalDevice6
*/
protected LogicalDevice logicalDevice6 ;


}