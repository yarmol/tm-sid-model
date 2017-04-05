/**
* Logical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2E102A3-content.html">Logical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity ;

/**
* This is a base class for representing different types of roles that ca 
* n be associated with a particular DeviceInterface. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole" href="_3E3F0EC000E93DDFD4C100D7-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class DeviceInterfaceRole extends LogicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field deviceInterface
*/
protected DeviceInterface deviceInterface ;




/**  
* Field logicalDeviceRole
*/
protected List<LogicalDeviceRole> logicalDeviceRole ;


}