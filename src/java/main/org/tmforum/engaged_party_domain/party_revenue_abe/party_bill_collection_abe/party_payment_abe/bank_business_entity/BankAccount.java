/**
* Bank ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.qOXS.wPO9E.eS-G.dQ.j.w2A.r.b.g-content.html">Bank ABE</a> 
* Bank ABE inclueds entitites related to Bank. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.bank_business_entity ;

/**
* Represent the general bank account. 
 @since SID_R16.5
*/ 

public  class BankAccount  {



/**  
* Field type
* The type of bank account, for example IBAN (International Bank Account 

*  Number). 

*/
protected String type ;




/**  
* Field bankAccountNumber
* The bank account according to the accountType. 

*/
protected String bankAccountNumber ;




/**  
* Field validFor
* The period for which the bank account is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field bankCardPM
*/
protected List<BankCardPM> bankCardPM ;




/**  
* Field bank
*/
protected Bank bank ;




/**  
* Field checkPM
*/
protected List<CheckPM> checkPM ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;


}