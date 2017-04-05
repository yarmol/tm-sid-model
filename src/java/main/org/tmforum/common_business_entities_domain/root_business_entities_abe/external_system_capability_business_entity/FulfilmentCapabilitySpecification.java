/**
* External System Capability ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DRUAAK05E.e.a.zDMG.f.zT.b.l9.g-content.html">External System Capability ABE</a> 
* A collection of entities that can be used to define external system ca 
* pabilities like fulfillment, charging, assurance, policy and billing. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.external_system_capability_business_entity ;

/**
* This class defines fulfillment capabilities provided by a system. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::External System Capability ABE::ExternalSystemCapability" href="_DRUAA605E.e.a.zDMG.f.zT.b.l9.g-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::External System Capability ABE::ExternalSystemCapability</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class FulfilmentCapabilitySpecification extends ExternalSystemCapability,EntitySpecification,RootEntity {



/**  
* Field fulfilmentType
* The type of a fulfilment capability offered by a fulfillment system. 

*/
protected String fulfilmentType ;




/**  
* Field fulfilmentID
* The unique identifier of a fulfilment capability offered by a fulfillm 

* ent system. 

*/
protected String fulfilmentID ;




/**  
* Field fulfilmentVersion
* The version of a fulfilment capability offered by a fulfillment system 

* .This may include subfileds like major and minor which are separated b 

* y a period delimiter. 

*/
protected String fulfilmentVersion ;




/**  
* Field entitySpecificationActionWorkflow
*/
protected List<EntitySpecificationActionWorkflow> entitySpecificationActionWorkflow ;


}