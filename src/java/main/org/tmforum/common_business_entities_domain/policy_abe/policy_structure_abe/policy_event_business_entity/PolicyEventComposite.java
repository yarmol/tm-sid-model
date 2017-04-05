/**
* Policy Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1EE5600232-content.html">Policy Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_event_business_entity ;

/**
* This is a base class that represents the occurrence of a composite eve 
* nt. A composite event is an event that is made up of a set of PolicyEv 
* entAtomic and/or PolicyEventComposite entities. Like a PolicyEventAtom 
* ic, a PolicyEventComposite can also be used to trigger the evaluation  
* of the condition clause of a PolicyRule. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEvent" href="_H.a.n_8N.bWE.d-.p.vYE.q.r-ER3Q-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEvent</a> |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEventBase" href="_3E3F0EC000E93D8104040150-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Event ABE::PolicyEventBase</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Collection |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyEventComposite extends PolicyEvent,PolicyEventBase,Collection,RootEntity {



/**  
* Field policyEvent
*/
protected List<PolicyEvent> policyEvent ;


}