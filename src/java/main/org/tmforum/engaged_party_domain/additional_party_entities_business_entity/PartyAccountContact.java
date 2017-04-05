/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* Identifies the relationship of the contact to the account. 
 @since SID_R16.5
*/ 

public  class PartyAccountContact  {



/**  
* Field contactType
* Identifies the relationship of the contact to the account. 

*/
protected String contactType ;




/**  
* Field validFor
* The period for which the contact is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field contactMedium
*/
protected List<ContactMedium> contactMedium ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;


}