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
* This class represents an administratively-defined logical container fo 
* r storing reusable policy-related information. This is defined as Poli 
* cyGroups, PolicyRules, PolicyConditions, PolicyActions, and PolicyStat 
* ements. It can also store metadata about these policy-related objects. 
* For the purposes of this definition: - administratively-defined means  
* that it resides in a single  policy domain - logical container means t 
* hat it may be implemented as either  separate data store, or a special 
*  area of a data store that is used expressly to contain policy informa 
* tion - policy information means policy rules and groups, their  consti 
* tuent elements, and related data that may be used in the evaluation an 
* d/or execution of policy conditions, actions, and other policy compone 
* nts. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Collection |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyRepository extends Collection,RootEntity {



/**  
* Field policyRepository
*/
protected List<PolicyRepository> policyRepository ;




/**  
* Field policyRepository1
*/
protected PolicyRepository policyRepository1 ;




/**  
* Field policy
*/
protected Policy policy ;


}