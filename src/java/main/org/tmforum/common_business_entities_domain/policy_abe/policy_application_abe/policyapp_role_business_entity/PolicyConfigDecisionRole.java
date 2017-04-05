/**
* PolicyApp Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F17A71402EB-content.html">PolicyApp Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policyapp_role_business_entity ;

/**
* This is a concrete base class that defines the concept of various type 
* s of roles used to describe processes that control configuration proce 
* sses, and their use in the model.A PolicyConfigDecisionRole refines th 
* e generic concepts of a PolicyConfigRole. Specifically, this base clas 
* s is used to describe different processes required to request decision 
* s involving the monitoring, changing and/or verifying of the configura 
* tion of a Managed Object. These processes will orchestrate the use of  
* one or more instances of other PolicyConfigRoles as part of executing  
* the configuration decision. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApp Role ABE::PolicyApplicationRole" href="_3E3F0EC000E93F17761500E9-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApp Role ABE::PolicyApplicationRole</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyConfigDecisionRole extends PolicyApplicationRole,Role,RootEntity {

}