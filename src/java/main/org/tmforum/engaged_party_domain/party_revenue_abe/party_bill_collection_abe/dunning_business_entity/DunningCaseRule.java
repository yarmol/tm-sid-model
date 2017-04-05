/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* The DunningCaseRule represents an action performed by the company (or  
* on its behalf) to recover a debt. 
 @since SID_R16.5
*/ 

public  class DunningCaseRule  {



/**  
* Field dunningCase
*/
protected DunningCase dunningCase ;




/**  
* Field dunningRule
*/
protected DunningRule dunningRule ;




/**  
* Field writeOff
*/
protected DunningWriteOff writeOff ;




/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field partyOrder
*/
protected PartyOrder partyOrder ;




/**  
* Field appliedPenaltyCharge
*/
protected AppliedPartyPenaltyCharge appliedPenaltyCharge ;




/**  
* Field partyInteraction
*/
protected List<DunningNotification> partyInteraction ;




/**  
* Field ID
* A unique identifier. 

*/
protected String ID ;




/**  
* Field outbreakDate
* The outbreakDate represents the date at which the condition of the Dun 

* ningRule has been verified, triggering the outbreak of the DunningCase 

* Rule. 

*/
protected DateTime outbreakDate ;


}