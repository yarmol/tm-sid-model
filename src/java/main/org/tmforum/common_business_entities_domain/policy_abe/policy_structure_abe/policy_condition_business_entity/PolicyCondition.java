/**
* Policy Condition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AC7006A-content.html">Policy Condition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_condition_business_entity ;

/**
* This is an abstract base class that represents how to form the conditi 
* on clause of a PolicyRule. This class can be used to represent rule-sp 
* ecific or reusable policy conditions.Policy conditions are of the form 
* : {variable, operator, value}where the operator is usually the MATCH o 
* perator, but could be another type (e.g., compare) of operator. This g 
* ives the semantics of "IF the condition is TRUE (or FALSE)".The subcla 
* sses of PolicyCondition, along with its recursive aggregation, enable  
* simple and compound (e.g., nested) PolicyConditions to be supported by 
*  the same structure. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyCondition extends Policy,RootEntity {



/**  
* Field policyRuleBase
*/
protected List<PolicyRuleBase> policyRuleBase ;




/**  
* Field policyConditionSpec
*/
protected PolicyConditionSpec policyConditionSpec ;




/**  
* Field policyCondition
*/
protected List<PolicyCondition> policyCondition ;




/**  
* Field policyCondition1
*/
protected PolicyCondition policyCondition1 ;




/**  
* Field policyRule
*/
protected List<PolicyRule> policyRule ;




/**  
* Field policyCondition
*/
protected List<PolicyCondition> policyCondition ;




/**  
* Field policyCondition2
*/
protected PolicyCondition policyCondition2 ;


}