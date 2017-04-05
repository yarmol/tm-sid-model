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
* A ResourceElement is an entity that is individually manageable. It is  
* an aggregate entity consisting of both physical and logical aspects of 
*  a managed resource. For example, a Router is a ResourceElement. Diffe 
* rent PhysicalResource objects can model the physical aspects of the Ro 
* uter in detail (e.g., its Cards, the number and type of PhysicalPorts  
* that are on each Card, and so forth), and different LogicalResource ob 
* jects can model the logical aspects of the Router in detail (e.g., wha 
* t Software it is running, how many DeviceInterfaces of what type are c 
* urrently enabled, if there are any outstanding Faults or Alarms, and s 
* o forth). ReourceElement aggregates all PhysicalResource and LogicalRe 
* source objects, enabling a high-level view of the physical and logical 
*  aspects of the Resource to be provided. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource" href="_3E3F0EC000E93EA8B3440213-content.html">SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource</a> |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceElement extends CompoundResource,Resource,Entity,RootEntity {



/**  
* Field software
*/
protected List<Software> software ;


}