/**
* Policy Statement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AEE01BB-content.html">Policy Statement ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_statement_business_entity ;

/**
* This class models the triplet {variable, operator, value} that is used 
*  by both the PolicyCondition and PolicyAction classes. Note that the s 
* emantics are reflected in the types of operators that are allowed to b 
* e used in each case.For conditions, we want the semantics of "variable 
*  relates to value", where "relates to" is usually the match operator,  
* but could also be other applicable operators (e.g., a comparison opera 
* tor).For actions, we want the semantics of "set variable to value". He 
* re, the only operator allowed is the set operator.Both of these semant 
* ics are enforced using OCL.The ability to use the same basic form for  
* writing PolicyConditions and PolicyActions greatly simplifies the desi 
* gn and implementation of a policy management system by enabling such s 
* tatements to be automatically generated. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyStatement extends Policy,RootEntity {



/**  
* Field policyVariable
*/
protected PolicyVariable policyVariable ;




/**  
* Field policyValue
*/
protected PolicyValue policyValue ;




/**  
* Field policyOperator
*/
protected PolicyOperator policyOperator ;




/**  
* Field policyStatementSpec
*/
protected PolicyStatementSpec policyStatementSpec ;


}