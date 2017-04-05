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
* According to ETSI, a PNF is “an implementation of a NetworkFunction vi 
* a a tightly coupled software and hardware system”, or in other words f 
* or which all the LogicalResources it is being provided are hosted dire 
* ctly by PhysicalResources.A PNFSpecification is a CoumpoundResourceSpe 
* c made of the specification of the PhysicalResource(s) and the specifi 
* cation of the embedded software functions as illustrated by the derive 
* d associations “/PNFSpecIsComposedOfPRSpec” and “/PNFSpecIsComposedOfL 
* RSpec”.  

Inheritance tree: |- 
 SID Models::Resource Domain::Resource Specification ABE::CompoundResource Specification ABE::CompoundResourceSpec |- 
 SID Models::Resource Domain::Resource Specification ABE::ResourceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PNFSpecification extends CompoundResourceSpec,ResourceSpecification,EntitySpecification,RootEntity {



/**  
* Field logicalResourceSpec
*/
protected List<EmbeddedNFSpecification> logicalResourceSpec ;




/**  
* Field physicalResourceSpec
*/
protected List<PhysicalResourceSpec> physicalResourceSpec ;


}