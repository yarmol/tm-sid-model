/**
* Physical Device ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5D1780079-content.html">Physical Device ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_device_business_entity ;

/**
* This is an abstract base class for representing hardware devices that  
* can be managed. This class represents a convenient aggregation point f 
* or combining different aspects of a device (e.g., the cables, connecto 
* rs, cards, power supplies, and other objects that together make up the 
*  device). Thus, it enables the device itself to have a physical manife 
* station (e.g., the "Internet Gateway Router" can be identified as a Ph 
* ysicalDevice). Examples of this class include routers and switches, co 
* mputers, and other end-devices that are managed. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PhysicalDevice extends PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field backplaneIndependent
* This is a boolean attribute that, if TRUE, indicates that this Managed 

* Device has independent backplanes that can be managed separately. This 

*  is an optional attribute. 

*/
protected Boolean backplaneIndependent ;




/**  
* Field backplaneNumber
* This is an integer that defines the number of backplanes that this dev 

* ice has. This is an optional attribute. 

*/
protected Integer backplaneNumber ;




/**  
* Field configurationOrder
* This is a free-form string that provides any order-specific instructio 

* ns for configuring the set of components that together constitute this 

*  PhysicalDevice. This is an optional attribute. 

*/
protected String configurationOrder ;




/**  
* Field deviceGroupID
* This is a string, and is used to uniquely identify this device as a me 

* mber of a group of devices. This is an optional attribute. 

*/
protected String deviceGroupID ;




/**  
* Field isComposite
* This is a Boolean attribute that, if TRUE, means that this physical de 

* vice is in reality made up of a set of physical devices, each of which 

*  can be individually managed. This is an optional attribute. 

*/
protected Boolean isComposite ;




/**  
* Field canMixPower
* This is a Boolean attribute that, if TRUE, means that AC and/or DC pow 

* er supplies can be used in this device. If it is false, then only one  

* or the other can be used. 

*/
protected Boolean canMixPower ;




/**  
* Field physicalDeviceComposite
*/
protected PhysicalDeviceComposite physicalDeviceComposite ;




/**  
* Field hardware
*/
protected List<Hardware> hardware ;




/**  
* Field physicalDeviceRole
*/
protected List<PhysicalDeviceRole> physicalDeviceRole ;


}