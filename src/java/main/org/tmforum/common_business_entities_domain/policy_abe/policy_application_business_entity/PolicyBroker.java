/**
* Policy Application ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A6D0151-content.html">Policy Application ABE</a> 
* The Policy Application ABE defines concepts and application components 
*  that can use policy entities to manage the behavior and configuration 
*  of other entities. This consists of entities to provide policy decisi 
* on-making capabilities, as well as entities to enforce and execute pol 
* icies. It also includes entities required to build an NGOSS policy sys 
* tem. These include entities to coordinate management and usage aspects 
*  of policy as well as entities to enable policy components to scale to 
*  large distributed systems. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_business_entity ;

/**
* PolicyServers affect ManagedEntities in a particular PolicyDomain, and 
*  are coordinated through a PolicyBroker. The purpose of the PolicyBrok 
* er is to control how different PolicyServers interact with each other. 
*  In this regard, it has two different functions.The first function is  
* to ensure that conflicts between different policy rules don't exist wh 
* en different Policy Servers are asked to work together. The second is  
* to coordinate the application of different policies in different Polic 
* y Servers. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication" href="_3E3F0EC000E93D7F51F50392-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyBroker extends PolicyApplication,Entity,RootEntity {



/**  
* Field policyServer2
*/
protected List<PolicyServer> policyServer2 ;


}