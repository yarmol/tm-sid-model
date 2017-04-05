/**
* PhysicalResource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA3F70337-content.html">PhysicalResource Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.physicalresource_specification_business_entity ;

/**
* This is an abstract base class that is used to define the invariant ch 
* aracteristics and behavior (attributes, methods, constraints, and rela 
* tionships) of a PhysicalResource. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalResourceSpec extends ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field standardRepresentation
*/
protected List<Representation> standardRepresentation ;




/**  
* Field localLocation
*/
protected List<LocalLocation> localLocation ;




/**  
* Field physicalResourceRole
*/
protected List<PhysicalResourceRole> physicalResourceRole ;




/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field logicalResourceSpec
*/
protected List<LogicalResourceSpec> logicalResourceSpec ;




/**  
* Field pNFSpecification
*/
protected List<PNFSpecification> pNFSpecification ;




/**  
* Field physicalResourceSpecAttributes
*/
protected PhysicalResourceSpecAttributes physicalResourceSpecAttributes ;


}