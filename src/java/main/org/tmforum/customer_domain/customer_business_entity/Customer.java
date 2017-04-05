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
* A person or organization that buys products and services from the ente 
* rprise or receives free offers or services. This is modeled as a Party 
*  playing the role of Customer. A Customer is a type of PartyRole. Cust 
* omers can also be other service providers who resell the enterprises p 
* roducts, other service providers that lease the enterprise's resources 
*  for utilization by the other service provider's products and services 
* , and so forth. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class Customer extends PartyRole {



/**  
* Field ID
* A unique identifier that enables different instances of a Customer to  

* be distinguished from each other. This is a required attribute. 

*/
protected String ID ;




/**  
* Field customerStatus
* The current condition of a customer, such as unknown, &nbsp;&nbsp;&nbs 

* p;&nbsp;active, &nbsp;&nbsp;&nbsp;&nbsp;inactive, terminated, &nbsp;&n 

* bsp;&nbsp;&nbsp;pending, etc.</br> 

*/
protected String customerStatus ;




/**  
* Field customerRank
* The relative importance of this Customer compared to other Customers. 

*/
protected long customerRank ;




/**  
* Field customerCreditProfile
*/
protected List<CustomerCreditProfile> customerCreditProfile ;




/**  
* Field customerQuote
*/
protected List<CustomerQuote> customerQuote ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;




/**  
* Field customerMetric
*/
protected List<CustomerMetric> customerMetric ;


}