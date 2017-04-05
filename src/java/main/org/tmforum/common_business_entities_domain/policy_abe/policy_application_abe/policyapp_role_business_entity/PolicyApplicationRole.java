/**
* PolicyApp Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F17A71402EB-content.html">PolicyApp Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policyapp_role_business_entity ;

/**
* This is an abstract base class that defines the concept of various typ 
* es of roles used to describe PolicyApplications and their use in the m 
* odel. This facilitates the use and management of Policy by defining fu 
* nctionality in terms of roles that are played in the managed environme 
* nt. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyApplicationRole extends Role,RootEntity {



/**  
* Field policyApplication
*/
protected List<PolicyApplication> policyApplication ;


}