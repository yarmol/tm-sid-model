/**
* Users and Roles ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.yGXR.wE.d0E.eG.cM.fR.d.w6U4D.g-content.html">Users and Roles ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.users_and_roles_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.customer_domain.customer_business_entity.CustomerAccount;
import org.tmforum.engaged_party_domain.additional_party_entities_business_entity.PartyAccount;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;
import org.tmforum.resource_domain.resource_business_entity.ResourceRole;

/**
* An abstract base class for all more specific classes representing asso 
* ciations of involvement type such as ProductInvolvemenRole. ServiceInv 
* olvementRole and ProductInvolvementRole  
 @since SID_R16.5
*/ 

public  class InvolvementRole  {



/**  
* Field resourceRole
*/
protected ResourceRole resourceRole ;




/**  
* Field involvementRole
* A part a business entity plays in its involvement with a product, serv 

* ice or resource 

*/
protected String involvementRole ;




/**  
* Field validFor
* The period of time during which the business participant is involved w 

* ith the product. 

*/
protected TimePeriod validFor ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field involvementIdentifictionRole
*/
protected InvolvementIdentifictionRole involvementIdentifictionRole ;




/**  
* Field customerAccount
*/
protected CustomerAccount customerAccount ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;


}