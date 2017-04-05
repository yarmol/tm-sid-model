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
* The definition of a party revenue sharing model. It includes a related 
*  entity that specifies ranges expressed in percentages or some other q 
* uantitative measure that an enterprise will use to negotiate the aspec 
* ts of a party revenue sharing model. 
 @since SID_R16.5
*/ 

public  class PartyRevenueSharingModelSpecification  {



/**  
* Field ID
* A unique identifier for the PartyRevenueSharingModelSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PartyRevenueSharingModelSpecifica 

* tion is known and distinguished from other PartyRevenueSharingModelSpe 

* cifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the PartyRevenueSharingModelSpecificati 

* on is. 

*/
protected String description ;




/**  
* Field status
* The condition in which the PartyRevenueSharingModelSpecification exist 

* s, such as planned, obsolete, active.</br> 

*/
protected String status ;




/**  
* Field validFor
* The period during which the PartyRevenueSharingModelSpecification is a 

* pplicable. 

*/
protected TimePeriod validFor ;




/**  
* Field revShareModelSpecNegotiableRange
*/
protected List<RevShareModelSpecNegotiableRange> revShareModelSpecNegotiableRange ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field partyRevenueSharingModel
*/
protected List<PartyRevenueSharingModel> partyRevenueSharingModel ;


}