/**
* Policy Server ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F16A60901F6-content.html">Policy Server ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policy_server_business_entity ;

/**
* A PolicyEnforcementPoint is a type of PolicyApplication, and is used t 
* o verify that a prescribed set of PolicyActions have been successfully 
*  executed on a set of PolicyTargets. A PolicyEnforcementPoint serves a 
* s an interface between the devices that policy is executed on and the  
* policy decision-makers (such as the PolicyDecisionPoint) of the policy 
* . PolicyEnforcementPoints request work to be performed from PolicyDeci 
* sionPoints, and then enforce decisions made by PolicyExecutionPoints o 
* n their PolicyTargets. One or more PolicyEnforcementPoints are contain 
* ed in a PolicyServer.The combination of a PolicyExecutionPoint and a P 
* olicyEnforcementPoint enable the act of executing a decision (made by  
* a PolicyExecutionPoint) to be separated from the act of ensuring that  
* the executing actions were performed correctly, and had the desired re 
* sults (both of these latter two functions are performed by the PolicyE 
* nforcementPoint). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyEnforcementPoint extends PolicyApplication,Entity,RootEntity {



/**  
* Field policyDecisionPoint
*/
protected PolicyDecisionPoint policyDecisionPoint ;




/**  
* Field policyExecutionPoint
*/
protected PolicyExecutionPoint policyExecutionPoint ;




/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;


}