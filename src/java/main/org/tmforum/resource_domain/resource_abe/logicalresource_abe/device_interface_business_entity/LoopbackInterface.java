/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* A LoopbackInterface is a virtual interface. Traffic sent to the Loopba 
* ckInterface is forwarded to the Device itself for further processing.A 
*  LoopbackInterface is commonly used to guarantee reachability in netwo 
* rks with multiple paths. it is also used to test IP software without w 
* orrying about broken or corrupted drivers or hardware.  

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::LogicalInterface" href="_3E3F0EC000E93E2F023600F6-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::LogicalInterface</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface" href="_3E3F0EC000E93E0686B101A4-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Device Interface ABE::DeviceInterface</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LoopbackInterface extends LogicalInterface,DeviceInterface,LogicalResource,Resource,Entity,RootEntity {

}