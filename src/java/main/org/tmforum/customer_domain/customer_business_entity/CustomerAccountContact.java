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
* An individual or organization used as a contact point for a CustomerAc 
* count and accessed via some contact medium.  The contact may be a memb 
* er of the customer’s organization or a member of some other enterprise 
* , such as the provider who services the customer account. 
 @since SID_R16.5
*/ 

public  class CustomerAccountContact  {



/**  
* Field contactType
* Identifies the relationship of the contact to the account, such as pri 

* mary, secondary, and emergency contact. 

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
* Field customerAccount
*/
protected CustomerAccount customerAccount ;


}