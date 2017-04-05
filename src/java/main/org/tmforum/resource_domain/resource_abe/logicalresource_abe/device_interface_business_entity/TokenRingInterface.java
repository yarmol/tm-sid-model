/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is a concrete class that refines the concept of a DeviceInterface 
*  into a TokenRingDeviceInterface. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface" href="_3E3F0EC000E93E2F02300056-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class TokenRingInterface extends MediaInterface,DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field ringOpenStatus
* This is an integer attribute that indicates the success, or the reason 

*  for failure, of the device's most recent attempt to enter the ring. T 

* his is based on the IEEE's 802.5 Token Ring MIB's dot5RingOpenStatus v 

* ariable. Values include:</br></br> 0: No Open Attempted</br> 1: Bad Pa 

* rameter</br> 2: Lobe Failed</br> 3: Signal Loss</br> 4: Insertion Time 

* out</br> 5: Ring Failed</br> 6: Beaconing</br> 7: Duplicate MAC</br> 8 

* : Request Failed</br> 9: Remove Received</br> 10: Last Open Successful 

* </br> MappingStrings {</br> "MIB.IETF|IEEE 802.5 Token Ring MIB.dot5Ri 

* ngOpenStatus"} </br> 

*/
protected Integer ringOpenStatus ;




/**  
* Field ringStatus
* This is an integer attribute that defines the current status which can 

*  be used to diagnose fluctuating problems that can occur on token ring 

* s, after a station has successfully been added to the ring. These valu 

* es are taken from the IEEE 802.5 Token Ring MIB's dot5RingStatus attri 

* bute. Values include:</br></br> 0: No Problems Detected</br> 32: Ring  

* Recovery</br> 64: Single Station</br> 256: Remove Received</br> 512: R 

* eserved</br> 1024: Auto-Removal Error</br> 2048: Lobe Wire Fault</br>  

* 4096: Transmit Beacon</br> 8192: Soft Error</br> 16384: Hard Error</br 

* > 32768: Signal Loss</br> 131072: No Status</br> 

*/
protected Integer ringStatus ;




/**  
* Field ringState
* This is an integer attribute that defines the state of the current Dev 

* ice with respect to entering or leaving the ring. Its values are taken 

*  from the IEEE 802.5 Token Ring MIB's dot5RingState variable. Values i 

* nclude:</br></br> 0: Opened</br> 1: Closed</br> 2: Opening</br> 3: Clo 

* sing</br> 4: Open Failure</br> 5: Ring Failure</br> 

*/
protected Integer ringState ;




/**  
* Field ringSpeed
* This is an enumerated integer that specifies the ring speed of the Tok 

* enRing network that this device interface is connected to. This inform 

* ation is based on the IEEE 802.5 Token Ring MIB's dot5RingSpeed variab 

* le. Values include:</br></br> 0 - not connected</br> 1 - 1MBPS</br> 2  

* - 4MBPS</br> 3 - 16 MBPS</br> 4 - Other</br> 

*/
protected Integer ringSpeed ;


}