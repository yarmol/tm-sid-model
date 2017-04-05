/**
* PolicyApp Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F17A71402EB-content.html">PolicyApp Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policyapp_role_business_entity ;

/**
* This is a concrete base class that defines the concept of various type 
* s of roles used to describe PolicyBrokers and their use in the model.A 
*  PolicyBrokerRole refines the generic concepts of a PolicyApplicationR 
* ole. Specifically, this base class is used to describe generic functio 
* nality inherent in a PolicyBroker. For example, this includes the abil 
* ity to present and negotiate functionality that is traded between diff 
* erent PolicyServers in different PolicyDomains, as well as the ability 
*  to control the functions of a PolicyServer. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApp Role ABE::PolicyApplicationRole" href="_3E3F0EC000E93F17761500E9-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApp Role ABE::PolicyApplicationRole</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyBrokerRole extends PolicyApplicationRole,Role,RootEntity {

}