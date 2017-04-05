/**
* Logical Role Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E63D2430155-content.html">Logical Role Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_abe.logical_role_specification_business_entity ;

/**
* This is a concrete base class for all LogicalResourceRoleSpecification 
*  subclasses. It exists to enable relationships to be defined between i 
* t and other classes in the model. This helps prevent relationship expl 
* osion. It is used to define the invariant attributes, methods, relatio 
* nships, and constraints of various types of roles associated with Logi 
* calResources. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LogicalResourceRoleSpec extends RoleSpecification,RootEntity {



/**  
* Field logicalResourceRole
*/
protected List<LogicalResourceRole> logicalResourceRole ;




/**  
* Field resourceFacingServiceSpecRole
*/
protected ResourceFacingServiceSpecRole resourceFacingServiceSpecRole ;


}