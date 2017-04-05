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

import org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policy_server_business_entity.PolicyServer;
import org.tmforum.common_business_entities_domain.policy_abe.policy_application_abe.policyapp_role_business_entity.PolicyApplicationRole;
import org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity.Policy;
import org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity.PolicyDomain;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.Entity;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.ManagedEntity;

import java.util.List;

/**
* A PolicyApplication is a special type of entity (usually a Product) fo 
* r use in policy-based management applications. This class is used as a 
*  convenient place for defining relationships to different managed enti 
* ties. It has four principal subclasses: PolicyServer, PolicyDecisionPo 
* int (PDP), PolicyExecutionPoint (PXP) and PolicyEnforcementPoint (PEP) 
* .The principal role of a PolicyApplication is to define generic relati 
* onships that its subclasses can participate in. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicyApplication extends Entity {



/**  
* Field policyDomain
*/
protected List<PolicyDomain> policyDomain ;




/**  
* Field policyApplicationRole
*/
protected List<PolicyApplicationRole> policyApplicationRole ;




/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;




/**  
* Field policy
*/
protected List<Policy> policy ;




/**  
* Field policyServer
*/
protected PolicyServer policyServer ;


}