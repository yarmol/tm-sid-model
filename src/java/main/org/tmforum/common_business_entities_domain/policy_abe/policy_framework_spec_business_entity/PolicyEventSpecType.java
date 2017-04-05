/**
* Policy Framework Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93ED934800073-content.html">Policy Framework Spec ABE</a> 
* The Policy Specification ABE contains entities that define the invaria 
* nt characteristics and behavior of policy entities. This enables multi 
* ple instances to be derived from a single specification entity. In thi 
* s derivation, each instance will use the invariant characteristics and 
*  behavior defined in its associated template.This domain includes spec 
* ifications for a PolicyRule, its components, and how multiple PolicyRu 
* les can be grouped together. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_spec_business_entity ;

/**
* The PolicyEventSpecType class defines a generic category of PolicyEven 
* tSpecs. Each PolicyEventSpecType serves to group a set of particular P 
* olicyEventSpecs that share the same behavior and other semantics. One  
* result of this is to be able to more efficiently define a set of relat 
* ed PolicyEventSpecs that can be grouped together to form a higher-leve 
* l, or composite, PolicyEventSpec. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyEventSpecType extends Entity {



/**  
* Field policyEventSpec
*/
protected List<PolicyEventSpec> policyEventSpec ;


}