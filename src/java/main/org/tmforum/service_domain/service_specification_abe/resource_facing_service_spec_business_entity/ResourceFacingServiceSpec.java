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
* The ResourceFacingServiceSpec represents the technical solutions that  
* the Service Provider can implement for CustomerFacingServiceSpec.Each  
* technical solution (ResourceFacingServiceSpec) requires ResourceSpecif 
* ications to be realized and might require buying part of the solution  
* to a supplier (for example the Service Provider might have to buy the  
* Local Loop to provide a broadband access).This is the base entity for  
* defining different types of ResourceFacingServiceSpecs. A ResourceFaci 
* ngServiceSpec is an abstraction that defines the shared characteristic 
* s of a particular ResourceFacingService. The shared portion serves as  
* a single common basis to build a set of variable ResourceFacingService 
* s that all use this common ResourceFacingServiceSpec.This class can be 
*  thought of as a template, which represents a generic specification fo 
* r implementing a particular type of Service. A ServiceSpecification ma 
* y consist of other ServiceSpecifications supplied together as a collec 
* tion.  Members of the collection may be offered individually or collec 
* tively.  ServiceSpecifications may also exist within groupings, such a 
* s within a Product. ServiceSpecification inherits from EntitySpecifica 
* tion, which inherits from RootEntity. 

Inheritance tree: |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingServiceSpec extends ServiceSpecification,EntitySpecification,RootEntity {



/**  
* Field customerFacingServiceSpec
*/
protected List<CustomerFacingServiceSpec> customerFacingServiceSpec ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field resourceFacingService
*/
protected List<ResourceFacingService> resourceFacingService ;




/**  
* Field resourceFacingServiceSpecComposite
*/
protected ResourceFacingServiceSpecComposite resourceFacingServiceSpecComposite ;




/**  
* Field resourceFacingServiceSpecVersion
*/
protected List<ResourceFacingServiceSpecVersion> resourceFacingServiceSpecVersion ;




/**  
* Field resourceFacingServiceSpecRole
*/
protected List<ResourceFacingServiceSpecRole> resourceFacingServiceSpecRole ;




/**  
* Field purchaseProductSpecification
*/
protected List<PurchaseProductSpecification> purchaseProductSpecification ;


}