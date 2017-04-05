/**
* DO NOT USE - Ilustrative Use Only 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EE21C740227-content.html">DO NOT USE - Ilustrative Use Only</a> 
* This package that 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.addendum_figures.do_not_use_-_ilustrative_use_only ;

/**
* ILLUSTRATIVE USE ONLY - do not use! 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class EquipmentComponent extends PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field equipment
*/
protected Equipment equipment ;




/**  
* Field equipmentHolder
*/
protected EquipmentHolder equipmentHolder ;


}