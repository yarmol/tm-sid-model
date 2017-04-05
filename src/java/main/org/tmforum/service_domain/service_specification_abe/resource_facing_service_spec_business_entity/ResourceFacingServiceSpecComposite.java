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
* This is an abstract base class that defines an integrated set of Resou 
* rceFacingServices that collectively meets the needs of a CustomerFacin 
* gService. For example, the Customer may have requested "GoldService",  
* which is a ServicePackage that defines a set of ServiceBundles, each o 
* f which has its own QoS. Each individual ResourceFacingService that is 
*  part of the ServicePackage can be derived from a ResourceFacingServic 
* eSpecification. In this case, a ResourceFacingServiceSpecComposite wil 
* l aggregate all of the individual ResourceFacingServiceSpecifications  
* into a single named object.This object is a stand-alone object. Howeve 
* r, it consists of other ResourceFacingServiceSpecComposite and/or Reso 
* urceFacingServiceSpecAtomic entities. That is the primary difference b 
* etween this entity and the ResourceFacingServiceSpecAtomic entity. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service Specification ABE::Resource Facing Service Spec ABE::ResourceFacingServiceSpec" href="_3E3F0EC000E93D9DADF100B9-content.html">SID Models::Service Domain::Service Specification ABE::Resource Facing Service Spec ABE::ResourceFacingServiceSpec</a> |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingServiceSpecComposite extends ResourceFacingServiceSpec,ServiceSpecification,EntitySpecification,RootEntity {



/**  
* Field resourceFacingServiceSpec
*/
protected List<ResourceFacingServiceSpec> resourceFacingServiceSpec ;


}