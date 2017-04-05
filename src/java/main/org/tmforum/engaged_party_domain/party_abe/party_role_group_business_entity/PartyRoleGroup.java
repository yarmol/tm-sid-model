/**
* Party Role Group ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.j.sY.zYK.pIE.e.a9.x.aO.u9AAIX.g-content.html">Party Role Group ABE</a> 
* Party Role Group ABE contains all Business Entities used to specify Pa 
* rtyRoleGroups. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_group_business_entity ;

/**
* Parties may play PartyRoles in a specific context. This context is rep 
* resented by a PartyRoleGroup that groups PartyRoles. A PartyRoleGroup  
* might be a Family, a Club, a Friends' group...A PartyRoleGroup may or  
* may not represent an Organization that has a legal standing or not, me 
* aning they may not have a formal means to identify them (think Faceboo 
* k groups).A PartyRoleGroup is described by a unique PartyRoleGroupSpec 
* ification. 
 @since SID_R16.5
*/ 

public  class PartyRoleGroup  {



/**  
* Field partyRoleGroupId
* Unique identifier for PartyRolesGroup 

*/
protected String partyRoleGroupId ;




/**  
* Field name
* A word, term, or phrase by which the PartyRoleGroup is known and disti 

* nguished from other PartyRoleGroups. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the PartyRoleGroup is. 

*/
protected String description ;




/**  
* Field validFor
* The time period that the PartyRoleGroup is valid for 

*/
protected TimePeriod validFor ;




/**  
* Field partyRoleGroupSpecification
*/
protected PartyRoleGroupSpecification partyRoleGroupSpecification ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field organization
*/
protected Organization organization ;


}