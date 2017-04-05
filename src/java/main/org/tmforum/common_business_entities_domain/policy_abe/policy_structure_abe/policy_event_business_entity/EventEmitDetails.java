/**
* Policy Event ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1EE5600232-content.html">Policy Event ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_structure_abe.policy_event_business_entity ;

/**
* This class contains the OCL expression that will be used by the emits  
* association to determine what, if any, constraints are to be applied t 
* o this PolicyEventSet. It also contains some additional semantics to h 
* elp identify the type of this event. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class EventEmitDetails extends Entity {



/**  
* Field emitConstraint
* This attribute is a string that contains the specific OCL expression t 

* o constrain how a particular Event is emitted by a particular Resource 

* . Defining this as an attribute enables external applications to popul 

* ate this constraint. 

*/
protected String emitConstraint ;




/**  
* Field isPhysicalEvent
* This is a Boolean attribute that, if TRUE, identifies this event as be 

* ing emitted from a PhysicalResource. If it is FALSE, then this event h 

* as been emitted from a LogicalResource. 

*/
protected Boolean isPhysicalEvent ;


}