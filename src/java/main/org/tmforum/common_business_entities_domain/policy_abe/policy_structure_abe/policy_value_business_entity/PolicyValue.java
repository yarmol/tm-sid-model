/**
* Policy Value ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E03C7FB02EE-content.html">Policy Value ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_value_business_entity ;

/**
* The PolicyValue class is an abstract base class for modeling different 
*  types of values that occur in a PolicyStatement. The PolicyValue spec 
* ifies an attribute that should either be set or cleared (if used in a  
* PolicyAction) or matched or compared in some way to a value of the Pol 
* icyVariable in a PolicyCondition. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyValue extends Policy,RootEntity {



/**  
* Field policyVariable
*/
protected PolicyVariable policyVariable ;




/**  
* Field policyStatement
*/
protected List<PolicyStatement> policyStatement ;


}