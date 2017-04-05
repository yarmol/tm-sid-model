/**
* HolderComposite ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3D3900F5-content.html">HolderComposite ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_abe.holdercomposite_business_entity ;

/**
* This class represents EquipmentHolders that are made up of other Equip 
* mentHolders (i.e., instances of this class as well as the HolderAtomic 
*  base class). This provides the semantics of collecting a set of compo 
* nents, each of which is individually manageable, and being able to man 
* age the set of objects as a whole. This containment is modeled using t 
* he HasHolders aggregation.Each HolderComposite element can be a FRU.A  
* characteristic of this class is that its subclasses are physical objec 
* ts that have complex cabling and mounting options. This class is meant 
*  to differentiate complex holders, like a Chassis, from simple holders 
* , like a Slot. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment Holder ABE::EquipmentHolder |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class HolderComposite extends EquipmentHolder,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field cableManagementStrategy
* This is a free-form string that contains information on how the variou 

* s cables contained in the Chassis, Rack, or other type of HolderCompos 

* ite object are connected and bundled. This property contains informati 

* on to aid in the assembly and service of the cables contained in a Sec 

* ureHolder object. This is an optional attribute. 

*/
protected String cableManagementStrategy ;




/**  
* Field mountingOptions
* This is an enumerated 16-bit unsigned integer that defines how Equipme 

* nt in this entity is mounted. Values include:</br></br> 0: Unknown</br 

* > 1: Stand-alone</br> 2: Rack-mounted, free access</br> 3: Rack-mounte 

* d, restricted access</br> 4: Enclosed in another chassis</br></br>This 

*  is an optional attribute.</br> 

*/
protected Integer mountingOptions ;




/**  
* Field serviceApproach
* This is an enumerated, integer-valued array that defines how this enti 

* ty is serviced (e.g., from the top or front), whether it has sliding t 

* rays or removable sides, and/or whether the Frame is moveable (e.g., i 

* t has rollers). Values include:</br></br> 0: Unknown</br> 1: Custom</b 

* r> 2: Service From Top</br> 3: Service From Front</br> 4: Service From 

*  Back</br> 5: Service From Side</br> 6: Sliding Trays</br> 7: Removabl 

* e Sides</br> 8: Moveable</br></br>This is an optional attribute.</br> 

*/
protected String serviceApproach ;




/**  
* Field equipmentHolder
*/
protected List<EquipmentHolder> equipmentHolder ;


}