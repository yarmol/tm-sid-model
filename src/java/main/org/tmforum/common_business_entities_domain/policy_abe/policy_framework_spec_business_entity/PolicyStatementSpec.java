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
* This is a concrete base class that is used to define the invariant cha 
* racteristics (attributes, methods, constraints and relationships) of a 
*  PolicyStatement entity. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyStatementSpec extends EntitySpecification,RootEntity {



/**  
* Field policyStatement
*/
protected List<PolicyStatement> policyStatement ;


}