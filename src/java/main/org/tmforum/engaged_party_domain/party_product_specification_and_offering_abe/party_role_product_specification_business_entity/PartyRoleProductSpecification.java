/**
* Party Role Product Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_F8BS.sH.oGE.eSZB.o.aVZH9S.o.g-content.html">Party Role Product Specification ABE</a> 
* The Party Role Product Specification ABE represents the involement par 
* ties playing roles have with ProductSpecifications. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_product_specification_and_offering_abe.party_role_product_specification_business_entity ;

/**
* A ProductSpecification made available by a PartyRole. 
 @since SID_R16.5
*/ 

public  class PartyRoleProductSpecification  {



/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field status
* The condition of the ProductSpecificationPartyRole, such as planned, o 

* n-boarded, off-boarded. 

*/
protected String status ;




/**  
* Field purpose
* Thee reason for the PartyRoleProductSpecification, such as sell on beh 

* alf of, purchase, offer. 

*/
protected String purpose ;




/**  
* Field validFor
* The period for which the ProductSpecificationPartyRole is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;




/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;


}