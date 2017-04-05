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
* A ServicePackage is derived from an associated ServicePackageSpec. The 
*  ServicePackageSpec defines the shared attributes,  relationships, and 
*  constraints for all ServicePackage instances that are derived from it 
* . This enables each individual ServicePackage to add its own applicati 
* on-specific changeable characteristics and behavior.Note that there is 
*  no specific aggregation used to relate a particular ServicePackage to 
*  the ServicePackageSpec that it is derived from. This is because the S 
* ervicePackageSpec and ServicePackage both inherit the SpecifiesService 
*  aggregation, and at this (the business level) view, there are no new  
* semantics that are required to represent this relationship.Finally, wh 
* ile the composite pattern could be applied to ServicePackage, there is 
*  no perceived need to do so. Multiple ServicePackages will simply be a 
* ggregated by a ProductBundle, and appear as separate ProductComponents 
* . 

Inheritance tree: |- 
 <a title="SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingServiceComposite" href="_3E3F0EC000E93E37BE68016C-content.html">SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingServiceComposite</a> |- 
 <a title="SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingService" href="_3E3F0EC000E93D5091A501D6-content.html">SID Models::Service Domain::Service ABE::Customer Facing Service ABE::CustomerFacingService</a> |- 
 SID Models::Service Domain::Service ABE::Service |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ServicePackage extends CustomerFacingServiceComposite,CustomerFacingService,Service,Entity,RootEntity {



/**  
* Field serviceBundle
*/
protected List<ServiceBundle> serviceBundle ;


}