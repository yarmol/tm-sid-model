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
* PartySettlementRole captures all the roles that are included like sett 
* lement payment responsible and for example, the role of parties respon 
* sible for a) calculating or b) forwarding settlements, etc. 
 @since SID_R16.5
*/ 

public  class PartySettlementRole  {



/**  
* Field partySettlementRoleType
* An indicator that specifies the involment such as payment responsible  

* and parties/unit responsible for calculating settlements. 

*/
protected String partySettlementRoleType ;




/**  
* Field partySettlement
*/
protected PartySettlement partySettlement ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;


}