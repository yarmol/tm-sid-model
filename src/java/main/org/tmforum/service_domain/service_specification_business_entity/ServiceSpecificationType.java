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
* The ServiceSpecificationType class defines a generic category of Servi 
* ceSpecifications. Each ServiceSpecificationType serves to group a set  
* of particular ServiceSpecifications that share some of the same behavi 
* or and other semantics. One result of this is to be able to more effic 
* iently define a set of related Services that can be grouped together t 
* o form a higher-level Service. For example, a given higher-level Servi 
* ce might include VPN and QoS Services. If these Services are always us 
* ed together, then they can be categorized using a common type. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecificationType @since SID_R16.5
*/ 

public  class ServiceSpecificationType extends EntitySpecificationType {



/**  
* Field serviceSpecification
*/
protected List<ServiceSpecification> serviceSpecification ;




/**  
* Field serviceSpecificationType
*/
protected List<ServiceSpecificationType> serviceSpecificationType ;




/**  
* Field serviceSpecificationType1
*/
protected List<ServiceSpecificationType> serviceSpecificationType1 ;




/**  
* Field sapSpecification
*/
protected SapSpecification sapSpecification ;


}