/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* ATM, orr Asynchronous Transfer Mode, is a network technology based on  
* transferring data in cells of a fixed size. The cell used with ATM is  
* relatively small compared to that used with older technologies. In pri 
* nciple, the small, constant cell size allows ATM equipment to transmit 
*  video, audio, and computer data over the same network, and assure tha 
* t no single type of data can dominate network traffic.ATM creates a fi 
* xed route between two points whenever data transfer begins. This diffe 
* rs from TCP/IP, in which messages are divided into packets and each pa 
* cket can take a different route from source to destination. This diffe 
* rence makes it easier to track and bill data usage across an ATM netwo 
* rk, but it makes it less adaptable to sudden surges in network traffic 
* . 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface" href="_3E3F0EC000E93E2F02300056-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ATMInterface extends MediaInterface,DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field bitRateType
* This is an enumerated integer, and defines the transmission philosophy 

*  used. Values include:</br></br> 0: not yet configured</br> 1: constan 

* t bit rate (CBR)</br> 2: variable bit rate (VBR)</br> 3: available bit 

*  rate (ABR)</br> 4: unspecified bit rate (UBR)</br></br>CBR specifies  

* a fixed bit rate so that data is sent in a steady stream. This is anal 

* ogous to a leased line. </br></br>VBR provides a specified throughput  

* capacity but data is not sent evenly. This is often used for voice and 

*  video data.</br></br>ABR provides a guaranteed minimum capacity but a 

* llows data to be bursted at higher capacities when the network is free 

* .</br></br>UBR does not guarantee any throughput levels. This is used  

* for applications, such as file transfer, that can tolerate delays.</br 

* > 

*/
protected Integer bitRateType ;


}