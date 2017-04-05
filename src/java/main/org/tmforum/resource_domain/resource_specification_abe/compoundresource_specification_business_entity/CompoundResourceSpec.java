/**
* CompoundResource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EFFA04800A2-content.html">CompoundResource Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.compoundresource_specification_business_entity ;

/**
* This is the abstract base class that is used to define the invariant c 
* haracteristics and behavior (attributes, methods, constraints, and rel 
* ationships) of a CompoundResource.The key difference between a Compoun 
* dResourceSpec and either a PhysicalResourceSpec and a LogicalResourceS 
* pec is that a PhysicalResourceSpec and LogicalResourceSpec define temp 
* lates for specifying the invariant characteristics and behavior of Phy 
* sicalResources and LogicalResources, respectively. In contrast, a Comp 
* oundResourceSpec is used to describe templates that contain at least o 
* ne PhysicalResourceSpec and at least one LogicalResourceSpec. Optional 
* ly, one or more CompoundResourceSpecs may also be specified.Thus, a Co 
* mpoundResourceSpec is in effect a "shorthand notation" for specifying  
* complementary PhysicalResourceSpecs and LogicalResourceSpecs. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class CompoundResourceSpec extends ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;




/**  
* Field compoundResourceRole
*/
protected List<CompoundResourceRole> compoundResourceRole ;




/**  
* Field softwareSpecification2
*/
protected List<SoftwareSpecification> softwareSpecification2 ;


}