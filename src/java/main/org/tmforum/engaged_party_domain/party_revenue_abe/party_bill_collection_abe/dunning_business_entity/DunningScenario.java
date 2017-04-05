/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* A dunning scenario describes the company’s dunning strategy. It must b 
* e easily configurable to describe the dunning rules to apply to a case 
* , the order in which applying them, the events that trigger dunning ru 
* les evaluation, the actions that must be done…If a DunningScenario is  
* assigned to a PartyAcount, the DunningCase will follow this DunningSce 
* nario in case of debt; else it will follow a default DunningScenario.D 
* unningScenario is assigned to a PartyAccount, depending on the Holder  
* quality. 
 @since SID_R16.5
*/ 

public  class DunningScenario  {



/**  
* Field ID
* A unique identifier. 

*/
protected String ID ;




/**  
* Field name
* A short descriptive name for the DunningScenario. 

*/
protected String name ;




/**  
* Field isDefault
* If true, indicates that the DunningScenario is the one to use by defau 

* lt if no specific DunningScenario is specified for the PartyAccount. 

*/
protected Boolean isDefault ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field dunningCaseRule
*/
protected DunningRule dunningCaseRule ;




/**  
* Field dunningCase
*/
protected List<DunningCase> dunningCase ;


}