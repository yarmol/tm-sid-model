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
* The terms and conditions for a party revenue sharing agreement in addi 
* tion to those specified by an AgreementItem. For example, terms specif 
* ic to a revenue sharing agreement may include the requirement to aggre 
* gate revenue shared for a product offering as well as providing detail 
* s about each acquisition of an offering. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Agreement ABE::AgreementTermOrCondition @since SID_R16.5
*/ 

public  class PartyRevShareTermOrCondition extends AgreementTermOrCondition {



/**  
* Field partyRevenueSharingAgreement
*/
protected PartyRevenueSharingAgreement partyRevenueSharingAgreement ;




/**  
* Field partyRevenueSharingAgreementItem
*/
protected List<PartyRevenueSharingAgreementItem> partyRevenueSharingAgreementItem ;




/**  
* Field aggregateSharedRevenue
* Aggregate revenue shared for a product offering if true. Provide detai 

* ls about each acquisition of an offering if false. 

*/
protected Boolean aggregateSharedRevenue ;




/**  
* Field revenueShareTimePeriod
* The time period for which revenue shares should be determined. For exa 

* mple, weekly, monthly, quarterly. 

*/
protected String revenueShareTimePeriod ;




/**  
* Field revenueShareProvidedUsing
* Specifies how the revenue sharing information is provided. For example 

* , on a revenue sharing notice, bill/invoice, or payment. 

*/
protected String revenueShareProvidedUsing ;


}