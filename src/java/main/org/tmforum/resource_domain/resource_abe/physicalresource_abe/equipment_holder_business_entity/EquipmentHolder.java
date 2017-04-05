/**
* Equipment Holder ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3CEF038D-content.html">Equipment Holder ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_business_entity ;

/**
* This class is based on the M.3100 specification, and is a base class t 
* hat represents physical objects that are both manageable as well as ab 
* le to host, hold, or contain other physical objects. Examples of physi 
* cal objects that can be represented by instances of this object class  
* are Racks, Chassis, Shelfs, and Slots.The difference between subclasse 
* s of EquipmentHolder (such as a Slot or a Chassis) and subclasses of E 
* quipment that have a Holder role (such as a Card) is that the subclass 
* es of EquipmentHolder are dedicated to holding other Hardware. The sub 
* classes of Equipment that have a holder role have a holding capability 
*  as a secondary capability, usually for expansion. Their primary funct 
* ion, however, is not to hold other objects. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class EquipmentHolder extends PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field type
* This attribute identifies the type of the Holder (e.g., Rack (or Bay), 

*  Shelf, Sub-shelf, Slot, Subslot, Remote-unit or Remote-subslot). 

*/
protected String type ;




/**  
* Field state
* This attribute identifies the state of the Equipment Holder. 

*/
protected HolderState state ;




/**  
* Field manufacturer
* This attribute identifies the Equipment Holder manufacturer name. It i 

* s defined as a non-empty free format string with no semantics. 

*/
protected String manufacturer ;




/**  
* Field location
*/
protected String location ;




/**  
* Field ituArcStateAndStatusList
* See R_TMF518_NRB_I_0001 and R_TMF518_NRB_I_0004. </br>See supporting d 

* ocument SD1-8_encodingX731M3100...\..\Framework\SD\SD1-8_encodingX731M 

* 3100.pdf 

*/
protected ItuArcStateAndStatusList ituArcStateAndStatusList ;




/**  
* Field isReportingAlarms
* This attribute provides an indication of whether alarm reporting for t 

* his Equipment Holder is enabled (true) or disabled (false). 

*/
protected Boolean isReportingAlarms ;




/**  
* Field expectedOrInstalledEquipmentRef
* This attribute identifies the equipment object expected or installed i 

* n the equipment holder, if any. Null if the equipment holder is empty  

* or if it only contains other equipment holders. 

*/
protected ObjectName expectedOrInstalledEquipmentRef ;




/**  
* Field asapRef
* This attribute indicates the assignment of an Alarm Severity Assigneme 

* nt Profile (ASAP) to the EquipmentHolder. 

*/
protected ObjectName asapRef ;




/**  
* Field acceptableEquipmentTypeList
* This attribute identifies the types of equipment that can be supported 

*  by the Equipment Holder. 

*/
protected String acceptableEquipmentTypeList ;




/**  
* Field acceptableEquipmentList
*/
protected String acceptableEquipmentList ;




/**  
* Field typeOfHolder
* This is an enumerated integer that identifies the type of the Holder t 

* hat this object instance is. It is based on M.3100 but includes additi 

* onal values:</br> 0: Unknown</br> 1: Rack</br> 2: Bay</br> 3: Chassis< 

* /br> 4: Shelf</br> 5: Slot</br> 6: Sub-Slot</br> 7: Sub-Rack</br></br> 

* This is a REQUIRED attribute.</br> 

*/
protected Integer typeOfHolder ;




/**  
* Field isSolitaryHolder
* This is a Boolean attribute that, if TRUE, defines this EquipmentHolde 

* r as containing only one ManagedComponent. If this is FALSE, then this 

*  EquipmentHolder contains nested ManagedComponents. This is a REQUIRED 

*  attrinbute. 

*/
protected Boolean isSolitaryHolder ;




/**  
* Field holderStatus
* This attribute, based on M.3100, indicates the status of the Equipment 

* Holder. Values include:</br></br> 0: Unknown</br> 1: Installed And Acc 

* eptable</br> 2: Installed And Not Acceptable</br> 3: Not Installed</br 

* > 4: Mismatch Of Installed and Acceptable</br> 5: Unavailable</br></br 

* >This is an optional attribute.</br></br> 

*/
protected Integer holderStatus ;




/**  
* Field holderComposite
*/
protected HolderComposite holderComposite ;




/**  
* Field equipment
*/
protected List<Equipment> equipment ;




/**  
* Field equipmentComponent
*/
protected List<EquipmentComponent> equipmentComponent ;




/**  
* Field hardware
*/
protected List<Hardware> hardware ;


}