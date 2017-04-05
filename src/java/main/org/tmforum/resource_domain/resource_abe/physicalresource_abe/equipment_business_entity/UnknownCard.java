/**
* Equipment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3E30001E-content.html">Equipment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_business_entity ;

/**
* This object is used as a generic placeholder to represent Cards that a 
* re known to exist but are not yet identifiable via Software means. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Card" href="_3E3F0EC000E93CDDBBD0013B-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Card</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Equipment" href="_3E3F0EC000E93CDAFB610004-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Equipment</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class UnknownCard extends Card,Equipment,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {

}