/**
* Policy Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A79039D-content.html">Policy Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity ;

/**
* This class is a generalized aggregation container. It enables PolicyRu 
* les and/or PolicyGroups to be aggregated in a single container. Note t 
* hat loops, including the degenerate case of a PolicyGroup that contain 
* s itself, are not allowed when PolicyGroups contain other PolicyGroups 
* . 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet" href="_3E3F0EC000E93D77E58C0252-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy" href="_3E3F0EC000E93D77E58C0262-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyGroup extends PolicySet,Policy,RootEntity {



/**  
* Field policyEvent
*/
protected PolicyEventBase policyEvent ;


}