/**
* Equipment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3E30001E-content.html">Equipment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_business_entity ;

/**
* This is based on the DEN Card class. It is defined as follows:This cla 
* ss represents a type of physical container that can be plugged into a  
* Slot. It may represent a primary function (e.g., a networking card) or 
*  an auxiliary function (e.g., a memory card) that supports another car 
* d. All objects of this type are capable of carrying electrical and/or  
* optical signals. They also provide a mounting point for other types of 
*  ManagedePhysicalElements, such as Chips or Cards. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Equipment" href="_3E3F0EC000E93CDAFB610004-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Equipment ABE::Equipment</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Card extends Equipment,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field cardCompatibilityResults
* This is an attribute that is used to store the result of the negotiati 

* on process between a Card and its EquipmentHolder to see if they are c 

* ompatible. This is the result of the isCompatible() method, with the C 

* ard being the source and the EquipmentHolder being the target, transla 

* ted into a textual description. 

*/
protected String cardCompatibilityResults ;




/**  
* Field daughterCardInstallStatus
* This is an enumerated integer that defines the current installation st 

* atus of this Card's daughter Cards. Note that this defines the status  

* of daughter Cards as viewed by the hosting Card. Status values of indi 

* vidual daughter Cards are defined by attributes in the daughter card i 

* tself. Values include:</br></br> 0: Not Applicable (doesn't have any D 

* aughterCards)</br> 1: All Daughter Cards are installed</br> 2: Some Da 

* ughter Cards are installed</br> 3: No Daughter Cards are installed</br 

* > 

*/
protected Integer daughterCardInstallStatus ;




/**  
* Field daughterCardOperatingStatus
* This is an enumerated integer that defines the current operating statu 

* s of this Card's daughter Cards. Note that this defines the operating  

* status of daughter Cards as viewed by the hosting Card. Status values  

* of individual daughter Cards are defined by attributes in the daughter 

*  card itself. </br></br>This attribute only defines the physical opera 

* ting characteristics of the daughter card. It does not say whether the 

*  daughter Card is functioning correctly, as that is a logical attribut 

* e.</br></br>Values include:</br></br> 0: Not Applicable (doesn't have  

* any DaughterCards)</br> 1: All Daughter Cards are operating correctly< 

* /br> 2: Some Daughter Cards are operating incorrectly</br> 3: No Daugh 

* ter Cards are operating correctly</br> 

*/
protected Integer daughterCardOperatingStatus ;




/**  
* Field daughterCardRequirements
* This is an enumerated integer that defines the relationship between th 

* is Card and all DaughterCards. Values include:</br></br> 1: No Daughte 

* rCard can be attached</br> 2: Requires 1 or more DaughterCards to func 

* tion correctly</br> 3: Can optionally use 1 or more DaughterCards</br> 

*/
protected Integer daughterCardRequirements ;




/**  
* Field isConfigurablePhysically
* This is a boolean attribute that, if TRUE, indicates that this Card ha 

* s one or more options that can be physically configured. Each of these 

*  options has a distinct physical manifestation (e.g., additional memor 

* y, or faster CPU) that usually (but not always) results in occupying m 

* ore room in the Card. 

*/
protected Boolean isConfigurablePhysically ;




/**  
* Field isMotherBoard
* This is a Boolean attribute that, if TRUE, defines this Card as either 

*  a motherboard or another type of hosting board. When FALSE, it isn't. 

*/
protected Boolean isMotherBoard ;




/**  
* Field isUniquePhysical
* This is a boolean attribute that, if TRUE, defines this Card to be phy 

* sically different from other Cards of the same type and therefore requ 

* ires a special slot. The unique aspects of this Card are described in  

* the UniqueRequirementsPhysical attribute. An example might be a differ 

* ent form factor than other Cards of its type, or the ability to set ju 

* mpers on the Card to control its functionality (e.g., clocking). 

*/
protected Boolean isUniquePhysical ;




/**  
* Field maxDataWidth
* This is an integer that defines the maximum bus width of this Card. Va 

* lues include:</br></br> 0: Unknown</br> 1: Special</br> 8: 8 bit data  

* bus</br> 16: 16 bit data bus</br> 24: 24 bit data bus</br> 32: 32 bit  

* data bus</br> 64: 64 bit data bus</br> 128: 128 bit data bus</br></br> 

* The value "1" can be used for any non-standard data bus width.</br> 

*/
protected Integer maxDataWidth ;




/**  
* Field slotLayout
* This is a free-form string that describes the positioning, spacing, ty 

* pical usage, restrictions, and any other pertinent information that de 

* fines how the Card is to be positioned into the Slot. 

*/
protected String slotLayout ;




/**  
* Field slotsRequired
* This is an integer that defines the number of slots required to hold t 

* his Card. Since this is usually 1, that value is assigned as its defau 

* lt value. 

*/
protected Integer slotsRequired ;




/**  
* Field uniqueRequirementsPhysical
* This is a free-form string that contains the physically unique require 

* ments of this Card. For example, it must go in a certain slot number b 

* ecause it has special dimensions. This attribute should only be filled 

*  in if the value of the IsUniquePhysical attribute is TRUE; otherwise, 

*  it should be NULL. 

*/
protected String uniqueRequirementsPhysical ;




/**  
* Field hardwareVersion
* This is a string attribute that contains the hardware version number o 

* f this Card. 

*/
protected String hardwareVersion ;




/**  
* Field card
*/
protected List<Card> card ;




/**  
* Field card1
*/
protected Card card1 ;




/**  
* Field physicalPort
*/
protected List<PhysicalPort> physicalPort ;


}