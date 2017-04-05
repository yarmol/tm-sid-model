/**
* Management Protocols ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C7C7E013B-content.html">Management Protocols ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.protocol_service_abe.management_protocols_business_entity ;

/**
* A ManagementProtocol is an abstract superclass for protocols that are  
* dedicated to exchanging management information between network devices 
* . This type of protocol is an application layer protocol, and is used  
* for configuring, monitoring, and gathering information about devices. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Protocol Service ABE::Protocol |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ManagementProtocol extends Protocol,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field logicalDevice7
*/
protected LogicalDevice logicalDevice7 ;


}