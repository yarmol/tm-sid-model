/**
* Policy Condition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AC7006A-content.html">Policy Condition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_condition_business_entity ;

/**
* This is the base class for all simple policy conditions. A simple poli 
* cy condition consists of a single Boolean clause, which is used to tes 
* t a single condition. This consists of a single occurrence of a Policy 
* Statement, which is of the form: {variable, operator, value}This desig 
* n relies on the PolicyStatement to supply the actual terms to make up  
* the condition clause. Thus, since everything is normalized to a condit 
* ion clause, no subclasses of PolicyConditionAtomic are needed. Instead 
* , subclasses of the appropriate PolicyStatement classes are provided.A 
*  compound PolicyCondition consists of one or more PolicyConditions con 
* tained inside a higher-level PolicyCondition. These can optionally be  
* grouped by a PolicyConditionComposite object if desired. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyCondition" href="_3E3F0EC000E93D77E58C0266-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Condition ABE::PolicyCondition</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyConditionAtomic extends PolicyCondition,Policy,RootEntity {



/**  
* Field conditionSequenceNumber
* This attribute is a non-negative integer and represents the particular 

*  sequence in which this element is parsed as part of the overall polic 

* y structure. This will allow a policy engine to reference externally s 

* upplied arguments to this object as it is evaluated.</br></br>Notes: N 

* ot present in the ITU specs. CIM 2.7 has a subset of these values</br> 

* </br> 

*/
protected Integer conditionSequenceNumber ;




/**  
* Field hasEvaluated
* This is an enumerated integer that is set by a policy application to d 

* efine the state of evaluation of this PolicyCondition. </br></br>Permi 

* tted Values:</br> 0: not yet evaluated</br> 1: evaluated as TRUE</br>  

* 2: evaluated as FALSE</br></br>Notes:</br>Not present in the ITU or CI 

* M specs. 

*/
protected Integer hasEvaluated ;




/**  
* Field hasSubConditions
* This is a Boolean attribute that, if TRUE, signifies that this PolicyC 

* ondition has one or more sub-conditions. Sub-conditions are used to en 

* force a hierarchical nesting of conditions, so that parent conditions  

* may control the evaluation and other semantics of the sub-conditions t 

* hat they contain.</br></br>Notes: Not present in the ITU or CIM specs. 

*/
protected Boolean hasSubConditions ;




/**  
* Field policyStatement
*/
protected PolicyStatement policyStatement ;


}