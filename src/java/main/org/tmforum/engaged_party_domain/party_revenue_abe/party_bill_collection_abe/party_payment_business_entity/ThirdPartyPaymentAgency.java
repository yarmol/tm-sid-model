/**
* Party Payment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.i.f.wY.k4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Payment ABE</a> 
* The Party Payment ABE contains all Entities required to describe a pay 
* ment such as PaymentMethod and BankAccount. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_collection_abe.party_payment_business_entity ;

/**
* ThirdPartyPayeeAgency is a third party between SP and party. This agen 
* cy takes a role of receiving payment for SP from SP's party.  

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class ThirdPartyPaymentAgency extends PartyRole {



/**  
* Field thirdPartyCollectionPM
*/
protected List<ThirdPartyCollectionPM> thirdPartyCollectionPM ;




/**  
* Field customerPayment
*/
protected List<CustomerPayment> customerPayment ;


}