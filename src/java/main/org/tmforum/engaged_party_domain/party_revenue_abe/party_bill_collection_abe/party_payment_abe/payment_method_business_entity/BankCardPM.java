/**
* Payment Method ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.sGBQFJGE.eWPA.vIYYW.iWM.g-content.html">Payment Method ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity ;

/**
* PaymentMethod used to pay with a bank card. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill Collection ABE::Party Payment ABE::Payment Method ABE::PaymentMethod" href="_.a.i.f.w.gU4.cE.eO_X.pEX.s37Q.e.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill Collection ABE::Party Payment ABE::Payment Method ABE::PaymentMethod</a> @since SID_R16.5
*/ 

public  class BankCardPM extends PaymentMethod {



/**  
* Field cardNumber
* The identification number of a bank card. 

*/
protected String cardNumber ;




/**  
* Field nameOnCard
* The name of the person who owns the card. 

*/
protected String nameOnCard ;




/**  
* Field bankCardType
* The type of the BankCard, such as VISA, MasterCard, UnionPay. 

*/
protected String bankCardType ;




/**  
* Field expirationDate
* The date of card expiration.  

*/
protected DateTime expirationDate ;




/**  
* Field CVV
* The CVV(Card Verification Value) of the bank card.  

*/
protected String CVV ;




/**  
* Field bankAccount
*/
protected BankAccount bankAccount ;




/**  
* Field bank
*/
protected Bank bank ;


}