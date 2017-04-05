/**
* Software Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_ZVB8EFBSE.eK.n-K55.iA3.mNA-content.html">Software Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.logicalresource_specification_abe.software_resource_and_software_specifications_abe.software_specification_business_entity ;

/**
* A type of SoftwareSpecification that does not have any subordinate Sof 
* twareSpecifications, that is, an ComponentSoftwareSpecification is a l 
* eaf-level SoftwareSpecification. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Specification ABE::SoftwareSpecification" href="_.p5DIAFBSE.eK.n-K55.iA3.mNA-content.html">SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Specification ABE::SoftwareSpecification</a> |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class ComponentSoftwareSpecification extends SoftwareSpecification,SoftwareResourceSpecification,LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field softwareAtomic
*/
protected List<SoftwareAtomic> softwareAtomic ;


}