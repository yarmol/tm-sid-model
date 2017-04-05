/**
* HolderComposite ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3D3900F5-content.html">HolderComposite ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_abe.holdercomposite_business_entity ;

/**
* A Shelf is a type of EquipmentHolder that is designed to hold various  
* types of Equipment. It has a logical identifier that is often relative 
*  to the Bay that contains the Shelf (i.e., the unique identifier for a 
*  Shelf is often a concatenation of the network element identifier, the 
*  Bay identifier, and the Shelf identifier).Note that the logical ident 
* ifier of a Shelf is typically associated with the Device (i.e., the Ne 
* tworkElement). Compare this to a Rack, whose logical identifier is NOT 
*  associated with the Device. This means that the Shelf IS explicitly a 
*  part of the logical model of a network.Often, a Shelf is used to cont 
* ain not just pluggable components (e.g., Cards, Power Supplies, etc.)  
* but also cabling (e.g., both fiber and wire), with optional connection 
* s to external fuse, alarm, and other types of panels. 

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

public  class Shelf extends HolderComposite,EquipmentHolder,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {

}