/**
* Physical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2D603D3-content.html">Physical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity ;

/**
* This is a concrete class that represents any type of physical resource 
*  that can play a physical adapter role. The Adapter role enables a pie 
* ce of Hardware to adapt its use. For example, sometimes Cards and Chas 
* sis evolve along separate paths, causing future versions of one to no  
* longer be physically compatible with present and/or future versions of 
*  the other. The solution to this is to use an intermediate piece of Ha 
* rdware, called an Adapter, to extend the existing physical structure o 
* f an EquipmentHolder to enable otherwise incompatible Equipment to be  
* plugged into an EquipmentHolder. The Adapter conceptually creates a ne 
* w type of EquipmentHolder that fits into the existing EquipmentHolder. 
*  This enables Cards that would otherwise be physically and/or electric 
* ally incompatible with the existing EquipmentHolder to be supported, b 
* y interfacing to the old EquipmentHolder via the new Adapter. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::HardwareRole" href="_3E3F0EC000E93DDEBE440214-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::HardwareRole</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole" href="_3E3F0EC000E93DDEBE0A02CF-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalAdapterRole extends HardwareRole,PhysicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field typeOfAdapterRole
* This is an enumerated integer that defines the various types of adapte 

* r roles that this object can play. Values include:</br></br> 0: undefi 

* ned;</br> 1: host (e.g., a motherboard)</br> 2: client (e.g., a daught 

* erboard)</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer typeOfAdapterRole ;


}