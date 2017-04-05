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
* Ranges that may be expressed in percentages or some other quantitative 
*  measure that an enterprise will use to negotiate the aspects of a par 
* ty revenue sharing model.  For example, for a flat rate revenue sharin 
* g model an enterprise may be willing to share 70% of the product offer 
* ing price with another party 
 @since SID_R16.5
*/ 

public  class RevShareModelSpecNegotiableRange  {



/**  
* Field amountRangeInterval
* An indicator that specifies the inclusion or exclusion of the lower ra 

* nge and upper range amount attributes.</br></br>Possible values are "o 

* pen", "closed", "closedBottom" and "closedTop". 

*/
protected String amountRangeInterval ;




/**  
* Field quantityRangeInterval
* An indicator that specifies the inclusion or exclusion of the lower ra 

* nge and upper range quantity attributes.</br></br>Possible values are  

* "open", "closed", "closedBottom" and "closedTop". 

*/
protected String quantityRangeInterval ;




/**  
* Field negotiableRangeLowerAmount
* The lower negotiable limiit for an amount. 

*/
protected Quantity negotiableRangeLowerAmount ;




/**  
* Field negotiableRangeUpperAmount
* The upper negotiable limiit for an amount. 

*/
protected Quantity negotiableRangeUpperAmount ;




/**  
* Field negotiableRangeLowerQuantity
* The lower negotiable limiit for a quantity. 

*/
protected Quantity negotiableRangeLowerQuantity ;




/**  
* Field negotialbleRangeUpperQuantity
* The upper negotiable limiit for a quantity. 

*/
protected Quantity negotialbleRangeUpperQuantity ;




/**  
* Field policySet
*/
protected PolicySet policySet ;




/**  
* Field partyRevenueSharingModelSpecification
*/
protected PartyRevenueSharingModelSpecification partyRevenueSharingModelSpecification ;


}