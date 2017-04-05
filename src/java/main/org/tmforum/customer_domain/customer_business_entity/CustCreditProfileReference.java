/**
* Customer ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8CEBE701B5-content.html">Customer ABE</a> 
* The Customer ABE is the focus for the Customer domain.  Customer data  
* is the enterprise’s knowledge of the customer and accounts held by a c 
* ustomer. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_business_entity ;

/**
* A source of information that helps define a Customer's credit worthine 
* ss. 
 @since SID_R16.5
*/ 

public  class CustCreditProfileReference  {



/**  
* Field financialInstitutionName
* The name of the financial institution that holds the referenced accoun 

* t. 

*/
protected String financialInstitutionName ;




/**  
* Field financialInstitutionAccoutNumber
* The financial institution account number that identifies the customer  

* account at the financial institution. 

*/
protected String financialInstitutionAccoutNumber ;




/**  
* Field financialInstitutionAccountType
* The type of financial institution account. 

*/
protected String financialInstitutionAccountType ;




/**  
* Field customerCreditProfile
*/
protected CustomerCreditProfile customerCreditProfile ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partyRole2
*/
protected List<PartyRole> partyRole2 ;


}