/**
* Physical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2D603D3-content.html">Physical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.physical_role_business_entity ;

/**
* This is an abstract base class that defines the different types of phy 
* sical roles that a PhysicalDevice can take on. This enables us to corr 
* elate different logical roles to physical hardware. For example, the l 
* ogical capability of encryption may need dedicated physical hardware.  
* The PhysicalDeviceRole Encryption enables us to model this dependency. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole" href="_3E3F0EC000E93DDEBE0A02CF-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Physical Role ABE::PhysicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PhysicalDeviceRole extends PhysicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field physicalDeviceRoleSpec
*/
protected PhysicalDeviceRoleSpec physicalDeviceRoleSpec ;




/**  
* Field logicalDeviceRole
*/
protected List<LogicalDeviceRole> logicalDeviceRole ;




/**  
* Field physicalDevice
*/
protected PhysicalDevice physicalDevice ;


}