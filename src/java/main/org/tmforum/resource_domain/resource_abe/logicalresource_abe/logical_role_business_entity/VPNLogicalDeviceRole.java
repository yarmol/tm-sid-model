/**
* Logical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2E102A3-content.html">Logical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity ;

/**
* A VPNRole is the superclass for various types of VPN role classes. For 
*  example, MPLS VPNs will use the CPELogicalDeviceRole, PELogicalDevice 
* Role, and PLogicalDeviceRole subclasses of this class to abstract func 
* tonality required for the CPE, PE, and P roles of an MPLS VPN. Other t 
* ypes of VPNs will use other subclasses of the VPNRole class. The advan 
* tage of this class is that it enables different types of VPN roles to  
* be specified by an MPLSVPNServiceSpecification. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalDeviceRole" href="_3E3F0EC000E93DCCA5AF0075-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalDeviceRole</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole" href="_3E3F0EC000E93DDFD4C100D7-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class VPNLogicalDeviceRole extends LogicalDeviceRole,LogicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {

}