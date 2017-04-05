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
* Conceptually, a ServiceBundle is thought of as a collection of Resourc 
* eFacingServiceSpecifications. This enables the needs of different sets 
*  of ResourceFacingServiceSpecifications to be grouped together, hence, 
*  the name "bundle". Since these are ResoureFacingSpecifications, they  
* define reusable templates for implementing the ResourceFacingServices  
* that are required by a particular CustomerFacingService (as represente 
* d by a ServicePackage).ServiceBundles were designed to define a set of 
*  Class of Service specifications that were required by a CustomerFacin 
* gService to work together. A ServicePackage is the entity that models  
* the requirements of the CustomerFacingService. Thus, ServicePackages c 
* an specify different packaging of CustomerFacingServices that are obta 
* ined by a Customer via a Product, and ServiceBundles specify the set o 
* f ResourceFacingServices that each CustomerFacingService requires.Serv 
* iceBundles are a natural way to implement the requirements of a Servic 
* ePackage, and are related to a ServicePackage through the ServicePacka 
* geUsesServiceBundles aggregation. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingServiceComposite" href="_3E3F0EC000E93E37C3B90187-content.html">SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingServiceComposite</a> |- 
 <a title="SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingService" href="_3E3F0EC000E93D5091AC0353-content.html">SID Models::Service Domain::Service ABE::Resource Facing Service ABE::ResourceFacingService</a> |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ServiceBundle extends ResourceFacingServiceComposite,ResourceFacingService,Service,Entity,RootEntity {



/**  
* Field hasMultipleQoSTypes
* This is a Boolean attribute that, if TRUE, defines this ServiceBundle  

* as containing more than a single type of QoSService (e.g., DiffServ an 

* d 802.1P as an example). 

*/
protected Boolean hasMultipleQoSTypes ;




/**  
* Field servicePackage
*/
protected List<ServicePackage> servicePackage ;


}