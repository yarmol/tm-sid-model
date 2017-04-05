/**
* Equipment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3E30001E-content.html">Equipment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_business_entity ;

/**
* This class is based on the m.3100 specification, and is described as f 
* ollows:The Equipment object class is a class of managed objects that r 
* epresents physical components of a managed device, including replaceab 
* le components. An instance of this object class must be present in onl 
* y a single geographic location. An Equipment object may be nested with 
* in another Equipment object, thereby creating a containment relationsh 
* ip. The Equipment type shall be identified by sub-classing this object 
*  class. Either the name of the sub-class or an attribute may be used f 
* or identifying the equipment type.Changed name of m.3100 attribute Ala 
* rmReportingIndicator to AlarmStatus, and enhanced semantics.The m.3100 
*  SystemTitle attribute is NOT implemented in this class, we're using C 
* ommonName instead.We don't support the m.3100 supportedByObjectList at 
* tribute. This attribute is intended to list a set of physical and logi 
* cal objects that directly affect this object. We think that the model  
* should show this via associations, not via an embedded attribute. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Equipment extends PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field resourceFulfillmentState
* This attribute supports basic administration of plug-ins. 

*/
protected ResourceFulfillmentState resourceFulfillmentState ;




/**  
* Field protectionSchemeState
* This attribute identifies the individual lock of this equipment. In ca 

* se the equipment is not protected, the value "UNKNOWN" shall also be u 

* sed. 

*/
protected ProtectionSchemeState protectionSchemeState ;




/**  
* Field protectionRole
* This attribute defines the protection role that this equipment plays.  

* In case the equipment is not protected, the value "NOT_APPLICABLE" sha 

* ll be used. 

*/
protected ProtectionRole protectionRole ;




/**  
* Field manufacturer
* This attribute identifies the equipment manufacturer name. It is defin 

* ed as a non-empty free format string with no semantics. 

*/
protected String manufacturer ;




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

* his Equipment is enabled (true) or disabled (false). 

*/
protected Boolean isReportingAlarms ;




/**  
* Field installedVersion
* This attribute identifies the vendor's resource version of the install 

* ed equipment. 

*/
protected String installedVersion ;




/**  
* Field installedSerialNumber
* This attribute contains the vendor's serial number of the installed eq 

* uipment. Unique, if no default is provided. At least one serial number 

*  has to be provided. 

*/
protected String installedSerialNumber ;




/**  
* Field installedPartNumber
* This attribute identifies the vendor's resource Part Number (PN) of th 

* e installed equipment. If PN is not available empty string shall be us 

* ed. If the part and serial number are both non-null then the part+seri 

* al number together shall be unique. 

*/
protected String installedPartNumber ;




/**  
* Field installedEquipmentObjectType
* This attribute identifies the type of the installed resource. For exam 

* ple, "Fan" or "STM16" for the Equipment class and "Line Shelf" for the 

*  Equipment Holder class.) The installed equipment type is invariant fo 

* r the lifetime of the hardware. This is an empty string if there is no 

*  expected equipment. 

*/
protected String installedEquipmentObjectType ;




/**  
* Field expectedEquipmentObjectType
* This attribute identifies the type of the expected resource. For examp 

* le, "Fan" or "STM16" for the Equipment class and "Line Shelf" for the  

* Equipment Holder class.) This is an empty string if there is no expect 

* ed equipment. 

*/
protected String expectedEquipmentObjectType ;




/**  
* Field coolingDevice
*/
protected List<CoolingDevice> coolingDevice ;




/**  
* Field installStatus
* This is an m.3100 attribute that represents the availability of the ty 

* pe of Equipment that this object represents. Its semantics are as foll 

* ows.</br></br>The attribute availability status is used to indicate wh 

* ether the correct physical piece of equipment (in m.3100, it is called 

*  a "circuit pack") is isntalled or not. This is a set valued attribute 

*  and includes the values notInstalled and empty. If the type of the in 

* serted physical circuit pack matches the value of the circuitPackType  

* attribute (relating to the circuitPack instance) then the value of the 

*  availabilityStatus is an empty set. Otherwise, the value of the avail 

* abilityStatus attribute is notInstalled even if it is one of the accep 

* table circuit pack type</br></br>This is implemented as an enumerated  

* integer. The values will include at least the following:</br></br> 0:  

* Unknown</br> 1: Operational (installed and matches expected type)</br> 

*  2: Installed (buit does not match expected type)</br> 3: Not Installe 

* d</br> 4: In Maintenance</br> 5: Failed</br> 6: Not operational</br></ 

* br>This is an optional attribute.</br> 

*/
protected Integer installStatus ;




/**  
* Field expectedEquipmentType
* This attribute identifies the type of the expected resource. For examp 

* le, "Fan" or "STM16" for the Equipment class and "Line Shelf" for the  

* Equipment Holder class. This is an empty string if there is no expecte 

* d equipment. This is an optional attribute.</br> 

*/
protected String expectedEquipmentType ;




/**  
* Field installedEquipmentType
* This attribute identifies the type of the installed resource. For exam 

* ple, "Fan" or "STM16" for the Equipment class and "Line Shelf" for the 

*  Equipment Holder class. The installed equipment type is invariant for 

*  the lifetime of the hardware. This is an empty string if there is no  

* installed equipment. This is an optional attribute.</br> 

*/
protected String installedEquipmentType ;




/**  
* Field redundancy
* This is an enumerated integer that describes the redundancy capabiliti 

* es of this particular Equipment. Values include:</br></br> 0: Unknown< 

* /br> 1: Primary (supported by a Redundant Equipment)</br> 2: Redundant 

*  (supports a Primary Equipment)</br> 3: Stand-alone (no Redundancy pos 

* sible)</br></br>This is an optional attribute.</br> 

*/
protected Integer redundancy ;




/**  
* Field equipment
*/
protected List<Equipment> equipment ;




/**  
* Field equipment1
*/
protected Equipment equipment1 ;




/**  
* Field powerSupply
*/
protected List<PowerSupply> powerSupply ;




/**  
* Field equipmentHolder
*/
protected EquipmentHolder equipmentHolder ;




/**  
* Field equipmentComponent
*/
protected List<EquipmentComponent> equipmentComponent ;




/**  
* Field asapRef
*/
protected ObjectName asapRef ;




/**  
* Field supportingEquipment
*/
protected List<Equipment> supportingEquipment ;




/**  
* Field supportedEquipment
*/
protected List<Equipment> supportedEquipment ;




/**  
* Field physicalTerminationPoint
*/
protected List<PhysicalTerminationPoint> physicalTerminationPoint ;


}