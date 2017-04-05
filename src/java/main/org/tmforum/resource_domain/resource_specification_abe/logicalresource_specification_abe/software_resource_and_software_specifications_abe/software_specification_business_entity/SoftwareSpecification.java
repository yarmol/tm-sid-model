/**
* Software Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_ZVB8EFBSE.eK.n-K55.iA3.mNA-content.html">Software Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_abe.software_resource_and_software_specifications_abe.software_specification_business_entity ;

/**
* A generalization that represents all attributes and associations that  
* are common to Component and CompositeSoftwareSpecifications.  It also  
* reprsents the definition of Software whose attribute values are shared 
*  by every instance of Software related to it. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SoftwareSpecification extends SoftwareResourceSpecification,LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field virtualMemorySpaceTotal
* This defines the virtual memory in amount and units that can be used b 

* y this particular SoftwareSpecification. This is usually the amount of 

*  total RAM plus the amount of paging space. 

*/
protected Integer virtualMemorySpaceTotal ;




/**  
* Field swapSpaceAvailableTotal
* This defines the total swap space available in amount and units. If a  

* SoftwareSpecification doesn't distinguish swap space from space used f 

* or paging files, then the value of this attribute should be 0. 

*/
protected Integer swapSpaceAvailableTotal ;




/**  
* Field processMemorySizeMax
* This defines the maximum memory in amount and units that can be alloca 

* ted to a Process. For a SoftwareSpecification with no virtual memory,  

* this value is typically equal to the total amount of physical Memory m 

* inus memory used by the BIOS and OS. 

*/
protected Quantity processMemorySizeMax ;




/**  
* Field pagingFileSizeTotal
* This defines the total number of storage defined by amount and units i 

* n the paging files for a SoftwareSpecification. If this instance doesn 

* 't support paging files, then the value of this attribute should be 0. 

*/
protected Quantity pagingFileSizeTotal ;




/**  
* Field numUsersMax
* This is a non-negative integer that defines the maximum number of user 

* s for a SoftwareSpecifciation. 

*/
protected Integer numUsersMax ;




/**  
* Field numberProcessActiveTotal
* This is an integer attribute that defines the maximum number of total  

* processes that a SoftwareSpecifciation can support at any given time. 

*/
protected Integer numberProcessActiveTotal ;




/**  
* Field compositeSoftwareSpecification
*/
protected List<CompositeSoftwareSpecification> compositeSoftwareSpecification ;




/**  
* Field compoundResourceSpec2
*/
protected List<CompoundResourceSpec> compoundResourceSpec2 ;




/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;


}