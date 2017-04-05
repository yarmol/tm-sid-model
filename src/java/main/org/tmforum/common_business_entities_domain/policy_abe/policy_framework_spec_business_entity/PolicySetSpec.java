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
* This is an abstract base class that is used to define the invariant ch 
* aracteristics (attributes, methods, constraints and relationships) of  
* a PolicySet entity. It is further refined by the PolicyRuleSpec. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicySetSpec extends EntitySpecification,RootEntity {



/**  
* Field decisionStrategy
* This is an enumerated integer that specifies the particular decision s 

* trategy to be used in this PolicySet. </br></br>Permitted Values:</br> 

* </br> 0: Unknown</br> 1: MatchFirst</br> 2: MatchAll</br></br>MatchFir 

* st enforces the actions of the first rule that evaluates to TRUE; poli 

* cy evaluation then STOPS, meaning that all subsequent rules are no lon 

* ger evaluated.</br></br>MatchAll enforces the actions of all rules tha 

* t evaluate to TRUE. This is equivalent to performing two passes throug 

* h the rule set. The first pass gathers all PolicyRules that evaluate t 

* o true and places them in a group. The second pass then executes only  

* those rules that evaluated to true. Execution of these rules is contro 

* lled through the Priority property (on the aggregation PolicySetCompon 

* ent), which defines the order in which the PolicyRules execute.</br> 

*/
protected Integer decisionStrategy ;




/**  
* Field policySet
*/
protected List<PolicySet> policySet ;


}