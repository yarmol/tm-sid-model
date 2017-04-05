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
* This is an abstract base class that defines an integrated set of Custo 
* merFacingServices that collectively meets the needs of a Service reque 
* sted by a Customer via a Product. For example, the Customer may have r 
* equested "GoldService", which is a ServicePackage that defines a set o 
* f ServiceBundles, each of which has its own QoS. Each individual Custo 
* merFacingService that is part of the ServicePackage can be derived fro 
* m a CustomerFacingServiceSpecification. In this case, a CustomerFacing 
* ServiceSpecComposite will aggregate all of the individual CustomerFaci 
* ngServiceSpecifications into a single named object.This object is a st 
* and-alone object. However, it consists of other CustomerFacingServiceS 
* pecComposite and/or CustomerFacingServiceSpecAtomic entities. That is  
* the primary difference between this entity and the CustomerFacingServi 
* ceSpecAtomic entity. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service Specification ABE::Customer Facing Service Spec ABE::CustomerFacingServiceSpec" href="_3E3F0EC000E93D9DADDE0194-content.html">SID Models::Service Domain::Service Specification ABE::Customer Facing Service Spec ABE::CustomerFacingServiceSpec</a> |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class CustomerFacingServiceSpecComposite extends CustomerFacingServiceSpec,ServiceSpecification,EntitySpecification,RootEntity {



/**  
* Field customerFacingServiceSpec
*/
protected List<CustomerFacingServiceSpec> customerFacingServiceSpec ;


}