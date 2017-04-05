/**
* Party Settlement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Y.dKEIP-0E.eS0V.o.o.o.iZB.dW.w-content.html">Party Settlement ABE</a> 
* It is a group of entities that represent a monetary value that will be 
*  paid to a party by the enterprise or a party will pay to the enterpri 
* se as a result of the usage/recurring fee of a product/service/resourc 
* e provided. PartySettlement is managed by agreements and can be create 
* d between an enterprise and other MVNOs, dealers, retailers, content p 
* roviders, etc.  
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_settlement_business_entity ;

/**
* A monetary value that will be paid to a party by the enterprise or a p 
* arty will pay to the enterprise as a result of the usage/recurring fee 
*  of a product/service/resource provided. PartySettlement is managed by 
*  agreements and can be created between an enterprise and other MVNOs,  
* dealers, retailers, content providers, etc.  
 @since SID_R16.5
*/ 

public  class PartySettlement  {



/**  
* Field settlementNumber
* A unique identifier that enables different instances of a PartySettlem 

* ent to be distinguished from each other. 

*/
protected String settlementNumber ;




/**  
* Field settlementDate
* Issue date of a PartySettlement. 

*/
protected DateTime settlementDate ;




/**  
* Field amount
* Monetary amount that will be paid to a party by the enterprise or a pa 

* rty that will pay to the enterprise. 

*/
protected Money amount ;




/**  
* Field agreement
*/
protected Agreement agreement ;




/**  
* Field partySettlementRole
*/
protected List<PartySettlementRole> partySettlementRole ;




/**  
* Field partySettlementSpecification
*/
protected PartySettlementSpecification partySettlementSpecification ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field appliedCustomerBillingRate
*/
protected List<AppliedCustomerBillingRate> appliedCustomerBillingRate ;




/**  
* Field appliedPartyBillingRate
*/
protected List<AppliedPartyBillingRate> appliedPartyBillingRate ;




/**  
* Field partySettlementPayment
*/
protected List<PartySettlementPayment> partySettlementPayment ;


}