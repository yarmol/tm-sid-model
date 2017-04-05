/**
* Logical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2E102A3-content.html">Logical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity ;

/**
* This class abstracts the different routing capabilities necessary for  
* a LogicalDevice to have. This helps simplify the modeling of (especial 
* ly) network devices, which have many different sets of capabilities. F 
* or example, most routers can do routing, forwarding, and firewalling o 
* f traffic. By modeling these capabilities as three roles, router funct 
* ionality is both abstracted as well as categorized, so that the differ 
* ences between routing done by a router and routing done by a L3 switch 
*  can be differentiated. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalDeviceRole" href="_3E3F0EC000E93DCCA5AF0075-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalDeviceRole</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole" href="_3E3F0EC000E93DDFD4C100D7-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class RoutingRole extends LogicalDeviceRole,LogicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {

}