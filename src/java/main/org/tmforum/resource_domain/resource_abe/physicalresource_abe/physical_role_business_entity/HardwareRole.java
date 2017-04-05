/**
* Physical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2D603D3-content.html">Physical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity ;

/**
* This is an abstract base class for representing the different types of 
*  roles that various physical resources can take on. For this first ite 
* ration, two specialized roles have been defined: holder and adapter. T 
* his enables a single object, such as a Card, to have additional functi 
* ons. For example, a Card may also serve as a motherboard or hosting bo 
* ard for another Card. In this situation, there isn't a separate Equipm 
* entHolder - rather, the Card acts as a holder in addition to providing 
*  its normal functions. This class is the base class for defining diffe 
* rent types of physical resource roles. Attributes are TBD. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole" href="_3E3F0EC000E93DDEBE0A02CF-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class HardwareRole extends PhysicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field managedHardware
*/
protected ManagedHardware managedHardware ;


}