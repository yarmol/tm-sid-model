/**
* Bank ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.qOXS.wPO9E.eS-G.dQ.j.w2A.r.b.g-content.html">Bank ABE</a> 
* Bank ABE inclueds entitites related to Bank. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.bank_business_entity ;

/**
* Represent the general bank. 
 @since SID_R16.5
*/ 

public  class Bank  {



/**  
* Field bankName
* The name of the bank. 

*/
protected String bankName ;




/**  
* Field bankCodeType
* The type of bank code, for example BIC(Bank Identifier Code). 

*/
protected String bankCodeType ;




/**  
* Field bankCode
* The bank code according to the bankCodeType. 

*/
protected String bankCode ;




/**  
* Field checkPM
*/
protected List<CheckPM> checkPM ;




/**  
* Field bankAccount
*/
protected List<BankAccount> bankAccount ;




/**  
* Field bankCardPM
*/
protected List<BankCardPM> bankCardPM ;


}