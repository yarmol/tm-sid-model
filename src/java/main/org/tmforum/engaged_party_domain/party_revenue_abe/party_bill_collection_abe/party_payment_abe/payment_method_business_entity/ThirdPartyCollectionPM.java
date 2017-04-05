/**
* Payment Method ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3.sGBQFJGE.eWPA.vIYYW.iWM.g-content.html">Payment Method ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_abe.payment_method_business_entity ;

/**
* ThirdPartyCollectionPM is an example of  payment method, using which p 
* ayment can be made through the third party,such as bank transfer, paym 
* ent tool(like PayPal, Alipay). 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill Collection ABE::Party Payment ABE::Payment Method ABE::PaymentMethod" href="_.a.i.f.w.gU4.cE.eO_X.pEX.s37Q.e.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Party Bill Collection ABE::Party Payment ABE::Payment Method ABE::PaymentMethod</a> @since SID_R16.5
*/ 

public  class ThirdPartyCollectionPM extends PaymentMethod {



/**  
* Field thirdPartyType
* A classification of  the third party which collects the money for serv 

* ice provider, such as bank transfer, payment tool. 

*/
protected String thirdPartyType ;




/**  
* Field accountNameInThirdParty
* The account, which is used in the third party, used to pay. If bank tr 

* ansfer is used here,  paymentAccountinThirdParty is BankAccount. If pa 

* ymet tool (such as PayPal) is used here, paymentAccountInThirdPart is  

* the payment tool (such as PayPal) account. 

*/
protected String accountNameInThirdParty ;




/**  
* Field thirdPartyPaymentAgency
*/
protected ThirdPartyPaymentAgency thirdPartyPaymentAgency ;


}