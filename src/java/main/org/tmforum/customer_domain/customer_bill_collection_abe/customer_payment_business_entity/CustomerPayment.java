/**
* Customer Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_4.y4H.oOY.kE.d-.e.j.r.wF9U1.vR.w-content.html">Customer Payment ABE</a> 
* The Customer Payment ABE represents the transfer of wealth from a cust 
* omer for a product or usage of product. 
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_collection_abe.customer_payment_business_entity ;

/**
* CustomerPayment represents the transfer of wealth from a customer for  
* a product or usage of product. 
 @since SID_R16.5
*/ 

public  class CustomerPayment  {



/**  
* Field partyPayment
*/
protected PartyPayment partyPayment ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field customer
*/
protected Customer customer ;




/**  
* Field customerAccount
*/
protected List<CustomerAccount> customerAccount ;




/**  
* Field thirdPartyPaymentAgency
*/
protected ThirdPartyPaymentAgency thirdPartyPaymentAgency ;




/**  
* Field paymentItem
*/
protected List<CustomerPaymentItem> paymentItem ;




/**  
* Field loyaltyBurn
*/
protected List<LoyaltyBurn> loyaltyBurn ;




/**  
* Field paymentMethod
*/
protected PaymentMethod paymentMethod ;




/**  
* Field customerOrder
*/
protected List<CustomerOrder> customerOrder ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}