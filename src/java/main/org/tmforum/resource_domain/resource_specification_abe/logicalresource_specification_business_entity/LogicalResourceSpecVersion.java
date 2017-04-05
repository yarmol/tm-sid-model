/**
* LogicalResource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C58840228-content.html">LogicalResource Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_business_entity ;

/**
* The purpose of this class is to be able to track LogicalResourceSpecif 
* ications separately from other types of ResourceSpecifications. Note t 
* hat this class inherits the modifiesResourceSpec aggregation, and ther 
* efore can be used with the corresponding LogicalResourceSpecification  
* class. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecVersion |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LogicalResourceSpecVersion extends ResourceSpecVersion,Entity,RootEntity {

}