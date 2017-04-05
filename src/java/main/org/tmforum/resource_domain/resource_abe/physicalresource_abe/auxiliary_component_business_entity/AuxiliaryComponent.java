/**
* Auxiliary Component ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3BF10021-content.html">Auxiliary Component ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.auxiliary_component_business_entity ;

/**
* This is an abstract base class that represents managed entities, such  
* as power supplies, fans and cables, wihch are required for the proper  
* operation of the Device but have a primary function that is different  
* than the primary end-user function(s) of the Device.The difference bet 
* ween AuxiliaryComponents and other subclasses of Equipment are whether 
*  or not the physical object performs a function intrinsic to the main  
* function of the Device. This is best understood by way of example. Con 
* sider a Router. Its main function is to route and forward packets. A P 
* owerSupply is an AuxiliaryComponent, because even though it is needed  
* for the proper operation of the Router, it does not directly help in r 
* outing and forwarding packets. A LineCard (that provides routing funct 
* ionality) is a subclass of Equipment because its purpose is to route a 
* nd forward packets. Similar examples exist for different types of equi 
* pment, where their criteria may be different. For example, instead of  
* whether it routes or forwards packets, the criterion "does it carry si 
* gnal" may be useful to appropriately classify components. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class AuxiliaryComponent extends PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {

}