/**
* Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9430ADC580046-content.html">Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_business_entity ;

/**
* This is an abstract base class that defines the concept of various typ 
* es of roles associated with Resources (both physical and logical) in t 
* he model. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceRole extends EntityRole,Role,RootEntity {



/**  
* Field resourceInteractionRole
*/
protected List<ResourceInteractionRole> resourceInteractionRole ;




/**  
* Field resource
*/
protected Resource resource ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field compoundResourceRole
*/
protected CompoundResourceRole compoundResourceRole ;




/**  
* Field resourceinteractionrole
*/
protected List<ResourceInteractionRole> resourceinteractionrole ;




/**  
* Field specificationRole
*/
protected RoleSpecification specificationRole ;




/**  
* Field involvementRole
*/
protected List<InvolvementRole> involvementRole ;


}