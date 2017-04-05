/**
* Dunning ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.w.wE4.cE.eO_X.pEX.s37Q.e.w-content.html">Dunning ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.dunning_business_entity ;

/**
* A PartyAccount may be written off for two main reasons:      • When th 
* e dunning procedures failed to recover the debt, the bad debt must be  
* written off and reported as such to the General Ledger      • When a c 
* ontract terminates with a “minimal” credit or debit balance (smaller t 
* han a threshold reflecting the cost of the collection process).The Dun 
* ningWriteOff corresponds, in a dunning context, to a credit to definit 
* ively balance the PartyAccount before being able to close it. 
 @since SID_R16.5
*/ 

public  class DunningWriteOff  {



/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;




/**  
* Field amount
* The amount written-off. 

*/
protected Money amount ;


}