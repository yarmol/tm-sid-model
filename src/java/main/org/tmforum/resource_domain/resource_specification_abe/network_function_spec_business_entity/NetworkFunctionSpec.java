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
* According to ETSI, a NetworkFunction represents a “Functional Block (F 
* B) within a network infrastructure that has well-defined external inte 
* rfaces and well-defined functional behavior”. In software and systems  
* engineering, an FB defines a system component as a block diagram that  
* describes the characteristics, behavior, and relationships of the syst 
* em component to the rest of the system.A NetworkFunctionSpec is made o 
* f the characteristics and associations which are common to all deploye 
* d instances of the corresponding NetworkFunctions. It is modelled as a 
*  specialization of LogicalResourceSpec.This artefact is to be used to  
* represent the specification of a function independently from the way i 
* t will be deployed (i.e as a VNFSpecification or an EmbeddedNFSpecific 
* ation). 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::LogicalResource Specification ABE::LogicalResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class NetworkFunctionSpec extends LogicalResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field embeddedNFSpecification
*/
protected List<EmbeddedNFSpecification> embeddedNFSpecification ;




/**  
* Field vNFSpecification
*/
protected List<VNFSpecification> vNFSpecification ;


}