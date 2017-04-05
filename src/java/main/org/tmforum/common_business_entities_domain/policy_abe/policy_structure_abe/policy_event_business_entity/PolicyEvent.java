/**
* Policy Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1EE5600232-content.html">Policy Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_event_business_entity ;

/**
* This class represents a single PolicyEvent or an aggregation of Policy 
* Events, constrained according to the eventConstraint attribute of the  
* EventDetails aggregation class. This set of PolicyEvents is then prese 
* nted to one or more PolicyRules to trigger the evaluation of their con 
* dition clauses. This enables an external application, such as a Policy 
*  Server, to dynamically adjust the set of events that are being used t 
* o trigger the evaluation of a PolicyRule 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEventBase" href="_3E3F0EC000E93D8104040150-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEventBase</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Collection |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyEvent extends PolicyEventBase,Collection,RootEntity {



/**  
* Field policyEventComposite
*/
protected PolicyEventComposite policyEventComposite ;




/**  
* Field eventSequenceNumber
* This attribute is a non-negative integer and represents the particular 

*  sequence in which this event is parsed as part of the overall event c 

* lause. This will allow a policy engine to reference externally supplie 

* d arguments to this object as it is evaluated.</br></br>Notes: Not pre 

* sent in the ITU or CIM specs. 

*/
protected Integer eventSequenceNumber ;




/**  
* Field policyEventSpec
*/
protected PolicyEventSpec policyEventSpec ;




/**  
* Field policyRuleBase
*/
protected List<PolicyRule> policyRuleBase ;


}