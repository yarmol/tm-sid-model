/**
* Policy Action ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AD70316-content.html">Policy Action ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_action_business_entity ;

/**
* This is the base class for all simple PolicyActions. A simple PolicyAc 
* tion consists of a single Boolean clause, which is used to perform a s 
* ingle action. This consists of a single occurrence of a PolicyStatemen 
* t, which is of the form: {SET | CLEAR} PolicyVariable to PolicyValueTh 
* is is distinctly different from the PolicyActionVendor, which does not 
*  use a PolicyStatement.PolicyActionAtomic objects can also be used to  
* form more complex action structures. A PolicyActionComposite object ca 
* n be used to contain a group of PolicyActionAtomic objects - this grou 
* ping enables multiple PolicyActionAtomic objects to be executed as a g 
* roup. Alternatively, a PolicyActionAtomic object can contain one or mo 
* re PolicyActionAtomic objects (and also PolicyActionComposite groups i 
* f desired) to provide the semantics of a compound PolicyAction. In eit 
* her case, the aggregation is done using the containedPolicyActions agg 
* regation. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction" href="_3E3F0EC000E93D77E58C02E2-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyActionAtomic extends PolicyAction,Policy,RootEntity {



/**  
* Field actionSequenceNumber
* This attribute is a non-negative integer and represents the particular 

*  sequence in which this element is executed as part of the overall pol 

* icy structure. This will allow a policy engine to reference externally 

*  supplied arguments to this object as it is executed.</br></br>Notes:  

* Not present in the ITU specs;  CIM 2.7 has a subset of these values. 

*/
protected Integer actionSequenceNumber ;




/**  
* Field hasExecuted
* This is an enumerated integer that is set by a policy application to d 

* efine the state of execution of this policyAction. </br></br>Permited  

* Values:</br> 0: not yet executed</br> 1: executed with no errors</br>  

* 2: executed with errors but successfully rolled back</br> 3: executed  

* with errors and did not roll back</br> 4: did not complete execution b 

* ut successfully rolled back</br> 5: did not complete execution and did 

*  not roll back</br></br>Notes:</br>Not present in the ITU or CIM specs 

* .</br> 

*/
protected Integer hasExecuted ;




/**  
* Field hasSubActions
* This is a Boolean attribute that, if TRUE, signifies that this PolicyA 

* ction has one or more sub-actions. Sub-actions are used to enforce a h 

* ierarchical nesting of actions, so that parent actions may control the 

*  evaluation and other semantics of the sub-actions that they contain.< 

* /br></br>Notes: Not present in the ITU or CIM specs. 

*/
protected Boolean hasSubActions ;




/**  
* Field policyStatement
*/
protected PolicyStatement policyStatement ;


}