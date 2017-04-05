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
* The definition of how revenue is shared by an enterprise with one or m 
* ore other parties. Revenue sharing models are a key component revenue  
* sharing agreements. 
 @since SID_R16.5
*/ 

public  class PartyRevenueSharingModel  {



/**  
* Field ID
* A unique identifier for the PartyRevenueSharingModel. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PartyRevenueSharingModel is known 

*  and distinguished from other PartyRevenueSharingModels. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the PartyRevenueSharingModel  

* is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the PartyRevenueShaingModel is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition of the PartyRevenueSharingModel, such as active, inactiv 

* e, planned. 

*/
protected String status ;




/**  
* Field version
* A particular form of a PartyRevenueSharingModel that differs in certai 

* n respects from an earlier PartyRevenueSharingModel. 

*/
protected String version ;




/**  
* Field partyRevenueSharingModelInvolvement
*/
protected List<PartyRevenueSharingModelInvolvement> partyRevenueSharingModelInvolvement ;




/**  
* Field partyRevenueSharingAgreementItem
*/
protected PartyRevenueSharingAgreementItem partyRevenueSharingAgreementItem ;




/**  
* Field partyRevenueSharingModelSpecification
*/
protected PartyRevenueSharingModelSpecification partyRevenueSharingModelSpecification ;




/**  
* Field revenueSharingModelRelationship1
*/
protected List<RevenueSharingModelRelationship> revenueSharingModelRelationship1 ;




/**  
* Field revenueSharingModelRelationship
*/
protected List<RevenueSharingModelRelationship> revenueSharingModelRelationship ;


}