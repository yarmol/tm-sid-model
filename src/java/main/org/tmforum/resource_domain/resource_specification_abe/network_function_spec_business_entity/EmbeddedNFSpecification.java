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
* An EmbeddedNFSpecification is used to specify the common characteristi 
* cs and associations related to embedded software functions of the same 
*  kind.It is defined as another specialisation of SoftwareSpecification 
* .As for VNFSpecification, it is also a natural extension of the Networ 
* kFunctionSpec artefact which it further extends through the EmbeddedNF 
* SpecificationFurtherDefines association (note the usage of mandatory a 
* ssociation to avoid multiple inheritances). 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Specification ABE::SoftwareSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::Software Resource and Software Specifications ABE::Software Resource Specification ABE::SoftwareResourceSpecification |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class EmbeddedNFSpecification extends SoftwareSpecification,SoftwareResourceSpecification,LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field pNFSpecification
*/
protected List<PNFSpecification> pNFSpecification ;




/**  
* Field networkFunctionSpec
*/
protected NetworkFunctionSpec networkFunctionSpec ;


}