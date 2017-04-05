/**
* Physical Device ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5D1780079-content.html">Physical Device ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_device_business_entity ;

/**
* This is a concrete base class for representing hardware devices that c 
* an be managed that contains one or more sub-ordinate devices. In other 
*  words, this physical device is not a stand-alone physical device; rat 
* her, it represents an aggregation of physical devices. Each physical d 
* evice in this aggregation can be managed.This class represents a conve 
* nient aggregation point for combining different aspects of a device (e 
* .g., its physical composition as well as the set of services that it o 
* ffers). It also enables the device itself to have a physical manifesta 
* tion. Examples of this class include routers and switches, computers,  
* and other end-devices that are managed. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Device ABE::PhysicalDevice" href="_3E3F0EC000E93CDAB4C90013-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Device ABE::PhysicalDevice</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalDeviceComposite extends PhysicalDevice,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field numberOfDevicesTotal
* This attribute defines the total number of PhysicalDevices aggregated  

* by this PhysicalDeviceComposite object. Note that this aggregation is  

* for that particular level of aggregation. Thus, if a PhysicalDeviceCom 

* posite, called A, contains another PhysicalDeviceComposite, called B,  

* then B's instance of this attribute will define how many PhysicalDevic 

* es are aggregated by B, whereas A's instance of this attribute will de 

* fined how many PhysicalDevices are aggregated by A (which includes tho 

* se aggregated by B). 

*/
protected Integer numberOfDevicesTotal ;




/**  
* Field numberOfDevicesCurrent
* This attribute defines the current number of PhysicalDevices aggregate 

* d by this PhysicalDeviceComposite object that are active and manageabl 

* e.</br></br>Note that this aggregation is for that particular level of 

*  aggregation. Thus, if a PhysicalDeviceComposite, called A, contains a 

* nother PhysicalDeviceComposite, called B, then B's instance of this at 

* tribute will define how many PhysicalDevices are aggregated by B, wher 

* eas A's instance of this attribute will defined how many PhysicalDevic 

* es are aggregated by A (which includes those aggregated by B).</br> 

*/
protected Integer numberOfDevicesCurrent ;




/**  
* Field physicalDevice
*/
protected List<PhysicalDevice> physicalDevice ;


}