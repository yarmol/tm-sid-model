/**
* Resource Facing Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E379A590226-content.html">Resource Facing Service ABE</a> 
* The Service ABE contains entities that are used to represent two funda 
* mentally different types of Services, called CustomerFacingServices an 
* d ResourceFacingServices.A CustomerFacingService defines the character 
* istics of a particular Service that represents a realization of a Prod 
* uct within an organization's infrastructure. In contrast, a ResourceFa 
* cingService is an abstraction that defines the characteristics of a pa 
* rticular Service which support the network/infrastructure facing part  
* of the service. For example, a VPN is an example of a CustomerFacingSe 
* rvice, while the sub-services that perform different types of routing  
* between network devices making up the VPN are examples of ResourceFaci 
* ngServices.  ResourceFacingServices are "internal" Services that are r 
* equired to support a CustomerFacingService.Entities in this ABE provid 
* e different views to examine, analyze, configure, monitor and repair S 
* ervices of all types. Entities in this ABE are derived from Service Sp 
* ecification entities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.resource_facing_service_business_entity ;

/**
* This is an abstract base class that defines an integrated set of Resou 
* rceFacingServices that collectively meets the needs of a CustomerFacin 
* gService. For example, the Customer may have requested "GoldService",  
* which is a ServicePackage that defines a set of ServiceBundles, each o 
* f which has its own QoS. A set of ResourceFacingServices can then be d 
* efined, one for each different ServiceBundle instance, that provides t 
* he required QoS for each ServiceBundle instance. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingService" href="_3E3F0EC000E93D5091AC0353-content.html">SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingService</a> |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingServiceComposite extends ResourceFacingService,Service,Entity,RootEntity {



/**  
* Field resourceFacingService
*/
protected List<ResourceFacingService> resourceFacingService ;


}