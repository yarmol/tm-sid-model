/**
* Physical Device ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5D1780079-content.html">Physical Device ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_device_business_entity ;

/**
* This is a concrete base class for representing hardware devices that c 
* an be managed that contains no sub-ordinate devices. In other words, t 
* his physical device is a stand-alone physical device.This class repres 
* ents a convenient aggregation point for combining different aspects of 
*  a device (e.g., its physical composition as well as the set of servic 
* es that it offers). It also enables the device itself to have a physic 
* al manifestation. Examples of this class include routers and switches, 
*  computers, and other end-devices that are managed. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Device ABE::PhysicalDevice" href="_3E3F0EC000E93CDAB4C90013-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Device ABE::PhysicalDevice</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalDeviceAtomic extends PhysicalDevice,PhysicalResource,Resource,Entity,RootEntity {

}