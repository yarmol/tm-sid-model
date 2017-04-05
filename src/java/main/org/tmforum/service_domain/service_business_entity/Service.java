/**
* Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D5091860236-content.html">Service ABE</a> 
* The Service ABE contains entities that are used to represent both cust 
* omer-facing and resource-facing types of services. Entities in this AB 
* E provide different views to examine, analyze, configure, monitor and  
* repair Services of all types. Entities in this ABE are derived from Se 
* rvice Specification entities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_business_entity ;

import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionItem;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ServiceCapacity;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ServiceCapacityDemand;
import org.tmforum.common_business_entities_domain.location_business_entity.Place;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Entity;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.resource_domain.resource_abe.logicalresource_abe.Device;
import org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity.LogicalResourceRole;
import org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity.PhysicalResourceRole;
import org.tmforum.service_domain.service_configuration_business_entity.ServiceConfigSpec;
import org.tmforum.service_domain.service_configuration_business_entity.ServiceConfiguration;
import org.tmforum.service_domain.service_performance_business_entity.ServicePerformance;
import org.tmforum.service_domain.service_specification_business_entity.ServiceSpecification;
import org.tmforum.service_domain.service_test_business_entity.ServiceTest;
import org.tmforum.service_domain.service_usage_business_entity.ServiceUsage;
import org.tmforum.service_domain.tip_service_management_business_entity.CommonServiceInfo;
import org.tmforum.service_domain.tip_service_management_business_entity.ServiceAccessPoint;

import java.util.List;

/**
* This is the base entity for defining the Service hierarchy. All Servic 
* es are characterized as either being related to Products or Resources. 
*  This gives rise to the two subclasses of Service: CustomerFacingServi 
* ce (used to realie a Product) and ResourceFacingService (which support 
*  the network/infrastructure facing part of the service).Services are d 
* efined as being tightly bound to Products. A Product defines the conte 
* xt of the Service, Service and its related entities (e.g., ServiceSpec 
* ification, ServiceRole, and so forth) are related to entities in the R 
* esource, Product, and other domains through a set of relationships. A  
* Service represents the object that will be instantiated. Each Service  
* instance can be different; therefore, Service is limited to owning jus 
* t the attributes, relationships, and constraints that are specific to  
* an instance of a Service. The shared attributes, relationships, and co 
* nstraints that can be instantiated are defined by a ServiceSpecificati 
* on.The purpose of this entity is twofold. First, it is used to define  
* attributes, and relationships that are common to all Services. Second, 
*  it provides a convenient point to define how Services interact with o 
* ther parts business entities. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Service extends Entity {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field device
*/
protected Device device ;




/**  
* Field isServiceEnabled
* This is a Boolean attribute that, if TRUE, signifies that this Service 

*  has been enabled for use. If the value of this attribute is FALSE, th 

* en this means that this particular Service has NOT been enabled for us 

* e. 

*/
protected Boolean isServiceEnabled ;




/**  
* Field hasStarted
* This is a Boolean attribute that, if TRUE, signifies that this Service 

*  has already been started. If the value of this attribute is FALSE, th 

* en this signifies that this Service has NOT been Started. 

*/
protected Boolean hasStarted ;




/**  
* Field isMandatory
* This is a Boolean attribute that, if TRUE, signifies that this Service 

*  is mandatory (i.e., this Service must be running when the managed env 

* ironment is in a non-failed state). If the value of this attribute is  

* FALSE, then this means that this Service is not required to run. 

*/
protected Boolean isMandatory ;




/**  
* Field startMode
* This attribute is an enumerated integer that indicates how the Service 

*  is started. Values include:</br></br> 0: Unknown</br> 1: Automaticall 

* y by the managed environment</br> 2: Automatically by the owning devic 

* e</br> 3: Manually by the Provider of the Service</br> 4: Manually by  

* a Customer of the Provider</br> 5: Any of the above</br> 

*/
protected Integer startMode ;




/**  
* Field isStateful
* This is a Boolean attribute that, if TRUE, means that this Service can 

*  be changed without affecting any other services. 

*/
protected Boolean isStateful ;




/**  
* Field serviceRole
*/
protected List<ServiceRole> serviceRole ;




/**  
* Field logicalResourceRole
*/
protected List<LogicalResourceRole> logicalResourceRole ;




/**  
* Field physicalResourceRole
*/
protected List<PhysicalResourceRole> physicalResourceRole ;




/**  
* Field serviceCharacteristicValue
*/
protected List<ServiceCharacteristicValue> serviceCharacteristicValue ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field serviceUsage
*/
protected List<ServiceUsage> serviceUsage ;




/**  
* Field servicePerformance
*/
protected List<ServicePerformance> servicePerformance ;




/**  
* Field valueNetworkRole
*/
protected List<PartyRole> valueNetworkRole ;




/**  
* Field serviceAccessPoint
*/
protected List<ServiceAccessPoint> serviceAccessPoint ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field commonServiceInfo
*/
protected CommonServiceInfo commonServiceInfo ;




/**  
* Field serviceInvolvementRole
*/
protected List<ServiceInvolvementRole> serviceInvolvementRole ;




/**  
* Field serviceCapacity
*/
protected List<ServiceCapacity> serviceCapacity ;




/**  
* Field serviceCapacityDemand
*/
protected List<ServiceCapacityDemand> serviceCapacityDemand ;




/**  
* Field serviceConfiguration
*/
protected List<ServiceConfiguration> serviceConfiguration ;




/**  
* Field serviceConfigSpec
*/
protected List<ServiceConfigSpec> serviceConfigSpec ;




/**  
* Field serviceTest
*/
protected List<ServiceTest> serviceTest ;




/**  
* Field serviceRelationship
*/
protected List<ServiceRelationship> serviceRelationship ;




/**  
* Field serviceRelationship2
*/
protected List<ServiceRelationship> serviceRelationship2 ;


}