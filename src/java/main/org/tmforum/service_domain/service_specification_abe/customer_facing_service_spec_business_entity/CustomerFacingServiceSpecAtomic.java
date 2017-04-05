/**
* Customer Facing Service Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E379A8B0070-content.html">Customer Facing Service Spec ABE</a> 
* The Customer Facing Service Spec ABE defines the common characteristic 
* s for a set of CustomerFacingServices. This scales by enabling multipl 
* e CustomerFacingServiceSpecs to be defined to model the common charact 
* eristics of different groups of CustomerFacingServices. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.customer_facing_service_spec_business_entity ;

/**
* This is an abstract base class for defining CustomerFacingServiceSpeci 
* fications that do not have any subordinate CustomerFacingServiceSpecif 
* ications. In other words, a CustomerFacingServiceSpecAtomic is a stand 
* -alone CustomerFacingServiceSpecification, and doesn't require any sup 
* porting CustomerFacingServiceSpecifications to define the shared chara 
* cteristics (i.e., attributes, relationships, and constraints) of any C 
* ustomerFacingServices that it serves as a template for. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service Specification ABE::Customer Facing Service Spec ABE::CustomerFacingServiceSpec" href="_3E3F0EC000E93D9DADDE0194-content.html">SID Models::Service Domain::Service Specification ABE::Customer Facing Service Spec ABE::CustomerFacingServiceSpec</a> |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class CustomerFacingServiceSpecAtomic extends CustomerFacingServiceSpec,ServiceSpecification,EntitySpecification,RootEntity {

}