/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* SoftwareCommands describe the sets of features that are programmable b 
* y a particular PartyRole (e.g., a Developer, or NetworkOperator, and i 
* n rare cases, an EndUser).This should not be confused with Capabilitie 
* s. Capabilities define what features and functions are available at a  
* given moment for the Resource. Thus, SoftwareCommands represent the sp 
* ecific commands that are available in a device, whereas Capabilities r 
* epresent higher-level generic functions available in a Resource. For e 
* xampe, the ability to perform BGP routing is a Capability, whereas the 
*  actual commands used to implement BGP routing are SoftwareCommands.  

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareAtomic" href="_3E3F0EC000E93CDE25AD032C-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareAtomic</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software" href="_3E3F0EC000E93CDE25AD031F-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::Software</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource" href="_.t.h.oI.gIYZE.eKS.k.uU.y3K96T.g-content.html">SID Models::Resource Domain::Resource ABE::LogicalResource ABE::Computing and Software ABE::Software Resource and Software ABE::SoftwareResource</a> |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SoftwareCommand extends SoftwareAtomic,Software,SoftwareResource,LogicalResource,Resource,Entity,RootEntity {

}