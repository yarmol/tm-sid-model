/**
* Policy Variable ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C76B023C-content.html">Policy Variable ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_variable_business_entity ;

/**
* This is an abstract class for modeling different types of variables th 
* at can be used to form a PolicyStatement. The variable specifies an at 
* tribute or concept that should either be matched or in some way compar 
* ed to a value when the condition is evaluated.There are three importan 
* t factors that must be taken into account in the design of variables.  
* The first is that not every combination of a variable and a value crea 
* tes a meaningful condition. For example, port numbers cannot be negati 
* ve. Rather, the type of variable in the condition defines the set of m 
* atchable value types.Second, just because a value has the correct data 
* type does not mean that it can be meaningfully compared to a variable. 
*  To continue the above example, a port of 1,000,000 is meaningless. Th 
* is is handled in this model by specifying constraints (using OCL) that 
*  apply to a particular variable that must be obeyed by any value that  
* it is being compared to. The ExpectedPolicyValuesForVariable associati 
* on binds a PolicyVariable to a PolicyValue; any constraints that are r 
* equired in this binding are added to an instance of this association u 
* sing OCL.Third, while the SID model defines a set of useful PolicyVari 
* ables, there is a high likelihood that specific applications will need 
*  extensions to these variables. This is accommodated through the notio 
* n of implicit and explicit PolicyVariable classes. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyVariable extends Policy,RootEntity {



/**  
* Field policyValue
*/
protected PolicyValue policyValue ;




/**  
* Field policyOperator
*/
protected PolicyOperator policyOperator ;




/**  
* Field policyStatement
*/
protected List<PolicyStatement> policyStatement ;


}