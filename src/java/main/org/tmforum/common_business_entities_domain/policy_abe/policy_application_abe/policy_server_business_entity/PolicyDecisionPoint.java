/**
* Policy Server ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F16A60901F6-content.html">Policy Server ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policy_server_business_entity ;

/**
* A PolicyDecisionPoint is a type of PolicyApplication. It makes policy  
* decisions for itself or for other entities that request such decisions 
* , such as PolicyEnforcementPoints (PEPs) and PolicyExecutionPoints (PX 
* Ps). One or more PolicyDecisionPoints are contained in a PolicyServer. 
* PDPs use policies to configure or answer queries from policy-capable n 
* etwork elements or from an operator of the PBNM system. An example of  
* a query is an RSVP admission request - a decision must be made to eith 
* er accept or reject the request by the receiving network element. Sinc 
* e the network element doesn't have any idea about the overall state of 
*  the network, it makes a request of the PDP, asking the PDP if the RSV 
* P request should be allowed. Thus, the PDP serves as the interface bet 
* ween the network and higher level processes. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyDecisionPoint extends PolicyApplication,Entity,RootEntity {



/**  
* Field policyEnforcementPoint
*/
protected PolicyEnforcementPoint policyEnforcementPoint ;




/**  
* Field policyExecutionPoint
*/
protected PolicyExecutionPoint policyExecutionPoint ;




/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;




/**  
* Field logicalDevice
*/
protected List<LogicalDevice> logicalDevice ;


}