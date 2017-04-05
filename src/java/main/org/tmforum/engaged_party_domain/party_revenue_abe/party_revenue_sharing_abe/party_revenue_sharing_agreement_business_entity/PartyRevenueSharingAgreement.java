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
* An agreement that specifies how revenue will be shared between an ente 
* rprise and one or more other parties whose product offerings are made  
* available in some way by an enterprise. For example an enterprise may  
* make offerings available on behalf of another party or use another par 
* ty's offering to develop its own offering. It includes template party  
* revenue sharing agreements that are used as the basis for entering int 
* o a revenue sharing agreement with one or more parties. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Agreement ABE::Agreement |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class PartyRevenueSharingAgreement extends Agreement,BusinessInteraction {



/**  
* Field partyRevenueSharingAgreementItem
*/
protected List<PartyRevenueSharingAgreementItem> partyRevenueSharingAgreementItem ;




/**  
* Field partyRevShareTermOrCondition
*/
protected List<PartyRevShareTermOrCondition> partyRevShareTermOrCondition ;


}