/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* The DunningCase represents a type of cases open for a party. Whenever  
* a party enters the dunning process, a dunning case is linked to his pa 
* rty account debt and it contains all details pertaining to the debt, s 
* uch as dunning case rules, interactions… The status of a dunning case  
* evolves according to internal or external events (payments made by the 
*  party, payment schedule granted…). 
 @since SID_R16.5
*/ 

public  class DunningCase  {



/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field dunningScenario
*/
protected DunningScenario dunningScenario ;




/**  
* Field dunningCaseRule
*/
protected List<DunningCaseRule> dunningCaseRule ;




/**  
* Field ID
* A unique identifier. 

*/
protected String ID ;




/**  
* Field startingDate
* As soon as an event triggering a DunningRule occurs on a PartyAccount, 

*  a DunningCase is created according to the DunningScenario assigned to 

*  the PartyAccount. This date corresponds to the startingDate 

*/
protected DateTime startingDate ;


}