/**
* CompoundResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EF8CA2200A3-content.html">CompoundResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.CompoundResource is a set of entities that s 
* hows how to aggregate PhysicalResources and LogicalResources into aggr 
* egate entities that has physical and logical characteristics and behav 
* ior. This enables designers to represent Resources that have physical  
* and logical characteristics and behavior as a single entity. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.compoundresource_business_entity ;

/**
* A CompoundResourceRole is a role that is defined by the interaction be 
* tween PhysicalResourceRoles and LogicalResourceRoles. There must be at 
*  least one or more PhysicalResourceRoles and one or more LogicalResour 
* ceRoles to form a CompoundResourceRole. However, neither a PhysicalRes 
* ourceRole nor a LogicalResourceRole has to belong to a CompoundResourc 
* eRole. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class CompoundResourceRole extends ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field compoundResourceSpec
*/
protected CompoundResourceSpec compoundResourceSpec ;




/**  
* Field resourceRole
*/
protected ResourceRole resourceRole ;




/**  
* Field compoundResource
*/
protected CompoundResource compoundResource ;




/**  
* Field compoundresourcespec
*/
protected CompoundResourceSpec compoundresourcespec ;


}