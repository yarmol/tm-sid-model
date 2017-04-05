/**
* LogicalResource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C58840228-content.html">LogicalResource Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_business_entity ;

/**
* This is an abstract base class that is used to define the invariant ch 
* aracteristics and behavior (attributes, methods, constraints, and rela 
* tionships) of a LogicalResource. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LogicalResourceSpec extends ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field logicalResourceRole
*/
protected List<LogicalResourceRole> logicalResourceRole ;




/**  
* Field physicalResourceSpec
*/
protected List<PhysicalResourceSpec> physicalResourceSpec ;


}