/**
* HolderComposite ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3D3900F5-content.html">HolderComposite ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.equipment_holder_abe.holdercomposite_business_entity ;

/**
* This class is a type of HolderComposite that serves as the parent for  
* the Rack and Chassis classes. This class generalizes common properties 
*  that apply to Racks and Chassis. 

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

public abstract class SecureHolder extends HolderComposite,EquipmentHolder,PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field audibleAlarm
* This is a boolean attribute that, if TRUE, indicates that this SecureH 

* older is equipped with an audible alarm. This is an optional attribute 

* . 

*/
protected Boolean audibleAlarm ;




/**  
* Field audibleAlarmDescription
* This is a free-form string that provides supplementary information for 

*  the AudibleAlarm attribute. It should only be filled in when the valu 

* e of the AudibleAlarm attribute is TRUE. This is an optional attribute 

* . 

*/
protected String audibleAlarmDescription ;




/**  
* Field lockPresent
* This is a boolean attribute that, if TRUE, indicates that this SecureH 

* older is protected by some type of lock. This is an optional attribute 

* . 

*/
protected Boolean lockPresent ;




/**  
* Field securityBreach
* This is an enumerated 16-bit unsigned integer attribute indicating whe 

* ther a breach of the Rack was attempted. Values include:</br></br> 0:  

* Unknown</br> 1: Other</br> 2: No Breach</br> 3: Unsuccessful Breach (b 

* ut attempted)</br> 4: Successful Breach</br></br>This is an optional a 

* ttribute.</br> 

*/
protected Integer securityBreach ;




/**  
* Field securityBreachDescription
* This is a free-form string attribute that provides supplementary infor 

* mation for the SecurityBreach attribute. It should only be filled in w 

* hen the value of SecurityBreach is 1 ("Other").</br></br>This is an op 

* tional attribute.</br> 

*/
protected String securityBreachDescription ;




/**  
* Field visibleAlarm
* This is a boolean attribute that, if TRUE, indicates that the SecureHo 

* lder is equipped with one or more visible alarms (e.g., LEDs or gauges 

* ). This is an optional attribute. 

*/
protected Boolean visibleAlarm ;




/**  
* Field visibleAlarmDescription
* This is a free-form string attribute that provides supplementary infor 

* mation for the VisibleAlarm attribute. It should only be filled in whe 

* n the value of VisibleAlarm is TRUE.</br></br>This is an optional attr 

* ibute.</br> 

*/
protected String visibleAlarmDescription ;


}