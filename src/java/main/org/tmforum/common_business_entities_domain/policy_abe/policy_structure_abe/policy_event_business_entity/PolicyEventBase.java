/**
* Policy Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1EE5600232-content.html">Policy Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_event_business_entity ;

/**
* This class represents an aggregation of PolicyEvents, constrained acco 
* rding to the eventConstraint attribute of the EventDetails aggregation 
*  class. This set of PolicyEvents is then presented to one or more Poli 
* cyRules to trigger the evaluation of their condition clauses. This ena 
* bles an external application, such as a Policy Server, to dynamically  
* adjust the set of events that are being used to trigger the evaluation 
*  of a PolicyRule 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Collection |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyEventBase extends Collection,RootEntity {



/**  
* Field policyRuleBase
*/
protected List<PolicyRuleBase> policyRuleBase ;




/**  
* Field hasEventEvaluated
* This is an enumerated integer that is set by a policy application to d 

* efine the state of evaluation of this event. Values include:</br></br> 

*  0: not yet evaluated</br> 1: evaluated as TRUE</br> 2: evaluated as F 

* ALSE</br> 

*/
protected Integer hasEventEvaluated ;




/**  
* Field policyGroup
*/
protected List<PolicyGroup> policyGroup ;




/**  
* Field policyEventBase
*/
protected List<PolicyEventBase> policyEventBase ;




/**  
* Field policyEventBase1
*/
protected PolicyEventBase policyEventBase1 ;




/**  
* Field policyRuleBase
*/
protected List<PolicyRule> policyRuleBase ;


}