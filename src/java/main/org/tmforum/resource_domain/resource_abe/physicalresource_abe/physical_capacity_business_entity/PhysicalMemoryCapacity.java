/**
* Physical Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA39A0276-content.html">Physical Capacity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_capacity_business_entity ;

/**
* This is a concrete class that defines the type of Memory that can be i 
* nstalled on a ManagedHardware instance, along with its minimum and max 
* imum limits. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Capacity ABE::PhysicalCapacity" href="_3E3F0EC000E93CDD89460086-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Capacity ABE::PhysicalCapacity</a> @since SID_R16.5
*/ 

public  class PhysicalMemoryCapacity extends PhysicalCapacity {



/**  
* Field maximum
* This defines the maximum amount of memory, in Kbytes, that can be supp 

* orted by this ManagedHardware instance. This is an optional attribute. 

*/
protected String maximum ;




/**  
* Field memoryType
* This is an enumerated integer, and defines the type of memory that thi 

* s ManagedHardware object instance can have. Values include:</br></br>  

* O: Unknown</br> 1: DRAM</br> 2: Synchronous DRAM</br> 3: Cache DRAM</b 

* r> 4: RAM</br> 5: SRAM</br> 6: VRAM</br> 7: EDRAM</br> 8: EDO</br> 9:  

* ROM</br> 10: PROM</br> 11: EPROM</br> 12: EEPROM</br> 13: FEPROM</br>  

* 14: CDRAM</br> 15: 3DRAM</br> 16: SDRAM</br> 17: SGRAM</br> 18: RDRAM< 

* /br> 19: Flash</br> 20: DDR</br></br>This is a REQUIRED attribute.</br 

* > 

*/
protected Integer memoryType ;




/**  
* Field minimum
* This defines the minimum amount of memory, in Kbytes, that can be supp 

* orted by this ManagedHardware instance. This is an optional attribute. 

*/
protected String minimum ;


}