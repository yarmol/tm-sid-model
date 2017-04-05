/**
* HolderComposite ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3D3900F5-content.html">HolderComposite ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_abe.holdercomposite_business_entity ;

/**
* A Bay is a type of EquipmentHolder that is designed to hold various ty 
* pes of Equipment. It has a logical identifier, usually a component of  
* port AIDs in TL1 based switches.Note that the logical identifier of a  
* Bay is typically associated with the Device (i.e., the NetworkElement) 
* . This means that the Bay IS explicitly a part of the logical model of 
*  a network.A Bay is usually built as a pre-wired hardware assembly tha 
* t contains a set of shelves and accompanying ancillary Equipment. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::HolderComposite ABE::HolderComposite" href="_3E3F0EC000E93DDEEB160255-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::HolderComposite ABE::HolderComposite</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::EquipmentHolder |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class Bay extends HolderComposite,EquipmentHolder,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {

}