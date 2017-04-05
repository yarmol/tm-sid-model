/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

import org.tmforum.resource_domain.resource_business_entity.ResourceRole;

import java.util.List;

/**
* This is the abstract base class for all RoleSpecification subclasses.  
* It exists to enable relationships to be defined between it and other c 
* lasses. This helps prevent relationship explosion. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class RoleSpecification extends RootEntity {



/**  
* Field role
*/
protected List<Role> role ;




/**  
* Field resourceRole
*/
protected List<ResourceRole> resourceRole ;


}