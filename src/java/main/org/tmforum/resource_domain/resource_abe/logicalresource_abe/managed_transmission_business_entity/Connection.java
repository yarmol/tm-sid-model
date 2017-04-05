/**
* Managed Transmission ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3124017F-content.html">Managed Transmission ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.managed_transmission_business_entity ;

/**
* This is a class of managed objects responsible for the transparent tra 
* nsfer of information between ConnectionTerminationPoints. A Connection 
*  is a component of a Trail.Several connections can be bundled into a h 
* igher rate trail. A sequence of one or more Connections are linked tog 
* ether to form a Trail. A Connection may be either uni- or bi-direction 
* al.This object is taken from M.3100.  

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Pipe" href="_3E3F0EC000E93CDDC88D0153-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::Pipe</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity" href="_3E3F0EC000E93CDDC021028F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Managed Transmission ABE::ManagedTransmissionEntity</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class Connection extends Pipe,ManagedTransmissionEntity,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field trail
*/
protected Trail trail ;


}