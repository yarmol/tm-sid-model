/**
* Policy Action ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AD70316-content.html">Policy Action ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_action_business_entity ;

/**
* This is an abstract base class that represents how to form the action  
* clause of a PolicyRule. This consists of a single occurrence of a Poli 
* cyStatement, which is of the form: {variable, operator, value}Policy a 
* ctions have the semantics of "SET variable to value". There are two ty 
* pes of actions: - pass actions are invoked if the condition clause was 
*  TRUE - fail actions are invoked if the condition clause was FALSE 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyAction extends Policy,RootEntity {



/**  
* Field policyRuleBase
*/
protected List<PolicyRuleBase> policyRuleBase ;




/**  
* Field policyAction
*/
protected List<PolicyAction> policyAction ;




/**  
* Field policyAction1
*/
protected PolicyAction policyAction1 ;




/**  
* Field policyActionSpec
*/
protected PolicyActionSpec policyActionSpec ;




/**  
* Field revenueAssuranceConsequence
*/
protected List<RevenueAssuranceConsequence> revenueAssuranceConsequence ;




/**  
* Field policyRule
*/
protected List<PolicyRule> policyRule ;




/**  
* Field policyAction
*/
protected List<PolicyAction> policyAction ;




/**  
* Field policyAction2
*/
protected PolicyAction policyAction2 ;


}