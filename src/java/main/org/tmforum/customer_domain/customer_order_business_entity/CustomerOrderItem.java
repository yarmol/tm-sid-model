/**
* Customer Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C1E0F510350-content.html">Customer Order ABE</a> 
* The Customer Order ABE handles single customer orders and the various  
* types thereof, such as regulated and non-regulated orders. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_order_business_entity ;

/**
* Each CustomerOrderItem requires an action (AllowedProductAction) on a  
* ProductSpecification or a ProductOffering. 
 @since SID_R16.5
*/ 

public  class CustomerOrderItem  {



/**  
* Field customerOrder
*/
protected CustomerOrder customerOrder ;




/**  
* Field salesProductSpecification
*/
protected SalesProductSpecification salesProductSpecification ;




/**  
* Field salesProductOffering
*/
protected SalesProductOffering salesProductOffering ;




/**  
* Field partyOrderItem
*/
protected PartyOrderItem partyOrderItem ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;




/**  
* Field customerOrderItem2
*/
protected List<CustomerOrderItem> customerOrderItem2 ;




/**  
* Field customerPayment
*/
protected CustomerPayment customerPayment ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field allowedProductAction
*/
protected AllowedProductAction allowedProductAction ;




/**  
* Field appointment
*/
protected List<Appointment> appointment ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field commitmentTermOrCondition
*/
protected List<CommitmentTermOrCondition> commitmentTermOrCondition ;


}