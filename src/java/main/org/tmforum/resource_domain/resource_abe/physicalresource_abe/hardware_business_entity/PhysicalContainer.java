/**
* Hardware ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3EF2015D-content.html">Hardware ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.hardware_business_entity ;

/**
* This is an abstract class that is used to add additional semantics to  
* the ManagedHardware class. Its attributes define whether a ManagedHard 
* ware object can be removed and/or replaced, and whether this action re 
* quires power to be removed or not when the action is performed. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware" href="_3E3F0EC000E93CDAD87C0261-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware" href="_3E3F0EC000E93CDAB5F60264-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PhysicalContainer extends ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field hotSwappable
* This is a Boolean attribute that defines whether it is possible to rep 

* lace this object instance with a physically different, but equivalent, 

*  object instance while the containing Equipment has power applied to i 

* t. TRUE means that it is HotSwappable, and FALSE means that it is not. 

* </br></br>All HotSwappable PhysicalComponents are inherently Removable 

*  and Replaceable.</br></br>This is a required attribute.</br> 

*/
protected Boolean hotSwappable ;




/**  
* Field removable
* This is a Boolean that defines whether it is possible to insert and re 

* move this object instance from the Equipment in which it is installed, 

*  without impairing the function or packaging of the Equipment. TRUE me 

* ans that it is removable, and FALSE means that it is not.</br></br>A P 

* ackage can still be Removable if power must be 'off' in order to perfo 

* rm the removal. If power can be 'on' and this object instance can stil 

* l be removed, then this object instance is both Removable and HotSwapp 

* able.</br></br>This is a required attribute.</br> 

*/
protected Boolean removable ;




/**  
* Field replaceable
* This is a Boolean that defines whether it is possible to replace this  

* object instance with a physically different instance of the same type. 

*  For example, some types of device allow various Chips to be upgraded. 

*  TRUE means that it is replaceable, and FALSE means that it is not.</b 

* r></br>All Removable packages are inherently Replaceable.</br></br>Thi 

* s is a required attribute.</br> 

*/
protected Boolean replaceable ;




/**  
* Field physicalCapacity
*/
protected List<PhysicalCapacity> physicalCapacity ;


}