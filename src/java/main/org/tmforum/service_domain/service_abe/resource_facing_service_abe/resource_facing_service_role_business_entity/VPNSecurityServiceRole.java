/**
* Resource Facing Service Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E37AE4B0124-content.html">Resource Facing Service Role ABE</a> 
* The Resource Facing Service Role ABE defines ResourceServiceRoles that 
*  are used to represent the variable characteristics of a ResourceFacin 
* gService in terms of roles that this type of Service plays. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.resource_facing_service_abe.resource_facing_service_role_business_entity ;

/**
* This class defines the specific type of security that is required to i 
* mplement a particular CustomerFacingVPNService in terms of ResourceFac 
* ingServiceRoles. Thus, it represents all of the variable characteristi 
* cs necessary to build a VPNSecurityService, abstracted in terms of Ser 
* viceRoles. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Resource Facing Service ABE::Resource Facing Service Role ABE::ResourceFacingServiceRole" href="_3E3F0EC000E93D8CB0D202AB-content.html">SID Models::Service Domain::Service ABE::Resource Facing Service ABE::Resource Facing Service Role ABE::ResourceFacingServiceRole</a> |- 
 SID Models::Service Domain::Service ABE::ServiceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class VPNSecurityServiceRole extends ResourceFacingServiceRole,ServiceRole,Role,RootEntity {

}