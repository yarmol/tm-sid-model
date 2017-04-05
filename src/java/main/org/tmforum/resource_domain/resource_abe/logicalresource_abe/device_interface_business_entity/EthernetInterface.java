/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is a concrete class that refines the concept of a DeviceInterface 
*  into a EthernetDeviceInterface. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface" href="_3E3F0EC000E93E2F02300056-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class EthernetInterface extends MediaInterface,DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field duplexSetting
* This is an enumerated integer that specifies whether duplex operation  

* should be used or not. Values include:</br></br> 0: auto-negotiate dup 

* lex speed</br> 1: full-duplex</br> 2: half-duplex</br> 

*/
protected Integer duplexSetting ;




/**  
* Field ethernetCurrentSpeed
* This is an integer attribute that defines the current speed of this Et 

* hernet interface. Note that this may be different than the maximum spe 

* ed of this interface (which is defined in the ethernetSpeed attribute) 

*  because the interface may be rate-limited through software. 

*/
protected Integer ethernetCurrentSpeed ;




/**  
* Field ethernetSpeed
* This is an enumerated integer that defines the type of media that this 

*  device interface can support. Values include:</br></br> 0 - 10M (Ethe 

* rnet)</br> 1 - 100M (FastEthernet, only)</br> 2 - auto-sensing between 

*  10M and 100M</br> 3 - 1000M (Gigabit Ethernet only)</br> 

*/
protected Integer ethernetSpeed ;




/**  
* Field maxEthernetDataSize
* This is an integer attribute that corresponds to the dot1dTpPortMaxInf 

* o variable defined in the Bridge MIB.</br></br>It defines the maximum  

* size of the INFO (non-MAC) field that will be transmitted or received  

* on this interface.</br> 

*/
protected Integer maxEthernetDataSize ;


}