/**
* Party Revenue Sharing Model ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.zZTE8EK9E.e.a.l.i52.m.s.tF-.o.w-content.html">Party Revenue Sharing Model ABE</a> 
* The Party Revenue Sharing Model ABE contains party revenue sharing mod 
* els, and their specifications, that define how revenue is shared by an 
* d enterprise with one or more other parties. Revenue sharing models ar 
* e a key component revenue sharing agreements.Product Offering Price AB 
* E entities are used to represent amounts of revenue shared. For exampl 
* e, an enterprise may charge 10 euros for an offering and share a flat  
* 4 euros with another party, such as an application developer. For conf 
* igurable offerings the revenue shared may be dependent on those featur 
* es chosen by the party who acquires the offering. In this case the rev 
* enue shared is also governed by the configuration of the party's produ 
* ct. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_sharing_model_business_entity ;

/**
* Specification of a party, including an enterprise, who participates in 
*  revenue sharing, their type of involvement, and their associated offe 
* ring(s). 
 @since SID_R16.5
*/ 

public  class PartyRevenueSharingModelInvolvement  {



/**  
* Field invovlementType
* The specification of whether revenue is retained by an enterprise and  

* whether a party participates in revenue sharing. For example, an enter 

* prise may charge a listing fee for a party's offering or offerings as  

* part of an agreement between a party and an enterprise, and an enterpr 

* ise passes all revenue on to the party for sales of the party's offeri 

* ng. The party is invoiced separately for the listing fee. For a templa 

* te revenue sharing model only an enterprise's involvement is specified 

* . When a party enters into a revenue sharing agreement and a template  

* is used their involvement is specified. 

*/
protected String invovlementType ;




/**  
* Field validFor
* The period for which the PartyRevenueShaingModelInvolvement is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field partyRevenueSharingModel
*/
protected PartyRevenueSharingModel partyRevenueSharingModel ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field partyRevenueShareProdOffer
*/
protected List<PartyRevenueShareProdOffer> partyRevenueShareProdOffer ;




/**  
* Field productSpecificationType
*/
protected List<ProductSpecificationType> productSpecificationType ;


}