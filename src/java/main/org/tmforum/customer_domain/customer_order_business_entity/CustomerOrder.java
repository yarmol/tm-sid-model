/**
* Customer Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C1E0F510350-content.html">Customer Order ABE</a> 
* The Customer Order ABE handles single customer orders and the various  
* types thereof, such as regulated and non-regulated orders. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_order_business_entity ;

/**
* A Customer might place orders with the Service Provider. This is repre 
* sented by the CustomerOrder.CustomerOrder / CustomerOrderItem further  
* define PartyOrder / PartyOrderItem. For further details about PartyOrd 
* er / PartyOrderItem refer to the EngagedParty guide book.A PartyOrder  
* is a type of BusinessInteration that represents a communication used t 
* o procure or update one or many Products in the context of a ProductOf 
* fering through all its PartyOrderItems.The particularity of the Custom 
* erOrder is to procure or update Products for Customer even if the Cust 
* omerOrder might be placed by the Service Provider when applying precau 
* tionary measures in case of bad debt. 
 @since SID_R16.5
*/ 

public  class CustomerOrder  {



/**  
* Field partyOrder
*/
protected PartyOrder partyOrder ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;




/**  
* Field dunningCaseRule
*/
protected DunningCaseRule dunningCaseRule ;




/**  
* Field loyaltyExecutionPoint2
*/
protected LoyaltyExecutionPoint loyaltyExecutionPoint2 ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;


}