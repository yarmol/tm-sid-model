/**
* Physical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2D603D3-content.html">Physical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity ;

/**
* This is a physical role that a device can play. It enables us to corre 
* late physical components that are used to perform firewall functions w 
* ith the logical capability of acting as a firewall. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalDeviceRole" href="_3E3F0EC000E93DDEBE7903D3-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalDeviceRole</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole" href="_3E3F0EC000E93DDEBE0A02CF-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalFirewallRole extends PhysicalDeviceRole,PhysicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {

}