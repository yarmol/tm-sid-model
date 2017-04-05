/**
* LogicalResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA0990115-content.html">LogicalResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.LogicalResource entities are sets of entitie 
* s that represent the logical aspects of a Resource. This is important  
* to enable the SID to build a set of reusable managed entities that can 
*  be used to model the logical aspects of different types of Resources. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_business_entity ;

/**
* This class is used to define a set of ManagedPhysicalEntities that mus 
* t be replaced as a unit. This is conceptually a set of FRUs. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Collection |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ReplacementSet extends Collection,RootEntity {



/**  
* Field physicalResource
*/
protected List<PhysicalResource> physicalResource ;


}