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
* A detailed description of PartySettlement. 
 @since SID_R16.5
*/ 

public  class PartySettlementSpecification  {



/**  
* Field partySettlement
*/
protected List<PartySettlement> partySettlement ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field specType
* A classification that groups PartySettlemenSpecifications that share c 

* ommon characteristics. 

*/
protected String specType ;




/**  
* Field validFor
* The period during which the PartySettlementSpecification is applicable 

* . 

*/
protected TimePeriod validFor ;




/**  
* Field description
* A detailed description of PartySettlementSpecification. 

*/
protected String description ;




/**  
* Field partySettlementSpecVersion
*/
protected List<PartySettlementSpecVersion> partySettlementSpecVersion ;


}