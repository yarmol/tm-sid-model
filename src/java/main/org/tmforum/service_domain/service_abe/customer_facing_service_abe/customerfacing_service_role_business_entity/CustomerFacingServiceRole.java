/**
* CustomerFacing Service Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E37AE3F01EF-content.html">CustomerFacing Service Role ABE</a> 
* The Customer Facing Service Role ABE defines CustomerServiceRoles that 
*  are used to represent the variable characteristics of a CustomerFacin 
* gService in terms of roles that this type of Service plays. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.customer_facing_service_abe.customerfacing_service_role_business_entity ;

/**
* This class defines a Service in terms of a set of ServiceRoles for a C 
* ustomerFacingService.This is the base class for defining ServiceRoles  
* that are used to represent the variable characteristics of a CustomerF 
* acingService in terms of roles that this Service plays. This enables t 
* he CustomerFacingService to be managed abstractly using ServiceRoles.  
* It also helps define the Service in terms of the functions that it has 
*  or provides. 

Inheritance tree: |- 
 SID Models::Service Domain::Service ABE::ServiceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class CustomerFacingServiceRole extends ServiceRole,Role,RootEntity {



/**  
* Field customerFacingService
*/
protected List<CustomerFacingService> customerFacingService ;




/**  
* Field resourceFacingServiceRole
*/
protected ResourceFacingServiceRole resourceFacingServiceRole ;


}