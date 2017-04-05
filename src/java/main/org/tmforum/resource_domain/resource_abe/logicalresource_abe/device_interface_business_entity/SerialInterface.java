/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is a concrete class that refines the concept of a DeviceInterface 
*  into a SerialDeviceInterface. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface" href="_3E3F0EC000E93E2F02300056-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::MediaInterface</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SerialInterface extends MediaInterface,DeviceInterface,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field bandwidth
* This defines the bandwidth of this interface. 

*/
protected String bandwidth ;




/**  
* Field clockRate
* This defines the clock rate of a DCE device. If this is a DTE device,  

* then this attribute should be NULL. 

*/
protected String clockRate ;




/**  
* Field isDCE
* This is a Boolean attribute that, if TRUE, defines this as a DCE devic 

* e (i.e., one that supplies a clocking signal). If the value of this at 

* tribute is FALSE, then it is a DTE device (one that uses clocking). 

*/
protected Boolean isDCE ;


}