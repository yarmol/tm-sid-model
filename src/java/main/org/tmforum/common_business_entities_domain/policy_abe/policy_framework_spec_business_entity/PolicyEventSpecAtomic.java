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
* racteristics and behavior (attributes, methods, constraints, and relat 
* ionships) of a PolicyEventAtomic entity.PolicyEventSpecAtomic entities 
*  are stand-alone specifications that define the invariant characterist 
* ics and behavior of single (i.e., atomic) PolicyEvents. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework Spec ABE::PolicyEventSpec" href="_3E3F0EC000E93F150AE70159-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework Spec ABE::PolicyEventSpec</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyEventSpecAtomic extends PolicyEventSpec,EntitySpecification,RootEntity {

}