/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* This is an abstract class for representing atomic units of Software th 
* at are individually manageable and do NOT form composite, or nested, s 
* oftware units.From a finite state machine view, each SoftwareAtomic el 
* ement is not just individually manageable, but is also installable, ex 
* ecutable, and runnable. In addition, each SoftwareAtomic element can b 
* e a FRU.This is the super-class for creating concrete subclasses that  
* define particular functionality (e.g., a device driver, or software th 
* at implements MPLS as part of a larger routing software package). 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software" href="_3E3F0EC000E93CDE25AD031F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource" href="_.t.h.oI.gIYZE.eKS.k.uU.y3K96T.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class SoftwareAtomic extends Software,SoftwareResource,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field componentSoftwareSpecification
*/
protected ComponentSoftwareSpecification componentSoftwareSpecification ;


}