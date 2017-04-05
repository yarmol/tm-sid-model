/**
* Policy Statement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AEE01BB-content.html">Policy Statement ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_statement_business_entity ;

/**
* This is a concrete class for modeling different types of operators in  
* a PolicyStatement. By restricting the type of operator used in a Polic 
* yStatement, one can effectively restrict the semantics of that PolicyS 
* tatement. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyOperator extends Policy,RootEntity {



/**  
* Field opType
* This is an enumerated integer that specifies the various types of oper 

* ators that are allowed for this PolicyStatement. </br></br>Permitted V 

* alues:</br></br> 1: Match</br> 2: Greater than</br> 3: Greater than or 

*  equals</br> 4: Less than</br> 5: Less than or equals</br> 6: Equals</ 

* br> 7: Not equals</br> 8: IN</br> 9: NOT IN</br> 10: SET</br> 11: CLEA 

* R</br></br>Notes: </br>Not present in the ITU or CIM specs. The IETF R 

* FCs only define “MATCH”.</br> 

*/
protected Integer opType ;




/**  
* Field policyVariable
*/
protected PolicyVariable policyVariable ;




/**  
* Field policyStatement
*/
protected List<PolicyStatement> policyStatement ;


}