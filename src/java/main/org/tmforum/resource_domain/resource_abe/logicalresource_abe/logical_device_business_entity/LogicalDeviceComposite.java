/**
* Logical Device ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CF5E0166-content.html">Logical Device ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_device_business_entity ;

/**
* This is a concrete base class for representing logical concepts and se 
* rvices that can be managed which are associated with the device as a w 
* hole. This class represents a convenient aggregation point for combini 
* ng different aspects of a device (e.g., software contained in the devi 
* ce, protocols that the devices runs, the set of services that it offer 
* s, and so forth). It also enables the device itself to have a single l 
* ogical manifestation.This class represents all logical devices that ar 
* e composite in nature (e.g., made up of multiple distinct logical devi 
* ces that can be separately managed). The composite pattern is used to  
* enable LogicalDeviceComposite objects to be made up of LogicalDevice o 
* bjects (i.e., either LogicalDeviceAtomic and/or LogicalDeviceComposite 
*  objects). 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Device ABE::LogicalDevice" href="_3E3F0EC000E93DCCA5AF007E-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Device ABE::LogicalDevice</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LogicalDeviceComposite extends LogicalDevice,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field logicalDevice
*/
protected List<LogicalDevice> logicalDevice ;


}