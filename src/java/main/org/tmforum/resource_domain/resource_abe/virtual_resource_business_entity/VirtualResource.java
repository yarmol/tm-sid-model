/**
* Virtual Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.iI.a.jYHPZE.eSII8.f.s.sZ.y.cKQ-content.html">Virtual Resource ABE</a> 
* The Virtual Resource ABE contains entities that are used to represent  
* the result of the virtualization within an infrastructure:  an abstrac 
* tion that decouples the physical manifestation and delivery of a Resou 
* rce from its logical operation. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.virtual_resource_business_entity ;

/**
* null 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class VirtualResource extends Resource,Entity,RootEntity {



/**  
* Field networkFunction
*/
protected List<NetworkFunction> networkFunction ;




/**  
* Field logicalResource
*/
protected List<LogicalResource> logicalResource ;




/**  
* Field supportingPR
*/
protected PhysicalResource supportingPR ;


}