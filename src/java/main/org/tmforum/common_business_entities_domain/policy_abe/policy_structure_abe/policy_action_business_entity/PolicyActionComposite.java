/**
* Policy Action ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4AD70316-content.html">Policy Action ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_action_business_entity ;

/**
* The PolicyActionComposite class is the base class for serving as a gen 
* eric container in which to place PolicyActionAtomic, PolicyActionVendo 
* r, or PolicyActionComposite classes. The first two provide actions tha 
* t this container groups, while the latter establishes a hierarchy in w 
* hich to order the execution of PolicyActions.Both simple as well as co 
* mplex PolicyActions can be placed in this container.Each PolicyActionA 
* tomic and PolicyActionVendor object is linked to this object using the 
*  containedPolicyActions association. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction" href="_3E3F0EC000E93D77E58C02E2-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Structure ABE::Policy Action ABE::PolicyAction</a> |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PolicyActionComposite extends PolicyAction,Policy,RootEntity {



/**  
* Field actionSequence
* This attribute is a non-negative integer and represents the particular 

*  sequence in which this element is executed as part of the overall pol 

* icy structure.  </br>For example if a composite is part of another com 

* posite policy structure.</br></br>Notes: default is “1” 

*/
protected Integer actionSequence ;




/**  
* Field actionExecutionStrategy
* This is an enumerated integer that defines the execution strategy to b 

* e used upon the sequenced actions aggregated by this PolicyActionCompo 

* site object. Defined execution strategies include:</br></br> 0: Unknow 

* n</br> 1: Do Until Success</br> 2: Do All</br> 3: Do Until Failure</br 

* > 4: Do All Without Failure or Do Nothing</br></br>"Do Until Success"  

* means that actions should be executed according to their predefined or 

* der, until successful execution of a single action. At that point, the 

*  process should stop (even if there are additional actions that could  

* be executed).</br></br>"Do All" means that all actions should be execu 

* ted that are part of the set, according to their predefined order. Thi 

* s should continue, even if one or more of the actions fails.</br></br> 

* "Do Until Failure" means that actions should be executed according to  

* their predefined order until an action fails to execute. At that point 

* , the entire sequence should be stopped.</br></br>Finally, "Do All Wit 

* hout Failure or Do Nothing" means that ALL actions specified should be 

*  performed. However, if a failure occurs, then NONE of the actions sho 

* uld be performed. This implies EITHER the ability to look-ahead and en 

* sure that the actions will be able to be performed successfully, or th 

* e ability to perform a rollback of that action and all previous action 

* s when an error is encountered.</br> 

*/
protected Integer actionExecutionStrategy ;




/**  
* Field hasSubPolicyActions
* This is a Boolean attribute that, if TRUE, signifies that this PolicyA 

* ction has one or more sub-actions. Sub-actions are used to enforce a h 

* ierarchical nesting of actions, so that parent actions may control the 

*  evaluation and other semantics of sub-actions that they contain.</br> 

* </br>Notes: Not present in the ITU or CIM specs. 

*/
protected Boolean hasSubPolicyActions ;




/**  
* Field actionsCNF
*/
protected Boolean actionsCNF ;


}