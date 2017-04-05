/**
* Agreement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D4015D4013F-content.html">Agreement ABE</a> 
* Represents a contract or arrangement, either written or verbal and som 
* etimes enforceable by law, such as a service level agreement or a cust 
* omer price agreement. An agreement involves a number of other business 
*  entities, such as products, services, and resources and/or their spec 
* ifications. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.agreement_business_entity ;

/**
* The purpose for an Agreement expressed in terms of a Product, Service, 
*  Resource, and/or their respective specifications, inherited from Busi 
* nessInteractionItem. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionItem @since SID_R16.5
*/ 

public  class AgreementItem extends BusinessInteractionItem {



/**  
* Field agreement
*/
protected Agreement agreement ;




/**  
* Field agreementTermOrCondition
*/
protected List<AgreementTermOrCondition> agreementTermOrCondition ;




/**  
* Field partyRoleProductOffering
*/
protected PartyRoleProductOffering partyRoleProductOffering ;


}