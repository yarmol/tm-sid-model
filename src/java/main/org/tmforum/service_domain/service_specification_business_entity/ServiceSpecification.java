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
* This is the base entity for defining the ServiceSpecification hierarch 
* y. All Services are characterized as either being related to Products  
* or Resources. This gives rise to the two subclasses of ServiceSpecific 
* ation: CustomerFacingServiceSpec and ResourceFacingServiceSpec. Howeve 
* r, each instance of a Service is made up of changeable as well as inva 
* riant attributes,  relationships and constraints. A ServiceSpecificati 
* on defines the shared characteristics of a Service. It can be conceptu 
* ally thought of as a template that different Service instances can be  
* instantiated from. Each of these Service instances will have the same  
* shared characteristics. However, the other characteristics of the inst 
* antiated Service will be specific to each instance.This class can be t 
* hought of as a template, which represents a generic specification for  
* implementing a particular type of Service. A ServiceSpecification may  
* consist of other ServiceSpecifications supplied together as a collecti 
* on.  Members of the collection may be offered individually or collecti 
* vely.  ServiceSpecifications may also exist within groupings, such as  
* within a Product.ServiceSpecification inherits from EntitySpecificatio 
* n, which inherits from RootEntity. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ServiceSpecification extends EntitySpecification,RootEntity {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field serviceSpecificationType
*/
protected List<ServiceSpecificationType> serviceSpecificationType ;




/**  
* Field serviceSpecificationRole
*/
protected List<ServiceSpecificationRole> serviceSpecificationRole ;




/**  
* Field serviceSpecVersion
*/
protected List<ServiceSpecVersion> serviceSpecVersion ;




/**  
* Field service
*/
protected List<Service> service ;




/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;




/**  
* Field serviceUsageSpec
*/
protected List<ServiceUsageSpec> serviceUsageSpec ;




/**  
* Field servicePerformanceSpec
*/
protected List<ServicePerformanceSpec> servicePerformanceSpec ;




/**  
* Field serviceSpecCharacteristic
*/
protected List<ServiceSpecCharacteristic> serviceSpecCharacteristic ;




/**  
* Field servicedefinition
*/
protected ServiceDefinition servicedefinition ;




/**  
* Field servicetemplate
*/
protected ServiceTemplate servicetemplate ;




/**  
* Field serviceCapacity
*/
protected List<ServiceCapacity> serviceCapacity ;




/**  
* Field serviceCapacityDemand
*/
protected List<ServiceCapacityDemand> serviceCapacityDemand ;




/**  
* Field serviceCandidate
*/
protected List<ServiceCandidate> serviceCandidate ;




/**  
* Field serviceConfigSpec
*/
protected List<ServiceConfigSpec> serviceConfigSpec ;




/**  
* Field serviceTestSpec
*/
protected List<ServiceTestSpec> serviceTestSpec ;




/**  
* Field serviceSpecRelationship
*/
protected List<ServiceSpecRelationship> serviceSpecRelationship ;




/**  
* Field serviceSpecRelationship2
*/
protected List<ServiceSpecRelationship> serviceSpecRelationship2 ;


}