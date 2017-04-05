/**
* Party Role Product Offering ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6C.h.a.oH.sBE.eSL.m.qSOPR.m-6A-content.html">Party Role Product Offering ABE</a> 
* The Party Role Product Offering ABE represents the involement parties  
* playing roles have with ProductOfferings. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_product_specification_and_offering_abe.party_role_product_offering_business_entity ;

/**
* A ProductOffering made available by a PartyRole and the involvement th 
* e PartyRole has with the ProductOffering. 
 @since SID_R16.5
*/ 

public  class PartyRoleProductOffering  {



/**  
* Field partyRoleProductSpecification
*/
protected PartyRoleProductSpecification partyRoleProductSpecification ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field partyRoleProdOfferStatus
* The current condition of an PartyRoleProductOffering, such as planned, 

*  on-boarded, off-boarded, inactive. 

*/
protected String partyRoleProdOfferStatus ;




/**  
* Field purpose
* Thee reason for the PartyRoleProductOffering, such as sell on behalf o 

* f, purchase, offer. 

*/
protected String purpose ;




/**  
* Field validFor
* The period during which the PartyRoleProductOffering is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field marketedBy
* An indicator that specifies if the PartyRoleProductOffering is markete 

* d by the related PartyRole.  For example a Competitor PartyRole may on 

* ly have this attribute set to true and the other boolean attributes se 

* t to false. 

*/
protected Boolean marketedBy ;




/**  
* Field orderTakenBy
* An indicator that specifies that the associated PartyRole takes an ord 

* er for the ProductOffering. 

*/
protected Boolean orderTakenBy ;




/**  
* Field postOrderFulfilledBy
* An indicator the specifies if the party completes fulfillment of an or 

* der after it has been taken. 

*/
protected Boolean postOrderFulfilledBy ;




/**  
* Field paymentAcceptedBy
* An indicator that specifies that the associated PartyRole accepts paym 

* ent for the ProductOffering. 

*/
protected Boolean paymentAcceptedBy ;




/**  
* Field paymentMadeTo
* An indicator that specifies that payment is made to the associated Par 

* tyRole for the ProductOffering.  For example, an entrprise may accept  

* payment on behalf of PartyRole and then send the payment to the PartyR 

* ole. 

*/
protected Boolean paymentMadeTo ;




/**  
* Field billedBy
* An indicator that specifies that the associated PartyRole submits a bi 

* ll for the ProductOffering. 

*/
protected Boolean billedBy ;




/**  
* Field serviceLevelSpecification
*/
protected List<ServiceLevelSpecification> serviceLevelSpecification ;




/**  
* Field afterSalesServiceProvidedBy
* An indicator that specifies that a party provides assurance related cu 

* stomer service after a sale is made. 

*/
protected Boolean afterSalesServiceProvidedBy ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field agreementItem
*/
protected List<AgreementItem> agreementItem ;




/**  
* Field partyRevenueSharingModelInvolvement
*/
protected List<PartyRevenueSharingModelInvolvement> partyRevenueSharingModelInvolvement ;


}