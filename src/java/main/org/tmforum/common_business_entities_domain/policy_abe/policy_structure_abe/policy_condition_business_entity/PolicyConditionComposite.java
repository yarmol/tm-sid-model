/**
* Policy Condition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AC7006A-content.html">Policy Condition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_condition_business_entity ;

/**
* The PolicyConditionComposite class is designed to be an intelligent co 
* ntainer. The PolicyConditionComposite class is the base class for all  
* complex policy conditions. A complex policy condition consists of an a 
* ggregation of PolicyConditionAtomic and/or PolicyConditionComposite ob 
* jects, which in turn form a complex Boolean statement. It is important 
*  to note that such an object still evaluates to a single Boolean TRUE  
* or FALSE value.Conceptually, this is a stand-alone object that consist 
* s of one PolicyCondition that provides an overall context for either a 
*  nested or a group of subordinate PolicyConditions to be evaluated. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyCondition" href="_3E3F0EC000E93D77E58C0266-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyCondition</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyConditionComposite extends PolicyCondition,Policy,RootEntity {



/**  
* Field conditionIsCNF
* This is a Boolean attribute that, if TRUE, defines the condition claus 

* e of this PolicyConditionComposite object to be represented in Conjunc 

* tive Normal Form (e.g., an And of Ors). If the value of this attribute 

*  is FALSE, then the condition clause will be represented in Disjunctiv 

* e Normal Form.</br></br>This attribute controls the setting of how mul 

* tiple condition clauses (as represented by individual PolicyConditionA 

* tomic objects) are treated in the PolicyConditionComposite object. As  

* such, it is different from the attribute PolicyRule.IsCNF, which contr 

* ols how multiple PolicyConditionComposite objects are treated in a Pol 

* icyRule object.</br></br>Notes: Not present in the ITU or CIM specs. 

*/
protected Boolean conditionIsCNF ;


}