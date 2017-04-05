/**
* Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9430ADC580046-content.html">Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_business_entity ;

/**
* A role a business entity (such as PartyRole, ResourceRole or CustomerA 
* ccount) plays in the relationship for a Resource. For example: user, o 
* wner, and so forth. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Users and Roles ABE::InvolvementRole @since SID_R16.5
*/ 

public  class ResourceInvolvementRole extends InvolvementRole {



/**  
* Field resource
*/
protected List<Resource> resource ;


}