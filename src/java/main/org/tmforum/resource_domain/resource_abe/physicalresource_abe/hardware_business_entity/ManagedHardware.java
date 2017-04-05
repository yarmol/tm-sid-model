/**
* Hardware ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3EF2015D-content.html">Hardware ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.hardware_business_entity ;

/**
* This is an abstract base class that adds additional semantics to the H 
* ardware base class. These semantics are used to provide management inf 
* ormation on the hardware. For example, attributes defined by this clas 
* s can provide the administrative and operational state of the entity,  
* and tell whether it has any alarms. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware" href="_3E3F0EC000E93CDAB5F60264-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ManagedHardware extends Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field additionalInfo
* This is a free-form string that is used to contain additional vendor-s 

* pecific information about the managed element., such as a vendor-speci 

* fic asset tracking number or special installation notes. It can also b 

* e used to map vendor-specific naming (e.g., Port 1 is the same as E0/2 

* /1). This can be NULL.</br></br>This is an optional attribute.</br> 

*/
protected String additionalInfo ;




/**  
* Field administrativeState
* This attribute is an enumerated integer that describes the current phy 

* sical state of the ManagedHardware. Values include:</br></br> 0: Unkno 

* wn</br> 1: Unlocked</br> 2: Locked</br> 3: Shutting Down</br> 4: Start 

* ing Up</br> 5: Testing</br> 6: Maintenance</br> 7: Not Applicable</br> 

*  8: Not able to inform</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer administrativeState ;




/**  
* Field physicalAlarmReportingEnabled
* This is a Boolean attribute, and defines whether alarm reporting for t 

* his object instance is enabled or not. TRUE means that reporting is al 

* lowed, and FALSE means that reporting is inhibited.</br></br>Note that 

*  some physical entities are not capable of reporting physical alarms,  

* while some are. For those that are not capable of reporting physical a 

* larms, this value MUST be set to FALSE.</br></br>Remember that this is 

*  for physical alarm reporting. In most cases, there are corresponding  

* logical alarms. The ManagementEntity class hierarchy describes and cor 

* relates these.</br></br>This is a REQUIRED attribute.</br> 

*/
protected Boolean physicalAlarmReportingEnabled ;




/**  
* Field physicalAlarmStatus
* This is an enumerated integer that indicates the occurrence of an abno 

* rmal physical condition relating to an object. This attribute may also 

*  function as a summary indicator of alarm conditions associated with a 

*  specific resource. It is used to indicate the existence of an alarm c 

* ondition, a pending alarm condition such as threshold situations, or ( 

* when used as a summary indicator) the highest severity of active alarm 

*  conditions.</br></br>This attribute expands on the standard ITU seman 

* tics and updates them to include eTOM concepts. Values include:</br></ 

* br> 0: unknown</br> 1: activeReportable-Critical</br> 2: activeReporta 

* ble-Major</br> 3: activeReportable-Minor</br> 4: activeReportable-Inde 

* terminate</br> 5: activeReportable-Warning</br> 6: activePendingDecisi 

* on</br> 7: active-underRepair</br> 8: active-beingReplaced</br> 9: cle 

* ared</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer physicalAlarmStatus ;




/**  
* Field coolingRequirements
* This is a free-form string that specifies the cooling requirements for 

*  this ManagedComponents. Specific cooling information is defined by th 

* e Cooling association. This is an optional attribute. 

*/
protected String coolingRequirements ;




/**  
* Field hardwarePurpose
* This is an enumerated integer that defines the purpose of the ManagedH 

* ardware. Values include:</br></br> 1: Required</br> 2: Optional</br> 3 

* : Redundant</br> 4: Fail-Over</br> 5: Other</br></br>This is an option 

* al attribute.</br> 

*/
protected Integer hardwarePurpose ;




/**  
* Field hardwareRole
*/
protected List<HardwareRole> hardwareRole ;


}