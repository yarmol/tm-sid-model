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
* According to ETSI, a VNF is an “implementation of a NetworkFunction th 
* at can be deployed on a Network Function Virtualization Infrastructure 
* ” or in other words for which all the LogicalResources it is being pro 
* vided are hosted by VirtualResources.It is defined as a specialisation 
*  of SoftwareSpecification.It is also a natural extension of the Networ 
* kFunctionSpec artefact which it further extends through the VNFSpecifi 
* cationFurtherDefines association (note the usage of mandatory associat 
* ion to avoid multiple inheritances). 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Specification ABE::SoftwareSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class VNFSpecification extends SoftwareSpecification,SoftwareResourceSpecification,LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field virtualResourceSpec
*/
protected List<VirtualResourceSpec> virtualResourceSpec ;




/**  
* Field networkFunctionSpec
*/
protected NetworkFunctionSpec networkFunctionSpec ;


}