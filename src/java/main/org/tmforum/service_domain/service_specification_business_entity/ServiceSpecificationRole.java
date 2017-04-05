/**
* Service Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D50919203C4-content.html">Service Specification ABE</a> 
* The Service Specification ABE contains entities that define the shared 
*  characteristics of both types of Service entities. This enables multi 
* ple instances to be derived from a single specification entity. In thi 
* s derivation, each instance will use the characteristics  defined in i 
* ts associated specification.Entities in this ABE focus on adherence to 
*  standards, distinguishing features of a Service, dependencies (both p 
* hysical and logical, as well as on other services), quality, and cost. 
*  In general, entities in this ABE enable Services to be bound to Produ 
* cts and run using Resources.Network services are one example of Servic 
* es that can be built. Additional examples include installation, mainte 
* nance, monitoring, and content authentication, authorization, accounti 
* ng, and auditing functions. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_business_entity ;

/**
* This is an abstract base class that defines a ServiceSpecification in  
* terms of a set of roles. The roles are then used to characterize the s 
* hared functionality of the Service, regardless of whether it is a reso 
* urce- or a customer-facing service.ServiceSpecificationRoles represent 
*  the shared functionality of a Service. Representing a Service in term 
* s of ServiceSpecificationRoles enables the functionality of the Servic 
* e to be defined independently of BusinessActor, PhysicalResource, Logi 
* calResource, or other Services. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ServiceSpecificationRole extends RoleSpecification,RootEntity {



/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field serviceRole
*/
protected List<ServiceRole> serviceRole ;




/**  
* Field serviceSpecificationRole
*/
protected List<ServiceSpecificationRole> serviceSpecificationRole ;




/**  
* Field serviceSpecificationRole1
*/
protected List<ServiceSpecificationRole> serviceSpecificationRole1 ;


}