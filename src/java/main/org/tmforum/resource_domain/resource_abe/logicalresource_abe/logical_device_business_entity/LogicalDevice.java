/**
* Logical Device ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CF5E0166-content.html">Logical Device ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_device_business_entity ;

/**
* This is an abstract base class for representing logical concepts and s 
* ervices that can be managed that are associated with the device as a w 
* hole. This class represents a convenient aggregation point for combini 
* ng different aspects of a device (e.g., software contained in the devi 
* ce, protocols that the devices runs, the set of services that it offer 
* s, and so forth). It also enables the device itself to have a single l 
* ogical manifestation.Conceptually, this represents the "brains" of the 
*  Device. For example, it represents the set of entities required for a 
*  Router to know how to route packets. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LogicalDevice extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field policyDecisionPoint1
*/
protected PolicyDecisionPoint policyDecisionPoint1 ;




/**  
* Field routedProtocol
*/
protected List<RoutedProtocol> routedProtocol ;




/**  
* Field bridgingProtocol
*/
protected List<BridgingProtocol> bridgingProtocol ;




/**  
* Field distanceVectorRoutingProtocol
*/
protected List<DistanceVectorRoutingProtocol> distanceVectorRoutingProtocol ;




/**  
* Field hybridRoutingProtocol
*/
protected List<HybridRoutingProtocol> hybridRoutingProtocol ;




/**  
* Field linkStateRoutingProtocol
*/
protected List<LinkStateRoutingProtocol> linkStateRoutingProtocol ;




/**  
* Field managementProtocol
*/
protected List<ManagementProtocol> managementProtocol ;




/**  
* Field pathVectorRoutingProtocol
*/
protected List<PathVectorRoutingProtocol> pathVectorRoutingProtocol ;




/**  
* Field switchingProtocol
*/
protected List<SwitchingProtocol> switchingProtocol ;




/**  
* Field configBackupLocation
* This is an enumerated integer, and specifies the following options for 

*  locating the current backup configuration:</br></br> 0 - RAM</br> 1 - 

*  NVRAM</br> 2 - FLASH</br> 3 - On-board memory requiring an external a 

* ccess</br> 4 - Stored in an external network location</br> 

*/
protected Integer configBackupLocation ;




/**  
* Field configRunningLocation
* This is an enumerated integer, and specifies the following options for 

*  locating the current running configuration:</br></br> 0 - RAM</br> 1  

* - NVRAM</br> 2 - FLASH</br> 3 - On-board memory requiring an external  

* access</br> 4 - stored in an external network location</br> 

*/
protected Integer configRunningLocation ;




/**  
* Field configurationMethod
* This is an enumerated integer that defines the type of method(s) that  

* are used to configure this Resource. Defined values include:</br></br> 

*  0: Unknown</br> 1: None Available</br> 2: SNMP</br> 3: CLI</br> 4: CM 

* IP</br> 5: TL1</br> 6: Custom</br></br>This is a REQUIRED attribute.</ 

* br> 

*/
protected String configurationMethod ;




/**  
* Field configurationMode
* This is an enumerated attribute that defines what mode the Resource is 

*  currently in. Note that some manufacturers require the device to be p 

* ut into a particular mode in order to issue specific commands. Values  

* include:</br></br> 0 - not applicable (device doesn't use modes)</br>  

* 1 - User EXEC mode</br> 2 - Privileged EXEC mode</br> 3 - SETUP mode</ 

* br> 4 - Global CONFIG mode</br> 5 - Specific CONFIG SUB-MODE</br> 6 -  

* BOOT mode</br></br>User EXEC mode is a read-only mode in which the use 

* r can view, but not change, the configuration. Privileged EXEC mode su 

* pports access to configuration modes, debugging and testing of command 

* s, and detailed examination of the device and manipulation of its conf 

* ig files. SETUP mode is used to help the user create an initial basic  

* configuration; it is usually interactive. Global configuration mode is 

*  the main configuration driver interface that enables the user to issu 

* e one-line configuration commands. This includes accessing other confi 

* guration modes. Specific Config SUB-MODE is a specific sub-mode that s 

* upports more complex configuration commands that are limted to a parti 

* cular type of function. Finally, BOOT mode is a general-purpose mainte 

* nance mode.</br> 

*/
protected Integer configurationMode ;




/**  
* Field isLoopbackSet
* This is a Boolean attribute that, if TRUE, means that a loopback has b 

* een set. This attribute occurs at the LogicalDevice level, and not at  

* the DeviceInterface level, because the purpose of a LoopbackInterface  

* is to forward traffic received on it directly to the Device itself. Th 

* e LoopbackInterface is a virtual interface and has no hardware associa 

* ted with it. 

*/
protected Boolean isLoopbackSet ;




/**  
* Field isNullInterfaceSet
* This is a Boolean attribute that, if TRUE, means that a null interface 

*  has been set. This attribute occurs at the LogicalDevice level, and n 

* ot at the DeviceInterface level, because the purpose of a NullInterfac 

* e is to drop traffic received on The NullInterface is a virtual interf 

* ace and has no hardware associated with it. 

*/
protected Boolean isNullInterfaceSet ;




/**  
* Field monitorMethod
* This is an enumerated integer that defines the type of method(s) that  

* are used to manage this Resource. Defined values include:</br></br> 0: 

*  Unknown</br> 1: None Available</br> 2: SNMP</br> 3: CLI</br> 4: CMIP< 

* /br> 5: TL1</br> 6: Custom</br></br>This is an optional attribute.</br 

* > 

*/
protected String monitorMethod ;




/**  
* Field numberOfConfigurationsPresent
* This is an integer attribute that defines the total number of configur 

* ations that are stored in this particular Resource (NOT in the managem 

* ent system). 

*/
protected Integer numberOfConfigurationsPresent ;




/**  
* Field protocolsRunning
* This is an array of strings, one for each protocol that is currently r 

* unning on this Resource. 

*/
protected String protocolsRunning ;




/**  
* Field isMultiBootSystem
* The isMultiBootSystem is a Boolean attribute. If its value is TRUE, th 

* en this LogicalDevice can have multiple OperatingSystems running concu 

* rrently. 

*/
protected Boolean isMultiBootSystem ;




/**  
* Field currentRunningOS
* The currentRunningOS is a String Array that defines which OperatingSys 

* tems are currently running. While network devices usually cannot have  

* multiple running OperatingSystems, servers and hosts can. 

*/
protected String currentRunningOS ;




/**  
* Field hasMultipleInstalledOSs
* The hasMultipleInstalledOSs is a Boolean attribute. If its value is TR 

* UE, then this LogicalDevice has multiple OperatingSystems installed. T 

* his doesn't necessarily mean that the LogicalDevice is running multipl 

* e OperatingSystems - that fact is defined by the isMultiBootSystem att 

* ribute having a value of TRUE. Rather, this attribute is used as a sim 

* ple way to know if the device has more than one OperatingSystem instal 

* led. Note that servers, computers and network devices in particular ar 

* e often loaded with multiple OperatingSystems. 

*/
protected Boolean hasMultipleInstalledOSs ;




/**  
* Field deviceInterface
*/
protected List<DeviceInterface> deviceInterface ;




/**  
* Field logicalDeviceComposite
*/
protected LogicalDeviceComposite logicalDeviceComposite ;




/**  
* Field protocol
*/
protected List<Protocol> protocol ;




/**  
* Field pipe
*/
protected List<Pipe> pipe ;




/**  
* Field terminationPoint
*/
protected List<TerminationPoint> terminationPoint ;




/**  
* Field policydecisionpoint
*/
protected PolicyDecisionPoint policydecisionpoint ;


}