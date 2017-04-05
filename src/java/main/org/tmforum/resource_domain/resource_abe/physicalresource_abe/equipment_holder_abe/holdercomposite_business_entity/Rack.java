/**
* HolderComposite ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3D3900F5-content.html">HolderComposite ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_abe.holdercomposite_business_entity ;

/**
* A Rack is a type of SecureHolder that represents an enclosure in which 
*  EquipmentHolders, such as Chassis, are placed. Typically a Rack is no 
* thing more than the enclosure, and all the functioning componentry is  
* packaged in the Chassis.Note that the logical identifier of a Rack is  
* NOT typically associated with the Device (i.e., the NetworkElement). C 
* ompare this to either a Bay or a Shelf, whose logical identifier IS as 
* sociated with the Device. This means that the Rack is explicitly NOT a 
*  part of the logical model of a network.The Rack typically serves as t 
* he "master enclosure" for Chassis, Shelves and Bays. In addition, Rack 
* s can have multiple instances of multiple Devices mounted in them. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::HolderComposite ABE::SecureHolder" href="_3E3F0EC000E93CDD708302D6-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::HolderComposite ABE::SecureHolder</a> |- 
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

public  class Rack extends SecureHolder,HolderComposite,EquipmentHolder,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field country
* This is the designation of the country for which the Rack is designed. 

*  Country code strings are as defined by ISO/IEC 3166. This is an optio 

* nal attribute. 

*/
protected String country ;




/**  
* Field heightInUs
* This is the height of the Rack in 'U's. A 'U' is a standard unit of me 

* asure for the height of a Rack or rack-mountable components. It is equ 

* al to 1.75 inches or 4.445 cm. This is an optional attribute. 

*/
protected Integer heightInUs ;




/**  
* Field typeOfRack
* This is an enumerated integer that defines the type of Rack. Values in 

* clude:</br></br> 0: Unknown</br> 1: Standard 19 Inch</br> 2: Telco</br 

* > 3: Equipment Shelf</br> 4: Non-Standard</br></br>This is an optional 

*  attribute.</br> 

*/
protected Integer typeOfRack ;




/**  
* Field chassis
*/
protected List<Chassis> chassis ;


}