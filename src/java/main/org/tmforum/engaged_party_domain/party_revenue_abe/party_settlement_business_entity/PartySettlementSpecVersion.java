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
* A particular form or variety of a PartySettlementSpecification that is 
*  different from others or from the original. The form represents diffe 
* rences in properties that characterize a PartySettlementSpecification, 
*  that are not enough to warrant creating a new PartySettlementSpecific 
* ation.  
 @since SID_R16.5
*/ 

public  class PartySettlementSpecVersion  {



/**  
* Field revisionType
* The significance of the revision. 

*/
protected String revisionType ;




/**  
* Field revisionNumber
* A number that represents the occurrence of the version in the sequence 

*  of versions.  

*/
protected Integer revisionNumber ;




/**  
* Field validFor
* The period during which the version is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field description
* A narrative that explains the reason for the version’s creation. 

*/
protected String description ;




/**  
* Field revisionDate
* The date the version was created. 

*/
protected DateTime revisionDate ;




/**  
* Field partySettlementSpecification
*/
protected PartySettlementSpecification partySettlementSpecification ;


}