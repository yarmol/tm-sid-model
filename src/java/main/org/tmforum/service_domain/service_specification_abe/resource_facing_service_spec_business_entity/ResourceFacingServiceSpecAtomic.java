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
* This is an abstract base class for defining ResourceFacingServiceSpeci 
* fications that do not have any subordinate ResourceFacingServiceSpecif 
* ications. In other words, a ResourceFacingServiceSpecAtomic is a stand 
* -alone ResourceFacingServiceSpecification, and doesn't require any sup 
* porting ResourceFacingServiceSpecifications to define the shared chara 
* cteristics (i.e., attributes, relationships, and constraints) of any R 
* esourceFacingServices that it serves as a template for. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service Specification ABE::Resource Facing Service Spec ABE::ResourceFacingServiceSpec" href="_3E3F0EC000E93D9DADF100B9-content.html">SID Models::Service Domain::Service Specification ABE::Resource Facing Service Spec ABE::ResourceFacingServiceSpec</a> |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingServiceSpecAtomic extends ResourceFacingServiceSpec,ServiceSpecification,EntitySpecification,RootEntity {

}