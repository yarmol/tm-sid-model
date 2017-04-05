/**
* Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CCD30232-content.html">Resource Specification ABE</a> 
* The Resource Specification ABE contains entities that define the share 
* d characteristics and behavior of each of the four types of Resource e 
* ntities. This enables multiple instances to be derived from a single s 
* pecification entity. In this derivation, each instance will use the sh 
* ared characteristics and behavior defined in its associated template. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_business_entity ;

/**
* This is the abstract base class for all ResourceRoleSpecification subc 
* lasses. It exists to enable relationships to be defined between it and 
*  other classes in the model. This helps prevent relationship explosion 
* . It is used to define the invariant attributes, methods, relationship 
* s, and constraints of various types of roles associated with Resources 
*  (both physical and logical) in the model. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RoleSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceRoleSpecification extends RoleSpecification,RootEntity {

}