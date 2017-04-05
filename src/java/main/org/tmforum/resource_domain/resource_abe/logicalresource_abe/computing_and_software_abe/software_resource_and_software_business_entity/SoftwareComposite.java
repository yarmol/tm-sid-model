/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* This is an abstract class for representing software units that are mad 
* e up of other software units (i.e., instances of this class as well as 
*  the SoftwareAtomic base class). This provides the semantics of collec 
* ting a set of components, each of which is individually manageable, an 
* d being able to manage the set of objects as a whole. An example is an 
*  operating system - this is manageable as a unit, but consists of indi 
* vidually manageable components. This containment is modeled using the  
* ContainsSoftwareComponents composition.From a finite state machine vie 
* w, each SoftwareComposite element is manageable, installable, executab 
* le, and runnable. In addition, each SoftwareComposite element can be a 
*  FRU.This is the super-class for creating concrete subclasses that def 
* ine groups of functionality (e.g., set of features that work together  
* to provide application-level functionality to the end-user). 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software" href="_3E3F0EC000E93CDE25AD031F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource" href="_.t.h.oI.gIYZE.eKS.k.uU.y3K96T.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class SoftwareComposite extends Software,SoftwareResource,LogicalResource,Resource,Entity,RootEntity {



/**  
* Field software
*/
protected List<Software> software ;




/**  
* Field compositeSoftwareSpecification
*/
protected CompositeSoftwareSpecification compositeSoftwareSpecification ;


}