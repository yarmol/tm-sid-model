/**
* Customer Facing Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E379A3E03AE-content.html">Customer Facing Service ABE</a> 
* The Customer Facing Service ABE defines the characteristics of a parti 
* cular CustomerFacingService that represents a realization of a Product 
*  within an organization's infrastructure. In contrast, the Resource Fa 
* cingS ervice ABE is an abstraction that defines the characteristics of 
*  a particular ResourceFacingService which support the network/infrastr 
* ucture facing part of CustomerFacingService. ResourceFacingServices ar 
* e "internal" Services that are required to support a CustomerFacingSer 
* vice.Entities in this ABE provide different views to examine, analyze, 
*  configure, monitor and repair CustomerFacingServices of all types. En 
* tities in this ABE are derived from Customer Service Specification ent 
* ities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_abe.customer_facing_service_business_entity ;

/**
* A CustomerFacingService defines the properties of a particular related 
*  CustomerFacingServiceSpec (i.e. know-how) that represents a realizati 
* on of a Product within an organization's infrastructure; This is in di 
* rect contrast to ResourceFacingServices, which support the network/inf 
* rastructure facing part of the service (i.e. the technical solution).  
* For example, a VPN is an example of a CustomerFacingService, while the 
*  sub-services that perform different types of routing between network  
* devices making up the VPN are examples of ResourceFacingServices. Cust 
* omerFacingServices are directly related to Products as well as to Reso 
* urceFacingServices. ResourceFacingServices are indirectly related to P 
* roducts through the relationship between Product and CustomerFacingSer 
* vices. This enforces the relationship to Products while keeping Servic 
* es that are not directly realized by Products (i.e., ResourceFacingSer 
* vices) separated from Products. 

Inheritance tree: |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class CustomerFacingService extends Service,Entity,RootEntity {



/**  
* Field cfsStatus
* This is an enumerated integer that defines the status of this particul 

* ar CustomerFacingService. Values include:</br></br> 0: Operational and 

*  billable</br> 1: Degraded but billable</br> 2: In Violation and billa 

* ble</br> 3: Operational but not billable</br> 4: In Test and not billa 

* ble</br> 5: Being Deployed and not billable</br> 6: Failed</br></br>Va 

* lue 0 means that this CustomerFacingService is acting per specificatio 

* n, and is fully billable.</br></br>Value 1 means that this CustomerFac 

* ingService is operational, but is currently in a degraded state. Howev 

* er, it has not violated any contractual specification and is fully bil 

* lable.</br></br>Value 2 means that this CustomerFacingService is opera 

* tional, but is currently in violation of its associated contractual sp 

* ecification(s). Whether it is billable or not is determined by its ass 

* ociated Policy for handling service violations.</br></br>Value 3 means 

*  that this CustomerFacingService is currently operational, but has not 

*  been enabled for this particular customer yet and is therefore not bi 

* llable for this customer.</br></br>Value 4 means that this CustomerFac 

* ingService is currently being tested, and is not yet ready to be enabl 

* ed for this particular customer. Consequently, it is therefore not bil 

* lable for this customer.</br></br>Value 5 means that this CustomerFaci 

* ngService is currently being deployed, and therefore has not been enab 

* led for this particular customer yet. Consequently, it is therefore no 

* t billable for this customer.</br></br>Value 6 means that this Custome 

* rFacingService has currently failed. The set of actions that should be 

*  taken, as well as whether this service can still be billed or not, ar 

* e determined by its associated Policy for handling service violations. 

* </br> 

*/
protected Integer cfsStatus ;




/**  
* Field resourceFacingService
*/
protected List<ResourceFacingService> resourceFacingService ;




/**  
* Field customerFacingServiceComposite
*/
protected CustomerFacingServiceComposite customerFacingServiceComposite ;




/**  
* Field customerFacingServiceRole
*/
protected List<CustomerFacingServiceRole> customerFacingServiceRole ;




/**  
* Field customerFacingServiceSpec
*/
protected CustomerFacingServiceSpec customerFacingServiceSpec ;




/**  
* Field product
*/
protected List<Product> product ;




/**  
* Field serviceCandidate
*/
protected List<ServiceCandidate> serviceCandidate ;




/**  
* Field ns
*/
protected List<NetworkService> ns ;


}