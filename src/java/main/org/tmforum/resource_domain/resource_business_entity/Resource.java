/**
* Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9430ADC580046-content.html">Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_business_entity ;

import org.tmforum.common_business_entities_domain.business_interaction_business_entity.BusinessInteractionItem;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ResourceCapacity;
import org.tmforum.common_business_entities_domain.capacity_business_entity.ResourceCapacityDemand;
import org.tmforum.common_business_entities_domain.location_business_entity.Place;
import org.tmforum.common_business_entities_domain.performance_business_entity.Performance;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Entity;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.ManagementDomain;
import org.tmforum.common_business_entities_domain.users_and_roles_business_entity.ResourceUser;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_entity_business_entity.ResourceSecurityEntity;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_event_business_entity.SecurityEventCollectionMethod;
import org.tmforum.enterprise_domain.enterprise_risk_abe.enterprise_security_abe.security_threat_abe.security_threat_tool_business_entity.SecurityThreatTool;
import org.tmforum.product_domain.product_business_entity.Product;
import org.tmforum.resource_domain.resource_abe.compoundresource_business_entity.CompoundResource;
import org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity.RunningSoftwareStatistic;
import org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity.Software;
import org.tmforum.resource_domain.resource_abe.tip_resource_abe.network_resource_basic_business_entity.CommonResourceInfo;
import org.tmforum.resource_domain.resource_configuration_business_entity.ResourceConfigSpec;
import org.tmforum.resource_domain.resource_configuration_business_entity.ResourceConfiguration;
import org.tmforum.resource_domain.resource_specification_business_entity.ResourceSpecification;
import org.tmforum.resource_domain.resource_test_business_entity.ResourceTest;
import org.tmforum.resource_domain.resource_usage_business_entity.ResourceUsage;
import org.tmforum.service_domain.service_abe.resource_facing_service_business_entity.ResourceFacingService;
import org.tmforum.service_domain.tip_service_management_business_entity.ServiceAccessPoint;

import java.util.List;

/**
* This object class defines the attributes that are common to all resour 
* ce objects.See R_TMF518_NRB_I_0001. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Resource extends Entity {



/**  
* Field managementDomain
*/
protected ManagementDomain managementDomain ;




/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field resourceRole
*/
protected List<ResourceRole> resourceRole ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field resourceUsage
*/
protected List<ResourceUsage> resourceUsage ;




/**  
* Field usageState
* This is an enumerated integer that defines the current usage of the ob 

* ject. It includes the following values:</br></br> 0: Unknown</br> 1: N 

* ot Installed</br> 2: Installed</br> 3: Inactive</br> 4: Idle</br> 5: A 

* ctive, but able to communicate</br> 6: Busy (Active and unable to comm 

* unicate)</br></br>Value 2 means that the object is installed (or other 

* wise activated) but no other information about its state is available. 

*  Values 3-6 imply that the object is Installed, and provide further in 

* formation as to its state.</br></br>This is an optional attribute.</br 

* > 

*/
protected Integer usageState ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field performance
*/
protected List<Performance> performance ;




/**  
* Field resourceFacingService
*/
protected ResourceFacingService resourceFacingService ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field resourceCharacteristicValue
*/
protected List<ResourceCharacteristicValue> resourceCharacteristicValue ;




/**  
* Field resourceSecurityEntity
*/
protected ResourceSecurityEntity resourceSecurityEntity ;




/**  
* Field securityEventCollectionMethod
*/
protected List<SecurityEventCollectionMethod> securityEventCollectionMethod ;




/**  
* Field serviceAccessPoint
*/
protected List<ServiceAccessPoint> serviceAccessPoint ;




/**  
* Field securityThreatTool
*/
protected SecurityThreatTool securityThreatTool ;




/**  
* Field commonResourceInfo
*/
protected CommonResourceInfo commonResourceInfo ;




/**  
* Field valueNetworkRole
*/
protected List<PartyRole> valueNetworkRole ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field resourceCapacity
*/
protected List<ResourceCapacity> resourceCapacity ;




/**  
* Field resourceCapacityDemand
*/
protected List<ResourceCapacityDemand> resourceCapacityDemand ;




/**  
* Field resourceInvolvementRole
*/
protected List<ResourceInvolvementRole> resourceInvolvementRole ;




/**  
* Field resourceUser
*/
protected List<ResourceUser> resourceUser ;




/**  
* Field runningSoftwareStatistics
*/
protected List<RunningSoftwareStatistic> runningSoftwareStatistics ;




/**  
* Field software
*/
protected List<Software> software ;




/**  
* Field compoundResource
*/
protected List<CompoundResource> compoundResource ;




/**  
* Field resourceConfiguration
*/
protected List<ResourceConfiguration> resourceConfiguration ;




/**  
* Field resourceConfigSpec
*/
protected List<ResourceConfigSpec> resourceConfigSpec ;




/**  
* Field resourceTest
*/
protected List<ResourceTest> resourceTest ;




/**  
* Field resourceRelationship
*/
protected List<ResourceRelationship> resourceRelationship ;




/**  
* Field resourceRelationship2
*/
protected List<ResourceRelationship> resourceRelationship2 ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field resource2
*/
protected List<Resource> resource2 ;


}