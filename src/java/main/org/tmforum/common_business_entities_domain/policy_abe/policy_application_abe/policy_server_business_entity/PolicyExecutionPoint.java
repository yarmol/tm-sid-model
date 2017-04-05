/**
* Policy Server ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F16A60901F6-content.html">Policy Server ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policy_server_business_entity ;

/**
* A PolicyExecutionPoint is an entity that is used to execute a prescrib 
* ed set of PolicyActions on a set of PolicyTargets.The combination of a 
*  PolicyExecutionPoint and a PolicyEnforcementPoint enable the act of e 
* xecuting a decision (made by a PolicyDecisionPoint) to be separated fr 
* om the act of ensuring that the executing actions were performed corre 
* ctly, and had the desired results. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyExecutionPoint extends PolicyApplication,Entity,RootEntity {



/**  
* Field policyDecisionPoint
*/
protected PolicyDecisionPoint policyDecisionPoint ;




/**  
* Field policyEnforcementPoint
*/
protected PolicyEnforcementPoint policyEnforcementPoint ;




/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;


}