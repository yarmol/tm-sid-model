/**
* Users and Roles ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.yGXR.wE.d0E.eG.cM.fR.d.w6U4D.g-content.html">Users and Roles ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.users_and_roles_business_entity ;

import org.tmforum.resource_domain.resource_abe.logicalresource_abe.logical_role_business_entity.UserNameResourceRole;

import java.util.List;

/**
* A (concrete) base class for the PartyUser and ResourceUser actors enti 
* ties representing the identity of an actor involved in a role, this cl 
* ass can also represent a user which its type (party or resource) is un 
* known. 
 @since SID_R16.5
*/ 

public  class InvolvementIdentification  {



/**  
* Field involvementIdentifictionRole
*/
protected List<InvolvementIdentifictionRole> involvementIdentifictionRole ;




/**  
* Field userNameResourceRole
*/
protected List<UserNameResourceRole> userNameResourceRole ;


}