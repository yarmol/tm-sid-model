/**
* Auxiliary Component ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3BF10021-content.html">Auxiliary Component ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.auxiliary_component_business_entity ;

/**
* This defines the capabilities of fans that are used for cooling. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Auxiliary Component ABE::CoolingDevice" href="_3E3F0EC000E93DDEB2B20070-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Auxiliary Component ABE::CoolingDevice</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class Fan extends CoolingDevice,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field currentSpeed
* This is the current speed of the Fan in revolutions per minute. 

*/
protected String currentSpeed ;




/**  
* Field isVariableSpeed
* This is a Boolean attribute that, if TRUE, means that this fan support 

* s variable cooling speeds. If it is FALSE, then this fan only provides 

*  a single cooling speed. 

*/
protected Boolean isVariableSpeed ;




/**  
* Field desiredSpeed
* This is an integer attribute that defines the currently requested fan  

* speed, defined in revolutions per minute.</br></br>For non-variable sp 

* eed Fans, this attribute has the same semantics as turning the Fan on  

* or off. For variable-speed Fans, this attribute represents the desired 

*  speed of the Fan.</br> 

*/
protected Integer desiredSpeed ;


}