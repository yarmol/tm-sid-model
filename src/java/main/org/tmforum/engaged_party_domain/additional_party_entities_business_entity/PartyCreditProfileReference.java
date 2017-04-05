/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* A source of information that helps define a Party's credit worthiness. 
 @since SID_R16.5
*/ 

public  class PartyCreditProfileReference  {



/**  
* Field financialInstitutionName
* The name of the financial institution that holds the referenced accoun 

* t. 

*/
protected String financialInstitutionName ;




/**  
* Field financialInstitutionAccoutNumber
* The financial institution account number that identifies the party acc 

* ount at the financial institution. 

*/
protected String financialInstitutionAccoutNumber ;




/**  
* Field financialInstitutionAccountType
* The type of financial institution account. 

*/
protected String financialInstitutionAccountType ;




/**  
* Field partyCreditProfile
*/
protected PartyCreditProfile partyCreditProfile ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partyRole2
*/
protected List<PartyRole> partyRole2 ;


}