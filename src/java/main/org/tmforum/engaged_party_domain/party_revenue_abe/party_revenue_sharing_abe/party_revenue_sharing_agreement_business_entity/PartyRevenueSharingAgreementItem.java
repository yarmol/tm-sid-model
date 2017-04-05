/**
* Party Revenue Sharing Agreement ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.tH.e.h.kEK9E.e.a.l.i52.m.s.tF-.o.w-content.html">Party Revenue Sharing Agreement ABE</a> 
* The Party Revenue Sharing Agreement ABE represents an agreement that s 
* pecifies how revenue will be shared between an enterprise and one or m 
* ore other parties whose product offerings are made available in some w 
* ay by an enterprise. For example an enterprise may make offerings avai 
* lable on behalf of another party or use another party's offering to de 
* velop its own offering. It includes template party revenue sharing agr 
* eements that are used as the basis for entering into a revenue sharing 
*  agreement with one or more parties.It uses, via inheritance, applicab 
* le Agreement ABE entities, such as Agreement and AgreementItem.  The f 
* ocus of the ABE is on associating party revenue sharing model(s) with  
* the items on the agreement and updating agreement items with agreed up 
* on changes to revenue sharing models by associating revisions to the m 
* odels to agreement items. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_sharing_agreement_business_entity ;

/**
* The purpose of a PartyRevenueSharingAgreement expressed in terms of th 
* e agreed upon terms and conditions specific to the item and the PartyR 
* evenueSharingModel that specifies how revenue will be shared among par 
* ties invovled in the agreement. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Agreement ABE::AgreementItem |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionItem @since SID_R16.5
*/ 

public  class PartyRevenueSharingAgreementItem extends AgreementItem,BusinessInteractionItem {



/**  
* Field partyRevenueSharingAgreement
*/
protected PartyRevenueSharingAgreement partyRevenueSharingAgreement ;




/**  
* Field partyRevShareTermOrCondition
*/
protected List<PartyRevShareTermOrCondition> partyRevShareTermOrCondition ;




/**  
* Field partyRevenueSharingModel
*/
protected List<PartyRevenueSharingModel> partyRevenueSharingModel ;


}