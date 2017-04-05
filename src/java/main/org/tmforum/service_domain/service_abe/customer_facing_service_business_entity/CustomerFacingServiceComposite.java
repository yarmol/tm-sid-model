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
* This is an abstract base class that defines an integrated set of Custo 
* merFacingServices that collectively meets the needs of a Product. For  
* example, the Customer may have requested "GoldService", which is a Ser 
* vicePackage that defines a set of ServiceBundles, each of which has it 
* s own QoS. This enables "GoldService" to be abstracted and treated as  
* a managed object that provides a CustomerFacingService. 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingService" href="_3E3F0EC000E93D5091A501D6-content.html">SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingService</a> |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class CustomerFacingServiceComposite extends CustomerFacingService,Service,Entity,RootEntity {



/**  
* Field customerFacingService
*/
protected List<CustomerFacingService> customerFacingService ;


}