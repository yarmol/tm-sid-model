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
* A relationship between two PartyRevenueSharingModels. For example, a p 
* artner may provide their equivalent of a model to an enterprise to ens 
* ure both parties involved are in agreement as to the revenue that will 
*  be shared. 
 @since SID_R16.5
*/ 

public  class RevenueSharingModelRelationship  {



/**  
* Field typeRelationship
* A categorization of the relationship, such as supplier/partner or othe 

* r party equivalent, alternate, replaces, and so forth. 

*/
protected String typeRelationship ;




/**  
* Field validFor
* The period during which the relationship is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field partyRevenueSharingModel
*/
protected PartyRevenueSharingModel partyRevenueSharingModel ;




/**  
* Field partyRevenueSharingModel1
*/
protected PartyRevenueSharingModel partyRevenueSharingModel1 ;


}