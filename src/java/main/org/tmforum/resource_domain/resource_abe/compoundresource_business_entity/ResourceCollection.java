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
* null 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource" href="_3E3F0EC000E93EA8B3440213-content.html">SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource</a> |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceCollection extends CompoundResource,Resource,Entity,RootEntity {



/**  
* Field compoundResource
*/
protected CompoundResource compoundResource ;


}