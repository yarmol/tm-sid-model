/**
* Physical Role Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E5FF6660315-content.html">Physical Role Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.physicalresource_specification_abe.physical_role_specification_business_entity ;

/**
* This is a concrete base class for all PhysicalResourceRoleSpecificatio 
* n subclasses. It exists to enable relationships to be defined between  
* it and other classes. This helps prevent relationship explosion. It is 
*  used to define the invariant attributes, methods, relationships, and  
* constraints of various types of roles associated with PhysicalResource 
* s (whether they are subclasses of PhysicalDevice or Hardware). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalResourceRoleSpec extends RoleSpecification,RootEntity {



/**  
* Field resourceFacingServiceSpecRole
*/
protected ResourceFacingServiceSpecRole resourceFacingServiceSpecRole ;


}