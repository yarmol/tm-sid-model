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
* This is an abstract base class for ResourceFacingServices. A ResourceF 
* acingService is an abstraction that defines the characteristics of a p 
* articular Service which support the network/infrastructure facing part 
*  of the service. ResourceFacingServices are “internal” Services (i.e.  
* technical solutions) that are required to support a CustomerFacingServ 
* ice. The Customer obtains CustomerFacingServices via Products, and is  
* not aware of the ResourceFacingServices which support the CustomerFaci 
* ngService(s) that is being obtained directly by the Customer via a Pro 
* duct. For example, a VPN is an example of a CustomerFacingService. Thi 
* s particular type of VPN may require BGP to support it. Customers don’ 
* t purchase BGP, and hopefully aren’t even aware that BGP is running. T 
* herefore, BGP is an example of a ResourceFacingService. CustomerFacing 
* Services are directly related to Products as well as to ResourceFacing 
* Services. ResourceFacingServices are indirectly related to Products th 
* rough the relationship between Product and Resource. This enforces the 
*  relationship to Products while keeping Services that are not directly 
*  obtainable via Products (i.e., ResourceFacingServices) separated from 
*  Products. 

Inheritance tree: |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceFacingService extends Service,Entity,RootEntity {



/**  
* Field customerFacingService
*/
protected List<CustomerFacingService> customerFacingService ;




/**  
* Field rfsStatus
* This is an enumerated integer that defines the status of this particul 

* ar ResourceFacingService. Values include:</br></br> 0: Operational and 

*  supporting CFS</br> 1: Degraded but supporting CFS</br> 2: In Violati 

* on and not supporting CFS</br> 3: Operational but not yet supporting a 

*  CFS</br> 4: Being Tested</br> 5: Being Deployed</br> 6: Failed</br></ 

* br>Value 0 means that this ResourceFacingService is acting per specifi 

* cation, and is also currently supporting one or more CustomerFacingSer 

* vices.</br></br>Value 1 means that this ResourceFacingService is opera 

* tional, but is currently in a degraded state. This degraded state indi 

* cates congestion or some other problem, but has not yet comprimised th 

* e operation of its associated CustomerFacingServices.</br></br>Value 2 

*  means that this ResourceFacingService is operational, but is currentl 

* y in violation of its associated specification(s). This in turn means  

* that its associated CustomerFacingServices are violating their contrac 

* tual specification(s) unless automatic fail-over has been enabled.</br 

* ></br>Value 3 means that this ResourceFacingService is acting per spec 

* ification, but is not yet currently supporting one or more CustomerFac 

* ingServices.</br></br>Value 4 means that this ResourceFacingService is 

*  currently being tested, and is not yet ready to support a CustomerFac 

* ingService.</br></br>Value 5 means that this ResourceFacingService is  

* currently being deployed, and is not yet ready to support a CustomerFa 

* cingService.</br></br>Value 6 means that this ResourceFacingService ha 

* s currently failed. The set of actions that should be taken, as well a 

* s whether this service can still be billed or not, are determined by i 

* ts associated Policy for handling service violations.</br> 

*/
protected Integer rfsStatus ;




/**  
* Field resourceFacingServiceComposite
*/
protected ResourceFacingServiceComposite resourceFacingServiceComposite ;




/**  
* Field resourceFacingServiceRole
*/
protected List<ResourceFacingServiceRole> resourceFacingServiceRole ;




/**  
* Field protocol
*/
protected List<Protocol> protocol ;




/**  
* Field logicalResource
*/
protected List<LogicalResource> logicalResource ;




/**  
* Field physicalResource
*/
protected List<PhysicalResource> physicalResource ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field resourceFacingServiceSpec
*/
protected ResourceFacingServiceSpec resourceFacingServiceSpec ;




/**  
* Field deviceInterface
*/
protected DeviceInterface deviceInterface ;




/**  
* Field serviceCandidate
*/
protected List<ServiceCandidate> serviceCandidate ;




/**  
* Field networkService
*/
protected List<NetworkService> networkService ;


}