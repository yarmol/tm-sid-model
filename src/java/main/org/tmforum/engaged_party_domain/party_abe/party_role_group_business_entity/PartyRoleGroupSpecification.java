/**
* Party Role Group ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.j.sY.zYK.pIE.e.a9.x.aO.u9AAIX.g-content.html">Party Role Group ABE</a> 
* Party Role Group ABE contains all Business Entities used to specify Pa 
* rtyRoleGroups. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_role_group_business_entity ;

/**
* A PartyRoleGroupSpecification specifies for a type of PartyRoleGroup,  
* the applicable rules for the creation of a PartyRoleGroup:-&nbsp;&nbsp 
* ;&nbsp;&nbsp;the type of PartyRole (PartyRoleSpecification) that might 
*  be part of a corresponding PartyRoleGroup,-&nbsp;&nbsp;&nbsp;&nbsp;ru 
* les (PRGSpecRule) applying for the Party being part of the PartyRoleGr 
* oup through their PartyRole such as "all Parties must live at the same 
*  location to be considered as member of the same Family"The type of Pa 
* rtyRoleGroupSpecification might be a Family, a Club, a group of Friend 
* s... -&nbsp;&nbsp;&nbsp;&nbsp;A family can include a number of Individ 
* uals. The individuals are part of this family (PartyRoleGroup) via Par 
* tyRoles such as father, mother, son, and daughter…-&nbsp;&nbsp;&nbsp;& 
* nbsp;Individuals can also be part of PartyRoleGroups such as a Bridge  
* Club, with PartyRoles such as Member, Chairman/Chairwoman, Treasurer,  
* etc.  A PartyRoleGroupSpecification may describe one or many PartyRole 
* Groups. 
 @since SID_R16.5
*/ 

public  class PartyRoleGroupSpecification  {



/**  
* Field name
* A word, term, or phrase by which the PartyRoleGroupSpecification is kn 

* own and distinguished from other PartyRoleGroupSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the PartyRoleGroupSpecification is. 

*/
protected String description ;




/**  
* Field validFor
* The time period that the PartyRoleGroupSpecification is valid for 

*/
protected TimePeriod validFor ;




/**  
* Field partyRoleGroup
*/
protected List<PartyRoleGroup> partyRoleGroup ;




/**  
* Field pRGSpecRule
*/
protected List<PRGSpecRule> pRGSpecRule ;




/**  
* Field partyRoleSpecification
*/
protected List<PartyRoleSpecification> partyRoleSpecification ;


}