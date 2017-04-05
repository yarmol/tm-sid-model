/**
* Logical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2E102A3-content.html">Logical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity ;

/**
* UserNameResourceRole represents the role of a logical resource as user 
*  name in a system. User names can be managed in a dedicated specific p 
* ool or can be shared with other resource pools in which case phone num 
* ber or email address can also be used as user names in the system.  

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole" href="_3E3F0EC000E93DDFD4C100D7-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Logical Role ABE::LogicalResourceRole</a> |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class UserNameResourceRole extends LogicalResourceRole,ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field involvementIdentification
*/
protected InvolvementIdentification involvementIdentification ;


}