/**
* Policy Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A79039D-content.html">Policy Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity ;

/**
* A PolicyDomain is a collection of entities and services that are admin 
* istered in a coordinated fashion using a set of policies. The policies 
*  are used to control the set of services and entities according to a c 
* ommon methodology, such as a finite state machine. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::ManagementDomain |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyDomain extends ManagementDomain,RootEntity {



/**  
* Field policyApplication
*/
protected List<PolicyApplication> policyApplication ;




/**  
* Field policyDomain
*/
protected List<PolicyDomain> policyDomain ;




/**  
* Field policyDomain1
*/
protected PolicyDomain policyDomain1 ;




/**  
* Field policy
*/
protected Policy policy ;


}