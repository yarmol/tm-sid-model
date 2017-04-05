/**
* Auxiliary Component ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3BF10021-content.html">Auxiliary Component ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.auxiliary_component_business_entity ;

/**
* This class represents the capabilities of a generic power supply. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::PhysicalContainer |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PowerSupply extends PhysicalContainer,ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field acFrequencyLow
* This defines the low value of the AC Frequency range in Hertz. If this 

*  is a DC PowerSupply, this value is not applicable and should be set t 

* o NULL.</br></br>This is an optional attribute.</br> 

*/
protected String acFrequencyLow ;




/**  
* Field acFrequencyHigh
* This defines the high value of the AC Frequency range in Hertz. If thi 

* s is a DC PowerSupply, this value is not applicable and should be set  

* to NULL.</br></br>This is an optional attribute.</br> 

*/
protected String acFrequencyHigh ;




/**  
* Field isAC
* This is a Boolean attribute that, if TRUE, signifies this to be an AC  

* PowerSupply. If FALSE, then it is a DC PowerSupply.</br></br>This is a 

*  required attribute.</br> 

*/
protected Boolean isAC ;




/**  
* Field isSwitching
* This is a Boolean attribute that, if TRUE, indicates that this PowerSu 

* pply is a switching (vs linear) PowerSupply.</br></br>This is a requir 

* ed attribute.</br></br></br> 

*/
protected Boolean isSwitching ;




/**  
* Field inputVoltageLow
* This is a string that defines the low value for the Input Voltage Rang 

* e for this PowerSupply.</br></br>This is an optional attribute.</br> 

*/
protected String inputVoltageLow ;




/**  
* Field inputVoltageHigh
* This is a string that defines the high value for the Input Voltage Ran 

* ge for this PowerSupply.</br></br>This is an optional attribute.</br> 

*/
protected String inputVoltageHigh ;




/**  
* Field inputCurrentMax
* This is a string that defines the input current rating in amperes for  

* a fully populated chassis. For a DC PowerSupply, this is the maximum c 

* urrent drawn when operating at the lowest permissible value of its inp 

* ut voltage range. For an AC PowerSupply, the value of this attribute i 

* s the same as the value of the InputCurrentMin attribute.</br></br>Thi 

* s is an optional attribute.</br> 

*/
protected String inputCurrentMax ;




/**  
* Field inputCurrentMin
* This is a string that defines the input current rating in amperes for  

* a fully populated chassis. For a DC PowerSupply, this is the minimum c 

* urrent drawn when operating at the lowest permissible value of its inp 

* ut voltage range. For an AC PowerSupply, the value of this attribute i 

* s the same as the value of the InputCurrentMax attribute.</br></br>Thi 

* s is an optional attribute.</br> 

*/
protected String inputCurrentMin ;




/**  
* Field dcOutputPower
* This is the maximum value of the output power of the DC PowerSupply. I 

* f this is an AC PowerSupply, then this attribute must be set to NULL.< 

* /br></br>This is an optional attribute.</br> 

*/
protected String dcOutputPower ;




/**  
* Field isRedundant
* This is a Boolean attribute that, if TRUE, signifies this PowerSupply  

* as a redundant PowerSupply.</br></br>This is a required attribute.</br 

* > 

*/
protected Boolean isRedundant ;




/**  
* Field equipment
*/
protected Equipment equipment ;


}