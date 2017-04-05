/**
* Logical Role ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA2E102A3-content.html">Logical Role ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity ;

/**
* This is an abstract base class that defines the concept of various typ 
* es of roles that can be associated with LogicalResources. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class LogicalResourceRole extends ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field logicalResourceSpec
*/
protected LogicalResourceSpec logicalResourceSpec ;




/**  
* Field logicalResourceRoleSpec
*/
protected LogicalResourceRoleSpec logicalResourceRoleSpec ;




/**  
* Field logicalResource
*/
protected LogicalResource logicalResource ;




/**  
* Field service
*/
protected List<Service> service ;


}