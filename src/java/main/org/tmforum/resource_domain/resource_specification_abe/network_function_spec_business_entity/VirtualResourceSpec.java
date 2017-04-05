/**
* Network Function Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_ZCI-EAMOE.e.aYMZTO.w.dO.v.oQ-content.html">Network Function Spec ABE</a> 
* The Network Function Spec ABE contains all entities used to describe i 
* nvariant characteristics and associations of Network Functions and the 
*  different ways it can be deployed (i.e. in physical boxes or in virtu 
* al infrastructure). 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.network_function_spec_business_entity ;

/**
* A VirtualResourceSpec is used to represent the common characteristics  
* and associations of resources in the NFV Infrastructure (e.g. compute, 
*  storage, network) to be considered when allocating NFV Resources for  
* the proper execution of the corresponding VNF. It is relevant in assoc 
* iation with VNFSpecifications through the derived association “/VNFSpe 
* cRequires”. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class VirtualResourceSpec extends LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field vNFSpecification
*/
protected List<VNFSpecification> vNFSpecification ;


}