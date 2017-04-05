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
*  PolicyRule entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework Spec ABE::PolicySetSpec" href="_3E3F0EC000E93F17BD6403DF-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework Spec ABE::PolicySetSpec</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyRuleSpec extends PolicySetSpec,EntitySpecification,RootEntity {



/**  
* Field executionStrategy
* This is an enumerated integer that defines the strategy to be used whe 

* n executing the sequenced actions aggregated by this PolicyRule. Defin 

* ed execution strategies include:</br></br> 0: Unknown</br> 1: Do Until 

*  Success</br> 2: Do All</br> 3: Do Until Failure</br> 4: Do All Withou 

* t Failure or Do Nothing</br></br>"Do Until Success" means that actions 

*  should be executed according to their predefined order, until success 

* ful execution of a single action. At that point, the process should st 

* op (even if there are additional actions that could be executed).</br> 

* </br>"Do All" means that all actions should be executed that are part  

* of the set, according to their predefined order. This should continue, 

*  even if one or more of the actions fails.</br></br>"Do Until Failure" 

*  means that all actions should be executed according to their predefin 

* ed order until an action fails to execute. At that point, the entire s 

* equence should be stopped.</br></br>Finally, "Do All Without Failure o 

* r Do Nothing" means that all actions specified should be performed. Ho 

* wever, if a failure occurs, then NONE of the actions should be perform 

* ed. This implies EITHER the ability to look-ahead and ensure that the  

* actions will be able to be performed successfully, or the ability to p 

* erform a rollback of that action and all previous actions when an erro 

* r is encountered.</br> 

*/
protected Integer executionStrategy ;




/**  
* Field sequencedActions
* This is an enumerated integer defines how the ordering of the PolicyAc 

* tions associated with this PolicyRule is to be interpreted. </br></br> 

* Notes: Not present in the ITU or CIM specs (the CIM defined a subset o 

* f these values as an attribute in the PolicyRule). 

*/
protected Integer sequencedActions ;




/**  
* Field policyActionSelectCriteria
* This is an attribute that contains an OCL expression to prescribe any  

* limitations on the types of PolicyActions that can be used with any Po 

* licyRules that are derived from this particular PolicyRuleSpec. This e 

* nables a PolicyRuleSpec to be built that defines what types of PolicyA 

* ctions can be used to build PolicyRules. This in turn ensures that a g 

* iven set of PolicyRules carry standard functionality.</br></br>Notes:  

* Not present in the ITU or CIM specs 

*/
protected String policyActionSelectCriteria ;




/**  
* Field policyConditionSelectCriteria
* This is an attribute that contains an OCL expression to prescribe any  

* limitations on the types of PolicyConditions that can be used with any 

*  PolicyRules that are derived from this particular PolicyRuleSpec. Thi 

* s enables a PolicyRuleSpec to be built that defines what types of Poli 

* cyConditions can be used to build PolicyRules. This in turn ensures th 

* at a given set of PolicyRules carry standard functionality.</br></br>N 

* otes: Not present in the ITU or CIM specs. 

*/
protected String policyConditionSelectCriteria ;




/**  
* Field policyEventSelectCriteria
* This is an attribute that contains an OCL expression to prescribe any  

* limitations on the types of PolicyEvents that can be used with any Pol 

* icyRules that are derived from this particular PolicyRuleSpec. This en 

* ables a PolicyRuleSpec to be built that defines what types of PolicyEv 

* ents can be used to trigger the evaluation of PolicyRules. This in tur 

* n ensures that a given set of PolicyRules carry standard functionality 

* .</br></br>Notes: Not present in the ITU or CIM specs. 

*/
protected String policyEventSelectCriteria ;




/**  
* Field policyRuleBase
*/
protected List<PolicyRuleBase> policyRuleBase ;




/**  
* Field policyRule
*/
protected List<PolicyRule> policyRule ;


}