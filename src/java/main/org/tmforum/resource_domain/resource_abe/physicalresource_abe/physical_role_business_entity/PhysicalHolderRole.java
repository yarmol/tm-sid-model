/**
* Physical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2D603D3-content.html">Physical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity ;

/**
* This is a concrete class that represents any type of physical resource 
*  that can play a holding role. A common example is a Card that can als 
* o serve as a motherboard, or a Card that can serve as a daughter card  
* that attaches to a motherboard. This class enables a single Entity, su 
* ch as a Line Card, to have multiple roles - it can function as a Route 
* r Processor as well as a Holder. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::HardwareRole" href="_3E3F0EC000E93DDEBE440214-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::HardwareRole</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole" href="_3E3F0EC000E93DDEBE0A02CF-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalHolderRole extends HardwareRole,PhysicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field typeOfHolderRole
* This is an enumerated integer that defines the various types of holdin 

* g roles that this object can play. Values include:</br> </br> 0: undef 

* ined;</br> 1: host (e.g., a motherboard)</br> 2: client (e.g., a daugh 

* terboard)</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer typeOfHolderRole ;


}