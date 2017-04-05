/**
* Physical Role Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E5FF6660315-content.html">Physical Role Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.physicalresource_specification_abe.physical_role_specification_business_entity ;

/**
* This is a concrete base class for all PhysicalDeviceRoleSpecification  
* subclasses. It exists to enable relationships to be defined between it 
*  and other classes in the model. This helps prevent relationship explo 
* sion. It is used to define the invariant attributes, methods, relation 
* ships, and constraints of various types of roles associated with Physi 
* calDevices. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource Specification ABE::PhysicalResource Specification ABE::Physical Role Specification ABE::PhysicalResourceRoleSpec" href="_3E3F0EC000E93E5FF62401CE-content.html">SID Models::Resource Domain::Resource Specification ABE::PhysicalResource Specification ABE::Physical Role Specification ABE::PhysicalResourceRoleSpec</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalDeviceRoleSpec extends PhysicalResourceRoleSpec,RoleSpecification,RootEntity {

}