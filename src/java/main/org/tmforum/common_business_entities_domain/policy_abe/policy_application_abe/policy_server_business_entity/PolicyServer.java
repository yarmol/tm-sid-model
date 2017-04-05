/**
* Policy Server ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F16A60901F6-content.html">Policy Server ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policy_server_business_entity ;

/**
* A PolicyServer is a fundamental building block of a policy-based manag 
* ement system. It represents both a set of core functionality for imple 
* menting policy as well as a unit of distribution in a distributed impl 
* ementation.With respect to functionality, a PolicyServer is an entity  
* that is either manufactured or is constructed by integrating the funct 
* ionality of different PDPs, PXPs, PEPs, and other applications. These  
* other applications provide the logic to manage and control the set of  
* PDPs, PXPs, and PEPs that constitute a PolicyServer. For example, conf 
* lict detection and resolution need to be applied.Therefore, a PolicySe 
* rver is in reality an intelligent container that contains its own mana 
* gement logic that is supplemented by the functionality of the PEP, PXP 
* , and PDP applications. It usually corresponds to a single PolicyDomai 
* n. While this is not strictly necessary, doing otherwise greatly compl 
* icates the resulting management logic. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyServer extends PolicyApplication,Entity,RootEntity {



/**  
* Field policyBroker
*/
protected PolicyBroker policyBroker ;




/**  
* Field policyApplication
*/
protected PolicyApplication policyApplication ;


}