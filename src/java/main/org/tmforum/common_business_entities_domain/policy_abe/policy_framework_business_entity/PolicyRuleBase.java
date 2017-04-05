/**
* Policy Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A79039D-content.html">Policy Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity ;

/**
* This is a concrete base class for realizing the "event-condition-passa 
* ction-failaction" semantics that form a policy rule. The semantics of  
* this rule are that the rule is evaluated when an event occurs. If the  
* condition clause is satisfied, then the pass-action clause will be exe 
* cuted (otherwise, the fail-action clause will be executed).PolicyRules 
*  may be nested within PolicyRules. This is often needed in networking  
* (e.g., bandwidth allocation). 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet" href="_3E3F0EC000E93D77E58C0252-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy" href="_3E3F0EC000E93D77E58C0262-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyRuleBase extends PolicySet,Policy,RootEntity {



/**  
* Field isCNF
* This is a Boolean attribute that, if TRUE, defines the condition claus 

* e of this rule to be represented in Conjunctive Normal Form (e.g., an  

* AND of ORs). If the value of this attribute is FALSE, then the conditi 

* on clause will be represented in Disjunctive Normal Form (e.g., an OR  

* of ANDs).</br></br>This attribute controls the setting of how multiple 

*  condition clauses (as represented by multiple PolicyConditionComposit 

* e objects) are treated in the PolicyRule. As such, it is different fro 

* m the attribute PolicyConditionComposite.IsCNF, which controls how mul 

* tiple PolicyConditionAtomic objects are treated in a (single) PolicyCo 

* nditionComposite object.</br> 

*/
protected Boolean isCNF ;




/**  
* Field hasSubRules
* This is a Boolean attribute that, if TRUE, signifies that this PolicyR 

* ule has one or more sub-rules. Sub-rules are used to enforce a hierarc 

* hical nesting of rules, so that parent rules may control the execution 

*  and other semantics of sub-rules that they contain. 

*/
protected Boolean hasSubRules ;




/**  
* Field policyEventBase
*/
protected PolicyEventBase policyEventBase ;




/**  
* Field policyAction
*/
protected PolicyAction policyAction ;




/**  
* Field policyCondition
*/
protected PolicyCondition policyCondition ;




/**  
* Field policyRuleSpec
*/
protected PolicyRuleSpec policyRuleSpec ;


}