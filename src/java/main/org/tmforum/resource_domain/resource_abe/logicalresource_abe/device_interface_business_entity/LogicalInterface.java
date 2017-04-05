/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is an abstract class that serves as the superclass for all virtua 
* l interfaces. LogicalInterfaces are also called virtual interfaces. Th 
* is is because a LogicalInterface has no hardware associated with it, a 
* nd it is not physically connected to a network. It serves as a conveni 
* ent aggregation point for running different relationships that affect  
* its subclasses, thereby avoiding having to instantiate multiple relati 
* onships that are essentially the same. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LogicalInterface extends DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field mediaInterface
*/
protected List<MediaInterface> mediaInterface ;


}