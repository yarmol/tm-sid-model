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
* An outline of a Customer's credit worthiness. 
 @since SID_R16.5
*/ 

public  class CustomerCreditProfile  {



/**  
* Field ID
* A unique identifier that enables different instances of a CustomerCred 

* itProfile to be distinguished from each other. 

*/
protected String ID ;




/**  
* Field creditProfileDate
* The date the profile was established. 

*/
protected DateTime creditProfileDate ;




/**  
* Field validFor
* The period for which the profile is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field creditRiskRating
* This is an integer whose value is used to rate the risk of this Custom 

* er paying late or defaulting versus paying on time. 

*/
protected Integer creditRiskRating ;




/**  
* Field creditScore
* A measure of a person’s or organization’s creditworthiness calculated  

* on the basis of a combination of factors such as their income and cred 

* it history. 

*/
protected Integer creditScore ;




/**  
* Field custCreditProfileReference
*/
protected List<CustCreditProfileReference> custCreditProfileReference ;




/**  
* Field customer
*/
protected Customer customer ;


}