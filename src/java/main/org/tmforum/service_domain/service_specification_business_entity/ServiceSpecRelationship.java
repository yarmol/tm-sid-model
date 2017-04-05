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
* A migration, substitution, dependency, or exclusivity relationship bet 
* ween/among ServiceSpecifications. 
 @since SID_R16.5
*/ 

public  class ServiceSpecRelationship  {



/**  
* Field type
* A categorization of the relationship, such as migration, substitution, 

*  dependency, exclusivity. 

*/
protected String type ;




/**  
* Field validFor
* The period for which the relationship is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field serviceSpecification2
*/
protected ServiceSpecification serviceSpecification2 ;


}