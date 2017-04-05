/**
* Party Revenue Share ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.k.gCH.cEK5E.e.a.m.lL.c.v.q.v7Y.pA-content.html">Party Revenue Share ABE</a> 
* The Party Revenue Share ABE represents the amount of revenue shared am 
* ong parties involved in a revenue sharing agreement. Revenue share is  
* determined using existing artifacts such as usage, invoices, product p 
* rices, and applied billing rates. The revenue share may result in a pa 
* yment to/from a party and/or an bill/invoice to/from a party. It may a 
* lso be shown as a reduction of or increase to an bill/invoice sent to  
* or received from a party, or a credit/debit to a party's account balan 
* ce. There are a variety of revenue sharing models, that determines how 
*  revenue may be split among an enterprise and other parties. Based on  
* the type of revenue sharing model different determinants are used to c 
* alculate the final bill/invoice or payment. Flat rate and usage based  
* revenue sharing models are just two of a number of models, which also  
* include but are not limited to tiered, commitment, progressive, along  
* with multi-party variations of each.A party revenue sharing agreement  
* defines the period for which a revenue share for a product offering ar 
* e determined. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_share_business_entity ;

/**
* An item that is used to determine revenue shared with another party fo 
* r a ProductOffering. The item may be a ProductPrice paid to acquire an 
*  offering if a bill/invoice charge is not created for it or an Applied 
* Party/CustomerBillingRate, which could be a charge, discount, usage ch 
* arge, and so forth. 

Inheritance tree: |- 
 <a title="SID Models::Engaged Party Domain::Party Revenue ABE::Party Revenue Sharing ABE::Party Revenue Share ABE::PartyRevenueShareProdOfferItem" href="_W1.e.d.oE3KE.e.a.tKZB.y.u.yUO.r.w-content.html">SID Models::Engaged Party Domain::Party Revenue ABE::Party Revenue Sharing ABE::Party Revenue Share ABE::PartyRevenueShareProdOfferItem</a> @since SID_R16.5
*/ 

public  class ComponentRevShareProdOfferItem extends PartyRevenueShareProdOfferItem {



/**  
* Field productPrice
*/
protected ProductPrice productPrice ;




/**  
* Field appliedPartyBillingRate
*/
protected AppliedPartyBillingRate appliedPartyBillingRate ;




/**  
* Field partyRevenueShareAdjustment
*/
protected List<PartyRevenueShareAdjustment> partyRevenueShareAdjustment ;




/**  
* Field partyRevShareReconDiscrepancy
*/
protected List<PartyRevShareReconDiscrepancy> partyRevShareReconDiscrepancy ;


}