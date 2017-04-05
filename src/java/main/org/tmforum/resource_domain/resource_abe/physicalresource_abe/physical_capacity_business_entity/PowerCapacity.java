/**
* Physical Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA39A0276-content.html">Physical Capacity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_capacity_business_entity ;

/**
* This is a concrete class that defines the type of power that a Managed 
* Hardware instance can use, along with its minimum and maximum limits. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Capacity ABE::PhysicalCapacity" href="_3E3F0EC000E93CDD89460086-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Capacity ABE::PhysicalCapacity</a> @since SID_R16.5
*/ 

public  class PowerCapacity extends PhysicalCapacity {



/**  
* Field maxPowerSupplies
* This is an integer that defines the maximum number of power supplies t 

* hat can be installed in the Equipment. This is an optional attribute. 

*/
protected Integer maxPowerSupplies ;




/**  
* Field requirements
* This is a free-form string that defines the recommend power supply con 

* figuration required as a function of how populated the Equipment is. O 

* ften in networking devices, higher-capacity power supplies must be use 

* d in place of lower-capacity ones when the type and/or number of insta 

* lled Cards exceeds a certain number. In addition, in order to have ful 

* ly-redundant power, higher-capacity power supplies must sometimes be u 

* sed, again depending on the type and number of Cards installed. This i 

* s an optional attribute. 

*/
protected String requirements ;




/**  
* Field typeOfPower
* This is an enumerated integer, and defines the type of power that this 

*  ManagedHardware unit can accept. Values are:</br></br> 0: Unknown</br 

* > 1: AC-input</br> 2: DC-input</br> 3: Both AC- and DC-input</br></br> 

* Note that a value of 3 means that the Equipment can mix AC- and DC-inp 

* ut power supplies. This is a REQUIRED attribute.</br> 

*/
protected Integer typeOfPower ;


}