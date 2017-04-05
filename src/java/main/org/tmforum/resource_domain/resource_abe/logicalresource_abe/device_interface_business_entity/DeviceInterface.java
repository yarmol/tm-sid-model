/**
* Device Interface ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C94B202F2-content.html">Device Interface ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.device_interface_business_entity ;

/**
* This is a concrete class that represents the (logical) interface or su 
* b-interface of a device. A DeviceInterface is a concrete class that re 
* presents the (logical) interface or sub-interface of a device. This is 
*  not a transmission entity; rather, DeviceInterfaces are used to progr 
* am Services and LogicalResources on a Device. For example, it is used  
* to program a logical connection from a device to a network medium. Dif 
* ferent types of DeviceInterfaces exist for the different types of netw 
* ork media (e.g., IP vs. ATM) that are used in a network to enable such 
*  media to be programmed. The combination of a LogicalDevice and a Devi 
* ceInterface is what a developer programs to define Services that run o 
* n the device. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class DeviceInterface extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field customerInterfaceNumber
* This is the number of this particular device interface using a naming  

* methodology defined by the Customer. 

*/
protected String customerInterfaceNumber ;




/**  
* Field deviceConfigMethod
* This is an enumerated integer that defines how this interface is to be 

*  configured. Values include:</br></br> 0 - not configured</br> 1 - usi 

* ng the CONSOLE port</br> 2 - using the AUXILIARY port</br> 3 - using a 

*  virtual terminal interface</br> 4 - download through a TFTP server</b 

* r> 5 - download through an FTP server</br> 6 - download through a NMS< 

* /br></br>If the value of this attribute is 3, then the vtyNumber attri 

* bute must be filled in with the particular vty interface that is being 

*  used.</br> 

*/
protected Integer deviceConfigMethod ;




/**  
* Field hasCarrierDetect
* This is a Boolean attribute that, if TRUE, represents that the physica 

* l carrier detect signal has been received. 

*/
protected Boolean hasCarrierDetect ;




/**  
* Field hasDataLink
* This is a Boolean attribute that, if TRUE, represents that the data li 

* nk framing is operational. This is usually triggered by correct operat 

* ion of the line protocol. 

*/
protected Boolean hasDataLink ;




/**  
* Field isInterfaceEnabled
* This is a Boolean attribute that, if TRUE, means that this device is l 

* ogically enabled and can send and receive transmissions. If the value  

* of this attribute is FALSE, then it is disabled and cannot send or rec 

* eive transmissions. 

*/
protected Boolean isInterfaceEnabled ;




/**  
* Field vendorInterfaceNumber
* This is the number of this particular device interface using vendor sp 

* ecific naming. This attribute is required, because this is the how the 

*  vendor refers to this attribute. 

*/
protected String vendorInterfaceNumber ;




/**  
* Field deviceInterfaceRole
*/
protected List<DeviceInterfaceRole> deviceInterfaceRole ;




/**  
* Field lANProtocol
*/
protected List<LANProtocol> lANProtocol ;




/**  
* Field deviceInterface
*/
protected DeviceInterface deviceInterface ;




/**  
* Field deviceInterface0
*/
protected DeviceInterface deviceInterface0 ;




/**  
* Field protocol
*/
protected Protocol protocol ;




/**  
* Field terminationPoint
*/
protected List<TerminationPoint> terminationPoint ;




/**  
* Field physicalPort
*/
protected List<PhysicalPort> physicalPort ;




/**  
* Field bridgingProtocol
*/
protected List<BridgingProtocol> bridgingProtocol ;




/**  
* Field hybridRoutingProtocol
*/
protected List<HybridRoutingProtocol> hybridRoutingProtocol ;




/**  
* Field linkStateRoutingProtocol
*/
protected List<LinkStateRoutingProtocol> linkStateRoutingProtocol ;




/**  
* Field routedProtocol
*/
protected List<RoutedProtocol> routedProtocol ;




/**  
* Field switchingProtocol
*/
protected List<SwitchingProtocol> switchingProtocol ;




/**  
* Field wANProtocol
*/
protected List<WANProtocol> wANProtocol ;




/**  
* Field networkAddress
*/
protected List<NetworkAddress> networkAddress ;




/**  
* Field logicalDevice
*/
protected LogicalDevice logicalDevice ;




/**  
* Field resourceFacingService
*/
protected List<ResourceFacingService> resourceFacingService ;


}