/**
* Resource Facing Service Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E379AA102AC-content.html">Resource Facing Service Spec ABE</a> 
* The Resource Facing Service Spec ABE defines the common characteristic 
* s for a set of ResourceFacingServices. This scales by enabling multipl 
* e ResourceFacingServiceSpecs to be defined to model the common charact 
* eristics of different groups of ResourceFacingServices. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.resource_facing_service_spec_business_entity ;

/**
* Ability of an application to track different versions of ResourceFacin 
* gServiceSpecs independently. 

Inheritance tree: |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecVersion |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ResourceFacingServiceSpecVersion extends ServiceSpecVersion,Entity,RootEntity {



/**  
* Field resourceFacingServiceSpec
*/
protected ResourceFacingServiceSpec resourceFacingServiceSpec ;


}