/**
* Resource Facing Service Spec Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E37B1A3005D-content.html">Resource Facing Service Spec Role ABE</a> 
* The Resource Facing Service Spec Role ABE defines a ServiceSpecificati 
* on, in terms of a set of ServiceSpecificationRoles, for a ResourceFaci 
* ngService. It is used to represent the shared characteristics of a Res 
* ourceFacingService. This enables the ResourceFacingService to be manag 
* ed abstractly using ServiceSpecificationRoles. It also helps define a  
* ResourceFacingServiceSpecification in terms of the functions that it h 
* as or provides. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.resource_facing_service_spec_abe.resource_facing_service_spec_role_business_entity ;

/**
* This class defines a ServiceSpecification, in terms of a set of Servic 
* eSpecificationRoles, for a ResourceFacingService.This is the base clas 
* s for defining ServiceSpecificationRoles that are used to represent th 
* e shared characteristics of a ResourceFacingService. This enables the  
* ResourceFacingService to be managed abstractly using ServiceSpecificat 
* ionRoles. It also helps define the ServiceSpecification in terms of th 
* e functions that it has or provides. 

Inheritance tree: |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecificationRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingServiceSpecRole extends ServiceSpecificationRole,RoleSpecification,RootEntity {



/**  
* Field resourceFacingServiceSpec
*/
protected List<ResourceFacingServiceSpec> resourceFacingServiceSpec ;




/**  
* Field customerFacingServiceSpecRole
*/
protected List<CustomerFacingServiceSpecRole> customerFacingServiceSpecRole ;




/**  
* Field logicalResourceRoleSpec
*/
protected List<LogicalResourceRoleSpec> logicalResourceRoleSpec ;




/**  
* Field physicalResourceRoleSpec
*/
protected List<PhysicalResourceRoleSpec> physicalResourceRoleSpec ;


}