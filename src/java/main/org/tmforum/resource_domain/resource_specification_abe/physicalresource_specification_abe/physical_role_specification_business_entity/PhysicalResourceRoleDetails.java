/**
* Physical Role Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E5FF6660315-content.html">Physical Role Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.physicalresource_specification_abe.physical_role_specification_business_entity ;

/**
* This class captures the semantics of the SpecifiesPhysicalResourceRole 
* s aggregation. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalResourceRoleDetails extends Entity {



/**  
* Field typeOfResource
* This is an array of integers that identifies the type of Resource that 

*  this role is targeted to. Each integer value must be unique. The arra 

* y enables expressions such as "All host devices and all routers" to be 

*  built. Values include:</br></br> 0: any physical resource</br> 1: Phy 

* sicalDevices only</br> 2: Hardware only (i.e., components of PhysicalD 

* evices)</br> 3: PhysicalLinks only</br> 4: other resources</br> 

*/
protected String typeOfResource ;


}