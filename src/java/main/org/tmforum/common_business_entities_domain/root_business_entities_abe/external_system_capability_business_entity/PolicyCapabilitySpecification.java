/**
* External System Capability ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_DRUAAK05E.e.a.zDMG.f.zT.b.l9.g-content.html">External System Capability ABE</a> 
* A collection of entities that can be used to define external system ca 
* pabilities like fulfillment, charging, assurance, policy and billing. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.external_system_capability_business_entity ;

/**
* This class defines policy capabilities provided by a system. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::External System Capability ABE::ExternalSystemCapability" href="_DRUAA605E.e.a.zDMG.f.zT.b.l9.g-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::External System Capability ABE::ExternalSystemCapability</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyCapabilitySpecification extends ExternalSystemCapability,EntitySpecification,RootEntity {



/**  
* Field policyName
* The given name to the policy instance offered by this capabilty. 

*/
protected String policyName ;




/**  
* Field policyGroupID
* The policy group identifier for this capability. 

*/
protected String policyGroupID ;




/**  
* Field policyDomainID
* The Policy Domain identifier for this capability. 

*/
protected String policyDomainID ;




/**  
* Field policySetID
* This is the identifier of associated polictSet for this capability. 

*/
protected String policySetID ;


}