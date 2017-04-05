/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* SoftwareFeatureSets describe the groups of SoftwareCommands that disti 
* nguish a particular release of Software. The SoftwareCommands containe 
* d in the SoftwareFeatureSets are programmable by a particular PartyRol 
* e (e.g., a Developer, or NetworkOperator, and in rare cases and EndUse 
* r).Often, SoftwareFeatureSets are used by the manufacturer to define a 
*  custom or semi-custom build of software, or are provided as a set of  
* options that are orderable by the Customer.This should not be confused 
*  with Capabilities. Capabilities define what features and functions ar 
* e available at a given moment for the Resource. Thus, SoftwareFeatureS 
* ets represent groups of commands that are available in a device, where 
* as Capabilities represent higher-level generic functions available in  
* a Resource. For exampe, the ability to perform BGP routing is a Capabi 
* lity, whereas the actual commands used to implement BGP routing are So 
* ftwareCommands that reside in one or more SoftwareFeatureSets. Hence,  
* SoftwareFeatureSets may or may not offer BGP as a programmable feature 
* . 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareComposite" href="_3E3F0EC000E93CDE25AD0330-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareComposite</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software" href="_3E3F0EC000E93CDE25AD031F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource" href="_.t.h.oI.gIYZE.eKS.k.uU.y3K96T.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SoftwareFeatureSets extends SoftwareComposite,Software,SoftwareResource,LogicalResource,Resource,Entity,RootEntity {

}