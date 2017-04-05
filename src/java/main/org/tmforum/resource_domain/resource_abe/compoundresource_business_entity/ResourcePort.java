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
* The ResourcePort class was defined because many of the ITU and IETF sp 
* ecifications refer to a "port", but use this as both a physical as wel 
* l as a logical concept. This will enable the semantics of the ITU and  
* IETF specifications to be correctly mined The ResourcePort class abstr 
* acts the concept of a set of Ports from G.805, and is a type of Resour 
* ceElement that consists only of logical termination points (TrailTermi 
* nationPointSource, TrailTerminationPointSink, and TrailTerminationPoin 
* tBiDirectional, to be precise) and PhysicalPorts. This enables the Res 
* ourcePort to take on the physical and logical characteristics of a "po 
* rt" as defined in G.805. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceElement" href="_3E3F0EC000E93E9C669C0217-content.html">SID Models::Resource Domain::Resource ABE::CompoundResource ABE::ResourceElement</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource" href="_3E3F0EC000E93EA8B3440213-content.html">SID Models::Resource Domain::Resource ABE::CompoundResource ABE::CompoundResource</a> |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ResourcePort extends ResourceElement,CompoundResource,Resource,Entity,RootEntity {



/**  
* Field isEdgeResourcePort
* This is a Boolean attribute. If the value of this attribute is TRUE, t 

* hen this ResourcePort is located at the edge of a Network or SubNetwor 

* k. 

*/
protected Boolean isEdgeResourcePort ;




/**  
* Field terminationPoint
*/
protected TerminationPoint terminationPoint ;




/**  
* Field physicalPort
*/
protected List<PhysicalPort> physicalPort ;


}